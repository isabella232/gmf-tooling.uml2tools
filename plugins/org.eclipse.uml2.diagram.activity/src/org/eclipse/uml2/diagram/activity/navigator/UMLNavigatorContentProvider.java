package org.eclipse.uml2.diagram.activity.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionEditPart;
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
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.MergeNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;

/**
 * @generated
 */
public class UMLNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	public void dispose() {
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof UMLAbstractNavigatorItem) {
			UMLAbstractNavigatorItem abstractNavigatorItem = (UMLAbstractNavigatorItem) parentElement;
			if (!ActivityEditPart.MODEL_ID.equals(abstractNavigatorItem.getModelID())) {
				return EMPTY_ARRAY;
			}

			if (abstractNavigatorItem instanceof UMLNavigatorItem) {
				UMLNavigatorItem navigatorItem = (UMLNavigatorItem) abstractNavigatorItem;
				switch (navigatorItem.getVisualID()) {
				case AcceptEventActionEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case AcceptEventAction2EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case ActivityFinalNodeEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case DecisionNodeEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case MergeNodeEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case InitialNodeEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case StructuredActivityNodeEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case DataStoreNodeEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case CentralBufferNodeEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case OpaqueActionEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(OutputPinEditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case FlowFinalNodeEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case ForkNodeEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case JoinNodeEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case PinEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case CreateObjectActionEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(OutputPin2EditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case AddStructuralFeatureValueActionEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(InputPinEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(InputPin2EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(InputPin3EditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case CallBehaviorActionEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(OutputPin3EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(InputPin4EditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case CallOperationActionEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(OutputPin3EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(InputPin4EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(InputPin5EditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case OutputPinEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case OutputPin2EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case InputPinEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case InputPin2EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case InputPin3EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case OutputPin3EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case InputPin4EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case InputPin5EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case ActivityEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(AcceptEventActionEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(AcceptEventAction2EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(ActivityFinalNodeEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(DecisionNodeEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(MergeNodeEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(InitialNodeEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(StructuredActivityNodeEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(DataStoreNodeEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(CentralBufferNodeEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(OpaqueActionEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(FlowFinalNodeEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(ForkNodeEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(JoinNodeEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(PinEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(CreateObjectActionEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(AddStructuralFeatureValueActionEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(CallBehaviorActionEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(CallOperationActionEditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup links = new UMLNavigatorGroup("links", "icons/linksNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					links.addChildren(getViewByType(navigatorItem.getView().getDiagram().getEdges(), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID), links));
					links.addChildren(getViewByType(navigatorItem.getView().getDiagram().getEdges(), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID), links));
					if (!links.isEmpty()) {
						result.add(links);
					}
					return result.toArray();
				}
				case ControlFlowEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AcceptEventActionEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AcceptEventAction2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ActivityFinalNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DecisionNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(MergeNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InitialNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(StructuredActivityNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataStoreNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(CentralBufferNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OpaqueActionEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(FlowFinalNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ForkNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(JoinNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PinEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(CreateObjectActionEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AddStructuralFeatureValueActionEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(CallBehaviorActionEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(CallOperationActionEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OutputPinEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OutputPin2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPinEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPin2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPin3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OutputPin3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPin4EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPin5EditPart.VISUAL_ID), true, target));
					UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AcceptEventActionEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AcceptEventAction2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ActivityFinalNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DecisionNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(MergeNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InitialNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(StructuredActivityNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataStoreNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(CentralBufferNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OpaqueActionEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(FlowFinalNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ForkNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(JoinNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PinEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(CreateObjectActionEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AddStructuralFeatureValueActionEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(CallBehaviorActionEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(CallOperationActionEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OutputPinEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OutputPin2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPinEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPin2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPin3EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OutputPin3EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPin4EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPin5EditPart.VISUAL_ID), false, source));
					if (!target.isEmpty()) {
						result.add(target);
					}
					if (!source.isEmpty()) {
						result.add(source);
					}
					return result.toArray();
				}
				case ObjectFlowEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AcceptEventActionEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AcceptEventAction2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ActivityFinalNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DecisionNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(MergeNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InitialNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(StructuredActivityNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataStoreNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(CentralBufferNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OpaqueActionEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(FlowFinalNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ForkNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(JoinNodeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PinEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(CreateObjectActionEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AddStructuralFeatureValueActionEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(CallBehaviorActionEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(CallOperationActionEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OutputPinEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OutputPin2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPinEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPin2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPin3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OutputPin3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPin4EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPin5EditPart.VISUAL_ID), true, target));
					UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", ActivityEditPart.MODEL_ID, navigatorItem);
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AcceptEventActionEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AcceptEventAction2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ActivityFinalNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DecisionNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(MergeNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InitialNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(StructuredActivityNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataStoreNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(CentralBufferNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OpaqueActionEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(FlowFinalNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ForkNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(JoinNodeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PinEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(CreateObjectActionEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AddStructuralFeatureValueActionEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(CallBehaviorActionEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(CallOperationActionEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OutputPinEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OutputPin2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPinEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPin2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPin3EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OutputPin3EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPin4EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InputPin5EditPart.VISUAL_ID), false, source));
					if (!target.isEmpty()) {
						result.add(target);
					}
					if (!source.isEmpty()) {
						result.add(source);
					}
					return result.toArray();
				}
				}
			} else if (abstractNavigatorItem instanceof UMLNavigatorGroup) {
				UMLNavigatorGroup group = (UMLNavigatorGroup) parentElement;
				return group.getChildren();
			}
		} else if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) GMFEditingDomainFactory.INSTANCE.createEditingDomain();
			editingDomain.setResourceToReadOnlyMap(new HashMap() {

				public Object get(Object key) {
					if (!containsKey(key)) {
						put(key, Boolean.TRUE);
					}
					return super.get(key);
				}
			});
			ResourceSet resourceSet = editingDomain.getResourceSet();

			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString());
			Resource resource = resourceSet.getResource(fileURI, true);

			Collection result = new ArrayList();
			result.addAll(getViewByType(resource.getContents(), ActivityEditPart.MODEL_ID, file));
			return result.toArray();
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof UMLAbstractNavigatorItem) {
			UMLAbstractNavigatorItem abstractNavigatorItem = (UMLAbstractNavigatorItem) element;
			if (!ActivityEditPart.MODEL_ID.equals(abstractNavigatorItem.getModelID())) {
				return null;
			}
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
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
	private Collection getViewByType(Collection childViews, String type, Object parent) {
		Collection result = new ArrayList();
		for (Iterator it = childViews.iterator(); it.hasNext();) {
			Object next = it.next();
			if (false == next instanceof View) {
				continue;
			}
			View nextView = (View) next;
			if (type.equals(nextView.getType())) {
				result.add(new UMLNavigatorItem(nextView, parent));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getChildByType(Collection childViews, String type, Object parent) {
		Collection result = new ArrayList();
		List children = new ArrayList(childViews);
		for (int i = 0; i < children.size(); i++) {
			if (false == children.get(i) instanceof View) {
				continue;
			}
			View nextChild = (View) children.get(i);
			if (type.equals(nextChild.getType())) {
				result.add(new UMLNavigatorItem(nextChild, parent));
			} else if (!stopGettingChildren(nextChild, type)) {
				children.addAll(nextChild.getChildren());
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean stopGettingChildren(View child, String type) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getConnectedViews(View rootView, String type, boolean isOutTarget, Object parent) {
		Collection result = new ArrayList();
		List connectedViews = new ArrayList();
		connectedViews.add(rootView);
		Set visitedViews = new HashSet();
		for (int i = 0; i < connectedViews.size(); i++) {
			View nextView = (View) connectedViews.get(i);
			if (visitedViews.contains(nextView)) {
				continue;
			}
			visitedViews.add(nextView);
			if (type.equals(nextView.getType()) && nextView != rootView) {
				result.add(new UMLNavigatorItem(nextView, parent));
			} else {
				if (isOutTarget && !stopGettingOutTarget(nextView, rootView, type)) {
					connectedViews.addAll(nextView.getSourceEdges());
					if (nextView instanceof Edge) {
						connectedViews.add(((Edge) nextView).getTarget());
					}
				}
				if (!isOutTarget && !stopGettingInSource(nextView, rootView, type)) {
					connectedViews.addAll(nextView.getTargetEdges());
					if (nextView instanceof Edge) {
						connectedViews.add(((Edge) nextView).getSource());
					}
				}
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean stopGettingInSource(View nextView, View rootView, String type) {
		return !isOneHopConnection(nextView, rootView);
	}

	/**
	 * @generated
	 */
	private boolean stopGettingOutTarget(View nextView, View rootView, String type) {
		return !isOneHopConnection(nextView, rootView);
	}

	/**
	 * @generated
	 */
	private boolean isOneHopConnection(View targetView, View sourceView) {
		if (sourceView == targetView) {
			return true;
		}
		if (sourceView instanceof Node) {
			return targetView instanceof Edge;
		}
		if (sourceView instanceof Edge) {
			return targetView instanceof Node;
		}
		return false;
	}

}
