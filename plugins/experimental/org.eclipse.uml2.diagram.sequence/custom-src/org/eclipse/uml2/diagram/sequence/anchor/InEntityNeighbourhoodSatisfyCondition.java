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

import org.eclipse.uml2.diagram.sequence.internal.layout.vertical.input.LifeLine;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDEntity;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine;


public class InEntityNeighbourhoodSatisfyCondition implements LifelineSatisfyCondition {

	public InEntityNeighbourhoodSatisfyCondition(SDEntity entity, AnchorProcessorInput anchorProcessorInput, boolean isBeforeOk, boolean isInsideOk, boolean isAfterOk)
			throws SDModelUtil.AlienElementException {
		myEntity = entity;
		SDLifeLine lifelineEntity = SDModelUtil.findEnclosingLifeline(myEntity);
		int lifelinePos = anchorProcessorInput.getLifelineIndex(lifelineEntity);
		myLifeLine = (LifeLine) anchorProcessorInput.lifeLinesList().get(lifelinePos);

		myIsBeforeOk = isBeforeOk;
		myIsInsideOk = isInsideOk;
		myIsAfterOk = isAfterOk;
	}

	public boolean isSatisfied(LifelineElementTraceable elementTraceable) {
		if (myIsInsideOk && myEntity == elementTraceable.getEntityAfterElement()) {
			return true;
		}
		if (myIsAfterOk && !elementTraceable.isTopNotBottom() && elementTraceable.getPreviousElement().getEntityAfterElement() == myEntity) {
			return true;
		}
		LifelineElementTraceable nextTraceable = elementTraceable.getNextElement();
		if (myIsBeforeOk && nextTraceable != null && nextTraceable.isTopNotBottom() && nextTraceable.getEntityAfterElement() == myEntity) {
			return true;
		}
		return false;
	}

	public LifeLine getLifeline() {
		return myLifeLine;
	}

	public String toString() {
		return "InEntityNeighboudhoodSatisfyCondition for " + myEntity;
	}

	private final SDEntity myEntity;

	private final LifeLine myLifeLine;

	private final boolean myIsBeforeOk;

	private final boolean myIsInsideOk;

	private final boolean myIsAfterOk;
}
