/**
 * Copyright (c) 2010-2019 SAP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   SAP - initial API and implementation
 */
package org.eclipse.dirigible.cms.db;

import org.eclipse.dirigible.repository.api.RepositoryException;

/**
 * Main exception for the DB repository implementation.
 */
public class CmsDatabaseRepositoryException extends RepositoryException {

	private static final long serialVersionUID = 116149128529374300L;

	/**
	 * Instantiates a new local repository exception.
	 */
	public CmsDatabaseRepositoryException() {
		super();
	}

	/**
	 * Instantiates a new local repository exception.
	 *
	 * @param arg0
	 *            the arg 0
	 * @param arg1
	 *            the arg 1
	 */
	public CmsDatabaseRepositoryException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * Instantiates a new local repository exception.
	 *
	 * @param arg0
	 *            the arg 0
	 */
	public CmsDatabaseRepositoryException(String arg0) {
		super(arg0);
	}

	/**
	 * Instantiates a new local repository exception.
	 *
	 * @param arg0
	 *            the arg 0
	 */
	public CmsDatabaseRepositoryException(Throwable arg0) {
		super(arg0);
	}

}
