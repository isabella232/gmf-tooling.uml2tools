package org.eclipse.uml2.diagram.clazz.part;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.uml2.diagram.clazz.async.DiagramHeaderFilter;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.clazz.navigator.UMLNavigatorLabelProvider;
import org.eclipse.uml2.diagram.common.async.SyncModelContext;
import org.eclipse.uml2.diagram.common.async.SyncModelLabelProvider;
import org.eclipse.uml2.diagram.common.async.SyncModelNode;
import org.eclipse.uml2.diagram.common.async.SyncModelUI;

public class NewDiagramSynchronizationPage extends WizardPage {

	private static final String TEMP_DIAGRAM_RESOURCE_URI = "uri://" + NewDiagramSynchronizationPage.class.getName() + "/diagram.xml";

	private final TransactionalEditingDomain myDomain;

	private EObject mySemanticRoot;

	private SyncModelContext myContext;

	private Resource myTempDiagramResource;

	private Diagram myTempDiagram;

	private SyncModelUI mySyncUI;

	private SyncModelNode myRootSyncNode;
	
	private boolean myWasVisible;

	public NewDiagramSynchronizationPage(String pageName, TransactionalEditingDomain domain) {
		super(pageName);
		myDomain = domain;
	}

	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

		Composite plate = new Composite(parent, SWT.NONE);
		plate.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout();
		layout.marginWidth = 0;
		plate.setLayout(layout);
		setControl(plate);

		Label label = new Label(plate, SWT.NONE);
		label.setText(getSelectionTitle());
		label.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

		mySyncUI = new SyncModelUI(plate, new SyncModelLabelProvider(new UMLNavigatorLabelProvider()));
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.heightHint = 300;
		layoutData.widthHint = 300;
		mySyncUI.getUI().getControl().setLayoutData(layoutData);
		mySyncUI.getUI().addFilter(new DiagramHeaderFilter());

		setPageComplete(true);
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			myWasVisible = true;
			updateSemanticRoot();
			mySyncUI.revealRootChildren();
		}
	}
	
	public boolean wasVisible(){
		return myWasVisible;
	}

	private void updateSemanticRoot() {
		EObject newRoot = getWizardSemanticRoot();
		if (mySemanticRoot != newRoot) {
			if (mySemanticRoot != null) {
				unloadTempDiagram();
				myRootSyncNode = null;
			}
			loadTempDiagram(newRoot);
			myRootSyncNode = createRootNode();
			mySyncUI.setRootNode(myRootSyncNode);
			mySemanticRoot = newRoot;
		}
	}

	public Diagram getDiagram() {
		return myTempDiagram;
	}

	public SyncModelNode getSyncRoot() {
		return myRootSyncNode;
	}

	private SyncModelContext getSyncContext() {
		if (myContext == null) {
			myContext = createSyncContext();
		}
		return myContext;
	}

	@Override
	public void dispose() {
		disposeSyncContext();
		super.dispose();
	}

	private void disposeSyncContext() {
		if (myContext != null) {
			myContext.dispose(); //this unloads sync-model resource only
			unloadTempDiagramResource();
			myContext = null;
			myTempDiagram = null;
			myRootSyncNode = null;
		}
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
		SyncModelNode result = new SyncModelNode(syncDiagram, myTempDiagram, context);
		return result;
	}

	private SyncModelContext createSyncContext() {
		final ResourceSet resourceSet = myDomain.getResourceSet();
		resourceSet.getResource(getWizardSemanticRoot().eResource().getURI(), true);
		SyncModelContext result = new SyncModelContext(//
				UMLDiagramUpdater.TYPED_ADAPTER, // 
				UMLVisualIDRegistry.TYPED_ADAPTER, //
				UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT, //
				myDomain, true);

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

	private void unloadTempDiagramResource() {
		if (myTempDiagramResource != null) {
			myTempDiagramResource.unload();
			myContext.getDomain().getResourceSet().getResources().remove(myTempDiagramResource);
			myTempDiagramResource = null;
		}
	}

	private EObject getWizardSemanticRoot() {
		ModelElementSelectionPage prevPageImpl = (ModelElementSelectionPage) getPreviousPage();
		return prevPageImpl.getModelElement();
	}

	private String getSelectionTitle() {
		return "Selected elements will be added to diagram, 'bold' elements will manage their children:";
	}

}
