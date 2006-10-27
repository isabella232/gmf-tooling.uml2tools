/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland) - initial API and implementation
 */

package org.eclipse.uml2.internal.diagram.parser;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class MDTDiagramParserPlugin extends Plugin {
	private static MDTDiagramParserPlugin anInstance;

	public void start(BundleContext context) throws Exception {
		super.start(context);
		anInstance = this;
	}

	public void stop(BundleContext context) throws Exception {
		anInstance = null;
		super.stop(context);
	}

	public static String getPluginID() {
		return getDefault().getSymbolicName();
	}

	public static Bundle getDefault() {
		return anInstance.getBundle();
	}

}
