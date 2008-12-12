/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sergey Gribovsky (Borland) - initial API and implementation
 */

package org.eclipse.uml2.diagram.activity.parser;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.uml2.uml.ObjectNode;
import org.eclipse.uml2.uml.ObjectNodeOrderingKind;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;


public class ObjectNodeAttributesParser implements ISemanticParser {
	public boolean areSemanticElementsAffected(EObject listener, Object notification) {
		return isAffectingEvent(notification, 0);
	}

	public List<?> getSemanticElementsBeingParsed(EObject eObject) {
		return Collections.singletonList(eObject);
	}

	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
		return null;
	}

	public String getEditString(IAdaptable element, int flags) {
		return getPrintString(element, flags);
	}

	public ICommand getParseCommand(IAdaptable element, String newString, int flags) {
		return UnexecutableCommand.INSTANCE;
	}

	public String getPrintString(IAdaptable element, int flags) {
		EObject eObject = (EObject)element.getAdapter(EObject.class);
		if (eObject instanceof ObjectNode) {
			ObjectNode objectNode = (ObjectNode) eObject;
			
			StringBuffer result = new StringBuffer();
			ObjectNodeOrderingKind ordering = objectNode.getOrdering();
			if (!ObjectNodeOrderingKind.FIFO_LITERAL.equals(ordering)) {
				result.append("ordering=");
				result.append(ordering.getName());
			}
			boolean isControlType = objectNode.isControlType();
			if (isControlType) {
				if (result.length() > 0) {
					result.append(',');
				}
				result.append("isControlType=true");
			}
			ValueSpecification upperBounds = objectNode.getUpperBound();
			if (upperBounds != null) {
				if (result.length() > 0) {
					result.append(',');
				}
				result.append("upperBound=");
				result.append(upperBounds.stringValue()); 
			}
			
			if (result.length() > 0) {
				result.insert(0, '{');
				result.append('}');
				return result.toString();
			}
		}
		return ""; //$NON-NLS-1$
	}

	public boolean isAffectingEvent(Object event, int flags) {
		if (event instanceof Notification) {
			Object feature = ((Notification) event).getFeature();
			return UMLPackage.eINSTANCE.getObjectNode_Ordering().equals(feature) ||
				UMLPackage.eINSTANCE.getObjectNode_IsControlType().equals(feature) ||
				UMLPackage.eINSTANCE.getObjectNode_UpperBound().equals(feature);
		}
		return false;
	}

	public IParserEditStatus isValidEditString(IAdaptable element, String editString) {
		return ParserEditStatus.UNEDITABLE_STATUS;
	}
}
