package org.eclipse.uml2.diagram.activity.providers;

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
import org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin;
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
	public static final IElementType Package_1000 = getElementType("org.eclipse.uml2.diagram.activity.Package_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Activity_2026 = getElementType("org.eclipse.uml2.diagram.activity.Activity_2026"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Constraint_2027 = getElementType("org.eclipse.uml2.diagram.activity.Constraint_2027"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Constraint_2028 = getElementType("org.eclipse.uml2.diagram.activity.Constraint_2028"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AcceptEventAction_3030 = getElementType("org.eclipse.uml2.diagram.activity.AcceptEventAction_3030"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AcceptEventAction_3031 = getElementType("org.eclipse.uml2.diagram.activity.AcceptEventAction_3031"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActivityFinalNode_3032 = getElementType("org.eclipse.uml2.diagram.activity.ActivityFinalNode_3032"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DecisionNode_3033 = getElementType("org.eclipse.uml2.diagram.activity.DecisionNode_3033"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MergeNode_3034 = getElementType("org.eclipse.uml2.diagram.activity.MergeNode_3034"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InitialNode_3035 = getElementType("org.eclipse.uml2.diagram.activity.InitialNode_3035"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DataStoreNode_3036 = getElementType("org.eclipse.uml2.diagram.activity.DataStoreNode_3036"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CentralBufferNode_3037 = getElementType("org.eclipse.uml2.diagram.activity.CentralBufferNode_3037"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OpaqueAction_3029 = getElementType("org.eclipse.uml2.diagram.activity.OpaqueAction_3029"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OutputPin_3001 = getElementType("org.eclipse.uml2.diagram.activity.OutputPin_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FlowFinalNode_3038 = getElementType("org.eclipse.uml2.diagram.activity.FlowFinalNode_3038"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ForkNode_3039 = getElementType("org.eclipse.uml2.diagram.activity.ForkNode_3039"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType JoinNode_3040 = getElementType("org.eclipse.uml2.diagram.activity.JoinNode_3040"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Pin_3041 = getElementType("org.eclipse.uml2.diagram.activity.Pin_3041"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CreateObjectAction_3042 = getElementType("org.eclipse.uml2.diagram.activity.CreateObjectAction_3042"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OutputPin_3002 = getElementType("org.eclipse.uml2.diagram.activity.OutputPin_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AddStructuralFeatureValueAction_3043 = getElementType("org.eclipse.uml2.diagram.activity.AddStructuralFeatureValueAction_3043"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InputPin_3003 = getElementType("org.eclipse.uml2.diagram.activity.InputPin_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InputPin_3004 = getElementType("org.eclipse.uml2.diagram.activity.InputPin_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InputPin_3005 = getElementType("org.eclipse.uml2.diagram.activity.InputPin_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CallBehaviorAction_3044 = getElementType("org.eclipse.uml2.diagram.activity.CallBehaviorAction_3044"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OutputPin_3006 = getElementType("org.eclipse.uml2.diagram.activity.OutputPin_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InputPin_3007 = getElementType("org.eclipse.uml2.diagram.activity.InputPin_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CallOperationAction_3045 = getElementType("org.eclipse.uml2.diagram.activity.CallOperationAction_3045"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InputPin_3008 = getElementType("org.eclipse.uml2.diagram.activity.InputPin_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StructuredActivityNode_3046 = getElementType("org.eclipse.uml2.diagram.activity.StructuredActivityNode_3046"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StructuredActivityNode_3009 = getElementType("org.eclipse.uml2.diagram.activity.StructuredActivityNode_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OpaqueAction_3011 = getElementType("org.eclipse.uml2.diagram.activity.OpaqueAction_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AcceptEventAction_3012 = getElementType("org.eclipse.uml2.diagram.activity.AcceptEventAction_3012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AcceptEventAction_3013 = getElementType("org.eclipse.uml2.diagram.activity.AcceptEventAction_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActivityFinalNode_3014 = getElementType("org.eclipse.uml2.diagram.activity.ActivityFinalNode_3014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DecisionNode_3015 = getElementType("org.eclipse.uml2.diagram.activity.DecisionNode_3015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FlowFinalNode_3016 = getElementType("org.eclipse.uml2.diagram.activity.FlowFinalNode_3016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Pin_3017 = getElementType("org.eclipse.uml2.diagram.activity.Pin_3017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CreateObjectAction_3018 = getElementType("org.eclipse.uml2.diagram.activity.CreateObjectAction_3018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CallBehaviorAction_3019 = getElementType("org.eclipse.uml2.diagram.activity.CallBehaviorAction_3019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CallOperationAction_3020 = getElementType("org.eclipse.uml2.diagram.activity.CallOperationAction_3020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ForkNode_3021 = getElementType("org.eclipse.uml2.diagram.activity.ForkNode_3021"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType JoinNode_3022 = getElementType("org.eclipse.uml2.diagram.activity.JoinNode_3022"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AddStructuralFeatureValueAction_3023 = getElementType("org.eclipse.uml2.diagram.activity.AddStructuralFeatureValueAction_3023"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DataStoreNode_3024 = getElementType("org.eclipse.uml2.diagram.activity.DataStoreNode_3024"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CentralBufferNode_3025 = getElementType("org.eclipse.uml2.diagram.activity.CentralBufferNode_3025"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InputPin_3054 = getElementType("org.eclipse.uml2.diagram.activity.InputPin_3054"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OutputPin_3055 = getElementType("org.eclipse.uml2.diagram.activity.OutputPin_3055"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OpaqueBehavior_3047 = getElementType("org.eclipse.uml2.diagram.activity.OpaqueBehavior_3047"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActivityParameterNode_3052 = getElementType("org.eclipse.uml2.diagram.activity.ActivityParameterNode_3052"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendSignalAction_3053 = getElementType("org.eclipse.uml2.diagram.activity.SendSignalAction_3053"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActivityPartition_3056 = getElementType("org.eclipse.uml2.diagram.activity.ActivityPartition_3056"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActivityPartition_3057 = getElementType("org.eclipse.uml2.diagram.activity.ActivityPartition_3057"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AcceptEventAction_3059 = getElementType("org.eclipse.uml2.diagram.activity.AcceptEventAction_3059"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AcceptEventAction_3060 = getElementType("org.eclipse.uml2.diagram.activity.AcceptEventAction_3060"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActivityFinalNode_3061 = getElementType("org.eclipse.uml2.diagram.activity.ActivityFinalNode_3061"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DecisionNode_3062 = getElementType("org.eclipse.uml2.diagram.activity.DecisionNode_3062"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MergeNode_3063 = getElementType("org.eclipse.uml2.diagram.activity.MergeNode_3063"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InitialNode_3064 = getElementType("org.eclipse.uml2.diagram.activity.InitialNode_3064"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DataStoreNode_3065 = getElementType("org.eclipse.uml2.diagram.activity.DataStoreNode_3065"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CentralBufferNode_3066 = getElementType("org.eclipse.uml2.diagram.activity.CentralBufferNode_3066"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OpaqueAction_3067 = getElementType("org.eclipse.uml2.diagram.activity.OpaqueAction_3067"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FlowFinalNode_3068 = getElementType("org.eclipse.uml2.diagram.activity.FlowFinalNode_3068"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ForkNode_3069 = getElementType("org.eclipse.uml2.diagram.activity.ForkNode_3069"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType JoinNode_3070 = getElementType("org.eclipse.uml2.diagram.activity.JoinNode_3070"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Pin_3071 = getElementType("org.eclipse.uml2.diagram.activity.Pin_3071"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CreateObjectAction_3072 = getElementType("org.eclipse.uml2.diagram.activity.CreateObjectAction_3072"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AddStructuralFeatureValueAction_3073 = getElementType("org.eclipse.uml2.diagram.activity.AddStructuralFeatureValueAction_3073"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CallBehaviorAction_3074 = getElementType("org.eclipse.uml2.diagram.activity.CallBehaviorAction_3074"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CallOperationAction_3075 = getElementType("org.eclipse.uml2.diagram.activity.CallOperationAction_3075"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StructuredActivityNode_3076 = getElementType("org.eclipse.uml2.diagram.activity.StructuredActivityNode_3076"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StructuredActivityNode_3079 = getElementType("org.eclipse.uml2.diagram.activity.StructuredActivityNode_3079"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InputPin_3080 = getElementType("org.eclipse.uml2.diagram.activity.InputPin_3080"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OutputPin_3081 = getElementType("org.eclipse.uml2.diagram.activity.OutputPin_3081"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendSignalAction_3077 = getElementType("org.eclipse.uml2.diagram.activity.SendSignalAction_3077"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LoopNode_3078 = getElementType("org.eclipse.uml2.diagram.activity.LoopNode_3078"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConditionalNode_3083 = getElementType("org.eclipse.uml2.diagram.activity.ConditionalNode_3083"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LoopNode_3058 = getElementType("org.eclipse.uml2.diagram.activity.LoopNode_3058"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConditionalNode_3082 = getElementType("org.eclipse.uml2.diagram.activity.ConditionalNode_3082"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LiteralString_3049 = getElementType("org.eclipse.uml2.diagram.activity.LiteralString_3049"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LiteralString_3051 = getElementType("org.eclipse.uml2.diagram.activity.LiteralString_3051"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ControlFlow_4001 = getElementType("org.eclipse.uml2.diagram.activity.ControlFlow_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ObjectFlow_4002 = getElementType("org.eclipse.uml2.diagram.activity.ObjectFlow_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActionLocalPrecondition_4003 = getElementType("org.eclipse.uml2.diagram.activity.ActionLocalPrecondition_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActionLocalPostcondition_4006 = getElementType("org.eclipse.uml2.diagram.activity.ActionLocalPostcondition_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ObjectNodeSelection_4004 = getElementType("org.eclipse.uml2.diagram.activity.ObjectNodeSelection_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExceptionHandler_4005 = getElementType("org.eclipse.uml2.diagram.activity.ExceptionHandler_4005"); //$NON-NLS-1$

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

			elements.put(Activity_2026, UMLPackage.eINSTANCE.getActivity());

			elements.put(Constraint_2027, UMLPackage.eINSTANCE.getConstraint());

			elements.put(Constraint_2028, UMLPackage.eINSTANCE.getConstraint());

			elements.put(AcceptEventAction_3030, UMLPackage.eINSTANCE.getAcceptEventAction());

			elements.put(AcceptEventAction_3031, UMLPackage.eINSTANCE.getAcceptEventAction());

			elements.put(ActivityFinalNode_3032, UMLPackage.eINSTANCE.getActivityFinalNode());

			elements.put(DecisionNode_3033, UMLPackage.eINSTANCE.getDecisionNode());

			elements.put(MergeNode_3034, UMLPackage.eINSTANCE.getMergeNode());

			elements.put(InitialNode_3035, UMLPackage.eINSTANCE.getInitialNode());

			elements.put(DataStoreNode_3036, UMLPackage.eINSTANCE.getDataStoreNode());

			elements.put(CentralBufferNode_3037, UMLPackage.eINSTANCE.getCentralBufferNode());

			elements.put(OpaqueAction_3029, UMLPackage.eINSTANCE.getOpaqueAction());

			elements.put(OutputPin_3001, UMLPackage.eINSTANCE.getOutputPin());

			elements.put(FlowFinalNode_3038, UMLPackage.eINSTANCE.getFlowFinalNode());

			elements.put(ForkNode_3039, UMLPackage.eINSTANCE.getForkNode());

			elements.put(JoinNode_3040, UMLPackage.eINSTANCE.getJoinNode());

			elements.put(Pin_3041, UMLPackage.eINSTANCE.getPin());

			elements.put(CreateObjectAction_3042, UMLPackage.eINSTANCE.getCreateObjectAction());

			elements.put(OutputPin_3002, UMLPackage.eINSTANCE.getOutputPin());

			elements.put(AddStructuralFeatureValueAction_3043, UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction());

			elements.put(InputPin_3003, UMLPackage.eINSTANCE.getInputPin());

			elements.put(InputPin_3004, UMLPackage.eINSTANCE.getInputPin());

			elements.put(InputPin_3005, UMLPackage.eINSTANCE.getInputPin());

			elements.put(CallBehaviorAction_3044, UMLPackage.eINSTANCE.getCallBehaviorAction());

			elements.put(OutputPin_3006, UMLPackage.eINSTANCE.getOutputPin());

			elements.put(InputPin_3007, UMLPackage.eINSTANCE.getInputPin());

			elements.put(CallOperationAction_3045, UMLPackage.eINSTANCE.getCallOperationAction());

			elements.put(InputPin_3008, UMLPackage.eINSTANCE.getInputPin());

			elements.put(StructuredActivityNode_3046, UMLPackage.eINSTANCE.getStructuredActivityNode());

			elements.put(StructuredActivityNode_3009, UMLPackage.eINSTANCE.getStructuredActivityNode());

			elements.put(OpaqueAction_3011, UMLPackage.eINSTANCE.getOpaqueAction());

			elements.put(AcceptEventAction_3012, UMLPackage.eINSTANCE.getAcceptEventAction());

			elements.put(AcceptEventAction_3013, UMLPackage.eINSTANCE.getAcceptEventAction());

			elements.put(ActivityFinalNode_3014, UMLPackage.eINSTANCE.getActivityFinalNode());

			elements.put(DecisionNode_3015, UMLPackage.eINSTANCE.getDecisionNode());

			elements.put(FlowFinalNode_3016, UMLPackage.eINSTANCE.getFlowFinalNode());

			elements.put(Pin_3017, UMLPackage.eINSTANCE.getPin());

			elements.put(CreateObjectAction_3018, UMLPackage.eINSTANCE.getCreateObjectAction());

			elements.put(CallBehaviorAction_3019, UMLPackage.eINSTANCE.getCallBehaviorAction());

			elements.put(CallOperationAction_3020, UMLPackage.eINSTANCE.getCallOperationAction());

			elements.put(ForkNode_3021, UMLPackage.eINSTANCE.getForkNode());

			elements.put(JoinNode_3022, UMLPackage.eINSTANCE.getJoinNode());

			elements.put(AddStructuralFeatureValueAction_3023, UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction());

			elements.put(DataStoreNode_3024, UMLPackage.eINSTANCE.getDataStoreNode());

			elements.put(CentralBufferNode_3025, UMLPackage.eINSTANCE.getCentralBufferNode());

			elements.put(InputPin_3054, UMLPackage.eINSTANCE.getInputPin());

			elements.put(OutputPin_3055, UMLPackage.eINSTANCE.getOutputPin());

			elements.put(OpaqueBehavior_3047, UMLPackage.eINSTANCE.getOpaqueBehavior());

			elements.put(ActivityParameterNode_3052, UMLPackage.eINSTANCE.getActivityParameterNode());

			elements.put(SendSignalAction_3053, UMLPackage.eINSTANCE.getSendSignalAction());

			elements.put(ActivityPartition_3056, UMLPackage.eINSTANCE.getActivityPartition());

			elements.put(ActivityPartition_3057, UMLPackage.eINSTANCE.getActivityPartition());

			elements.put(AcceptEventAction_3059, UMLPackage.eINSTANCE.getAcceptEventAction());

			elements.put(AcceptEventAction_3060, UMLPackage.eINSTANCE.getAcceptEventAction());

			elements.put(ActivityFinalNode_3061, UMLPackage.eINSTANCE.getActivityFinalNode());

			elements.put(DecisionNode_3062, UMLPackage.eINSTANCE.getDecisionNode());

			elements.put(MergeNode_3063, UMLPackage.eINSTANCE.getMergeNode());

			elements.put(InitialNode_3064, UMLPackage.eINSTANCE.getInitialNode());

			elements.put(DataStoreNode_3065, UMLPackage.eINSTANCE.getDataStoreNode());

			elements.put(CentralBufferNode_3066, UMLPackage.eINSTANCE.getCentralBufferNode());

			elements.put(OpaqueAction_3067, UMLPackage.eINSTANCE.getOpaqueAction());

			elements.put(FlowFinalNode_3068, UMLPackage.eINSTANCE.getFlowFinalNode());

			elements.put(ForkNode_3069, UMLPackage.eINSTANCE.getForkNode());

			elements.put(JoinNode_3070, UMLPackage.eINSTANCE.getJoinNode());

			elements.put(Pin_3071, UMLPackage.eINSTANCE.getPin());

			elements.put(CreateObjectAction_3072, UMLPackage.eINSTANCE.getCreateObjectAction());

			elements.put(AddStructuralFeatureValueAction_3073, UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction());

			elements.put(CallBehaviorAction_3074, UMLPackage.eINSTANCE.getCallBehaviorAction());

			elements.put(CallOperationAction_3075, UMLPackage.eINSTANCE.getCallOperationAction());

			elements.put(StructuredActivityNode_3076, UMLPackage.eINSTANCE.getStructuredActivityNode());

			elements.put(StructuredActivityNode_3079, UMLPackage.eINSTANCE.getStructuredActivityNode());

			elements.put(InputPin_3080, UMLPackage.eINSTANCE.getInputPin());

			elements.put(OutputPin_3081, UMLPackage.eINSTANCE.getOutputPin());

			elements.put(SendSignalAction_3077, UMLPackage.eINSTANCE.getSendSignalAction());

			elements.put(LoopNode_3078, UMLPackage.eINSTANCE.getLoopNode());

			elements.put(ConditionalNode_3083, UMLPackage.eINSTANCE.getConditionalNode());

			elements.put(LoopNode_3058, UMLPackage.eINSTANCE.getLoopNode());

			elements.put(ConditionalNode_3082, UMLPackage.eINSTANCE.getConditionalNode());

			elements.put(LiteralString_3049, UMLPackage.eINSTANCE.getLiteralString());

			elements.put(LiteralString_3051, UMLPackage.eINSTANCE.getLiteralString());

			elements.put(ControlFlow_4001, UMLPackage.eINSTANCE.getControlFlow());

			elements.put(ObjectFlow_4002, UMLPackage.eINSTANCE.getObjectFlow());

			elements.put(ActionLocalPrecondition_4003, UMLPackage.eINSTANCE.getAction_LocalPrecondition());

			elements.put(ActionLocalPostcondition_4006, UMLPackage.eINSTANCE.getAction_LocalPostcondition());

			elements.put(ObjectNodeSelection_4004, UMLPackage.eINSTANCE.getObjectNode_Selection());

			elements.put(ExceptionHandler_4005, UMLPackage.eINSTANCE.getExceptionHandler());
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
			KNOWN_ELEMENT_TYPES.add(Activity_2026);
			KNOWN_ELEMENT_TYPES.add(Constraint_2027);
			KNOWN_ELEMENT_TYPES.add(Constraint_2028);
			KNOWN_ELEMENT_TYPES.add(AcceptEventAction_3030);
			KNOWN_ELEMENT_TYPES.add(AcceptEventAction_3031);
			KNOWN_ELEMENT_TYPES.add(ActivityFinalNode_3032);
			KNOWN_ELEMENT_TYPES.add(DecisionNode_3033);
			KNOWN_ELEMENT_TYPES.add(MergeNode_3034);
			KNOWN_ELEMENT_TYPES.add(InitialNode_3035);
			KNOWN_ELEMENT_TYPES.add(DataStoreNode_3036);
			KNOWN_ELEMENT_TYPES.add(CentralBufferNode_3037);
			KNOWN_ELEMENT_TYPES.add(OpaqueAction_3029);
			KNOWN_ELEMENT_TYPES.add(OutputPin_3001);
			KNOWN_ELEMENT_TYPES.add(FlowFinalNode_3038);
			KNOWN_ELEMENT_TYPES.add(ForkNode_3039);
			KNOWN_ELEMENT_TYPES.add(JoinNode_3040);
			KNOWN_ELEMENT_TYPES.add(Pin_3041);
			KNOWN_ELEMENT_TYPES.add(CreateObjectAction_3042);
			KNOWN_ELEMENT_TYPES.add(OutputPin_3002);
			KNOWN_ELEMENT_TYPES.add(AddStructuralFeatureValueAction_3043);
			KNOWN_ELEMENT_TYPES.add(InputPin_3003);
			KNOWN_ELEMENT_TYPES.add(InputPin_3004);
			KNOWN_ELEMENT_TYPES.add(InputPin_3005);
			KNOWN_ELEMENT_TYPES.add(CallBehaviorAction_3044);
			KNOWN_ELEMENT_TYPES.add(OutputPin_3006);
			KNOWN_ELEMENT_TYPES.add(InputPin_3007);
			KNOWN_ELEMENT_TYPES.add(CallOperationAction_3045);
			KNOWN_ELEMENT_TYPES.add(InputPin_3008);
			KNOWN_ELEMENT_TYPES.add(StructuredActivityNode_3046);
			KNOWN_ELEMENT_TYPES.add(StructuredActivityNode_3009);
			KNOWN_ELEMENT_TYPES.add(OpaqueAction_3011);
			KNOWN_ELEMENT_TYPES.add(AcceptEventAction_3012);
			KNOWN_ELEMENT_TYPES.add(AcceptEventAction_3013);
			KNOWN_ELEMENT_TYPES.add(ActivityFinalNode_3014);
			KNOWN_ELEMENT_TYPES.add(DecisionNode_3015);
			KNOWN_ELEMENT_TYPES.add(FlowFinalNode_3016);
			KNOWN_ELEMENT_TYPES.add(Pin_3017);
			KNOWN_ELEMENT_TYPES.add(CreateObjectAction_3018);
			KNOWN_ELEMENT_TYPES.add(CallBehaviorAction_3019);
			KNOWN_ELEMENT_TYPES.add(CallOperationAction_3020);
			KNOWN_ELEMENT_TYPES.add(ForkNode_3021);
			KNOWN_ELEMENT_TYPES.add(JoinNode_3022);
			KNOWN_ELEMENT_TYPES.add(AddStructuralFeatureValueAction_3023);
			KNOWN_ELEMENT_TYPES.add(DataStoreNode_3024);
			KNOWN_ELEMENT_TYPES.add(CentralBufferNode_3025);
			KNOWN_ELEMENT_TYPES.add(InputPin_3054);
			KNOWN_ELEMENT_TYPES.add(OutputPin_3055);
			KNOWN_ELEMENT_TYPES.add(OpaqueBehavior_3047);
			KNOWN_ELEMENT_TYPES.add(ActivityParameterNode_3052);
			KNOWN_ELEMENT_TYPES.add(SendSignalAction_3053);
			KNOWN_ELEMENT_TYPES.add(ActivityPartition_3056);
			KNOWN_ELEMENT_TYPES.add(ActivityPartition_3057);
			KNOWN_ELEMENT_TYPES.add(AcceptEventAction_3059);
			KNOWN_ELEMENT_TYPES.add(AcceptEventAction_3060);
			KNOWN_ELEMENT_TYPES.add(ActivityFinalNode_3061);
			KNOWN_ELEMENT_TYPES.add(DecisionNode_3062);
			KNOWN_ELEMENT_TYPES.add(MergeNode_3063);
			KNOWN_ELEMENT_TYPES.add(InitialNode_3064);
			KNOWN_ELEMENT_TYPES.add(DataStoreNode_3065);
			KNOWN_ELEMENT_TYPES.add(CentralBufferNode_3066);
			KNOWN_ELEMENT_TYPES.add(OpaqueAction_3067);
			KNOWN_ELEMENT_TYPES.add(FlowFinalNode_3068);
			KNOWN_ELEMENT_TYPES.add(ForkNode_3069);
			KNOWN_ELEMENT_TYPES.add(JoinNode_3070);
			KNOWN_ELEMENT_TYPES.add(Pin_3071);
			KNOWN_ELEMENT_TYPES.add(CreateObjectAction_3072);
			KNOWN_ELEMENT_TYPES.add(AddStructuralFeatureValueAction_3073);
			KNOWN_ELEMENT_TYPES.add(CallBehaviorAction_3074);
			KNOWN_ELEMENT_TYPES.add(CallOperationAction_3075);
			KNOWN_ELEMENT_TYPES.add(StructuredActivityNode_3076);
			KNOWN_ELEMENT_TYPES.add(StructuredActivityNode_3079);
			KNOWN_ELEMENT_TYPES.add(InputPin_3080);
			KNOWN_ELEMENT_TYPES.add(OutputPin_3081);
			KNOWN_ELEMENT_TYPES.add(SendSignalAction_3077);
			KNOWN_ELEMENT_TYPES.add(LoopNode_3078);
			KNOWN_ELEMENT_TYPES.add(ConditionalNode_3083);
			KNOWN_ELEMENT_TYPES.add(LoopNode_3058);
			KNOWN_ELEMENT_TYPES.add(ConditionalNode_3082);
			KNOWN_ELEMENT_TYPES.add(LiteralString_3049);
			KNOWN_ELEMENT_TYPES.add(LiteralString_3051);
			KNOWN_ELEMENT_TYPES.add(ControlFlow_4001);
			KNOWN_ELEMENT_TYPES.add(ObjectFlow_4002);
			KNOWN_ELEMENT_TYPES.add(ActionLocalPrecondition_4003);
			KNOWN_ELEMENT_TYPES.add(ActionLocalPostcondition_4006);
			KNOWN_ELEMENT_TYPES.add(ObjectNodeSelection_4004);
			KNOWN_ELEMENT_TYPES.add(ExceptionHandler_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
