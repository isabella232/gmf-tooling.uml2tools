package org.eclipse.uml2.diagram.common.sheet;

import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.edit.provider.IWrapperItemProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class UMLElementChooserDialog extends Dialog {

	private final AdapterFactory myItemProvidersAdapterFactory;

	private final EObject mySourceObject;

	protected TreeViewer myTreeViewer;

	private URI mySelectedModelElementURI;

	private TransactionalEditingDomain myEditingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();

	public UMLElementChooserDialog(Shell parentShell, AdapterFactory itemProvidersAdapterFactory, EObject sourceObject) {
		super(parentShell);
		setShellStyle(getShellStyle() | SWT.RESIZE);
		myItemProvidersAdapterFactory = itemProvidersAdapterFactory;
		mySourceObject = sourceObject;
	}
	
	@Override
	protected Control createContents(Composite parent) {
		Control control = super.createContents(parent);
		// select already referenced elements
		myTreeViewer.expandToLevel(3);
		myTreeViewer.setSelection(new StructuredSelection(mySourceObject), true);
		return control;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		getShell().setText("Select model element");
		createModelBrowser(composite);
		return composite;
	}

	@Override
	protected Control createButtonBar(Composite parent) {
		Control buttonBar = super.createButtonBar(parent);
		setOkButtonEnabled(false);
		return buttonBar;
	}

	private void createModelBrowser(Composite composite) {
		myTreeViewer = new TreeViewer(composite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.heightHint = 300;
		layoutData.widthHint = 300;
		myTreeViewer.getTree().setLayoutData(layoutData);
		myTreeViewer.setContentProvider(new ModelElementsTreeContentProvider());
		myTreeViewer.setLabelProvider(new ModelElementsTreeLabelProvider());
		myTreeViewer.addSelectionChangedListener(new OkButtonEnabler());
		myTreeViewer.setInput(mySourceObject.eResource());
	}

	private void setOkButtonEnabled(boolean enabled) {
		getButton(IDialogConstants.OK_ID).setEnabled(enabled);
	}

	public URI getSelectedModelElementURI() {
		return mySelectedModelElementURI;
	}

	@Override
	public int open() {
		int result = super.open();
		for (Iterator it = myEditingDomain.getResourceSet().getResources().iterator(); it.hasNext();) {
			Resource resource = (Resource) it.next();
			resource.unload();
		}
		myEditingDomain.dispose();
		return result;
	}
	
	protected boolean isCorrectElement(EObject selectedElement) {
		return false;
	}

	private class ModelElementsTreeContentProvider implements ITreeContentProvider {

		protected AdapterFactoryContentProvider myAdapterFctoryContentProvier = new AdapterFactoryContentProvider(myItemProvidersAdapterFactory);

		public Object[] getChildren(Object parentElement) {
			return myAdapterFctoryContentProvier.getChildren(parentElement);
		}

		public Object getParent(Object element) {
			if (false == element instanceof EObject) {
				return null;
			}
			EObject eObject = (EObject) element;
			if (eObject.eContainer() == null && eObject.eResource().getURI().isFile()) {
				String path = eObject.eResource().getURI().path();
				return ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(path));
			}
			return myAdapterFctoryContentProvier.getParent(eObject);
		}

		public boolean hasChildren(Object element) {
			return myAdapterFctoryContentProvier.hasChildren(element);
		}

		public Object[] getElements(Object inputElement) {
			if (false == inputElement instanceof Resource) {
				return Collections.EMPTY_LIST.toArray();
			}
			Resource modelResource = (Resource) inputElement;
			return myAdapterFctoryContentProvier.getChildren(modelResource);
		}

		public void dispose() {
			myAdapterFctoryContentProvier.dispose();
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			myAdapterFctoryContentProvier.inputChanged(viewer, oldInput, newInput);
		}

	}

	private class ModelElementsTreeLabelProvider implements ILabelProvider {

		private AdapterFactoryLabelProvider myAdapterFactoryLabelProvider = new AdapterFactoryLabelProvider(myItemProvidersAdapterFactory);

		public Image getImage(Object element) {
			return myAdapterFactoryLabelProvider.getImage(element);
		}

		public String getText(Object element) {
			return myAdapterFactoryLabelProvider.getText(element);
		}

		public void addListener(ILabelProviderListener listener) {
			myAdapterFactoryLabelProvider.addListener(listener);
		}

		public void dispose() {
			myAdapterFactoryLabelProvider.dispose();
		}

		public boolean isLabelProperty(Object element, String property) {
			return myAdapterFactoryLabelProvider.isLabelProperty(element, property);
		}

		public void removeListener(ILabelProviderListener listener) {
			myAdapterFactoryLabelProvider.removeListener(listener);
		}

	}
	
	private class OkButtonEnabler implements ISelectionChangedListener {

		public void selectionChanged(SelectionChangedEvent event) {
			if (event.getSelection() instanceof IStructuredSelection) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				if (selection.size() == 1) {
					Object selectedElement = selection.getFirstElement();
					if (selectedElement instanceof IWrapperItemProvider) {
						selectedElement = ((IWrapperItemProvider) selectedElement).getValue();
					}
					if (selectedElement instanceof FeatureMap.Entry) {
						selectedElement = ((FeatureMap.Entry) selectedElement).getValue();
					}
					if (selectedElement instanceof EObject) {
						EObject selectedModelElement = (EObject) selectedElement;
						setOkButtonEnabled(isCorrectElement(selectedModelElement));
						mySelectedModelElementURI = EcoreUtil.getURI(selectedModelElement);
						return;
					}
				}
			}
			mySelectedModelElementURI = null;
			setOkButtonEnabled(false);
		}
	}

}
