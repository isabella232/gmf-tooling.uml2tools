package org.eclipse.uml2.diagram.activity.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.jface.viewers.Viewer;

import org.eclipse.ui.IMemento;

import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNodeEditPart;
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
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.MergeNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Pin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart;

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
		if (parentElement instanceof IFile) {
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

			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = resourceSet.getResource(fileURI, true);

			Collection result = new ArrayList();
			result.addAll(createNavigatorItems(selectViewsByType(resource.getContents(), ActivityEditPart.MODEL_ID), file));
			return result.toArray();
		}

		if (parentElement instanceof UMLNavigatorGroup) {
			UMLNavigatorGroup group = (UMLNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof UMLNavigatorItem) {
			UMLNavigatorItem navigatorItem = (UMLNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case AcceptEventActionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getAcceptEventAction_2001ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getAcceptEventAction_2001ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getAcceptEventAction_2001ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getAcceptEventAction_2001ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getAcceptEventAction_2002ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getAcceptEventAction_2002ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getAcceptEventAction_2002ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getAcceptEventAction_2002ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getActivityFinalNode_2003ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getActivityFinalNode_2003ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getActivityFinalNode_2003ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getActivityFinalNode_2003ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getDecisionNode_2004ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getDecisionNode_2004ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getDecisionNode_2004ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getDecisionNode_2004ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getMergeNode_2005ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getMergeNode_2005ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getMergeNode_2005ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getMergeNode_2005ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getInitialNode_2006ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getInitialNode_2006ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getInitialNode_2006ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getInitialNode_2006ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getDataStoreNode_2008ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getDataStoreNode_2008ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getDataStoreNode_2008ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getDataStoreNode_2008ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getCentralBufferNode_2009ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getCentralBufferNode_2009ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getCentralBufferNode_2009ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getCentralBufferNode_2009ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			result.addAll(getOpaqueAction_2010ToOutputPin_3001Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getOpaqueAction_2010ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getOpaqueAction_2010ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getOpaqueAction_2010ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getOpaqueAction_2010ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getFlowFinalNode_2011ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getFlowFinalNode_2011ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getFlowFinalNode_2011ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getFlowFinalNode_2011ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getForkNode_2012ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getForkNode_2012ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getForkNode_2012ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getForkNode_2012ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getJoinNode_2013ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getJoinNode_2013ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getJoinNode_2013ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getJoinNode_2013ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getPin_2014ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getPin_2014ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getPin_2014ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getPin_2014ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			result.addAll(getCreateObjectAction_2015ToOutputPin_3002Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getCreateObjectAction_2015ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getCreateObjectAction_2015ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getCreateObjectAction_2015ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getCreateObjectAction_2015ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			result.addAll(getAddStructuralFeatureValueAction_2016ToInputPin_3003Children(view, parentElement));
			result.addAll(getAddStructuralFeatureValueAction_2016ToInputPin_3004Children(view, parentElement));
			result.addAll(getAddStructuralFeatureValueAction_2016ToInputPin_3005Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getAddStructuralFeatureValueAction_2016ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getAddStructuralFeatureValueAction_2016ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getAddStructuralFeatureValueAction_2016ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getAddStructuralFeatureValueAction_2016ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			result.addAll(getCallBehaviorAction_2017ToOutputPin_3006Children(view, parentElement));
			result.addAll(getCallBehaviorAction_2017ToInputPin_3007Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getCallBehaviorAction_2017ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getCallBehaviorAction_2017ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getCallBehaviorAction_2017ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getCallBehaviorAction_2017ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			result.addAll(getCallOperationAction_2018ToOutputPin_3006Children(view, parentElement));
			result.addAll(getCallOperationAction_2018ToInputPin_3007Children(view, parentElement));
			result.addAll(getCallOperationAction_2018ToInputPin_3008Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getCallOperationAction_2018ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getCallOperationAction_2018ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getCallOperationAction_2018ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getCallOperationAction_2018ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			result.addAll(getStructuredActivityNode_2007ToStructuredActivityNode_3009Children(view, parentElement));
			result.addAll(getStructuredActivityNode_2007ToOpaqueAction_3011Children(view, parentElement));
			result.addAll(getStructuredActivityNode_2007ToAcceptEventAction_3012Children(view, parentElement));
			result.addAll(getStructuredActivityNode_2007ToAcceptEventAction_3013Children(view, parentElement));
			result.addAll(getStructuredActivityNode_2007ToActivityFinalNode_3014Children(view, parentElement));
			result.addAll(getStructuredActivityNode_2007ToDecisionNode_3015Children(view, parentElement));
			result.addAll(getStructuredActivityNode_2007ToFlowFinalNode_3016Children(view, parentElement));
			result.addAll(getStructuredActivityNode_2007ToPin_3017Children(view, parentElement));
			result.addAll(getStructuredActivityNode_2007ToCreateObjectAction_3018Children(view, parentElement));
			result.addAll(getStructuredActivityNode_2007ToCallBehaviorAction_3019Children(view, parentElement));
			result.addAll(getStructuredActivityNode_2007ToCallOperationAction_3020Children(view, parentElement));
			result.addAll(getStructuredActivityNode_2007ToForkNode_3021Children(view, parentElement));
			result.addAll(getStructuredActivityNode_2007ToJoinNode_3022Children(view, parentElement));
			result.addAll(getStructuredActivityNode_2007ToAddStructuralFeatureValueAction_3023Children(view, parentElement));
			result.addAll(getStructuredActivityNode_2007ToDataStoreNode_3024Children(view, parentElement));
			result.addAll(getStructuredActivityNode_2007ToCentralBufferNode_3025Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getStructuredActivityNode_2007ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getStructuredActivityNode_2007ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getStructuredActivityNode_2007ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getStructuredActivityNode_2007ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getOutputPin_3001ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getOutputPin_3001ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getOutputPin_3001ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getOutputPin_3001ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getOutputPin_3002ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getOutputPin_3002ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getOutputPin_3002ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getOutputPin_3002ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getInputPin_3003ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getInputPin_3003ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getInputPin_3003ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getInputPin_3003ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getInputPin_3004ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getInputPin_3004ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getInputPin_3004ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getInputPin_3004ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getInputPin_3005ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getInputPin_3005ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getInputPin_3005ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getInputPin_3005ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getOutputPin_3006ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getOutputPin_3006ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getOutputPin_3006ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getOutputPin_3006ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getInputPin_3007ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getInputPin_3007ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getInputPin_3007ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getInputPin_3007ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getInputPin_3008ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getInputPin_3008ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getInputPin_3008ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getInputPin_3008ToObjectFlow_4002OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case StructuredActivityNode2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getStructuredActivityNode_3009ToStructuredActivityNode_3009Children(view, parentElement));
			result.addAll(getStructuredActivityNode_3009ToOpaqueAction_3011Children(view, parentElement));
			result.addAll(getStructuredActivityNode_3009ToAcceptEventAction_3012Children(view, parentElement));
			result.addAll(getStructuredActivityNode_3009ToAcceptEventAction_3013Children(view, parentElement));
			result.addAll(getStructuredActivityNode_3009ToActivityFinalNode_3014Children(view, parentElement));
			result.addAll(getStructuredActivityNode_3009ToDecisionNode_3015Children(view, parentElement));
			result.addAll(getStructuredActivityNode_3009ToFlowFinalNode_3016Children(view, parentElement));
			result.addAll(getStructuredActivityNode_3009ToPin_3017Children(view, parentElement));
			result.addAll(getStructuredActivityNode_3009ToCreateObjectAction_3018Children(view, parentElement));
			result.addAll(getStructuredActivityNode_3009ToCallBehaviorAction_3019Children(view, parentElement));
			result.addAll(getStructuredActivityNode_3009ToCallOperationAction_3020Children(view, parentElement));
			result.addAll(getStructuredActivityNode_3009ToForkNode_3021Children(view, parentElement));
			result.addAll(getStructuredActivityNode_3009ToJoinNode_3022Children(view, parentElement));
			result.addAll(getStructuredActivityNode_3009ToAddStructuralFeatureValueAction_3023Children(view, parentElement));
			result.addAll(getStructuredActivityNode_3009ToDataStoreNode_3024Children(view, parentElement));
			result.addAll(getStructuredActivityNode_3009ToCentralBufferNode_3025Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getStructuredActivityNode_3009ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getStructuredActivityNode_3009ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getStructuredActivityNode_3009ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getStructuredActivityNode_3009ToObjectFlow_4002OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case OpaqueAction2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getOpaqueAction_3011ToOutputPin_3001Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getOpaqueAction_3011ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getOpaqueAction_3011ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getOpaqueAction_3011ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getOpaqueAction_3011ToObjectFlow_4002OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case AcceptEventAction3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getAcceptEventAction_3012ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getAcceptEventAction_3012ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getAcceptEventAction_3012ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getAcceptEventAction_3012ToObjectFlow_4002OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case AcceptEventAction4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getAcceptEventAction_3013ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getAcceptEventAction_3013ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getAcceptEventAction_3013ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getAcceptEventAction_3013ToObjectFlow_4002OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case ActivityFinalNode2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getActivityFinalNode_3014ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getActivityFinalNode_3014ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getActivityFinalNode_3014ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getActivityFinalNode_3014ToObjectFlow_4002OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case DecisionNode2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getDecisionNode_3015ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getDecisionNode_3015ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getDecisionNode_3015ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getDecisionNode_3015ToObjectFlow_4002OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case FlowFinalNode2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getFlowFinalNode_3016ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getFlowFinalNode_3016ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getFlowFinalNode_3016ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getFlowFinalNode_3016ToObjectFlow_4002OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case Pin2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getPin_3017ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getPin_3017ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getPin_3017ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getPin_3017ToObjectFlow_4002OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case CreateObjectAction2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getCreateObjectAction_3018ToOutputPin_3002Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getCreateObjectAction_3018ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getCreateObjectAction_3018ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getCreateObjectAction_3018ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getCreateObjectAction_3018ToObjectFlow_4002OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case CallBehaviorAction2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getCallBehaviorAction_3019ToOutputPin_3006Children(view, parentElement));
			result.addAll(getCallBehaviorAction_3019ToInputPin_3007Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getCallBehaviorAction_3019ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getCallBehaviorAction_3019ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getCallBehaviorAction_3019ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getCallBehaviorAction_3019ToObjectFlow_4002OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case CallOperationAction2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getCallOperationAction_3020ToOutputPin_3006Children(view, parentElement));
			result.addAll(getCallOperationAction_3020ToInputPin_3007Children(view, parentElement));
			result.addAll(getCallOperationAction_3020ToInputPin_3008Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getCallOperationAction_3020ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getCallOperationAction_3020ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getCallOperationAction_3020ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getCallOperationAction_3020ToObjectFlow_4002OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case ForkNode2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getForkNode_3021ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getForkNode_3021ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getForkNode_3021ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getForkNode_3021ToObjectFlow_4002OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case JoinNode2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getJoinNode_3022ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getJoinNode_3022ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getJoinNode_3022ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getJoinNode_3022ToObjectFlow_4002OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case AddStructuralFeatureValueAction2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getAddStructuralFeatureValueAction_3023ToInputPin_3003Children(view, parentElement));
			result.addAll(getAddStructuralFeatureValueAction_3023ToInputPin_3004Children(view, parentElement));
			result.addAll(getAddStructuralFeatureValueAction_3023ToInputPin_3005Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getAddStructuralFeatureValueAction_3023ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getAddStructuralFeatureValueAction_3023ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getAddStructuralFeatureValueAction_3023ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getAddStructuralFeatureValueAction_3023ToObjectFlow_4002OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case DataStoreNode2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getDataStoreNode_3024ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getDataStoreNode_3024ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getDataStoreNode_3024ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getDataStoreNode_3024ToObjectFlow_4002OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case CentralBufferNode2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getCentralBufferNode_3025ToControlFlow_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getCentralBufferNode_3025ToControlFlow_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getCentralBufferNode_3025ToObjectFlow_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getCentralBufferNode_3025ToObjectFlow_4002OutTarget(view, outgoinglinks));
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
			result.addAll(getActivity_1000ToAcceptEventAction_2001Children(view, parentElement));
			result.addAll(getActivity_1000ToAcceptEventAction_2002Children(view, parentElement));
			result.addAll(getActivity_1000ToActivityFinalNode_2003Children(view, parentElement));
			result.addAll(getActivity_1000ToDecisionNode_2004Children(view, parentElement));
			result.addAll(getActivity_1000ToMergeNode_2005Children(view, parentElement));
			result.addAll(getActivity_1000ToInitialNode_2006Children(view, parentElement));
			result.addAll(getActivity_1000ToDataStoreNode_2008Children(view, parentElement));
			result.addAll(getActivity_1000ToCentralBufferNode_2009Children(view, parentElement));
			result.addAll(getActivity_1000ToOpaqueAction_2010Children(view, parentElement));
			result.addAll(getActivity_1000ToFlowFinalNode_2011Children(view, parentElement));
			result.addAll(getActivity_1000ToForkNode_2012Children(view, parentElement));
			result.addAll(getActivity_1000ToJoinNode_2013Children(view, parentElement));
			result.addAll(getActivity_1000ToPin_2014Children(view, parentElement));
			result.addAll(getActivity_1000ToCreateObjectAction_2015Children(view, parentElement));
			result.addAll(getActivity_1000ToAddStructuralFeatureValueAction_2016Children(view, parentElement));
			result.addAll(getActivity_1000ToCallBehaviorAction_2017Children(view, parentElement));
			result.addAll(getActivity_1000ToCallOperationAction_2018Children(view, parentElement));
			result.addAll(getActivity_1000ToStructuredActivityNode_2007Children(view, parentElement));
			UMLNavigatorGroup links = new UMLNavigatorGroup("links", "icons/linksNavigatorGroup.gif", parentElement);
			links.addChildren(getActivity_1000ToControlFlow_4001Children(view, links));
			links.addChildren(getActivity_1000ToObjectFlow_4002Children(view, links));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}
		case ControlFlowEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getControlFlow_4001ToAcceptEventAction_2001OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToAcceptEventAction_2002OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToActivityFinalNode_2003OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToDecisionNode_2004OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToMergeNode_2005OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToInitialNode_2006OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToDataStoreNode_2008OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToCentralBufferNode_2009OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToOpaqueAction_2010OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToFlowFinalNode_2011OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToForkNode_2012OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToJoinNode_2013OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToPin_2014OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToCreateObjectAction_2015OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToAddStructuralFeatureValueAction_2016OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToCallBehaviorAction_2017OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToCallOperationAction_2018OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToStructuredActivityNode_2007OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToOutputPin_3001OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToOutputPin_3002OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToInputPin_3003OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToInputPin_3004OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToInputPin_3005OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToOutputPin_3006OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToInputPin_3007OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToInputPin_3008OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToStructuredActivityNode_3009OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToOpaqueAction_3011OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToAcceptEventAction_3012OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToAcceptEventAction_3013OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToActivityFinalNode_3014OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToDecisionNode_3015OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToFlowFinalNode_3016OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToPin_3017OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToCreateObjectAction_3018OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToCallBehaviorAction_3019OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToCallOperationAction_3020OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToForkNode_3021OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToJoinNode_3022OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToAddStructuralFeatureValueAction_3023OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToDataStoreNode_3024OutTarget((Edge) view, target));
			target.addChildren(getControlFlow_4001ToCentralBufferNode_3025OutTarget((Edge) view, target));
			UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getControlFlow_4001ToAcceptEventAction_2001InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToAcceptEventAction_2002InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToActivityFinalNode_2003InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToDecisionNode_2004InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToMergeNode_2005InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToInitialNode_2006InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToDataStoreNode_2008InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToCentralBufferNode_2009InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToOpaqueAction_2010InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToFlowFinalNode_2011InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToForkNode_2012InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToJoinNode_2013InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToPin_2014InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToCreateObjectAction_2015InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToAddStructuralFeatureValueAction_2016InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToCallBehaviorAction_2017InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToCallOperationAction_2018InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToStructuredActivityNode_2007InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToOutputPin_3001InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToOutputPin_3002InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToInputPin_3003InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToInputPin_3004InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToInputPin_3005InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToOutputPin_3006InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToInputPin_3007InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToInputPin_3008InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToStructuredActivityNode_3009InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToOpaqueAction_3011InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToAcceptEventAction_3012InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToAcceptEventAction_3013InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToActivityFinalNode_3014InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToDecisionNode_3015InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToFlowFinalNode_3016InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToPin_3017InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToCreateObjectAction_3018InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToCallBehaviorAction_3019InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToCallOperationAction_3020InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToForkNode_3021InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToJoinNode_3022InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToAddStructuralFeatureValueAction_3023InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToDataStoreNode_3024InSource((Edge) view, source));
			source.addChildren(getControlFlow_4001ToCentralBufferNode_3025InSource((Edge) view, source));
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
			UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getObjectFlow_4002ToAcceptEventAction_2001OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToAcceptEventAction_2002OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToActivityFinalNode_2003OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToDecisionNode_2004OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToMergeNode_2005OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToInitialNode_2006OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToDataStoreNode_2008OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToCentralBufferNode_2009OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToOpaqueAction_2010OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToFlowFinalNode_2011OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToForkNode_2012OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToJoinNode_2013OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToPin_2014OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToCreateObjectAction_2015OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToAddStructuralFeatureValueAction_2016OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToCallBehaviorAction_2017OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToCallOperationAction_2018OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToStructuredActivityNode_2007OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToOutputPin_3001OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToOutputPin_3002OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToInputPin_3003OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToInputPin_3004OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToInputPin_3005OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToOutputPin_3006OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToInputPin_3007OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToInputPin_3008OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToStructuredActivityNode_3009OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToOpaqueAction_3011OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToAcceptEventAction_3012OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToAcceptEventAction_3013OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToActivityFinalNode_3014OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToDecisionNode_3015OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToFlowFinalNode_3016OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToPin_3017OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToCreateObjectAction_3018OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToCallBehaviorAction_3019OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToCallOperationAction_3020OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToForkNode_3021OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToJoinNode_3022OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToAddStructuralFeatureValueAction_3023OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToDataStoreNode_3024OutTarget((Edge) view, target));
			target.addChildren(getObjectFlow_4002ToCentralBufferNode_3025OutTarget((Edge) view, target));
			UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getObjectFlow_4002ToAcceptEventAction_2001InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToAcceptEventAction_2002InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToActivityFinalNode_2003InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToDecisionNode_2004InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToMergeNode_2005InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToInitialNode_2006InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToDataStoreNode_2008InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToCentralBufferNode_2009InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToOpaqueAction_2010InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToFlowFinalNode_2011InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToForkNode_2012InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToJoinNode_2013InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToPin_2014InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToCreateObjectAction_2015InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToAddStructuralFeatureValueAction_2016InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToCallBehaviorAction_2017InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToCallOperationAction_2018InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToStructuredActivityNode_2007InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToOutputPin_3001InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToOutputPin_3002InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToInputPin_3003InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToInputPin_3004InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToInputPin_3005InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToOutputPin_3006InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToInputPin_3007InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToInputPin_3008InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToStructuredActivityNode_3009InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToOpaqueAction_3011InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToAcceptEventAction_3012InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToAcceptEventAction_3013InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToActivityFinalNode_3014InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToDecisionNode_3015InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToFlowFinalNode_3016InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToPin_3017InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToCreateObjectAction_3018InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToCallBehaviorAction_3019InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToCallOperationAction_3020InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToForkNode_3021InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToJoinNode_3022InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToAddStructuralFeatureValueAction_3023InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToDataStoreNode_3024InSource((Edge) view, source));
			source.addChildren(getObjectFlow_4002ToCentralBufferNode_3025InSource((Edge) view, source));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof UMLAbstractNavigatorItem) {
			UMLAbstractNavigatorItem abstractNavigatorItem = (UMLAbstractNavigatorItem) element;
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
	private Collection getObjectFlow_4002ToStructuredActivityNode_2007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(StructuredActivityNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToStructuredActivityNode_2007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToStructuredActivityNode_2007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAcceptEventAction_3013ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAcceptEventAction_3013ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAcceptEventAction_3013ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToForkNode_3021Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ForkNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToForkNode_3021ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToForkNode_3021ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToOpaqueAction_3011Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(OpaqueAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToOpaqueAction_3011ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToOpaqueAction_3011ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToCallOperationAction_3020InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CallOperationAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToCallOperationAction_3020InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToCallOperationAction_3020InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOutputPin_3001ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOutputPin_3001ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOutputPin_3001ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getJoinNode_3022ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isJoinNode_3022ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isJoinNode_3022ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToInputPin_3007InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPin4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToInputPin_3007InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToInputPin_3007InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToAddStructuralFeatureValueAction_3023Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(AddStructuralFeatureValueAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToAddStructuralFeatureValueAction_3023ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToAddStructuralFeatureValueAction_3023ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToDataStoreNode_2008Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DataStoreNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToDataStoreNode_2008ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToDataStoreNode_2008ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToOpaqueAction_3011Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(OpaqueAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToOpaqueAction_3011ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(OpaqueAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToOpaqueAction_3011ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToOpaqueAction_3011ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToOutputPin_3002InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OutputPin2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToOutputPin_3002InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToOutputPin_3002InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOutputPin_3006ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOutputPin_3006ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOutputPin_3006ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToDecisionNode_2004Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DecisionNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToDecisionNode_2004ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToDecisionNode_2004ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getOutputPin_3002ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOutputPin_3002ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOutputPin_3002ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToStructuredActivityNode_2007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(StructuredActivityNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToStructuredActivityNode_2007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToStructuredActivityNode_2007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToOpaqueAction_3011OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OpaqueAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToOpaqueAction_3011OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToOpaqueAction_3011OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToAcceptEventAction_2001InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AcceptEventActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToAcceptEventAction_2001InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToAcceptEventAction_2001InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToCreateObjectAction_2015Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(CreateObjectActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToCreateObjectAction_2015ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToCreateObjectAction_2015ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToJoinNode_2013OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(JoinNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToJoinNode_2013OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToJoinNode_2013OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToCallOperationAction_3020OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CallOperationAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToCallOperationAction_3020OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToCallOperationAction_3020OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOpaqueAction_3011ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOpaqueAction_3011ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOpaqueAction_3011ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getJoinNode_2013ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isJoinNode_2013ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isJoinNode_2013ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToDataStoreNode_3024Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(DataStoreNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToDataStoreNode_3024ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToDataStoreNode_3024ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToDataStoreNode_3024Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(DataStoreNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToDataStoreNode_3024ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(DataStoreNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToDataStoreNode_3024ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToDataStoreNode_3024ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getAddStructuralFeatureValueAction_2016ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAddStructuralFeatureValueAction_2016ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAddStructuralFeatureValueAction_2016ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToDataStoreNode_3024OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataStoreNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToDataStoreNode_3024OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToDataStoreNode_3024OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToCentralBufferNode_2009Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(CentralBufferNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToCentralBufferNode_2009ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToCentralBufferNode_2009ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToControlFlow_4001Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToControlFlow_4001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToControlFlow_4001ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToFlowFinalNode_2011OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(FlowFinalNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToFlowFinalNode_2011OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToFlowFinalNode_2011OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToCallBehaviorAction_2017OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CallBehaviorActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToCallBehaviorAction_2017OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToCallBehaviorAction_2017OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3004ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3004ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3004ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToCreateObjectAction_2015InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CreateObjectActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToCreateObjectAction_2015InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToCreateObjectAction_2015InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOpaqueAction_3011ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOpaqueAction_3011ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOpaqueAction_3011ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAddStructuralFeatureValueAction_2016ToInputPin_3003Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAddStructuralFeatureValueAction_2016ToInputPin_3003ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAddStructuralFeatureValueAction_2016ToInputPin_3003ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToStructuredActivityNode_2007Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToStructuredActivityNode_2007ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToStructuredActivityNode_2007ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getForkNode_3021ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isForkNode_3021ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isForkNode_3021ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToOpaqueAction_2010OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OpaqueActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToOpaqueAction_2010OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToOpaqueAction_2010OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCreateObjectAction_2015ToOutputPin_3002Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPin2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCreateObjectAction_2015ToOutputPin_3002ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCreateObjectAction_2015ToOutputPin_3002ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getDataStoreNode_3024ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataStoreNode_3024ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataStoreNode_3024ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDecisionNode_3015ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDecisionNode_3015ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDecisionNode_3015ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCreateObjectAction_3018ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCreateObjectAction_3018ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCreateObjectAction_3018ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToJoinNode_3022OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(JoinNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToJoinNode_3022OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToJoinNode_3022OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToInitialNode_2006InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InitialNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToInitialNode_2006InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToInitialNode_2006InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToForkNode_2012InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ForkNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToForkNode_2012InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToForkNode_2012InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivityFinalNode_3014ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivityFinalNode_3014ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivityFinalNode_3014ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToOutputPin_3006OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OutputPin3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToOutputPin_3006OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToOutputPin_3006OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToDecisionNode_2004OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DecisionNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToDecisionNode_2004OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToDecisionNode_2004OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getJoinNode_2013ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isJoinNode_2013ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isJoinNode_2013ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToCallOperationAction_3020InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CallOperationAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToCallOperationAction_3020InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToCallOperationAction_3020InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToDataStoreNode_3024OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataStoreNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToDataStoreNode_3024OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToDataStoreNode_3024OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToAcceptEventAction_2002InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AcceptEventAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToAcceptEventAction_2002InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToAcceptEventAction_2002InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOutputPin_3001ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOutputPin_3001ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOutputPin_3001ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToJoinNode_3022Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(JoinNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToJoinNode_3022ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(JoinNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToJoinNode_3022ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToJoinNode_3022ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToAcceptEventAction_2002InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AcceptEventAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToAcceptEventAction_2002InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToAcceptEventAction_2002InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToDecisionNode_3015OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DecisionNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToDecisionNode_3015OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToDecisionNode_3015OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToActivityFinalNode_3014OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ActivityFinalNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToActivityFinalNode_3014OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToActivityFinalNode_3014OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCreateObjectAction_2015ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCreateObjectAction_2015ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCreateObjectAction_2015ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallOperationAction_2018ToInputPin_3008Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPin5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallOperationAction_2018ToInputPin_3008ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallOperationAction_2018ToInputPin_3008ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getForkNode_3021ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isForkNode_3021ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isForkNode_3021ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToStructuredActivityNode_3009Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToStructuredActivityNode_3009ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToStructuredActivityNode_3009ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3007ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3007ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3007ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAddStructuralFeatureValueAction_2016ToInputPin_3005Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPin3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAddStructuralFeatureValueAction_2016ToInputPin_3005ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAddStructuralFeatureValueAction_2016ToInputPin_3005ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3008ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3008ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3008ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToForkNode_2012InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ForkNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToForkNode_2012InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToForkNode_2012InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToOpaqueAction_2010OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OpaqueActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToOpaqueAction_2010OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToOpaqueAction_2010OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToOutputPin_3002InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OutputPin2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToOutputPin_3002InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToOutputPin_3002InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallOperationAction_2018ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallOperationAction_2018ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallOperationAction_2018ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToAcceptEventAction_3012OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AcceptEventAction3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToAcceptEventAction_3012OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToAcceptEventAction_3012OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToPin_2014InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PinEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToPin_2014InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToPin_2014InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCentralBufferNode_2009ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCentralBufferNode_2009ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCentralBufferNode_2009ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3005ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3005ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3005ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToJoinNode_3022InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(JoinNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToJoinNode_3022InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToJoinNode_3022InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3005ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3005ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3005ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToOutputPin_3001InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OutputPinEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToOutputPin_3001InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToOutputPin_3001InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToJoinNode_2013OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(JoinNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToJoinNode_2013OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToJoinNode_2013OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToCallOperationAction_3020Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(CallOperationAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToCallOperationAction_3020ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(CallOperationAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToCallOperationAction_3020ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToCallOperationAction_3020ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getMergeNode_2005ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isMergeNode_2005ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isMergeNode_2005ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToCentralBufferNode_2009InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CentralBufferNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToCentralBufferNode_2009InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToCentralBufferNode_2009InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToForkNode_3021OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ForkNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToForkNode_3021OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToForkNode_3021OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getForkNode_2012ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isForkNode_2012ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isForkNode_2012ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCreateObjectAction_2015ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCreateObjectAction_2015ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCreateObjectAction_2015ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToMergeNode_2005InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(MergeNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToMergeNode_2005InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToMergeNode_2005InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToMergeNode_2005InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(MergeNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToMergeNode_2005InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToMergeNode_2005InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToOpaqueAction_3011InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OpaqueAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToOpaqueAction_3011InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToOpaqueAction_3011InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDecisionNode_3015ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDecisionNode_3015ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDecisionNode_3015ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToOutputPin_3001OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OutputPinEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToOutputPin_3001OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToOutputPin_3001OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToFlowFinalNode_2011InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(FlowFinalNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToFlowFinalNode_2011InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToFlowFinalNode_2011InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCreateObjectAction_3018ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCreateObjectAction_3018ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCreateObjectAction_3018ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAcceptEventAction_2001ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAcceptEventAction_2001ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAcceptEventAction_2001ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToInputPin_3003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPinEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToInputPin_3003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToInputPin_3003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToOpaqueAction_2010InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OpaqueActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToOpaqueAction_2010InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToOpaqueAction_2010InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOpaqueAction_3011ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOpaqueAction_3011ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOpaqueAction_3011ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToPin_2014Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PinEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToPin_2014ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToPin_2014ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToOutputPin_3002OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OutputPin2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToOutputPin_3002OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToOutputPin_3002OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOpaqueAction_2010ToOutputPin_3001Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPinEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOpaqueAction_2010ToOutputPin_3001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOpaqueAction_2010ToOutputPin_3001ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToCallBehaviorAction_2017OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CallBehaviorActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToCallBehaviorAction_2017OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToCallBehaviorAction_2017OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToDataStoreNode_2008InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataStoreNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToDataStoreNode_2008InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToDataStoreNode_2008InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToActivityFinalNode_3014InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ActivityFinalNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToActivityFinalNode_3014InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToActivityFinalNode_3014InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAcceptEventAction_3012ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAcceptEventAction_3012ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAcceptEventAction_3012ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToInputPin_3003InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPinEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToInputPin_3003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToInputPin_3003InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToCentralBufferNode_2009OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CentralBufferNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToCentralBufferNode_2009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToCentralBufferNode_2009OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToAddStructuralFeatureValueAction_3023OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AddStructuralFeatureValueAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToAddStructuralFeatureValueAction_3023OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToAddStructuralFeatureValueAction_3023OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCreateObjectAction_3018ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCreateObjectAction_3018ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCreateObjectAction_3018ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivityFinalNode_2003ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivityFinalNode_2003ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivityFinalNode_2003ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToForkNode_3021OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ForkNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToForkNode_3021OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToForkNode_3021OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToCallOperationAction_2018OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CallOperationActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToCallOperationAction_2018OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToCallOperationAction_2018OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToCentralBufferNode_3025InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CentralBufferNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToCentralBufferNode_3025InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToCentralBufferNode_3025InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAddStructuralFeatureValueAction_3023ToInputPin_3003Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPinEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAddStructuralFeatureValueAction_3023ToInputPin_3003ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAddStructuralFeatureValueAction_3023ToInputPin_3003ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3008ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3008ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3008ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAddStructuralFeatureValueAction_3023ToInputPin_3005Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPin3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAddStructuralFeatureValueAction_3023ToInputPin_3005ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAddStructuralFeatureValueAction_3023ToInputPin_3005ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToOutputPin_3006InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OutputPin3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToOutputPin_3006InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToOutputPin_3006InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToAcceptEventAction_3013InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AcceptEventAction4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToAcceptEventAction_3013InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToAcceptEventAction_3013InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToOpaqueAction_3011InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OpaqueAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToOpaqueAction_3011InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToOpaqueAction_3011InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDecisionNode_2004ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDecisionNode_2004ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDecisionNode_2004ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToInputPin_3005InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPin3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToInputPin_3005InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToInputPin_3005InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToInputPin_3007InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPin4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToInputPin_3007InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToInputPin_3007InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPin_3017ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPin_3017ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPin_3017ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getJoinNode_2013ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isJoinNode_2013ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isJoinNode_2013ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getForkNode_2012ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isForkNode_2012ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isForkNode_2012ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToCentralBufferNode_3025Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(CentralBufferNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToCentralBufferNode_3025ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(CentralBufferNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToCentralBufferNode_3025ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToCentralBufferNode_3025ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToCreateObjectAction_3018Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(CreateObjectAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToCreateObjectAction_3018ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToCreateObjectAction_3018ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getOutputPin_3002ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOutputPin_3002ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOutputPin_3002ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOutputPin_3002ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOutputPin_3002ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOutputPin_3002ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToCallBehaviorAction_2017Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(CallBehaviorActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToCallBehaviorAction_2017ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToCallBehaviorAction_2017ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToCallBehaviorAction_2017InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CallBehaviorActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToCallBehaviorAction_2017InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToCallBehaviorAction_2017InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallOperationAction_2018ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallOperationAction_2018ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallOperationAction_2018ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToPin_2014OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PinEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToPin_2014OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToPin_2014OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToAddStructuralFeatureValueAction_2016Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AddStructuralFeatureValueActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToAddStructuralFeatureValueAction_2016ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToAddStructuralFeatureValueAction_2016ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPin_2014ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPin_2014ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPin_2014ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3007ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3007ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3007ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToDecisionNode_3015InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DecisionNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToDecisionNode_3015InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToDecisionNode_3015InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToInitialNode_2006Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InitialNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToInitialNode_2006ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToInitialNode_2006ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToJoinNode_3022Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(JoinNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToJoinNode_3022ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToJoinNode_3022ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToStructuredActivityNode_2007InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(StructuredActivityNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToStructuredActivityNode_2007InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToStructuredActivityNode_2007InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToFlowFinalNode_3016InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(FlowFinalNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToFlowFinalNode_3016InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToFlowFinalNode_3016InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivityFinalNode_2003ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivityFinalNode_2003ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivityFinalNode_2003ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToCallBehaviorAction_3019OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CallBehaviorAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToCallBehaviorAction_3019OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToCallBehaviorAction_3019OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCentralBufferNode_3025ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCentralBufferNode_3025ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCentralBufferNode_3025ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToCallOperationAction_2018InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CallOperationActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToCallOperationAction_2018InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToCallOperationAction_2018InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallOperationAction_3020ToOutputPin_3006Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPin3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallOperationAction_3020ToOutputPin_3006ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallOperationAction_3020ToOutputPin_3006ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getActivityFinalNode_2003ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivityFinalNode_2003ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivityFinalNode_2003ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToFlowFinalNode_2011Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(FlowFinalNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToFlowFinalNode_2011ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToFlowFinalNode_2011ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToJoinNode_2013InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(JoinNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToJoinNode_2013InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToJoinNode_2013InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3003ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3003ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3003ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToCallOperationAction_2018OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CallOperationActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToCallOperationAction_2018OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToCallOperationAction_2018OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCreateObjectAction_3018ToOutputPin_3002Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPin2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCreateObjectAction_3018ToOutputPin_3002ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCreateObjectAction_3018ToOutputPin_3002ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToCreateObjectAction_3018OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CreateObjectAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToCreateObjectAction_3018OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToCreateObjectAction_3018OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToAcceptEventAction_2002OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AcceptEventAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToAcceptEventAction_2002OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToAcceptEventAction_2002OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getMergeNode_2005ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isMergeNode_2005ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isMergeNode_2005ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToInputPin_3007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPin4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToInputPin_3007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToInputPin_3007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAddStructuralFeatureValueAction_3023ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAddStructuralFeatureValueAction_3023ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAddStructuralFeatureValueAction_3023ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToJoinNode_3022OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(JoinNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToJoinNode_3022OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToJoinNode_3022OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCreateObjectAction_2015ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCreateObjectAction_2015ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCreateObjectAction_2015ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToInputPin_3005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPin3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToInputPin_3005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToInputPin_3005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getFlowFinalNode_3016ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isFlowFinalNode_3016ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isFlowFinalNode_3016ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInitialNode_2006ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInitialNode_2006ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInitialNode_2006ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallOperationAction_3020ToInputPin_3007Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPin4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallOperationAction_3020ToInputPin_3007ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallOperationAction_3020ToInputPin_3007ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getDataStoreNode_2008ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataStoreNode_2008ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataStoreNode_2008ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToPin_3017Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pin2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToPin_3017ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pin2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToPin_3017ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToPin_3017ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToInputPin_3004InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPin2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToInputPin_3004InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToInputPin_3004InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCreateObjectAction_3018ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCreateObjectAction_3018ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCreateObjectAction_3018ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCentralBufferNode_3025ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCentralBufferNode_3025ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCentralBufferNode_3025ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOpaqueAction_3011ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOpaqueAction_3011ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOpaqueAction_3011ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToJoinNode_2013InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(JoinNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToJoinNode_2013InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToJoinNode_2013InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToAddStructuralFeatureValueAction_3023OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AddStructuralFeatureValueAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToAddStructuralFeatureValueAction_3023OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToAddStructuralFeatureValueAction_3023OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToInputPin_3008OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPin5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToInputPin_3008OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToInputPin_3008OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToAcceptEventAction_2001OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AcceptEventActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToAcceptEventAction_2001OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToAcceptEventAction_2001OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToAcceptEventAction_3012InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AcceptEventAction3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToAcceptEventAction_3012InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToAcceptEventAction_3012InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivityFinalNode_3014ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivityFinalNode_3014ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivityFinalNode_3014ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToCallBehaviorAction_3019InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CallBehaviorAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToCallBehaviorAction_3019InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToCallBehaviorAction_3019InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToCallOperationAction_3020Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(CallOperationAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToCallOperationAction_3020ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToCallOperationAction_3020ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToInitialNode_2006OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InitialNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToInitialNode_2006OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToInitialNode_2006OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToInputPin_3004OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPin2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToInputPin_3004OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToInputPin_3004OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToForkNode_2012Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ForkNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToForkNode_2012ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToForkNode_2012ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPin_3017ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPin_3017ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPin_3017ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOpaqueAction_2010ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOpaqueAction_2010ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOpaqueAction_2010ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAcceptEventAction_3013ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAcceptEventAction_3013ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAcceptEventAction_3013ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAcceptEventAction_2001ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAcceptEventAction_2001ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAcceptEventAction_2001ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallBehaviorAction_2017ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallBehaviorAction_2017ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallBehaviorAction_2017ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getForkNode_3021ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isForkNode_3021ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isForkNode_3021ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToActivityFinalNode_2003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ActivityFinalNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToActivityFinalNode_2003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToActivityFinalNode_2003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToDecisionNode_2004InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DecisionNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToDecisionNode_2004InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToDecisionNode_2004InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToFlowFinalNode_3016Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(FlowFinalNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToFlowFinalNode_3016ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(FlowFinalNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToFlowFinalNode_3016ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToFlowFinalNode_3016ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToPin_2014OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PinEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToPin_2014OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToPin_2014OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivityFinalNode_3014ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivityFinalNode_3014ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivityFinalNode_3014ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataStoreNode_3024ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataStoreNode_3024ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataStoreNode_3024ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToPin_3017OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pin2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToPin_3017OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToPin_3017OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToDecisionNode_3015Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(DecisionNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToDecisionNode_3015ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToDecisionNode_3015ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getAcceptEventAction_3012ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAcceptEventAction_3012ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAcceptEventAction_3012ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToInputPin_3008InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPin5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToInputPin_3008InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToInputPin_3008InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataStoreNode_3024ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataStoreNode_3024ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataStoreNode_3024ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToActivityFinalNode_2003InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ActivityFinalNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToActivityFinalNode_2003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToActivityFinalNode_2003InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3008ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3008ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3008ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOutputPin_3002ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOutputPin_3002ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOutputPin_3002ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataStoreNode_2008ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataStoreNode_2008ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataStoreNode_2008ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToMergeNode_2005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(MergeNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToMergeNode_2005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToMergeNode_2005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAcceptEventAction_3013ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAcceptEventAction_3013ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAcceptEventAction_3013ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivityFinalNode_3014ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivityFinalNode_3014ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivityFinalNode_3014ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallBehaviorAction_2017ToInputPin_3007Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPin4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallBehaviorAction_2017ToInputPin_3007ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallBehaviorAction_2017ToInputPin_3007ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToFlowFinalNode_3016OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(FlowFinalNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToFlowFinalNode_3016OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToFlowFinalNode_3016OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToMergeNode_2005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(MergeNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToMergeNode_2005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToMergeNode_2005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToStructuredActivityNode_3009InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToStructuredActivityNode_3009InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToStructuredActivityNode_3009InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToOutputPin_3006InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OutputPin3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToOutputPin_3006InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToOutputPin_3006InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallBehaviorAction_3019ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallBehaviorAction_3019ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallBehaviorAction_3019ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToAcceptEventAction_3012Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(AcceptEventAction3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToAcceptEventAction_3012ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToAcceptEventAction_3012ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToInputPin_3004OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPin2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToInputPin_3004OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToInputPin_3004OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToDataStoreNode_2008InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataStoreNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToDataStoreNode_2008InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToDataStoreNode_2008InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOutputPin_3006ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOutputPin_3006ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOutputPin_3006ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToPin_2014InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PinEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToPin_2014InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToPin_2014InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToActivityFinalNode_2003Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ActivityFinalNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToActivityFinalNode_2003ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToActivityFinalNode_2003ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getFlowFinalNode_2011ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isFlowFinalNode_2011ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isFlowFinalNode_2011ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToMergeNode_2005Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(MergeNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToMergeNode_2005ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToMergeNode_2005ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getAddStructuralFeatureValueAction_3023ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAddStructuralFeatureValueAction_3023ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAddStructuralFeatureValueAction_3023ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToStructuredActivityNode_3009Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToStructuredActivityNode_3009ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToStructuredActivityNode_3009ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToOutputPin_3001OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OutputPinEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToOutputPin_3001OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToOutputPin_3001OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAcceptEventAction_2001ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAcceptEventAction_2001ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAcceptEventAction_2001ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToDecisionNode_3015InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DecisionNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToDecisionNode_3015InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToDecisionNode_3015InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPin_3017ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPin_3017ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPin_3017ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToDataStoreNode_2008OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataStoreNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToDataStoreNode_2008OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToDataStoreNode_2008OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToCallBehaviorAction_3019Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(CallBehaviorAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToCallBehaviorAction_3019ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(CallBehaviorAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToCallBehaviorAction_3019ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToCallBehaviorAction_3019ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToCentralBufferNode_3025Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(CentralBufferNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToCentralBufferNode_3025ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToCentralBufferNode_3025ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToAcceptEventAction_3012Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(AcceptEventAction3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToAcceptEventAction_3012ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(AcceptEventAction3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToAcceptEventAction_3012ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToAcceptEventAction_3012ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getAddStructuralFeatureValueAction_3023ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAddStructuralFeatureValueAction_3023ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAddStructuralFeatureValueAction_3023ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInitialNode_2006ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInitialNode_2006ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInitialNode_2006ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToStructuredActivityNode_3009InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToStructuredActivityNode_3009InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToStructuredActivityNode_3009InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallOperationAction_3020ToInputPin_3008Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPin5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallOperationAction_3020ToInputPin_3008ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallOperationAction_3020ToInputPin_3008ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToCentralBufferNode_2009OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CentralBufferNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToCentralBufferNode_2009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToCentralBufferNode_2009OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getFlowFinalNode_2011ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isFlowFinalNode_2011ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isFlowFinalNode_2011ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToInputPin_3005InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPin3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToInputPin_3005InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToInputPin_3005InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToInputPin_3008OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPin5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToInputPin_3008OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToInputPin_3008OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToObjectFlow_4002Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToObjectFlow_4002ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToObjectFlow_4002ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getAcceptEventAction_3012ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAcceptEventAction_3012ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAcceptEventAction_3012ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToCallBehaviorAction_2017InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CallBehaviorActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToCallBehaviorAction_2017InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToCallBehaviorAction_2017InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDecisionNode_3015ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDecisionNode_3015ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDecisionNode_3015ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToStructuredActivityNode_2007InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(StructuredActivityNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToStructuredActivityNode_2007InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToStructuredActivityNode_2007InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToDecisionNode_2004InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DecisionNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToDecisionNode_2004InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToDecisionNode_2004InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataStoreNode_2008ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataStoreNode_2008ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataStoreNode_2008ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getFlowFinalNode_3016ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isFlowFinalNode_3016ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isFlowFinalNode_3016ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToCentralBufferNode_2009InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CentralBufferNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToCentralBufferNode_2009InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToCentralBufferNode_2009InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToAddStructuralFeatureValueAction_2016InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AddStructuralFeatureValueActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToAddStructuralFeatureValueAction_2016InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToAddStructuralFeatureValueAction_2016InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToCentralBufferNode_3025OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CentralBufferNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToCentralBufferNode_3025OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToCentralBufferNode_3025OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getJoinNode_2013ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isJoinNode_2013ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isJoinNode_2013ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToDataStoreNode_3024InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataStoreNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToDataStoreNode_3024InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToDataStoreNode_3024InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getMergeNode_2005ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isMergeNode_2005ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isMergeNode_2005ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInitialNode_2006ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInitialNode_2006ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInitialNode_2006ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAddStructuralFeatureValueAction_3023ToInputPin_3004Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPin2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAddStructuralFeatureValueAction_3023ToInputPin_3004ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAddStructuralFeatureValueAction_3023ToInputPin_3004ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToCallOperationAction_3020OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CallOperationAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToCallOperationAction_3020OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToCallOperationAction_3020OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToCreateObjectAction_3018OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CreateObjectAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToCreateObjectAction_3018OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToCreateObjectAction_3018OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToDecisionNode_3015OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DecisionNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToDecisionNode_3015OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToDecisionNode_3015OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDecisionNode_2004ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDecisionNode_2004ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDecisionNode_2004ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToForkNode_3021InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ForkNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToForkNode_3021InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToForkNode_3021InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPin_2014ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPin_2014ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPin_2014ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallOperationAction_2018ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallOperationAction_2018ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallOperationAction_2018ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOpaqueAction_3011ToOutputPin_3001Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPinEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOpaqueAction_3011ToOutputPin_3001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOpaqueAction_3011ToOutputPin_3001ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getActivityFinalNode_2003ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivityFinalNode_2003ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivityFinalNode_2003ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAcceptEventAction_2002ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAcceptEventAction_2002ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAcceptEventAction_2002ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCreateObjectAction_2015ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCreateObjectAction_2015ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCreateObjectAction_2015ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAddStructuralFeatureValueAction_2016ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAddStructuralFeatureValueAction_2016ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAddStructuralFeatureValueAction_2016ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallBehaviorAction_3019ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallBehaviorAction_3019ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallBehaviorAction_3019ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToFlowFinalNode_3016Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(FlowFinalNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToFlowFinalNode_3016ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToFlowFinalNode_3016ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPin_3017ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPin_3017ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPin_3017ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToAcceptEventAction_3013Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(AcceptEventAction4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToAcceptEventAction_3013ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(AcceptEventAction4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToAcceptEventAction_3013ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToAcceptEventAction_3013ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPin_2014ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPin_2014ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPin_2014ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAcceptEventAction_2001ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAcceptEventAction_2001ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAcceptEventAction_2001ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToJoinNode_3022InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(JoinNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToJoinNode_3022InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToJoinNode_3022InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToOutputPin_3006OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OutputPin3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToOutputPin_3006OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToOutputPin_3006OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToActivityFinalNode_3014InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ActivityFinalNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToActivityFinalNode_3014InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToActivityFinalNode_3014InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToAddStructuralFeatureValueAction_3023Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(AddStructuralFeatureValueAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToAddStructuralFeatureValueAction_3023ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(AddStructuralFeatureValueAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToAddStructuralFeatureValueAction_3023ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToAddStructuralFeatureValueAction_3023ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3003ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3003ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3003ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCentralBufferNode_3025ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCentralBufferNode_3025ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCentralBufferNode_3025ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOpaqueAction_2010ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOpaqueAction_2010ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOpaqueAction_2010ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallBehaviorAction_3019ToInputPin_3007Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPin4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallBehaviorAction_3019ToInputPin_3007ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallBehaviorAction_3019ToInputPin_3007ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3004ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3004ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3004ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToCreateObjectAction_3018InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CreateObjectAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToCreateObjectAction_3018InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToCreateObjectAction_3018InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3005ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3005ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3005ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToInputPin_3003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPinEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToInputPin_3003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToInputPin_3003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToActivityFinalNode_3014Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ActivityFinalNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToActivityFinalNode_3014ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ActivityFinalNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToActivityFinalNode_3014ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToActivityFinalNode_3014ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3004ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3004ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3004ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCentralBufferNode_2009ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCentralBufferNode_2009ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCentralBufferNode_2009ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToPin_3017InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pin2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToPin_3017InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToPin_3017InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToInputPin_3004InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPin2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToInputPin_3004InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToInputPin_3004InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getForkNode_2012ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isForkNode_2012ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isForkNode_2012ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getFlowFinalNode_3016ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isFlowFinalNode_3016ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isFlowFinalNode_3016ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallOperationAction_3020ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallOperationAction_3020ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallOperationAction_3020ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToJoinNode_2013Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(JoinNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToJoinNode_2013ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToJoinNode_2013ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getAddStructuralFeatureValueAction_2016ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAddStructuralFeatureValueAction_2016ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAddStructuralFeatureValueAction_2016ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOutputPin_3001ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOutputPin_3001ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOutputPin_3001ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getMergeNode_2005ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isMergeNode_2005ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isMergeNode_2005ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToPin_3017InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pin2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToPin_3017InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToPin_3017InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOutputPin_3006ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOutputPin_3006ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOutputPin_3006ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getJoinNode_3022ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isJoinNode_3022ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isJoinNode_3022ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCentralBufferNode_3025ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCentralBufferNode_3025ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCentralBufferNode_3025ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3005ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3005ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3005ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3007ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3007ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3007ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToOpaqueAction_3011OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OpaqueAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToOpaqueAction_3011OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToOpaqueAction_3011OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToFlowFinalNode_3016OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(FlowFinalNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToFlowFinalNode_3016OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToFlowFinalNode_3016OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAddStructuralFeatureValueAction_2016ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAddStructuralFeatureValueAction_2016ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAddStructuralFeatureValueAction_2016ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallBehaviorAction_2017ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallBehaviorAction_2017ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallBehaviorAction_2017ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCentralBufferNode_2009ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCentralBufferNode_2009ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCentralBufferNode_2009ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOpaqueAction_2010ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOpaqueAction_2010ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOpaqueAction_2010ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToActivityFinalNode_3014OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ActivityFinalNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToActivityFinalNode_3014OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToActivityFinalNode_3014OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallBehaviorAction_2017ToOutputPin_3006Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPin3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallBehaviorAction_2017ToOutputPin_3006ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallBehaviorAction_2017ToOutputPin_3006ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToOpaqueAction_2010Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OpaqueActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToOpaqueAction_2010ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToOpaqueAction_2010ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToOutputPin_3001InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OutputPinEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToOutputPin_3001InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToOutputPin_3001InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToInputPin_3007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPin4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToInputPin_3007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToInputPin_3007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToCentralBufferNode_3025OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CentralBufferNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToCentralBufferNode_3025OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToCentralBufferNode_3025OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3007ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3007ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3007ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToCreateObjectAction_2015InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CreateObjectActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToCreateObjectAction_2015InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToCreateObjectAction_2015InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallOperationAction_2018ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallOperationAction_2018ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallOperationAction_2018ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToAddStructuralFeatureValueAction_2016OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AddStructuralFeatureValueActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToAddStructuralFeatureValueAction_2016OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToAddStructuralFeatureValueAction_2016OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOutputPin_3001ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOutputPin_3001ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOutputPin_3001ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToAcceptEventAction_3012OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AcceptEventAction3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToAcceptEventAction_3012OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToAcceptEventAction_3012OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToForkNode_3021InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ForkNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToForkNode_3021InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToForkNode_3021InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallOperationAction_2018ToInputPin_3007Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPin4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallOperationAction_2018ToInputPin_3007ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallOperationAction_2018ToInputPin_3007ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToCreateObjectAction_3018Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(CreateObjectAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToCreateObjectAction_3018ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(CreateObjectAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToCreateObjectAction_3018ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToCreateObjectAction_3018ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToFlowFinalNode_2011OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(FlowFinalNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToFlowFinalNode_2011OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToFlowFinalNode_2011OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getJoinNode_3022ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isJoinNode_3022ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isJoinNode_3022ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToActivityFinalNode_3014Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ActivityFinalNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToActivityFinalNode_3014ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToActivityFinalNode_3014ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToAcceptEventAction_2001OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AcceptEventActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToAcceptEventAction_2001OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToAcceptEventAction_2001OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToStructuredActivityNode_3009OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToStructuredActivityNode_3009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToStructuredActivityNode_3009OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3003ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3003ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3003ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToAcceptEventAction_2002Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AcceptEventAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToAcceptEventAction_2002ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToAcceptEventAction_2002ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getDecisionNode_2004ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDecisionNode_2004ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDecisionNode_2004ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallOperationAction_3020ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallOperationAction_3020ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallOperationAction_3020ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDecisionNode_2004ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDecisionNode_2004ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDecisionNode_2004ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getForkNode_2012ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isForkNode_2012ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isForkNode_2012ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToAcceptEventAction_2002OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AcceptEventAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToAcceptEventAction_2002OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToAcceptEventAction_2002OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToAddStructuralFeatureValueAction_2016InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AddStructuralFeatureValueActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToAddStructuralFeatureValueAction_2016InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToAddStructuralFeatureValueAction_2016InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToCreateObjectAction_3018InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CreateObjectAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToCreateObjectAction_3018InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToCreateObjectAction_3018InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToAcceptEventAction_3013OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AcceptEventAction4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToAcceptEventAction_3013OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToAcceptEventAction_3013OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOpaqueAction_2010ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOpaqueAction_2010ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOpaqueAction_2010ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallOperationAction_3020ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallOperationAction_3020ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallOperationAction_3020ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToDataStoreNode_3024InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataStoreNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToDataStoreNode_3024InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToDataStoreNode_3024InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToForkNode_3021Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ForkNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToForkNode_3021ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ForkNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToForkNode_3021ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToForkNode_3021ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToCentralBufferNode_3025InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CentralBufferNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToCentralBufferNode_3025InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToCentralBufferNode_3025InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToAddStructuralFeatureValueAction_3023InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AddStructuralFeatureValueAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToAddStructuralFeatureValueAction_3023InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToAddStructuralFeatureValueAction_3023InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAddStructuralFeatureValueAction_3023ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAddStructuralFeatureValueAction_3023ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAddStructuralFeatureValueAction_3023ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToCallBehaviorAction_3019Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(CallBehaviorAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToCallBehaviorAction_3019ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToCallBehaviorAction_3019ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getFlowFinalNode_2011ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isFlowFinalNode_2011ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isFlowFinalNode_2011ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInitialNode_2006ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInitialNode_2006ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInitialNode_2006ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToPin_3017Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pin2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToPin_3017ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToPin_3017ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getFlowFinalNode_2011ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isFlowFinalNode_2011ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isFlowFinalNode_2011ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToCallBehaviorAction_3019OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CallBehaviorAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToCallBehaviorAction_3019OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToCallBehaviorAction_3019OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToFlowFinalNode_3016InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(FlowFinalNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToFlowFinalNode_3016InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToFlowFinalNode_3016InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToDecisionNode_3015Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(DecisionNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToDecisionNode_3015ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(DecisionNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToDecisionNode_3015ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToDecisionNode_3015ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getAcceptEventAction_2002ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAcceptEventAction_2002ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAcceptEventAction_2002ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToCallOperationAction_2018Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(CallOperationActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToCallOperationAction_2018ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToCallOperationAction_2018ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToDecisionNode_2004OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DecisionNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToDecisionNode_2004OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToDecisionNode_2004OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallOperationAction_2018ToOutputPin_3006Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPin3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallOperationAction_2018ToOutputPin_3006ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallOperationAction_2018ToOutputPin_3006ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getCallBehaviorAction_2017ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallBehaviorAction_2017ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallBehaviorAction_2017ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOutputPin_3006ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOutputPin_3006ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOutputPin_3006ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToPin_3017OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pin2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToPin_3017OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToPin_3017OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToForkNode_2012OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ForkNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToForkNode_2012OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToForkNode_2012OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToOutputPin_3002OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OutputPin2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToOutputPin_3002OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToOutputPin_3002OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToActivityFinalNode_2003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ActivityFinalNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToActivityFinalNode_2003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToActivityFinalNode_2003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToOpaqueAction_2010InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OpaqueActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToOpaqueAction_2010InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToOpaqueAction_2010InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToInitialNode_2006OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InitialNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToInitialNode_2006OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToInitialNode_2006OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDecisionNode_3015ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDecisionNode_3015ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDecisionNode_3015ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToCallBehaviorAction_3019InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CallBehaviorAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToCallBehaviorAction_3019InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToCallBehaviorAction_3019InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAddStructuralFeatureValueAction_2016ToInputPin_3004Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InputPin2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAddStructuralFeatureValueAction_2016ToInputPin_3004ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAddStructuralFeatureValueAction_2016ToInputPin_3004ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getCallBehaviorAction_2017ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallBehaviorAction_2017ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallBehaviorAction_2017ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getForkNode_3021ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isForkNode_3021ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isForkNode_3021ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToInitialNode_2006InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InitialNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToInitialNode_2006InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToInitialNode_2006InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAcceptEventAction_3012ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAcceptEventAction_3012ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAcceptEventAction_3012ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToAcceptEventAction_3013OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AcceptEventAction4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToAcceptEventAction_3013OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToAcceptEventAction_3013OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAcceptEventAction_2002ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAcceptEventAction_2002ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAcceptEventAction_2002ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToDataStoreNode_2008OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataStoreNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToDataStoreNode_2008OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToDataStoreNode_2008OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_2007ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_2007ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_2007ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToAddStructuralFeatureValueAction_2016OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AddStructuralFeatureValueActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToAddStructuralFeatureValueAction_2016OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToAddStructuralFeatureValueAction_2016OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallBehaviorAction_3019ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallBehaviorAction_3019ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallBehaviorAction_3019ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToAddStructuralFeatureValueAction_3023InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AddStructuralFeatureValueAction2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToAddStructuralFeatureValueAction_3023InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToAddStructuralFeatureValueAction_3023InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallOperationAction_3020ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallOperationAction_3020ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallOperationAction_3020ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataStoreNode_3024ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataStoreNode_3024ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataStoreNode_3024ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToInputPin_3008InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPin5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToInputPin_3008InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToInputPin_3008InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getFlowFinalNode_3016ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isFlowFinalNode_3016ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isFlowFinalNode_3016ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallBehaviorAction_3019ToOutputPin_3006Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(OutputPin3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallBehaviorAction_3019ToOutputPin_3006ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallBehaviorAction_3019ToOutputPin_3006ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToCreateObjectAction_2015OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CreateObjectActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToCreateObjectAction_2015OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToCreateObjectAction_2015OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getJoinNode_3022ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isJoinNode_3022ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isJoinNode_3022ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToAcceptEventAction_2001InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AcceptEventActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToAcceptEventAction_2001InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToAcceptEventAction_2001InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataStoreNode_2008ToControlFlow_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataStoreNode_2008ToControlFlow_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataStoreNode_2008ToControlFlow_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToStructuredActivityNode_3009OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(StructuredActivityNode2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToStructuredActivityNode_3009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToStructuredActivityNode_3009OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToInputPin_3005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPin3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToInputPin_3005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToInputPin_3005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAcceptEventAction_3013ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAcceptEventAction_3013ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAcceptEventAction_3013ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAcceptEventAction_2002ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAcceptEventAction_2002ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAcceptEventAction_2002ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToCallOperationAction_2018InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CallOperationActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToCallOperationAction_2018InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToCallOperationAction_2018InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getActivity_1000ToAcceptEventAction_2001Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AcceptEventActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isActivity_1000ToAcceptEventAction_2001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isActivity_1000ToAcceptEventAction_2001ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3008ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3008ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3008ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPin_2014ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPin_2014ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPin_2014ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStructuredActivityNode_3009ToAcceptEventAction_3013Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(AcceptEventAction4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStructuredActivityNode_3009ToAcceptEventAction_3013ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStructuredActivityNode_3009ToAcceptEventAction_3013ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3004ToControlFlow_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ControlFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3004ToControlFlow_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3004ToControlFlow_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInputPin_3003ToObjectFlow_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInputPin_3003ToObjectFlow_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInputPin_3003ToObjectFlow_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToForkNode_2012OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ForkNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToForkNode_2012OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToForkNode_2012OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToCreateObjectAction_2015OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(CreateObjectActionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToCreateObjectAction_2015OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToCreateObjectAction_2015OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToFlowFinalNode_2011InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(FlowFinalNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToFlowFinalNode_2011InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToFlowFinalNode_2011InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCallBehaviorAction_3019ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCallBehaviorAction_3019ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCallBehaviorAction_3019ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToAcceptEventAction_3013InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AcceptEventAction4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToAcceptEventAction_3013InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToAcceptEventAction_3013InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getObjectFlow_4002ToInputPin_3003InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InputPinEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isObjectFlow_4002ToInputPin_3003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isObjectFlow_4002ToInputPin_3003InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToAcceptEventAction_3012InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AcceptEventAction3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToAcceptEventAction_3012InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToAcceptEventAction_3012InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getCentralBufferNode_2009ToObjectFlow_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ObjectFlowEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isCentralBufferNode_2009ToObjectFlow_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isCentralBufferNode_2009ToObjectFlow_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getControlFlow_4001ToActivityFinalNode_2003InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ActivityFinalNodeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isControlFlow_4001ToActivityFinalNode_2003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isControlFlow_4001ToActivityFinalNode_2003InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getLinksSourceByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && !isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getLinksTargetByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeSource = nextEdge.getTarget();
			if (type.equals(nextEdgeSource.getType()) && !isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getOutgoingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getIncomingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getChildrenByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getDiagramLinksByType(Collection diagrams, String type) {
		Collection result = new ArrayList();
		for (Iterator it = diagrams.iterator(); it.hasNext();) {
			Diagram nextDiagram = (Diagram) it.next();
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection selectViewsByType(Collection views, String type) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection createNavigatorItems(Collection views, Object parent) {
		Collection result = new ArrayList();
		createNavigatorItems(views, parent, result, false);
		return result;
	}

	/**
	 * @generated
	 */
	private void createNavigatorItems(Collection views, Object parent, Collection result, boolean isLeafs) {
		for (Iterator it = views.iterator(); it.hasNext();) {
			result.add(new UMLNavigatorItem((View) it.next(), parent, isLeafs));
		}
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ActivityEditPart.MODEL_ID.equals(UMLVisualIDRegistry.getModelID(view));
	}

}
