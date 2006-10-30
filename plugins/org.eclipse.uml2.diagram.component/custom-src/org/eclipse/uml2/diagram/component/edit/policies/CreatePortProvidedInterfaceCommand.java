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

package org.eclipse.uml2.diagram.component.edit.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Type;

/**
 * @NOT-GENERATED
 */
class CreatePortProvidedInterfaceCommand extends CreateRelationshipCommand {

	public CreatePortProvidedInterfaceCommand(CreateRelationshipRequest request) {
		super(request);
	}
	
	@Override
	public boolean canExecute() {
		Port port = (Port)getSource();
		Type portType = port.getType();
		if (portType instanceof BehavioredClassifier){
			BehavioredClassifier classifier = (BehavioredClassifier)portType;
			return !classifier.getImplementedInterfaces().contains(getTarget());
		}
		return false;
	}

	protected EObject doDefaultElementCreation() {
		Port port = (Port)getSource();
		Type portType = port.getType();
		InterfaceRealization result = null;
		if (portType instanceof BehavioredClassifier){
			BehavioredClassifier classifier = (BehavioredClassifier)portType;
			result = classifier.createInterfaceRealization(null, (Interface)getTarget());
		}
		return result;
	}

}
