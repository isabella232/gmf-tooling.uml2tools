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

package org.eclipse.uml2.diagram.activity.tests.tools;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityParameterNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InitialNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.MergeNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.SendSignalActionEditPart;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.activity.tests.ActivityTestDiagram;
import org.eclipse.uml2.diagram.common.tests.UMLTestDiagram;


public class CreationToolTest extends org.eclipse.uml2.diagram.common.tests.CreationToolTest {

	public CreationToolTest() {
		super("Testing element creation by tools"); //$NON-NLS-1$
	}
	
	public void test_rootEditPart() {
		assertNotNull("Root edit part is NULL", getDiagramEditPart()); //$NON-NLS-1$
	}
	
	public void test_activityCreation() {
		createNodeByTool(UMLElementTypes.Activity_2026, 10, 10);

		IGraphicalEditPart activityEditPart = 
			getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
		assertNotNull("Activity edit part was not found.", activityEditPart); //$NON-NLS-1$
	}

	public void test_activityParameterNodeCreation() {
		createNodeByTool(UMLElementTypes.Activity_2026, 10, 10);

		IGraphicalEditPart activityEditPart = 
			getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
		assertNotNull("Activity edit part was not found.", activityEditPart); //$NON-NLS-1$
		
		flushEventQueue();
		Rectangle activityBounds = activityEditPart.getFigure().getBounds();

		createNodeByTool(UMLElementTypes.ActivityParameterNode_3052, activityBounds.x + 20, activityBounds.y + 5);
		IGraphicalEditPart activityParameterNodeEditPart = 
			activityEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ActivityParameterNodeEditPart.VISUAL_ID));
		assertNotNull("Activity parameter node edit part was not found.", activityParameterNodeEditPart); //$NON-NLS-1$
	}

	public void test_objectNodesCreation() {
		createNodeByTool(UMLElementTypes.Activity_2026, 10, 10);

		IGraphicalEditPart activityEditPart = 
			getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
		assertNotNull("Activity edit part was not found.", activityEditPart); //$NON-NLS-1$
		
		flushEventQueue();
		Rectangle activityBounds = activityEditPart.getFigure().getBounds();
		
		createNodeByTool(UMLElementTypes.CentralBufferNode_3037, activityBounds.x + 50, activityBounds.y + 50);
		IGraphicalEditPart centralBufferNodeEditPart = 
			activityEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(CentralBufferNodeEditPart.VISUAL_ID));
		assertNotNull("Central buffer node edit part was not found.", centralBufferNodeEditPart); //$NON-NLS-1$

		createNodeByTool(UMLElementTypes.DataStoreNode_3036, activityBounds.x + 50, activityBounds.y + 50);
		IGraphicalEditPart dataStoreNodeEditPart = 
			activityEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(DataStoreNodeEditPart.VISUAL_ID));
		assertNotNull("Data store node edit part was not found.", dataStoreNodeEditPart); //$NON-NLS-1$
	}

	public void test_controlNodesCreation() {
		createNodeByTool(UMLElementTypes.Activity_2026, 10, 10);

		IGraphicalEditPart activityEditPart = 
			getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
		assertNotNull("Activity edit part was not found.", activityEditPart); //$NON-NLS-1$
		
		flushEventQueue();
		Rectangle activityBounds = activityEditPart.getFigure().getBounds();

		createNodeByTool(UMLElementTypes.InitialNode_3035, activityBounds.x + 50, activityBounds.y + 50);
		IGraphicalEditPart initialNodeEditPart = 
			activityEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(InitialNodeEditPart.VISUAL_ID));
		assertNotNull("Initial node edit part was not found.", initialNodeEditPart); //$NON-NLS-1$

		createNodeByTool(UMLElementTypes.ActivityFinalNode_3032, activityBounds.x + 50, activityBounds.y + 50);
		IGraphicalEditPart finalNodeEditPart = 
			activityEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ActivityFinalNodeEditPart.VISUAL_ID));
		assertNotNull("Final node edit part was not found.", finalNodeEditPart); //$NON-NLS-1$

		createNodeByTool(UMLElementTypes.FlowFinalNode_3038, activityBounds.x + 50, activityBounds.y + 50);
		IGraphicalEditPart flowFinalNodeEditPart = 
			activityEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(FlowFinalNodeEditPart.VISUAL_ID));
		assertNotNull("Flow Final node edit part was not found.", flowFinalNodeEditPart); //$NON-NLS-1$

		createNodeByTool(UMLElementTypes.MergeNode_3034, activityBounds.x + 50, activityBounds.y + 50);
		IGraphicalEditPart mergeNodeEditPart = 
			activityEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(MergeNodeEditPart.VISUAL_ID));
		assertNotNull("Merge node edit part was not found.", mergeNodeEditPart); //$NON-NLS-1$

		createNodeByTool(UMLElementTypes.DecisionNode_3033, activityBounds.x + 50, activityBounds.y + 50);
		IGraphicalEditPart decisionNodeEditPart = 
			activityEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(DecisionNodeEditPart.VISUAL_ID));
		assertNotNull("Merge node edit part was not found.", decisionNodeEditPart); //$NON-NLS-1$

		createNodeByTool(UMLElementTypes.ForkNode_3039, activityBounds.x + 50, activityBounds.y + 50);
		IGraphicalEditPart forkNodeEditPart = 
			activityEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ForkNodeEditPart.VISUAL_ID));
		assertNotNull("Merge node edit part was not found.", forkNodeEditPart); //$NON-NLS-1$

		createNodeByTool(UMLElementTypes.JoinNode_3040, activityBounds.x + 50, activityBounds.y + 50);
		IGraphicalEditPart joinNodeEditPart = 
			activityEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(JoinNodeEditPart.VISUAL_ID));
		assertNotNull("Join node edit part was not found.", joinNodeEditPart); //$NON-NLS-1$
	}
	
	public void test_actionsCreation() {
		createNodeByTool(UMLElementTypes.Activity_2026, 10, 10);

		IGraphicalEditPart activityEditPart = 
			getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
		assertNotNull("Activity edit part was not found.", activityEditPart); //$NON-NLS-1$
		
		flushEventQueue();
		Rectangle activityBounds = activityEditPart.getFigure().getBounds();

		createNodeByTool(UMLElementTypes.AcceptEventAction_3030, activityBounds.x + 50, activityBounds.y + 50);
		IGraphicalEditPart acceptEventActionEditPart = 
			activityEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(AcceptEventActionEditPart.VISUAL_ID));
		assertNotNull("Accept Event action edit part was not found.", acceptEventActionEditPart); //$NON-NLS-1$

		createNodeByTool(UMLElementTypes.AddStructuralFeatureValueAction_3043, activityBounds.x + 50, activityBounds.y + 50);
		IGraphicalEditPart addFeatureActionEditPart = 
			activityEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(AddStructuralFeatureValueActionEditPart.VISUAL_ID));
		assertNotNull("Add Structural Feature action edit part was not found.", addFeatureActionEditPart); //$NON-NLS-1$

		createNodeByTool(UMLElementTypes.CallBehaviorAction_3044, activityBounds.x + 50, activityBounds.y + 50);
		IGraphicalEditPart callBehaviorActionEditPart = 
			activityEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(CallBehaviorActionEditPart.VISUAL_ID));
		assertNotNull("Call Behavior action edit part was not found.", callBehaviorActionEditPart); //$NON-NLS-1$

		createNodeByTool(UMLElementTypes.CallOperationAction_3045, activityBounds.x + 50, activityBounds.y + 50);
		IGraphicalEditPart callOperationActionEditPart = 
			activityEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(CallOperationActionEditPart.VISUAL_ID));
		assertNotNull("Call Operation action edit part was not found.", callOperationActionEditPart); //$NON-NLS-1$

		createNodeByTool(UMLElementTypes.CreateObjectAction_3042, activityBounds.x + 50, activityBounds.y + 50);
		IGraphicalEditPart createObjectActionEditPart = 
			activityEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(CreateObjectActionEditPart.VISUAL_ID));
		assertNotNull("Create Object action edit part was not found.", createObjectActionEditPart); //$NON-NLS-1$

		createNodeByTool(UMLElementTypes.OpaqueAction_3029, activityBounds.x + 50, activityBounds.y + 50);
		IGraphicalEditPart opaqueActionEditPart = 
			activityEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(OpaqueActionEditPart.VISUAL_ID));
		assertNotNull("Opaque action edit part was not found.", opaqueActionEditPart); //$NON-NLS-1$

		createNodeByTool(UMLElementTypes.SendSignalAction_3053, activityBounds.x + 50, activityBounds.y + 50);
		IGraphicalEditPart sendSignalActionEditPart = 
			activityEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(SendSignalActionEditPart.VISUAL_ID));
		assertNotNull("Send Signal action edit part was not found.", sendSignalActionEditPart); //$NON-NLS-1$
	}

	@Override
	protected UMLTestDiagram createDiagram() {
		return new ActivityTestDiagram(getTestProject().getFullPath());
	}
	
}
