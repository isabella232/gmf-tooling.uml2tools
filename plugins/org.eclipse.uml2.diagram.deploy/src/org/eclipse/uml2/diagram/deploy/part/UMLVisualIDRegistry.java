package org.eclipse.uml2.diagram.deploy.part;

import java.util.List;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.genapi.IVisualIDRegistry;
import org.eclipse.uml2.diagram.common.genapi.IVisualIDRegistryExt;
import org.eclipse.uml2.diagram.deploy.edit.parts.Artifact2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.Artifact3EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.Artifact4EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactArtifactFigure_contents2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactArtifactFigure_contents3EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactArtifactFigure_contentsEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactFileName2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactFileName3EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactFileNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactStereo2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactStereo3EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactStereoEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.CommentBodyEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.CommentEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.CommunicationPathEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.CommunicationPathNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DependencyName2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DependencyNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentSpecification2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentSpecificationEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentSpecificationName2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentSpecificationNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentSpecificationProperties2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentSpecificationPropertiesEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentSpecificationStereo3EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentSpecificationStereo4EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.Device2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceDevicecontents2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceDevicecontentsEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceName2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceStereo2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceStereoEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironment2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentArtifacts2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentArtifactsEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentName2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentStereo2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentStereoEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ManifestationEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ManifestationNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.Node2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.NodeEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.NodeName2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.NodeNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.NodeStereo2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.NodeStereoEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.PackageImportsEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.PackageNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.PackageStereo2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.deploy.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.deploy.expressions.UMLOCLFactory;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class UMLVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.eclipse.uml2.diagram.deploy/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PackageEditPart.MODEL_ID.equals(view.getType())) {
				return PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.eclipse.uml2.diagram.deploy.part.UMLVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				UMLDiagramEditorPlugin.getInstance().logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElement.eClass()) && isDiagram((Package) domainElement)) {
			return PackageEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.eclipse.uml2.diagram.deploy.part.UMLVisualIDRegistry.getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID) && !"uml".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.uml2.diagram.deploy.part.UMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case PackageEditPart.VISUAL_ID:
			// We want to additionally show the Canvas Semantical Element in the auxiliary 
			// org.eclipse.uml2.diagram.deploy.edit.parts.Package2EditPart (that serves as a pure visual container for children). 
			// To do this, we modified CanonicalEditPolicy to add the Canvas semantic Element into the children 
			// list. The only remaining part is to return correct VID for this special case.

			if (containerView instanceof Diagram && domainElement != null && domainElement.equals(containerView.getElement())) {
				return Package2EditPart.VISUAL_ID;
			}
			// Diagram header is already processed above
			if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
				return DeviceEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass()) && isNode_2004((Node) domainElement)) {
				return NodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
				return ExecutionEnvironmentEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass()) && isArtifact_2006((Artifact) domainElement)) {
				return Artifact2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
				return DeploymentSpecificationEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
				return CommentEditPart.VISUAL_ID;
			}
			break;
		case PackageImportsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getElementImport().isSuperTypeOf(domainElement.eClass())) {
				return ElementImportEditPart.VISUAL_ID;
			}
			break;
		case DeviceDevicecontentsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
				return Device2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass()) && isArtifact_3002((Artifact) domainElement)) {
				return ArtifactEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
				return ExecutionEnvironment2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass()) && isNode_3007((Node) domainElement)) {
				return Node2EditPart.VISUAL_ID;
			}
			break;
		case DeviceDevicecontents2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
				return Device2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass()) && isArtifact_3002((Artifact) domainElement)) {
				return ArtifactEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
				return ExecutionEnvironment2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass()) && isNode_3007((Node) domainElement)) {
				return Node2EditPart.VISUAL_ID;
			}
			break;
		case ArtifactArtifactFigure_contentsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass()) && isArtifact_3008((Artifact) domainElement)) {
				return Artifact4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
				return DeploymentSpecification2EditPart.VISUAL_ID;
			}
			break;
		case ArtifactArtifactFigure_contents2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass()) && isArtifact_3008((Artifact) domainElement)) {
				return Artifact4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
				return DeploymentSpecification2EditPart.VISUAL_ID;
			}
			break;
		case DeploymentSpecificationProperties2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return PropertyEditPart.VISUAL_ID;
			}
			break;
		case ExecutionEnvironmentArtifacts2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
				return Artifact3EditPart.VISUAL_ID;
			}
			break;
		case ExecutionEnvironmentArtifactsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
				return Artifact3EditPart.VISUAL_ID;
			}
			break;
		case ArtifactArtifactFigure_contents3EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass()) && isArtifact_3008((Artifact) domainElement)) {
				return Artifact4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
				return DeploymentSpecification2EditPart.VISUAL_ID;
			}
			break;
		case DeploymentSpecificationPropertiesEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return PropertyEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.eclipse.uml2.diagram.deploy.part.UMLVisualIDRegistry.getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID) && !"uml".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.uml2.diagram.deploy.part.UMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PackageEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case PackageEditPart.VISUAL_ID:
			if (Package2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeviceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExecutionEnvironmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Artifact2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeploymentSpecificationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Package2EditPart.VISUAL_ID:
			if (PackageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageStereo2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageImportsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeviceEditPart.VISUAL_ID:
			if (DeviceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeviceStereoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeviceDevicecontentsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NodeEditPart.VISUAL_ID:
			if (NodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeStereoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExecutionEnvironmentEditPart.VISUAL_ID:
			if (ExecutionEnvironmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExecutionEnvironmentStereoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExecutionEnvironmentArtifactsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Artifact2EditPart.VISUAL_ID:
			if (ArtifactFileNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArtifactStereoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArtifactArtifactFigure_contents3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeploymentSpecificationEditPart.VISUAL_ID:
			if (DeploymentSpecificationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeploymentSpecificationStereo3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeploymentSpecificationPropertiesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommentEditPart.VISUAL_ID:
			if (CommentBodyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Device2EditPart.VISUAL_ID:
			if (DeviceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeviceStereo2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeviceDevicecontents2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArtifactEditPart.VISUAL_ID:
			if (ArtifactFileName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArtifactStereo2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArtifactArtifactFigure_contentsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Artifact4EditPart.VISUAL_ID:
			if (ArtifactFileName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArtifactStereo3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArtifactArtifactFigure_contents2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeploymentSpecification2EditPart.VISUAL_ID:
			if (DeploymentSpecificationName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeploymentSpecificationStereo4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeploymentSpecificationProperties2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExecutionEnvironment2EditPart.VISUAL_ID:
			if (ExecutionEnvironmentName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExecutionEnvironmentStereo2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExecutionEnvironmentArtifacts2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Node2EditPart.VISUAL_ID:
			if (NodeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeStereo2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageImportsEditPart.VISUAL_ID:
			if (ElementImportEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeviceDevicecontentsEditPart.VISUAL_ID:
			if (Device2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArtifactEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExecutionEnvironment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Node2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeviceDevicecontents2EditPart.VISUAL_ID:
			if (Device2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArtifactEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExecutionEnvironment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Node2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArtifactArtifactFigure_contentsEditPart.VISUAL_ID:
			if (Artifact4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeploymentSpecification2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArtifactArtifactFigure_contents2EditPart.VISUAL_ID:
			if (Artifact4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeploymentSpecification2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeploymentSpecificationProperties2EditPart.VISUAL_ID:
			if (PropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExecutionEnvironmentArtifacts2EditPart.VISUAL_ID:
			if (Artifact3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExecutionEnvironmentArtifactsEditPart.VISUAL_ID:
			if (Artifact3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArtifactArtifactFigure_contents3EditPart.VISUAL_ID:
			if (Artifact4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeploymentSpecification2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeploymentSpecificationPropertiesEditPart.VISUAL_ID:
			if (PropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeploymentEditPart.VISUAL_ID:
			if (DeploymentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ManifestationEditPart.VISUAL_ID:
			if (ManifestationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommunicationPathEditPart.VISUAL_ID:
			if (CommunicationPathNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DependencyEditPart.VISUAL_ID:
			if (DependencyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DependencyName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (UMLPackage.eINSTANCE.getDeployment().isSuperTypeOf(domainElement.eClass())) {
			return DeploymentEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getManifestation().isSuperTypeOf(domainElement.eClass())) {
			return ManifestationEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getCommunicationPath().isSuperTypeOf(domainElement.eClass())) {
			return CommunicationPathEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getDependency().isSuperTypeOf(domainElement.eClass()) && isDependency_4005((Dependency) domainElement)) {
			return DependencyEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Package element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isNode_2004(Node domainElement) {
		Object result = UMLOCLFactory.getExpression(7, UMLPackage.eINSTANCE.getNode(), null).evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isArtifact_2006(Artifact domainElement) {
		Object result = UMLOCLFactory.getExpression(1, UMLPackage.eINSTANCE.getArtifact(), null).evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isArtifact_3002(Artifact domainElement) {
		Object result = UMLOCLFactory.getExpression(1, UMLPackage.eINSTANCE.getArtifact(), null).evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isArtifact_3008(Artifact domainElement) {
		Object result = UMLOCLFactory.getExpression(1, UMLPackage.eINSTANCE.getArtifact(), null).evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isNode_3007(Node domainElement) {
		Object result = UMLOCLFactory.getExpression(7, UMLPackage.eINSTANCE.getNode(), null).evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isDependency_4005(Dependency domainElement) {
		Object result = UMLOCLFactory.getExpression(11, UMLPackage.eINSTANCE.getDependency(), null).evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	protected static boolean hasViewChild(View containerView, EObject domainElement, int visualId) {
		if (containerView == null) {
			return false;
		}
		if (domainElement == null) {
			return false;
		}
		for (Object next : containerView.getChildren()) {
			View nextView = (View) next;
			if (domainElement.equals(nextView.getElement()) && getType(visualId).equals(nextView.getType())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getChildDescriptorVisualID(UMLNodeDescriptor container, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		switch (container.getVisualID()) {
		case PackageEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
				return DeviceEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass()) && isNode_2004((Node) domainElement)) {
				return NodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
				return ExecutionEnvironmentEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass()) && isArtifact_2006((Artifact) domainElement)) {
				return Artifact2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
				return DeploymentSpecificationEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getComment().isSuperTypeOf(domainElement.eClass())) {
				return CommentEditPart.VISUAL_ID;
			}
			break;
		case Package2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getElementImport().isSuperTypeOf(domainElement.eClass())) {
				return ElementImportEditPart.VISUAL_ID;
			}
			break;
		case DeviceEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
				return Device2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass()) && isArtifact_3002((Artifact) domainElement)) {
				return ArtifactEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
				return ExecutionEnvironment2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass()) && isNode_3007((Node) domainElement)) {
				return Node2EditPart.VISUAL_ID;
			}
			break;
		case ExecutionEnvironmentEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
				return Artifact3EditPart.VISUAL_ID;
			}
			break;
		case Artifact2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass()) && isArtifact_3008((Artifact) domainElement)) {
				return Artifact4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
				return DeploymentSpecification2EditPart.VISUAL_ID;
			}
			break;
		case DeploymentSpecificationEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return PropertyEditPart.VISUAL_ID;
			}
			break;
		case Device2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
				return Device2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass()) && isArtifact_3002((Artifact) domainElement)) {
				return ArtifactEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
				return ExecutionEnvironment2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass()) && isNode_3007((Node) domainElement)) {
				return Node2EditPart.VISUAL_ID;
			}
			break;
		case ArtifactEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass()) && isArtifact_3008((Artifact) domainElement)) {
				return Artifact4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
				return DeploymentSpecification2EditPart.VISUAL_ID;
			}
			break;
		case Artifact4EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass()) && isArtifact_3008((Artifact) domainElement)) {
				return Artifact4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
				return DeploymentSpecification2EditPart.VISUAL_ID;
			}
			break;
		case DeploymentSpecification2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return PropertyEditPart.VISUAL_ID;
			}
			break;
		case ExecutionEnvironment2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass())) {
				return Artifact3EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	protected static boolean canSubstitute(int visualId, int substituteCandidate) {
		if (visualId == substituteCandidate) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate || canSubstitute(basic, candidate);
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case PackageImportsEditPart.VISUAL_ID:
		case DeviceDevicecontentsEditPart.VISUAL_ID:
		case DeviceDevicecontents2EditPart.VISUAL_ID:
		case ArtifactArtifactFigure_contentsEditPart.VISUAL_ID:
		case ArtifactArtifactFigure_contents2EditPart.VISUAL_ID:
		case DeploymentSpecificationProperties2EditPart.VISUAL_ID:
		case ExecutionEnvironmentArtifacts2EditPart.VISUAL_ID:
		case ExecutionEnvironmentArtifactsEditPart.VISUAL_ID:
		case ArtifactArtifactFigure_contents3EditPart.VISUAL_ID:
		case DeploymentSpecificationPropertiesEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case NodeEditPart.VISUAL_ID:
		case CommentEditPart.VISUAL_ID:
		case ElementImportEditPart.VISUAL_ID:
		case PropertyEditPart.VISUAL_ID:
		case Artifact3EditPart.VISUAL_ID:
		case Node2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final IVisualIDRegistry TYPED_ADAPTER = new IVisualIDRegistryExt() {

		/**
		 * @generated
		 */
		public String getModelID(View view) {
			return org.eclipse.uml2.diagram.deploy.part.UMLVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		public int getVisualID(View view) {
			return org.eclipse.uml2.diagram.deploy.part.UMLVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.eclipse.uml2.diagram.deploy.part.UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return org.eclipse.uml2.diagram.deploy.part.UMLVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		public boolean isCompartmentVisualID(int visualID) {
			return org.eclipse.uml2.diagram.deploy.part.UMLVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		public boolean isSemanticLeafVisualID(int visualID) {
			return org.eclipse.uml2.diagram.deploy.part.UMLVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}

		/**
		 * @generated
		 */
		public boolean isShortcutDescendant(View view) {
			return org.eclipse.uml2.diagram.deploy.part.UMLVisualIDRegistry.isShortcutDescendant(view);
		}

		/**
		 * @generated
		 */
		private VisualIDRegistryExtension myExtension = new VisualIDRegistryExtension();

		/**
		 * @generated
		 */
		public List<String> getAllHintedTypes() {
			return myExtension.getAllHintedTypes();
		}

		/**
		 * @generated
		 */
		public List<IVisualIDRegistryExt.MenuTypeHint> getMenuTypeHints(String type) {
			return myExtension.getMenuTypeHints(type);
		}

		/**
		 * @generated
		 */
		public String getSemanticHint(View childView, View newParentView) {
			return myExtension.getSemanticHint(childView, newParentView);
		}

	};

	/**
	 * @generated
	 */
	public static boolean isShortcutDescendant(View view) {
		View diagram = view.getDiagram();
		while (view != diagram && view != null) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return true;
			}
			view = (View) view.eContainer();
		}
		return false;
	}

}
