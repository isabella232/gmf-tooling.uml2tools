package org.eclipse.uml2.diagram.statemachine.edit.policies;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.transaction.util.TransactionUtil;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.common.core.command.CommandResult;

import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;

import org.eclipse.gmf.runtime.diagram.core.services.ViewService;

import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditorInput;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;

import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.uml.State;

/**
 * @generated
 */
public class OpenDiagramEditPolicy extends OpenEditPolicy {

	/**
	 * @generated
	 */
	protected Command getOpenCommand(Request request) {
		EditPart targetEditPart = getTargetEditPart(request);
		if (false == targetEditPart.getModel() instanceof View) {
			return null;
		}
		EAnnotation ann = ((View) targetEditPart.getModel()).getEAnnotation("uri://eclipse.org/gmf/openDiagramPolicy");
		if (ann == null) {
			return null;
		}
		return new ICommandProxy(new OpenDiagramCommand(ann));
	}

	/**
	 * @generated
	 */
	private static class OpenDiagramCommand extends AbstractTransactionalCommand {

		/**
		 * @generated
		 */
		private final EAnnotation diagramFacet;

		/**
		 * @generated
		 */
		OpenDiagramCommand(EAnnotation annotation) {
			// editing domain is taken for original diagram, 
			// if we open diagram from another file, we should use another editing domain
			super(TransactionUtil.getEditingDomain(annotation), "Open diagram", null);
			diagramFacet = annotation;
		}

		/**
		 * @generated NOT
		 */
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			if (selectSubmachineOnOpenDiagrams(getDiagramDomainElement())) {
				return CommandResult.newOKCommandResult();
			}
			return doExecuteWithResultGen(monitor, info);
		}

		// FIXME canExecute if  !(readOnly && getDiagramToOpen == null), i.e. open works on ro diagrams only when there's associated diagram already

		/**
		 * @generated
		 */
		protected CommandResult doExecuteWithResultGen(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			try {
				Diagram diagram = getDiagramToOpen();
				if (diagram == null) {
					diagram = intializeNewDiagram();
				}
				final DiagramEditorInput editorInput = new DiagramEditorInput(diagram);
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				page.openEditor(editorInput, getEditorID());
				return CommandResult.newOKCommandResult();
			} catch (Exception ex) {
				throw new ExecutionException("Can't open diagram", ex);
			}
		}

		/**
		 * @generated
		 */
		protected Diagram getDiagramToOpen() {
			// take first
			for (Iterator it = diagramFacet.getReferences().iterator(); it.hasNext();) {
				Object next = it.next();
				if (next instanceof Diagram) {
					return (Diagram) next;
				}
			}
			return null;
		}

		/**
		 * @generated
		 */
		protected Diagram intializeNewDiagram() throws ExecutionException {
			Diagram d = ViewService.createDiagram(getDiagramDomainElement(), getDiagramKind(), getPreferencesHint());
			if (d == null) {
				throw new ExecutionException("Can't create diagram of '" + getDiagramKind() + "' kind");
			}
			diagramFacet.getReferences().add(d);
			assert diagramFacet.eResource() != null;
			diagramFacet.eResource().getContents().add(d);
			try {
				for (Iterator it = diagramFacet.eResource().getResourceSet().getResources().iterator(); it.hasNext();) {
					((Resource) it.next()).save(Collections.EMPTY_MAP);
				}
			} catch (IOException ex) {
				throw new ExecutionException("Can't create diagram of '" + getDiagramKind() + "' kind", ex);
			}
			return d;
		}

		/**
		 * @generated NOT
		 */
		protected EObject getDiagramDomainElement() {
			EObject domainElement = getDiagramDomainElementGen();
			if (domainElement instanceof State) {
				State state = (State) domainElement;
				return state.getSubmachine();
			}
			return domainElement;
		}

		/**
		 * @generated
		 */
		protected EObject getDiagramDomainElementGen() {
			// use same element as associated with EP
			return ((View) diagramFacet.getEModelElement()).getElement();
		}

		/**
		 * @generated
		 */
		protected PreferencesHint getPreferencesHint() {
			// XXX prefhint from target diagram's editor?
			return UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
		}

		/**
		 * @generated
		 */
		protected String getDiagramKind() {
			return "UMLStateMachine";
		}

		/**
		 * @generated
		 */
		protected String getEditorID() {
			return "org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorID";
		}

		/**
		 * @NOT generated
		 */
		private boolean selectSubmachineOnOpenDiagrams(EObject submachine) {
			IWorkbenchPage workbenchPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			IEditorReference[] editorRefs = workbenchPage.getEditorReferences();
			for (int i = 0; i < editorRefs.length; i++) {
				IEditorPart editorPart = editorRefs[i].getEditor(true);
				if (editorPart instanceof DiagramEditor) {
					DiagramEditPart diagramEditPart = ((DiagramEditor) editorPart).getDiagramEditPart();
					EditPart editPart = findTopLevelElementInDiagram(diagramEditPart, submachine);
					if (editPart != null) {
						if (getDiagramToOpen() == null) {
							diagramFacet.getReferences().add(((DiagramEditor) editorPart).getDiagram());
						}
						workbenchPage.activate(editorPart);
						diagramEditPart.getViewer().select(editPart);
						return true;
					}
				}
			}

			return false;
		}

		/**
		 * @NOT generated
		 */
		private EditPart findTopLevelElementInDiagram(DiagramEditPart diagramEditPart, EObject element) {
			IDiagramGraphicalViewer viewer = (IDiagramGraphicalViewer) diagramEditPart.getViewer();

			String elementID = EMFCoreUtil.getProxyID(element);
			List foundEditParts = viewer.findEditPartsForElement(elementID, IGraphicalEditPart.class);
			for (Iterator iterator = foundEditParts.iterator(); iterator.hasNext();) {
				EditPart editPart = (EditPart) iterator.next();
				if (!(editPart instanceof DiagramEditPart)) {
					return editPart;
				}
			}
			return null;
		}
	}
}
