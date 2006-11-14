package org.eclipse.uml2.diagram.component.part;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import java.io.ByteArrayInputStream;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IResourceStatus;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.xmi.XMIResource;

import org.eclipse.emf.edit.ui.util.EditUIUtil;

import org.eclipse.jface.dialogs.ErrorDialog;

import org.eclipse.ui.ide.IDE;

import org.eclipse.uml2.diagram.component.edit.parts.PackageEditPart;

import org.eclipse.uml2.uml.UMLFactory;

/**
 * @generated
 */
public class UMLDiagramEditorUtil {

	/**
	 * @generated
	 */
	public static boolean openDiagram(Resource diagram) throws PartInitException {
		return EditUIUtil.openEditor((EObject) diagram.getContents().get(0));
	}

	/**
	 * @generated
	 */
	private static void setCharset(IPath path) {
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		try {
			file.setCharset("UTF-8", new NullProgressMonitor()); //$NON-NLS-1$
		} catch (CoreException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Unable to set charset for file " + path, e); //$NON-NLS-1$
		}
	}

	/**
	 * <p>
	 * This method should be called within a workspace modify operation since it creates resources.
	 * </p>
	 * @generated
	 * @return the created resource, or <code>null</code> if the resource was not created
	 */
	public static final Resource createDiagram(IPath containerFullPath, String fileNameParameter, IProgressMonitor progressMonitor) {
		final String fileName = fileNameParameter;
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		progressMonitor.beginTask("Creating diagram and model files", 3); //$NON-NLS-1$
		IPath diagramPath = containerFullPath.append(fileName);
		final Resource diagramResource = editingDomain.getResourceSet().createResource(URI.createPlatformResourceURI(diagramPath.toString()));
		IPath modelPath = diagramPath.removeFileExtension().addFileExtension("uml"); //$NON-NLS-1$
		final Resource modelResource = editingDomain.getResourceSet().createResource(URI.createPlatformResourceURI(modelPath.toString()));
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(editingDomain, "Creating diagram and model", Collections.EMPTY_LIST) { //$NON-NLS-1$

			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				org.eclipse.uml2.uml.Package model = createInitialModel();
				modelResource.getContents().add(createInitialRoot(model));
				Diagram diagram = ViewService.createDiagram(model, PackageEditPart.MODEL_ID, UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				if (diagram != null) {
					diagramResource.getContents().add(diagram);
					diagram.setName(fileName);
					diagram.setElement(model);
				}
				try {
					Map options = new HashMap();
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
			OperationHistoryFactory.getOperationHistory().execute(command, new SubProgressMonitor(progressMonitor, 1), null);
		} catch (ExecutionException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Unable to create model and diagram", e); //$NON-NLS-1$
		}

		setCharset(modelPath);
		setCharset(diagramPath);
		return diagramResource;
	}

	/**
	 * Create a new instance of domain element associated with canvas.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static org.eclipse.uml2.uml.Package createInitialModel() {
		return UMLFactory.eINSTANCE.createPackage();
	}

	/**
	 * @generated
	 */
	private static EObject createInitialRoot(org.eclipse.uml2.uml.Package model) {
		return model;
	}
}
