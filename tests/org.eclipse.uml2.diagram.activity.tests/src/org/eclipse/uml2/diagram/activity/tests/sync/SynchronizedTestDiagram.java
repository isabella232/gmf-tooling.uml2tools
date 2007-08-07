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

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorUtil;
import org.eclipse.uml2.diagram.activity.tests.ActivityTestDiagram;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;


public class SynchronizedTestDiagram extends ActivityTestDiagram {

	public SynchronizedTestDiagram(String projectPath) {
		super(projectPath);
	}

	@Override
	protected Resource createDiagram(URI diagramModelURI, URI domainModelURI) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		final Resource diagramResource = editingDomain.getResourceSet().createResource(diagramModelURI);
		final Resource modelResource = editingDomain.getResourceSet().createResource(domainModelURI);
		final String diagramName = diagramModelURI.lastSegment();
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(editingDomain, "Creating diagram and model", Collections.EMPTY_LIST) { //$NON-NLS-1$

			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				org.eclipse.uml2.uml.Package model = createContent();
				modelResource.getContents().add(model);
				Diagram diagram = createDiagramView(model);
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

		try {
			IFile modelFile = UMLDiagramEditorUtil.getFile(domainModelURI);
			modelFile.setCharset("UTF-8", new NullProgressMonitor()); //$NON-NLS-1$
		} catch(CoreException ce) {
			UMLDiagramEditorPlugin.getInstance().logError("Unable to charset for model", ce); //$NON-NLS-1$
		}

		try {
			IFile diagramFile = UMLDiagramEditorUtil.getFile(diagramModelURI);
			diagramFile.setCharset("UTF-8", new NullProgressMonitor()); //$NON-NLS-1$
		} catch(CoreException ce) {
			UMLDiagramEditorPlugin.getInstance().logError("Unable to charset for diagram", ce); //$NON-NLS-1$
		}
		
		return diagramResource;
	}
	
	private Package createContent() {
		org.eclipse.uml2.uml.Package content = UMLFactory.eINSTANCE.createPackage();
		Activity activity = (Activity) content.createPackagedElement("Activity", UMLPackage.Literals.ACTIVITY); //$NON-NLS-1$
		activity.createNode("ActivityParameter", UMLPackage.Literals.ACTIVITY_PARAMETER_NODE); //$NON-NLS-1$
		activity.createNode("AcceptEventAction", UMLPackage.Literals.ACCEPT_EVENT_ACTION); //$NON-NLS-1$
		TimeEvent timeEvent = (TimeEvent) content.createPackagedElement("TimeEvent", UMLPackage.Literals.TIME_EVENT); //$NON-NLS-1$
		AcceptEventAction acceptTimeEventAction = (AcceptEventAction) activity.createNode("AcceptEventAction", UMLPackage.Literals.ACCEPT_EVENT_ACTION); //$NON-NLS-1$
		Trigger trigger = acceptTimeEventAction.createTrigger("Trigger"); //$NON-NLS-1$
		trigger.setEvent(timeEvent);
		activity.createNode("AddStructuralFeatureValueAction", UMLPackage.Literals.ADD_STRUCTURAL_FEATURE_VALUE_ACTION); //$NON-NLS-1$
		activity.createNode("CallBehaviorAction", UMLPackage.Literals.CALL_BEHAVIOR_ACTION); //$NON-NLS-1$
		activity.createNode("CallOperationAction", UMLPackage.Literals.CALL_OPERATION_ACTION); //$NON-NLS-1$
		activity.createNode("CreateObjectAction", UMLPackage.Literals.CREATE_OBJECT_ACTION); //$NON-NLS-1$
		activity.createNode("OpaqueAction", UMLPackage.Literals.OPAQUE_ACTION); //$NON-NLS-1$
		activity.createNode("SendSignalAction", UMLPackage.Literals.SEND_SIGNAL_ACTION); //$NON-NLS-1$
		activity.createNode("InitialNode", UMLPackage.Literals.INITIAL_NODE); //$NON-NLS-1$
		activity.createNode("ActivityFinalNode", UMLPackage.Literals.ACTIVITY_FINAL_NODE); //$NON-NLS-1$
		activity.createNode("FlowFinalNode", UMLPackage.Literals.FLOW_FINAL_NODE); //$NON-NLS-1$
		activity.createNode("MergeNode", UMLPackage.Literals.MERGE_NODE); //$NON-NLS-1$
		activity.createNode("DecisionNode", UMLPackage.Literals.DECISION_NODE); //$NON-NLS-1$
		activity.createNode("ForkNode", UMLPackage.Literals.FORK_NODE); //$NON-NLS-1$
		activity.createNode("JoinNode", UMLPackage.Literals.JOIN_NODE); //$NON-NLS-1$
		return content;
	}

}
