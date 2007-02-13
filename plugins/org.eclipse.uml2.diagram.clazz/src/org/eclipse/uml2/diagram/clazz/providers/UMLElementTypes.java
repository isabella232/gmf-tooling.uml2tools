package org.eclipse.uml2.diagram.clazz.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private UMLElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass && !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return UMLDiagramEditorPlugin.getInstance().getItemImageDescriptor(eClass.getEPackage().getEFactoryInstance().create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(Package_1000, UMLPackage.eINSTANCE.getPackage());

			elements.put(Package_2002, UMLPackage.eINSTANCE.getPackage());

			elements.put(Class_2001, UMLPackage.eINSTANCE.getClass_());

			elements.put(AssociationClass_2007, UMLPackage.eINSTANCE.getAssociationClass());

			elements.put(DataType_2004, UMLPackage.eINSTANCE.getDataType());

			elements.put(PrimitiveType_2005, UMLPackage.eINSTANCE.getPrimitiveType());

			elements.put(Enumeration_2003, UMLPackage.eINSTANCE.getEnumeration());

			elements.put(Interface_2010, UMLPackage.eINSTANCE.getInterface());

			elements.put(Constraint_2006, UMLPackage.eINSTANCE.getConstraint());

			elements.put(InstanceSpecification_2008, UMLPackage.eINSTANCE.getInstanceSpecification());

			elements.put(Dependency_2009, UMLPackage.eINSTANCE.getDependency());

			elements.put(GeneralizationSet_2012, UMLPackage.eINSTANCE.getGeneralizationSet());

			elements.put(Interface_2013, UMLPackage.eINSTANCE.getInterface());

			elements.put(Package_3006, UMLPackage.eINSTANCE.getPackage());

			elements.put(Class_3007, UMLPackage.eINSTANCE.getClass_());

			elements.put(DataType_3008, UMLPackage.eINSTANCE.getDataType());

			elements.put(PrimitiveType_3009, UMLPackage.eINSTANCE.getPrimitiveType());

			elements.put(Enumeration_3011, UMLPackage.eINSTANCE.getEnumeration());

			elements.put(AssociationClass_3012, UMLPackage.eINSTANCE.getAssociationClass());

			elements.put(InstanceSpecification_3013, UMLPackage.eINSTANCE.getInstanceSpecification());

			elements.put(Property_3001, UMLPackage.eINSTANCE.getProperty());

			elements.put(Operation_3002, UMLPackage.eINSTANCE.getOperation());

			elements.put(Class_3003, UMLPackage.eINSTANCE.getClass_());

			elements.put(Port_3025, UMLPackage.eINSTANCE.getPort());

			elements.put(RedefinableTemplateSignature_3027, UMLPackage.eINSTANCE.getRedefinableTemplateSignature());

			elements.put(Property_3019, UMLPackage.eINSTANCE.getProperty());

			elements.put(Operation_3020, UMLPackage.eINSTANCE.getOperation());

			elements.put(Property_3014, UMLPackage.eINSTANCE.getProperty());

			elements.put(Operation_3015, UMLPackage.eINSTANCE.getOperation());

			elements.put(Property_3021, UMLPackage.eINSTANCE.getProperty());

			elements.put(Operation_3022, UMLPackage.eINSTANCE.getOperation());

			elements.put(EnumerationLiteral_3016, UMLPackage.eINSTANCE.getEnumerationLiteral());

			elements.put(Property_3023, UMLPackage.eINSTANCE.getProperty());

			elements.put(Operation_3024, UMLPackage.eINSTANCE.getOperation());

			elements.put(Slot_3017, UMLPackage.eINSTANCE.getSlot());

			elements.put(Property_3028, UMLPackage.eINSTANCE.getProperty());

			elements.put(Operation_3029, UMLPackage.eINSTANCE.getOperation());

			elements.put(Class_3030, UMLPackage.eINSTANCE.getClass_());

			elements.put(Generalization_4001, UMLPackage.eINSTANCE.getGeneralization());

			elements.put(Dependency_4002, UMLPackage.eINSTANCE.getDependency());

			elements.put(Property_4003, UMLPackage.eINSTANCE.getProperty());

			elements.put(ConstraintConstrainedElement_4004, UMLPackage.eINSTANCE.getConstraint_ConstrainedElement());

			elements.put(Association_4005, UMLPackage.eINSTANCE.getAssociation());

			elements.put(DependencySupplier_4006, UMLPackage.eINSTANCE.getDependency_Supplier());

			elements.put(DependencyClient_4007, UMLPackage.eINSTANCE.getDependency_Client());

			elements.put(InterfaceRealization_4008, UMLPackage.eINSTANCE.getInterfaceRealization());

			elements.put(Realization_4010, UMLPackage.eINSTANCE.getRealization());

			elements.put(Generalization_4011, UMLPackage.eINSTANCE.getGeneralization());

			elements.put(GeneralizationGeneral_4012, UMLPackage.eINSTANCE.getGeneralization_General());

			elements.put(Usage_4013, UMLPackage.eINSTANCE.getUsage());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	public static final IElementType Package_1000 = getElementType("org.eclipse.uml2.diagram.clazz.Package_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Package_2002 = getElementType("org.eclipse.uml2.diagram.clazz.Package_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Class_2001 = getElementType("org.eclipse.uml2.diagram.clazz.Class_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AssociationClass_2007 = getElementType("org.eclipse.uml2.diagram.clazz.AssociationClass_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DataType_2004 = getElementType("org.eclipse.uml2.diagram.clazz.DataType_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PrimitiveType_2005 = getElementType("org.eclipse.uml2.diagram.clazz.PrimitiveType_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Enumeration_2003 = getElementType("org.eclipse.uml2.diagram.clazz.Enumeration_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Interface_2010 = getElementType("org.eclipse.uml2.diagram.clazz.Interface_2010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Constraint_2006 = getElementType("org.eclipse.uml2.diagram.clazz.Constraint_2006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InstanceSpecification_2008 = getElementType("org.eclipse.uml2.diagram.clazz.InstanceSpecification_2008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Dependency_2009 = getElementType("org.eclipse.uml2.diagram.clazz.Dependency_2009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType GeneralizationSet_2012 = getElementType("org.eclipse.uml2.diagram.clazz.GeneralizationSet_2012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Interface_2013 = getElementType("org.eclipse.uml2.diagram.clazz.Interface_2013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Package_3006 = getElementType("org.eclipse.uml2.diagram.clazz.Package_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Class_3007 = getElementType("org.eclipse.uml2.diagram.clazz.Class_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DataType_3008 = getElementType("org.eclipse.uml2.diagram.clazz.DataType_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PrimitiveType_3009 = getElementType("org.eclipse.uml2.diagram.clazz.PrimitiveType_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Enumeration_3011 = getElementType("org.eclipse.uml2.diagram.clazz.Enumeration_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AssociationClass_3012 = getElementType("org.eclipse.uml2.diagram.clazz.AssociationClass_3012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InstanceSpecification_3013 = getElementType("org.eclipse.uml2.diagram.clazz.InstanceSpecification_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3001 = getElementType("org.eclipse.uml2.diagram.clazz.Property_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Operation_3002 = getElementType("org.eclipse.uml2.diagram.clazz.Operation_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Class_3003 = getElementType("org.eclipse.uml2.diagram.clazz.Class_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Port_3025 = getElementType("org.eclipse.uml2.diagram.clazz.Port_3025"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RedefinableTemplateSignature_3027 = getElementType("org.eclipse.uml2.diagram.clazz.RedefinableTemplateSignature_3027"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3019 = getElementType("org.eclipse.uml2.diagram.clazz.Property_3019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Operation_3020 = getElementType("org.eclipse.uml2.diagram.clazz.Operation_3020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3014 = getElementType("org.eclipse.uml2.diagram.clazz.Property_3014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Operation_3015 = getElementType("org.eclipse.uml2.diagram.clazz.Operation_3015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3021 = getElementType("org.eclipse.uml2.diagram.clazz.Property_3021"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Operation_3022 = getElementType("org.eclipse.uml2.diagram.clazz.Operation_3022"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnumerationLiteral_3016 = getElementType("org.eclipse.uml2.diagram.clazz.EnumerationLiteral_3016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3023 = getElementType("org.eclipse.uml2.diagram.clazz.Property_3023"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Operation_3024 = getElementType("org.eclipse.uml2.diagram.clazz.Operation_3024"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Slot_3017 = getElementType("org.eclipse.uml2.diagram.clazz.Slot_3017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3028 = getElementType("org.eclipse.uml2.diagram.clazz.Property_3028"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Operation_3029 = getElementType("org.eclipse.uml2.diagram.clazz.Operation_3029"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Class_3030 = getElementType("org.eclipse.uml2.diagram.clazz.Class_3030"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Generalization_4001 = getElementType("org.eclipse.uml2.diagram.clazz.Generalization_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Dependency_4002 = getElementType("org.eclipse.uml2.diagram.clazz.Dependency_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_4003 = getElementType("org.eclipse.uml2.diagram.clazz.Property_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConstraintConstrainedElement_4004 = getElementType("org.eclipse.uml2.diagram.clazz.ConstraintConstrainedElement_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Association_4005 = getElementType("org.eclipse.uml2.diagram.clazz.Association_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DependencySupplier_4006 = getElementType("org.eclipse.uml2.diagram.clazz.DependencySupplier_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DependencyClient_4007 = getElementType("org.eclipse.uml2.diagram.clazz.DependencyClient_4007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InterfaceRealization_4008 = getElementType("org.eclipse.uml2.diagram.clazz.InterfaceRealization_4008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Realization_4010 = getElementType("org.eclipse.uml2.diagram.clazz.Realization_4010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Generalization_4011 = getElementType("org.eclipse.uml2.diagram.clazz.Generalization_4011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType GeneralizationGeneral_4012 = getElementType("org.eclipse.uml2.diagram.clazz.GeneralizationGeneral_4012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Usage_4013 = getElementType("org.eclipse.uml2.diagram.clazz.Usage_4013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Package_1000);
			KNOWN_ELEMENT_TYPES.add(Package_2002);
			KNOWN_ELEMENT_TYPES.add(Class_2001);
			KNOWN_ELEMENT_TYPES.add(AssociationClass_2007);
			KNOWN_ELEMENT_TYPES.add(DataType_2004);
			KNOWN_ELEMENT_TYPES.add(PrimitiveType_2005);
			KNOWN_ELEMENT_TYPES.add(Enumeration_2003);
			KNOWN_ELEMENT_TYPES.add(Interface_2010);
			KNOWN_ELEMENT_TYPES.add(Constraint_2006);
			KNOWN_ELEMENT_TYPES.add(InstanceSpecification_2008);
			KNOWN_ELEMENT_TYPES.add(Dependency_2009);
			KNOWN_ELEMENT_TYPES.add(GeneralizationSet_2012);
			KNOWN_ELEMENT_TYPES.add(Interface_2013);
			KNOWN_ELEMENT_TYPES.add(Package_3006);
			KNOWN_ELEMENT_TYPES.add(Class_3007);
			KNOWN_ELEMENT_TYPES.add(DataType_3008);
			KNOWN_ELEMENT_TYPES.add(PrimitiveType_3009);
			KNOWN_ELEMENT_TYPES.add(Enumeration_3011);
			KNOWN_ELEMENT_TYPES.add(AssociationClass_3012);
			KNOWN_ELEMENT_TYPES.add(InstanceSpecification_3013);
			KNOWN_ELEMENT_TYPES.add(Property_3001);
			KNOWN_ELEMENT_TYPES.add(Operation_3002);
			KNOWN_ELEMENT_TYPES.add(Class_3003);
			KNOWN_ELEMENT_TYPES.add(Port_3025);
			KNOWN_ELEMENT_TYPES.add(RedefinableTemplateSignature_3027);
			KNOWN_ELEMENT_TYPES.add(Property_3019);
			KNOWN_ELEMENT_TYPES.add(Operation_3020);
			KNOWN_ELEMENT_TYPES.add(Property_3014);
			KNOWN_ELEMENT_TYPES.add(Operation_3015);
			KNOWN_ELEMENT_TYPES.add(Property_3021);
			KNOWN_ELEMENT_TYPES.add(Operation_3022);
			KNOWN_ELEMENT_TYPES.add(EnumerationLiteral_3016);
			KNOWN_ELEMENT_TYPES.add(Property_3023);
			KNOWN_ELEMENT_TYPES.add(Operation_3024);
			KNOWN_ELEMENT_TYPES.add(Slot_3017);
			KNOWN_ELEMENT_TYPES.add(Property_3028);
			KNOWN_ELEMENT_TYPES.add(Operation_3029);
			KNOWN_ELEMENT_TYPES.add(Class_3030);
			KNOWN_ELEMENT_TYPES.add(Generalization_4001);
			KNOWN_ELEMENT_TYPES.add(Dependency_4002);
			KNOWN_ELEMENT_TYPES.add(Property_4003);
			KNOWN_ELEMENT_TYPES.add(ConstraintConstrainedElement_4004);
			KNOWN_ELEMENT_TYPES.add(Association_4005);
			KNOWN_ELEMENT_TYPES.add(DependencySupplier_4006);
			KNOWN_ELEMENT_TYPES.add(DependencyClient_4007);
			KNOWN_ELEMENT_TYPES.add(InterfaceRealization_4008);
			KNOWN_ELEMENT_TYPES.add(Realization_4010);
			KNOWN_ELEMENT_TYPES.add(Generalization_4011);
			KNOWN_ELEMENT_TYPES.add(GeneralizationGeneral_4012);
			KNOWN_ELEMENT_TYPES.add(Usage_4013);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}
}
