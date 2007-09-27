package org.eclipse.uml2.diagram.deploy.providers;

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
import org.eclipse.uml2.diagram.deploy.part.UMLDiagramEditorPlugin;
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
	public static final IElementType Package_1000 = getElementType("org.eclipse.uml2.diagram.deploy.Package_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Package_2001 = getElementType("org.eclipse.uml2.diagram.deploy.Package_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Device_2003 = getElementType("org.eclipse.uml2.diagram.deploy.Device_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Node_2004 = getElementType("org.eclipse.uml2.diagram.deploy.Node_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExecutionEnvironment_2005 = getElementType("org.eclipse.uml2.diagram.deploy.ExecutionEnvironment_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Artifact_2006 = getElementType("org.eclipse.uml2.diagram.deploy.Artifact_2006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DeploymentSpecification_2007 = getElementType("org.eclipse.uml2.diagram.deploy.DeploymentSpecification_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ElementImport_3001 = getElementType("org.eclipse.uml2.diagram.deploy.ElementImport_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Device_3004 = getElementType("org.eclipse.uml2.diagram.deploy.Device_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Artifact_3002 = getElementType("org.eclipse.uml2.diagram.deploy.Artifact_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExecutionEnvironment_3005 = getElementType("org.eclipse.uml2.diagram.deploy.ExecutionEnvironment_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Artifact_3006 = getElementType("org.eclipse.uml2.diagram.deploy.Artifact_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Node_3007 = getElementType("org.eclipse.uml2.diagram.deploy.Node_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Property_3003 = getElementType("org.eclipse.uml2.diagram.deploy.Property_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Deployment_4001 = getElementType("org.eclipse.uml2.diagram.deploy.Deployment_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Manifestation_4002 = getElementType("org.eclipse.uml2.diagram.deploy.Manifestation_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DeploymentConfiguration_4003 = getElementType("org.eclipse.uml2.diagram.deploy.DeploymentConfiguration_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommunicationPath_4004 = getElementType("org.eclipse.uml2.diagram.deploy.CommunicationPath_4004"); //$NON-NLS-1$

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

			elements.put(Package_2001, UMLPackage.eINSTANCE.getPackage());

			elements.put(Device_2003, UMLPackage.eINSTANCE.getDevice());

			elements.put(Node_2004, UMLPackage.eINSTANCE.getNode());

			elements.put(ExecutionEnvironment_2005, UMLPackage.eINSTANCE.getExecutionEnvironment());

			elements.put(Artifact_2006, UMLPackage.eINSTANCE.getArtifact());

			elements.put(DeploymentSpecification_2007, UMLPackage.eINSTANCE.getDeploymentSpecification());

			elements.put(ElementImport_3001, UMLPackage.eINSTANCE.getElementImport());

			elements.put(Device_3004, UMLPackage.eINSTANCE.getDevice());

			elements.put(Artifact_3002, UMLPackage.eINSTANCE.getArtifact());

			elements.put(ExecutionEnvironment_3005, UMLPackage.eINSTANCE.getExecutionEnvironment());

			elements.put(Artifact_3006, UMLPackage.eINSTANCE.getArtifact());

			elements.put(Node_3007, UMLPackage.eINSTANCE.getNode());

			elements.put(Property_3003, UMLPackage.eINSTANCE.getProperty());

			elements.put(Deployment_4001, UMLPackage.eINSTANCE.getDeployment());

			elements.put(Manifestation_4002, UMLPackage.eINSTANCE.getManifestation());

			elements.put(DeploymentConfiguration_4003, UMLPackage.eINSTANCE.getDeployment_Configuration());

			elements.put(CommunicationPath_4004, UMLPackage.eINSTANCE.getCommunicationPath());
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
			KNOWN_ELEMENT_TYPES.add(Package_2001);
			KNOWN_ELEMENT_TYPES.add(Device_2003);
			KNOWN_ELEMENT_TYPES.add(Node_2004);
			KNOWN_ELEMENT_TYPES.add(ExecutionEnvironment_2005);
			KNOWN_ELEMENT_TYPES.add(Artifact_2006);
			KNOWN_ELEMENT_TYPES.add(DeploymentSpecification_2007);
			KNOWN_ELEMENT_TYPES.add(ElementImport_3001);
			KNOWN_ELEMENT_TYPES.add(Device_3004);
			KNOWN_ELEMENT_TYPES.add(Artifact_3002);
			KNOWN_ELEMENT_TYPES.add(ExecutionEnvironment_3005);
			KNOWN_ELEMENT_TYPES.add(Artifact_3006);
			KNOWN_ELEMENT_TYPES.add(Node_3007);
			KNOWN_ELEMENT_TYPES.add(Property_3003);
			KNOWN_ELEMENT_TYPES.add(Deployment_4001);
			KNOWN_ELEMENT_TYPES.add(Manifestation_4002);
			KNOWN_ELEMENT_TYPES.add(DeploymentConfiguration_4003);
			KNOWN_ELEMENT_TYPES.add(CommunicationPath_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
