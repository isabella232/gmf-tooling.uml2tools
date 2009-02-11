/*
 * Copyright (c) 2009 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tatiana Fesenko (Borland) - initial API and implementation
 */
package org.eclipse.uml2.diagram.common;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public class UMLCommonPlugin extends AbstractUIPlugin {

	private static UMLCommonPlugin plugin;

	/**
	 * The constructor.
	 */
	public UMLCommonPlugin() {
		super();
		plugin = this;
	}

	/**
	 * Returns the shared instance.
	 *
	 * @return the plugin instance
	 */
	public static UMLCommonPlugin getInstance() {
		return plugin;
	}

	/**
	 * Retrieves the unique identifier of this plug-in.
	 *
	 * @return A non-empty string which is unique within the plug-in registry.
	 */
	public static String getPluginId() {
		return getInstance().getBundle().getSymbolicName();
	}

}
