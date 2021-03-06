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
package org.eclipse.dirigible.databases.helpers;

import com.google.gson.Gson;

/**
 * Database Error Helper
 */
public class DatabaseErrorHelper {

	/**
	 * Serialize the error as JSON
	 *
	 * @param t
	 *            the error
	 * @return the error as JSON
	 */
	public static String toJson(Throwable t) {
		return new Gson().toJson(new ErrorMessage(t.getMessage()));
	}

	/**
	 * Serialize the error as JSON
	 *
	 * @param errorMessage
	 *            the error message
	 * @return the error as JSON
	 */
	public static String toJson(String errorMessage) {
		return new Gson().toJson(new ErrorMessage(errorMessage));
	}

	/**
	 * Return the error as plain text
	 *
	 * @param t
	 *            the error
	 * @return the error as plain text
	 */
	public static String print(Throwable t) {
		return t.getMessage();
	}

	/**
	 * Return the error as plain text
	 *
	 * @param errorMessage
	 *            the error message
	 * @return the error as plain text
	 */
	public static String print(String errorMessage) {
		return errorMessage;
	}

	private static class ErrorMessage {

		@SuppressWarnings("unused")
		private final String errorMessage;

		public ErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
	}
}
