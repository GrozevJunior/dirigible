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
package org.eclipse.dirigible.engine.js.api;

import org.eclipse.dirigible.api.v3.http.HttpResponseFacade;
import org.eclipse.dirigible.engine.api.script.AbstractScriptExecutor;

/**
 * The Abstract Javascript Executor.
 */
public abstract class AbstractJavascriptExecutor extends AbstractScriptExecutor implements IJavascriptEngineExecutor {

	/** The Constant MODULE_EXT_JS. */
	public static final String MODULE_EXT_JS = ".js/";

	/** The Constant MODULE_EXT_RHINO. */
	public static final String MODULE_EXT_RHINO = ".rhino/";

	/** The Constant MODULE_EXT_NASHORN. */
	public static final String MODULE_EXT_NASHORN = ".nashorn/";

	/** The Constant MODULE_EXT_V8. */
	public static final String MODULE_EXT_V8 = ".v8/";

	/**
	 * Force flush.
	 */
	protected void forceFlush() {
		try {
			if (HttpResponseFacade.isValid()) {
				HttpResponseFacade.flush();
				HttpResponseFacade.close();
			}
		} catch (Exception e) {
			// no need to log it
		}
	}

	

}
