/*
 * Copyright (c) 2006, 2008 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tatiana Fesenko (Borland) - initial API and implementation
 */
package org.eclipse.uml2.diagram.common.parser.stereotype;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;

public class PackageAppliedStereotypeParser extends ClassifierAppliedStereotypeParser {

	private static final String PACKAGE_LABEL = "package"; //$NON-NLS-1$

	private static final String MODEL_LABEL = "model"; //$NON-NLS-1$
	@Override
	protected String getElementLabel(Element element) {
		if (element instanceof Model) {
			return MODEL_LABEL;
		}
		return PACKAGE_LABEL;
	}

}
