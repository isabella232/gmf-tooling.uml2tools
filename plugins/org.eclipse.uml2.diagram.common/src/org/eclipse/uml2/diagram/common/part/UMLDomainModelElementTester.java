/*
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Christian Waniek - initial API and implementation
 */
package org.eclipse.uml2.diagram.common.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.UMLPackage;

public class UMLDomainModelElementTester extends PropertyTester {

	public boolean test(Object receiver, String method, Object[] args, Object expectedValue) {
		if (false == receiver instanceof EObject) {
			return false;
		}
		EObject eObject = (EObject) receiver;
		EClass eClass = eObject.eClass();
		if (eClass != null) {
			EClassifier eClassifier = UMLPackage.eINSTANCE.getEClassifier(eObject.eClass().getName());
			// requested EClass could be resolved and instantiated, so the reciever is part of the meta-model
			if (eClassifier != null) {
				return true;
			}
		}

		return false;
	}
}
