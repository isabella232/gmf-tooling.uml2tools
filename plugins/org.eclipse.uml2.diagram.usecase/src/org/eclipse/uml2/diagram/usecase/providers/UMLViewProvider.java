package org.eclipse.uml2.diagram.usecase.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.usecase.edit.parts.ActorAsRectangleEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ActorEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ActorInPackageEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ActorName2EditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ActorName3EditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ActorNameEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.AssociationEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.AssociationSourceMultiplicityEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.AssociationTargetMultiplicityEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ConstraintNameEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.DependencyNameEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.DiagramHeaderEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ExtendEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ExtendsLink_fixedEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ExtensionPoint2EditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ExtensionPointEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.GeneralizationEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.IncludeEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.IncludeLink_fixedEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.InnerUseCaseEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.InnerUseCaseExtensionPointsEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.NestedPackageEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.NestedPackageNameEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.PackageFramecontentsEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.PackageImportsEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.PackageNameEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.SubjectEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.SubjectNameEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.SubjectUsecasesEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseAsClassEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseAsClassExtensionPointsEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseExtensionPointsEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseName2EditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseName3EditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseName4EditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseNameEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCasePointsEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseinPackageEditPart;
import org.eclipse.uml2.diagram.usecase.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.usecase.view.factories.ActorAsRectangleViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.ActorInPackageViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.ActorName2ViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.ActorName3ViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.ActorNameViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.ActorViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.AssociationSourceMultiplicityViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.AssociationTargetMultiplicityViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.AssociationViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.ConstraintConstrainedElementViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.ConstraintNameViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.ConstraintViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.DependencyNameViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.DependencyViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.DiagramHeaderViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.ElementImportViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.ExtendViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.ExtendsLink_fixedViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.ExtensionPoint2ViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.ExtensionPointViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.GeneralizationViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.IncludeLink_fixedViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.IncludeViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.InnerUseCaseExtensionPointsViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.InnerUseCaseViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.NestedPackageNameViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.NestedPackageViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.PackageFramecontentsViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.PackageImportsViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.PackageNameViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.PackageViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.SubjectNameViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.SubjectUsecasesViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.SubjectViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.UseCaseAsClassExtensionPointsViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.UseCaseAsClassViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.UseCaseExtensionPointsViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.UseCaseName2ViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.UseCaseName3ViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.UseCaseName4ViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.UseCaseNameViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.UseCasePointsViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.UseCaseViewFactory;
import org.eclipse.uml2.diagram.usecase.view.factories.UseCaseinPackageViewFactory;

/**
 * @generated
 */
public class UMLViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter, String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (PackageEditPart.MODEL_ID.equals(diagramKind) && UMLVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return PackageViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = UMLVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!UMLElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null && !UMLVisualIDRegistry.checkNodeVisualID(containerView, domainElement, visualID)) {
					return null; // visual id for node EClass should match visual id from element type, or at least be substitutable for it
				}
			} else {
				// Element type is not specified. Domain element should be present.
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!PackageEditPart.MODEL_ID.equals(UMLVisualIDRegistry.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case ActorEditPart.VISUAL_ID: {
					if (domainElement == null) {
						return null;
					}

					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && ActorAsRectangleEditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case ActorAsRectangleEditPart.VISUAL_ID: {
					if (domainElement == null) {
						return null;
					}

					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && ActorEditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case UseCaseEditPart.VISUAL_ID: {
					if (domainElement == null) {
						return null;
					}

					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && UseCaseAsClassEditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case UseCaseAsClassEditPart.VISUAL_ID: {
					if (domainElement == null) {
						return null;
					}

					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && UseCaseEditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case DiagramHeaderEditPart.VISUAL_ID:
				case SubjectEditPart.VISUAL_ID:
				case NestedPackageEditPart.VISUAL_ID:
				case ConstraintEditPart.VISUAL_ID:
				case ElementImportEditPart.VISUAL_ID:
				case ExtensionPointEditPart.VISUAL_ID:
				case ExtensionPoint2EditPart.VISUAL_ID:
				case InnerUseCaseEditPart.VISUAL_ID:
				case ActorInPackageEditPart.VISUAL_ID:
				case UseCaseinPackageEditPart.VISUAL_ID:
					if (domainElement == null || visualID != UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case PackageNameEditPart.VISUAL_ID:
				case PackageImportsEditPart.VISUAL_ID:
					if (DiagramHeaderEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActorNameEditPart.VISUAL_ID:
					if (ActorEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActorName2EditPart.VISUAL_ID:
					if (ActorAsRectangleEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case UseCaseNameEditPart.VISUAL_ID:
				case UseCaseExtensionPointsEditPart.VISUAL_ID:
					if (UseCaseEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case UseCaseName2EditPart.VISUAL_ID:
				case UseCaseAsClassExtensionPointsEditPart.VISUAL_ID:
					if (UseCaseAsClassEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case SubjectNameEditPart.VISUAL_ID:
				case SubjectUsecasesEditPart.VISUAL_ID:
					if (SubjectEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case NestedPackageNameEditPart.VISUAL_ID:
				case PackageFramecontentsEditPart.VISUAL_ID:
					if (NestedPackageEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ConstraintNameEditPart.VISUAL_ID:
					if (ConstraintEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case UseCaseName3EditPart.VISUAL_ID:
				case InnerUseCaseExtensionPointsEditPart.VISUAL_ID:
					if (InnerUseCaseEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActorName3EditPart.VISUAL_ID:
					if (ActorInPackageEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case UseCaseName4EditPart.VISUAL_ID:
				case UseCasePointsEditPart.VISUAL_ID:
					if (UseCaseinPackageEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case IncludeLink_fixedEditPart.VISUAL_ID:
					if (IncludeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ExtendsLink_fixedEditPart.VISUAL_ID:
					if (ExtendEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AssociationTargetMultiplicityEditPart.VISUAL_ID:
				case AssociationSourceMultiplicityEditPart.VISUAL_ID:
					if (AssociationEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DependencyNameEditPart.VISUAL_ID:
					if (DependencyEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null || !UMLVisualIDRegistry.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case DiagramHeaderEditPart.VISUAL_ID:
			return DiagramHeaderViewFactory.class;
		case PackageNameEditPart.VISUAL_ID:
			return PackageNameViewFactory.class;
		case ActorEditPart.VISUAL_ID:
			return ActorViewFactory.class;
		case ActorNameEditPart.VISUAL_ID:
			return ActorNameViewFactory.class;
		case ActorAsRectangleEditPart.VISUAL_ID:
			return ActorAsRectangleViewFactory.class;
		case ActorName2EditPart.VISUAL_ID:
			return ActorName2ViewFactory.class;
		case UseCaseEditPart.VISUAL_ID:
			return UseCaseViewFactory.class;
		case UseCaseNameEditPart.VISUAL_ID:
			return UseCaseNameViewFactory.class;
		case UseCaseAsClassEditPart.VISUAL_ID:
			return UseCaseAsClassViewFactory.class;
		case UseCaseName2EditPart.VISUAL_ID:
			return UseCaseName2ViewFactory.class;
		case SubjectEditPart.VISUAL_ID:
			return SubjectViewFactory.class;
		case SubjectNameEditPart.VISUAL_ID:
			return SubjectNameViewFactory.class;
		case NestedPackageEditPart.VISUAL_ID:
			return NestedPackageViewFactory.class;
		case NestedPackageNameEditPart.VISUAL_ID:
			return NestedPackageNameViewFactory.class;
		case ConstraintEditPart.VISUAL_ID:
			return ConstraintViewFactory.class;
		case ConstraintNameEditPart.VISUAL_ID:
			return ConstraintNameViewFactory.class;
		case ElementImportEditPart.VISUAL_ID:
			return ElementImportViewFactory.class;
		case ExtensionPointEditPart.VISUAL_ID:
			return ExtensionPointViewFactory.class;
		case ExtensionPoint2EditPart.VISUAL_ID:
			return ExtensionPoint2ViewFactory.class;
		case InnerUseCaseEditPart.VISUAL_ID:
			return InnerUseCaseViewFactory.class;
		case UseCaseName3EditPart.VISUAL_ID:
			return UseCaseName3ViewFactory.class;
		case ActorInPackageEditPart.VISUAL_ID:
			return ActorInPackageViewFactory.class;
		case ActorName3EditPart.VISUAL_ID:
			return ActorName3ViewFactory.class;
		case UseCaseinPackageEditPart.VISUAL_ID:
			return UseCaseinPackageViewFactory.class;
		case UseCaseName4EditPart.VISUAL_ID:
			return UseCaseName4ViewFactory.class;
		case PackageImportsEditPart.VISUAL_ID:
			return PackageImportsViewFactory.class;
		case UseCaseExtensionPointsEditPart.VISUAL_ID:
			return UseCaseExtensionPointsViewFactory.class;
		case UseCaseAsClassExtensionPointsEditPart.VISUAL_ID:
			return UseCaseAsClassExtensionPointsViewFactory.class;
		case SubjectUsecasesEditPart.VISUAL_ID:
			return SubjectUsecasesViewFactory.class;
		case InnerUseCaseExtensionPointsEditPart.VISUAL_ID:
			return InnerUseCaseExtensionPointsViewFactory.class;
		case PackageFramecontentsEditPart.VISUAL_ID:
			return PackageFramecontentsViewFactory.class;
		case UseCasePointsEditPart.VISUAL_ID:
			return UseCasePointsViewFactory.class;
		case IncludeLink_fixedEditPart.VISUAL_ID:
			return IncludeLink_fixedViewFactory.class;
		case ExtendsLink_fixedEditPart.VISUAL_ID:
			return ExtendsLink_fixedViewFactory.class;
		case AssociationTargetMultiplicityEditPart.VISUAL_ID:
			return AssociationTargetMultiplicityViewFactory.class;
		case AssociationSourceMultiplicityEditPart.VISUAL_ID:
			return AssociationSourceMultiplicityViewFactory.class;
		case DependencyNameEditPart.VISUAL_ID:
			return DependencyNameViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!UMLElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = UMLVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null && visualID != UMLVisualIDRegistry.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		case IncludeEditPart.VISUAL_ID:
			return IncludeViewFactory.class;
		case ExtendEditPart.VISUAL_ID:
			return ExtendViewFactory.class;
		case GeneralizationEditPart.VISUAL_ID:
			return GeneralizationViewFactory.class;
		case AssociationEditPart.VISUAL_ID:
			return AssociationViewFactory.class;
		case ConstraintConstrainedElementEditPart.VISUAL_ID:
			return ConstraintConstrainedElementViewFactory.class;
		case DependencyEditPart.VISUAL_ID:
			return DependencyViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}

}
