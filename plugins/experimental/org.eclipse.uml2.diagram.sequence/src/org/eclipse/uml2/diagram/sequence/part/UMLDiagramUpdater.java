package org.eclipse.uml2.diagram.sequence.part;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.genapi.IDiagramUpdater;
import org.eclipse.uml2.diagram.common.genapi.IUpdaterLinkDescriptor;
import org.eclipse.uml2.diagram.common.genapi.IUpdaterNodeDescriptor;
import org.eclipse.uml2.diagram.sequence.edit.parts.ActionExecutionSpecificationEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.BehaviorExecutionSpecificationEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.CombinedFragmentMountingRegionEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.GateEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.InteractionEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.InteractionOperandMountingRegionEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.InteractionUseMountingRegionEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.LayeredCombinedFragmentEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.LayeredInteractionUseEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.LayeredOperandEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.LifelineEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.MessageEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.StateInvariantEditPart;
import org.eclipse.uml2.diagram.sequence.model.SDModelAccess;
import org.eclipse.uml2.diagram.sequence.model.builder.SDModelHelper;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBehaviorSpec;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracket;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel;
import org.eclipse.uml2.diagram.sequence.providers.UMLElementTypes;
import org.eclipse.uml2.uml.ActionExecutionSpecification;
import org.eclipse.uml2.uml.BehaviorExecutionSpecification;
import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.InteractionUse;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.StateInvariant;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
@SuppressWarnings("unchecked")
public class UMLDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case InteractionEditPart.VISUAL_ID:
			return getInteraction_2001SemanticChildren(view);
		case LayeredCombinedFragmentEditPart.VISUAL_ID:
			return getCombinedFragment_3008SemanticChildren(view);
		case LifelineEditPart.VISUAL_ID:
			return getLifeline_3001SemanticChildren(view);
		case BehaviorExecutionSpecificationEditPart.VISUAL_ID:
			return getBehaviorExecutionSpecification_3004SemanticChildren(view);
		case CombinedFragmentMountingRegionEditPart.VISUAL_ID:
			return getCombinedFragment_3010SemanticChildren(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInteraction_2001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Interaction modelElement = (Interaction) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getFormalGates().iterator(); it.hasNext();) {
			Gate childElement = (Gate) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GateEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getFragments().iterator(); it.hasNext();) {
			InteractionFragment childElement = (InteractionFragment) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LayeredInteractionUseEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LayeredCombinedFragmentEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getLifelines().iterator(); it.hasNext();) {
			Lifeline childElement = (Lifeline) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LifelineEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLifeline_3001SemanticChildrenGen(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Lifeline modelElement = (Lifeline) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getCoveredBys().iterator(); it.hasNext();) {
			InteractionFragment childElement = (InteractionFragment) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ActionExecutionSpecificationEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StateInvariantEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BehaviorExecutionSpecificationEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InteractionUseMountingRegionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CombinedFragmentMountingRegionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	public static List getLifeline_3001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}

		SDModel sdModel = SDModelAccess.findSDModel(view);
		if (sdModel == null) {
			return Collections.emptyList();
		}

		Lifeline umlLifeline = (Lifeline) view.getElement();
		SDLifeLine sdLifeLine = SDModelHelper.findLifeline(sdModel, umlLifeline);
		if (sdLifeLine == null) {
			return Collections.emptyList();
		}

		List<IUpdaterNodeDescriptor> result = new LinkedList<IUpdaterNodeDescriptor>();
		for (SDBracket nextBracket : sdLifeLine.getBrackets()) {
			Element child = SDModelHelper.UML_ELEMENT_EXTRACTOR.doSwitch(nextBracket);
			if (false == child instanceof InteractionFragment) {
				continue;
			}

			InteractionFragment childElement = (InteractionFragment) child;
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ActionExecutionSpecificationEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StateInvariantEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BehaviorExecutionSpecificationEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InteractionUseMountingRegionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CombinedFragmentMountingRegionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	public static List getBehaviorExecutionSpecification_3004SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}

		SDModel sdModel = SDModelAccess.findSDModel(view);
		if (sdModel == null) {
			return Collections.emptyList();
		}

		ExecutionSpecification umlSpec = (ExecutionSpecification) view.getElement();
		SDBehaviorSpec sdSpec = sdModel.getUMLTracing().findBehaviorSpec(umlSpec);
		if (sdSpec == null) {
			return Collections.emptyList();
		}

		List<IUpdaterNodeDescriptor> result = new LinkedList<IUpdaterNodeDescriptor>();
		for (SDBracket nextBracket : sdSpec.getBrackets()) {
			Element child = SDModelHelper.UML_ELEMENT_EXTRACTOR.doSwitch(nextBracket);
			if (false == child instanceof InteractionFragment) {
				continue;
			}

			InteractionFragment childElement = (InteractionFragment) child;
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ActionExecutionSpecificationEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StateInvariantEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BehaviorExecutionSpecificationEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InteractionUseMountingRegionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CombinedFragmentMountingRegionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	public static List<BehaviorExecutionSpecification> getNestedSpecs(BehaviorExecutionSpecification parentSpec) {
		Interaction interaction = parentSpec.getEnclosingInteraction();
		OccurrenceSpecification parentStart = parentSpec.getStart();
		OccurrenceSpecification parentEnd = parentSpec.getFinish();
		if (parentStart == null || parentEnd == null || parentSpec.getCovereds().size() != 1) {
			throw new IllegalStateException(//
					"Invalid BehaviorExecutionSpecification: " + parentSpec + // 
							", start: " + parentStart + //
							", finish: " + parentEnd + //
							", lifelines: " + parentSpec.getCovereds());
		}
		Lifeline lifeline = parentSpec.getCovereds().get(0);
		List<BehaviorExecutionSpecification> result = new ArrayList<BehaviorExecutionSpecification>(interaction.getFragments().size() / 3 + 1);
		BehaviorExecutionSpecification last = null;
		boolean inside = false;
		boolean inDeep = false;
		for (InteractionFragment next : interaction.getFragments()) {
			if (next == parentSpec.getStart()) {
				inside = true;
				continue;
			}
			if (next == parentSpec.getFinish()) {
				inside = false;
				break;
			}
			if (next == parentSpec) {
				continue;
			}
			if (last != null && next == last.getStart()) {
				inDeep = true;
				continue;
			}
			if (last != null && next == last.getFinish()) {
				inDeep = false;
				continue;
			}

			if (next instanceof BehaviorExecutionSpecification) {
				BehaviorExecutionSpecification nextSpec = (BehaviorExecutionSpecification) next;
				if (!nextSpec.getCovereds().contains(lifeline)) {
					continue;
				}
				if (inside && !inDeep) {
					last = nextSpec;
					result.add(nextSpec);
					inDeep = true;
				}
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCombinedFragment_3010SemanticChildrenGen(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CombinedFragment modelElement = (CombinedFragment) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOperands().iterator(); it.hasNext();) {
			InteractionOperand childElement = (InteractionOperand) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InteractionOperandMountingRegionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	private static Lifeline findContainingLifeLine(View view) {
		if (view instanceof Diagram) {
			return null;
		}
		if (!view.isSetElement()) {
			return null;
		}
		if (view.getElement() instanceof Lifeline) {
			return (Lifeline) view.getElement();
		}
		EObject container = view.eContainer();
		if (false == container instanceof View) {
			return null;
		}
		return findContainingLifeLine((View) container);
	}

	/**
	 * @generated NOT
	 */
	public static List getCombinedFragment_3010SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}

		Lifeline lifeline = findContainingLifeLine(view);
		if (lifeline == null) {
			return Collections.EMPTY_LIST;
		}
		List<UMLNodeDescriptor> result = getCombinedFragment_3010SemanticChildrenGen(view);
		for (Iterator<UMLNodeDescriptor> it = result.iterator(); it.hasNext();) {
			UMLNodeDescriptor next = it.next();
			if (next.getModelElement() instanceof InteractionFragment) {
				InteractionFragment nextFragment = (InteractionFragment) next.getModelElement();
				if (!nextFragment.getCovereds().contains(lifeline)) {
					it.remove();
				}
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCombinedFragment_3008SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CombinedFragment modelElement = (CombinedFragment) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOperands().iterator(); it.hasNext();) {
			InteractionOperand childElement = (InteractionOperand) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LayeredOperandEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getPackagedElements().iterator(); it.hasNext();) {
			PackageableElement childElement = (PackageableElement) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InteractionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000ContainedLinks(view);
		case InteractionEditPart.VISUAL_ID:
			return getInteraction_2001ContainedLinks(view);
		case GateEditPart.VISUAL_ID:
			return getGate_3005ContainedLinks(view);
		case LayeredInteractionUseEditPart.VISUAL_ID:
			return getInteractionUse_3007ContainedLinks(view);
		case LayeredCombinedFragmentEditPart.VISUAL_ID:
			return getCombinedFragment_3008ContainedLinks(view);
		case LayeredOperandEditPart.VISUAL_ID:
			return getInteractionOperand_3009ContainedLinks(view);
		case LifelineEditPart.VISUAL_ID:
			return getLifeline_3001ContainedLinks(view);
		case ActionExecutionSpecificationEditPart.VISUAL_ID:
			return getActionExecutionSpecification_3002ContainedLinks(view);
		case StateInvariantEditPart.VISUAL_ID:
			return getStateInvariant_3003ContainedLinks(view);
		case BehaviorExecutionSpecificationEditPart.VISUAL_ID:
			return getBehaviorExecutionSpecification_3004ContainedLinks(view);
		case InteractionUseMountingRegionEditPart.VISUAL_ID:
			return getInteractionUse_3006ContainedLinks(view);
		case CombinedFragmentMountingRegionEditPart.VISUAL_ID:
			return getCombinedFragment_3010ContainedLinks(view);
		case InteractionOperandMountingRegionEditPart.VISUAL_ID:
			return getInteractionOperand_3011ContainedLinks(view);
		case MessageEditPart.VISUAL_ID:
			return getMessage_4001ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case InteractionEditPart.VISUAL_ID:
			return getInteraction_2001IncomingLinks(view);
		case GateEditPart.VISUAL_ID:
			return getGate_3005IncomingLinks(view);
		case LayeredInteractionUseEditPart.VISUAL_ID:
			return getInteractionUse_3007IncomingLinks(view);
		case LayeredCombinedFragmentEditPart.VISUAL_ID:
			return getCombinedFragment_3008IncomingLinks(view);
		case LayeredOperandEditPart.VISUAL_ID:
			return getInteractionOperand_3009IncomingLinks(view);
		case LifelineEditPart.VISUAL_ID:
			return getLifeline_3001IncomingLinks(view);
		case ActionExecutionSpecificationEditPart.VISUAL_ID:
			return getActionExecutionSpecification_3002IncomingLinks(view);
		case StateInvariantEditPart.VISUAL_ID:
			return getStateInvariant_3003IncomingLinks(view);
		case BehaviorExecutionSpecificationEditPart.VISUAL_ID:
			return getBehaviorExecutionSpecification_3004IncomingLinks(view);
		case InteractionUseMountingRegionEditPart.VISUAL_ID:
			return getInteractionUse_3006IncomingLinks(view);
		case CombinedFragmentMountingRegionEditPart.VISUAL_ID:
			return getCombinedFragment_3010IncomingLinks(view);
		case InteractionOperandMountingRegionEditPart.VISUAL_ID:
			return getInteractionOperand_3011IncomingLinks(view);
		case MessageEditPart.VISUAL_ID:
			return getMessage_4001IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case InteractionEditPart.VISUAL_ID:
			return getInteraction_2001OutgoingLinks(view);
		case GateEditPart.VISUAL_ID:
			return getGate_3005OutgoingLinks(view);
		case LayeredInteractionUseEditPart.VISUAL_ID:
			return getInteractionUse_3007OutgoingLinks(view);
		case LayeredCombinedFragmentEditPart.VISUAL_ID:
			return getCombinedFragment_3008OutgoingLinks(view);
		case LayeredOperandEditPart.VISUAL_ID:
			return getInteractionOperand_3009OutgoingLinks(view);
		case LifelineEditPart.VISUAL_ID:
			return getLifeline_3001OutgoingLinks(view);
		case ActionExecutionSpecificationEditPart.VISUAL_ID:
			return getActionExecutionSpecification_3002OutgoingLinks(view);
		case StateInvariantEditPart.VISUAL_ID:
			return getStateInvariant_3003OutgoingLinks(view);
		case BehaviorExecutionSpecificationEditPart.VISUAL_ID:
			return getBehaviorExecutionSpecification_3004OutgoingLinks(view);
		case InteractionUseMountingRegionEditPart.VISUAL_ID:
			return getInteractionUse_3006OutgoingLinks(view);
		case CombinedFragmentMountingRegionEditPart.VISUAL_ID:
			return getCombinedFragment_3010OutgoingLinks(view);
		case InteractionOperandMountingRegionEditPart.VISUAL_ID:
			return getInteractionOperand_3011OutgoingLinks(view);
		case MessageEditPart.VISUAL_ID:
			return getMessage_4001OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPackage_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInteraction_2001ContainedLinks(View view) {
		Interaction modelElement = (Interaction) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Message_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLifeline_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActionExecutionSpecification_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStateInvariant_3003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBehaviorExecutionSpecification_3004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInteractionUse_3006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCombinedFragment_3010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInteractionOperand_3011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGate_3005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInteractionUse_3007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCombinedFragment_3008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInteractionOperand_3009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMessage_4001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInteraction_2001IncomingLinks(View view) {
		Interaction modelElement = (Interaction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Message_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLifeline_3001IncomingLinks(View view) {
		Lifeline modelElement = (Lifeline) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Message_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionExecutionSpecification_3002IncomingLinks(View view) {
		ActionExecutionSpecification modelElement = (ActionExecutionSpecification) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Message_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStateInvariant_3003IncomingLinks(View view) {
		StateInvariant modelElement = (StateInvariant) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Message_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBehaviorExecutionSpecification_3004IncomingLinks(View view) {
		BehaviorExecutionSpecification modelElement = (BehaviorExecutionSpecification) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Message_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInteractionUse_3006IncomingLinks(View view) {
		InteractionUse modelElement = (InteractionUse) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Message_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCombinedFragment_3010IncomingLinks(View view) {
		CombinedFragment modelElement = (CombinedFragment) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Message_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInteractionOperand_3011IncomingLinks(View view) {
		InteractionOperand modelElement = (InteractionOperand) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Message_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGate_3005IncomingLinks(View view) {
		Gate modelElement = (Gate) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Message_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInteractionUse_3007IncomingLinks(View view) {
		InteractionUse modelElement = (InteractionUse) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Message_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCombinedFragment_3008IncomingLinks(View view) {
		CombinedFragment modelElement = (CombinedFragment) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Message_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInteractionOperand_3009IncomingLinks(View view) {
		InteractionOperand modelElement = (InteractionOperand) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Message_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMessage_4001IncomingLinks(View view) {
		Message modelElement = (Message) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Message_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInteraction_2001OutgoingLinks(View view) {
		Interaction modelElement = (Interaction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLifeline_3001OutgoingLinks(View view) {
		Lifeline modelElement = (Lifeline) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActionExecutionSpecification_3002OutgoingLinks(View view) {
		ActionExecutionSpecification modelElement = (ActionExecutionSpecification) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStateInvariant_3003OutgoingLinks(View view) {
		StateInvariant modelElement = (StateInvariant) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBehaviorExecutionSpecification_3004OutgoingLinks(View view) {
		BehaviorExecutionSpecification modelElement = (BehaviorExecutionSpecification) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInteractionUse_3006OutgoingLinks(View view) {
		InteractionUse modelElement = (InteractionUse) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCombinedFragment_3010OutgoingLinks(View view) {
		CombinedFragment modelElement = (CombinedFragment) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInteractionOperand_3011OutgoingLinks(View view) {
		InteractionOperand modelElement = (InteractionOperand) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGate_3005OutgoingLinks(View view) {
		Gate modelElement = (Gate) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInteractionUse_3007OutgoingLinks(View view) {
		InteractionUse modelElement = (InteractionUse) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCombinedFragment_3008OutgoingLinks(View view) {
		CombinedFragment modelElement = (CombinedFragment) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInteractionOperand_3009OutgoingLinks(View view) {
		InteractionOperand modelElement = (InteractionOperand) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMessage_4001OutgoingLinks(View view) {
		Message modelElement = (Message) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Message_4001(modelElement));
		return result;
	}

	/**
	 * @generated NOT
	 */
	private static Collection getContainedTypeModelFacetLinks_Message_4001(Interaction container) {
		final MessageDiagramEndReplace replace = new MessageDiagramEndReplace(container);
		Collection result = new LinkedList();
		for (Message nextMessage : container.getMessages()) {
			if (MessageEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(nextMessage)) {
				continue;
			}

			MessageEnd domainSource = nextMessage.getSendEvent();
			MessageEnd domainTarget = nextMessage.getReceiveEvent();

			EObject diagramSource = replace.findDiagramMessageEnd(domainSource);
			EObject diagramTarget = replace.findDiagramMessageEnd(domainTarget);

			if (diagramSource != null && diagramTarget != null) {
				result.add(new UMLLinkDescriptor(diagramSource, diagramTarget, nextMessage, UMLElementTypes.Message_4001, MessageEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated NOT
	 */
	private static Collection getIncomingTypeModelFacetLinks_Message_4001(Element target, Map crossReferences) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * @generated NOT
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Message_4001(Element source) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * @generated
	 */
	public static final IDiagramUpdater TYPED_ADAPTER = new IDiagramUpdater() {

		/**
		 * @generated
		 */
		public List<IUpdaterNodeDescriptor> getSemanticChildren(View view) {
			return org.eclipse.uml2.diagram.sequence.part.UMLDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		public List<IUpdaterLinkDescriptor> getContainedLinks(View view) {
			return org.eclipse.uml2.diagram.sequence.part.UMLDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		public List<IUpdaterLinkDescriptor> getIncomingLinks(View view) {
			return org.eclipse.uml2.diagram.sequence.part.UMLDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		public List<IUpdaterLinkDescriptor> getOutgoingLinks(View view) {
			return org.eclipse.uml2.diagram.sequence.part.UMLDiagramUpdater.getOutgoingLinks(view);
		}
	};

	public static class MessageDiagramEndReplace {

		private HashMap<OccurrenceSpecification, BehaviorExecutionSpecification> myOccurr2start = new HashMap<OccurrenceSpecification, BehaviorExecutionSpecification>();

		private HashMap<OccurrenceSpecification, BehaviorExecutionSpecification> myOccurr2finish = new HashMap<OccurrenceSpecification, BehaviorExecutionSpecification>();

		public MessageDiagramEndReplace(Interaction container) {
			for (InteractionFragment nextFragment : container.getFragments()) {
				if (nextFragment instanceof BehaviorExecutionSpecification) {
					BehaviorExecutionSpecification execution = (BehaviorExecutionSpecification) nextFragment;
					if (execution.getStart() != null) {
						myOccurr2start.put(execution.getStart(), execution);
					}
					if (execution.getFinish() != null) {
						myOccurr2finish.put(execution.getStart(), execution);
					}
				}
			}
		}

		public EObject findDiagramMessageEnd(MessageEnd messageEnd) {
			if (messageEnd instanceof Gate) {
				return messageEnd;
			}

			EObject result = null;

			if (messageEnd instanceof MessageOccurrenceSpecification) {
				MessageOccurrenceSpecification spec = (MessageOccurrenceSpecification) messageEnd;
				BehaviorExecutionSpecification possibleStart = myOccurr2start.get(spec);
				if (possibleStart != null) {
					result = possibleStart;
				} else {
					BehaviorExecutionSpecification possibleFinish = myOccurr2finish.get(spec);
					if (possibleFinish != null) {
						result = possibleFinish;
					}
				}
			}

			return result;
		}

	}

}
