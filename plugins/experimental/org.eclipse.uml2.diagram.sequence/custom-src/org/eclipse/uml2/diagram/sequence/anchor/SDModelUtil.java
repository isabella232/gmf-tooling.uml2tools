/*
 * Copyright (c) 2009 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland)
 */
package org.eclipse.uml2.diagram.sequence.anchor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDEntity;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLineElement;

public class SDModelUtil {
	public static class AlienElementException extends Exception {
		private static final long serialVersionUID = 1L;
		public AlienElementException() { super(); }
		public AlienElementException(String message) { super(message); }
		public AlienElementException(String message, Throwable cause) { super(message, cause); }
		public AlienElementException(Throwable cause) { super(cause); }
	}
	
	public static class ModelProblemException extends RuntimeException {
		private static final long serialVersionUID = 1L;
		public ModelProblemException() { super(); }
		public ModelProblemException(String message) { super(message); }
		public ModelProblemException(String message, Throwable cause) { super(message, cause); }
		public ModelProblemException(Throwable cause) { super(cause); }
	}

	public static class NoInteractionException extends ModelProblemException {
		private static final long serialVersionUID = 1L;
        NoInteractionException() { super(); }
        NoInteractionException(String message) { super(message); }
        NoInteractionException(String message, Throwable cause) { super(message, cause); }
        NoInteractionException(Throwable cause) { super(cause); }
    }
	
	public static SDLifeLine findEnclosingLifeline(SDEntity entity) throws AlienElementException {
		if (entity instanceof SDLifeLineElement){
			((SDLifeLineElement)entity).getCoveredLifeLine();
		}
		throw new AlienElementException("Element is not contained on lifeline " + entity);
	}
	
	public static SDEntity getParent(SDEntity entity){
		EObject container = entity.eContainer();
		if (container instanceof SDEntity){
			return (SDEntity)container;
		}
		throw new IllegalArgumentException("Parent of SDEntity " + entity + " is " + container);
	}
	
	public static boolean isNested(SDEntity entity1, SDEntity entity2) {
		return isNested(entity1, entity2, true);
	}
	
	public static boolean isNested(SDEntity entity1, final SDEntity entity2, boolean strict) {
        if (entity1 == entity2) {
            return !strict;
        }
        EObject container = entity1.eContainer();
        while (container instanceof SDEntity) {
            if (entity2 == container) {
                return true;
            }
            container = container.eContainer();
        }
        return false;
    }

}
