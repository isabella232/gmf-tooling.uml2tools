package org.eclipse.uml2.diagram.component.providers;

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
import org.eclipse.uml2.diagram.component.part.UMLDiagramEditorPlugin;
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
	public static final IElementType Package_1000 = getElementType("org.eclipse.uml2.diagram.component.Package_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Component_2001 = getElementType("org.eclipse.uml2.diagram.component.Component_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Artifact_2002 = getElementType("org.eclipse.uml2.diagram.component.Artifact_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Interface_2003 = getElementType("org.eclipse.uml2.diagram.component.Interface_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Class_2004 = getElementType("org.eclipse.uml2.diagram.component.Class_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Package_2005 = getElementType("org.eclipse.uml2.diagram.component.Package_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Package_2006 = getElementType("org.eclipse.uml2.diagram.component.Package_2006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Component_3001 = getElementType("org.eclipse.uml2.diagram.component.Component_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Port_3002 = getElementType("org.eclipse.uml2.diagram.component.Port_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Artifact_3003 = getElementType("org.eclipse.uml2.diagram.component.Artifact_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Class_3004 = getElementType("org.eclipse.uml2.diagram.component.Class_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Interface_3005 = getElementType("org.eclipse.uml2.diagram.component.Interface_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3006 = getElementType("org.eclipse.uml2.diagram.component.Property_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ElementImport_3007 = getElementType("org.eclipse.uml2.diagram.component.ElementImport_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Package_3008 = getElementType("org.eclipse.uml2.diagram.component.Package_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Class_3009 = getElementType("org.eclipse.uml2.diagram.component.Class_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Component_3010 = getElementType("org.eclipse.uml2.diagram.component.Component_3010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InterfaceRealization_4001 = getElementType("org.eclipse.uml2.diagram.component.InterfaceRealization_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PortProvided_4006 = getElementType("org.eclipse.uml2.diagram.component.PortProvided_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PortRequired_4004 = getElementType("org.eclipse.uml2.diagram.component.PortRequired_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ComponentRequired_4007 = getElementType("org.eclipse.uml2.diagram.component.ComponentRequired_4007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Connector_4008 = getElementType("org.eclipse.uml2.diagram.component.Connector_4008"); //$NON-NLS-1$

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

			elements.put(Component_2001, UMLPackage.eINSTANCE.getComponent());

			elements.put(Artifact_2002, UMLPackage.eINSTANCE.getArtifact());

			elements.put(Interface_2003, UMLPackage.eINSTANCE.getInterface());

			elements.put(Class_2004, UMLPackage.eINSTANCE.getClass_());

			elements.put(Package_2005, UMLPackage.eINSTANCE.getPackage());

			elements.put(Package_2006, UMLPackage.eINSTANCE.getPackage());

			elements.put(Component_3001, UMLPackage.eINSTANCE.getComponent());

			elements.put(Port_3002, UMLPackage.eINSTANCE.getPort());

			elements.put(Artifact_3003, UMLPackage.eINSTANCE.getArtifact());

			elements.put(Class_3004, UMLPackage.eINSTANCE.getClass_());

			elements.put(Interface_3005, UMLPackage.eINSTANCE.getInterface());

			elements.put(Property_3006, UMLPackage.eINSTANCE.getProperty());

			elements.put(ElementImport_3007, UMLPackage.eINSTANCE.getElementImport());

			elements.put(Package_3008, UMLPackage.eINSTANCE.getPackage());

			elements.put(Class_3009, UMLPackage.eINSTANCE.getClass_());

			elements.put(Component_3010, UMLPackage.eINSTANCE.getComponent());

			elements.put(InterfaceRealization_4001, UMLPackage.eINSTANCE.getInterfaceRealization());

			elements.put(PortProvided_4006, UMLPackage.eINSTANCE.getPort_Provided());

			elements.put(PortRequired_4004, UMLPackage.eINSTANCE.getPort_Required());

			elements.put(ComponentRequired_4007, UMLPackage.eINSTANCE.getComponent_Required());

			elements.put(Connector_4008, UMLPackage.eINSTANCE.getConnector());
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
			KNOWN_ELEMENT_TYPES.add(Component_2001);
			KNOWN_ELEMENT_TYPES.add(Artifact_2002);
			KNOWN_ELEMENT_TYPES.add(Interface_2003);
			KNOWN_ELEMENT_TYPES.add(Class_2004);
			KNOWN_ELEMENT_TYPES.add(Package_2005);
			KNOWN_ELEMENT_TYPES.add(Package_2006);
			KNOWN_ELEMENT_TYPES.add(Component_3001);
			KNOWN_ELEMENT_TYPES.add(Port_3002);
			KNOWN_ELEMENT_TYPES.add(Artifact_3003);
			KNOWN_ELEMENT_TYPES.add(Class_3004);
			KNOWN_ELEMENT_TYPES.add(Interface_3005);
			KNOWN_ELEMENT_TYPES.add(Property_3006);
			KNOWN_ELEMENT_TYPES.add(ElementImport_3007);
			KNOWN_ELEMENT_TYPES.add(Package_3008);
			KNOWN_ELEMENT_TYPES.add(Class_3009);
			KNOWN_ELEMENT_TYPES.add(Component_3010);
			KNOWN_ELEMENT_TYPES.add(InterfaceRealization_4001);
			KNOWN_ELEMENT_TYPES.add(PortProvided_4006);
			KNOWN_ELEMENT_TYPES.add(PortRequired_4004);
			KNOWN_ELEMENT_TYPES.add(ComponentRequired_4007);
			KNOWN_ELEMENT_TYPES.add(Connector_4008);
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
