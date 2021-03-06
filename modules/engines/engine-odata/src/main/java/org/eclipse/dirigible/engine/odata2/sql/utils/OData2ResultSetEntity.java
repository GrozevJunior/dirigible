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
package org.eclipse.dirigible.engine.odata2.sql.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Holder object for reading result sets
 */
public class OData2ResultSetEntity {
    private final Map<String, Object> entitiyPropertiesData;
    private Map<String, List<Object>> expandData;

    public OData2ResultSetEntity(Map<String, Object> entitiyPropertiesData) {
        this.entitiyPropertiesData = entitiyPropertiesData;
        this.expandData = new HashMap<String, List<Object>>();
    }

    public Map<String, Object> getEntitiyPropertiesData() {
        return entitiyPropertiesData;
    }

    public Map<String, List<Object>> getExpandData() {
        return expandData;
    }

    public void setExpandData(Map<String, List<Object>> expandData) {
        this.expandData = expandData;
    }

    @Override
    public String toString() {
        return "OData2ResultSetEntity [" + entitiyPropertiesData + "]"; 
    }

}
