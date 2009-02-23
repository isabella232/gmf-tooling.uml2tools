package org.eclipse.uml2.diagram.clazz.part;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.diagram.clazz.async.DiagramHeaderFilter;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.common.async.ApplySynchronizationCommand;
import org.eclipse.uml2.diagram.common.async.SyncModelContext;
import org.eclipse.uml2.diagram.common.async.SyncModelNode;
import org.eclipse.uml2.diagram.common.genapi.IDiagramUpdater;
import org.eclipse.uml2.diagram.common.genapi.IVisualIDRegistry;
import org.eclipse.uml2.uml.PackageableElement;

public class NewDiagramForFixedElementsWizard extends UMLNewDiagramFileWizard {

	private final PackageableElement[] myToSelect;

	private SyncDiagramHelper mySyncHelper;

	public NewDiagramForFixedElementsWizard(URI domainModelURI, EObject diagramRoot, PackageableElement[] toSelect, TransactionalEditingDomain editingDomain) {
		super(domainModelURI, diagramRoot, editingDomain);
		myToSelect = toSelect;
	}

	@Override
	public void addPages() {
		addPage(getFileCreationPage());
		addPage(getDiagramRootElementSelectionPage());
	}

	@Override
	protected boolean needsLayoutAll() throws ExecutionException {
		return true;
	}

	@Override
	protected void layoutAll() throws ExecutionException {
		createShortcutsIfNeeded();
		super.layoutAll();
	}

	private void createShortcutsIfNeeded() {
		IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		DiagramEditPart diagramEditPart = ((IDiagramWorkbenchPart) editorPart).getDiagramEditPart();
		IOperationHistory history = OperationHistoryFactory.getOperationHistory();
		for (PackageableElement next : myToSelect) {
			if (!canCreateView(next)) {
				UMLCreateShortcutAction.createShortcut(diagramEditPart.getEditingDomain(), history, next, diagramEditPart, editorPart);
			}
		}
	}

	private boolean canCreateView(EObject element) {
		// String hint = null;
		// ViewService.getInstance().createView(Node.class, new
		// EObjectAdapter(element), getDiagram(), hint, ViewUtil.APPEND, true,
		// UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		// return ViewService.getInstance().provides(Node.class, new
		// EObjectAdapter(element), getDiagram(), hint, ViewUtil.APPEND, true,
		// UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		// ViewService always returns true here
		for (Object next : getDiagram().getChildren()) {
			View view = (View) next;
			if (element.equals(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected AbstractTransactionalCommand getApplySynchronizationCommand() {
		mySyncHelper = new SyncDiagramHelper();
		mySyncHelper.updateSemanticRoot();
		return new ApplySynchronizationCommand(mySyncHelper.getRootSyncNode());
	}

	@Override
	protected Diagram getDiagram() {
		return mySyncHelper.getDiagram();
	}

	private class SyncDiagramHelper {

		private final String TEMP_DIAGRAM_RESOURCE_URI = "uri://" + NewDiagramSynchronizationPage.class.getName() + "/diagram.xml";

		private SyncModelContext myContext;

		private EObject mySemanticRoot;

		private SyncModelNode myRootSyncNode;

		private Resource myTempDiagramResource;

		private Diagram myTempDiagram;

		private void updateSemanticRoot() {
			EObject newRoot = getWizardSemanticRoot();
			if (mySemanticRoot != newRoot) {
				if (mySemanticRoot != null) {
					unloadTempDiagram();
					myRootSyncNode = null;
				}
				loadTempDiagram(newRoot);
				myRootSyncNode = createRootNode();
				mySemanticRoot = newRoot;
			}
		}

		public Diagram getDiagram() {
			return myTempDiagram;
		}

		public SyncModelNode getRootSyncNode() {
			return myRootSyncNode;
		}

		private SyncModelNode createRootNode() {
			SyncModelContext context = getSyncContext();
			final Resource syncModelResource = context.getSyncModelResource();
			final Diagram syncDiagram = ViewService.createDiagram(getWizardSemanticRoot(), PackageEditPart.MODEL_ID, UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
			context.runCommand(new Runnable() {

				public void run() {
					syncModelResource.getContents().add(syncDiagram);
				}
			});
			SyncModelNode result = new SyncModelNodeForInitializedDiagram(syncDiagram, myTempDiagram, context);
			return result;
		}

		private EObject getWizardSemanticRoot() {
			return getDiagramRootElementSelectionPage().getModelElement();
		}

		private SyncModelContext getSyncContext() {
			if (myContext == null) {
				myContext = createSyncContext();
			}
			return myContext;
		}

		private SyncModelContext createSyncContext() {
			TransactionalEditingDomain editingDomain = getEditingDomain();
			final ResourceSet resourceSet = editingDomain.getResourceSet();
			resourceSet.getResource(getWizardSemanticRoot().eResource().getURI(), true);
			SyncModelContext result = new SyncModelContextWithFixedElements(//
					UMLDiagramUpdater.TYPED_ADAPTER, // 
					UMLVisualIDRegistry.TYPED_ADAPTER, //
					UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT, //
					editingDomain, myToSelect, true);

			myTempDiagramResource = resourceSet.createResource(URI.createURI(TEMP_DIAGRAM_RESOURCE_URI));
			return result;
		}

		private void loadTempDiagram(final EObject semanticRoot) {
			if (myTempDiagram != null) {
				throw new IllegalStateException();
			}
			getSyncContext().runCommand(new Runnable() {

				public void run() {
					myTempDiagram = ViewService.createDiagram(semanticRoot, PackageEditPart.MODEL_ID, UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
					myTempDiagramResource.getContents().add(myTempDiagram);
				}
			});
		}

		private void unloadTempDiagram() {
			if (myTempDiagram == null || myTempDiagramResource == null) {
				return;
			}
			getSyncContext().runCommand(new Runnable() {

				public void run() {
					myTempDiagramResource.getContents().remove(myTempDiagram);
					myTempDiagram = null;
				}
			});
		}

	}

	private class SyncModelNodeForInitializedDiagram extends SyncModelNode {

		public SyncModelNodeForInitializedDiagram(View syncModelRoot, View diagramRoot, SyncModelContext context) {
			super(syncModelRoot, diagramRoot, context);
		}

		@Override
		public boolean isAutoSynchronized() {
			return false;
		}

		private SyncModelNodeForInitializedDiagram(View syncModelView, SyncModelNode parent) {
			super(syncModelView, parent);
		}

		@Override
		public void initWithDiagramView(View diagramView) {
			super.initWithDiagramView(diagramView);
			setChecked(isInToCreateList());
		}

		private boolean isInToCreateList() {
			PackageableElement[] toSelect = ((SyncModelContextWithFixedElements) getContext()).getElementsToDisplay();
			if (toSelect == null || toSelect.length == 0) {
				return true;
			}
			if (DiagramHeaderFilter.isDiagramHeader(this)) {
				return true;
			}
			return Arrays.asList(toSelect).contains(getSyncModelView().getElement());
		}

		@Override
		protected SyncModelNode doCreateNodeView(View syncModelView, SyncModelNode parent) {
			return new SyncModelNodeForInitializedDiagram(syncModelView, parent);
		}

	}

	private class SyncModelContextWithFixedElements extends SyncModelContext {

		private PackageableElement[] myElementsToDisplay;

		public SyncModelContextWithFixedElements(IDiagramUpdater updater, IVisualIDRegistry registry, PreferencesHint preferencesHint, TransactionalEditingDomain domain,
				PackageableElement[] toSelect, boolean isDiagramInit) {
			super(updater, registry, preferencesHint, domain, isDiagramInit);
			myElementsToDisplay = toSelect;
		}

		public PackageableElement[] getElementsToDisplay() {
			return myElementsToDisplay;
		}

	}

}
