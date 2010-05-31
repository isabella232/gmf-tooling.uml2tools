package org.eclipse.uml2.diagram.usecase.part;

import java.util.ArrayList;
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
import org.eclipse.uml2.diagram.common.conventions.AssociationEndConvention;
import org.eclipse.uml2.diagram.common.genapi.IDiagramUpdater;
import org.eclipse.uml2.diagram.usecase.edit.parts.ActorAsRectangleEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ActorEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ActorInPackageEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.AssociationEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.CommentAnnotatedElementEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.CommentEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.DiagramHeaderEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ExtendEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ExtensionPoint2EditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ExtensionPointEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.GeneralizationEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.IncludeEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.InnerUseCaseEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.InnerUseCaseExtensionPointsEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.NestedPackageEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.PackageFramecontentsEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.PackageImportsEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.SubjectEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.SubjectUsecasesEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseAsClassEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseAsClassExtensionPointsEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseExtensionPointsEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCasePointsEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseinPackageEditPart;
import org.eclipse.uml2.diagram.usecase.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Extend;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Include;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;

/**
 * @generated
 */
@SuppressWarnings("unchecked")
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
	public static List<UMLNodeDescriptor> getSemanticChildren(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID: {
			//We have "dummy" TopLevelNode (with vid = org.eclipse.uml2.diagram.usecase.edit.parts.DiagramHeaderEditPart.VISUAL_ID). 
			//The only purpose for this node is to be a container for children (imports, etc)
			//of the "main" diagram figure (that one shown as Canvas).
			//Also we have modified the VisualIDRegistry#getNodeVisualID() to return
			//VID = org.eclipse.uml2.diagram.usecase.edit.parts.DiagramHeaderEditPart.VISUAL_ID, 
			//for the case when top-level view is created for the same semantic element as the canvas view.

			List resultAndHeader = new LinkedList();
			resultAndHeader.add(new UMLNodeDescriptor(view.getElement(), DiagramHeaderEditPart.VISUAL_ID));
			resultAndHeader.addAll(getPackage_1000SemanticChildren(view));
			return resultAndHeader;
		}
		case PackageImportsEditPart.VISUAL_ID:
			return getPackageImports_7001SemanticChildren(view);
		case UseCaseExtensionPointsEditPart.VISUAL_ID:
			return getUseCasePoints_7002SemanticChildren(view);
		case UseCaseAsClassExtensionPointsEditPart.VISUAL_ID:
			return getUseCaseExtensionpoints_7003SemanticChildren(view);
		case SubjectUsecasesEditPart.VISUAL_ID:
			return getComponentUsecases_7004SemanticChildren(view);
		case InnerUseCaseExtensionPointsEditPart.VISUAL_ID:
			return getUseCasePoints_7005SemanticChildren(view);
		case PackageFramecontentsEditPart.VISUAL_ID:
			return getPackageFramecontents_7006SemanticChildren(view);
		case UseCasePointsEditPart.VISUAL_ID:
			return getUseCasePoints_7007SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLNodeDescriptor> getPackageImports_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) containerView.getElement();
		LinkedList<UMLNodeDescriptor> result = new LinkedList<UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElementImports().iterator(); it.hasNext();) {
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
	public static List<UMLNodeDescriptor> getUseCasePoints_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UseCase modelElement = (UseCase) containerView.getElement();
		LinkedList<UMLNodeDescriptor> result = new LinkedList<UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getExtensionPoints().iterator(); it.hasNext();) {
			ExtensionPoint childElement = (ExtensionPoint) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ExtensionPointEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLNodeDescriptor> getUseCaseExtensionpoints_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UseCase modelElement = (UseCase) containerView.getElement();
		LinkedList<UMLNodeDescriptor> result = new LinkedList<UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getExtensionPoints().iterator(); it.hasNext();) {
			ExtensionPoint childElement = (ExtensionPoint) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ExtensionPoint2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLNodeDescriptor> getComponentUsecases_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) containerView.getElement();
		LinkedList<UMLNodeDescriptor> result = new LinkedList<UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUseCases().iterator(); it.hasNext();) {
			UseCase childElement = (UseCase) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InnerUseCaseEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLNodeDescriptor> getUseCasePoints_7005SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UseCase modelElement = (UseCase) containerView.getElement();
		LinkedList<UMLNodeDescriptor> result = new LinkedList<UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getExtensionPoints().iterator(); it.hasNext();) {
			ExtensionPoint childElement = (ExtensionPoint) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ExtensionPointEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLNodeDescriptor> getPackageFramecontents_7006SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) containerView.getElement();
		LinkedList<UMLNodeDescriptor> result = new LinkedList<UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedTypes().iterator(); it.hasNext();) {
			Type childElement = (Type) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ActorInPackageEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UseCaseinPackageEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLNodeDescriptor> getUseCasePoints_7007SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UseCase modelElement = (UseCase) containerView.getElement();
		LinkedList<UMLNodeDescriptor> result = new LinkedList<UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getExtensionPoints().iterator(); it.hasNext();) {
			ExtensionPoint childElement = (ExtensionPoint) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ExtensionPointEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLNodeDescriptor> getPackage_1000SemanticChildrenGen(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) view.getElement();
		LinkedList<UMLNodeDescriptor> result = new LinkedList<UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPackagedElements().iterator(); it.hasNext();) {
			PackageableElement childElement = (PackageableElement) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
		}
		for (Iterator<?> it = modelElement.getOwnedTypes().iterator(); it.hasNext();) {
			Type childElement = (Type) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ActorEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActorAsRectangleEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UseCaseEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UseCaseAsClassEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SubjectEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNestedPackages().iterator(); it.hasNext();) {
			Package childElement = (Package) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == NestedPackageEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPackagedElements().iterator(); it.hasNext();) {
			PackageableElement childElement = (PackageableElement) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConstraintEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOwnedComments().iterator(); it.hasNext();) {
			Comment childElement = (Comment) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CommentEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	public static List getPackage_1000SemanticChildren(View view) {
		List result = new ArrayList<Object>();
		result.addAll(getPackage_1000SemanticChildrenGen(view));
		result.addAll(getPackage_1000SemanticChildren_ConstraintsAsOwnedRules(view));
		return result;
	}

	public static List getPackage_1000SemanticChildren_ConstraintsAsOwnedRules(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		for (Constraint next : modelElement.getOwnedRules()) {
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, next);
			if (visualID == ConstraintEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(next, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getContainedLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000ContainedLinks(view);
		case DiagramHeaderEditPart.VISUAL_ID:
			return getPackage_2001ContainedLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2002ContainedLinks(view);
		case ActorAsRectangleEditPart.VISUAL_ID:
			return getActor_2005ContainedLinks(view);
		case UseCaseEditPart.VISUAL_ID:
			return getUseCase_2003ContainedLinks(view);
		case UseCaseAsClassEditPart.VISUAL_ID:
			return getUseCase_2004ContainedLinks(view);
		case SubjectEditPart.VISUAL_ID:
			return getComponent_2006ContainedLinks(view);
		case NestedPackageEditPart.VISUAL_ID:
			return getPackage_2007ContainedLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_2008ContainedLinks(view);
		case CommentEditPart.VISUAL_ID:
			return getComment_2009ContainedLinks(view);
		case ElementImportEditPart.VISUAL_ID:
			return getElementImport_3001ContainedLinks(view);
		case ExtensionPointEditPart.VISUAL_ID:
			return getExtensionPoint_3002ContainedLinks(view);
		case ExtensionPoint2EditPart.VISUAL_ID:
			return getExtensionPoint_3003ContainedLinks(view);
		case InnerUseCaseEditPart.VISUAL_ID:
			return getUseCase_3004ContainedLinks(view);
		case ActorInPackageEditPart.VISUAL_ID:
			return getActor_3005ContainedLinks(view);
		case UseCaseinPackageEditPart.VISUAL_ID:
			return getUseCase_3006ContainedLinks(view);
		case IncludeEditPart.VISUAL_ID:
			return getInclude_4001ContainedLinks(view);
		case ExtendEditPart.VISUAL_ID:
			return getExtend_4002ContainedLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4003ContainedLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4004ContainedLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getIncomingLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case DiagramHeaderEditPart.VISUAL_ID:
			return getPackage_2001IncomingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2002IncomingLinks(view);
		case ActorAsRectangleEditPart.VISUAL_ID:
			return getActor_2005IncomingLinks(view);
		case UseCaseEditPart.VISUAL_ID:
			return getUseCase_2003IncomingLinks(view);
		case UseCaseAsClassEditPart.VISUAL_ID:
			return getUseCase_2004IncomingLinks(view);
		case SubjectEditPart.VISUAL_ID:
			return getComponent_2006IncomingLinks(view);
		case NestedPackageEditPart.VISUAL_ID:
			return getPackage_2007IncomingLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_2008IncomingLinks(view);
		case CommentEditPart.VISUAL_ID:
			return getComment_2009IncomingLinks(view);
		case ElementImportEditPart.VISUAL_ID:
			return getElementImport_3001IncomingLinks(view);
		case ExtensionPointEditPart.VISUAL_ID:
			return getExtensionPoint_3002IncomingLinks(view);
		case ExtensionPoint2EditPart.VISUAL_ID:
			return getExtensionPoint_3003IncomingLinks(view);
		case InnerUseCaseEditPart.VISUAL_ID:
			return getUseCase_3004IncomingLinks(view);
		case ActorInPackageEditPart.VISUAL_ID:
			return getActor_3005IncomingLinks(view);
		case UseCaseinPackageEditPart.VISUAL_ID:
			return getUseCase_3006IncomingLinks(view);
		case IncludeEditPart.VISUAL_ID:
			return getInclude_4001IncomingLinks(view);
		case ExtendEditPart.VISUAL_ID:
			return getExtend_4002IncomingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4003IncomingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4004IncomingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getOutgoingLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case DiagramHeaderEditPart.VISUAL_ID:
			return getPackage_2001OutgoingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2002OutgoingLinks(view);
		case ActorAsRectangleEditPart.VISUAL_ID:
			return getActor_2005OutgoingLinks(view);
		case UseCaseEditPart.VISUAL_ID:
			return getUseCase_2003OutgoingLinks(view);
		case UseCaseAsClassEditPart.VISUAL_ID:
			return getUseCase_2004OutgoingLinks(view);
		case SubjectEditPart.VISUAL_ID:
			return getComponent_2006OutgoingLinks(view);
		case NestedPackageEditPart.VISUAL_ID:
			return getPackage_2007OutgoingLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_2008OutgoingLinks(view);
		case CommentEditPart.VISUAL_ID:
			return getComment_2009OutgoingLinks(view);
		case ElementImportEditPart.VISUAL_ID:
			return getElementImport_3001OutgoingLinks(view);
		case ExtensionPointEditPart.VISUAL_ID:
			return getExtensionPoint_3002OutgoingLinks(view);
		case ExtensionPoint2EditPart.VISUAL_ID:
			return getExtensionPoint_3003OutgoingLinks(view);
		case InnerUseCaseEditPart.VISUAL_ID:
			return getUseCase_3004OutgoingLinks(view);
		case ActorInPackageEditPart.VISUAL_ID:
			return getActor_3005OutgoingLinks(view);
		case UseCaseinPackageEditPart.VISUAL_ID:
			return getUseCase_3006OutgoingLinks(view);
		case IncludeEditPart.VISUAL_ID:
			return getInclude_4001OutgoingLinks(view);
		case ExtendEditPart.VISUAL_ID:
			return getExtend_4002OutgoingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4003OutgoingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4004OutgoingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getPackage_1000ContainedLinks(View view) {
		Package modelElement = (Package) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Association_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getPackage_2001ContainedLinks(View view) {
		//no links to, from and inside the diagram header
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getActor_2002ContainedLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getActor_2005ContainedLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getUseCase_2003ContainedLinks(View view) {
		UseCase modelElement = (UseCase) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Include_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extend_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getUseCase_2004ContainedLinks(View view) {
		UseCase modelElement = (UseCase) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Include_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extend_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getComponent_2006ContainedLinks(View view) {
		Component modelElement = (Component) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getPackage_2007ContainedLinks(View view) {
		Package modelElement = (Package) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Association_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getConstraint_2008ContainedLinks(View view) {
		Constraint modelElement = (Constraint) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getComment_2009ContainedLinks(View view) {
		Comment modelElement = (Comment) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getElementImport_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getExtensionPoint_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getExtensionPoint_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getUseCase_3004ContainedLinks(View view) {
		UseCase modelElement = (UseCase) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Include_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extend_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getActor_3005ContainedLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getUseCase_3006ContainedLinks(View view) {
		UseCase modelElement = (UseCase) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Include_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Extend_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getInclude_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getExtend_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getGeneralization_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getAssociation_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getDependency_4006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getPackage_2001IncomingLinks(View view) {
		//no links to, from and inside the diagram header
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getActor_2002IncomingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getActor_2005IncomingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getUseCase_2003IncomingLinks(View view) {
		UseCase modelElement = (UseCase) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Include_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extend_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getUseCase_2004IncomingLinks(View view) {
		UseCase modelElement = (UseCase) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Include_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extend_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getComponent_2006IncomingLinks(View view) {
		Component modelElement = (Component) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getPackage_2007IncomingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getConstraint_2008IncomingLinks(View view) {
		Constraint modelElement = (Constraint) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getComment_2009IncomingLinks(View view) {
		Comment modelElement = (Comment) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getElementImport_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getExtensionPoint_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getExtensionPoint_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getUseCase_3004IncomingLinks(View view) {
		UseCase modelElement = (UseCase) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Include_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extend_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getActor_3005IncomingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getUseCase_3006IncomingLinks(View view) {
		UseCase modelElement = (UseCase) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Include_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Extend_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getInclude_4001IncomingLinks(View view) {
		Include modelElement = (Include) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getExtend_4002IncomingLinks(View view) {
		Extend modelElement = (Extend) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getGeneralization_4003IncomingLinks(View view) {
		Generalization modelElement = (Generalization) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getAssociation_4004IncomingLinks(View view) {
		Association modelElement = (Association) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getDependency_4006IncomingLinks(View view) {
		Dependency modelElement = (Dependency) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getPackage_2001OutgoingLinks(View view) {
		//no links to, from and inside the diagram header
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getActor_2002OutgoingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getActor_2005OutgoingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getUseCase_2003OutgoingLinks(View view) {
		UseCase modelElement = (UseCase) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Include_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extend_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getUseCase_2004OutgoingLinks(View view) {
		UseCase modelElement = (UseCase) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Include_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extend_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getComponent_2006OutgoingLinks(View view) {
		Component modelElement = (Component) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getPackage_2007OutgoingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getConstraint_2008OutgoingLinks(View view) {
		Constraint modelElement = (Constraint) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getComment_2009OutgoingLinks(View view) {
		Comment modelElement = (Comment) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getElementImport_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getExtensionPoint_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getExtensionPoint_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getUseCase_3004OutgoingLinks(View view) {
		UseCase modelElement = (UseCase) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Include_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extend_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getActor_3005OutgoingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getUseCase_3006OutgoingLinks(View view) {
		UseCase modelElement = (UseCase) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Include_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Extend_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getInclude_4001OutgoingLinks(View view) {
		Include modelElement = (Include) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getExtend_4002OutgoingLinks(View view) {
		Extend modelElement = (Extend) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getGeneralization_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getAssociation_4004OutgoingLinks(View view) {
		Association modelElement = (Association) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UMLLinkDescriptor> getDependency_4006OutgoingLinks(View view) {
		Dependency modelElement = (Dependency) view.getElement();
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UMLLinkDescriptor> getContainedTypeModelFacetLinks_Include_4001(UseCase container) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getIncludes().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Include) {
				continue;
			}
			Include link = (Include) linkObject;
			if (IncludeEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase dst = link.getAddition();
			UseCase src = link.getIncludingCase();
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Include_4001, IncludeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UMLLinkDescriptor> getContainedTypeModelFacetLinks_Extend_4002(UseCase container) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getExtends().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Extend) {
				continue;
			}
			Extend link = (Extend) linkObject;
			if (ExtendEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase dst = link.getExtendedCase();
			UseCase src = link.getExtension();
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Extend_4002, ExtendEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UMLLinkDescriptor> getContainedTypeModelFacetLinks_Generalization_4003(Classifier container) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getGeneralizations().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) linkObject;
			if (GeneralizationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getGeneral();
			Classifier src = link.getSpecific();
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Generalization_4003, GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	private static Collection getContainedTypeModelFacetLinks_Association_4004(Package container) {
		Collection result = new LinkedList();
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
				result.add(new UMLLinkDescriptor(gmfSource, gmfTarget, association, UMLElementTypes.Association_4004, AssociationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UMLLinkDescriptor> getContainedTypeModelFacetLinks_Dependency_4006(Package container) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
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
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Dependency_4006, DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UMLLinkDescriptor> getIncomingTypeModelFacetLinks_Include_4001(UseCase target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getInclude_Addition() || false == setting.getEObject() instanceof Include) {
				continue;
			}
			Include link = (Include) setting.getEObject();
			if (IncludeEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase src = link.getIncludingCase();
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.Include_4001, IncludeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UMLLinkDescriptor> getIncomingTypeModelFacetLinks_Extend_4002(UseCase target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getExtend_ExtendedCase() || false == setting.getEObject() instanceof Extend) {
				continue;
			}
			Extend link = (Extend) setting.getEObject();
			if (ExtendEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase src = link.getExtension();
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.Extend_4002, ExtendEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UMLLinkDescriptor> getIncomingTypeModelFacetLinks_Generalization_4003(Classifier target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getGeneralization_General() || false == setting.getEObject() instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) setting.getEObject();
			if (GeneralizationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier src = link.getSpecific();
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.Generalization_4003, GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UMLLinkDescriptor> getOutgoingTypeModelFacetLinks_Include_4001(UseCase source) {
		UseCase container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof UseCase) {
				container = (UseCase) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getIncludes().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Include) {
				continue;
			}
			Include link = (Include) linkObject;
			if (IncludeEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase dst = link.getAddition();
			UseCase src = link.getIncludingCase();
			if (src != source) {
				continue;
			}
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Include_4001, IncludeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UMLLinkDescriptor> getOutgoingTypeModelFacetLinks_Extend_4002(UseCase source) {
		UseCase container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof UseCase) {
				container = (UseCase) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getExtends().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Extend) {
				continue;
			}
			Extend link = (Extend) linkObject;
			if (ExtendEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			UseCase dst = link.getExtendedCase();
			UseCase src = link.getExtension();
			if (src != source) {
				continue;
			}
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Extend_4002, ExtendEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UMLLinkDescriptor> getOutgoingTypeModelFacetLinks_Generalization_4003(Classifier source) {
		Classifier container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Classifier) {
				container = (Classifier) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> links = container.getGeneralizations().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) linkObject;
			if (GeneralizationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getGeneral();
			Classifier src = link.getSpecific();
			if (src != source) {
				continue;
			}
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Generalization_4003, GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	private static Collection getIncomingTypeModelFacetLinks_Association_4004(Type target, Map crossReferences) {
		return findRelatedAssociations(target, false);
	}

	/**
	 * @generated
	 */
	private static Collection<UMLLinkDescriptor> getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(Element target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == UMLPackage.eINSTANCE.getConstraint_ConstrainedElement()) {
				result.add(new UMLLinkDescriptor(setting.getEObject(), target, UMLElementTypes.ConstraintConstrainedElement_4005,
						ConstraintConstrainedElementEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UMLLinkDescriptor> getIncomingTypeModelFacetLinks_Dependency_4006(NamedElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
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
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.Dependency_4006, DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UMLLinkDescriptor> getIncomingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(Element target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == UMLPackage.eINSTANCE.getComment_AnnotatedElement()) {
				result.add(new UMLLinkDescriptor(setting.getEObject(), target, UMLElementTypes.CommentAnnotatedElement_4007,
						CommentAnnotatedElementEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Association_4004(Type source) {
		return findRelatedAssociations(source, true);
	}

	/**
	 * @generated
	 */
	private static Collection<UMLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Constraint_ConstrainedElement_4005(Constraint source) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> destinations = source.getConstrainedElements().iterator(); destinations.hasNext();) {
			Element destination = (Element) destinations.next();
			result.add(new UMLLinkDescriptor(source, destination, UMLElementTypes.ConstraintConstrainedElement_4005,
					ConstraintConstrainedElementEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UMLLinkDescriptor> getOutgoingTypeModelFacetLinks_Dependency_4006(NamedElement source) {
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
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
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
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Dependency_4006, DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<UMLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Comment_AnnotatedElement_4007(Comment source) {
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		for (Iterator<?> destinations = source.getAnnotatedElements().iterator(); destinations.hasNext();) {
			Element destination = (Element) destinations.next();
			result.add(new UMLLinkDescriptor(source, destination, UMLElementTypes.CommentAnnotatedElement_4007, CommentAnnotatedElementEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @NOT-GENERATED
	 */
	private static Collection findRelatedAssociations(Type type, boolean sourceNotTarget) {
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
			result.add(new UMLLinkDescriptor(gmfSource, gmfTarget, link, UMLElementTypes.Association_4004, AssociationEditPart.VISUAL_ID));
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
			return org.eclipse.uml2.diagram.usecase.part.UMLDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		public List<UMLLinkDescriptor> getContainedLinks(View view) {
			return org.eclipse.uml2.diagram.usecase.part.UMLDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		public List<UMLLinkDescriptor> getIncomingLinks(View view) {
			return org.eclipse.uml2.diagram.usecase.part.UMLDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		public List<UMLLinkDescriptor> getOutgoingLinks(View view) {
			return org.eclipse.uml2.diagram.usecase.part.UMLDiagramUpdater.getOutgoingLinks(view);
		}
	};
}
