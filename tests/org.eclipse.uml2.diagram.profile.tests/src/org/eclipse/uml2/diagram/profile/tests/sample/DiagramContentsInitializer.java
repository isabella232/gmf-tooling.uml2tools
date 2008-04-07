package org.eclipse.uml2.diagram.profile.tests.sample;

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
import org.eclipse.uml2.diagram.profile.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ElementImport2EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.EnumerationEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.EnumerationLiteralEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.EnumerationLiteralsEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ExtensionEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.GeneralizationEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.Profile2EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.Profile3EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ProfileContentsEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ProfileProfileLabelsEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.Stereotype2EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.StereotypeAttributesEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.StereotypeConstraintsEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.StereotypeEditPart;
import org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.diagram.profile.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.profile.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.UMLPackage;

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
		createProfile_1000Children(diagram, diagramModelObject);

		createLinks(diagram);
	}

	/**
	 * @generated
	 */
	private void createStereotype_2001Children(View viewObject, EObject modelObject) {

		Node nextCompartment = getCompartment(viewObject, UMLVisualIDRegistry.getType(StereotypeAttributesEditPart.VISUAL_ID));
		if (nextCompartment != null) {
			createStereotypeAttributes_7001Children(nextCompartment, modelObject);
		}
		nextCompartment = getCompartment(viewObject, UMLVisualIDRegistry.getType(StereotypeConstraintsEditPart.VISUAL_ID));
		if (nextCompartment != null) {
			createStereotypeConstraints_7002Children(nextCompartment, modelObject);
		}
		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createProfile_2002Children(View viewObject, EObject modelObject) {

		Node nextCompartment = getCompartment(viewObject, UMLVisualIDRegistry.getType(ProfileContentsEditPart.VISUAL_ID));
		if (nextCompartment != null) {
			createProfileContents_7003Children(nextCompartment, modelObject);
		}
		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createEnumeration_2003Children(View viewObject, EObject modelObject) {

		Node nextCompartment = getCompartment(viewObject, UMLVisualIDRegistry.getType(EnumerationLiteralsEditPart.VISUAL_ID));
		if (nextCompartment != null) {
			createEnumerationLiterals_7004Children(nextCompartment, modelObject);
		}
		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createElementImport_2006Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated NOT
	 */
	private void createProfile_2007Children(View viewObject, EObject modelObject) {

		Node nextCompartment = getCompartment(viewObject, UMLVisualIDRegistry.getType(ProfileProfileLabelsEditPart.VISUAL_ID));
		if (nextCompartment != null) {
			createProfileProfileLabels_7005Children(nextCompartment, modelObject);
		}
//		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createProperty_3001Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createConstraint_3008Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createStereotype_3003Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createEnumerationLiteral_3005Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createElementImport_3009Children(View viewObject, EObject modelObject) {

		storeLinks(modelObject, viewObject.getDiagram());
	}

	/**
	 * @generated
	 */
	private void createStereotypeAttributes_7001Children(View viewObject, EObject modelObject) {
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((StructuredClassifier) modelObject).getOwnedAttributes().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (PropertyEditPart.VISUAL_ID == nodeVID) {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createProperty_3001Children(nextNode, nextValue);
			}
		}
	}

	/**
	 * @generated
	 */
	private void createStereotypeConstraints_7002Children(View viewObject, EObject modelObject) {
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((Namespace) modelObject).getOwnedRules().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (ConstraintEditPart.VISUAL_ID == nodeVID) {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createConstraint_3008Children(nextNode, nextValue);
			}
		}
	}

	/**
	 * @generated
	 */
	private void createProfileContents_7003Children(View viewObject, EObject modelObject) {
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((Package) modelObject).getPackagedElements().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (Stereotype2EditPart.VISUAL_ID == nodeVID) {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Stereotype2EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createStereotype_3003Children(nextNode, nextValue);
			}
		}
	}

	/**
	 * @generated
	 */
	private void createEnumerationLiterals_7004Children(View viewObject, EObject modelObject) {
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((Enumeration) modelObject).getOwnedLiterals().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (EnumerationLiteralEditPart.VISUAL_ID == nodeVID) {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createEnumerationLiteral_3005Children(nextNode, nextValue);
			}
		}
	}

	/**
	 * @generated
	 */
	private void createProfileProfileLabels_7005Children(View viewObject, EObject modelObject) {
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((Namespace) modelObject).getElementImports().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (ElementImport2EditPart.VISUAL_ID == nodeVID) {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(ElementImport2EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
//				createElementImport_3009Children(nextNode, nextValue);
			}
		}
	}

	/**
	 * @generated NOT
	 */
	private void createProfile_1000Children(View viewObject, EObject modelObject) {
		EObject nextValue;
		int nodeVID;
		nextValue = modelObject;
		
		//add secondary diagram element
		Node node = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Profile3EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		myEObject2NodeMap.put(nextValue, node);
		createProfile_2007Children(node, nextValue);
		// end add secondary diagram element
		for (Iterator values = ((Profile) modelObject).getOwnedStereotypes().iterator(); values.hasNext();) {

			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (StereotypeEditPart.VISUAL_ID == nodeVID) {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(StereotypeEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createStereotype_2001Children(nextNode, nextValue);
			}
		}
		for (Iterator values = ((Package) modelObject).getPackagedElements().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			switch (nodeVID) {
			case Profile2EditPart.VISUAL_ID: {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Profile2EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createProfile_2002Children(nextNode, nextValue);
				break;
			}
			case Profile3EditPart.VISUAL_ID: {
//              add secondary diagram element
//				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(Profile3EditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
//				myEObject2NodeMap.put(nextValue, nextNode);
//				createProfile_2007Children(nextNode, nextValue);
//              end add secondary diagram element
				break;
			}
			}
		}
		for (Iterator values = ((Package) modelObject).getOwnedTypes().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (EnumerationEditPart.VISUAL_ID == nodeVID) {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createEnumeration_2003Children(nextNode, nextValue);
			}
		}
		for (Iterator values = ((Profile) modelObject).getMetaclassReferences().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (ElementImportEditPart.VISUAL_ID == nodeVID) {
				Node nextNode = ViewService.createNode(viewObject, nextValue, UMLVisualIDRegistry.getType(ElementImportEditPart.VISUAL_ID), UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				myEObject2NodeMap.put(nextValue, nextNode);
				createElementImport_2006Children(nextNode, nextValue);
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
		storeTypeModelFacetLinks_Generalization_4001(container, containerMetaclass);
		storeTypeModelFacetLinks_Extension_4002(container, containerMetaclass);
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_Generalization_4001(EObject container, EClass containerMetaclass) {
		if (UMLPackage.eINSTANCE.getClassifier().isSuperTypeOf(containerMetaclass)) {
			for (Iterator values = ((Classifier) container).getGeneralizations().iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = UMLVisualIDRegistry.getLinkWithClassVisualID(nextValue);
				if (GeneralizationEditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((Generalization) nextValue).getGeneral();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						EObject src = container;
						myLinkDescriptors.add(new LinkDescriptor(src, dst, nextValue, UMLElementTypes.Generalization_4001, linkVID));
					}
				}
			}
		}
	}

//	/**
//	 * @generated
//	 */
//	private void storeTypeModelFacetLinks_Extension_4002(EObject container, EClass containerMetaclass) {
//		if (UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(containerMetaclass)) {
//			for (Iterator values = ((Package) container).getPackagedElements().iterator(); values.hasNext();) {
//				EObject nextValue = ((EObject) values.next());
//				int linkVID = UMLVisualIDRegistry.getLinkWithClassVisualID(nextValue);
//				if (ExtensionEditPart.VISUAL_ID == linkVID) {
//					Object structuralFeatureResult = ((Extension) nextValue).getMetaclass();
//					List targets = (List) structuralFeatureResult;
//					structuralFeatureResult = targets.size() == 1 ? targets.get(0) : null;
//					if (structuralFeatureResult instanceof EObject) {
//						EObject dst = (EObject) structuralFeatureResult;
//						structuralFeatureResult = ((Profile) nextValue).getOwnedStereotypes();
//						List sources = (List) structuralFeatureResult;
//						structuralFeatureResult = sources.size() == 1 ? sources.get(0) : null;
//						if (structuralFeatureResult instanceof EObject) {
//							EObject src = (EObject) structuralFeatureResult;
//							myLinkDescriptors.add(new LinkDescriptor(src, dst, nextValue, UMLElementTypes.Extension_4002, linkVID));
//						}
//					}
//				}
//			}
//		}
//	}
	/**
	 * @generated NOT
	 */
	private void storeTypeModelFacetLinks_Extension_4002(EObject container, EClass containerMetaclass) {
		if (UMLPackage.eINSTANCE.getProfile().isSuperTypeOf(containerMetaclass)) {
			Profile profile = (Profile) container;
			for (Iterator extensions = profile.getOwnedTypes().iterator(); extensions.hasNext();) {
				EObject next = (EObject) extensions.next();
				if (ExtensionEditPart.VISUAL_ID == UMLVisualIDRegistry.getLinkWithClassVisualID(next)) {
					Extension nextExtension = (Extension) next;
					Stereotype stereotype = nextExtension.getStereotype();
					Classifier metaclass = nextExtension.getMetaclass();
					ElementImport metaclassImport = profile.getElementImport(metaclass, false);
					if (stereotype != null && metaclassImport != null) {
						myLinkDescriptors.add(new LinkDescriptor(stereotype, metaclassImport, nextExtension, UMLElementTypes.Extension_4002, ExtensionEditPart.VISUAL_ID));
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
