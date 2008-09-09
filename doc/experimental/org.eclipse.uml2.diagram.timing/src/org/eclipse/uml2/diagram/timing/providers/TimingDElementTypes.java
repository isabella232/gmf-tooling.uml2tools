package org.eclipse.uml2.diagram.timing.providers;

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
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.diagram.timing.edit.parts.DBlockEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DFrameContainerEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DFrameEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DMessageEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEndEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentMiddlePointEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentStartEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DStateSwitchEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DValueLineEditPart;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;
import org.eclipse.uml2.diagram.timing.part.TimingDDiagramEditorPlugin;

/**
 * @generated
 */

public class TimingDElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private TimingDElementTypes() {
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
	public static final IHintedType DFrameContainer_1000 = (IHintedType) getElementType("org.eclipse.uml2.diagram.timing.DFrameContainer_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IHintedType DFrame_2001 = (IHintedType) getElementType("org.eclipse.uml2.diagram.timing.DFrame_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IHintedType DBlock_3001 = (IHintedType) getElementType("org.eclipse.uml2.diagram.timing.DBlock_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IHintedType DValueLine_3002 = (IHintedType) getElementType("org.eclipse.uml2.diagram.timing.DValueLine_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IHintedType DSegment_3003 = (IHintedType) getElementType("org.eclipse.uml2.diagram.timing.DSegment_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IHintedType DSegmentMiddlePoint_3004 = (IHintedType) getElementType("org.eclipse.uml2.diagram.timing.DSegmentMiddlePoint_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IHintedType DSegmentStart_3005 = (IHintedType) getElementType("org.eclipse.uml2.diagram.timing.DSegmentStart_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IHintedType DSegmentEnd_3006 = (IHintedType) getElementType("org.eclipse.uml2.diagram.timing.DSegmentEnd_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IHintedType DStateSwitch_4001 = (IHintedType) getElementType("org.eclipse.uml2.diagram.timing.DStateSwitch_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IHintedType DMessage_4002 = (IHintedType) getElementType("org.eclipse.uml2.diagram.timing.DMessage_4002"); //$NON-NLS-1$

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
				return TimingDDiagramEditorPlugin.getInstance().getItemImageDescriptor(eClass.getEPackage().getEFactoryInstance().create(eClass));
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

			elements.put(DFrameContainer_1000, TimingDPackage.eINSTANCE.getDFrameContainer());

			elements.put(DFrame_2001, TimingDPackage.eINSTANCE.getDFrame());

			elements.put(DBlock_3001, TimingDPackage.eINSTANCE.getDBlock());

			elements.put(DValueLine_3002, TimingDPackage.eINSTANCE.getDValueLine());

			elements.put(DSegment_3003, TimingDPackage.eINSTANCE.getDSegment());

			elements.put(DSegmentMiddlePoint_3004, TimingDPackage.eINSTANCE.getDSegmentMiddlePoint());

			elements.put(DSegmentStart_3005, TimingDPackage.eINSTANCE.getDSegmentStart());

			elements.put(DSegmentEnd_3006, TimingDPackage.eINSTANCE.getDSegmentEnd());

			elements.put(DStateSwitch_4001, TimingDPackage.eINSTANCE.getDStateSwitch());

			elements.put(DMessage_4002, TimingDPackage.eINSTANCE.getDMessage());
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
			KNOWN_ELEMENT_TYPES.add(DFrameContainer_1000);
			KNOWN_ELEMENT_TYPES.add(DFrame_2001);
			KNOWN_ELEMENT_TYPES.add(DBlock_3001);
			KNOWN_ELEMENT_TYPES.add(DValueLine_3002);
			KNOWN_ELEMENT_TYPES.add(DSegment_3003);
			KNOWN_ELEMENT_TYPES.add(DSegmentMiddlePoint_3004);
			KNOWN_ELEMENT_TYPES.add(DSegmentStart_3005);
			KNOWN_ELEMENT_TYPES.add(DSegmentEnd_3006);
			KNOWN_ELEMENT_TYPES.add(DStateSwitch_4001);
			KNOWN_ELEMENT_TYPES.add(DMessage_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DFrameContainerEditPart.VISUAL_ID:
			return DFrameContainer_1000;
		case DFrameEditPart.VISUAL_ID:
			return DFrame_2001;
		case DBlockEditPart.VISUAL_ID:
			return DBlock_3001;
		case DValueLineEditPart.VISUAL_ID:
			return DValueLine_3002;
		case DSegmentEditPart.VISUAL_ID:
			return DSegment_3003;
		case DSegmentMiddlePointEditPart.VISUAL_ID:
			return DSegmentMiddlePoint_3004;
		case DSegmentStartEditPart.VISUAL_ID:
			return DSegmentStart_3005;
		case DSegmentEndEditPart.VISUAL_ID:
			return DSegmentEnd_3006;
		case DStateSwitchEditPart.VISUAL_ID:
			return DStateSwitch_4001;
		case DMessageEditPart.VISUAL_ID:
			return DMessage_4002;
		}
		return null;
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
