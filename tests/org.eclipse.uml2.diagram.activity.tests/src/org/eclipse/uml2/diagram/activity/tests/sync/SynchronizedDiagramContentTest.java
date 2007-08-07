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

package org.eclipse.uml2.diagram.activity.tests.sync;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.tests.DiagramTestCase;
import org.eclipse.uml2.diagram.common.tests.UMLTestDiagram;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityFinalNode;
import org.eclipse.uml2.uml.ActivityParameterNode;
import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.CreateObjectAction;
import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.FlowFinalNode;
import org.eclipse.uml2.uml.ForkNode;
import org.eclipse.uml2.uml.InitialNode;
import org.eclipse.uml2.uml.JoinNode;
import org.eclipse.uml2.uml.MergeNode;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.Trigger;


public class SynchronizedDiagramContentTest extends DiagramTestCase {

	public SynchronizedDiagramContentTest() {
		super("Content of synchronized diagram testing."); //$NON-NLS-1$
	}

	public void test_synchronizedContent() {
		DiagramEditPart diagramEditPart = getDiagramEditPart();
		assertNotNull("There is no diagram edit part.", diagramEditPart); //$NON-NLS-1$
		
		Diagram diagram = (Diagram) diagramEditPart.getModel();
		assertNotNull("Diagram edit part containts incorrect notation element.", diagram); //$NON-NLS-1$
		
		EList topLevelNodes = diagram.getChildren();
		assertEquals("Activity node is not found.", 1, topLevelNodes.size()); //$NON-NLS-1$

		Node activityNode = (Node) topLevelNodes.get(0);
		assertTrue("Activity node is not found.", activityNode.getElement() instanceof Activity); //$NON-NLS-1$
		
		boolean hasActivityParameterNode = false;
		boolean hasAcceptEventAction = false;
		boolean hasAcceptTimeEventAction = false;
		boolean hasAddStructuralFeatureValueAction = false;
		boolean hasCallBehaviorAction = false;
		boolean hasCallOperationAction = false;
		boolean hasCreateObjectAction = false;
		boolean hasOpaqueAction = false;
		boolean hasSendSignalAction = false;
		boolean hasInitialNode = false;
		boolean hasActivityFinalNode = false;
		boolean hasFlowFinalNode = false;
		boolean hasMergeNode = false;
		boolean hasDecisionNode = false;
		boolean hasForkNode = false;
		boolean hasJoinNode = false;
		
		EList activityChildren = activityNode.getChildren();
		for (Iterator childrenIterator = activityChildren.iterator(); childrenIterator.hasNext();) {
			View child = (View) childrenIterator.next();
			EObject element = child.getElement();
			if (element instanceof ActivityParameterNode) {
				hasActivityParameterNode = true;
			} else if ("7010".equals(child.getType())) { //$NON-NLS-1$
				EList subvertices = child.getChildren();
				for (Iterator subverticesIterator = subvertices.iterator(); subverticesIterator.hasNext();) {
					View subvertex = (View) subverticesIterator.next();
					EObject subvertexElement = subvertex.getElement();
					if (subvertexElement instanceof AcceptEventAction) {
						AcceptEventAction action = (AcceptEventAction) subvertexElement;
						EList<Trigger> triggers = action.getTriggers();
						for (Iterator<Trigger> triggersIterator = triggers.iterator(); triggersIterator.hasNext();) {
							Trigger trigger = triggersIterator.next();
							if (trigger.getEvent() instanceof TimeEvent) {
								hasAcceptTimeEventAction = true;
							}
						}
						if (!hasAcceptTimeEventAction) {
							hasAcceptEventAction = true;
						}
					} else if (subvertexElement instanceof AddStructuralFeatureValueAction) {
						hasAddStructuralFeatureValueAction = true;
					} else if (subvertexElement instanceof CallBehaviorAction) {
						hasCallBehaviorAction = true;
					} else if (subvertexElement instanceof CallOperationAction) {
						hasCallOperationAction = true;
					} else if (subvertexElement instanceof CreateObjectAction) {
						hasCreateObjectAction = true;
					} else if (subvertexElement instanceof OpaqueAction) {
						hasOpaqueAction = true;
					} else if (subvertexElement instanceof SendSignalAction) {
						hasSendSignalAction = true;
					} else if (subvertexElement instanceof InitialNode) {
						hasInitialNode = true;
					} else if (subvertexElement instanceof ActivityFinalNode) {
						hasActivityFinalNode = true;
					} else if (subvertexElement instanceof FlowFinalNode) {
						hasFlowFinalNode = true;
					} else if (subvertexElement instanceof MergeNode) {
						hasMergeNode = true;
					} else if (subvertexElement instanceof DecisionNode) {
						hasDecisionNode = true;
					} else if (subvertexElement instanceof ForkNode) {
						hasForkNode = true;
					} else if (subvertexElement instanceof JoinNode) {
						hasJoinNode = true;
					}
				}
			}
		}
		
		assertTrue("Activity Parameter Node is not found.", hasActivityParameterNode); //$NON-NLS-1$
		assertTrue("Accept Event Action is not found.", hasAcceptEventAction); //$NON-NLS-1$
		assertTrue("Accept Time Event Action is not found.", hasAcceptTimeEventAction); //$NON-NLS-1$
		assertTrue("Add Structural Feature Value Action is not found.", hasAddStructuralFeatureValueAction); //$NON-NLS-1$
		assertTrue("Call Behavior Action is not found.", hasCallBehaviorAction); //$NON-NLS-1$
		assertTrue("Call Operation Action is not found.", hasCallOperationAction); //$NON-NLS-1$
		assertTrue("Create Object Action is not found.", hasCreateObjectAction); //$NON-NLS-1$
		assertTrue("Opaque Action is not found.", hasOpaqueAction); //$NON-NLS-1$
		assertTrue("Send Signal Action is not found.", hasSendSignalAction); //$NON-NLS-1$
		assertTrue("Initial Node is not found.", hasInitialNode); //$NON-NLS-1$
		assertTrue("Activity Final Node is not found.", hasActivityFinalNode); //$NON-NLS-1$
		assertTrue("Flow Final Node is not found.", hasFlowFinalNode); //$NON-NLS-1$
		assertTrue("Merge Node is not found.", hasMergeNode); //$NON-NLS-1$
		assertTrue("Decision Node is not found.", hasDecisionNode); //$NON-NLS-1$
		assertTrue("Fork Node is not found.", hasForkNode); //$NON-NLS-1$
		assertTrue("Join Node is not found.", hasJoinNode); //$NON-NLS-1$
	}

	@Override
	protected UMLTestDiagram createDiagram() {
		return new SynchronizedTestDiagram(getTestProject().getFullPath());
	}
	
}
