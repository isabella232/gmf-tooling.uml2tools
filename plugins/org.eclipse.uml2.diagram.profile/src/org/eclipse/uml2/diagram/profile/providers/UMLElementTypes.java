package org.eclipse.uml2.diagram.profile.providers;

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
import org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin;
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
	public static final IElementType Profile_1000 = getElementType("org.eclipse.uml2.diagram.profile.Profile_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Stereotype_2001 = getElementType("org.eclipse.uml2.diagram.profile.Stereotype_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Profile_2002 = getElementType("org.eclipse.uml2.diagram.profile.Profile_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Enumeration_2003 = getElementType("org.eclipse.uml2.diagram.profile.Enumeration_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ElementImport_2006 = getElementType("org.eclipse.uml2.diagram.profile.ElementImport_2006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Profile_2007 = getElementType("org.eclipse.uml2.diagram.profile.Profile_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3001 = getElementType("org.eclipse.uml2.diagram.profile.Property_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Constraint_3008 = getElementType("org.eclipse.uml2.diagram.profile.Constraint_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Stereotype_3003 = getElementType("org.eclipse.uml2.diagram.profile.Stereotype_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnumerationLiteral_3005 = getElementType("org.eclipse.uml2.diagram.profile.EnumerationLiteral_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ElementImport_3009 = getElementType("org.eclipse.uml2.diagram.profile.ElementImport_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Generalization_4001 = getElementType("org.eclipse.uml2.diagram.profile.Generalization_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Extension_4002 = getElementType("org.eclipse.uml2.diagram.profile.Extension_4002"); //$NON-NLS-1$

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

			elements.put(Profile_1000, UMLPackage.eINSTANCE.getProfile());

			elements.put(Stereotype_2001, UMLPackage.eINSTANCE.getStereotype());

			elements.put(Profile_2002, UMLPackage.eINSTANCE.getProfile());

			elements.put(Enumeration_2003, UMLPackage.eINSTANCE.getEnumeration());

			elements.put(ElementImport_2006, UMLPackage.eINSTANCE.getElementImport());

			elements.put(Profile_2007, UMLPackage.eINSTANCE.getProfile());

			elements.put(Property_3001, UMLPackage.eINSTANCE.getProperty());

			elements.put(Constraint_3008, UMLPackage.eINSTANCE.getConstraint());

			elements.put(Stereotype_3003, UMLPackage.eINSTANCE.getStereotype());

			elements.put(EnumerationLiteral_3005, UMLPackage.eINSTANCE.getEnumerationLiteral());

			elements.put(ElementImport_3009, UMLPackage.eINSTANCE.getElementImport());

			elements.put(Generalization_4001, UMLPackage.eINSTANCE.getGeneralization());

			elements.put(Extension_4002, UMLPackage.eINSTANCE.getExtension());
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
			KNOWN_ELEMENT_TYPES.add(Profile_1000);
			KNOWN_ELEMENT_TYPES.add(Stereotype_2001);
			KNOWN_ELEMENT_TYPES.add(Profile_2002);
			KNOWN_ELEMENT_TYPES.add(Enumeration_2003);
			KNOWN_ELEMENT_TYPES.add(ElementImport_2006);
			KNOWN_ELEMENT_TYPES.add(Profile_2007);
			KNOWN_ELEMENT_TYPES.add(Property_3001);
			KNOWN_ELEMENT_TYPES.add(Constraint_3008);
			KNOWN_ELEMENT_TYPES.add(Stereotype_3003);
			KNOWN_ELEMENT_TYPES.add(EnumerationLiteral_3005);
			KNOWN_ELEMENT_TYPES.add(ElementImport_3009);
			KNOWN_ELEMENT_TYPES.add(Generalization_4001);
			KNOWN_ELEMENT_TYPES.add(Extension_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static void refreshImageRegistry() {
		if (imageRegistry != null) {
			imageRegistry.dispose();
			imageRegistry = null;
		}
		imageRegistry = new ImageRegistry();
	}

}
