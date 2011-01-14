package org.eclipse.uml2.diagram.component.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.conventions.AssociationEndConvention;
import org.eclipse.uml2.diagram.common.conventions.ConnectorEndConvention;
import org.eclipse.uml2.diagram.common.genapi.IDiagramUpdater;
import org.eclipse.uml2.diagram.common.links.PortOperationsExt;
import org.eclipse.uml2.diagram.common.links.ProvidedInterfaceLink;
import org.eclipse.uml2.diagram.component.edit.parts.Artifact2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Artifact3EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactContents2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactContents3EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactContentsEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.AssemblyConnectorCircleEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.AssemblyConnectorEndRoleEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.AssociationEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Class3EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Class4EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassAttributesEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassClassesEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassDiagramNotationClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassDiagramNotationInnerClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassDiagramNotationOperationEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassDiagramNotationPropertyEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassOperationsEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.CommentAnnotatedElementEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.CommentEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Component2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Component3EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentContents2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentContentsEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentRequiredEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ConnectorEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Interface3EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceAttributesEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceClassesEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceOperationsEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.OperationEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Package3EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Package4EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PackageClassifiersEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PackageImportsEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PackagePackagesEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortOnClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortProvidedEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortRequiredEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Property2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.component.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Usage;

/**
 * @generated
 */
public class UMLDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getSemanticChildren(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID: {
			//We have "dummy" TopLevelNode (with vid = org.eclipse.uml2.diagram.component.edit.parts.Package2EditPart.VISUAL_ID). 
			//The only purpose for this node is to be a container for children (imports, etc)
			//of the "main" diagram figure (that one shown as Canvas).
			//Also we have modified the VisualIDRegistry#getNodeVisualID() to return
			//VID = org.eclipse.uml2.diagram.component.edit.parts.Package2EditPart.VISUAL_ID, 
			//for the case when top-level view is created for the same semantic element as the canvas view.

			LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> resultAndHeader = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
			resultAndHeader.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(view.getElement(), Package2EditPart.VISUAL_ID));
			resultAndHeader.addAll(getPackage_1000SemanticChildren(view));
			return resultAndHeader;
		}
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2001SemanticChildren(view);
		case Class2EditPart.VISUAL_ID:
			return getClass_2004SemanticChildren(view);
		case ClassDiagramNotationClassEditPart.VISUAL_ID:
			return getClass_2007SemanticChildren(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_3001SemanticChildren(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_3004SemanticChildren(view);
		case ComponentContentsEditPart.VISUAL_ID:
			return getComponentComponentFigure_contents_7001SemanticChildren(view);
		case ComponentContents2EditPart.VISUAL_ID:
			return getComponentComponentFigure_contents_7002SemanticChildren(view);
		case ArtifactContentsEditPart.VISUAL_ID:
			return getArtifactArtifactFigure_contents_7009SemanticChildren(view);
		case ArtifactContents2EditPart.VISUAL_ID:
			return getArtifactArtifactFigure_contents_7010SemanticChildren(view);
		case ArtifactContents3EditPart.VISUAL_ID:
			return getArtifactArtifactFigure_contents_7011SemanticChildren(view);
		case PackageImportsEditPart.VISUAL_ID:
			return getPackageImports_7003SemanticChildren(view);
		case PackagePackagesEditPart.VISUAL_ID:
			return getPackagePackages_7004SemanticChildren(view);
		case PackageClassifiersEditPart.VISUAL_ID:
			return getPackageClassifiers_7005SemanticChildren(view);
		case ClassAttributesEditPart.VISUAL_ID:
			return getClassAttributes_7006SemanticChildren(view);
		case ClassOperationsEditPart.VISUAL_ID:
			return getClassOperations_7007SemanticChildren(view);
		case ClassClassesEditPart.VISUAL_ID:
			return getClassClasses_7008SemanticChildren(view);
		case InterfaceAttributesEditPart.VISUAL_ID:
			return getInterfaceAttributes_7012SemanticChildren(view);
		case InterfaceOperationsEditPart.VISUAL_ID:
			return getInterfaceOperations_7013SemanticChildren(view);
		case InterfaceClassesEditPart.VISUAL_ID:
			return getInterfaceClasses_7014SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getComponent_2001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getClass_2004SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Class modelElement = (Class) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getClass_2007SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Class modelElement = (Class) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortOnClassEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getComponent_3001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getClass_3004SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Class modelElement = (Class) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getComponentComponentFigure_contents_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) containerView.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPackagedElements().iterator(); it.hasNext();) {
			PackageableElement childElement = (PackageableElement) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Component2EditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ArtifactEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InterfaceEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOwnedAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PropertyEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOwnedConnectors().iterator(); it.hasNext();) {
			Connector childElement = (Connector) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AssemblyConnectorCircleEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getComponentComponentFigure_contents_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) containerView.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPackagedElements().iterator(); it.hasNext();) {
			PackageableElement childElement = (PackageableElement) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Component2EditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ArtifactEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InterfaceEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOwnedAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PropertyEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOwnedConnectors().iterator(); it.hasNext();) {
			Connector childElement = (Connector) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AssemblyConnectorCircleEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getArtifactArtifactFigure_contents_7009SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Artifact modelElement = (Artifact) containerView.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNestedArtifacts().iterator(); it.hasNext();) {
			Artifact childElement = (Artifact) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Artifact3EditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getArtifactArtifactFigure_contents_7010SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Artifact modelElement = (Artifact) containerView.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNestedArtifacts().iterator(); it.hasNext();) {
			Artifact childElement = (Artifact) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Artifact3EditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getArtifactArtifactFigure_contents_7011SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Artifact modelElement = (Artifact) containerView.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNestedArtifacts().iterator(); it.hasNext();) {
			Artifact childElement = (Artifact) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Artifact3EditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getPackageImports_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) containerView.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElementImports().iterator(); it.hasNext();) {
			ElementImport childElement = (ElementImport) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ElementImportEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getPackagePackages_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) containerView.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNestedPackages().iterator(); it.hasNext();) {
			Package childElement = (Package) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Package4EditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getPackageClassifiers_7005SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) containerView.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedTypes().iterator(); it.hasNext();) {
			Type childElement = (Type) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Class3EditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Component3EditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getClassAttributes_7006SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Class modelElement = (Class) containerView.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ClassDiagramNotationPropertyEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getClassOperations_7007SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Class modelElement = (Class) containerView.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedOperations().iterator(); it.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ClassDiagramNotationOperationEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getClassClasses_7008SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Class modelElement = (Class) containerView.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNestedClassifiers().iterator(); it.hasNext();) {
			Classifier childElement = (Classifier) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ClassDiagramNotationInnerClassEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getInterfaceAttributes_7012SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Interface modelElement = (Interface) containerView.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Property2EditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getInterfaceOperations_7013SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Interface modelElement = (Interface) containerView.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedOperations().iterator(); it.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getInterfaceClasses_7014SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Interface modelElement = (Interface) containerView.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNestedClassifiers().iterator(); it.hasNext();) {
			Classifier childElement = (Classifier) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Class4EditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> getPackage_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedTypes().iterator(); it.hasNext();) {
			Type childElement = (Type) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ComponentEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Artifact2EditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Interface2EditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Class2EditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClassDiagramNotationClassEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Interface3EditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPackagedElements().iterator(); it.hasNext();) {
			PackageableElement childElement = (PackageableElement) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
		}
		for (Iterator<?> it = modelElement.getNestedPackages().iterator(); it.hasNext();) {
			Package childElement = (Package) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Package3EditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOwnedComments().iterator(); it.hasNext();) {
			Comment childElement = (Comment) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CommentEditPart.VISUAL_ID) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getContainedLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000ContainedLinks(view);
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2001ContainedLinks(view);
		case Artifact2EditPart.VISUAL_ID:
			return getArtifact_2002ContainedLinks(view);
		case Interface2EditPart.VISUAL_ID:
			return getInterface_2003ContainedLinks(view);
		case Class2EditPart.VISUAL_ID:
			return getClass_2004ContainedLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_2005ContainedLinks(view);
		case Package3EditPart.VISUAL_ID:
			return getPackage_2006ContainedLinks(view);
		case ClassDiagramNotationClassEditPart.VISUAL_ID:
			return getClass_2007ContainedLinks(view);
		case CommentEditPart.VISUAL_ID:
			return getComment_2008ContainedLinks(view);
		case Interface3EditPart.VISUAL_ID:
			return getInterface_2009ContainedLinks(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_3001ContainedLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3002ContainedLinks(view);
		case ArtifactEditPart.VISUAL_ID:
			return getArtifact_3003ContainedLinks(view);
		case Artifact3EditPart.VISUAL_ID:
			return getArtifact_3016ContainedLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_3004ContainedLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_3005ContainedLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3006ContainedLinks(view);
		case AssemblyConnectorCircleEditPart.VISUAL_ID:
			return getConnector_3015ContainedLinks(view);
		case ElementImportEditPart.VISUAL_ID:
			return getElementImport_3007ContainedLinks(view);
		case Package4EditPart.VISUAL_ID:
			return getPackage_3008ContainedLinks(view);
		case Class3EditPart.VISUAL_ID:
			return getClass_3009ContainedLinks(view);
		case Component3EditPart.VISUAL_ID:
			return getComponent_3010ContainedLinks(view);
		case ClassDiagramNotationPropertyEditPart.VISUAL_ID:
			return getProperty_3011ContainedLinks(view);
		case ClassDiagramNotationOperationEditPart.VISUAL_ID:
			return getOperation_3012ContainedLinks(view);
		case ClassDiagramNotationInnerClassEditPart.VISUAL_ID:
			return getClass_3013ContainedLinks(view);
		case PortOnClassEditPart.VISUAL_ID:
			return getPort_3014ContainedLinks(view);
		case Property2EditPart.VISUAL_ID:
			return getProperty_3017ContainedLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3018ContainedLinks(view);
		case Class4EditPart.VISUAL_ID:
			return getClass_3020ContainedLinks(view);
		case InterfaceRealizationEditPart.VISUAL_ID:
			return getInterfaceRealization_4001ContainedLinks(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_4008ContainedLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4009ContainedLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4011ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getIncomingLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2001IncomingLinks(view);
		case Artifact2EditPart.VISUAL_ID:
			return getArtifact_2002IncomingLinks(view);
		case Interface2EditPart.VISUAL_ID:
			return getInterface_2003IncomingLinks(view);
		case Class2EditPart.VISUAL_ID:
			return getClass_2004IncomingLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_2005IncomingLinks(view);
		case Package3EditPart.VISUAL_ID:
			return getPackage_2006IncomingLinks(view);
		case ClassDiagramNotationClassEditPart.VISUAL_ID:
			return getClass_2007IncomingLinks(view);
		case CommentEditPart.VISUAL_ID:
			return getComment_2008IncomingLinks(view);
		case Interface3EditPart.VISUAL_ID:
			return getInterface_2009IncomingLinks(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_3001IncomingLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3002IncomingLinks(view);
		case ArtifactEditPart.VISUAL_ID:
			return getArtifact_3003IncomingLinks(view);
		case Artifact3EditPart.VISUAL_ID:
			return getArtifact_3016IncomingLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_3004IncomingLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_3005IncomingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3006IncomingLinks(view);
		case AssemblyConnectorCircleEditPart.VISUAL_ID:
			return getConnector_3015IncomingLinks(view);
		case ElementImportEditPart.VISUAL_ID:
			return getElementImport_3007IncomingLinks(view);
		case Package4EditPart.VISUAL_ID:
			return getPackage_3008IncomingLinks(view);
		case Class3EditPart.VISUAL_ID:
			return getClass_3009IncomingLinks(view);
		case Component3EditPart.VISUAL_ID:
			return getComponent_3010IncomingLinks(view);
		case ClassDiagramNotationPropertyEditPart.VISUAL_ID:
			return getProperty_3011IncomingLinks(view);
		case ClassDiagramNotationOperationEditPart.VISUAL_ID:
			return getOperation_3012IncomingLinks(view);
		case ClassDiagramNotationInnerClassEditPart.VISUAL_ID:
			return getClass_3013IncomingLinks(view);
		case PortOnClassEditPart.VISUAL_ID:
			return getPort_3014IncomingLinks(view);
		case Property2EditPart.VISUAL_ID:
			return getProperty_3017IncomingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3018IncomingLinks(view);
		case Class4EditPart.VISUAL_ID:
			return getClass_3020IncomingLinks(view);
		case InterfaceRealizationEditPart.VISUAL_ID:
			return getInterfaceRealization_4001IncomingLinks(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_4008IncomingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4009IncomingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4011IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getOutgoingLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2001OutgoingLinks(view);
		case Artifact2EditPart.VISUAL_ID:
			return getArtifact_2002OutgoingLinks(view);
		case Interface2EditPart.VISUAL_ID:
			return getInterface_2003OutgoingLinks(view);
		case Class2EditPart.VISUAL_ID:
			return getClass_2004OutgoingLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_2005OutgoingLinks(view);
		case Package3EditPart.VISUAL_ID:
			return getPackage_2006OutgoingLinks(view);
		case ClassDiagramNotationClassEditPart.VISUAL_ID:
			return getClass_2007OutgoingLinks(view);
		case CommentEditPart.VISUAL_ID:
			return getComment_2008OutgoingLinks(view);
		case Interface3EditPart.VISUAL_ID:
			return getInterface_2009OutgoingLinks(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_3001OutgoingLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3002OutgoingLinks(view);
		case ArtifactEditPart.VISUAL_ID:
			return getArtifact_3003OutgoingLinks(view);
		case Artifact3EditPart.VISUAL_ID:
			return getArtifact_3016OutgoingLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_3004OutgoingLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_3005OutgoingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3006OutgoingLinks(view);
		case AssemblyConnectorCircleEditPart.VISUAL_ID:
			return getConnector_3015OutgoingLinks(view);
		case ElementImportEditPart.VISUAL_ID:
			return getElementImport_3007OutgoingLinks(view);
		case Package4EditPart.VISUAL_ID:
			return getPackage_3008OutgoingLinks(view);
		case Class3EditPart.VISUAL_ID:
			return getClass_3009OutgoingLinks(view);
		case Component3EditPart.VISUAL_ID:
			return getComponent_3010OutgoingLinks(view);
		case ClassDiagramNotationPropertyEditPart.VISUAL_ID:
			return getProperty_3011OutgoingLinks(view);
		case ClassDiagramNotationOperationEditPart.VISUAL_ID:
			return getOperation_3012OutgoingLinks(view);
		case ClassDiagramNotationInnerClassEditPart.VISUAL_ID:
			return getClass_3013OutgoingLinks(view);
		case PortOnClassEditPart.VISUAL_ID:
			return getPort_3014OutgoingLinks(view);
		case Property2EditPart.VISUAL_ID:
			return getProperty_3017OutgoingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3018OutgoingLinks(view);
		case Class4EditPart.VISUAL_ID:
			return getClass_3020OutgoingLinks(view);
		case InterfaceRealizationEditPart.VISUAL_ID:
			return getInterfaceRealization_4001OutgoingLinks(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_4008OutgoingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4009OutgoingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4011OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getPackage_1000ContainedLinks(View view) {
		Package modelElement = (Package) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Dependency_4009(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getComponent_2001ContainedLinks(View view) {
		Component modelElement = (Component) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InterfaceRealization_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Component_Required_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Connector_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getArtifact_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated NOT
	 */
	public static List<UMLLinkDescriptor> getInterface_2003ContainedLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		List<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getInterface_2003ContainedLinksGen(view));
		result.addAll(getContainedTypeModelFacetLinks_InterfaceRealization_4001_ForAllClassifiers(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Usage_4007_ForAllClassifiers(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getInterface_2003ContainedLinksGen(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated NOT
	 */
	public static List<UMLLinkDescriptor> getClass_2004ContainedLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getClass_2004ContainedLinksGen(view));
		result.addAll(getOutgoingFeatureModelFacetLinks_Usage_4007_ForAllClassifiers(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getClass_2004ContainedLinksGen(View view) {
		Class modelElement = (Class) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InterfaceRealization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Connector_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getPackage_2005ContainedLinks(View view) {
		//no links to, from and inside the diagram header
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getPackage_2006ContainedLinks(View view) {
		Package modelElement = (Package) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Dependency_4009(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_4011(modelElement));
		return result;
	}

	/**
	 * @generated NOT
	 */
	public static List<UMLLinkDescriptor> getClass_2007ContainedLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getClass_2007ContainedLinksGen(view));
		result.addAll(getOutgoingFeatureModelFacetLinks_Usage_4007_ForAllClassifiers(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getClass_2007ContainedLinksGen(View view) {
		Class modelElement = (Class) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InterfaceRealization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Connector_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getComment_2008ContainedLinks(View view) {
		Comment modelElement = (Comment) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement));
		return result;
	}

	/**
	 * @generated NOT
	 */
	public static List<UMLLinkDescriptor> getInterface_2009ContainedLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		List<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getInterface_2009ContainedLinksGen(view));
		result.addAll(getContainedTypeModelFacetLinks_InterfaceRealization_4001_ForAllClassifiers(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Usage_4007_ForAllClassifiers(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getInterface_2009ContainedLinksGen(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getComponent_3001ContainedLinks(View view) {
		Component modelElement = (Component) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InterfaceRealization_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Component_Required_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Connector_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getPort_3002ContainedLinks(View view) {
		Port modelElement = (Port) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Port_Provided_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Port_Required_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getArtifact_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getArtifact_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated NOT
	 */
	public static List<UMLLinkDescriptor> getClass_3004ContainedLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getClass_3004ContainedLinksGen(view));
		result.addAll(getOutgoingFeatureModelFacetLinks_Usage_4007_ForAllClassifiers(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getClass_3004ContainedLinksGen(View view) {
		Class modelElement = (Class) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InterfaceRealization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Connector_4008(modelElement));
		return result;
	}

	/**
	 * @generated NOT
	 */
	public static List<UMLLinkDescriptor> getInterface_3005ContainedLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		List<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getInterface_3005ContainedLinksGen(view));
		result.addAll(getContainedTypeModelFacetLinks_InterfaceRealization_4001_ForAllClassifiers(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Usage_4007_ForAllClassifiers(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getInterface_3005ContainedLinksGen(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getProperty_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getConnector_3015ContainedLinksGen(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated NOT
	 */
	public static List<UMLLinkDescriptor> getConnector_3015ContainedLinks(View view) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getConnector_3015ContainedLinksGen(view));

		Connector connector = (Connector) view.getElement();
		for (ConnectorEnd nextEnd : connector.getEnds()) {
			ConnectableElement diagramLinkEnd = nextEnd.getRole();
			result.add(new UMLLinkDescriptor(connector, diagramLinkEnd, UMLElementTypes.ConnectorEndRole_4010, AssemblyConnectorEndRoleEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getElementImport_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getPackage_3008ContainedLinks(View view) {
		Package modelElement = (Package) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Dependency_4009(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_4011(modelElement));
		return result;
	}

	/**
	 * @generated NOT
	 */
	public static List<UMLLinkDescriptor> getClass_3009ContainedLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getClass_3009ContainedLinksGen(view));
		result.addAll(getOutgoingFeatureModelFacetLinks_Usage_4007_ForAllClassifiers(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getClass_3009ContainedLinksGen(View view) {
		Class modelElement = (Class) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InterfaceRealization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Connector_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getComponent_3010ContainedLinks(View view) {
		Component modelElement = (Component) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InterfaceRealization_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Component_Required_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Connector_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getProperty_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getOperation_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated NOT
	 */
	public static List<UMLLinkDescriptor> getClass_3013ContainedLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getClass_3013ContainedLinksGen(view));
		result.addAll(getOutgoingFeatureModelFacetLinks_Usage_4007_ForAllClassifiers(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getClass_3013ContainedLinksGen(View view) {
		Class modelElement = (Class) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InterfaceRealization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Connector_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getPort_3014ContainedLinks(View view) {
		Port modelElement = (Port) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Port_Provided_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Port_Required_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getProperty_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getOperation_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated NOT
	 */
	public static List<UMLLinkDescriptor> getClass_3020ContainedLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getClass_3020ContainedLinksGen(view));
		result.addAll(getOutgoingFeatureModelFacetLinks_Usage_4007_ForAllClassifiers(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getClass_3020ContainedLinksGen(View view) {
		Class modelElement = (Class) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InterfaceRealization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Connector_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getInterfaceRealization_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getConnector_4008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getDependency_4009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getAssociation_4011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getComponent_2001IncomingLinks(View view) {
		Component modelElement = (Component) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4011(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getArtifact_2002IncomingLinks(View view) {
		Artifact modelElement = (Artifact) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4011(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getInterface_2003IncomingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterfaceRealization_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Port_Provided_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Port_Required_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Component_Required_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4011(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getClass_2004IncomingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4011(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getPackage_2005IncomingLinks(View view) {
		//no links to, from and inside the diagram header
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getPackage_2006IncomingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getClass_2007IncomingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4011(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getComment_2008IncomingLinks(View view) {
		Comment modelElement = (Comment) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getInterface_2009IncomingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterfaceRealization_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Port_Provided_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Port_Required_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Component_Required_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4011(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getComponent_3001IncomingLinks(View view) {
		Component modelElement = (Component) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4011(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getPort_3002IncomingLinks(View view) {
		Port modelElement = (Port) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connector_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ConnectorEnd_Role_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getArtifact_3003IncomingLinks(View view) {
		Artifact modelElement = (Artifact) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4011(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getArtifact_3016IncomingLinks(View view) {
		Artifact modelElement = (Artifact) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4011(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getClass_3004IncomingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4011(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getInterface_3005IncomingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterfaceRealization_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Port_Provided_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Port_Required_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Component_Required_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4011(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getProperty_3006IncomingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connector_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ConnectorEnd_Role_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getConnector_3015IncomingLinks(View view) {
		Connector modelElement = (Connector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getElementImport_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getPackage_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getClass_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getComponent_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getProperty_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getOperation_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getClass_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getPort_3014IncomingLinks(View view) {
		Port modelElement = (Port) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connector_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ConnectorEnd_Role_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getProperty_3017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getOperation_3018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getClass_3020IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getInterfaceRealization_4001IncomingLinks(View view) {
		InterfaceRealization modelElement = (InterfaceRealization) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getConnector_4008IncomingLinks(View view) {
		Connector modelElement = (Connector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getDependency_4009IncomingLinks(View view) {
		Dependency modelElement = (Dependency) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getAssociation_4011IncomingLinks(View view) {
		Association modelElement = (Association) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4009(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4011(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getComponent_2001OutgoingLinks(View view) {
		Component modelElement = (Component) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterfaceRealization_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Component_Required_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getArtifact_2002OutgoingLinks(View view) {
		Artifact modelElement = (Artifact) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getInterface_2003OutgoingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getClass_2004OutgoingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterfaceRealization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getPackage_2005OutgoingLinks(View view) {
		//no links to, from and inside the diagram header
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getPackage_2006OutgoingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getClass_2007OutgoingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterfaceRealization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getComment_2008OutgoingLinks(View view) {
		Comment modelElement = (Comment) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getInterface_2009OutgoingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getComponent_3001OutgoingLinks(View view) {
		Component modelElement = (Component) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterfaceRealization_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Component_Required_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getPort_3002OutgoingLinks(View view) {
		Port modelElement = (Port) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Port_Provided_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Port_Required_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connector_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getArtifact_3003OutgoingLinks(View view) {
		Artifact modelElement = (Artifact) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getArtifact_3016OutgoingLinks(View view) {
		Artifact modelElement = (Artifact) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getClass_3004OutgoingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterfaceRealization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getInterface_3005OutgoingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getProperty_3006OutgoingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connector_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getConnector_3015OutgoingLinks(View view) {
		Connector modelElement = (Connector) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getElementImport_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getPackage_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getClass_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getComponent_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getProperty_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getOperation_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getClass_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getPort_3014OutgoingLinks(View view) {
		Port modelElement = (Port) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Port_Provided_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Port_Required_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Connector_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getProperty_3017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getOperation_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getClass_3020OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getInterfaceRealization_4001OutgoingLinks(View view) {
		InterfaceRealization modelElement = (InterfaceRealization) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getConnector_4008OutgoingLinks(View view) {
		Connector modelElement = (Connector) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getDependency_4009OutgoingLinks(View view) {
		Dependency modelElement = (Dependency) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getAssociation_4011OutgoingLinks(View view) {
		Association modelElement = (Association) view.getElement();
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4011(modelElement));
		return result;
	}

	/**
	 * @generated NOT
	 */
	private static Collection<UMLLinkDescriptor> getContainedTypeModelFacetLinks_InterfaceRealization_4001(BehavioredClassifier container) {
		return getContainedTypeModelFacetLinks_InterfaceRealization_4001_ForAllClassifiers(container);
	}

	/**
	 * @generated NOT
	 */
	private static Collection<UMLLinkDescriptor> getContainedTypeModelFacetLinks_InterfaceRealization_4001_ForAllClassifiers(Classifier container) {
		Collection<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();

		for (Relationship linkObject : container.getRelationships(UMLPackage.eINSTANCE.getInterfaceRealization())) {
			if (false == linkObject instanceof InterfaceRealization) {
				continue;
			}
			InterfaceRealization link = (InterfaceRealization) linkObject;
			if (InterfaceRealizationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}

			EList<NamedElement> targets = link.getSuppliers();
			if (targets.size() != 1) {
				continue;
			}
			if (link.getClients().contains(container)) {
				result.add(new UMLLinkDescriptor(container, targets.get(0), link, UMLElementTypes.InterfaceRealization_4001, InterfaceRealizationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	private static Collection<UMLLinkDescriptor> getContainedTypeModelFacetLinks_Connector_4008(StructuredClassifier container) {
		Collection<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		StructuredClassifier sc = (StructuredClassifier) container;
		for (Connector link : sc.getOwnedConnectors()) {
			if (ConnectorEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ConnectorEnd sourceEnd = ConnectorEndConvention.getSourceEnd(link);
			ConnectorEnd targetEnd = ConnectorEndConvention.getTargetEnd(link);
			if (sourceEnd == null || targetEnd == null) {
				continue;
			}

			ConnectableElement dst = targetEnd.getRole();
			ConnectableElement src = sourceEnd.getRole();
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Connector_4008, ConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getContainedTypeModelFacetLinks_Dependency_4009(Package container) {
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		for (Iterator<?> links = container.getPackagedElements().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) linkObject;
			if (DependencyEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getSuppliers();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof NamedElement) {
				continue;
			}
			NamedElement dst = (NamedElement) theTarget;
			List sources = link.getClients();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof NamedElement) {
				continue;
			}
			NamedElement src = (NamedElement) theSource;
			result.add(new org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor(src, dst, link, UMLElementTypes.Dependency_4009, DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	private static Collection<UMLLinkDescriptor> getContainedTypeModelFacetLinks_Association_4011(Package container) {
		Collection<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (PackageableElement linkObject : container.getPackagedElements()) {
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association association = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(association)) {
				continue;
			}
			if (association.isBinary()) {
				Property sourceEnd = AssociationEndConvention.getSourceEnd(association);
				Property targetEnd = AssociationEndConvention.getTargetEnd(association);
				EObject gmfSource = sourceEnd.getType();
				EObject gmfTarget = targetEnd.getType();
				result.add(new UMLLinkDescriptor(gmfSource, gmfTarget, association, UMLElementTypes.Association_4011, AssociationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getIncomingTypeModelFacetLinks_InterfaceRealization_4001(Interface target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getInterfaceRealization_Contract() || false == setting.getEObject() instanceof InterfaceRealization) {
				continue;
			}
			InterfaceRealization link = (InterfaceRealization) setting.getEObject();
			if (InterfaceRealizationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			BehavioredClassifier src = link.getImplementingClassifier();
			result.add(new org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor(src, target, link, UMLElementTypes.InterfaceRealization_4001, InterfaceRealizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getIncomingFeatureModelFacetLinks_Port_Provided_4006(Interface target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == UMLPackage.eINSTANCE.getPort_Provided()) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor(setting.getEObject(), target, UMLElementTypes.PortProvided_4006, PortProvidedEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getIncomingFeatureModelFacetLinks_Port_Required_4004(Interface target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == UMLPackage.eINSTANCE.getPort_Required()) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor(setting.getEObject(), target, UMLElementTypes.PortRequired_4004, PortRequiredEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getIncomingFeatureModelFacetLinks_Component_Required_4007(Interface target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == UMLPackage.eINSTANCE.getComponent_Required()) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor(setting.getEObject(), target, UMLElementTypes.ComponentRequired_4007, ComponentRequiredEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * XXX: this method is not called by GMF yet (as for 2.0 release). The
	 * default generated version is not compiliable.
	 * 
	 * @generated NOT
	 */
	private static Collection<UMLLinkDescriptor> getIncomingTypeModelFacetLinks_Connector_4008(ConnectableElement target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getIncomingTypeModelFacetLinks_Dependency_4009(NamedElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getDependency_Supplier() || false == setting.getEObject() instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) setting.getEObject();
			if (DependencyEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getClients();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof NamedElement) {
				continue;
			}
			NamedElement src = (NamedElement) theSource;
			result.add(new org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor(src, target, link, UMLElementTypes.Dependency_4009, DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getIncomingFeatureModelFacetLinks_ConnectorEnd_Role_4010(ConnectableElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == UMLPackage.eINSTANCE.getConnectorEnd_Role()) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor(setting.getEObject(), target, UMLElementTypes.ConnectorEndRole_4010,
						AssemblyConnectorEndRoleEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	private static Collection<UMLLinkDescriptor> getIncomingTypeModelFacetLinks_Association_4011(Type target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		return findRelatedAssociations(target, false);
	}

	/**
	 * @generated
	 */
	private static Collection<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(Element target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == UMLPackage.eINSTANCE.getComment_AnnotatedElement()) {
				result.add(new org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor(setting.getEObject(), target, UMLElementTypes.CommentAnnotatedElement_4012,
						CommentAnnotatedElementEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getOutgoingTypeModelFacetLinks_InterfaceRealization_4001(BehavioredClassifier source) {
		BehavioredClassifier container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof BehavioredClassifier) {
				container = (BehavioredClassifier) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		for (Iterator<?> links = container.getInterfaceRealizations().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InterfaceRealization) {
				continue;
			}
			InterfaceRealization link = (InterfaceRealization) linkObject;
			if (InterfaceRealizationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Interface dst = link.getContract();
			BehavioredClassifier src = link.getImplementingClassifier();
			if (src != source) {
				continue;
			}
			result.add(new org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor(src, dst, link, UMLElementTypes.InterfaceRealization_4001, InterfaceRealizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	private static Collection<UMLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Port_Provided_4006(Port source) {
		Collection<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		Collection<UMLLinkDescriptor> generatedLinks = getOutgoingFeatureModelFacetLinks_Port_Provided_4006Gen(source);
		result.addAll(generatedLinks);

		Collection<ProvidedInterfaceLink> provideds = PortOperationsExt.getProvideds(source);
		for (ProvidedInterfaceLink provided : provideds) {
			boolean alreadyAdded = false;
			for (UMLLinkDescriptor linkDescriptor : generatedLinks) {
				if (linkDescriptor.getDestination() == provided.getTarget()) {
					alreadyAdded = true;
					break;
				}
			}
			if (!alreadyAdded) {
				result.add(new UMLLinkDescriptor(source, provided.getTarget(), UMLElementTypes.PortProvided_4006, PortProvidedEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Port_Provided_4006Gen(Port source) {
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		for (Iterator<?> destinations = source.getProvideds().iterator(); destinations.hasNext();) {
			Interface destination = (Interface) destinations.next();
			result.add(new org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor(source, destination, UMLElementTypes.PortProvided_4006, PortProvidedEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Port_Required_4004(Port source) {
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		for (Iterator<?> destinations = source.getRequireds().iterator(); destinations.hasNext();) {
			Interface destination = (Interface) destinations.next();
			result.add(new org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor(source, destination, UMLElementTypes.PortRequired_4004, PortRequiredEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	private static Collection<UMLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Component_Required_4007(Component source) {
		return getOutgoingFeatureModelFacetLinks_Usage_4007_ForAllClassifiers(source);
	}

	/**
	 * @generated NOT
	 */
	private static Collection<UMLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Usage_4007_ForAllClassifiers(Classifier classifier) {
		Collection<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();

		for (Relationship linkObject : classifier.getRelationships(UMLPackage.eINSTANCE.getUsage())) {
			if (false == linkObject instanceof Usage) {
				continue;
			}
			Usage link = (Usage) linkObject;

			if (link.getClients().contains(classifier)) {
				for (NamedElement supplier : link.getSuppliers()) {
					if (supplier instanceof Interface) {
						result.add(new UMLLinkDescriptor(classifier, supplier, UMLElementTypes.ComponentRequired_4007, ComponentRequiredEditPart.VISUAL_ID));
					}
				}
			}
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	private static Collection<UMLLinkDescriptor> getOutgoingTypeModelFacetLinks_Connector_4008(ConnectableElement source) {
		StructuredClassifier container = null;
		Element current = source.getOwner();
		while (current != null && container == null) {
			if (current instanceof StructuredClassifier) {
				container = (StructuredClassifier) current;
			}
			current = current.getOwner();
		}
		if (container == null) {
			return Collections.emptyList();
		}
		Collection<UMLLinkDescriptor> allConnectors = getContainedTypeModelFacetLinks_Connector_4008(container);
		List<UMLLinkDescriptor> outgoing = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> it = allConnectors.iterator(); it.hasNext();) {
			UMLLinkDescriptor next = (UMLLinkDescriptor) it.next();
			if (source.equals(next.getSource())) {
				outgoing.add(next);
			}
		}
		return outgoing;
	}

	/**
	 * @generated
	 */
	private static Collection<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getOutgoingTypeModelFacetLinks_Dependency_4009(NamedElement source) {
		Package container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Package) {
				container = (Package) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		for (Iterator<?> links = container.getPackagedElements().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) linkObject;
			if (DependencyEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getSuppliers();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof NamedElement) {
				continue;
			}
			NamedElement dst = (NamedElement) theTarget;
			List sources = link.getClients();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof NamedElement) {
				continue;
			}
			NamedElement src = (NamedElement) theSource;
			if (src != source) {
				continue;
			}
			result.add(new org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor(src, dst, link, UMLElementTypes.Dependency_4009, DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	private static Collection<UMLLinkDescriptor> getOutgoingTypeModelFacetLinks_Association_4011(Type source) {
		return findRelatedAssociations(source, true);
	}

	/**
	 * @generated
	 */
	private static Collection<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Comment_AnnotatedElement_4012(Comment source) {
		LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor> result = new LinkedList<org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor>();
		for (Iterator<?> destinations = source.getAnnotatedElements().iterator(); destinations.hasNext();) {
			Element destination = (Element) destinations.next();
			result.add(new org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor(source, destination, UMLElementTypes.CommentAnnotatedElement_4012, CommentAnnotatedElementEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @NOT-GENERATED
	 */
	private static Collection<UMLLinkDescriptor> findRelatedAssociations(Type type, boolean sourceNotTarget) {
		Package container = type.getNearestPackage();
		if (container == null) {
			return Collections.emptyList();
		}

		List<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (PackageableElement next : container.getPackagedElements()) {
			if (false == next instanceof Association) {
				continue;
			}
			if (AssociationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(next)) {
				continue;
			}
			Association link = (Association) next;
			Property sourceEnd = AssociationEndConvention.getSourceEnd(link);
			Property targetEnd = AssociationEndConvention.getTargetEnd(link);

			if (sourceEnd == null || targetEnd == null) {
				continue;
			}

			Property subjectEnd = sourceNotTarget ? sourceEnd : targetEnd;
			if (!type.equals(subjectEnd.getType())) {
				continue;
			}

			EObject gmfSource = sourceEnd.getType();
			EObject gmfTarget = targetEnd.getType();
			result.add(new UMLLinkDescriptor(gmfSource, gmfTarget, link, UMLElementTypes.Association_4011, AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final IDiagramUpdater TYPED_ADAPTER = new IDiagramUpdater() {

		/**
		* @generated
		*/
		public List<UMLNodeDescriptor> getSemanticChildren(View view) {
			return org.eclipse.uml2.diagram.component.part.UMLDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		public List<UMLLinkDescriptor> getContainedLinks(View view) {
			return org.eclipse.uml2.diagram.component.part.UMLDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		public List<UMLLinkDescriptor> getIncomingLinks(View view) {
			return org.eclipse.uml2.diagram.component.part.UMLDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		public List<UMLLinkDescriptor> getOutgoingLinks(View view) {
			return org.eclipse.uml2.diagram.component.part.UMLDiagramUpdater.getOutgoingLinks(view);
		}
	};
}
