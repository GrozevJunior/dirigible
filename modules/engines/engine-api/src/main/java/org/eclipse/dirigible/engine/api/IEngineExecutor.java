/*
 * Copyright (c) 2018 SAP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * SAP - initial API and implementation
 */

package org.eclipse.dirigible.engine.api;

/**
 * The Engine Executor interface.
 */
public interface IEngineExecutor {
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType();
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName();

}