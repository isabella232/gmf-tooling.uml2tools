package org.eclipse.uml2.diagram.activity.providers;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.uml2.diagram.activity.expressions.UMLOCLFactory;
import org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityParameterNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.CentralBufferNode;
import org.eclipse.uml2.uml.ConditionalNode;
import org.eclipse.uml2.uml.CreateObjectAction;
import org.eclipse.uml2.uml.DataStoreNode;
import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.ExpansionNode;
import org.eclipse.uml2.uml.ExpansionRegion;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LoopNode;
import org.eclipse.uml2.uml.MergeNode;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.Pin;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecificationAction;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_Activity_2026(Activity instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(0, UMLPackage.eINSTANCE.getActivity(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_AcceptEventAction_3030(AcceptEventAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(2, UMLPackage.eINSTANCE.getAcceptEventAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_AcceptEventAction_3031(AcceptEventAction instance) {
		try {
			Object value_0 = trigger_AcceptEventAction_3031(instance);
			if (value_0 instanceof Collection) {
				instance.getTriggers().clear();
				instance.getTriggers().addAll(((Collection) value_0));
			} else {
				instance.getTriggers().add((Trigger) value_0);
			}
			Object value_1 = UMLOCLFactory.getExpression(4, UMLPackage.eINSTANCE.getAcceptEventAction(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DataStoreNode_3036(DataStoreNode instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(10, UMLPackage.eINSTANCE.getDataStoreNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CentralBufferNode_3037(CentralBufferNode instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(12, UMLPackage.eINSTANCE.getCentralBufferNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_OpaqueAction_3029(OpaqueAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(14, UMLPackage.eINSTANCE.getOpaqueAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3001(OutputPin instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(15, UMLPackage.eINSTANCE.getOutputPin(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3094(InputPin instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(16, UMLPackage.eINSTANCE.getInputPin(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Pin_3041(Pin instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(21, UMLPackage.eINSTANCE.getPin(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CreateObjectAction_3042(CreateObjectAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(23, UMLPackage.eINSTANCE.getCreateObjectAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3002(OutputPin instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(15, UMLPackage.eINSTANCE.getOutputPin(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_AddStructuralFeatureValueAction_3043(AddStructuralFeatureValueAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(25, UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3003(InputPin instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(16, UMLPackage.eINSTANCE.getInputPin(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3004(InputPin instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(16, UMLPackage.eINSTANCE.getInputPin(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3005(InputPin instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(16, UMLPackage.eINSTANCE.getInputPin(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CallBehaviorAction_3044(CallBehaviorAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(27, UMLPackage.eINSTANCE.getCallBehaviorAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3006(OutputPin instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(15, UMLPackage.eINSTANCE.getOutputPin(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3007(InputPin instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(16, UMLPackage.eINSTANCE.getInputPin(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CallOperationAction_3045(CallOperationAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(29, UMLPackage.eINSTANCE.getCallOperationAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3008(InputPin instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(16, UMLPackage.eINSTANCE.getInputPin(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StructuredActivityNode_3046(StructuredActivityNode instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(31, UMLPackage.eINSTANCE.getStructuredActivityNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StructuredActivityNode_3009(StructuredActivityNode instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(31, UMLPackage.eINSTANCE.getStructuredActivityNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_OpaqueAction_3011(OpaqueAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(14, UMLPackage.eINSTANCE.getOpaqueAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_AcceptEventAction_3012(AcceptEventAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(2, UMLPackage.eINSTANCE.getAcceptEventAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_AcceptEventAction_3013(AcceptEventAction instance) {
		try {
			Object value_0 = trigger_AcceptEventAction_3013(instance);
			if (value_0 instanceof Collection) {
				instance.getTriggers().clear();
				instance.getTriggers().addAll(((Collection) value_0));
			} else {
				instance.getTriggers().add((Trigger) value_0);
			}
			Object value_1 = UMLOCLFactory.getExpression(4, UMLPackage.eINSTANCE.getAcceptEventAction(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Pin_3017(Pin instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(21, UMLPackage.eINSTANCE.getPin(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CreateObjectAction_3018(CreateObjectAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(23, UMLPackage.eINSTANCE.getCreateObjectAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CallBehaviorAction_3019(CallBehaviorAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(27, UMLPackage.eINSTANCE.getCallBehaviorAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CallOperationAction_3020(CallOperationAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(29, UMLPackage.eINSTANCE.getCallOperationAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_AddStructuralFeatureValueAction_3023(AddStructuralFeatureValueAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(25, UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DataStoreNode_3024(DataStoreNode instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(10, UMLPackage.eINSTANCE.getDataStoreNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CentralBufferNode_3025(CentralBufferNode instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(12, UMLPackage.eINSTANCE.getCentralBufferNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3054(InputPin instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(32, UMLPackage.eINSTANCE.getInputPin(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3055(OutputPin instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(33, UMLPackage.eINSTANCE.getOutputPin(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ConditionalNode_3092(ConditionalNode instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(35, UMLPackage.eINSTANCE.getConditionalNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ActivityParameterNode_3052(ActivityParameterNode instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(36, UMLPackage.eINSTANCE.getActivityParameterNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_SendSignalAction_3053(SendSignalAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(38, UMLPackage.eINSTANCE.getSendSignalAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ActivityPartition_3056(ActivityPartition instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(39, UMLPackage.eINSTANCE.getActivityPartition(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ActivityPartition_3057(ActivityPartition instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(39, UMLPackage.eINSTANCE.getActivityPartition(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_AcceptEventAction_3059(AcceptEventAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(41, UMLPackage.eINSTANCE.getAcceptEventAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_AcceptEventAction_3060(AcceptEventAction instance) {
		try {
			Object value_0 = trigger_AcceptEventAction_3060(instance);
			if (value_0 instanceof Collection) {
				instance.getTriggers().clear();
				instance.getTriggers().addAll(((Collection) value_0));
			} else {
				instance.getTriggers().add((Trigger) value_0);
			}
			Object value_1 = UMLOCLFactory.getExpression(43, UMLPackage.eINSTANCE.getAcceptEventAction(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DataStoreNode_3065(DataStoreNode instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(49, UMLPackage.eINSTANCE.getDataStoreNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CentralBufferNode_3066(CentralBufferNode instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(51, UMLPackage.eINSTANCE.getCentralBufferNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_OpaqueAction_3067(OpaqueAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(53, UMLPackage.eINSTANCE.getOpaqueAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Pin_3071(Pin instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(58, UMLPackage.eINSTANCE.getPin(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CreateObjectAction_3072(CreateObjectAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(60, UMLPackage.eINSTANCE.getCreateObjectAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_AddStructuralFeatureValueAction_3073(AddStructuralFeatureValueAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(62, UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CallBehaviorAction_3074(CallBehaviorAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(64, UMLPackage.eINSTANCE.getCallBehaviorAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CallOperationAction_3075(CallOperationAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(66, UMLPackage.eINSTANCE.getCallOperationAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StructuredActivityNode_3076(StructuredActivityNode instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(68, UMLPackage.eINSTANCE.getStructuredActivityNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_StructuredActivityNode_3079(StructuredActivityNode instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(68, UMLPackage.eINSTANCE.getStructuredActivityNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InputPin_3080(InputPin instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(69, UMLPackage.eINSTANCE.getInputPin(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3081(OutputPin instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(70, UMLPackage.eINSTANCE.getOutputPin(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_SendSignalAction_3077(SendSignalAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(72, UMLPackage.eINSTANCE.getSendSignalAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_LoopNode_3078(LoopNode instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(74, UMLPackage.eINSTANCE.getLoopNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ConditionalNode_3083(ConditionalNode instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(76, UMLPackage.eINSTANCE.getConditionalNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ExpansionRegion_3085(ExpansionRegion instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(78, UMLPackage.eINSTANCE.getExpansionRegion(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ValueSpecificationAction_3088(ValueSpecificationAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(80, UMLPackage.eINSTANCE.getValueSpecificationAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_OutputPin_3090(OutputPin instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(15, UMLPackage.eINSTANCE.getOutputPin(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_LoopNode_3058(LoopNode instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(82, UMLPackage.eINSTANCE.getLoopNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ConditionalNode_3082(ConditionalNode instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(35, UMLPackage.eINSTANCE.getConditionalNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ExpansionRegion_3084(ExpansionRegion instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(84, UMLPackage.eINSTANCE.getExpansionRegion(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ExpansionNode_3091(ExpansionNode instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(85, UMLPackage.eINSTANCE.getExpansionNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ParameterSet_3086(ParameterSet instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(86, UMLPackage.eINSTANCE.getParameterSet(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ValueSpecificationAction_3089(ValueSpecificationAction instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(88, UMLPackage.eINSTANCE.getValueSpecificationAction(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_LiteralString_3049(LiteralString instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(89, UMLPackage.eINSTANCE.getLiteralString(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_LiteralString_3051(LiteralString instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(90, UMLPackage.eINSTANCE.getLiteralString(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated NOT
	 */
	private static List trigger_AcceptEventAction_3031(AcceptEventAction self) {
		return value_trigger(self);
	}

	/**
	 * @generated NOT
	 */
	private static List trigger_AcceptEventAction_3013(AcceptEventAction self) {
		return value_trigger(self);
	}

	/**
	 * @generated NOT
	 */
	private static List trigger_AcceptEventAction_3060(AcceptEventAction self) {
		return value_trigger(self);
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = UMLDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			UMLDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}

	/**
	 * @generated NOT
	 */
	private static List value_trigger(AcceptEventAction self) {
		new AcceptEventAction_2002_Initializer().init(self);
		return new BasicEList<Trigger>(self.getTriggers());
	}

}
