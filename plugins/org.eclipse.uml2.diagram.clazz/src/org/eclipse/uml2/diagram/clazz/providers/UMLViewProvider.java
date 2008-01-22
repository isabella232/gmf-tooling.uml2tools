package org.eclipse.uml2.diagram.clazz.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.clazz.edit.parts.*;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.view.factories.*;

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
				if (domainElement != null && visualID != UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
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
				case Package2EditPart.VISUAL_ID: {
					if (domainElement == null) {
						return null;
					}

					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && PackageAsFrameEditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case AssociationClass2EditPart.VISUAL_ID: {
					if (domainElement == null) {
						return null;
					}

					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && AssociationClassRhombEditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case InterfaceEditPart.VISUAL_ID: {
					if (domainElement == null) {
						return null;
					}

					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && Interface2EditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case InstanceSpecification2EditPart.VISUAL_ID: {
					if (domainElement == null) {
						return null;
					}

					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && InstanceSpecification4EditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case Interface2EditPart.VISUAL_ID: {
					if (domainElement == null) {
						return null;
					}

					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && InterfaceEditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case AssociationClassRhombEditPart.VISUAL_ID: {
					if (domainElement == null) {
						return null;
					}

					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && AssociationClass2EditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case PackageAsFrameEditPart.VISUAL_ID: {
					if (domainElement == null) {
						return null;
					}

					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && Package2EditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case InstanceSpecification4EditPart.VISUAL_ID: {
					if (domainElement == null) {
						return null;
					}

					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && InstanceSpecification2EditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case Class2EditPart.VISUAL_ID:
				case DataType2EditPart.VISUAL_ID:
				case PrimitiveType2EditPart.VISUAL_ID:
				case Enumeration2EditPart.VISUAL_ID:
				case ConstraintEditPart.VISUAL_ID:
				case DependencyEditPart.VISUAL_ID:
				case GeneralizationSetEditPart.VISUAL_ID:
				case Package4EditPart.VISUAL_ID:
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
				case RedefinableTemplateSignatureEditPart.VISUAL_ID:
				case Property2EditPart.VISUAL_ID:
				case Operation2EditPart.VISUAL_ID:
				case Property3EditPart.VISUAL_ID:
				case Operation3EditPart.VISUAL_ID:
				case Property4EditPart.VISUAL_ID:
				case Operation4EditPart.VISUAL_ID:
				case EnumerationLiteralEditPart.VISUAL_ID:
				case Property5EditPart.VISUAL_ID:
				case Operation5EditPart.VISUAL_ID:
				case SlotEditPart.VISUAL_ID:
				case Property6EditPart.VISUAL_ID:
				case Operation6EditPart.VISUAL_ID:
				case Class4EditPart.VISUAL_ID:
				case ElementImportEditPart.VISUAL_ID:
				case Package6EditPart.VISUAL_ID:
				case Class5EditPart.VISUAL_ID:
				case Enumeration3EditPart.VISUAL_ID:
				case InstanceSpecification3EditPart.VISUAL_ID:
				case DataType3EditPart.VISUAL_ID:
				case PrimitiveType3EditPart.VISUAL_ID:
					if (domainElement == null || visualID != UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case PackageNameEditPart.VISUAL_ID:
				case PackagePackagesEditPart.VISUAL_ID:
				case PackageClassifiersEditPart.VISUAL_ID:
				case PackageOtherEditPart.VISUAL_ID:
					if (Package2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ClassNameEditPart.VISUAL_ID:
				case ClassStereotypeEditPart.VISUAL_ID:
				case ClassAttributesEditPart.VISUAL_ID:
				case ClassOperationsEditPart.VISUAL_ID:
				case ClassClassesEditPart.VISUAL_ID:
					if (Class2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AssociationClassNameEditPart.VISUAL_ID:
				case AssociationClassAttributesEditPart.VISUAL_ID:
				case AssociationClassOperationsEditPart.VISUAL_ID:
				case AssociationClassClassesEditPart.VISUAL_ID:
					if (AssociationClass2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DataTypeNameEditPart.VISUAL_ID:
				case DataTypeAttributesEditPart.VISUAL_ID:
				case DataTypeOperationsEditPart.VISUAL_ID:
					if (DataType2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PrimitiveTypeNameEditPart.VISUAL_ID:
				case PrimitiveTypeAttributesEditPart.VISUAL_ID:
				case PrimitiveTypeOperationsEditPart.VISUAL_ID:
					if (PrimitiveType2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case EnumerationNameEditPart.VISUAL_ID:
				case EnumerationLiteralsEditPart.VISUAL_ID:
				case EnumerationAttributesEditPart.VISUAL_ID:
				case EnumerationOperationsEditPart.VISUAL_ID:
					if (Enumeration2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InterfaceNameEditPart.VISUAL_ID:
					if (InterfaceEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ConstraintNameEditPart.VISUAL_ID:
					if (ConstraintEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InstanceSpecificationNameEditPart.VISUAL_ID:
				case InstanceSpecificationSlotsEditPart.VISUAL_ID:
					if (InstanceSpecification2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DependencyNameEditPart.VISUAL_ID:
					if (DependencyEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case GeneralizationSetIsCoveringIsDisjointEditPart.VISUAL_ID:
				case GeneralizationSetNameEditPart.VISUAL_ID:
					if (GeneralizationSetEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InterfaceName2EditPart.VISUAL_ID:
				case InterfaceAttributesEditPart.VISUAL_ID:
				case InterfaceOperationsEditPart.VISUAL_ID:
				case InterfaceClassesEditPart.VISUAL_ID:
					if (Interface2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PackageName2EditPart.VISUAL_ID:
				case PackageImportsEditPart.VISUAL_ID:
					if (Package4EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PackageName3EditPart.VISUAL_ID:
				case PackageAsFrameContentsEditPart.VISUAL_ID:
					if (PackageAsFrameEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InstanceSpecificationName3EditPart.VISUAL_ID:
				case InstanceSpecificationQualifiedNameEditPart.VISUAL_ID:
					if (InstanceSpecification4EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PortNameEditPart.VISUAL_ID:
					if (PortEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case TemplateSignatureNode_signatureEditPart.VISUAL_ID:
					if (RedefinableTemplateSignatureEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PackageName4EditPart.VISUAL_ID:
				case PackageAsFrameContents2EditPart.VISUAL_ID:
					if (Package6EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ClassName2EditPart.VISUAL_ID:
				case ClassQualifiedNameEditPart.VISUAL_ID:
				case ClassAttributes2EditPart.VISUAL_ID:
				case ClassOperations2EditPart.VISUAL_ID:
				case ClassClasses2EditPart.VISUAL_ID:
					if (Class5EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case EnumerationName2EditPart.VISUAL_ID:
				case EnumerationLiterals2EditPart.VISUAL_ID:
				case EnumerationAttributes2EditPart.VISUAL_ID:
				case EnumerationOperations2EditPart.VISUAL_ID:
					if (Enumeration3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InstanceSpecificationName2EditPart.VISUAL_ID:
				case InstanceSpecificationSlots2EditPart.VISUAL_ID:
					if (InstanceSpecification3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DataTypeName2EditPart.VISUAL_ID:
				case DataTypeAttributes2EditPart.VISUAL_ID:
				case DataTypeOperations2EditPart.VISUAL_ID:
					if (DataType3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PrimitiveTypeName2EditPart.VISUAL_ID:
				case PrimitiveTypeAttributes2EditPart.VISUAL_ID:
				case PrimitiveTypeOperations2EditPart.VISUAL_ID:
					if (PrimitiveType3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DependencyName2EditPart.VISUAL_ID:
				case DependencyName3EditPart.VISUAL_ID:
					if (Dependency2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PropertyNameEditPart.VISUAL_ID:
				case PropertyName2EditPart.VISUAL_ID:
					if (Property7EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AssociationNameEditPart.VISUAL_ID:
				case AssociationName2EditPart.VISUAL_ID:
				case AssociationName3EditPart.VISUAL_ID:
				case AssociationName4EditPart.VISUAL_ID:
				case AssociationName5EditPart.VISUAL_ID:
				case AssociationName6EditPart.VISUAL_ID:
				case AssociationName7EditPart.VISUAL_ID:
					if (AssociationEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case RealizationNameEditPart.VISUAL_ID:
					if (RealizationEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case TemplateBinding_BindLabelEditPart.VISUAL_ID:
				case LabelEditPart.VISUAL_ID:
					if (TemplateBindingEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
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
		case Package2EditPart.VISUAL_ID:
			return Package2ViewFactory.class;
		case PackageNameEditPart.VISUAL_ID:
			return PackageNameViewFactory.class;
		case Class2EditPart.VISUAL_ID:
			return Class2ViewFactory.class;
		case ClassNameEditPart.VISUAL_ID:
			return ClassNameViewFactory.class;
		case ClassStereotypeEditPart.VISUAL_ID:
			return ClassStereotypeViewFactory.class;
		case AssociationClass2EditPart.VISUAL_ID:
			return AssociationClass2ViewFactory.class;
		case AssociationClassNameEditPart.VISUAL_ID:
			return AssociationClassNameViewFactory.class;
		case DataType2EditPart.VISUAL_ID:
			return DataType2ViewFactory.class;
		case DataTypeNameEditPart.VISUAL_ID:
			return DataTypeNameViewFactory.class;
		case PrimitiveType2EditPart.VISUAL_ID:
			return PrimitiveType2ViewFactory.class;
		case PrimitiveTypeNameEditPart.VISUAL_ID:
			return PrimitiveTypeNameViewFactory.class;
		case Enumeration2EditPart.VISUAL_ID:
			return Enumeration2ViewFactory.class;
		case EnumerationNameEditPart.VISUAL_ID:
			return EnumerationNameViewFactory.class;
		case InterfaceEditPart.VISUAL_ID:
			return InterfaceViewFactory.class;
		case InterfaceNameEditPart.VISUAL_ID:
			return InterfaceNameViewFactory.class;
		case ConstraintEditPart.VISUAL_ID:
			return ConstraintViewFactory.class;
		case ConstraintNameEditPart.VISUAL_ID:
			return ConstraintNameViewFactory.class;
		case InstanceSpecification2EditPart.VISUAL_ID:
			return InstanceSpecification2ViewFactory.class;
		case InstanceSpecificationNameEditPart.VISUAL_ID:
			return InstanceSpecificationNameViewFactory.class;
		case DependencyEditPart.VISUAL_ID:
			return DependencyViewFactory.class;
		case DependencyNameEditPart.VISUAL_ID:
			return DependencyNameViewFactory.class;
		case GeneralizationSetEditPart.VISUAL_ID:
			return GeneralizationSetViewFactory.class;
		case GeneralizationSetIsCoveringIsDisjointEditPart.VISUAL_ID:
			return GeneralizationSetIsCoveringIsDisjointViewFactory.class;
		case GeneralizationSetNameEditPart.VISUAL_ID:
			return GeneralizationSetNameViewFactory.class;
		case Interface2EditPart.VISUAL_ID:
			return Interface2ViewFactory.class;
		case InterfaceName2EditPart.VISUAL_ID:
			return InterfaceName2ViewFactory.class;
		case Package4EditPart.VISUAL_ID:
			return Package4ViewFactory.class;
		case PackageName2EditPart.VISUAL_ID:
			return PackageName2ViewFactory.class;
		case AssociationClassRhombEditPart.VISUAL_ID:
			return AssociationClassRhombViewFactory.class;
		case PackageAsFrameEditPart.VISUAL_ID:
			return PackageAsFrameViewFactory.class;
		case PackageName3EditPart.VISUAL_ID:
			return PackageName3ViewFactory.class;
		case InstanceSpecification4EditPart.VISUAL_ID:
			return InstanceSpecification4ViewFactory.class;
		case InstanceSpecificationName3EditPart.VISUAL_ID:
			return InstanceSpecificationName3ViewFactory.class;
		case InstanceSpecificationQualifiedNameEditPart.VISUAL_ID:
			return InstanceSpecificationQualifiedNameViewFactory.class;
		case Package3EditPart.VISUAL_ID:
			return Package3ViewFactory.class;
		case ClassEditPart.VISUAL_ID:
			return ClassViewFactory.class;
		case DataTypeEditPart.VISUAL_ID:
			return DataTypeViewFactory.class;
		case PrimitiveTypeEditPart.VISUAL_ID:
			return PrimitiveTypeViewFactory.class;
		case EnumerationEditPart.VISUAL_ID:
			return EnumerationViewFactory.class;
		case AssociationClassEditPart.VISUAL_ID:
			return AssociationClassViewFactory.class;
		case InstanceSpecificationEditPart.VISUAL_ID:
			return InstanceSpecificationViewFactory.class;
		case PropertyEditPart.VISUAL_ID:
			return PropertyViewFactory.class;
		case OperationEditPart.VISUAL_ID:
			return OperationViewFactory.class;
		case Class3EditPart.VISUAL_ID:
			return Class3ViewFactory.class;
		case PortEditPart.VISUAL_ID:
			return PortViewFactory.class;
		case PortNameEditPart.VISUAL_ID:
			return PortNameViewFactory.class;
		case RedefinableTemplateSignatureEditPart.VISUAL_ID:
			return RedefinableTemplateSignatureViewFactory.class;
		case TemplateSignatureNode_signatureEditPart.VISUAL_ID:
			return TemplateSignatureNode_signatureViewFactory.class;
		case Property2EditPart.VISUAL_ID:
			return Property2ViewFactory.class;
		case Operation2EditPart.VISUAL_ID:
			return Operation2ViewFactory.class;
		case Property3EditPart.VISUAL_ID:
			return Property3ViewFactory.class;
		case Operation3EditPart.VISUAL_ID:
			return Operation3ViewFactory.class;
		case Property4EditPart.VISUAL_ID:
			return Property4ViewFactory.class;
		case Operation4EditPart.VISUAL_ID:
			return Operation4ViewFactory.class;
		case EnumerationLiteralEditPart.VISUAL_ID:
			return EnumerationLiteralViewFactory.class;
		case Property5EditPart.VISUAL_ID:
			return Property5ViewFactory.class;
		case Operation5EditPart.VISUAL_ID:
			return Operation5ViewFactory.class;
		case SlotEditPart.VISUAL_ID:
			return SlotViewFactory.class;
		case Property6EditPart.VISUAL_ID:
			return Property6ViewFactory.class;
		case Operation6EditPart.VISUAL_ID:
			return Operation6ViewFactory.class;
		case Class4EditPart.VISUAL_ID:
			return Class4ViewFactory.class;
		case ElementImportEditPart.VISUAL_ID:
			return ElementImportViewFactory.class;
		case Package6EditPart.VISUAL_ID:
			return Package6ViewFactory.class;
		case PackageName4EditPart.VISUAL_ID:
			return PackageName4ViewFactory.class;
		case Class5EditPart.VISUAL_ID:
			return Class5ViewFactory.class;
		case ClassName2EditPart.VISUAL_ID:
			return ClassName2ViewFactory.class;
		case ClassQualifiedNameEditPart.VISUAL_ID:
			return ClassQualifiedNameViewFactory.class;
		case Enumeration3EditPart.VISUAL_ID:
			return Enumeration3ViewFactory.class;
		case EnumerationName2EditPart.VISUAL_ID:
			return EnumerationName2ViewFactory.class;
		case InstanceSpecification3EditPart.VISUAL_ID:
			return InstanceSpecification3ViewFactory.class;
		case InstanceSpecificationName2EditPart.VISUAL_ID:
			return InstanceSpecificationName2ViewFactory.class;
		case DataType3EditPart.VISUAL_ID:
			return DataType3ViewFactory.class;
		case DataTypeName2EditPart.VISUAL_ID:
			return DataTypeName2ViewFactory.class;
		case PrimitiveType3EditPart.VISUAL_ID:
			return PrimitiveType3ViewFactory.class;
		case PrimitiveTypeName2EditPart.VISUAL_ID:
			return PrimitiveTypeName2ViewFactory.class;
		case PackagePackagesEditPart.VISUAL_ID:
			return PackagePackagesViewFactory.class;
		case PackageClassifiersEditPart.VISUAL_ID:
			return PackageClassifiersViewFactory.class;
		case PackageOtherEditPart.VISUAL_ID:
			return PackageOtherViewFactory.class;
		case ClassAttributesEditPart.VISUAL_ID:
			return ClassAttributesViewFactory.class;
		case ClassOperationsEditPart.VISUAL_ID:
			return ClassOperationsViewFactory.class;
		case ClassClassesEditPart.VISUAL_ID:
			return ClassClassesViewFactory.class;
		case AssociationClassAttributesEditPart.VISUAL_ID:
			return AssociationClassAttributesViewFactory.class;
		case AssociationClassOperationsEditPart.VISUAL_ID:
			return AssociationClassOperationsViewFactory.class;
		case AssociationClassClassesEditPart.VISUAL_ID:
			return AssociationClassClassesViewFactory.class;
		case DataTypeAttributesEditPart.VISUAL_ID:
			return DataTypeAttributesViewFactory.class;
		case DataTypeOperationsEditPart.VISUAL_ID:
			return DataTypeOperationsViewFactory.class;
		case PrimitiveTypeAttributesEditPart.VISUAL_ID:
			return PrimitiveTypeAttributesViewFactory.class;
		case PrimitiveTypeOperationsEditPart.VISUAL_ID:
			return PrimitiveTypeOperationsViewFactory.class;
		case EnumerationLiteralsEditPart.VISUAL_ID:
			return EnumerationLiteralsViewFactory.class;
		case EnumerationAttributesEditPart.VISUAL_ID:
			return EnumerationAttributesViewFactory.class;
		case EnumerationOperationsEditPart.VISUAL_ID:
			return EnumerationOperationsViewFactory.class;
		case InstanceSpecificationSlotsEditPart.VISUAL_ID:
			return InstanceSpecificationSlotsViewFactory.class;
		case InterfaceAttributesEditPart.VISUAL_ID:
			return InterfaceAttributesViewFactory.class;
		case InterfaceOperationsEditPart.VISUAL_ID:
			return InterfaceOperationsViewFactory.class;
		case InterfaceClassesEditPart.VISUAL_ID:
			return InterfaceClassesViewFactory.class;
		case PackageImportsEditPart.VISUAL_ID:
			return PackageImportsViewFactory.class;
		case PackageAsFrameContentsEditPart.VISUAL_ID:
			return PackageAsFrameContentsViewFactory.class;
		case PackageAsFrameContents2EditPart.VISUAL_ID:
			return PackageAsFrameContents2ViewFactory.class;
		case ClassAttributes2EditPart.VISUAL_ID:
			return ClassAttributes2ViewFactory.class;
		case ClassOperations2EditPart.VISUAL_ID:
			return ClassOperations2ViewFactory.class;
		case ClassClasses2EditPart.VISUAL_ID:
			return ClassClasses2ViewFactory.class;
		case EnumerationLiterals2EditPart.VISUAL_ID:
			return EnumerationLiterals2ViewFactory.class;
		case EnumerationAttributes2EditPart.VISUAL_ID:
			return EnumerationAttributes2ViewFactory.class;
		case EnumerationOperations2EditPart.VISUAL_ID:
			return EnumerationOperations2ViewFactory.class;
		case InstanceSpecificationSlots2EditPart.VISUAL_ID:
			return InstanceSpecificationSlots2ViewFactory.class;
		case DataTypeAttributes2EditPart.VISUAL_ID:
			return DataTypeAttributes2ViewFactory.class;
		case DataTypeOperations2EditPart.VISUAL_ID:
			return DataTypeOperations2ViewFactory.class;
		case PrimitiveTypeAttributes2EditPart.VISUAL_ID:
			return PrimitiveTypeAttributes2ViewFactory.class;
		case PrimitiveTypeOperations2EditPart.VISUAL_ID:
			return PrimitiveTypeOperations2ViewFactory.class;
		case DependencyName2EditPart.VISUAL_ID:
			return DependencyName2ViewFactory.class;
		case DependencyName3EditPart.VISUAL_ID:
			return DependencyName3ViewFactory.class;
		case PropertyNameEditPart.VISUAL_ID:
			return PropertyNameViewFactory.class;
		case PropertyName2EditPart.VISUAL_ID:
			return PropertyName2ViewFactory.class;
		case AssociationNameEditPart.VISUAL_ID:
			return AssociationNameViewFactory.class;
		case AssociationName2EditPart.VISUAL_ID:
			return AssociationName2ViewFactory.class;
		case AssociationName3EditPart.VISUAL_ID:
			return AssociationName3ViewFactory.class;
		case AssociationName4EditPart.VISUAL_ID:
			return AssociationName4ViewFactory.class;
		case AssociationName5EditPart.VISUAL_ID:
			return AssociationName5ViewFactory.class;
		case AssociationName6EditPart.VISUAL_ID:
			return AssociationName6ViewFactory.class;
		case AssociationName7EditPart.VISUAL_ID:
			return AssociationName7ViewFactory.class;
		case RealizationNameEditPart.VISUAL_ID:
			return RealizationNameViewFactory.class;
		case TemplateBinding_BindLabelEditPart.VISUAL_ID:
			return TemplateBinding_BindLabelViewFactory.class;
		case LabelEditPart.VISUAL_ID:
			return LabelViewFactory.class;
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
		case GeneralizationEditPart.VISUAL_ID:
			return GeneralizationViewFactory.class;
		case Dependency2EditPart.VISUAL_ID:
			return Dependency2ViewFactory.class;
		case Property7EditPart.VISUAL_ID:
			return Property7ViewFactory.class;
		case ConstraintConstrainedElementEditPart.VISUAL_ID:
			return ConstraintConstrainedElementViewFactory.class;
		case AssociationEditPart.VISUAL_ID:
			return AssociationViewFactory.class;
		case DependencySupplierEditPart.VISUAL_ID:
			return DependencySupplierViewFactory.class;
		case DependencyClientEditPart.VISUAL_ID:
			return DependencyClientViewFactory.class;
		case InterfaceRealizationEditPart.VISUAL_ID:
			return InterfaceRealizationViewFactory.class;
		case RealizationEditPart.VISUAL_ID:
			return RealizationViewFactory.class;
		case Generalization2EditPart.VISUAL_ID:
			return Generalization2ViewFactory.class;
		case GeneralizationGeneralEditPart.VISUAL_ID:
			return GeneralizationGeneralViewFactory.class;
		case UsageEditPart.VISUAL_ID:
			return UsageViewFactory.class;
		case AssociationClassConnectorEditPart.VISUAL_ID:
			return AssociationClassConnectorViewFactory.class;
		case AssociationInstanceEditPart.VISUAL_ID:
			return AssociationInstanceViewFactory.class;
		case TemplateBindingEditPart.VISUAL_ID:
			return TemplateBindingViewFactory.class;
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
