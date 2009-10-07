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
package org.eclipse.uml2.diagram.statemachine.part;

import org.eclipse.osgi.util.NLS;

public class CustomMessages extends NLS {
	public static String SelectStateMachineDialog_Title;
	public static String SelectStateMachineDialog_CreateStateMachineAction_Title;
	public static String SelectStateMachineDialog_CreateStateMachineAction_DefaultName;

	public static String SelectConnectionPointsDialog_Title;
	public static String SelectConnectionPointsDialog_LabelProvider_EntryPointPrefix;
	public static String SelectConnectionPointsDialog_LabelProvider_ExitPointPrefix;

	private static final String BUNDLE_NAME = "org.eclipse.uml2.diagram.statemachine.part.customMessages"; //$NON-NLS-1$

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, CustomMessages.class);
	}
}
