/**
 * Copyright (c) 2010-2018 SAP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   SAP - initial API and implementation
 */
package org.eclipse.dirigible.engine.js.debug.model;

public class DebugSessionMetadata {
	
	private String sessionId;
	
	private String executionId;
	
	private String userId;
	
	private boolean active = false;
	
	public DebugSessionMetadata(String sessionId, String executionId, String userId) {
		this(sessionId, executionId, userId, false);
	}
	
	public DebugSessionMetadata(String sessionId, String executionId, String userId, boolean active) {
		super();
		this.sessionId = sessionId;
		this.executionId = executionId;
		this.userId = userId;
		this.active = active;
	}

	public String getSessionId() {
		return sessionId;
	}
	
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getExecutionId() {
		return executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
