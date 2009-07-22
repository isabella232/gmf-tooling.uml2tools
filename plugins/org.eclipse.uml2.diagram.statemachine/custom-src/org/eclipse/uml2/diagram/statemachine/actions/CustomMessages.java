/*
 * Copyright (c) 2009 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sergey Gribovsky (Borland) - initial API and implementation
 */
package org.eclipse.uml2.diagram.statemachine.actions;

import org.eclipse.osgi.util.NLS;

public class CustomMessages extends NLS {
	public static String NewInternalTransitionActionHandler_command_label;
	public static String NewInternalTransitionActionHandler_name_prefix;

	private static final String BUNDLE_NAME = "org.eclipse.uml2.diagram.statemachine.actions.customMessages"; //$NON-NLS-1$

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, CustomMessages.class);
	}
}
