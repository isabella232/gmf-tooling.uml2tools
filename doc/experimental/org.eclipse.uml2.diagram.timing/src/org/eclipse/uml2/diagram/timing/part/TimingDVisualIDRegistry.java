package org.eclipse.uml2.diagram.timing.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.genapi.IVisualIDRegistry;
import org.eclipse.uml2.diagram.timing.edit.parts.DBlockDisplayNameEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DBlockEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DFrameContainerEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DFrameEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEndEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentMiddlePointEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentStartEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DStateSwitchEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DValueLineDisplayNameEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DValueLineEditPart;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrameContainer;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class TimingDVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.eclipse.uml2.diagram.timing/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DFrameContainerEditPart.MODEL_ID.equals(view.getType())) {
				return DFrameContainerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				TimingDDiagramEditorPlugin.getInstance().logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (TimingDPackage.eINSTANCE.getDFrameContainer().isSuperTypeOf(domainElement.eClass()) && isDiagram((DFrameContainer) domainElement)) {
			return DFrameContainerEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry.getModelID(containerView);
		if (!DFrameContainerEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (DFrameContainerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DFrameContainerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DFrameEditPart.VISUAL_ID:
			if (TimingDPackage.eINSTANCE.getDBlock().isSuperTypeOf(domainElement.eClass())) {
				return DBlockEditPart.VISUAL_ID;
			}
			break;
		case DBlockEditPart.VISUAL_ID:
			if (TimingDPackage.eINSTANCE.getDValueLine().isSuperTypeOf(domainElement.eClass())) {
				return DValueLineEditPart.VISUAL_ID;
			}
			break;
		case DValueLineEditPart.VISUAL_ID:
			if (TimingDPackage.eINSTANCE.getDSegment().isSuperTypeOf(domainElement.eClass())) {
				return DSegmentEditPart.VISUAL_ID;
			}
			break;
		case DSegmentEditPart.VISUAL_ID:
			if (TimingDPackage.eINSTANCE.getDSegmentMiddlePoint().isSuperTypeOf(domainElement.eClass())) {
				return DSegmentMiddlePointEditPart.VISUAL_ID;
			}
			if (TimingDPackage.eINSTANCE.getDSegmentStart().isSuperTypeOf(domainElement.eClass())) {
				return DSegmentStartEditPart.VISUAL_ID;
			}
			if (TimingDPackage.eINSTANCE.getDSegmentEnd().isSuperTypeOf(domainElement.eClass())) {
				return DSegmentEndEditPart.VISUAL_ID;
			}
			break;
		case DFrameContainerEditPart.VISUAL_ID:
			if (TimingDPackage.eINSTANCE.getDFrame().isSuperTypeOf(domainElement.eClass())) {
				return DFrameEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry.getModelID(containerView);
		if (!DFrameContainerEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (DFrameContainerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DFrameContainerEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DFrameEditPart.VISUAL_ID:
			if (DBlockEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DBlockEditPart.VISUAL_ID:
			if (DBlockDisplayNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DValueLineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DValueLineEditPart.VISUAL_ID:
			if (DValueLineDisplayNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DSegmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DSegmentEditPart.VISUAL_ID:
			if (DSegmentMiddlePointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DSegmentStartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DSegmentEndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DFrameContainerEditPart.VISUAL_ID:
			if (DFrameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (TimingDPackage.eINSTANCE.getDStateSwitch().isSuperTypeOf(domainElement.eClass())) {
			return DStateSwitchEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(DFrameContainer element) {
		return true;
	}

	/**
	 * @generated
	 */
	protected static boolean hasViewChild(View containerView, EObject domainElement, int visualId) {
		if (containerView == null) {
			return false;
		}
		if (domainElement == null) {
			return false;
		}
		for (Object next : containerView.getChildren()) {
			View nextView = (View) next;
			if (domainElement.equals(nextView.getElement()) && getType(visualId).equals(nextView.getType())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getChildDescriptorVisualID(TimingDNodeDescriptor container, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		switch (container.getVisualID()) {
		case DFrameEditPart.VISUAL_ID:
			if (TimingDPackage.eINSTANCE.getDBlock().isSuperTypeOf(domainElement.eClass())) {
				return DBlockEditPart.VISUAL_ID;
			}
			break;
		case DBlockEditPart.VISUAL_ID:
			if (TimingDPackage.eINSTANCE.getDValueLine().isSuperTypeOf(domainElement.eClass())) {
				return DValueLineEditPart.VISUAL_ID;
			}
			break;
		case DValueLineEditPart.VISUAL_ID:
			if (TimingDPackage.eINSTANCE.getDSegment().isSuperTypeOf(domainElement.eClass())) {
				return DSegmentEditPart.VISUAL_ID;
			}
			break;
		case DSegmentEditPart.VISUAL_ID:
			if (TimingDPackage.eINSTANCE.getDSegmentMiddlePoint().isSuperTypeOf(domainElement.eClass())) {
				return DSegmentMiddlePointEditPart.VISUAL_ID;
			}
			if (TimingDPackage.eINSTANCE.getDSegmentStart().isSuperTypeOf(domainElement.eClass())) {
				return DSegmentStartEditPart.VISUAL_ID;
			}
			if (TimingDPackage.eINSTANCE.getDSegmentEnd().isSuperTypeOf(domainElement.eClass())) {
				return DSegmentEndEditPart.VISUAL_ID;
			}
			break;
		case DFrameContainerEditPart.VISUAL_ID:
			if (TimingDPackage.eINSTANCE.getDFrame().isSuperTypeOf(domainElement.eClass())) {
				return DFrameEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	protected static boolean canSubstitute(int visualId, int substituteCandidate) {
		if (visualId == substituteCandidate) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate || canSubstitute(basic, candidate);
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case DSegmentMiddlePointEditPart.VISUAL_ID:
		case DSegmentStartEditPart.VISUAL_ID:
		case DSegmentEndEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final IVisualIDRegistry TYPED_ADAPTER = new IVisualIDRegistry() {

		/**
		 * @generated
		 */
		public String getModelID(View view) {
			return org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		public int getVisualID(View view) {
			return org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		public boolean isCompartmentVisualID(int visualID) {
			return org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		public boolean isSemanticLeafVisualID(int visualID) {
			return org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}

		/**
		 * @generated
		 */
		public boolean isShortcutDescendant(View view) {
			return org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry.isShortcutDescendant(view);
		}

	};

	/**
	 * @generated
	 */
	public static boolean isShortcutDescendant(View view) {
		View diagram = view.getDiagram();
		while (view != diagram && view != null) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return true;
			}
			view = (View) view.eContainer();
		}
		return false;
	}

}
