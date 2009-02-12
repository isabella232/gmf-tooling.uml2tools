/*
 * Copyright (c) 2007, 2009 Borland Software Corporation
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
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Event;
import org.eclipse.uml2.diagram.common.tests.UMLDiagramFacade;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ChoicePseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.CompositeStateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.DeepHistoryPseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.EntryPointPseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ExitPointPseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.FinalStateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ForkPseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.InitialPseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.JoinPseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.JunctionPseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ShallowHistoryPseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.SimpleStateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachineEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachine_RegionEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachine_RegionSubverticesEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.State_RegionEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.State_RegionSubverticesEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.TerminatePseudostateEditPart;
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

	public void test_rootEditPart() {
		assertNotNull("Root edit part is NULL.", getDiagramEditPart()); //$NON-NLS-1$
	}
	
	public void test_stateMachineCreation() {
		createNodeByTool(UMLElementTypes.StateMachine_2005);

		IGraphicalEditPart statemachineEditPart = 
			getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachineEditPart.VISUAL_ID));
		assertNotNull("StateMachine edit part was not found.", statemachineEditPart); //$NON-NLS-1$
		
		IGraphicalEditPart regionEditPart = 
			statemachineEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachine_RegionEditPart.VISUAL_ID));
		assertNotNull("Region was not created.", regionEditPart); //$NON-NLS-1$
	}
	
	public void test_regionCreation() throws Exception {
		createNodeByTool(UMLElementTypes.StateMachine_2005, 10, 10);
		IGraphicalEditPart stateMachineEditPart = 
			getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachineEditPart.VISUAL_ID));
		assertNotNull("StateMachine edit part was not found.", stateMachineEditPart); //$NON-NLS-1$

		UMLDiagramFacade.flushEventQueue();
		Rectangle stateMachineBounds = stateMachineEditPart.getFigure().getBounds();

		createNodeByTool(UMLElementTypes.Region_3013, stateMachineBounds.x + 10, stateMachineBounds.y + 10);
		List children = stateMachineEditPart.getChildren();
		int counter = 0;
		for (Iterator childrenIterator = children.iterator(); childrenIterator.hasNext();) {
			IGraphicalEditPart childEditPart = (IGraphicalEditPart) childrenIterator.next();
			if (childEditPart instanceof StateMachine_RegionEditPart) {
				counter++;
			}
		}
		
		assertEquals("Only one region is found", 2, counter); //$NON-NLS-1$
	}
	
	public void test_entryExitPointCreation() {
		createNodeByTool(UMLElementTypes.StateMachine_2005, 10, 10);

		IGraphicalEditPart stateMachineEditPart = 
			getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachineEditPart.VISUAL_ID));
		assertNotNull("StateMachine edit part was not found.", stateMachineEditPart); //$NON-NLS-1$
		
		UMLDiagramFacade.flushEventQueue();
		Rectangle stateMachineBounds = stateMachineEditPart.getFigure().getBounds();

		createNodeByTool(UMLElementTypes.Pseudostate_3014, stateMachineBounds.x + 10, stateMachineBounds.y + 10);
		createNodeByTool(UMLElementTypes.Pseudostate_3015, stateMachineBounds.x + 10, stateMachineBounds.y + 10);
		
		IGraphicalEditPart entryPointEditPart = 
			stateMachineEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(EntryPointPseudostateEditPart.VISUAL_ID));
		assertNotNull("Entry point was not created.", entryPointEditPart); //$NON-NLS-1$
		assertEquals("Created entry point had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.ENTRY_POINT_LITERAL, 
				((Pseudostate) ((Node) entryPointEditPart.getModel()).getElement()).getKind());
		
		
		IGraphicalEditPart exitPointEditPart = 
			stateMachineEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ExitPointPseudostateEditPart.VISUAL_ID));
		assertNotNull("Entry point was not created.", exitPointEditPart); //$NON-NLS-1$
		assertEquals("Created exit point had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.EXIT_POINT_LITERAL, 
				((Pseudostate) ((Node) exitPointEditPart.getModel()).getElement()).getKind());
	}
	
	public void test_stateCreation() {
		createNodeByTool(UMLElementTypes.StateMachine_2005, 10, 10);

		IGraphicalEditPart stateMachineEditPart = 
			getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachineEditPart.VISUAL_ID));
		assertNotNull("StateMachine edit part was not found.", stateMachineEditPart); //$NON-NLS-1$

		IGraphicalEditPart regionEditPart = 
			stateMachineEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachine_RegionEditPart.VISUAL_ID));
		assertNotNull("Region edit part was not found.", regionEditPart); //$NON-NLS-1$
		IGraphicalEditPart subverticesEditPart = 
			regionEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachine_RegionSubverticesEditPart.VISUAL_ID));
		assertNotNull("Region subvertices edit part was not found.", subverticesEditPart); //$NON-NLS-1$
		
		UMLDiagramFacade.flushEventQueue();
		Rectangle subverticesBounds = subverticesEditPart.getFigure().getBounds();
		
		createNodeByTool(UMLElementTypes.State_3001, subverticesBounds.x + 10, subverticesBounds.y + 10);
		
		IGraphicalEditPart simpleStateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(SimpleStateEditPart.VISUAL_ID));
		assertNotNull("Simple state was not created.", simpleStateEditPart); //$NON-NLS-1$

		createNodeByTool(UMLElementTypes.State_3012, subverticesBounds.x + 10, subverticesBounds.y + 10);
		IGraphicalEditPart compositeStateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(CompositeStateEditPart.VISUAL_ID));
		assertNotNull("Composite state was not created.", compositeStateEditPart); //$NON-NLS-1$
		assertEquals("Created composite state didn't contain a region.",  //$NON-NLS-1$
				1, 
				((State) ((Node) compositeStateEditPart.getModel()).getElement()).getRegions().size());

		createNodeByTool(UMLElementTypes.FinalState_3003, subverticesBounds.x + 10, subverticesBounds.y + 10);
		IGraphicalEditPart finalStateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(FinalStateEditPart.VISUAL_ID));
		assertNotNull("Final state was not created.", finalStateEditPart); //$NON-NLS-1$
	}
	
	public void test_pseudostateCreation() {
		createNodeByTool(UMLElementTypes.StateMachine_2005, 10, 10);

		IGraphicalEditPart statemachineEditPart = 
			getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachineEditPart.VISUAL_ID));
		assertNotNull("StateMachine edit part was not found.", statemachineEditPart); //$NON-NLS-1$

		IGraphicalEditPart regionEditPart = 
			statemachineEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachine_RegionEditPart.VISUAL_ID));
		assertNotNull("Region edit part was not found.", regionEditPart); //$NON-NLS-1$
		IGraphicalEditPart subverticesEditPart = 
			regionEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachine_RegionSubverticesEditPart.VISUAL_ID));
		assertNotNull("Region subvertices edit part was not found.", subverticesEditPart); //$NON-NLS-1$
		
		UMLDiagramFacade.flushEventQueue();
		Rectangle subverticesBounds = subverticesEditPart.getFigure().getBounds();
		
		createNodeByTool(UMLElementTypes.Pseudostate_3004, subverticesBounds.x + 10, subverticesBounds.y + 10);
		IGraphicalEditPart initialPseudostateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(InitialPseudostateEditPart.VISUAL_ID));
		assertNotNull("Initial pseudostate was not created.", initialPseudostateEditPart); //$NON-NLS-1$
		assertEquals("Created pseudostate had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.INITIAL_LITERAL, 
				((Pseudostate) ((Node) initialPseudostateEditPart.getModel()).getElement()).getKind());

		createNodeByTool(UMLElementTypes.Pseudostate_3005, subverticesBounds.x + 10, subverticesBounds.y + 10);
		IGraphicalEditPart shallowHistoryPseudostateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ShallowHistoryPseudostateEditPart.VISUAL_ID));
		assertNotNull("Shallow history pseudostate was not created.", shallowHistoryPseudostateEditPart); //$NON-NLS-1$
		assertEquals("Created pseudostate had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.SHALLOW_HISTORY_LITERAL, 
				((Pseudostate) ((Node) shallowHistoryPseudostateEditPart.getModel()).getElement()).getKind());

		createNodeByTool(UMLElementTypes.Pseudostate_3006, subverticesBounds.x + 10, subverticesBounds.y + 10);
		IGraphicalEditPart deepHistoryPseudostateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(DeepHistoryPseudostateEditPart.VISUAL_ID));
		assertNotNull("Deep history pseudostate was not created.", deepHistoryPseudostateEditPart); //$NON-NLS-1$
		assertEquals("Created pseudostate had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.DEEP_HISTORY_LITERAL, 
				((Pseudostate) ((Node) deepHistoryPseudostateEditPart.getModel()).getElement()).getKind());

		createNodeByTool(UMLElementTypes.Pseudostate_3007, subverticesBounds.x + 10, subverticesBounds.y + 10);
		IGraphicalEditPart forkPseudostateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ForkPseudostateEditPart.VISUAL_ID));
		assertNotNull("Fork pseudostate was not created.", forkPseudostateEditPart); //$NON-NLS-1$
		assertEquals("Created pseudostate had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.FORK_LITERAL, 
				((Pseudostate) ((Node) forkPseudostateEditPart.getModel()).getElement()).getKind());

		createNodeByTool(UMLElementTypes.Pseudostate_3008, subverticesBounds.x + 10, subverticesBounds.y + 10);
		IGraphicalEditPart joinPseudostateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(JoinPseudostateEditPart.VISUAL_ID));
		assertNotNull("Join pseudostate was not created.", joinPseudostateEditPart); //$NON-NLS-1$
		assertEquals("Created pseudostate had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.JOIN_LITERAL, 
				((Pseudostate) ((Node) joinPseudostateEditPart.getModel()).getElement()).getKind());

		createNodeByTool(UMLElementTypes.Pseudostate_3009, subverticesBounds.x + 10, subverticesBounds.y + 10);
		IGraphicalEditPart junctionPseudostateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(JunctionPseudostateEditPart.VISUAL_ID));
		assertNotNull("Junction pseudostate was not created.", junctionPseudostateEditPart); //$NON-NLS-1$
		assertEquals("Created pseudostate had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.JUNCTION_LITERAL, 
				((Pseudostate) ((Node) junctionPseudostateEditPart.getModel()).getElement()).getKind());

		createNodeByTool(UMLElementTypes.Pseudostate_3010, subverticesBounds.x + 10, subverticesBounds.y + 10);
		IGraphicalEditPart choicePseudostateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ChoicePseudostateEditPart.VISUAL_ID));
		assertNotNull("Junction pseudostate was not created.", choicePseudostateEditPart); //$NON-NLS-1$
		assertEquals("Choice pseudostate had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.CHOICE_LITERAL, 
				((Pseudostate) ((Node) choicePseudostateEditPart.getModel()).getElement()).getKind());

		createNodeByTool(UMLElementTypes.Pseudostate_3011, subverticesBounds.x + 10, subverticesBounds.y + 10);
		IGraphicalEditPart terminatePseudostateEditPart = 
			subverticesEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(TerminatePseudostateEditPart.VISUAL_ID));
		assertNotNull("Terminate pseudostate was not created.", terminatePseudostateEditPart); //$NON-NLS-1$
		assertEquals("Choice pseudostate had incorrect kind.",  //$NON-NLS-1$
				PseudostateKind.TERMINATE_LITERAL, 
				((Pseudostate) ((Node) terminatePseudostateEditPart.getModel()).getElement()).getKind());
	}
	
	public void test_transitionCreation() {
		createNodeByTool(UMLElementTypes.StateMachine_2005, 10, 10);
		IGraphicalEditPart statemachineEditPart = 
			getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachineEditPart.VISUAL_ID));
		assertNotNull("StateMachine edit part was not found.", statemachineEditPart); //$NON-NLS-1$

		IGraphicalEditPart regionEditPart = 
			statemachineEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachine_RegionEditPart.VISUAL_ID));
		assertNotNull("Region edit part was not found.", regionEditPart); //$NON-NLS-1$
		IGraphicalEditPart subverticesEditPart = 
			regionEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachine_RegionSubverticesEditPart.VISUAL_ID));
		assertNotNull("Region subvertices edit part was not found.", subverticesEditPart); //$NON-NLS-1$
		
		UMLDiagramFacade.flushEventQueue();
		Rectangle subverticesBounds = subverticesEditPart.getFigure().getBounds();
		
		createNodeByTool(UMLElementTypes.State_3001, subverticesBounds.x + 10, subverticesBounds.y + 10);
		createNodeByTool(UMLElementTypes.State_3001, subverticesBounds.x + 10, subverticesBounds.y + 10);
		
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
