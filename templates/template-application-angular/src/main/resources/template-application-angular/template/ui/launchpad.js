/*
 * Copyright (c) 2010-2019 SAP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   SAP - initial API and implementation
 */

exports.getSources = function(parameters) {
    var sources = [];
    if (parameters && parameters.includeLaunchpad) {
        sources = [{
			location: "/template-application-angular/index.html.template", 
			action: "generate",
			rename: "index.html",
		}, {
			location: "/template-application-angular/ui/resources/templates/menu.html.template", 
			action: "generate",
			start : "[[",
			end : "]]",
			rename: "ui/resources/templates/menu.html"
		}, {
			location: "/template-application-angular/ui/resources/templates/sidebar.html.template", 
			action: "copy",
			rename: "ui/resources/templates/sidebar.html"
		}, {
			location: "/template-application-angular/ui/resources/templates/tiles.html.template", 
			action: "copy",
			rename: "ui/resources/templates/tiles.html"
		}, {
			location: "/template-application-angular/ui/resources/js/message-hub.js.template", 
			action: "copy",
			rename: "ui/resources/js/message-hub.js"
		}, {
			location: "/template-application-angular/ui/resources/js/ui-bootstrap-tpls-0.14.3.min.js.template", 
			action: "copy",
			rename: "ui/resources/js/ui-bootstrap-tpls-0.14.3.min.js"
		}, {
			location: "/template-application-angular/ui/resources/js/ui-core-ng-modules.js.template", 
			action: "generate",
			rename: "ui/resources/js/ui-core-ng-modules.js"
		}, {
			location: "/template-application-angular/ui/resources/js/ui-layout.js.template", 
			action: "generate",
			rename: "ui/resources/js/ui-layout.js"
		}, {
			location: "/template-application-angular/ui/extensions/perspective.extensionpoint.template", 
			action: "generate",
			rename: "ui/extensions/perspective.extensionpoint"
		}, {
			location: "/template-application-angular/ui/extensions/perspective.extension.template", 
			action: "generate",
			rename: "ui/extensions/perspective.extension"
		}, {
			location: "/template-application-angular/ui/extensions/perspective.js.template", 
			action: "generate",
			rename: "ui/extensions/perspective.js"
		}, {
			location: "/template-application-angular/ui/extensions/tiles.extensionpoint.template", 
			action: "generate",
			rename: "ui/extensions/tiles.extensionpoint"
		}];
    }
    return sources;
};
