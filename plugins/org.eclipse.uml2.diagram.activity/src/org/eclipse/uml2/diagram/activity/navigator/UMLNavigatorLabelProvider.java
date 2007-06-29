package org.eclipse.uml2.diagram.activity.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionName4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActionLocalPreconditionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityParameterNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityParameterNodeNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Constraint2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExceptionHandlerEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNode2EditPart;
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
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LiteralString2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LiteralStringEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.MergeNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectNodeSelectionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueBehaviorEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueBehaviorNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Pin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.SendSignalActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.SendSignalActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.activity.providers.UMLParserProvider;
import org.eclipse.uml2.uml.ActivityFinalNode;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ControlFlow;
import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.FlowFinalNode;
import org.eclipse.uml2.uml.ForkNode;
import org.eclipse.uml2.uml.InitialNode;
import org.eclipse.uml2.uml.JoinNode;
import org.eclipse.uml2.uml.MergeNode;
import org.eclipse.uml2.uml.ObjectFlow;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.StructuredActivityNode;

/**
 * @generated
 */
public class UMLNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		UMLDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		UMLDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof UMLNavigatorItem && !isOwnView(((UMLNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof UMLNavigatorGroup) {
			UMLNavigatorGroup group = (UMLNavigatorGroup) element;
			return UMLDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof UMLNavigatorItem) {
			UMLNavigatorItem navigatorItem = (UMLNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.eclipse.org/uml2/2.1.0/UML?Package", UMLElementTypes.Package_1000); //$NON-NLS-1$
		case ActivityEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.1.0/UML?Activity", UMLElementTypes.Activity_2026); //$NON-NLS-1$
		case ConstraintEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.1.0/UML?Constraint", UMLElementTypes.Constraint_2027); //$NON-NLS-1$
		case Constraint2EditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.1.0/UML?Constraint", UMLElementTypes.Constraint_2028); //$NON-NLS-1$
		case AcceptEventActionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?AcceptEventAction", UMLElementTypes.AcceptEventAction_3030); //$NON-NLS-1$
		case AcceptEventAction2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?AcceptEventAction", UMLElementTypes.AcceptEventAction_3031); //$NON-NLS-1$
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?ActivityFinalNode", UMLElementTypes.ActivityFinalNode_3032); //$NON-NLS-1$
		case DecisionNodeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?DecisionNode", UMLElementTypes.DecisionNode_3033); //$NON-NLS-1$
		case MergeNodeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?MergeNode", UMLElementTypes.MergeNode_3034); //$NON-NLS-1$
		case InitialNodeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?InitialNode", UMLElementTypes.InitialNode_3035); //$NON-NLS-1$
		case DataStoreNodeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?DataStoreNode", UMLElementTypes.DataStoreNode_3036); //$NON-NLS-1$
		case CentralBufferNodeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?CentralBufferNode", UMLElementTypes.CentralBufferNode_3037); //$NON-NLS-1$
		case OpaqueActionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?OpaqueAction", UMLElementTypes.OpaqueAction_3029); //$NON-NLS-1$
		case OutputPinEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?OutputPin", UMLElementTypes.OutputPin_3001); //$NON-NLS-1$
		case FlowFinalNodeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?FlowFinalNode", UMLElementTypes.FlowFinalNode_3038); //$NON-NLS-1$
		case ForkNodeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?ForkNode", UMLElementTypes.ForkNode_3039); //$NON-NLS-1$
		case JoinNodeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?JoinNode", UMLElementTypes.JoinNode_3040); //$NON-NLS-1$
		case PinEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?Pin", UMLElementTypes.Pin_3041); //$NON-NLS-1$
		case CreateObjectActionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?CreateObjectAction", UMLElementTypes.CreateObjectAction_3042); //$NON-NLS-1$
		case OutputPin2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?OutputPin", UMLElementTypes.OutputPin_3002); //$NON-NLS-1$
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?AddStructuralFeatureValueAction", UMLElementTypes.AddStructuralFeatureValueAction_3043); //$NON-NLS-1$
		case InputPinEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?InputPin", UMLElementTypes.InputPin_3003); //$NON-NLS-1$
		case InputPin2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?InputPin", UMLElementTypes.InputPin_3004); //$NON-NLS-1$
		case InputPin3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?InputPin", UMLElementTypes.InputPin_3005); //$NON-NLS-1$
		case CallBehaviorActionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?CallBehaviorAction", UMLElementTypes.CallBehaviorAction_3044); //$NON-NLS-1$
		case OutputPin3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?OutputPin", UMLElementTypes.OutputPin_3006); //$NON-NLS-1$
		case InputPin4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?InputPin", UMLElementTypes.InputPin_3007); //$NON-NLS-1$
		case CallOperationActionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?CallOperationAction", UMLElementTypes.CallOperationAction_3045); //$NON-NLS-1$
		case InputPin5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?InputPin", UMLElementTypes.InputPin_3008); //$NON-NLS-1$
		case StructuredActivityNodeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?StructuredActivityNode", UMLElementTypes.StructuredActivityNode_3046); //$NON-NLS-1$
		case StructuredActivityNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?StructuredActivityNode", UMLElementTypes.StructuredActivityNode_3009); //$NON-NLS-1$
		case OpaqueAction2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?OpaqueAction", UMLElementTypes.OpaqueAction_3011); //$NON-NLS-1$
		case AcceptEventAction3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?AcceptEventAction", UMLElementTypes.AcceptEventAction_3012); //$NON-NLS-1$
		case AcceptEventAction4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?AcceptEventAction", UMLElementTypes.AcceptEventAction_3013); //$NON-NLS-1$
		case ActivityFinalNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?ActivityFinalNode", UMLElementTypes.ActivityFinalNode_3014); //$NON-NLS-1$
		case DecisionNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?DecisionNode", UMLElementTypes.DecisionNode_3015); //$NON-NLS-1$
		case FlowFinalNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?FlowFinalNode", UMLElementTypes.FlowFinalNode_3016); //$NON-NLS-1$
		case Pin2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?Pin", UMLElementTypes.Pin_3017); //$NON-NLS-1$
		case CreateObjectAction2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?CreateObjectAction", UMLElementTypes.CreateObjectAction_3018); //$NON-NLS-1$
		case CallBehaviorAction2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?CallBehaviorAction", UMLElementTypes.CallBehaviorAction_3019); //$NON-NLS-1$
		case CallOperationAction2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?CallOperationAction", UMLElementTypes.CallOperationAction_3020); //$NON-NLS-1$
		case ForkNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?ForkNode", UMLElementTypes.ForkNode_3021); //$NON-NLS-1$
		case JoinNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?JoinNode", UMLElementTypes.JoinNode_3022); //$NON-NLS-1$
		case AddStructuralFeatureValueAction2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?AddStructuralFeatureValueAction", UMLElementTypes.AddStructuralFeatureValueAction_3023); //$NON-NLS-1$
		case DataStoreNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?DataStoreNode", UMLElementTypes.DataStoreNode_3024); //$NON-NLS-1$
		case CentralBufferNode2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?CentralBufferNode", UMLElementTypes.CentralBufferNode_3025); //$NON-NLS-1$
		case OpaqueBehaviorEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?OpaqueBehavior", UMLElementTypes.OpaqueBehavior_3047); //$NON-NLS-1$
		case ActivityParameterNodeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?ActivityParameterNode", UMLElementTypes.ActivityParameterNode_3052); //$NON-NLS-1$
		case SendSignalActionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?SendSignalAction", UMLElementTypes.SendSignalAction_3053); //$NON-NLS-1$
		case LiteralStringEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?LiteralString", UMLElementTypes.LiteralString_3049); //$NON-NLS-1$
		case LiteralString2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.1.0/UML?LiteralString", UMLElementTypes.LiteralString_3051); //$NON-NLS-1$
		case ControlFlowEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.1.0/UML?ControlFlow", UMLElementTypes.ControlFlow_4001); //$NON-NLS-1$
		case ObjectFlowEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.1.0/UML?ObjectFlow", UMLElementTypes.ObjectFlow_4002); //$NON-NLS-1$
		case ActionLocalPreconditionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.1.0/UML?Action?localPrecondition", UMLElementTypes.ActionLocalPrecondition_4003); //$NON-NLS-1$
		case ObjectNodeSelectionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.1.0/UML?ObjectNode?selection", UMLElementTypes.ObjectNodeSelection_4004); //$NON-NLS-1$
		case ExceptionHandlerEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.1.0/UML?ExceptionHandler", UMLElementTypes.ExceptionHandler_4005); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
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
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof UMLNavigatorGroup) {
			UMLNavigatorGroup group = (UMLNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof UMLNavigatorItem) {
			UMLNavigatorItem navigatorItem = (UMLNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000Text(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2026Text(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_2027Text(view);
		case Constraint2EditPart.VISUAL_ID:
			return getConstraint_2028Text(view);
		case AcceptEventActionEditPart.VISUAL_ID:
			return getAcceptEventAction_3030Text(view);
		case AcceptEventAction2EditPart.VISUAL_ID:
			return getAcceptEventAction_3031Text(view);
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getActivityFinalNode_3032Text(view);
		case DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_3033Text(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_3034Text(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_3035Text(view);
		case DataStoreNodeEditPart.VISUAL_ID:
			return getDataStoreNode_3036Text(view);
		case CentralBufferNodeEditPart.VISUAL_ID:
			return getCentralBufferNode_3037Text(view);
		case OpaqueActionEditPart.VISUAL_ID:
			return getOpaqueAction_3029Text(view);
		case OutputPinEditPart.VISUAL_ID:
			return getOutputPin_3001Text(view);
		case FlowFinalNodeEditPart.VISUAL_ID:
			return getFlowFinalNode_3038Text(view);
		case ForkNodeEditPart.VISUAL_ID:
			return getForkNode_3039Text(view);
		case JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_3040Text(view);
		case PinEditPart.VISUAL_ID:
			return getPin_3041Text(view);
		case CreateObjectActionEditPart.VISUAL_ID:
			return getCreateObjectAction_3042Text(view);
		case OutputPin2EditPart.VISUAL_ID:
			return getOutputPin_3002Text(view);
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
			return getAddStructuralFeatureValueAction_3043Text(view);
		case InputPinEditPart.VISUAL_ID:
			return getInputPin_3003Text(view);
		case InputPin2EditPart.VISUAL_ID:
			return getInputPin_3004Text(view);
		case InputPin3EditPart.VISUAL_ID:
			return getInputPin_3005Text(view);
		case CallBehaviorActionEditPart.VISUAL_ID:
			return getCallBehaviorAction_3044Text(view);
		case OutputPin3EditPart.VISUAL_ID:
			return getOutputPin_3006Text(view);
		case InputPin4EditPart.VISUAL_ID:
			return getInputPin_3007Text(view);
		case CallOperationActionEditPart.VISUAL_ID:
			return getCallOperationAction_3045Text(view);
		case InputPin5EditPart.VISUAL_ID:
			return getInputPin_3008Text(view);
		case StructuredActivityNodeEditPart.VISUAL_ID:
			return getStructuredActivityNode_3046Text(view);
		case StructuredActivityNode2EditPart.VISUAL_ID:
			return getStructuredActivityNode_3009Text(view);
		case OpaqueAction2EditPart.VISUAL_ID:
			return getOpaqueAction_3011Text(view);
		case AcceptEventAction3EditPart.VISUAL_ID:
			return getAcceptEventAction_3012Text(view);
		case AcceptEventAction4EditPart.VISUAL_ID:
			return getAcceptEventAction_3013Text(view);
		case ActivityFinalNode2EditPart.VISUAL_ID:
			return getActivityFinalNode_3014Text(view);
		case DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3015Text(view);
		case FlowFinalNode2EditPart.VISUAL_ID:
			return getFlowFinalNode_3016Text(view);
		case Pin2EditPart.VISUAL_ID:
			return getPin_3017Text(view);
		case CreateObjectAction2EditPart.VISUAL_ID:
			return getCreateObjectAction_3018Text(view);
		case CallBehaviorAction2EditPart.VISUAL_ID:
			return getCallBehaviorAction_3019Text(view);
		case CallOperationAction2EditPart.VISUAL_ID:
			return getCallOperationAction_3020Text(view);
		case ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3021Text(view);
		case JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3022Text(view);
		case AddStructuralFeatureValueAction2EditPart.VISUAL_ID:
			return getAddStructuralFeatureValueAction_3023Text(view);
		case DataStoreNode2EditPart.VISUAL_ID:
			return getDataStoreNode_3024Text(view);
		case CentralBufferNode2EditPart.VISUAL_ID:
			return getCentralBufferNode_3025Text(view);
		case OpaqueBehaviorEditPart.VISUAL_ID:
			return getOpaqueBehavior_3047Text(view);
		case ActivityParameterNodeEditPart.VISUAL_ID:
			return getActivityParameterNode_3052Text(view);
		case SendSignalActionEditPart.VISUAL_ID:
			return getSendSignalAction_3053Text(view);
		case LiteralStringEditPart.VISUAL_ID:
			return getLiteralString_3049Text(view);
		case LiteralString2EditPart.VISUAL_ID:
			return getLiteralString_3051Text(view);
		case ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4001Text(view);
		case ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4002Text(view);
		case ActionLocalPreconditionEditPart.VISUAL_ID:
			return getActionLocalPrecondition_4003Text(view);
		case ObjectNodeSelectionEditPart.VISUAL_ID:
			return getObjectNodeSelection_4004Text(view);
		case ExceptionHandlerEditPart.VISUAL_ID:
			return getExceptionHandler_4005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getPackage_1000Text(View view) {
		Package domainModelElement = (Package) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActivity_2026Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.Activity_2026, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(ActivityNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getConstraint_2027Text(View view) {
		Constraint domainModelElement = (Constraint) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConstraint_2028Text(View view) {
		Constraint domainModelElement = (Constraint) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 2028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAcceptEventAction_3030Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.AcceptEventAction_3030, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(AcceptEventActionNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAcceptEventAction_3031Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.AcceptEventAction_3031, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(AcceptEventActionName3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getActivityFinalNode_3032Text(View view) {
		ActivityFinalNode domainModelElement = (ActivityFinalNode) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDecisionNode_3033Text(View view) {
		DecisionNode domainModelElement = (DecisionNode) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMergeNode_3034Text(View view) {
		MergeNode domainModelElement = (MergeNode) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInitialNode_3035Text(View view) {
		InitialNode domainModelElement = (InitialNode) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataStoreNode_3036Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.DataStoreNode_3036, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(DataStoreNodeNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getCentralBufferNode_3037Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.CentralBufferNode_3037, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(CentralBufferNodeNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getOpaqueAction_3029Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.OpaqueAction_3029, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(OpaqueActionNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getOutputPin_3001Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.OutputPin_3001, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(OutputPinNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getFlowFinalNode_3038Text(View view) {
		FlowFinalNode domainModelElement = (FlowFinalNode) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForkNode_3039Text(View view) {
		ForkNode domainModelElement = (ForkNode) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJoinNode_3040Text(View view) {
		JoinNode domainModelElement = (JoinNode) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPin_3041Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.Pin_3041, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(PinNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getCreateObjectAction_3042Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.CreateObjectAction_3042, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(CreateObjectActionNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getOutputPin_3002Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.OutputPin_3002, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(OutputPinName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAddStructuralFeatureValueAction_3043Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.AddStructuralFeatureValueAction_3043, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(AddStructuralFeatureValueActionNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getInputPin_3003Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.InputPin_3003, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(InputPinNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getInputPin_3004Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.InputPin_3004, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(InputPinName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getInputPin_3005Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.InputPin_3005, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(InputPinName3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getCallBehaviorAction_3044Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.CallBehaviorAction_3044, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(CallBehaviorActionNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getOutputPin_3006Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.OutputPin_3006, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(OutputPinName3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getInputPin_3007Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.InputPin_3007, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(InputPinName4EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getCallOperationAction_3045Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.CallOperationAction_3045, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(CallOperationActionNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getInputPin_3008Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.InputPin_3008, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(InputPinName5EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getStructuredActivityNode_3046Text(View view) {
		StructuredActivityNode domainModelElement = (StructuredActivityNode) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStructuredActivityNode_3009Text(View view) {
		StructuredActivityNode domainModelElement = (StructuredActivityNode) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueAction_3011Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.OpaqueAction_3011, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(OpaqueActionName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAcceptEventAction_3012Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.AcceptEventAction_3012, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(AcceptEventActionName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getAcceptEventAction_3013Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.AcceptEventAction_3013, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(AcceptEventActionName4EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getActivityFinalNode_3014Text(View view) {
		ActivityFinalNode domainModelElement = (ActivityFinalNode) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDecisionNode_3015Text(View view) {
		DecisionNode domainModelElement = (DecisionNode) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFlowFinalNode_3016Text(View view) {
		FlowFinalNode domainModelElement = (FlowFinalNode) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPin_3017Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.Pin_3017, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(PinName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getCreateObjectAction_3018Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.CreateObjectAction_3018, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(CreateObjectActionName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getCallBehaviorAction_3019Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.CallBehaviorAction_3019, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(CallBehaviorActionName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getCallOperationAction_3020Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.CallOperationAction_3020, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(CallOperationActionName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getForkNode_3021Text(View view) {
		ForkNode domainModelElement = (ForkNode) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJoinNode_3022Text(View view) {
		JoinNode domainModelElement = (JoinNode) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAddStructuralFeatureValueAction_3023Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.AddStructuralFeatureValueAction_3023, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(AddStructuralFeatureValueActionName2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getDataStoreNode_3024Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.DataStoreNode_3024, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(DataStoreNodeName3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getCentralBufferNode_3025Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.CentralBufferNode_3025, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(CentralBufferNodeName3EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getOpaqueBehavior_3047Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.OpaqueBehavior_3047, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(OpaqueBehaviorNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getActivityParameterNode_3052Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.ActivityParameterNode_3052, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(ActivityParameterNodeNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getSendSignalAction_3053Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.SendSignalAction_3053, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(SendSignalActionNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getLiteralString_3049Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.LiteralString_3049, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(LiteralStringEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLiteralString_3051Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.LiteralString_3051, (view.getElement() != null ? view.getElement() : view), UMLVisualIDRegistry
				.getType(LiteralString2EditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlFlow_4001Text(View view) {
		ControlFlow domainModelElement = (ControlFlow) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getObjectFlow_4002Text(View view) {
		ObjectFlow domainModelElement = (ObjectFlow) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActionLocalPrecondition_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getObjectNodeSelection_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getExceptionHandler_4005Text(View view) {
		IAdaptable hintAdapter = new UMLParserProvider.HintAdapter(UMLElementTypes.ExceptionHandler_4005, (view.getElement() != null ? view.getElement() : view), CommonParserHint.DESCRIPTION);
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
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

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return PackageEditPart.MODEL_ID.equals(UMLVisualIDRegistry.getModelID(view));
	}

}
