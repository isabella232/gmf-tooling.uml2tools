package org.eclipse.uml2.diagram.statemachine.navigator;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;

import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;

import org.eclipse.jface.viewers.LabelProvider;

import org.eclipse.swt.graphics.Image;

import org.eclipse.ui.IMemento;

import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import org.eclipse.uml2.diagram.statemachine.edit.parts.FinalStateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate10EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate3EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate4EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate5EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate6EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate7EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate8EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate9EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateName2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Region2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.RegionEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachineEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.TransitionEditPart;

import org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry;

import org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes;

import org.eclipse.uml2.uml.NamedElement;

/**
 * @generated
 */
public class UMLNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider {

	/**
	 * @generated
	 */
	static {
		UMLDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?InvalidElement", ImageDescriptor.getMissingImageDescriptor());
		UMLDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor());
		UMLDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (false == element instanceof UMLAbstractNavigatorItem) {
			return super.getImage(element);
		}

		UMLAbstractNavigatorItem abstractNavigatorItem = (UMLAbstractNavigatorItem) element;
		if (!StateMachineEditPart.MODEL_ID.equals(abstractNavigatorItem.getModelID())) {
			return super.getImage(element);
		}

		if (abstractNavigatorItem instanceof UMLNavigatorItem) {
			UMLNavigatorItem navigatorItem = (UMLNavigatorItem) abstractNavigatorItem;
			switch (navigatorItem.getVisualID()) {
			case RegionEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?Region", UMLElementTypes.Region_2001);
			case Pseudostate9EditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?Pseudostate", UMLElementTypes.Pseudostate_2002);
			case Pseudostate10EditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?Pseudostate", UMLElementTypes.Pseudostate_2003);
			case StateEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?State", UMLElementTypes.State_3001);
			case Region2EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Region", UMLElementTypes.Region_3002);
			case FinalStateEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?FinalState", UMLElementTypes.FinalState_3003);
			case PseudostateEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Pseudostate", UMLElementTypes.Pseudostate_3004);
			case Pseudostate2EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Pseudostate", UMLElementTypes.Pseudostate_3005);
			case Pseudostate3EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Pseudostate", UMLElementTypes.Pseudostate_3006);
			case Pseudostate4EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Pseudostate", UMLElementTypes.Pseudostate_3007);
			case Pseudostate5EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Pseudostate", UMLElementTypes.Pseudostate_3008);
			case Pseudostate6EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Pseudostate", UMLElementTypes.Pseudostate_3009);
			case Pseudostate7EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Pseudostate", UMLElementTypes.Pseudostate_3010);
			case Pseudostate8EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Pseudostate", UMLElementTypes.Pseudostate_3011);
			case StateMachineEditPart.VISUAL_ID:
				return getImage("Navigator?Diagram?http://www.eclipse.org/uml2/2.0.0/UML?StateMachine", UMLElementTypes.StateMachine_1000);
			case TransitionEditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.0.0/UML?Transition", UMLElementTypes.Transition_4001);
			default:
				return getImage("Navigator?UnknownElement", null);
			}
		} else if (abstractNavigatorItem instanceof UMLNavigatorGroup) {
			UMLNavigatorGroup group = (UMLNavigatorGroup) element;
			return UMLDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}
		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = UMLDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && UMLElementTypes.isKnownElementType(elementType)) {
			image = UMLElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound");
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (false == element instanceof UMLAbstractNavigatorItem) {
			return super.getText(element);
		}

		UMLAbstractNavigatorItem abstractNavigatorItem = (UMLAbstractNavigatorItem) element;
		if (!StateMachineEditPart.MODEL_ID.equals(abstractNavigatorItem.getModelID())) {
			return super.getText(element);
		}

		if (abstractNavigatorItem instanceof UMLNavigatorItem) {
			UMLNavigatorItem navigatorItem = (UMLNavigatorItem) abstractNavigatorItem;
			switch (navigatorItem.getVisualID()) {
			case RegionEditPart.VISUAL_ID:
				return getRegion_2001Text(navigatorItem.getView());
			case Pseudostate9EditPart.VISUAL_ID:
				return getPseudostate_2002Text(navigatorItem.getView());
			case Pseudostate10EditPart.VISUAL_ID:
				return getPseudostate_2003Text(navigatorItem.getView());
			case StateEditPart.VISUAL_ID:
				return getState_3001Text(navigatorItem.getView());
			case Region2EditPart.VISUAL_ID:
				return getRegion_3002Text(navigatorItem.getView());
			case FinalStateEditPart.VISUAL_ID:
				return getFinalState_3003Text(navigatorItem.getView());
			case PseudostateEditPart.VISUAL_ID:
				return getPseudostate_3004Text(navigatorItem.getView());
			case Pseudostate2EditPart.VISUAL_ID:
				return getPseudostate_3005Text(navigatorItem.getView());
			case Pseudostate3EditPart.VISUAL_ID:
				return getPseudostate_3006Text(navigatorItem.getView());
			case Pseudostate4EditPart.VISUAL_ID:
				return getPseudostate_3007Text(navigatorItem.getView());
			case Pseudostate5EditPart.VISUAL_ID:
				return getPseudostate_3008Text(navigatorItem.getView());
			case Pseudostate6EditPart.VISUAL_ID:
				return getPseudostate_3009Text(navigatorItem.getView());
			case Pseudostate7EditPart.VISUAL_ID:
				return getPseudostate_3010Text(navigatorItem.getView());
			case Pseudostate8EditPart.VISUAL_ID:
				return getPseudostate_3011Text(navigatorItem.getView());
			case StateMachineEditPart.VISUAL_ID:
				return getStateMachine_1000Text(navigatorItem.getView());
			case TransitionEditPart.VISUAL_ID:
				return getTransition_4001Text(navigatorItem.getView());
			default:
				return getUnknownElementText(navigatorItem.getView());
			}
		} else if (abstractNavigatorItem instanceof UMLNavigatorGroup) {
			UMLNavigatorGroup group = (UMLNavigatorGroup) element;
			return group.getGroupName();
		}
		return super.getText(element);
	}

	/**
	 * @generated
	 */
	private String getRegion_2001Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2001);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPseudostate_2002Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(PseudostateNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Pseudostate_2002;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPseudostate_2003Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(PseudostateName2EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Pseudostate_2003;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getState_3001Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(StateNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.State_3001;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getRegion_3002Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3002);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getFinalState_3003Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3003);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPseudostate_3004Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3004);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPseudostate_3005Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3005);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPseudostate_3006Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3006);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPseudostate_3007Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3007);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPseudostate_3008Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3008);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPseudostate_3009Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3009);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPseudostate_3010Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3010);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPseudostate_3011Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3011);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getStateMachine_1000Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_4001Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4001);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">";
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

}
