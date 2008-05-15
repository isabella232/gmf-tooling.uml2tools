/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tatiana Fesenko (Borland) - initial API and implementation
 */

package org.eclipse.uml2.diagram.clazz.parser;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.diagram.clazz.parsers.MessageFormatParser;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

public class NamedElementParser extends MessageFormatParser {

	private static final String PUBLIC = ""; //$NON-NLS-1$

	private static final String PROTECTED = "#"; //$NON-NLS-1$

	private static final String PRIVATE = "-"; //$NON-NLS-1$

	private static final String PACKAGE = "~"; //$NON-NLS-1$

	private static final EAttribute[] ourFeatures = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Visibility(), UMLPackage.eINSTANCE.getNamedElement_Name() };

	public NamedElementParser() {
		super(ourFeatures);
		setViewPattern("{0}{1}"); //$NON-NLS-1$
		// edit pattern contains space to separate name from visibility
		setEditPattern("{0} {1}"); //$NON-NLS-1$
	}

	@Override
	protected Object getValue(EObject element, EAttribute feature) {
		Object value = element.eGet(feature);
		if (UMLPackage.eINSTANCE.getNamedElement_Visibility().equals(feature)) {
			return getVisibilityLiteral((VisibilityKind) value);
		}
		// name will be processed in the superclass method
		return super.getValue(element, feature);
	}

	@Override
	protected Object getValidNewValue(EAttribute feature, Object value) {
		if (UMLPackage.eINSTANCE.getNamedElement_Visibility().equals(feature)) {
			return getVisibilityKind((String) value);
		}
		// name will be processed in the superclass method
		return super.getValidNewValue(feature, value);
	}

	private static String getVisibilityLiteral(VisibilityKind visibility) {
		switch (visibility.getValue()) {
		case VisibilityKind.PACKAGE:
			return PACKAGE;
		case VisibilityKind.PRIVATE:
			return PRIVATE;
		case VisibilityKind.PROTECTED:
			return PROTECTED;
		case VisibilityKind.PUBLIC:
			return PUBLIC;
		}
		throw new IllegalArgumentException("Unknown visibility : " + visibility);
	}

	private Object getVisibilityKind(String visibility) {
		visibility = visibility.trim();
		if (PACKAGE.equals(visibility)) {
			return VisibilityKind.PACKAGE_LITERAL;
		}
		if (PRIVATE.equals(visibility)) {
			return VisibilityKind.PRIVATE_LITERAL;
		}
		if (PROTECTED.equals(visibility)) {
			return VisibilityKind.PROTECTED_LITERAL;
		}
		if (PUBLIC.equals(visibility)) {
			return VisibilityKind.PUBLIC_LITERAL;
		}
		return new InvalidValue("Unknown visibility sign: " + visibility);
	}

}
