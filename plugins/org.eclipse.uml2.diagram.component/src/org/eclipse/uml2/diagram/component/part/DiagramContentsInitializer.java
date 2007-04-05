package org.eclipse.uml2.diagram.component.part;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;

import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.diagram.component.edit.parts.Artifact2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Component2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentContents2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentContentsEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortProvidedEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortRequiredEditPart;

import org.eclipse.uml2.diagram.component.providers.UMLElementTypes;

import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class DiagramContentsInitializer {

	/**
	 * @generated
	 */
	private Collection myLinkDescriptors = new LinkedList();

	/**
	 * @generated
	 */
	private Map myEObject2NodeMap = new HashMap();

	/**
	 * @generated
	 */
	public void initDiagramContents(Diagram diagram, EObject diagramModelObject) {
		createPackage_1000Children(diagram, diagramModelObject);

		createLinks(diagram);
	}

	/**
	 * @generated
	 */
	private void createComponent_2001Children(View viewObject, EObject modelObject) {
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((StructuredClassifier) modelObject).getOwnedAttributes().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (PortEditPart.VISUAL_ID == nodeVID) {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPort_3002Children(nextNode, nextValue);
			}
		}
		Node nextCompartment = getCompartment(viewObject, UMLVisualIDRegistry.getType(ComponentContentsEditPart.VISUAL_ID));
		if (nextCompartment != null) {
			createComponentContents_7001Children(nextCompartment, modelObject);
		}
		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createArtifact_2002Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createInterface_2003Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createClass_2004Children(View viewObject, EObject modelObject) {
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((StructuredClassifier) modelObject).getOwnedAttributes().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (PortEditPart.VISUAL_ID == nodeVID) {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPort_3002Children(nextNode, nextValue);
			}
		}
		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createComponent_3001Children(View viewObject, EObject modelObject) {
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((StructuredClassifier) modelObject).getOwnedAttributes().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (PortEditPart.VISUAL_ID == nodeVID) {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPort_3002Children(nextNode, nextValue);
			}
		}
		Node nextCompartment = getCompartment(viewObject, UMLVisualIDRegistry.getType(ComponentContents2EditPart.VISUAL_ID));
		if (nextCompartment != null) {
			createComponentContents_7002Children(nextCompartment, modelObject);
		}
		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createPort_3002Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createArtifact_3003Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createClass_3004Children(View viewObject, EObject modelObject) {
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((StructuredClassifier) modelObject).getOwnedAttributes().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (PortEditPart.VISUAL_ID == nodeVID) {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPort_3002Children(nextNode, nextValue);
			}
		}
		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createInterface_3005Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createComponentContents_7001Children(View viewObject, EObject modelObject) {
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((Component) modelObject).getPackagedElements().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			switch (nodeVID) {
			case Component2EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Component2EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createComponent_3001Children(nextNode, nextValue);
				break;
			}
			case ArtifactEditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(ArtifactEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createArtifact_3003Children(nextNode, nextValue);
				break;
			}
			case ClassEditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createClass_3004Children(nextNode, nextValue);
				break;
			}
			case InterfaceEditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createInterface_3005Children(nextNode, nextValue);
				break;
			}
			}
		}
	}

	/**
	 * @generated
	 */
	private void createComponentContents_7002Children(View viewObject, EObject modelObject) {
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((Component) modelObject).getPackagedElements().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			switch (nodeVID) {
			case Component2EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Component2EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createComponent_3001Children(nextNode, nextValue);
				break;
			}
			case ArtifactEditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(ArtifactEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createArtifact_3003Children(nextNode, nextValue);
				break;
			}
			case ClassEditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createClass_3004Children(nextNode, nextValue);
				break;
			}
			case InterfaceEditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createInterface_3005Children(nextNode, nextValue);
				break;
			}
			}
		}
	}

	/**
	 * @generated
	 */
	private void createPackage_1000Children(View viewObject, EObject modelObject) {
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((Package) modelObject).getOwnedTypes().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			switch (nodeVID) {
			case ComponentEditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(ComponentEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createComponent_2001Children(nextNode, nextValue);
				break;
			}
			case Artifact2EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Artifact2EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createArtifact_2002Children(nextNode, nextValue);
				break;
			}
			case Interface2EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Interface2EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createInterface_2003Children(nextNode, nextValue);
				break;
			}
			case Class2EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createClass_2004Children(nextNode, nextValue);
				break;
			}
			}
		}
		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private Node getCompartment(View node, String name) {
		for (Iterator it = node.getChildren().iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (nextView instanceof Node && name.equals(nextView.getType())) {
				return (Node) nextView;
			}
		}
		return null;
	}

	/**
	 *@generated
	 */
	private void storeLinks(EObject container, Diagram diagram) {
		EClass containerMetaclass = container.eClass();
		storeFeatureModelFacetLinks(container, containerMetaclass, diagram);
		storeTypeModelFacetLinks(container, containerMetaclass);
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks(EObject container, EClass containerMetaclass) {
		storeTypeModelFacetLinks_InterfaceRealization_4001(container, containerMetaclass);
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_InterfaceRealization_4001(EObject container, EClass containerMetaclass) {
		if (UMLPackage.eINSTANCE.getBehavioredClassifier().isSuperTypeOf(containerMetaclass)) {
			for (Iterator values = ((BehavioredClassifier) container).getInterfaceRealizations().iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = UMLVisualIDRegistry.getLinkWithClassVisualID(nextValue);
				if (InterfaceRealizationEditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((InterfaceRealization) nextValue).getContract();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((InterfaceRealization) nextValue).getImplementingClassifier();
						if (structuralFeatureResult instanceof EObject) {
							EObject src = (EObject) structuralFeatureResult;
							myLinkDescriptors.add(new LinkDescriptor(src, dst, nextValue, UMLElementTypes.InterfaceRealization_4001, linkVID));
						}
					}
				}
			}
		}
	}

	/**
	 *@generated
	 */
	private void storeFeatureModelFacetLinks(EObject container, EClass containerMetaclass, Diagram diagram) {

		if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(containerMetaclass)) {
			for (Iterator destinations = ((Port) container).getProvideds().iterator(); destinations.hasNext();) {
				EObject nextDestination = (EObject) destinations.next();
				myLinkDescriptors.add(new LinkDescriptor(container, nextDestination, UMLElementTypes.PortProvided_4006, PortProvidedEditPart.VISUAL_ID));

			}
		}
		if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(containerMetaclass)) {
			for (Iterator destinations = ((Port) container).getRequireds().iterator(); destinations.hasNext();) {
				EObject nextDestination = (EObject) destinations.next();
				myLinkDescriptors.add(new LinkDescriptor(container, nextDestination, UMLElementTypes.PortRequired_4004, PortRequiredEditPart.VISUAL_ID));

			}
		}
	}

	/**
	 * @generated
	 */
	private void createLinks(Diagram diagram) {
		for (Iterator it = myLinkDescriptors.iterator(); it.hasNext();) {
			LinkDescriptor nextLinkDescriptor = (LinkDescriptor) it.next();
			Edge edge = (Edge) ViewService.getInstance().createEdge(nextLinkDescriptor.getSemanticAdapter(), diagram, String.valueOf(nextLinkDescriptor.getVisualID()), ViewUtil.APPEND,
					UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
			if (edge != null) {
				edge.setSource((Node) myEObject2NodeMap.get(nextLinkDescriptor.getSource()));
				edge.setTarget((Node) myEObject2NodeMap.get(nextLinkDescriptor.getDestination()));
			}
		}
	}

	/**
	 * @generated
	 */
	private class LinkDescriptor {

		/**
		 * @generated
		 */
		private EObject mySource;

		/**
		 * @generated
		 */
		private EObject myDestination;

		/**
		 * @generated
		 */
		private EObject myLinkElement;

		/**
		 * @generated
		 */
		private int myVisualID;

		/**
		 * @generated
		 */
		private IAdaptable mySemanticAdapter;

		/**
		 * @generated
		 */
		protected LinkDescriptor(EObject source, EObject destination, EObject linkElement, IElementType elementType, int linkVID) {
			this(source, destination, linkVID);
			myLinkElement = linkElement;
			final IElementType elementTypeCopy = elementType;
			mySemanticAdapter = new EObjectAdapter(linkElement) {

				public Object getAdapter(Class adapter) {
					if (IElementType.class.equals(adapter)) {
						return elementTypeCopy;
					}
					return super.getAdapter(adapter);
				}
			};
		}

		/**
		 * @generated
		 */
		protected LinkDescriptor(EObject source, EObject destination, IElementType elementType, int linkVID) {
			this(source, destination, linkVID);
			myLinkElement = null;
			final IElementType elementTypeCopy = elementType;
			mySemanticAdapter = new IAdaptable() {

				public Object getAdapter(Class adapter) {
					if (IElementType.class.equals(adapter)) {
						return elementTypeCopy;
					}
					return null;
				}
			};
		}

		/**
		 * @generated
		 */
		private LinkDescriptor(EObject source, EObject destination, int linkVID) {
			mySource = source;
			myDestination = destination;
			myVisualID = linkVID;
		}

		/**
		 * @generated
		 */
		protected EObject getSource() {
			return mySource;
		}

		/**
		 * @generated
		 */
		protected EObject getDestination() {
			return myDestination;
		}

		/**
		 * @generated
		 */
		protected EObject getLinkElement() {
			return myLinkElement;
		}

		/**
		 * @generated
		 */
		protected int getVisualID() {
			return myVisualID;
		}

		/**
		 * @generated
		 */
		protected IAdaptable getSemanticAdapter() {
			return mySemanticAdapter;
		}
	}
}
