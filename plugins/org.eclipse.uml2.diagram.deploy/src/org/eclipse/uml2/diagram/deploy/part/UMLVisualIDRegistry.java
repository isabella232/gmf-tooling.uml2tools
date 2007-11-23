package org.eclipse.uml2.diagram.deploy.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.deploy.edit.parts.Artifact2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.Artifact3EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactFileName2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactFileNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.CommunicationPathEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.CommunicationPathNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentSpecificationEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentSpecificationNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentSpecificationPropertiesEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.Device2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceDevicecontents2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceDevicecontentsEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceName2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironment2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentArtifacts2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentArtifactsEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentName2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ManifestationEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ManifestationNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.Node2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.NodeEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.NodeName2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.NodeNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.PackageImportsEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.PackageNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.deploy.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.deploy.expressions.UMLOCLFactory;
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
	private static final String DEBUG_KEY = UMLDiagramEditorPlugin.getInstance().getBundle().getSymbolicName() + "/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Node_2004_Constraint = UMLOCLFactory.getExpression("not oclIsKindOf(uml::Device) and not oclIsKindOf(uml::ExecutionEnvironment)", UMLPackage.eINSTANCE
			.getNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Artifact_2006_Constraint = UMLOCLFactory.getExpression("not oclIsKindOf(uml::DeploymentSpecification)", UMLPackage.eINSTANCE.getArtifact());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Artifact_3002_Constraint = UMLOCLFactory.getExpression("not oclIsKindOf(uml::DeploymentSpecification)", UMLPackage.eINSTANCE.getArtifact());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Node_3007_Constraint = UMLOCLFactory.getExpression("not oclIsKindOf(uml::Device) and not oclIsKindOf(uml::ExecutionEnvironment)", UMLPackage.eINSTANCE
			.getNode());

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
		return String.valueOf(visualID);
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
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
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
		case PackageImportsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getElementImport().isSuperTypeOf(domainElement.eClass())) {
				return ElementImportEditPart.VISUAL_ID;
			}
			break;
		case DeviceDevicecontentsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
				return Device2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass()) && evaluate(Artifact_3002_Constraint, domainElement)) {
				return ArtifactEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
				return ExecutionEnvironment2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass()) && evaluate(Node_3007_Constraint, domainElement)) {
				return Node2EditPart.VISUAL_ID;
			}
			break;
		case DeviceDevicecontents2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
				return Device2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass()) && evaluate(Artifact_3002_Constraint, domainElement)) {
				return ArtifactEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
				return ExecutionEnvironment2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass()) && evaluate(Node_3007_Constraint, domainElement)) {
				return Node2EditPart.VISUAL_ID;
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
		case DeploymentSpecificationPropertiesEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return PropertyEditPart.VISUAL_ID;
			}
			break;
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
			if (UMLPackage.eINSTANCE.getNode().isSuperTypeOf(domainElement.eClass()) && evaluate(Node_2004_Constraint, domainElement)) {
				return NodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getExecutionEnvironment().isSuperTypeOf(domainElement.eClass())) {
				return ExecutionEnvironmentEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElement.eClass()) && evaluate(Artifact_2006_Constraint, domainElement)) {
				return Artifact2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDeploymentSpecification().isSuperTypeOf(domainElement.eClass())) {
				return DeploymentSpecificationEditPart.VISUAL_ID;
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
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
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
		case Package2EditPart.VISUAL_ID:
			if (PackageNameEditPart.VISUAL_ID == nodeVisualID) {
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
			if (DeviceDevicecontentsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NodeEditPart.VISUAL_ID:
			if (NodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExecutionEnvironmentEditPart.VISUAL_ID:
			if (ExecutionEnvironmentNameEditPart.VISUAL_ID == nodeVisualID) {
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
			break;
		case DeploymentSpecificationEditPart.VISUAL_ID:
			if (DeploymentSpecificationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeploymentSpecificationPropertiesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Device2EditPart.VISUAL_ID:
			if (DeviceName2EditPart.VISUAL_ID == nodeVisualID) {
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
			break;
		case ExecutionEnvironment2EditPart.VISUAL_ID:
			if (ExecutionEnvironmentName2EditPart.VISUAL_ID == nodeVisualID) {
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
		case DeploymentSpecificationPropertiesEditPart.VISUAL_ID:
			if (PropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
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
	private static boolean evaluate(UMLAbstractExpression expression, Object element) {
		Object result = expression.evaluate(element);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	protected static boolean hasViewChild(View containerView, EObject domainElement, int visualId) {
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

}
