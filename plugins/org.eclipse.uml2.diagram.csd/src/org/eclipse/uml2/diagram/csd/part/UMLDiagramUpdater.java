package org.eclipse.uml2.diagram.csd.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.csd.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Class3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassAttributesEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassClass_contentsEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassClassesEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassOperationsEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationContentsEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationUse2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConnectorEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.OperationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ParameterEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Property2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Property3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.csd.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Collaboration;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case CollaborationEditPart.VISUAL_ID:
			return getCollaboration_2005SemanticChildren(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_2006SemanticChildren(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_2003SemanticChildren(view);
		case CollaborationContentsEditPart.VISUAL_ID:
			return getCollaborationContents_7003SemanticChildren(view);
		case ClassAttributesEditPart.VISUAL_ID:
			return getClassAttributes_7004SemanticChildren(view);
		case ClassOperationsEditPart.VISUAL_ID:
			return getClassOperations_7005SemanticChildren(view);
		case ClassClassesEditPart.VISUAL_ID:
			return getClassClasses_7006SemanticChildren(view);
		case ClassClass_contentsEditPart.VISUAL_ID:
			return getClassClass_contents_7007SemanticChildren(view);
		case PackageEditPart.VISUAL_ID: {
			//We have "dummy" TopLevelNode (with vid = org.eclipse.uml2.diagram.csd.edit.parts.Package2EditPart.VISUAL_ID). 
			//The only purpose for this node is to be a container for children (imports, etc)
			//of the "main" diagram figure (that one shown as Canvas).
			//Also we have modified the VisualIDRegistry#getNodeVisualID() to return
			//VID = org.eclipse.uml2.diagram.csd.edit.parts.Package2EditPart.VISUAL_ID, 
			//for the case when top-level view is created for the same semantic element as the canvas view.

			List resultAndHeader = new LinkedList();
			resultAndHeader.add(new UMLNodeDescriptor(view.getElement(), Package2EditPart.VISUAL_ID));
			resultAndHeader.addAll(getPackage_1000SemanticChildren(view));
			return resultAndHeader;
		}
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCollaboration_2005SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Collaboration modelElement = (Collaboration) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getCollaborationRoles().iterator(); it.hasNext();) {
			ConnectableElement childElement = (ConnectableElement) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_2006SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOwnedAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_2003SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getElementImports().iterator(); it.hasNext();) {
			ElementImport childElement = (ElementImport) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ElementImportEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCollaborationContents_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Collaboration modelElement = (Collaboration) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getCollaborationUses().iterator(); it.hasNext();) {
			CollaborationUse childElement = (CollaborationUse) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CollaborationUse2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getCollaborationRoles().iterator(); it.hasNext();) {
			ConnectableElement childElement = (ConnectableElement) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PropertyEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassAttributes_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Class modelElement = (Class) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOwnedAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Property2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassOperations_7005SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Class modelElement = (Class) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOwnedOperations().iterator(); it.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassClasses_7006SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Class modelElement = (Class) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getNestedClassifiers().iterator(); it.hasNext();) {
			Classifier childElement = (Classifier) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Class2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassClass_contents_7007SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Class modelElement = (Class) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOwnedAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Property3EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getPackagedElements().iterator(); it.hasNext();) {
			PackageableElement childElement = (PackageableElement) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CollaborationEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Package2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getOwnedTypes().iterator(); it.hasNext();) {
			Type childElement = (Type) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ClassEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Class3EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000ContainedLinks(view);
		case CollaborationEditPart.VISUAL_ID:
			return getCollaboration_2005ContainedLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_2006ContainedLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_2003ContainedLinks(view);
		case Class3EditPart.VISUAL_ID:
			return getClass_2007ContainedLinks(view);
		case CollaborationUse2EditPart.VISUAL_ID:
			return getCollaborationUse_3002ContainedLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3007ContainedLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3013ContainedLinks(view);
		case Property2EditPart.VISUAL_ID:
			return getProperty_3008ContainedLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3009ContainedLinks(view);
		case Class2EditPart.VISUAL_ID:
			return getClass_3010ContainedLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3011ContainedLinks(view);
		case ElementImportEditPart.VISUAL_ID:
			return getElementImport_3004ContainedLinks(view);
		case Property3EditPart.VISUAL_ID:
			return getProperty_3014ContainedLinks(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_4005ContainedLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4006ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case CollaborationEditPart.VISUAL_ID:
			return getCollaboration_2005IncomingLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_2006IncomingLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_2003IncomingLinks(view);
		case Class3EditPart.VISUAL_ID:
			return getClass_2007IncomingLinks(view);
		case CollaborationUse2EditPart.VISUAL_ID:
			return getCollaborationUse_3002IncomingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3007IncomingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3013IncomingLinks(view);
		case Property2EditPart.VISUAL_ID:
			return getProperty_3008IncomingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3009IncomingLinks(view);
		case Class2EditPart.VISUAL_ID:
			return getClass_3010IncomingLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3011IncomingLinks(view);
		case ElementImportEditPart.VISUAL_ID:
			return getElementImport_3004IncomingLinks(view);
		case Property3EditPart.VISUAL_ID:
			return getProperty_3014IncomingLinks(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_4005IncomingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4006IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case CollaborationEditPart.VISUAL_ID:
			return getCollaboration_2005OutgoingLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_2006OutgoingLinks(view);
		case Package2EditPart.VISUAL_ID:
			return getPackage_2003OutgoingLinks(view);
		case Class3EditPart.VISUAL_ID:
			return getClass_2007OutgoingLinks(view);
		case CollaborationUse2EditPart.VISUAL_ID:
			return getCollaborationUse_3002OutgoingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3007OutgoingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3013OutgoingLinks(view);
		case Property2EditPart.VISUAL_ID:
			return getProperty_3008OutgoingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3009OutgoingLinks(view);
		case Class2EditPart.VISUAL_ID:
			return getClass_3010OutgoingLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3011OutgoingLinks(view);
		case ElementImportEditPart.VISUAL_ID:
			return getElementImport_3004OutgoingLinks(view);
		case Property3EditPart.VISUAL_ID:
			return getProperty_3014OutgoingLinks(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_4005OutgoingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4006OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPackage_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCollaboration_2005ContainedLinks(View view) {
		Collaboration modelElement = (Collaboration) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Connector_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_2006ContainedLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Connector_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_2003ContainedLinks(View view) {
		//no links to, from and inside the diagram header
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClass_2007ContainedLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Connector_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCollaborationUse_3002ContainedLinks(View view) {
		CollaborationUse modelElement = (CollaborationUse) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getParameter_3013ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClass_3010ContainedLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Connector_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPort_3011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getElementImport_3004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3014ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConnector_4005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDependency_4006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCollaboration_2005IncomingLinks(View view) {
		Collaboration modelElement = (Collaboration) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_2006IncomingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_2003IncomingLinks(View view) {
		//no links to, from and inside the diagram header
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClass_2007IncomingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCollaborationUse_3002IncomingLinks(View view) {
		CollaborationUse modelElement = (CollaborationUse) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3007IncomingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Connector_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getParameter_3013IncomingLinks(View view) {
		Parameter modelElement = (Parameter) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Connector_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3008IncomingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Connector_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3009IncomingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_3010IncomingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPort_3011IncomingLinks(View view) {
		Port modelElement = (Port) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Connector_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getElementImport_3004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3014IncomingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Connector_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConnector_4005IncomingLinks(View view) {
		Connector modelElement = (Connector) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependency_4006IncomingLinks(View view) {
		Dependency modelElement = (Dependency) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCollaboration_2005OutgoingLinks(View view) {
		Collaboration modelElement = (Collaboration) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_2006OutgoingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_2003OutgoingLinks(View view) {
		//no links to, from and inside the diagram header
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClass_2007OutgoingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCollaborationUse_3002OutgoingLinks(View view) {
		CollaborationUse modelElement = (CollaborationUse) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3007OutgoingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Connector_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getParameter_3013OutgoingLinks(View view) {
		Parameter modelElement = (Parameter) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Connector_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3008OutgoingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Connector_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3009OutgoingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_3010OutgoingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPort_3011OutgoingLinks(View view) {
		Port modelElement = (Port) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Connector_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getElementImport_3004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3014OutgoingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Connector_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConnector_4005OutgoingLinks(View view) {
		Connector modelElement = (Connector) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependency_4006OutgoingLinks(View view) {
		Dependency modelElement = (Dependency) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated NOT 
	 */
	private static Collection getContainedTypeModelFacetLinks_Connector_4005(StructuredClassifier container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getOwnedConnectors().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Connector) {
				continue;
			}
			Connector link = (Connector) linkObject;
			if (ConnectorEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ConnectableElement dst = link.getEnds().get(0).getRole();
			ConnectableElement src = link.getEnds().get(1).getRole();
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Connector_4005, ConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Dependency_4006(CollaborationUse container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getRoleBindings().iterator(); links.hasNext();) {
			Object linkObject = links.next();
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
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Dependency_4006, DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	private static Collection getIncomingTypeModelFacetLinks_Connector_4005(ConnectableElement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getConnectorEnd_Role() || false == setting.getEObject() instanceof Connector) {
				continue;
			}
			Connector link = (Connector) setting.getEObject();
			if (ConnectorEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ConnectableElement src = link.getEnds().get(0).getRole();
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.Connector_4005, ConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Dependency_4006(NamedElement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
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
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.Dependency_4006, DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Connector_4005(ConnectableElement source) {
		StructuredClassifier container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof StructuredClassifier) {
				container = (StructuredClassifier) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getOwnedConnectors().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Connector) {
				continue;
			}
			Connector link = (Connector) linkObject;
			if (ConnectorEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ConnectableElement dst = link.getEnds().get(0).getRole();
			ConnectableElement src = link.getEnds().get(1).getRole();
			if (src != source) {
				continue;
			}
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Connector_4005, ConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Dependency_4006(NamedElement source) {
		CollaborationUse container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CollaborationUse) {
				container = (CollaborationUse) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getRoleBindings().iterator(); links.hasNext();) {
			Object linkObject = links.next();
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
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Dependency_4006, DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

}
