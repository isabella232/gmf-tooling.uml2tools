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

package org.eclipse.uml2.diagram.statemachine.tests.sync;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorUtil;
import org.eclipse.uml2.diagram.statemachine.tests.StateMachineDiagramTestCase;
import org.eclipse.uml2.uml.FinalState;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;


public class SynchronizedDiagramContentTest extends StateMachineDiagramTestCase {
	public SynchronizedDiagramContentTest() {
		super("Content of synchronized diagram testing."); //$NON-NLS-1$
	}
	
	public void test_synchronizedContent() {
		flushEventQueue();
		DiagramEditPart diagramEditPart = getDiagramEditPart();
		assertNotNull("There is no diagram edit part.", diagramEditPart); //$NON-NLS-1$
		
		Diagram diagram = (Diagram) diagramEditPart.getModel();
		assertNotNull("Diagram edit part containts incorrect notation element.", diagram); //$NON-NLS-1$
		
		EList topLevelNodes = diagram.getChildren();
		assertEquals("Auxiliary secondary node is not found.", 1, topLevelNodes.size()); //$NON-NLS-1$
		
		View stateMachineNode = (View) topLevelNodes.get(0);
		assertNotNull("Auxiliary secondary node is null.", stateMachineNode); //$NON-NLS-1$
		
		EList stateMachineChildren = stateMachineNode.getChildren();
		View regionNode = null;
		boolean hasEntryPoint = false;
		boolean hasExitPoint = false;
		for (Iterator iterator = stateMachineChildren.iterator(); iterator.hasNext();) {
			View stateMachineChild = (View) iterator.next();
			EObject element = stateMachineChild.getElement();
			if (element instanceof Region) {
				regionNode = stateMachineChild;
			} else if (element instanceof Pseudostate) {
				PseudostateKind kind = ((Pseudostate) element).getKind();
				if (kind.equals(PseudostateKind.ENTRY_POINT_LITERAL)) {
					hasEntryPoint = true;
				} else if (kind.equals(PseudostateKind.EXIT_POINT_LITERAL)) {
					hasExitPoint = true;
				}
			}
		}
		assertNotNull("StateMachine node doesn't containt region.", regionNode); //$NON-NLS-1$
		assertTrue("StateMachine node doesn't containt entry point.", hasEntryPoint); //$NON-NLS-1$
		assertTrue("StateMachine node doesn't containt exit point.", hasExitPoint); //$NON-NLS-1$
	
		EList regionChildren = regionNode.getChildren();
		assertEquals("Region node doesn't containt subvertex compartment.", 1, regionChildren.size()); //$NON-NLS-1$
		View subvertexCompartment = (View) regionChildren.get(0);
		assertTrue("Region node doesn't containt subvertex compartment.", subvertexCompartment.getElement() instanceof Region); //$NON-NLS-1$

		EList subvertexCompartmentCildren = subvertexCompartment.getChildren();
		boolean hasFinalState = false;
		boolean hasSimpleState = false;
		boolean hasCompositeState = false;
		boolean hasInitial = false;
		boolean hasShallowHistory = false;
		boolean hasDeepHistory = false;
		boolean hasFork = false;
		boolean hasJoin = false;
		boolean hasJunction = false;
		boolean hasChoice = false;
		boolean hasTerminate = false;
		for (Iterator iterator = subvertexCompartmentCildren.iterator(); iterator.hasNext();) {
			View regionChild = (View) iterator.next();
			EObject element = regionChild.getElement();
			if (element instanceof FinalState) {
				hasFinalState = true;
			} else if (element instanceof State) {
				EList stateChildren = regionChild.getChildren(); 
				if (stateChildren.size() == 1) {
					hasSimpleState = true;
				} else if (stateChildren.size() == 2) {
					for (Iterator stateChildrenIterator = stateChildren.iterator(); stateChildrenIterator.hasNext();) {
						View stateChild = (View) stateChildrenIterator.next();
						if (stateChild.getElement() instanceof Region) {
							hasCompositeState = true;
						}
					}
				}
			} else if (element instanceof Pseudostate) {
				PseudostateKind kind = ((Pseudostate) element).getKind();
				if (PseudostateKind.INITIAL_LITERAL.equals(kind)) {
					hasInitial = true;
				} else if (PseudostateKind.SHALLOW_HISTORY_LITERAL.equals(kind)) {
					hasShallowHistory = true;
				} else if (PseudostateKind.DEEP_HISTORY_LITERAL.equals(kind)) {
					hasDeepHistory = true;
				} else if (PseudostateKind.FORK_LITERAL.equals(kind)) {
					hasFork = true;
				} else if (PseudostateKind.JOIN_LITERAL.equals(kind)) {
					hasJoin = true;
				} else if (PseudostateKind.JUNCTION_LITERAL.equals(kind)) {
					hasJunction = true;
				} else if (PseudostateKind.CHOICE_LITERAL.equals(kind)) {
					hasChoice = true;
				} else if (PseudostateKind.TERMINATE_LITERAL.equals(kind)) {
					hasTerminate = true;
				}
			}
		}
		assertTrue("Region node doesn't contain final state.", hasFinalState); //$NON-NLS-1$
		assertTrue("Region node doesn't contain simple state.", hasSimpleState); //$NON-NLS-1$
		assertTrue("Region node doesn't contain composite state.", hasCompositeState); //$NON-NLS-1$
		assertTrue("Region node doesn't contain initial pseudostate.", hasInitial); //$NON-NLS-1$
		assertTrue("Region node doesn't contain shallow history pseudostate.", hasShallowHistory); //$NON-NLS-1$
		assertTrue("Region node doesn't contain deep history pseudostate.", hasDeepHistory); //$NON-NLS-1$
		assertTrue("Region node doesn't contain fork pseudostate.", hasFork); //$NON-NLS-1$
		assertTrue("Region node doesn't contain join pseudostate.", hasJoin); //$NON-NLS-1$
		assertTrue("Region node doesn't contain junction pseudostate.", hasJunction); //$NON-NLS-1$
		assertTrue("Region node doesn't contain choice pseudostate.", hasChoice); //$NON-NLS-1$
		assertTrue("Region node doesn't contain terminate pseudostate.", hasTerminate); //$NON-NLS-1$
	}
	
	@Override
	protected Resource createDiagram() throws Exception {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		URI diagramURI = getDiagramModelURI();
		URI modelURI = getDomainModelURI();
		final Resource diagramResource = editingDomain.getResourceSet().createResource(diagramURI);
		final Resource modelResource = editingDomain.getResourceSet().createResource(modelURI);
		final String diagramName = diagramURI.lastSegment();
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(editingDomain, "Creating diagram and model", Collections.EMPTY_LIST) { //$NON-NLS-1$

			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				StateMachine model = createStateMachine();
				modelResource.getContents().add(model);
				Diagram diagram = ViewService.createDiagram(model, PackageEditPart.MODEL_ID, UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				if (diagram != null) {
					diagramResource.getContents().add(diagram);
					diagram.setName(diagramName);
					diagram.setElement(model);
				}
				try {
					Map<String,String> options = new HashMap<String,String>();
					options.put(XMIResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
					modelResource.save(options);
					diagramResource.save(options);
				} catch (IOException e) {

					UMLDiagramEditorPlugin.getInstance().logError("Unable to store model and diagram resources", e); //$NON-NLS-1$
				}
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command, new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Unable to create model and diagram", e); //$NON-NLS-1$
		}

		IFile modelFile = UMLDiagramEditorUtil.getFile(modelURI);
		modelFile.setCharset("UTF-8", new NullProgressMonitor()); //$NON-NLS-1$

		IFile diagramFile = UMLDiagramEditorUtil.getFile(diagramURI);
		diagramFile.setCharset("UTF-8", new NullProgressMonitor()); //$NON-NLS-1$
		
		return diagramResource;
	}
	
	private StateMachine createStateMachine() {
		StateMachine stateMachine = UMLFactory.eINSTANCE.createStateMachine();
		stateMachine.setName("State Machine"); //$NON-NLS-1$
		Pseudostate entryPoint = stateMachine.createConnectionPoint("Entry Point"); //$NON-NLS-1$
		entryPoint.setKind(PseudostateKind.ENTRY_POINT_LITERAL);
		Pseudostate exitPoint = stateMachine.createConnectionPoint("Exit Point"); //$NON-NLS-1$
		exitPoint.setKind(PseudostateKind.EXIT_POINT_LITERAL);
		
		Region region = stateMachine.createRegion("Region"); //$NON-NLS-1$
		region.createSubvertex("Simple State", UMLPackage.eINSTANCE.getState()); //$NON-NLS-1$
		State compositeState = (State) region.createSubvertex("Composite State", UMLPackage.eINSTANCE.getState()); //$NON-NLS-1$
		compositeState.createRegion("region"); //$NON-NLS-1$
		region.createSubvertex("Final State", UMLPackage.eINSTANCE.getFinalState()); //$NON-NLS-1$
		
		Pseudostate initial = (Pseudostate) region.createSubvertex("Initial Pseudostate", UMLPackage.eINSTANCE.getPseudostate()); //$NON-NLS-1$
		initial.setKind(PseudostateKind.INITIAL_LITERAL);
		Pseudostate shallowHistory = (Pseudostate) region.createSubvertex("Shallow History Pseudostate", UMLPackage.eINSTANCE.getPseudostate()); //$NON-NLS-1$
		shallowHistory.setKind(PseudostateKind.SHALLOW_HISTORY_LITERAL);
		Pseudostate deepHistory = (Pseudostate) region.createSubvertex("Deep History Pseudostate", UMLPackage.eINSTANCE.getPseudostate()); //$NON-NLS-1$
		deepHistory.setKind(PseudostateKind.DEEP_HISTORY_LITERAL);
		Pseudostate fork = (Pseudostate) region.createSubvertex("Fork Pseudostate", UMLPackage.eINSTANCE.getPseudostate()); //$NON-NLS-1$
		fork.setKind(PseudostateKind.FORK_LITERAL);
		Pseudostate join = (Pseudostate) region.createSubvertex("Join Pseudostate", UMLPackage.eINSTANCE.getPseudostate()); //$NON-NLS-1$
		join.setKind(PseudostateKind.JOIN_LITERAL);
		Pseudostate junction = (Pseudostate) region.createSubvertex("Junction Pseudostate", UMLPackage.eINSTANCE.getPseudostate()); //$NON-NLS-1$
		junction.setKind(PseudostateKind.JUNCTION_LITERAL);
		Pseudostate choice = (Pseudostate) region.createSubvertex("Choice Pseudostate", UMLPackage.eINSTANCE.getPseudostate()); //$NON-NLS-1$
		choice.setKind(PseudostateKind.CHOICE_LITERAL);
		Pseudostate terminate = (Pseudostate) region.createSubvertex("Terminate Pseudostate", UMLPackage.eINSTANCE.getPseudostate()); //$NON-NLS-1$
		terminate.setKind(PseudostateKind.TERMINATE_LITERAL);
		return stateMachine;
	}
}
