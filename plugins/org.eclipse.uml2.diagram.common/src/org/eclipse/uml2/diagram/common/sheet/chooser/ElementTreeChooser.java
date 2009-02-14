/*
 * Copyright (c) 2008, 2009 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tatiana Fesenko (Borland) - initial API and implementation
 */
package org.eclipse.uml2.diagram.common.sheet.chooser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class ElementTreeChooser implements ElementChooserPage {

	private final AdapterFactory myItemProvidersAdapterFactory;

	private TreeViewer myTreeViewer;

	private URI mySelectedModelElementURI;

	private final TransactionalEditingDomain myEditingDomain;

	private final EObject mySourceObject;

	private final EStructuralFeature myFeature;

	private MainRoot myRoot;

	public ElementTreeChooser(AdapterFactory itemProvidersAdapterFactory, EObject sourceObject, EStructuralFeature feature, TransactionalEditingDomain editingDomain) {
		myItemProvidersAdapterFactory = itemProvidersAdapterFactory;
		mySourceObject = sourceObject;
		myFeature = feature;
		myEditingDomain = editingDomain;
	}

	public Control createControl(Composite parent) {
		Composite composite = createModelBrowser(parent);
		myRoot = new MainRoot(mySourceObject);
		myTreeViewer.setInput(myRoot);
		myTreeViewer.addFilter(new UMLFileFilter());
		if (myFeature instanceof EReference) {
			// false -- for now always ignore template-related containments, see
			// https://bugs.eclipse.org/bugs/show_bug.cgi?id=261691#c3
			myTreeViewer.addFilter(new UMLContainmentFilter((EReference) myFeature, false));
		}
		myTreeViewer.expandToLevel(myRoot.getCurrentResourceRoot(), 1);
		myTreeViewer.expandToLevel(myRoot.getLoadedResourcesRoot(), 1);
		return composite;
	}

	public List<?> getSelection() {
		return ((IStructuredSelection) myTreeViewer.getSelection()).toList();
	}

	public void setSelection(List<?> selection) {
		if (selection == null || selection.isEmpty()) {
			myTreeViewer.setSelection(null);
		} else {
			ArrayList<TreePath> paths = new ArrayList<TreePath>(selection.size());
			for (Object next : selection) {
				TreePath path = getTreePath(next);
				if (path != null) {
					paths.add(path);
				}
			}
			myTreeViewer.setSelection(new StructuredSelection(paths), true);
		}
	}


	private Composite createModelBrowser(Composite composite) {
		myTreeViewer = new TreeViewer(composite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		myTreeViewer.setContentProvider(new ModelElementsTreeContentProvider(myItemProvidersAdapterFactory, myEditingDomain.getResourceSet()));
		myTreeViewer.setLabelProvider(new ModelElementsTreeLabelProvider());

		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.heightHint = 300;
		layoutData.widthHint = 300;
		Tree result = myTreeViewer.getTree();
		result.setLayout(new GridLayout());
		result.setLayoutData(layoutData);
		return result;
	}

	public URI getSelectedModelElementURI() {
		return mySelectedModelElementURI;
	}

	public void dispose() {
		for (Resource resource : myEditingDomain.getResourceSet().getResources()) {
			resource.unload();
		}
		myEditingDomain.dispose();
	}

	private TreePath getTreePath(Object element) {
		if (element == null) {
			return null;
		}
		if (false == element instanceof EObject) {
			return new TreePath(new Object[] { element });
		}
		List<Object> segments = buildPathSegments((EObject) element);
		Collections.reverse(segments);
		TreePath path = new TreePath(segments.toArray(new Object[segments.size()]));
		return path;
	}

	private List<Object> buildPathSegments(EObject element) {
		List<Object> segments = new ArrayList<Object>();
		EObject container = element;
		while (container != null) {
			segments.add(container);
			container = container.eContainer();
		}
		if (isInCurrentResource(element)) {
			segments.add(myRoot.getCurrentResourceRoot());
			segments.add(myRoot);
			return segments;
		}
		if (inInLoadedResource(element)) {
			segments.add(element.eResource());
			segments.add(myRoot.getLoadedResourcesRoot());
			segments.add(myRoot);
			return segments;
		}
		Path path = new Path(element.eResource().getURI().toFileString());
		IResource resource = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		while(resource != null) {
			segments.add(resource);
			resource = resource.getParent();
		}
		segments.add(myRoot.getWorkspaceRoot());
		segments.add(myRoot);
		return segments;
	}

	private boolean inInLoadedResource(EObject element) {
		return mySourceObject.eResource().getResourceSet().getResources().contains(element.eResource());
	}

	private boolean isInCurrentResource(EObject element) {
		return mySourceObject.eResource().equals(element.eResource());
	}

	private static class ModelElementsTreeContentProvider implements ITreeContentProvider {

		private static final Object[] NOTHING = new Object[0];

		private static final ITreeContentProvider myWorkbenchContentProvider = new WorkbenchContentProvider();

		private final AdapterFactoryContentProvider myAdapterFctoryContentProvier;

		private final ResourceSet myResourceSet;

		public ModelElementsTreeContentProvider(AdapterFactory itemProvidersAdapterFactory, ResourceSet resourceSet) {
			myAdapterFctoryContentProvier = new AdapterFactoryContentProvider(itemProvidersAdapterFactory);
			myResourceSet = resourceSet;
		}

		public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof TreeRoot) {
				parentElement = ((TreeRoot) parentElement).getObject();
			}
			Object[] result = myWorkbenchContentProvider.getChildren(parentElement);
			if (result != null && result.length > 0) {
				return result;
			}
			if (parentElement instanceof ResourceSet) {
				EList<Resource> resources = ((ResourceSet) parentElement).getResources();
				return resources.toArray(new Resource[resources.size()]);
			}
			if (parentElement instanceof IFile) {
				IFile modelFile = (IFile) parentElement;
				IPath resourcePath = modelFile.getFullPath();
				try {
					Resource modelResource = myResourceSet.getResource(URI.createPlatformResourceURI(resourcePath.toString(), true), true);
					return myAdapterFctoryContentProvier.getChildren(modelResource);
				} catch (WrappedException e) {
					e.printStackTrace();
					//
				}
				return NOTHING;
			}
			return myAdapterFctoryContentProvier.getChildren(parentElement);
		}

		public Object getParent(Object element) {
			Object parent = myWorkbenchContentProvider.getParent(element);
			if (parent != null) {
				return parent;
			}
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
			if (element instanceof TreeRoot) {
				element = ((TreeRoot) element).getObject();
			}
			if (element instanceof IFile) {
				return isValidModelFile((IFile) element);
			}
			return myWorkbenchContentProvider.hasChildren(element) || myAdapterFctoryContentProvier.hasChildren(element);
		}

		private boolean isValidModelFile(IFile file) {
			String fileExtension = file.getFullPath().getFileExtension();
			return "uml".equals(fileExtension); //$NON-NLS-1$
		}

		public Object[] getElements(Object inputElement) {
			MainRoot root = (MainRoot) inputElement;
			return new Object[] { root.getCurrentResourceRoot(), root.getLoadedResourcesRoot(), root.getWorkspaceRoot() };
		}

		public void dispose() {
			myAdapterFctoryContentProvier.dispose();
			myWorkbenchContentProvider.dispose();
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			myWorkbenchContentProvider.inputChanged(viewer, oldInput, newInput);
			myAdapterFctoryContentProvier.inputChanged(viewer, oldInput, newInput);
		}

	}

	private interface TreeRoot {

		Object getObject();

		String getLabel();

	}

	class MainRoot implements TreeRoot {

		private EObject object;

		private TreeRoot myCurrentResourceRoot;

		private TreeRoot myLoadedResourcesRoot;

		private TreeRoot myWorkspaceRoot;

		MainRoot(EObject object) {
			this.object = object;
		}

		public EObject getObject() {
			return object;
		}

		public String getLabel() {
			return null;
		}

		public TreeRoot getCurrentResourceRoot() {
			if (myCurrentResourceRoot == null) {
				myCurrentResourceRoot = new CurrentResource(object);
			}
			return myCurrentResourceRoot;
		}

		public TreeRoot getLoadedResourcesRoot() {
			if (myLoadedResourcesRoot == null) {
				myLoadedResourcesRoot = new LoadedResources(object);
			}
			return myLoadedResourcesRoot;
		}

		public TreeRoot getWorkspaceRoot() {
			if (myWorkspaceRoot == null) {
				myWorkspaceRoot = new Workspace(object);
			}
			return myWorkspaceRoot;
		}

		private class CurrentResource implements TreeRoot {

			private Resource object;

			CurrentResource(EObject object) {
				this.object = object.eResource();
			}

			public Object getObject() {
				return object;
			}

			public String getLabel() {
				return "Current resource";
			}
		}

		private class LoadedResources implements TreeRoot {

			private ResourceSet object;

			LoadedResources(EObject object) {
				this.object = object.eResource().getResourceSet();
			}

			public Object getObject() {
				return object;
			}

			public String getLabel() {
				return "Loaded resources";
			}
		}

		private class Workspace implements TreeRoot {

			private IWorkspaceRoot object;

			Workspace(EObject object) {
				this.object = ResourcesPlugin.getWorkspace().getRoot();
			}

			public Object getObject() {
				return object;
			}

			public String getLabel() {
				return "Workspace";
			}

		}
	}

	private class ModelElementsTreeLabelProvider implements ILabelProvider {

		private WorkbenchLabelProvider myWorkbenchLabelProvider = new WorkbenchLabelProvider();

		private AdapterFactoryLabelProvider myAdapterFactoryLabelProvider = new AdapterFactoryLabelProvider(myItemProvidersAdapterFactory);

		public Image getImage(Object element) {
			if (element instanceof TreeRoot) {
				element = ((TreeRoot) element).getObject();
			}
			Image result = myWorkbenchLabelProvider.getImage(element);
			return result != null ? result : myAdapterFactoryLabelProvider.getImage(element);
		}

		public String getText(Object element) {
			if (element instanceof TreeRoot) {
				return ((TreeRoot) element).getLabel();
			}
			String result = myWorkbenchLabelProvider.getText(element);
			return result != null && result.length() > 0 ? result : myAdapterFactoryLabelProvider.getText(element);
		}

		public void addListener(ILabelProviderListener listener) {
			myWorkbenchLabelProvider.addListener(listener);
			myAdapterFactoryLabelProvider.addListener(listener);
		}

		public void dispose() {
			myWorkbenchLabelProvider.dispose();
			myAdapterFactoryLabelProvider.dispose();
		}

		public boolean isLabelProperty(Object element, String property) {
			return myWorkbenchLabelProvider.isLabelProperty(element, property) || myAdapterFactoryLabelProvider.isLabelProperty(element, property);
		}

		public void removeListener(ILabelProviderListener listener) {
			myWorkbenchLabelProvider.removeListener(listener);
			myAdapterFactoryLabelProvider.removeListener(listener);
		}

	}

	public void addSelectionListener(ISelectionChangedListener l) {
		myTreeViewer.addSelectionChangedListener(l);
	}

	public void addDoubleClickListener(IDoubleClickListener l) {
		myTreeViewer.addDoubleClickListener(l);
	}

}
