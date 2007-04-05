package org.eclipse.uml2.diagram.statemachine.part;

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

import org.eclipse.uml2.diagram.statemachine.edit.parts.ConnectionPointReference2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ConnectionPointReferenceEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.FinalStateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate10EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate3EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate4EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate5EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate6EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate7EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate8EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate9EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Region2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.RegionEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.RegionSubvertices2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.RegionSubverticesEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.State2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.State3EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachine2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.TransitionEditPart;
import org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes;

import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
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
		createStateMachine_1000Children(diagram, diagramModelObject);

		createLinks(diagram);
	}

	/**
	 * @generated
	 */
	private void createStateMachine_2004Children(View viewObject, EObject modelObject) {
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((StateMachine) modelObject).getRegions().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (RegionEditPart.VISUAL_ID == nodeVID) {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(RegionEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createRegion_3013Children(nextNode, nextValue);
			}
		}
		for (Iterator values = ((StateMachine) modelObject).getConnectionPoints().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			switch (nodeVID) {
			case Pseudostate9EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Pseudostate9EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPseudostate_3014Children(nextNode, nextValue);
				break;
			}
			case Pseudostate10EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Pseudostate10EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPseudostate_3015Children(nextNode, nextValue);
				break;
			}
			}
		}
		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createRegion_3013Children(View viewObject, EObject modelObject) {

		Node nextCompartment = getCompartment(viewObject, UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		if (nextCompartment != null) {
			createRegionSubvertices_7004Children(nextCompartment, modelObject);
		}
		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createState_3001Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createState_3012Children(View viewObject, EObject modelObject) {
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((State) modelObject).getRegions().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (Region2EditPart.VISUAL_ID == nodeVID) {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createRegion_3002Children(nextNode, nextValue);
			}
		}
		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createRegion_3002Children(View viewObject, EObject modelObject) {

		Node nextCompartment = getCompartment(viewObject, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		if (nextCompartment != null) {
			createRegionSubvertices_7003Children(nextCompartment, modelObject);
		}
		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createState_3016Children(View viewObject, EObject modelObject) {
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((State) modelObject).getRegions().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (Region2EditPart.VISUAL_ID == nodeVID) {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createRegion_3002Children(nextNode, nextValue);
			}
		}
		for (Iterator values = ((State) modelObject).getConnections().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			switch (nodeVID) {
			case ConnectionPointReferenceEditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(ConnectionPointReferenceEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createConnectionPointReference_3017Children(nextNode, nextValue);
				break;
			}
			case ConnectionPointReference2EditPart.VISUAL_ID: {
				Node nextNode = ViewService
						.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(ConnectionPointReference2EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createConnectionPointReference_3018Children(nextNode, nextValue);
				break;
			}
			}
		}
		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createConnectionPointReference_3017Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createConnectionPointReference_3018Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createFinalState_3003Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createPseudostate_3004Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createPseudostate_3005Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createPseudostate_3006Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createPseudostate_3007Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createPseudostate_3008Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createPseudostate_3009Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createPseudostate_3010Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createPseudostate_3011Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createPseudostate_3014Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createPseudostate_3015Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createRegionSubvertices_7004Children(View viewObject, EObject modelObject) {
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((Region) modelObject).getSubvertices().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			switch (nodeVID) {
			case StateEditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(StateEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createState_3001Children(nextNode, nextValue);
				break;
			}
			case State2EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createState_3012Children(nextNode, nextValue);
				break;
			}
			case State3EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(State3EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createState_3016Children(nextNode, nextValue);
				break;
			}
			case FinalStateEditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(FinalStateEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createFinalState_3003Children(nextNode, nextValue);
				break;
			}
			case PseudostateEditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(PseudostateEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPseudostate_3004Children(nextNode, nextValue);
				break;
			}
			case Pseudostate2EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Pseudostate2EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPseudostate_3005Children(nextNode, nextValue);
				break;
			}
			case Pseudostate3EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Pseudostate3EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPseudostate_3006Children(nextNode, nextValue);
				break;
			}
			case Pseudostate4EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Pseudostate4EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPseudostate_3007Children(nextNode, nextValue);
				break;
			}
			case Pseudostate5EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Pseudostate5EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPseudostate_3008Children(nextNode, nextValue);
				break;
			}
			case Pseudostate6EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Pseudostate6EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPseudostate_3009Children(nextNode, nextValue);
				break;
			}
			case Pseudostate7EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Pseudostate7EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPseudostate_3010Children(nextNode, nextValue);
				break;
			}
			case Pseudostate8EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Pseudostate8EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPseudostate_3011Children(nextNode, nextValue);
				break;
			}
			}
		}
	}

	/**
	 * @generated
	 */
	private void createRegionSubvertices_7003Children(View viewObject, EObject modelObject) {
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((Region) modelObject).getSubvertices().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			switch (nodeVID) {
			case StateEditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(StateEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createState_3001Children(nextNode, nextValue);
				break;
			}
			case State2EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createState_3012Children(nextNode, nextValue);
				break;
			}
			case State3EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(State3EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createState_3016Children(nextNode, nextValue);
				break;
			}
			case FinalStateEditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(FinalStateEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createFinalState_3003Children(nextNode, nextValue);
				break;
			}
			case PseudostateEditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(PseudostateEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPseudostate_3004Children(nextNode, nextValue);
				break;
			}
			case Pseudostate2EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Pseudostate2EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPseudostate_3005Children(nextNode, nextValue);
				break;
			}
			case Pseudostate3EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Pseudostate3EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPseudostate_3006Children(nextNode, nextValue);
				break;
			}
			case Pseudostate4EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Pseudostate4EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPseudostate_3007Children(nextNode, nextValue);
				break;
			}
			case Pseudostate5EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Pseudostate5EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPseudostate_3008Children(nextNode, nextValue);
				break;
			}
			case Pseudostate6EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Pseudostate6EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPseudostate_3009Children(nextNode, nextValue);
				break;
			}
			case Pseudostate7EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Pseudostate7EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPseudostate_3010Children(nextNode, nextValue);
				break;
			}
			case Pseudostate8EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Pseudostate8EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createPseudostate_3011Children(nextNode, nextValue);
				break;
			}
			}
		}
	}

	/**
	 * @generated
	 */
	private void createStateMachine_1000Children(View viewObject, EObject modelObject) {
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((org.eclipse.uml2.uml.Class) modelObject).getNestedClassifiers().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (StateMachine2EditPart.VISUAL_ID == nodeVID) {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(StateMachine2EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createStateMachine_2004Children(nextNode, nextValue);
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
		storeTypeModelFacetLinks_Transition_4001(container, containerMetaclass);
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_Transition_4001(EObject container, EClass containerMetaclass) {
		if (UMLPackage.eINSTANCE.getRegion().isSuperTypeOf(containerMetaclass)) {
			for (Iterator values = ((Region) container).getTransitions().iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = UMLVisualIDRegistry.getLinkWithClassVisualID(nextValue);
				if (TransitionEditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((Transition) nextValue).getTarget();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((Transition) nextValue).getSource();
						if (structuralFeatureResult instanceof EObject) {
							EObject src = (EObject) structuralFeatureResult;
							myLinkDescriptors.add(new LinkDescriptor(src, dst, nextValue, UMLElementTypes.Transition_4001, linkVID));
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
