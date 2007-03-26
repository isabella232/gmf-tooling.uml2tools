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

package org.eclipse.uml2.diagram.statemachine.tests.tools;

import java.util.Collections;

import org.eclipse.gef.EditDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Event;
import org.eclipse.uml2.diagram.statemachine.edit.parts.FinalStateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate10EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate3EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate4EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate5EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate6EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate7EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate8EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate9EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.RegionEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.RegionSubverticesEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.State2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachine2EditPart;
import org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.statemachine.tests.StateMachineDiagramTestCase;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.State;


public class CreationToolTest extends StateMachineDiagramTestCase {
	public CreationToolTest() {
		super("Testing element creation by tools"); //$NON-NLS-1$
	}

	public void test_topLevelEditPart() {
		IGraphicalEditPart statemachineEditPart = 
			getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachine2EditPart.VISUAL_ID));
		assertNotNull("Top level edit part is not found.", statemachineEditPart); //$NON-NLS-1$
	}
	
	public void test_regionCreation() throws Exception {
		createNodeByTool(UMLElementTypes.Region_3013);
		
		IGraphicalEditPart statemachineEditPart = 
			getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachine2EditPart.VISUAL_ID));
		assertNotNull("StateMachine edit part was not found.", statemachineEditPart); //$NON-NLS-1$
		IGraphicalEditPart regionEditPart = 
			statemachineEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(RegionEditPart.VISUAL_ID));
		assertNotNull("Region was not created.", regionEditPart); //$NON-NLS-1$
	}
	
	public void test_entryExitPointCreation() {
		createNodeByTool(UMLElementTypes.Pseudostate_3014);
		createNodeByTool(UMLElementTypes.Pseudostate_3015);
		
		IGraphicalEditPart statemachineEditPart = 
			getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachine2EditPart.VISUAL_ID));
		assertNotNull("StateMachine edit part was not found.", statemachineEditPart); //$NON-NLS-1$

		IGraphicalEditPart entryPointEditPart = 
			statemachineEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Pseudostate9EditPart.VISUAL_ID));
		assertNotNull("Entry point was not created.", entryPointEditPart); //$NON-NLS-1$
		assertEquals("Created entry point had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.ENTRY_POINT_LITERAL, 
				((Pseudostate) ((Node) entryPointEditPart.getModel()).getElement()).getKind());
		
		
		IGraphicalEditPart exitPointEditPart = 
			statemachineEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Pseudostate10EditPart.VISUAL_ID));
		assertNotNull("Entry point was not created.", exitPointEditPart); //$NON-NLS-1$
		assertEquals("Created exit point had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.EXIT_POINT_LITERAL, 
				((Pseudostate) ((Node) exitPointEditPart.getModel()).getElement()).getKind());
	}
	
	public void test_stateCreation() {
		IGraphicalEditPart statemachineEditPart = 
			getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachine2EditPart.VISUAL_ID));
		assertNotNull("StateMachine edit part was not found.", statemachineEditPart); //$NON-NLS-1$

		createNodeByTool(UMLElementTypes.Region_3013);

		IGraphicalEditPart regionEditPart = 
			statemachineEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(RegionEditPart.VISUAL_ID));
		assertNotNull("Region edit part was not found.", regionEditPart); //$NON-NLS-1$
		IGraphicalEditPart subverticesEditPart = 
			regionEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		assertNotNull("Region subvertices edit part was not found.", subverticesEditPart); //$NON-NLS-1$
		
		flushEventQueue();
		
		createNodeByTool(UMLElementTypes.State_3001);
		
		IGraphicalEditPart simpleStateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(StateEditPart.VISUAL_ID));
		assertNotNull("Simple state was not created.", simpleStateEditPart); //$NON-NLS-1$

		createNodeByTool(UMLElementTypes.State_3012);
		IGraphicalEditPart compositeStateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
		assertNotNull("Composite state was not created.", compositeStateEditPart); //$NON-NLS-1$
		assertEquals("Created composite state didn't contain a region.",  //$NON-NLS-1$
				1, 
				((State) ((Node) compositeStateEditPart.getModel()).getElement()).getRegions().size());

		createNodeByTool(UMLElementTypes.FinalState_3003);
		IGraphicalEditPart finalStateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(FinalStateEditPart.VISUAL_ID));
		assertNotNull("Final state was not created.", finalStateEditPart); //$NON-NLS-1$
	}
	
	public void test_pseudostateCreation() {
		IGraphicalEditPart statemachineEditPart = 
			getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachine2EditPart.VISUAL_ID));
		assertNotNull("StateMachine edit part was not found.", statemachineEditPart); //$NON-NLS-1$

		createNodeByTool(UMLElementTypes.Region_3013);

		IGraphicalEditPart regionEditPart = 
			statemachineEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(RegionEditPart.VISUAL_ID));
		assertNotNull("Region edit part was not found.", regionEditPart); //$NON-NLS-1$
		IGraphicalEditPart subverticesEditPart = 
			regionEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		assertNotNull("Region subvertices edit part was not found.", subverticesEditPart); //$NON-NLS-1$
		
		flushEventQueue();
		
		createNodeByTool(UMLElementTypes.Pseudostate_3004);
		IGraphicalEditPart initialPseudostateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(PseudostateEditPart.VISUAL_ID));
		assertNotNull("Initial pseudostate was not created.", initialPseudostateEditPart); //$NON-NLS-1$
		assertEquals("Created pseudostate had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.INITIAL_LITERAL, 
				((Pseudostate) ((Node) initialPseudostateEditPart.getModel()).getElement()).getKind());

		createNodeByTool(UMLElementTypes.Pseudostate_3005);
		IGraphicalEditPart shallowHistoryPseudostateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Pseudostate2EditPart.VISUAL_ID));
		assertNotNull("Shallow history pseudostate was not created.", shallowHistoryPseudostateEditPart); //$NON-NLS-1$
		assertEquals("Created pseudostate had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.SHALLOW_HISTORY_LITERAL, 
				((Pseudostate) ((Node) shallowHistoryPseudostateEditPart.getModel()).getElement()).getKind());

		createNodeByTool(UMLElementTypes.Pseudostate_3006);
		IGraphicalEditPart deepHistoryPseudostateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Pseudostate3EditPart.VISUAL_ID));
		assertNotNull("Deep history pseudostate was not created.", deepHistoryPseudostateEditPart); //$NON-NLS-1$
		assertEquals("Created pseudostate had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.DEEP_HISTORY_LITERAL, 
				((Pseudostate) ((Node) deepHistoryPseudostateEditPart.getModel()).getElement()).getKind());

		createNodeByTool(UMLElementTypes.Pseudostate_3007);
		IGraphicalEditPart forkPseudostateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Pseudostate4EditPart.VISUAL_ID));
		assertNotNull("Fork pseudostate was not created.", forkPseudostateEditPart); //$NON-NLS-1$
		assertEquals("Created pseudostate had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.FORK_LITERAL, 
				((Pseudostate) ((Node) forkPseudostateEditPart.getModel()).getElement()).getKind());

		createNodeByTool(UMLElementTypes.Pseudostate_3008);
		IGraphicalEditPart joinPseudostateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Pseudostate5EditPart.VISUAL_ID));
		assertNotNull("Join pseudostate was not created.", joinPseudostateEditPart); //$NON-NLS-1$
		assertEquals("Created pseudostate had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.JOIN_LITERAL, 
				((Pseudostate) ((Node) joinPseudostateEditPart.getModel()).getElement()).getKind());

		createNodeByTool(UMLElementTypes.Pseudostate_3009);
		IGraphicalEditPart junctionPseudostateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Pseudostate6EditPart.VISUAL_ID));
		assertNotNull("Junction pseudostate was not created.", junctionPseudostateEditPart); //$NON-NLS-1$
		assertEquals("Created pseudostate had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.JUNCTION_LITERAL, 
				((Pseudostate) ((Node) junctionPseudostateEditPart.getModel()).getElement()).getKind());

		createNodeByTool(UMLElementTypes.Pseudostate_3010);
		IGraphicalEditPart choicePseudostateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Pseudostate7EditPart.VISUAL_ID));
		assertNotNull("Junction pseudostate was not created.", choicePseudostateEditPart); //$NON-NLS-1$
		assertEquals("Choice pseudostate had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.CHOICE_LITERAL, 
				((Pseudostate) ((Node) choicePseudostateEditPart.getModel()).getElement()).getKind());

		createNodeByTool(UMLElementTypes.Pseudostate_3011);
		IGraphicalEditPart terminatePseudostateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Pseudostate8EditPart.VISUAL_ID));
		assertNotNull("Terminate pseudostate was not created.", terminatePseudostateEditPart); //$NON-NLS-1$
		assertEquals("Choice pseudostate had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.TERMINATE_LITERAL, 
				((Pseudostate) ((Node) terminatePseudostateEditPart.getModel()).getElement()).getKind());
	}
	
	public void test_transitionCreation() {
		IGraphicalEditPart statemachineEditPart = 
			getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachine2EditPart.VISUAL_ID));
		assertNotNull("StateMachine edit part was not found.", statemachineEditPart); //$NON-NLS-1$

		createNodeByTool(UMLElementTypes.Region_3013);

		IGraphicalEditPart regionEditPart = 
			statemachineEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(RegionEditPart.VISUAL_ID));
		assertNotNull("Region edit part was not found.", regionEditPart); //$NON-NLS-1$
		IGraphicalEditPart subverticesEditPart = 
			regionEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		assertNotNull("Region subvertices edit part was not found.", subverticesEditPart); //$NON-NLS-1$
		
		flushEventQueue();
		
		createNodeByTool(UMLElementTypes.State_3001);
		createNodeByTool(UMLElementTypes.State_3001);
		
		getDiagramEditPart().getViewer().setSelection(new StructuredSelection(subverticesEditPart.getChildren())); 
		
		createConnectionByTool(UMLElementTypes.Transition_4001);

		assertEquals("Transition wasn't created.", 1, getDiagramEditPart().getConnections().size()); //$NON-NLS-1$
	}
	
	private void createConnectionByTool(IElementType elementType) {
		UnspecifiedTypeConnectionTool tool = new UnspecifiedTypeConnectionTool(Collections.singletonList(elementType));
		tool.setEditDomain((EditDomain) getDiagramWorkbenchPart().getDiagramEditDomain());
		tool.activate();
		tool.mouseDoubleClick(createMouseEvent(0, 0), getDiagramEditPart().getViewer());
		tool.deactivate();
	}
	
	private void createNodeByTool(IElementType elementType) {
		createNodeByTool(elementType, 70, 70);
	}
	
	private void createNodeByTool(IElementType elementType, int x, int y) {
		UnspecifiedTypeCreationTool tool = new UnspecifiedTypeCreationTool(Collections.singletonList(elementType));
		tool.setEditDomain((EditDomain) getDiagramWorkbenchPart().getDiagramEditDomain());
		tool.activate();
		tool.mouseMove(createMouseEvent(x, y), getDiagramEditPart().getViewer());
		tool.mouseDown(createMouseEvent(x, y), getDiagramEditPart().getViewer());
		tool.mouseUp(createMouseEvent(x, y), getDiagramEditPart().getViewer());
		tool.deactivate();
	}

	private MouseEvent createMouseEvent(int x, int y) {
		Event e = new Event();

		e.widget = getDiagramEditPart().getViewer().getControl();
		e.display = e.widget.getDisplay();
		e.button = 1; // left button
		e.x = x;
		e.y = y;

		return new MouseEvent(e);
	}
}
