/**
 * Copyright (c) 2010-2020 SAP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   SAP - initial API and implementation
 */
package org.eclipse.dirigible.engine.js.graalvm.debugger;

import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;

import javax.websocket.ClientEndpoint;
import javax.websocket.CloseReason;
import javax.websocket.ContainerProvider;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
/**
 * Debugger Websocket Proxy Client
 * 
 */
@ClientEndpoint
public class DebuggerWebsocketClientEndpoint {
	
	private static final Logger logger = LoggerFactory.getLogger(DebuggerWebsocketClientEndpoint.class);
	
	private Session session = null;
    private MessageHandler messageHandler;
 
    public DebuggerWebsocketClientEndpoint(URI endpointURI) {
        try {
            WebSocketContainer container = ContainerProvider.getWebSocketContainer();
            container.connectToServer(this, endpointURI);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public Session getSession() {
		return session;
	}
 
    /**
     * Callback hook for Connection open events.
     * 
     * @param session
     *            the session which is opened.
     */
    @OnOpen
    public void onOpen(Session session) {
    	logger.info("[ws:debugger-client] connected: " + session.getId());
        this.session = session;
    }
 
    /**
     * Callback hook for Connection close events.
     * 
     * @param session
     *            the session which is getting closed.
     * @param reason
     *            the reason for connection close
     */
    @OnClose
    public void onClose(Session session, CloseReason reason) {
    	logger.info("[ws:debugger-client] disconnected: " + session.getId());
        this.session = null;
    }
 
    /**
     * Callback hook for Message Events. This method will be invoked when a
     * client send a message.
     * 
     * @param message the message
     */
    @OnMessage
    public void onMessage(ByteBuffer message) {
        if (this.messageHandler != null) {
			try {
				this.messageHandler.handleMessage(message);
			} catch (IOException e) {
				logger.error("[ws:debugger-client] " + e.getMessage(), e);
			}
        }
    }
 
    /**
     * Register message handler
     * 
     * @param messageHandler the message handler
     */
    public void addMessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }
 
    /**
     * Send a message.
     * 
     * @param message the message
     */
    public void sendMessage(ByteBuffer message) {
    	synchronized(this.session) {
    		try {
				this.session.getBasicRemote().sendBinary(message);
			} catch (IOException e) {
				logger.error("[ws:debugger-client] " + e.getMessage(), e);
			}
    	}
    }
 
    /**
     * Message handler.
     * 
     */
    public static interface MessageHandler {
        public void handleMessage(ByteBuffer message) throws IOException;
    }
}
