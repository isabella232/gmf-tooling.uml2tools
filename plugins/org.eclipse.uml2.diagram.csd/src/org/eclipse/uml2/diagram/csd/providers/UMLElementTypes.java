package org.eclipse.uml2.diagram.csd.providers;

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
import org.eclipse.uml2.diagram.csd.part.UMLDiagramEditorPlugin;
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
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Package_1000 = getElementType("org.eclipse.uml2.diagram.csd.Package_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Collaboration_2005 = getElementType("org.eclipse.uml2.diagram.csd.Collaboration_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Class_2006 = getElementType("org.eclipse.uml2.diagram.csd.Class_2006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Package_2003 = getElementType("org.eclipse.uml2.diagram.csd.Package_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Class_2007 = getElementType("org.eclipse.uml2.diagram.csd.Class_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Interface_2009 = getElementType("org.eclipse.uml2.diagram.csd.Interface_2009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InstanceSpecification_2011 = getElementType("org.eclipse.uml2.diagram.csd.InstanceSpecification_2011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Constraint_2012 = getElementType("org.eclipse.uml2.diagram.csd.Constraint_2012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CollaborationUse_3002 = getElementType("org.eclipse.uml2.diagram.csd.CollaborationUse_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3007 = getElementType("org.eclipse.uml2.diagram.csd.Property_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Parameter_3013 = getElementType("org.eclipse.uml2.diagram.csd.Parameter_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3008 = getElementType("org.eclipse.uml2.diagram.csd.Property_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Operation_3009 = getElementType("org.eclipse.uml2.diagram.csd.Operation_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Class_3010 = getElementType("org.eclipse.uml2.diagram.csd.Class_3010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Port_3011 = getElementType("org.eclipse.uml2.diagram.csd.Port_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ElementImport_3004 = getElementType("org.eclipse.uml2.diagram.csd.ElementImport_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3014 = getElementType("org.eclipse.uml2.diagram.csd.Property_3014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Port_3016 = getElementType("org.eclipse.uml2.diagram.csd.Port_3016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Slot_3015 = getElementType("org.eclipse.uml2.diagram.csd.Slot_3015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Connector_4005 = getElementType("org.eclipse.uml2.diagram.csd.Connector_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Dependency_4006 = getElementType("org.eclipse.uml2.diagram.csd.Dependency_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InterfaceRealization_4007 = getElementType("org.eclipse.uml2.diagram.csd.InterfaceRealization_4007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Usage_4008 = getElementType("org.eclipse.uml2.diagram.csd.Usage_4008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PortProvided_4010 = getElementType("org.eclipse.uml2.diagram.csd.PortProvided_4010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Association_4011 = getElementType("org.eclipse.uml2.diagram.csd.Association_4011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConstraintConstrainedElement_4012 = getElementType("org.eclipse.uml2.diagram.csd.ConstraintConstrainedElement_4012"); //$NON-NLS-1$

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

			elements.put(Collaboration_2005, UMLPackage.eINSTANCE.getCollaboration());

			elements.put(Class_2006, UMLPackage.eINSTANCE.getClass_());

			elements.put(Package_2003, UMLPackage.eINSTANCE.getPackage());

			elements.put(Class_2007, UMLPackage.eINSTANCE.getClass_());

			elements.put(Interface_2009, UMLPackage.eINSTANCE.getInterface());

			elements.put(InstanceSpecification_2011, UMLPackage.eINSTANCE.getInstanceSpecification());

			elements.put(Constraint_2012, UMLPackage.eINSTANCE.getConstraint());

			elements.put(CollaborationUse_3002, UMLPackage.eINSTANCE.getCollaborationUse());

			elements.put(Property_3007, UMLPackage.eINSTANCE.getProperty());

			elements.put(Parameter_3013, UMLPackage.eINSTANCE.getParameter());

			elements.put(Property_3008, UMLPackage.eINSTANCE.getProperty());

			elements.put(Operation_3009, UMLPackage.eINSTANCE.getOperation());

			elements.put(Class_3010, UMLPackage.eINSTANCE.getClass_());

			elements.put(Port_3011, UMLPackage.eINSTANCE.getPort());

			elements.put(ElementImport_3004, UMLPackage.eINSTANCE.getElementImport());

			elements.put(Property_3014, UMLPackage.eINSTANCE.getProperty());

			elements.put(Port_3016, UMLPackage.eINSTANCE.getPort());

			elements.put(Slot_3015, UMLPackage.eINSTANCE.getSlot());

			elements.put(Connector_4005, UMLPackage.eINSTANCE.getConnector());

			elements.put(Dependency_4006, UMLPackage.eINSTANCE.getDependency());

			elements.put(InterfaceRealization_4007, UMLPackage.eINSTANCE.getInterfaceRealization());

			elements.put(Usage_4008, UMLPackage.eINSTANCE.getUsage());

			elements.put(PortProvided_4010, UMLPackage.eINSTANCE.getPort_Provided());

			elements.put(Association_4011, UMLPackage.eINSTANCE.getAssociation());

			elements.put(ConstraintConstrainedElement_4012, UMLPackage.eINSTANCE.getConstraint_ConstrainedElement());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Package_1000);
			KNOWN_ELEMENT_TYPES.add(Collaboration_2005);
			KNOWN_ELEMENT_TYPES.add(Class_2006);
			KNOWN_ELEMENT_TYPES.add(Package_2003);
			KNOWN_ELEMENT_TYPES.add(Class_2007);
			KNOWN_ELEMENT_TYPES.add(Interface_2009);
			KNOWN_ELEMENT_TYPES.add(InstanceSpecification_2011);
			KNOWN_ELEMENT_TYPES.add(Constraint_2012);
			KNOWN_ELEMENT_TYPES.add(CollaborationUse_3002);
			KNOWN_ELEMENT_TYPES.add(Property_3007);
			KNOWN_ELEMENT_TYPES.add(Parameter_3013);
			KNOWN_ELEMENT_TYPES.add(Property_3008);
			KNOWN_ELEMENT_TYPES.add(Operation_3009);
			KNOWN_ELEMENT_TYPES.add(Class_3010);
			KNOWN_ELEMENT_TYPES.add(Port_3011);
			KNOWN_ELEMENT_TYPES.add(ElementImport_3004);
			KNOWN_ELEMENT_TYPES.add(Property_3014);
			KNOWN_ELEMENT_TYPES.add(Port_3016);
			KNOWN_ELEMENT_TYPES.add(Slot_3015);
			KNOWN_ELEMENT_TYPES.add(Connector_4005);
			KNOWN_ELEMENT_TYPES.add(Dependency_4006);
			KNOWN_ELEMENT_TYPES.add(InterfaceRealization_4007);
			KNOWN_ELEMENT_TYPES.add(Usage_4008);
			KNOWN_ELEMENT_TYPES.add(PortProvided_4010);
			KNOWN_ELEMENT_TYPES.add(Association_4011);
			KNOWN_ELEMENT_TYPES.add(ConstraintConstrainedElement_4012);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
