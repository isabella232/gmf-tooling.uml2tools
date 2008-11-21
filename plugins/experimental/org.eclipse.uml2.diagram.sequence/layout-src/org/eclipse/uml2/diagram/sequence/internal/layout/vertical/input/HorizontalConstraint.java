package org.eclipse.uml2.diagram.sequence.internal.layout.vertical.input;

import java.util.List;

/**
 * 
 */
public interface HorizontalConstraint {
	List getLifeLineElementsList();
	
	void elementIsResolved(LifeLineElement lifeLineElement);
	void elementIsViolated(LifeLineElement lifeLineElement);
}
