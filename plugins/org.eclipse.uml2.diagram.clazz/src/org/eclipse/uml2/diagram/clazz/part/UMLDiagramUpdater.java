package org.eclipse.uml2.diagram.clazz.part;

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
import org.eclipse.uml2.diagram.clazz.conventions.AssociationEndConvention;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClass2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassClassesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassOperationsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassClassesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassOperationsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataType2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataTypeAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataTypeEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataTypeOperationsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Dependency2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyClientEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencySupplierEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Enumeration2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationLiteralEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationLiteralsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationOperationsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Generalization2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationGeneralEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationSetEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecification2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecificationSlotsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceClassesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceOperationsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation5EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation6EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.OperationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageClassifiersEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageOtherEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackagePackagesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveType2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveTypeAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveTypeOperationsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property5EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property6EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property7EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.RealizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.RedefinableTemplateSignatureEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.SlotEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.UsageEditPart;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.TemplateSignature;
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
		return view.getEAnnotation("Shortcut") != null && view.isSetElement() && (view.getElement() == null || view.getElement().eIsProxy()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case Class2EditPart.VISUAL_ID:
			return getClass_2001SemanticChildren(view);
		case AssociationClass2EditPart.VISUAL_ID:
			return getAssociationClass_2007SemanticChildren(view);
		case DataType2EditPart.VISUAL_ID:
			return getDataType_2004SemanticChildren(view);
		case PrimitiveType2EditPart.VISUAL_ID:
			return getPrimitiveType_2005SemanticChildren(view);
		case Enumeration2EditPart.VISUAL_ID:
			return getEnumeration_2003SemanticChildren(view);
		case PackagePackagesEditPart.VISUAL_ID:
			return getPackagePackages_7010SemanticChildren(view);
		case PackageClassifiersEditPart.VISUAL_ID:
			return getPackageClassifiers_7011SemanticChildren(view);
		case PackageOtherEditPart.VISUAL_ID:
			return getPackageOther_7012SemanticChildren(view);
		case ClassAttributesEditPart.VISUAL_ID:
			return getClassAttributes_7001SemanticChildren(view);
		case ClassOperationsEditPart.VISUAL_ID:
			return getClassOperations_7002SemanticChildren(view);
		case ClassClassesEditPart.VISUAL_ID:
			return getClassClasses_7003SemanticChildren(view);
		case AssociationClassAttributesEditPart.VISUAL_ID:
			return getAssociationClassAttributes_7024SemanticChildren(view);
		case AssociationClassOperationsEditPart.VISUAL_ID:
			return getAssociationClassOperations_7025SemanticChildren(view);
		case AssociationClassClassesEditPart.VISUAL_ID:
			return getAssociationClassClasses_7026SemanticChildren(view);
		case DataTypeAttributesEditPart.VISUAL_ID:
			return getDataTypeAttributes_7017SemanticChildren(view);
		case DataTypeOperationsEditPart.VISUAL_ID:
			return getDataTypeOperations_7018SemanticChildren(view);
		case PrimitiveTypeAttributesEditPart.VISUAL_ID:
			return getPrimitiveTypeAttributes_7020SemanticChildren(view);
		case PrimitiveTypeOperationsEditPart.VISUAL_ID:
			return getPrimitiveTypeOperations_7021SemanticChildren(view);
		case EnumerationLiteralsEditPart.VISUAL_ID:
			return getEnumerationLiterals_7013SemanticChildren(view);
		case EnumerationAttributesEditPart.VISUAL_ID:
			return getEnumerationAttributes_7014SemanticChildren(view);
		case EnumerationOperationsEditPart.VISUAL_ID:
			return getEnumerationOperations_7015SemanticChildren(view);
		case InstanceSpecificationSlotsEditPart.VISUAL_ID:
			return getInstanceSpecificationSlots_7028SemanticChildren(view);
		case InterfaceAttributesEditPart.VISUAL_ID:
			return getInterfaceAttributes_7029SemanticChildren(view);
		case InterfaceOperationsEditPart.VISUAL_ID:
			return getInterfaceOperations_7030SemanticChildren(view);
		case InterfaceClassesEditPart.VISUAL_ID:
			return getInterfaceClasses_7031SemanticChildren(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClass_2001SemanticChildren(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOwnedAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		{
			TemplateSignature childElement = modelElement.getOwnedTemplateSignature();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RedefinableTemplateSignatureEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociationClass_2007SemanticChildren(View view) {
		AssociationClass modelElement = (AssociationClass) view.getElement();
		List result = new LinkedList();
		{
			TemplateSignature childElement = modelElement.getOwnedTemplateSignature();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RedefinableTemplateSignatureEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataType_2004SemanticChildren(View view) {
		DataType modelElement = (DataType) view.getElement();
		List result = new LinkedList();
		{
			TemplateSignature childElement = modelElement.getOwnedTemplateSignature();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RedefinableTemplateSignatureEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveType_2005SemanticChildren(View view) {
		PrimitiveType modelElement = (PrimitiveType) view.getElement();
		List result = new LinkedList();
		{
			TemplateSignature childElement = modelElement.getOwnedTemplateSignature();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RedefinableTemplateSignatureEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnumeration_2003SemanticChildren(View view) {
		Enumeration modelElement = (Enumeration) view.getElement();
		List result = new LinkedList();
		{
			TemplateSignature childElement = modelElement.getOwnedTemplateSignature();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == RedefinableTemplateSignatureEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackagePackages_7010SemanticChildren(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getNestedPackages().iterator(); it.hasNext();) {
			Package childElement = (Package) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Package3EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackageClassifiers_7011SemanticChildren(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOwnedTypes().iterator(); it.hasNext();) {
			Type childElement = (Type) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ClassEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if (visualID == DataTypeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if (visualID == PrimitiveTypeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if (visualID == EnumerationEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if (visualID == AssociationClassEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackageOther_7012SemanticChildren(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getPackagedElements().iterator(); it.hasNext();) {
			PackageableElement childElement = (PackageableElement) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InstanceSpecificationEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassAttributes_7001SemanticChildren(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOwnedAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PropertyEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassOperations_7002SemanticChildren(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOwnedOperations().iterator(); it.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassClasses_7003SemanticChildren(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getNestedClassifiers().iterator(); it.hasNext();) {
			Classifier childElement = (Classifier) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Class3EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociationClassAttributes_7024SemanticChildren(View view) {
		AssociationClass modelElement = (AssociationClass) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOwnedAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Property2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociationClassOperations_7025SemanticChildren(View view) {
		AssociationClass modelElement = (AssociationClass) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOwnedOperations().iterator(); it.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Operation2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociationClassClasses_7026SemanticChildren(View view) {
		AssociationClass modelElement = (AssociationClass) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getNestedClassifiers().iterator(); it.hasNext();) {
			Classifier childElement = (Classifier) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Class3EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataTypeAttributes_7017SemanticChildren(View view) {
		DataType modelElement = (DataType) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOwnedAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Property3EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataTypeOperations_7018SemanticChildren(View view) {
		DataType modelElement = (DataType) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOwnedOperations().iterator(); it.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Operation3EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveTypeAttributes_7020SemanticChildren(View view) {
		PrimitiveType modelElement = (PrimitiveType) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOwnedAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Property4EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveTypeOperations_7021SemanticChildren(View view) {
		PrimitiveType modelElement = (PrimitiveType) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOwnedOperations().iterator(); it.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Operation4EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnumerationLiterals_7013SemanticChildren(View view) {
		Enumeration modelElement = (Enumeration) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOwnedLiterals().iterator(); it.hasNext();) {
			EnumerationLiteral childElement = (EnumerationLiteral) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EnumerationLiteralEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnumerationAttributes_7014SemanticChildren(View view) {
		Enumeration modelElement = (Enumeration) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOwnedAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Property5EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnumerationOperations_7015SemanticChildren(View view) {
		Enumeration modelElement = (Enumeration) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOwnedOperations().iterator(); it.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Operation5EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInstanceSpecificationSlots_7028SemanticChildren(View view) {
		InstanceSpecification modelElement = (InstanceSpecification) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getSlots().iterator(); it.hasNext();) {
			Slot childElement = (Slot) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SlotEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterfaceAttributes_7029SemanticChildren(View view) {
		Interface modelElement = (Interface) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOwnedAttributes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Property6EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterfaceOperations_7030SemanticChildren(View view) {
		Interface modelElement = (Interface) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOwnedOperations().iterator(); it.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Operation6EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterfaceClasses_7031SemanticChildren(View view) {
		Interface modelElement = (Interface) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getNestedClassifiers().iterator(); it.hasNext();) {
			Classifier childElement = (Classifier) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Class4EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_1000SemanticChildren(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getNestedPackages().iterator(); it.hasNext();) {
			Package childElement = (Package) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Package2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getOwnedTypes().iterator(); it.hasNext();) {
			Type childElement = (Type) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Class2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if (visualID == AssociationClass2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if (visualID == DataType2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if (visualID == PrimitiveType2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if (visualID == Enumeration2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if (visualID == InterfaceEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if (visualID == Interface2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator it = modelElement.getPackagedElements().iterator(); it.hasNext();) {
			PackageableElement childElement = (PackageableElement) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConstraintEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if (visualID == InstanceSpecification2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if (visualID == DependencyEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
			if (visualID == GeneralizationSetEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case Package2EditPart.VISUAL_ID:
			return getPackage_2002ContainedLinks(view);
		case Class2EditPart.VISUAL_ID:
			return getClass_2001ContainedLinks(view);
		case AssociationClass2EditPart.VISUAL_ID:
			return getAssociationClass_2007ContainedLinks(view);
		case DataType2EditPart.VISUAL_ID:
			return getDataType_2004ContainedLinks(view);
		case PrimitiveType2EditPart.VISUAL_ID:
			return getPrimitiveType_2005ContainedLinks(view);
		case Enumeration2EditPart.VISUAL_ID:
			return getEnumeration_2003ContainedLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_2010ContainedLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_2006ContainedLinks(view);
		case InstanceSpecification2EditPart.VISUAL_ID:
			return getInstanceSpecification_2008ContainedLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_2009ContainedLinks(view);
		case GeneralizationSetEditPart.VISUAL_ID:
			return getGeneralizationSet_2012ContainedLinks(view);
		case Interface2EditPart.VISUAL_ID:
			return getInterface_2013ContainedLinks(view);
		case Package3EditPart.VISUAL_ID:
			return getPackage_3006ContainedLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_3007ContainedLinks(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_3008ContainedLinks(view);
		case PrimitiveTypeEditPart.VISUAL_ID:
			return getPrimitiveType_3009ContainedLinks(view);
		case EnumerationEditPart.VISUAL_ID:
			return getEnumeration_3011ContainedLinks(view);
		case AssociationClassEditPart.VISUAL_ID:
			return getAssociationClass_3012ContainedLinks(view);
		case InstanceSpecificationEditPart.VISUAL_ID:
			return getInstanceSpecification_3013ContainedLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3001ContainedLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3002ContainedLinks(view);
		case Class3EditPart.VISUAL_ID:
			return getClass_3003ContainedLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3025ContainedLinks(view);
		case RedefinableTemplateSignatureEditPart.VISUAL_ID:
			return getRedefinableTemplateSignature_3027ContainedLinks(view);
		case Property2EditPart.VISUAL_ID:
			return getProperty_3019ContainedLinks(view);
		case Operation2EditPart.VISUAL_ID:
			return getOperation_3020ContainedLinks(view);
		case Property3EditPart.VISUAL_ID:
			return getProperty_3014ContainedLinks(view);
		case Operation3EditPart.VISUAL_ID:
			return getOperation_3015ContainedLinks(view);
		case Property4EditPart.VISUAL_ID:
			return getProperty_3021ContainedLinks(view);
		case Operation4EditPart.VISUAL_ID:
			return getOperation_3022ContainedLinks(view);
		case EnumerationLiteralEditPart.VISUAL_ID:
			return getEnumerationLiteral_3016ContainedLinks(view);
		case Property5EditPart.VISUAL_ID:
			return getProperty_3023ContainedLinks(view);
		case Operation5EditPart.VISUAL_ID:
			return getOperation_3024ContainedLinks(view);
		case SlotEditPart.VISUAL_ID:
			return getSlot_3017ContainedLinks(view);
		case Property6EditPart.VISUAL_ID:
			return getProperty_3028ContainedLinks(view);
		case Operation6EditPart.VISUAL_ID:
			return getOperation_3029ContainedLinks(view);
		case Class4EditPart.VISUAL_ID:
			return getClass_3030ContainedLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4001ContainedLinks(view);
		case Dependency2EditPart.VISUAL_ID:
			return getDependency_4002ContainedLinks(view);
		case Property7EditPart.VISUAL_ID:
			return getProperty_4003ContainedLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4005ContainedLinks(view);
		case InterfaceRealizationEditPart.VISUAL_ID:
			return getInterfaceRealization_4008ContainedLinks(view);
		case RealizationEditPart.VISUAL_ID:
			return getRealization_4010ContainedLinks(view);
		case Generalization2EditPart.VISUAL_ID:
			return getGeneralization_4011ContainedLinks(view);
		case UsageEditPart.VISUAL_ID:
			return getUsage_4013ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case Package2EditPart.VISUAL_ID:
			return getPackage_2002IncomingLinks(view);
		case Class2EditPart.VISUAL_ID:
			return getClass_2001IncomingLinks(view);
		case AssociationClass2EditPart.VISUAL_ID:
			return getAssociationClass_2007IncomingLinks(view);
		case DataType2EditPart.VISUAL_ID:
			return getDataType_2004IncomingLinks(view);
		case PrimitiveType2EditPart.VISUAL_ID:
			return getPrimitiveType_2005IncomingLinks(view);
		case Enumeration2EditPart.VISUAL_ID:
			return getEnumeration_2003IncomingLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_2010IncomingLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_2006IncomingLinks(view);
		case InstanceSpecification2EditPart.VISUAL_ID:
			return getInstanceSpecification_2008IncomingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_2009IncomingLinks(view);
		case GeneralizationSetEditPart.VISUAL_ID:
			return getGeneralizationSet_2012IncomingLinks(view);
		case Interface2EditPart.VISUAL_ID:
			return getInterface_2013IncomingLinks(view);
		case Package3EditPart.VISUAL_ID:
			return getPackage_3006IncomingLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_3007IncomingLinks(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_3008IncomingLinks(view);
		case PrimitiveTypeEditPart.VISUAL_ID:
			return getPrimitiveType_3009IncomingLinks(view);
		case EnumerationEditPart.VISUAL_ID:
			return getEnumeration_3011IncomingLinks(view);
		case AssociationClassEditPart.VISUAL_ID:
			return getAssociationClass_3012IncomingLinks(view);
		case InstanceSpecificationEditPart.VISUAL_ID:
			return getInstanceSpecification_3013IncomingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3001IncomingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3002IncomingLinks(view);
		case Class3EditPart.VISUAL_ID:
			return getClass_3003IncomingLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3025IncomingLinks(view);
		case RedefinableTemplateSignatureEditPart.VISUAL_ID:
			return getRedefinableTemplateSignature_3027IncomingLinks(view);
		case Property2EditPart.VISUAL_ID:
			return getProperty_3019IncomingLinks(view);
		case Operation2EditPart.VISUAL_ID:
			return getOperation_3020IncomingLinks(view);
		case Property3EditPart.VISUAL_ID:
			return getProperty_3014IncomingLinks(view);
		case Operation3EditPart.VISUAL_ID:
			return getOperation_3015IncomingLinks(view);
		case Property4EditPart.VISUAL_ID:
			return getProperty_3021IncomingLinks(view);
		case Operation4EditPart.VISUAL_ID:
			return getOperation_3022IncomingLinks(view);
		case EnumerationLiteralEditPart.VISUAL_ID:
			return getEnumerationLiteral_3016IncomingLinks(view);
		case Property5EditPart.VISUAL_ID:
			return getProperty_3023IncomingLinks(view);
		case Operation5EditPart.VISUAL_ID:
			return getOperation_3024IncomingLinks(view);
		case SlotEditPart.VISUAL_ID:
			return getSlot_3017IncomingLinks(view);
		case Property6EditPart.VISUAL_ID:
			return getProperty_3028IncomingLinks(view);
		case Operation6EditPart.VISUAL_ID:
			return getOperation_3029IncomingLinks(view);
		case Class4EditPart.VISUAL_ID:
			return getClass_3030IncomingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4001IncomingLinks(view);
		case Dependency2EditPart.VISUAL_ID:
			return getDependency_4002IncomingLinks(view);
		case Property7EditPart.VISUAL_ID:
			return getProperty_4003IncomingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4005IncomingLinks(view);
		case InterfaceRealizationEditPart.VISUAL_ID:
			return getInterfaceRealization_4008IncomingLinks(view);
		case RealizationEditPart.VISUAL_ID:
			return getRealization_4010IncomingLinks(view);
		case Generalization2EditPart.VISUAL_ID:
			return getGeneralization_4011IncomingLinks(view);
		case UsageEditPart.VISUAL_ID:
			return getUsage_4013IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case Package2EditPart.VISUAL_ID:
			return getPackage_2002OutgoingLinks(view);
		case Class2EditPart.VISUAL_ID:
			return getClass_2001OutgoingLinks(view);
		case AssociationClass2EditPart.VISUAL_ID:
			return getAssociationClass_2007OutgoingLinks(view);
		case DataType2EditPart.VISUAL_ID:
			return getDataType_2004OutgoingLinks(view);
		case PrimitiveType2EditPart.VISUAL_ID:
			return getPrimitiveType_2005OutgoingLinks(view);
		case Enumeration2EditPart.VISUAL_ID:
			return getEnumeration_2003OutgoingLinks(view);
		case InterfaceEditPart.VISUAL_ID:
			return getInterface_2010OutgoingLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_2006OutgoingLinks(view);
		case InstanceSpecification2EditPart.VISUAL_ID:
			return getInstanceSpecification_2008OutgoingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_2009OutgoingLinks(view);
		case GeneralizationSetEditPart.VISUAL_ID:
			return getGeneralizationSet_2012OutgoingLinks(view);
		case Interface2EditPart.VISUAL_ID:
			return getInterface_2013OutgoingLinks(view);
		case Package3EditPart.VISUAL_ID:
			return getPackage_3006OutgoingLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_3007OutgoingLinks(view);
		case DataTypeEditPart.VISUAL_ID:
			return getDataType_3008OutgoingLinks(view);
		case PrimitiveTypeEditPart.VISUAL_ID:
			return getPrimitiveType_3009OutgoingLinks(view);
		case EnumerationEditPart.VISUAL_ID:
			return getEnumeration_3011OutgoingLinks(view);
		case AssociationClassEditPart.VISUAL_ID:
			return getAssociationClass_3012OutgoingLinks(view);
		case InstanceSpecificationEditPart.VISUAL_ID:
			return getInstanceSpecification_3013OutgoingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3001OutgoingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3002OutgoingLinks(view);
		case Class3EditPart.VISUAL_ID:
			return getClass_3003OutgoingLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3025OutgoingLinks(view);
		case RedefinableTemplateSignatureEditPart.VISUAL_ID:
			return getRedefinableTemplateSignature_3027OutgoingLinks(view);
		case Property2EditPart.VISUAL_ID:
			return getProperty_3019OutgoingLinks(view);
		case Operation2EditPart.VISUAL_ID:
			return getOperation_3020OutgoingLinks(view);
		case Property3EditPart.VISUAL_ID:
			return getProperty_3014OutgoingLinks(view);
		case Operation3EditPart.VISUAL_ID:
			return getOperation_3015OutgoingLinks(view);
		case Property4EditPart.VISUAL_ID:
			return getProperty_3021OutgoingLinks(view);
		case Operation4EditPart.VISUAL_ID:
			return getOperation_3022OutgoingLinks(view);
		case EnumerationLiteralEditPart.VISUAL_ID:
			return getEnumerationLiteral_3016OutgoingLinks(view);
		case Property5EditPart.VISUAL_ID:
			return getProperty_3023OutgoingLinks(view);
		case Operation5EditPart.VISUAL_ID:
			return getOperation_3024OutgoingLinks(view);
		case SlotEditPart.VISUAL_ID:
			return getSlot_3017OutgoingLinks(view);
		case Property6EditPart.VISUAL_ID:
			return getProperty_3028OutgoingLinks(view);
		case Operation6EditPart.VISUAL_ID:
			return getOperation_3029OutgoingLinks(view);
		case Class4EditPart.VISUAL_ID:
			return getClass_3030OutgoingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4001OutgoingLinks(view);
		case Dependency2EditPart.VISUAL_ID:
			return getDependency_4002OutgoingLinks(view);
		case Property7EditPart.VISUAL_ID:
			return getProperty_4003OutgoingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4005OutgoingLinks(view);
		case InterfaceRealizationEditPart.VISUAL_ID:
			return getInterfaceRealization_4008OutgoingLinks(view);
		case RealizationEditPart.VISUAL_ID:
			return getRealization_4010OutgoingLinks(view);
		case Generalization2EditPart.VISUAL_ID:
			return getGeneralization_4011OutgoingLinks(view);
		case UsageEditPart.VISUAL_ID:
			return getUsage_4013OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPackage_2002ContainedLinks(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_2001ContainedLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InterfaceRealization_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociationClass_2007ContainedLinks(View view) {
		AssociationClass modelElement = (AssociationClass) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Property_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InterfaceRealization_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataType_2004ContainedLinks(View view) {
		DataType modelElement = (DataType) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveType_2005ContainedLinks(View view) {
		PrimitiveType modelElement = (PrimitiveType) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnumeration_2003ContainedLinks(View view) {
		Enumeration modelElement = (Enumeration) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_2010ContainedLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_2006ContainedLinks(View view) {
		Constraint modelElement = (Constraint) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInstanceSpecification_2008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDependency_2009ContainedLinks(View view) {
		Dependency modelElement = (Dependency) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Client_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGeneralizationSet_2012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInterface_2013ContainedLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_3006ContainedLinks(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_3007ContainedLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InterfaceRealization_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataType_3008ContainedLinks(View view) {
		DataType modelElement = (DataType) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveType_3009ContainedLinks(View view) {
		PrimitiveType modelElement = (PrimitiveType) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnumeration_3011ContainedLinks(View view) {
		Enumeration modelElement = (Enumeration) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociationClass_3012ContainedLinks(View view) {
		AssociationClass modelElement = (AssociationClass) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Property_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InterfaceRealization_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInstanceSpecification_3013ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClass_3003ContainedLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InterfaceRealization_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPort_3025ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRedefinableTemplateSignature_3027ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3019ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3020ContainedLinks(View view) {
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
	public static List getOperation_3015ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3021ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3022ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEnumerationLiteral_3016ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3023ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3024ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSlot_3017ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3028ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3029ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClass_3030ContainedLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InterfaceRealization_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGeneralization_4001ContainedLinks(View view) {
		Generalization modelElement = (Generalization) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Generalization_General_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependency_4002ContainedLinks(View view) {
		Dependency modelElement = (Dependency) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Client_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_4003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_4005ContainedLinks(View view) {
		Association modelElement = (Association) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Property_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterfaceRealization_4008ContainedLinks(View view) {
		InterfaceRealization modelElement = (InterfaceRealization) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Client_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRealization_4010ContainedLinks(View view) {
		Realization modelElement = (Realization) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Client_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGeneralization_4011ContainedLinks(View view) {
		Generalization modelElement = (Generalization) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Generalization_General_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUsage_4013ContainedLinks(View view) {
		Usage modelElement = (Usage) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Client_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_2002IncomingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_2001IncomingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Generalization_General_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociationClass_2007IncomingLinks(View view) {
		AssociationClass modelElement = (AssociationClass) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Generalization_General_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataType_2004IncomingLinks(View view) {
		DataType modelElement = (DataType) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Generalization_General_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveType_2005IncomingLinks(View view) {
		PrimitiveType modelElement = (PrimitiveType) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Generalization_General_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnumeration_2003IncomingLinks(View view) {
		Enumeration modelElement = (Enumeration) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Generalization_General_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_2010IncomingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InterfaceRealization_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Generalization_General_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_2006IncomingLinks(View view) {
		Constraint modelElement = (Constraint) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInstanceSpecification_2008IncomingLinks(View view) {
		InstanceSpecification modelElement = (InstanceSpecification) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependency_2009IncomingLinks(View view) {
		Dependency modelElement = (Dependency) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGeneralizationSet_2012IncomingLinks(View view) {
		GeneralizationSet modelElement = (GeneralizationSet) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4011(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_2013IncomingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InterfaceRealization_4008(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Generalization_General_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_3006IncomingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_3007IncomingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Generalization_General_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataType_3008IncomingLinks(View view) {
		DataType modelElement = (DataType) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Generalization_General_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveType_3009IncomingLinks(View view) {
		PrimitiveType modelElement = (PrimitiveType) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Generalization_General_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnumeration_3011IncomingLinks(View view) {
		Enumeration modelElement = (Enumeration) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Generalization_General_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociationClass_3012IncomingLinks(View view) {
		AssociationClass modelElement = (AssociationClass) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Generalization_General_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInstanceSpecification_3013IncomingLinks(View view) {
		InstanceSpecification modelElement = (InstanceSpecification) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3001IncomingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3002IncomingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_3003IncomingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Generalization_General_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPort_3025IncomingLinks(View view) {
		Port modelElement = (Port) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRedefinableTemplateSignature_3027IncomingLinks(View view) {
		RedefinableTemplateSignature modelElement = (RedefinableTemplateSignature) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3019IncomingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3020IncomingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3014IncomingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3015IncomingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3021IncomingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3022IncomingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnumerationLiteral_3016IncomingLinks(View view) {
		EnumerationLiteral modelElement = (EnumerationLiteral) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3023IncomingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3024IncomingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSlot_3017IncomingLinks(View view) {
		Slot modelElement = (Slot) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3028IncomingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3029IncomingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_3030IncomingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Generalization_General_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGeneralization_4001IncomingLinks(View view) {
		Generalization modelElement = (Generalization) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependency_4002IncomingLinks(View view) {
		Dependency modelElement = (Dependency) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_4003IncomingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_4005IncomingLinks(View view) {
		Association modelElement = (Association) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Property_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Generalization_General_4012(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterfaceRealization_4008IncomingLinks(View view) {
		InterfaceRealization modelElement = (InterfaceRealization) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRealization_4010IncomingLinks(View view) {
		Realization modelElement = (Realization) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGeneralization_4011IncomingLinks(View view) {
		Generalization modelElement = (Generalization) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUsage_4013IncomingLinks(View view) {
		Usage modelElement = (Usage) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dependency_Client_4007(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4010(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Usage_4013(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_2002OutgoingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_2001OutgoingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InterfaceRealization_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociationClass_2007OutgoingLinks(View view) {
		AssociationClass modelElement = (AssociationClass) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Property_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InterfaceRealization_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataType_2004OutgoingLinks(View view) {
		DataType modelElement = (DataType) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveType_2005OutgoingLinks(View view) {
		PrimitiveType modelElement = (PrimitiveType) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnumeration_2003OutgoingLinks(View view) {
		Enumeration modelElement = (Enumeration) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_2010OutgoingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_2006OutgoingLinks(View view) {
		Constraint modelElement = (Constraint) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInstanceSpecification_2008OutgoingLinks(View view) {
		InstanceSpecification modelElement = (InstanceSpecification) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependency_2009OutgoingLinks(View view) {
		Dependency modelElement = (Dependency) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Client_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGeneralizationSet_2012OutgoingLinks(View view) {
		GeneralizationSet modelElement = (GeneralizationSet) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterface_2013OutgoingLinks(View view) {
		Interface modelElement = (Interface) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_3006OutgoingLinks(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_3007OutgoingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InterfaceRealization_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataType_3008OutgoingLinks(View view) {
		DataType modelElement = (DataType) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPrimitiveType_3009OutgoingLinks(View view) {
		PrimitiveType modelElement = (PrimitiveType) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnumeration_3011OutgoingLinks(View view) {
		Enumeration modelElement = (Enumeration) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociationClass_3012OutgoingLinks(View view) {
		AssociationClass modelElement = (AssociationClass) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Property_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InterfaceRealization_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInstanceSpecification_3013OutgoingLinks(View view) {
		InstanceSpecification modelElement = (InstanceSpecification) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3001OutgoingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3002OutgoingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_3003OutgoingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InterfaceRealization_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPort_3025OutgoingLinks(View view) {
		Port modelElement = (Port) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRedefinableTemplateSignature_3027OutgoingLinks(View view) {
		RedefinableTemplateSignature modelElement = (RedefinableTemplateSignature) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3019OutgoingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3020OutgoingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3014OutgoingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3015OutgoingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3021OutgoingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3022OutgoingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEnumerationLiteral_3016OutgoingLinks(View view) {
		EnumerationLiteral modelElement = (EnumerationLiteral) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3023OutgoingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3024OutgoingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSlot_3017OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProperty_3028OutgoingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperation_3029OutgoingLinks(View view) {
		Operation modelElement = (Operation) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClass_3030OutgoingLinks(View view) {
		Class modelElement = (Class) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InterfaceRealization_4008(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGeneralization_4001OutgoingLinks(View view) {
		Generalization modelElement = (Generalization) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Generalization_General_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependency_4002OutgoingLinks(View view) {
		Dependency modelElement = (Dependency) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Client_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProperty_4003OutgoingLinks(View view) {
		Property modelElement = (Property) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_4005OutgoingLinks(View view) {
		Association modelElement = (Association) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Property_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInterfaceRealization_4008OutgoingLinks(View view) {
		InterfaceRealization modelElement = (InterfaceRealization) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Client_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRealization_4010OutgoingLinks(View view) {
		Realization modelElement = (Realization) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Client_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGeneralization_4011OutgoingLinks(View view) {
		Generalization modelElement = (Generalization) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Generalization_General_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUsage_4013OutgoingLinks(View view) {
		Usage modelElement = (Usage) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Supplier_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Dependency_Client_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Generalization_4001(Classifier container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getGeneralizations().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) linkObject;
			if (GeneralizationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Classifier dst = link.getGeneral();
			result.add(new UMLLinkDescriptor(container, dst, link, UMLElementTypes.Generalization_4001, GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Dependency_4002(Package container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getPackagedElements().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) linkObject;
			if (Dependency2EditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
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
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Dependency_4002, Dependency2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Property_4003(Association container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getOwnedEnds().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Property) {
				continue;
			}
			Property link = (Property) linkObject;
			if (Property7EditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Type dst = link.getType();
			result.add(new UMLLinkDescriptor(container, dst, link, UMLElementTypes.Property_4003, Property7EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	private static Collection getContainedTypeModelFacetLinks_Association_4005(Package container) {
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
				result.add(new UMLLinkDescriptor(gmfSource, gmfTarget, association, UMLElementTypes.Association_4005, AssociationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	private static Collection getIncomingTypeModelFacetLinks_Association_4005(Type target, Map crossReferences) {
		return findRelatedAssociations(target, false);
	}

	/**
	 * @generated NOT
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Association_4005(Type source) {
		return findRelatedAssociations(source, true);
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
			result.add(new UMLLinkDescriptor(gmfSource, gmfTarget, link, UMLElementTypes.Association_4005, AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @NOT-GENERATED
	 */
	private static Collection findRelatedAssociations2(Type type, Map crossReferences, boolean sourceNotTarget) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(type);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getTypedElement_Type() || false == setting.getEObject() instanceof Property) {
				continue;
			}
			Property thisEnd = (Property) setting.getEObject();
			Association link = thisEnd.getAssociation();
			if (link == null) {
				continue;
			}
			if (AssociationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (thisEnd != AssociationEndConvention.getMemberEnd(link, sourceNotTarget)) {
				continue;
			}
			//ok, we found it
			Property otherEnd = AssociationEndConvention.getMemberEnd(link, !sourceNotTarget);

			Property sourceEnd = sourceNotTarget ? thisEnd : otherEnd;
			Property targetEnd = sourceNotTarget ? otherEnd : thisEnd;
			EObject gmfSource = sourceEnd.getType();
			EObject gmfTarget = targetEnd.getType();
			result.add(new UMLLinkDescriptor(gmfSource, gmfTarget, link, UMLElementTypes.Association_4005, AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_InterfaceRealization_4008(BehavioredClassifier container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getInterfaceRealizations().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof InterfaceRealization) {
				continue;
			}
			InterfaceRealization link = (InterfaceRealization) linkObject;
			if (InterfaceRealizationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Interface dst = link.getContract();
			BehavioredClassifier src = link.getImplementingClassifier();
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.InterfaceRealization_4008, InterfaceRealizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Realization_4010(Package container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getPackagedElements().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Realization) {
				continue;
			}
			Realization link = (Realization) linkObject;
			if (RealizationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
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
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Realization_4010, RealizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Generalization_4011(Classifier container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getGeneralizations().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) linkObject;
			if (Generalization2EditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getGeneralizationSets();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof GeneralizationSet) {
				continue;
			}
			GeneralizationSet dst = (GeneralizationSet) theTarget;
			result.add(new UMLLinkDescriptor(container, dst, link, UMLElementTypes.Generalization_4011, Generalization2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Usage_4013(Package container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getPackagedElements().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Usage) {
				continue;
			}
			Usage link = (Usage) linkObject;
			if (UsageEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
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
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Usage_4013, UsageEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Generalization_4001(Classifier target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getGeneralization_General() || false == setting.getEObject() instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) setting.getEObject();
			if (GeneralizationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Classifier) {
				continue;
			}
			Classifier container = (Classifier) link.eContainer();
			result.add(new UMLLinkDescriptor(container, target, link, UMLElementTypes.Generalization_4001, GeneralizationEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Dependency_4002(NamedElement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getDependency_Supplier() || false == setting.getEObject() instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) setting.getEObject();
			if (Dependency2EditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getClients();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof NamedElement) {
				continue;
			}
			NamedElement src = (NamedElement) theSource;
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.Dependency_4002, Dependency2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Property_4003(Type target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getTypedElement_Type() || false == setting.getEObject() instanceof Property) {
				continue;
			}
			Property link = (Property) setting.getEObject();
			if (Property7EditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Association) {
				continue;
			}
			Association container = (Association) link.eContainer();
			result.add(new UMLLinkDescriptor(container, target, link, UMLElementTypes.Property_4003, Property7EditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(Element target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() == UMLPackage.eINSTANCE.getConstraint_ConstrainedElement()) {
				result.add(new UMLLinkDescriptor(setting.getEObject(), target, UMLElementTypes.ConstraintConstrainedElement_4004, ConstraintConstrainedElementEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Dependency_Supplier_4006(NamedElement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() == UMLPackage.eINSTANCE.getDependency_Supplier()) {
				result.add(new UMLLinkDescriptor(setting.getEObject(), target, UMLElementTypes.DependencySupplier_4006, DependencySupplierEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Dependency_Client_4007(NamedElement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() == UMLPackage.eINSTANCE.getDependency_Client()) {
				result.add(new UMLLinkDescriptor(setting.getEObject(), target, UMLElementTypes.DependencyClient_4007, DependencyClientEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_InterfaceRealization_4008(Interface target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getInterfaceRealization_Contract() || false == setting.getEObject() instanceof InterfaceRealization) {
				continue;
			}
			InterfaceRealization link = (InterfaceRealization) setting.getEObject();
			if (InterfaceRealizationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			BehavioredClassifier src = link.getImplementingClassifier();
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.InterfaceRealization_4008, InterfaceRealizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Realization_4010(NamedElement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getDependency_Supplier() || false == setting.getEObject() instanceof Realization) {
				continue;
			}
			Realization link = (Realization) setting.getEObject();
			if (RealizationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getClients();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof NamedElement) {
				continue;
			}
			NamedElement src = (NamedElement) theSource;
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.Realization_4010, RealizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Generalization_4011(GeneralizationSet target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getGeneralization_GeneralizationSet() || false == setting.getEObject() instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) setting.getEObject();
			if (Generalization2EditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Classifier) {
				continue;
			}
			Classifier container = (Classifier) link.eContainer();
			result.add(new UMLLinkDescriptor(container, target, link, UMLElementTypes.Generalization_4011, Generalization2EditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Generalization_General_4012(Classifier target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() == UMLPackage.eINSTANCE.getGeneralization_General()) {
				result.add(new UMLLinkDescriptor(setting.getEObject(), target, UMLElementTypes.GeneralizationGeneral_4012, GeneralizationGeneralEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Usage_4013(NamedElement target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getDependency_Supplier() || false == setting.getEObject() instanceof Usage) {
				continue;
			}
			Usage link = (Usage) setting.getEObject();
			if (UsageEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getClients();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof NamedElement) {
				continue;
			}
			NamedElement src = (NamedElement) theSource;
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.Usage_4013, UsageEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Dependency_4002(NamedElement source) {
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
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getPackagedElements().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) linkObject;
			if (Dependency2EditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
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
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Dependency_4002, Dependency2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Constraint_ConstrainedElement_4004(Constraint source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getConstrainedElements().iterator(); destinations.hasNext();) {
			Element destination = (Element) destinations.next();
			result.add(new UMLLinkDescriptor(source, destination, UMLElementTypes.ConstraintConstrainedElement_4004, ConstraintConstrainedElementEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Dependency_Supplier_4006(Dependency source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getSuppliers().iterator(); destinations.hasNext();) {
			NamedElement destination = (NamedElement) destinations.next();
			result.add(new UMLLinkDescriptor(source, destination, UMLElementTypes.DependencySupplier_4006, DependencySupplierEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Dependency_Client_4007(Dependency source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getClients().iterator(); destinations.hasNext();) {
			NamedElement destination = (NamedElement) destinations.next();
			result.add(new UMLLinkDescriptor(source, destination, UMLElementTypes.DependencyClient_4007, DependencyClientEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_InterfaceRealization_4008(BehavioredClassifier source) {
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
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getInterfaceRealizations().iterator(); links.hasNext();) {
			Object linkObject = links.next();
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
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.InterfaceRealization_4008, InterfaceRealizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Realization_4010(NamedElement source) {
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
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getPackagedElements().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Realization) {
				continue;
			}
			Realization link = (Realization) linkObject;
			if (RealizationEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
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
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Realization_4010, RealizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Generalization_General_4012(Generalization source) {
		Collection result = new LinkedList();
		Classifier destination = source.getGeneral();
		result.add(new UMLLinkDescriptor(source, destination, UMLElementTypes.GeneralizationGeneral_4012, GeneralizationGeneralEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Usage_4013(NamedElement source) {
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
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getPackagedElements().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof Usage) {
				continue;
			}
			Usage link = (Usage) linkObject;
			if (UsageEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
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
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.Usage_4013, UsageEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_1000ContainedLinks(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Realization_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Usage_4013(modelElement));
		return result;
	}

}
