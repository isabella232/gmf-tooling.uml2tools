package org.eclipse.uml2.diagram.clazz.edit.policies;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalConnectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.clazz.association.AssociationEndConvention;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClass2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataType2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataTypeEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Dependency2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyClientEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencySupplierEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Enumeration2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationLiteralEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecification2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.LiteralStringEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation5EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.OperationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveType2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property5EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property6EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.SlotEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.UsageEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class PackageCanonicalEditPolicy extends CanonicalConnectionEditPolicy {

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		List result = new LinkedList();
		EObject modelObject = ((View) getHost().getModel()).getElement();
		View viewObject = (View) getHost().getModel();
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((Package) modelObject).getNestedPackages().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (Package2EditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((Package) modelObject).getOwnedTypes().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			switch (nodeVID) {
			case Class2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case AssociationClass2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case DataType2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case PrimitiveType2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case Enumeration2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case InterfaceEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			}
		}
		for (Iterator values = ((Package) modelObject).getPackagedElements().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			switch (nodeVID) {
			case ConstraintEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case InstanceSpecification2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case DependencyEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean shouldDeleteView(View view) {
		return view.isSetElement() && view.getElement() != null && view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected List getSemanticConnectionsList() {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	protected EObject getSourceElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	protected EObject getTargetElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	protected boolean shouldIncludeConnection(Edge connector, Collection children) {
		return false;
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		List createdViews = new LinkedList();
		createdViews.addAll(refreshSemanticChildren());
		List createdConnectionViews = new LinkedList();
		createdConnectionViews.addAll(refreshSemanticConnections());
		createdConnectionViews.addAll(refreshConnections());

		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host().getEditingDomain(), createdViews, host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		createdViews.addAll(createdConnectionViews);
		makeViewsImmutable(createdViews);
	}

	/**
	 * @generated
	 */
	private Collection myLinkDescriptors = new LinkedList();

	/**
	 * @generated
	 */
	private Map myEObject2ViewMap = new HashMap();

	/**
	 * @generated
	 */
	private Collection refreshConnections() {
		try {
			collectAllLinks(getDiagram());
			Collection existingLinks = new LinkedList(getDiagram().getEdges());
			for (Iterator diagramLinks = existingLinks.iterator(); diagramLinks.hasNext();) {
				Edge nextDiagramLink = (Edge) diagramLinks.next();
				EObject diagramLinkObject = nextDiagramLink.getElement();
				EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
				EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
				int diagramLinkVisualID = UMLVisualIDRegistry.getVisualID(nextDiagramLink);
				for (Iterator modelLinkDescriptors = myLinkDescriptors.iterator(); modelLinkDescriptors.hasNext();) {
					LinkDescriptor nextLinkDescriptor = (LinkDescriptor) modelLinkDescriptors.next();
					if (diagramLinkObject == nextLinkDescriptor.getLinkElement() && diagramLinkSrc == nextLinkDescriptor.getSource() && diagramLinkDst == nextLinkDescriptor.getDestination()
							&& diagramLinkVisualID == nextLinkDescriptor.getVisualID()) {
						diagramLinks.remove();
						modelLinkDescriptors.remove();
					}
				}
			}
			deleteViews(existingLinks.iterator());
			return createConnections(myLinkDescriptors);
		} finally {
			myLinkDescriptors.clear();
			myEObject2ViewMap.clear();
		}
	}

	/**
	 * @generated
	 */
	private void collectAllLinks(View view) {
		EObject modelElement = view.getElement();
		int diagramElementVisualID = UMLVisualIDRegistry.getVisualID(view);
		switch (diagramElementVisualID) {
		case Package2EditPart.VISUAL_ID:
		case Class2EditPart.VISUAL_ID:
		case AssociationClass2EditPart.VISUAL_ID:
		case DataType2EditPart.VISUAL_ID:
		case PrimitiveType2EditPart.VISUAL_ID:
		case Enumeration2EditPart.VISUAL_ID:
		case InterfaceEditPart.VISUAL_ID:
		case ConstraintEditPart.VISUAL_ID:
		case InstanceSpecification2EditPart.VISUAL_ID:
		case DependencyEditPart.VISUAL_ID:
		case Package3EditPart.VISUAL_ID:
		case ClassEditPart.VISUAL_ID:
		case DataTypeEditPart.VISUAL_ID:
		case PrimitiveTypeEditPart.VISUAL_ID:
		case EnumerationEditPart.VISUAL_ID:
		case AssociationClassEditPart.VISUAL_ID:
		case InstanceSpecificationEditPart.VISUAL_ID:
		case PropertyEditPart.VISUAL_ID:
		case OperationEditPart.VISUAL_ID:
		case Class3EditPart.VISUAL_ID:
		case PortEditPart.VISUAL_ID:
		case Property2EditPart.VISUAL_ID:
		case Operation2EditPart.VISUAL_ID:
		case Property3EditPart.VISUAL_ID:
		case Operation3EditPart.VISUAL_ID:
		case Property4EditPart.VISUAL_ID:
		case Operation4EditPart.VISUAL_ID:
		case EnumerationLiteralEditPart.VISUAL_ID:
		case Property5EditPart.VISUAL_ID:
		case Operation5EditPart.VISUAL_ID:
		case LiteralStringEditPart.VISUAL_ID:
		case SlotEditPart.VISUAL_ID:
		case PackageEditPart.VISUAL_ID: {
			myEObject2ViewMap.put(modelElement, view);
			storeLinks(modelElement, getDiagram());
		}
		default: {
		}
			for (Iterator children = view.getChildren().iterator(); children.hasNext();) {
				View childView = (View) children.next();
				collectAllLinks(childView);
			}
		}
	}

	/**
	 * @generated
	 */
	private Collection createConnections(Collection linkDescriptors) {
		if (linkDescriptors.isEmpty()) {
			return Collections.EMPTY_LIST;
		}
		List adapters = new LinkedList();
		for (Iterator linkDescriptorsIterator = linkDescriptors.iterator(); linkDescriptorsIterator.hasNext();) {
			final LinkDescriptor nextLinkDescriptor = (LinkDescriptor) linkDescriptorsIterator.next();
			EditPart sourceEditPart = getEditPartFor(nextLinkDescriptor.getSource());
			EditPart targetEditPart = getEditPartFor(nextLinkDescriptor.getDestination());
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(nextLinkDescriptor.getSemanticAdapter(), null, ViewUtil.APPEND,
					false, ((IGraphicalEditPart) getHost()).getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	/**
	 * @generated
	 */
	private EditPart getEditPartFor(EObject modelElement) {
		View view = (View) myEObject2ViewMap.get(modelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry().get(view);
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
		storeTypeModelFacetLinks_Dependency_4002(container, containerMetaclass);
		storeTypeModelFacetLinks_Property_4003(container, containerMetaclass);
		storeTypeModelFacetLinks_Association_4005(container, containerMetaclass);
		storeTypeModelFacetLinks_InterfaceRealization_4008(container, containerMetaclass);
		storeTypeModelFacetLinks_Usage_4009(container, containerMetaclass);
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
						myLinkDescriptors.add(new LinkDescriptor(src, dst, nextValue, linkVID));
					}
				}
			}
		}
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_Dependency_4002(EObject container, EClass containerMetaclass) {
		if (UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(containerMetaclass)) {
			for (Iterator values = ((Package) container).getPackagedElements().iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = UMLVisualIDRegistry.getLinkWithClassVisualID(nextValue);
				if (Dependency2EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((Dependency) nextValue).getSuppliers();
					List targets = (List) structuralFeatureResult;
					structuralFeatureResult = targets.size() == 1 ? targets.get(0) : null;
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((Dependency) nextValue).getClients();
						List sources = (List) structuralFeatureResult;
						structuralFeatureResult = sources.size() == 1 ? sources.get(0) : null;
						if (structuralFeatureResult instanceof EObject) {
							EObject src = (EObject) structuralFeatureResult;
							myLinkDescriptors.add(new LinkDescriptor(src, dst, nextValue, linkVID));
						}
					}
				}
			}
		}
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_Property_4003(EObject container, EClass containerMetaclass) {
		if (UMLPackage.eINSTANCE.getAssociation().isSuperTypeOf(containerMetaclass)) {
			for (Iterator values = ((Association) container).getOwnedEnds().iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = UMLVisualIDRegistry.getLinkWithClassVisualID(nextValue);
				if (Property6EditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((TypedElement) nextValue).getType();
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						EObject src = container;
						myLinkDescriptors.add(new LinkDescriptor(src, dst, nextValue, linkVID));
					}
				}
			}
		}
	}

	/**
	 * @generated NOT
	 */
	private void storeTypeModelFacetLinks_Association_4005(EObject container, EClass containerMetaclass) {
		if (UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(containerMetaclass)) {
			for (Iterator values = ((Package) container).getPackagedElements().iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = UMLVisualIDRegistry.getLinkWithClassVisualID(nextValue);
				if (AssociationEditPart.VISUAL_ID == linkVID) {
					Association association = (Association) nextValue;
					if (association.isBinary()) {
						Property sourceEnd = AssociationEndConvention.getSourceEnd(association);
						Property targetEnd = AssociationEndConvention.getTargetEnd(association);
						EObject gmfSource = sourceEnd.getType();
						EObject gmfTarget = targetEnd.getType();
						myLinkDescriptors.add(new LinkDescriptor(gmfSource, gmfTarget, association, linkVID));
					}
				}
			}
		}
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_InterfaceRealization_4008(EObject container, EClass containerMetaclass) {
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
							myLinkDescriptors.add(new LinkDescriptor(src, dst, nextValue, linkVID));
						}
					}
				}
			}
		}
	}

	/**
	 * @generated
	 */
	private void storeTypeModelFacetLinks_Usage_4009(EObject container, EClass containerMetaclass) {
		if (UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(containerMetaclass)) {
			for (Iterator values = ((Package) container).getPackagedElements().iterator(); values.hasNext();) {
				EObject nextValue = ((EObject) values.next());
				int linkVID = UMLVisualIDRegistry.getLinkWithClassVisualID(nextValue);
				if (UsageEditPart.VISUAL_ID == linkVID) {
					Object structuralFeatureResult = ((Dependency) nextValue).getSuppliers();
					List targets = (List) structuralFeatureResult;
					structuralFeatureResult = targets.size() == 1 ? targets.get(0) : null;
					if (structuralFeatureResult instanceof EObject) {
						EObject dst = (EObject) structuralFeatureResult;
						structuralFeatureResult = ((Dependency) nextValue).getClients();
						List sources = (List) structuralFeatureResult;
						structuralFeatureResult = sources.size() == 1 ? sources.get(0) : null;
						if (structuralFeatureResult instanceof EObject) {
							EObject src = (EObject) structuralFeatureResult;
							myLinkDescriptors.add(new LinkDescriptor(src, dst, nextValue, linkVID));
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

		if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(containerMetaclass)) {
			for (Iterator destinations = ((Constraint) container).getConstrainedElements().iterator(); destinations.hasNext();) {
				EObject nextDestination = (EObject) destinations.next();
				myLinkDescriptors.add(new LinkDescriptor(container, nextDestination, UMLElementTypes.ConstraintConstrainedElement_4004, ConstraintConstrainedElementEditPart.VISUAL_ID));

			}
		}

		if (UMLPackage.eINSTANCE.getDependency().isSuperTypeOf(containerMetaclass)) {
			for (Iterator destinations = ((Dependency) container).getSuppliers().iterator(); destinations.hasNext();) {
				EObject nextDestination = (EObject) destinations.next();
				myLinkDescriptors.add(new LinkDescriptor(container, nextDestination, UMLElementTypes.DependencySupplier_4006, DependencySupplierEditPart.VISUAL_ID));

			}
		}
		if (UMLPackage.eINSTANCE.getDependency().isSuperTypeOf(containerMetaclass)) {
			for (Iterator destinations = ((Dependency) container).getClients().iterator(); destinations.hasNext();) {
				EObject nextDestination = (EObject) destinations.next();
				myLinkDescriptors.add(new LinkDescriptor(container, nextDestination, UMLElementTypes.DependencyClient_4007, DependencyClientEditPart.VISUAL_ID));

			}
		}

	}

	/**
	 * @generated
	 */
	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
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
		protected LinkDescriptor(EObject source, EObject destination, EObject linkElement, int linkVID) {
			this(source, destination, linkVID);
			myLinkElement = linkElement;
			mySemanticAdapter = new EObjectAdapter(linkElement);
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
