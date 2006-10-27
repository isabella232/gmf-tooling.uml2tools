package org.eclipse.uml2.diagram.activity.navigator;

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
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InitialNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin5EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinName4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinName5EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.MergeNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
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
		if (!ActivityEditPart.MODEL_ID.equals(abstractNavigatorItem.getModelID())) {
			return super.getImage(element);
		}

		if (abstractNavigatorItem instanceof UMLNavigatorItem) {
			UMLNavigatorItem navigatorItem = (UMLNavigatorItem) abstractNavigatorItem;
			switch (navigatorItem.getVisualID()) {
			case AcceptEventActionEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?AcceptEventAction", UMLElementTypes.AcceptEventAction_2001);
			case AcceptEventAction2EditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?AcceptEventAction", UMLElementTypes.AcceptEventAction_2002);
			case ActivityFinalNodeEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?ActivityFinalNode", UMLElementTypes.ActivityFinalNode_2003);
			case DecisionNodeEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?DecisionNode", UMLElementTypes.DecisionNode_2004);
			case MergeNodeEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?MergeNode", UMLElementTypes.MergeNode_2005);
			case InitialNodeEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?InitialNode", UMLElementTypes.InitialNode_2006);
			case StructuredActivityNodeEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?StructuredActivityNode", UMLElementTypes.StructuredActivityNode_2007);
			case DataStoreNodeEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?DataStoreNode", UMLElementTypes.DataStoreNode_2008);
			case CentralBufferNodeEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?CentralBufferNode", UMLElementTypes.CentralBufferNode_2009);
			case OpaqueActionEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?OpaqueAction", UMLElementTypes.OpaqueAction_2010);
			case FlowFinalNodeEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?FlowFinalNode", UMLElementTypes.FlowFinalNode_2011);
			case ForkNodeEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?ForkNode", UMLElementTypes.ForkNode_2012);
			case JoinNodeEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?JoinNode", UMLElementTypes.JoinNode_2013);
			case PinEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?Pin", UMLElementTypes.Pin_2014);
			case CreateObjectActionEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?CreateObjectAction", UMLElementTypes.CreateObjectAction_2015);
			case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?AddStructuralFeatureValueAction", UMLElementTypes.AddStructuralFeatureValueAction_2016);
			case CallBehaviorActionEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?CallBehaviorAction", UMLElementTypes.CallBehaviorAction_2017);
			case CallOperationActionEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?CallOperationAction", UMLElementTypes.CallOperationAction_2018);
			case OutputPinEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?OutputPin", UMLElementTypes.OutputPin_3001);
			case OutputPin2EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?OutputPin", UMLElementTypes.OutputPin_3002);
			case InputPinEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?InputPin", UMLElementTypes.InputPin_3003);
			case InputPin2EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?InputPin", UMLElementTypes.InputPin_3004);
			case InputPin3EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?InputPin", UMLElementTypes.InputPin_3005);
			case OutputPin3EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?OutputPin", UMLElementTypes.OutputPin_3006);
			case InputPin4EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?InputPin", UMLElementTypes.InputPin_3007);
			case InputPin5EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?InputPin", UMLElementTypes.InputPin_3008);
			case ActivityEditPart.VISUAL_ID:
				return getImage("Navigator?Diagram?http://www.eclipse.org/uml2/2.0.0/UML?Activity", UMLElementTypes.Activity_1000);
			case ControlFlowEditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.0.0/UML?ControlFlow", UMLElementTypes.ControlFlow_4001);
			case ObjectFlowEditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.0.0/UML?ObjectFlow", UMLElementTypes.ObjectFlow_4002);
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
		if (!ActivityEditPart.MODEL_ID.equals(abstractNavigatorItem.getModelID())) {
			return super.getText(element);
		}

		if (abstractNavigatorItem instanceof UMLNavigatorItem) {
			UMLNavigatorItem navigatorItem = (UMLNavigatorItem) abstractNavigatorItem;
			switch (navigatorItem.getVisualID()) {
			case AcceptEventActionEditPart.VISUAL_ID:
				return getAcceptEventAction_2001Text(navigatorItem.getView());
			case AcceptEventAction2EditPart.VISUAL_ID:
				return getAcceptEventAction_2002Text(navigatorItem.getView());
			case ActivityFinalNodeEditPart.VISUAL_ID:
				return getActivityFinalNode_2003Text(navigatorItem.getView());
			case DecisionNodeEditPart.VISUAL_ID:
				return getDecisionNode_2004Text(navigatorItem.getView());
			case MergeNodeEditPart.VISUAL_ID:
				return getMergeNode_2005Text(navigatorItem.getView());
			case InitialNodeEditPart.VISUAL_ID:
				return getInitialNode_2006Text(navigatorItem.getView());
			case StructuredActivityNodeEditPart.VISUAL_ID:
				return getStructuredActivityNode_2007Text(navigatorItem.getView());
			case DataStoreNodeEditPart.VISUAL_ID:
				return getDataStoreNode_2008Text(navigatorItem.getView());
			case CentralBufferNodeEditPart.VISUAL_ID:
				return getCentralBufferNode_2009Text(navigatorItem.getView());
			case OpaqueActionEditPart.VISUAL_ID:
				return getOpaqueAction_2010Text(navigatorItem.getView());
			case FlowFinalNodeEditPart.VISUAL_ID:
				return getFlowFinalNode_2011Text(navigatorItem.getView());
			case ForkNodeEditPart.VISUAL_ID:
				return getForkNode_2012Text(navigatorItem.getView());
			case JoinNodeEditPart.VISUAL_ID:
				return getJoinNode_2013Text(navigatorItem.getView());
			case PinEditPart.VISUAL_ID:
				return getPin_2014Text(navigatorItem.getView());
			case CreateObjectActionEditPart.VISUAL_ID:
				return getCreateObjectAction_2015Text(navigatorItem.getView());
			case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
				return getAddStructuralFeatureValueAction_2016Text(navigatorItem.getView());
			case CallBehaviorActionEditPart.VISUAL_ID:
				return getCallBehaviorAction_2017Text(navigatorItem.getView());
			case CallOperationActionEditPart.VISUAL_ID:
				return getCallOperationAction_2018Text(navigatorItem.getView());
			case OutputPinEditPart.VISUAL_ID:
				return getOutputPin_3001Text(navigatorItem.getView());
			case OutputPin2EditPart.VISUAL_ID:
				return getOutputPin_3002Text(navigatorItem.getView());
			case InputPinEditPart.VISUAL_ID:
				return getInputPin_3003Text(navigatorItem.getView());
			case InputPin2EditPart.VISUAL_ID:
				return getInputPin_3004Text(navigatorItem.getView());
			case InputPin3EditPart.VISUAL_ID:
				return getInputPin_3005Text(navigatorItem.getView());
			case OutputPin3EditPart.VISUAL_ID:
				return getOutputPin_3006Text(navigatorItem.getView());
			case InputPin4EditPart.VISUAL_ID:
				return getInputPin_3007Text(navigatorItem.getView());
			case InputPin5EditPart.VISUAL_ID:
				return getInputPin_3008Text(navigatorItem.getView());
			case ActivityEditPart.VISUAL_ID:
				return getActivity_1000Text(navigatorItem.getView());
			case ControlFlowEditPart.VISUAL_ID:
				return getControlFlow_4001Text(navigatorItem.getView());
			case ObjectFlowEditPart.VISUAL_ID:
				return getObjectFlow_4002Text(navigatorItem.getView());
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
	private String getAcceptEventAction_2001Text(View view) {
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
	private String getAcceptEventAction_2002Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2002);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getActivityFinalNode_2003Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2003);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getDecisionNode_2004Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2004);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getMergeNode_2005Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2005);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getInitialNode_2006Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2006);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredActivityNode_2007Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2007);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getDataStoreNode_2008Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2008);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getCentralBufferNode_2009Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2009);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueAction_2010Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(OpaqueActionNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.OpaqueAction_2010;
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
	private String getFlowFinalNode_2011Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2011);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getForkNode_2012Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2012);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getJoinNode_2013Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2013);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPin_2014Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(PinNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Pin_2014;
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
	private String getCreateObjectAction_2015Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(CreateObjectActionNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.CreateObjectAction_2015;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getAddStructuralFeatureValueAction_2016Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(AddStructuralFeatureValueActionNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.AddStructuralFeatureValueAction_2016;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getCallBehaviorAction_2017Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(CallBehaviorActionNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.CallBehaviorAction_2017;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getCallOperationAction_2018Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(CallOperationActionNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.CallOperationAction_2018;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getOutputPin_3001Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(OutputPinNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.OutputPin_3001;
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
	private String getOutputPin_3002Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(OutputPinName2EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.OutputPin_3002;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getInputPin_3003Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(InputPinNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.InputPin_3003;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getInputPin_3004Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(InputPinName2EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.InputPin_3004;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getInputPin_3005Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(InputPinName3EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.InputPin_3005;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getOutputPin_3006Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(OutputPinName3EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.OutputPin_3006;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getInputPin_3007Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(InputPinName4EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.InputPin_3007;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getInputPin_3008Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(InputPinName5EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.InputPin_3008;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getActivity_1000Text(View view) {
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
	private String getControlFlow_4001Text(View view) {
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
	private String getObjectFlow_4002Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4002);
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
