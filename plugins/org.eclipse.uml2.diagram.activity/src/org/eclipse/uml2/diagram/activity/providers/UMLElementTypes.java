package org.eclipse.uml2.diagram.activity.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.diagram.activity.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLElementTypes {

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
			element = ((EStructuralFeature) element).getEContainingClass();
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
			elements.put(Activity_1000, UMLPackage.eINSTANCE.getActivity());
			elements.put(OutputPin_3001, UMLPackage.eINSTANCE.getOutputPin());
			elements.put(OutputPin_3002, UMLPackage.eINSTANCE.getOutputPin());
			elements.put(InputPin_3003, UMLPackage.eINSTANCE.getInputPin());
			elements.put(InputPin_3004, UMLPackage.eINSTANCE.getInputPin());
			elements.put(InputPin_3005, UMLPackage.eINSTANCE.getInputPin());
			elements.put(OutputPin_3006, UMLPackage.eINSTANCE.getOutputPin());
			elements.put(InputPin_3007, UMLPackage.eINSTANCE.getInputPin());
			elements.put(InputPin_3008, UMLPackage.eINSTANCE.getInputPin());
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
			elements.put(AcceptEventAction_2001, UMLPackage.eINSTANCE.getAcceptEventAction());
			elements.put(AcceptEventAction_2002, UMLPackage.eINSTANCE.getAcceptEventAction());
			elements.put(ActivityFinalNode_2003, UMLPackage.eINSTANCE.getActivityFinalNode());
			elements.put(DecisionNode_2004, UMLPackage.eINSTANCE.getDecisionNode());
			elements.put(MergeNode_2005, UMLPackage.eINSTANCE.getMergeNode());
			elements.put(InitialNode_2006, UMLPackage.eINSTANCE.getInitialNode());
			elements.put(DataStoreNode_2008, UMLPackage.eINSTANCE.getDataStoreNode());
			elements.put(CentralBufferNode_2009, UMLPackage.eINSTANCE.getCentralBufferNode());
			elements.put(OpaqueAction_2010, UMLPackage.eINSTANCE.getOpaqueAction());
			elements.put(FlowFinalNode_2011, UMLPackage.eINSTANCE.getFlowFinalNode());
			elements.put(ForkNode_2012, UMLPackage.eINSTANCE.getForkNode());
			elements.put(JoinNode_2013, UMLPackage.eINSTANCE.getJoinNode());
			elements.put(Pin_2014, UMLPackage.eINSTANCE.getPin());
			elements.put(CreateObjectAction_2015, UMLPackage.eINSTANCE.getCreateObjectAction());
			elements.put(AddStructuralFeatureValueAction_2016, UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction());
			elements.put(CallBehaviorAction_2017, UMLPackage.eINSTANCE.getCallBehaviorAction());
			elements.put(CallOperationAction_2018, UMLPackage.eINSTANCE.getCallOperationAction());
			elements.put(StructuredActivityNode_2007, UMLPackage.eINSTANCE.getStructuredActivityNode());
			elements.put(ControlFlow_4001, UMLPackage.eINSTANCE.getControlFlow());
			elements.put(ObjectFlow_4002, UMLPackage.eINSTANCE.getObjectFlow());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	public static final IElementType Activity_1000 = getElementType("org.eclipse.uml2.diagram.activity.Activity_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OutputPin_3001 = getElementType("org.eclipse.uml2.diagram.activity.OutputPin_3001"); //$NON-NLS-1$

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
	public static final IElementType OutputPin_3002 = getElementType("org.eclipse.uml2.diagram.activity.OutputPin_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CallBehaviorAction_3019 = getElementType("org.eclipse.uml2.diagram.activity.CallBehaviorAction_3019"); //$NON-NLS-1$

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
	public static final IElementType DataStoreNode_3024 = getElementType("org.eclipse.uml2.diagram.activity.DataStoreNode_3024"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CentralBufferNode_3025 = getElementType("org.eclipse.uml2.diagram.activity.CentralBufferNode_3025"); //$NON-NLS-1$

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
	public static final IElementType CallOperationAction_3020 = getElementType("org.eclipse.uml2.diagram.activity.CallOperationAction_3020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InputPin_3008 = getElementType("org.eclipse.uml2.diagram.activity.InputPin_3008"); //$NON-NLS-1$

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
	public static final IElementType AcceptEventAction_2001 = getElementType("org.eclipse.uml2.diagram.activity.AcceptEventAction_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AcceptEventAction_2002 = getElementType("org.eclipse.uml2.diagram.activity.AcceptEventAction_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ActivityFinalNode_2003 = getElementType("org.eclipse.uml2.diagram.activity.ActivityFinalNode_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DecisionNode_2004 = getElementType("org.eclipse.uml2.diagram.activity.DecisionNode_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MergeNode_2005 = getElementType("org.eclipse.uml2.diagram.activity.MergeNode_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InitialNode_2006 = getElementType("org.eclipse.uml2.diagram.activity.InitialNode_2006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StructuredActivityNode_2007 = getElementType("org.eclipse.uml2.diagram.activity.StructuredActivityNode_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DataStoreNode_2008 = getElementType("org.eclipse.uml2.diagram.activity.DataStoreNode_2008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CentralBufferNode_2009 = getElementType("org.eclipse.uml2.diagram.activity.CentralBufferNode_2009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OpaqueAction_2010 = getElementType("org.eclipse.uml2.diagram.activity.OpaqueAction_2010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FlowFinalNode_2011 = getElementType("org.eclipse.uml2.diagram.activity.FlowFinalNode_2011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ForkNode_2012 = getElementType("org.eclipse.uml2.diagram.activity.ForkNode_2012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType JoinNode_2013 = getElementType("org.eclipse.uml2.diagram.activity.JoinNode_2013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Pin_2014 = getElementType("org.eclipse.uml2.diagram.activity.Pin_2014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CreateObjectAction_2015 = getElementType("org.eclipse.uml2.diagram.activity.CreateObjectAction_2015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AddStructuralFeatureValueAction_2016 = getElementType("org.eclipse.uml2.diagram.activity.AddStructuralFeatureValueAction_2016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CallBehaviorAction_2017 = getElementType("org.eclipse.uml2.diagram.activity.CallBehaviorAction_2017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CallOperationAction_2018 = getElementType("org.eclipse.uml2.diagram.activity.CallOperationAction_2018"); //$NON-NLS-1$

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
	public static final IElementType StructuredActivityNode_3009 = getElementType("org.eclipse.uml2.diagram.activity.StructuredActivityNode_3009");

	/**
	 * @generated
	 */
	public static final IElementType OpaqueAction_3011 = getElementType("org.eclipse.uml2.diagram.activity.OpaqueAction_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Activity_1000);
			KNOWN_ELEMENT_TYPES.add(OutputPin_3001);
			KNOWN_ELEMENT_TYPES.add(OutputPin_3002);
			KNOWN_ELEMENT_TYPES.add(InputPin_3003);
			KNOWN_ELEMENT_TYPES.add(InputPin_3004);
			KNOWN_ELEMENT_TYPES.add(InputPin_3005);
			KNOWN_ELEMENT_TYPES.add(OutputPin_3006);
			KNOWN_ELEMENT_TYPES.add(InputPin_3007);
			KNOWN_ELEMENT_TYPES.add(InputPin_3008);
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
			KNOWN_ELEMENT_TYPES.add(AcceptEventAction_2001);
			KNOWN_ELEMENT_TYPES.add(AcceptEventAction_2002);
			KNOWN_ELEMENT_TYPES.add(ActivityFinalNode_2003);
			KNOWN_ELEMENT_TYPES.add(DecisionNode_2004);
			KNOWN_ELEMENT_TYPES.add(MergeNode_2005);
			KNOWN_ELEMENT_TYPES.add(InitialNode_2006);
			KNOWN_ELEMENT_TYPES.add(DataStoreNode_2008);
			KNOWN_ELEMENT_TYPES.add(CentralBufferNode_2009);
			KNOWN_ELEMENT_TYPES.add(OpaqueAction_2010);
			KNOWN_ELEMENT_TYPES.add(FlowFinalNode_2011);
			KNOWN_ELEMENT_TYPES.add(ForkNode_2012);
			KNOWN_ELEMENT_TYPES.add(JoinNode_2013);
			KNOWN_ELEMENT_TYPES.add(Pin_2014);
			KNOWN_ELEMENT_TYPES.add(CreateObjectAction_2015);
			KNOWN_ELEMENT_TYPES.add(AddStructuralFeatureValueAction_2016);
			KNOWN_ELEMENT_TYPES.add(CallBehaviorAction_2017);
			KNOWN_ELEMENT_TYPES.add(CallOperationAction_2018);
			KNOWN_ELEMENT_TYPES.add(StructuredActivityNode_2007);
			KNOWN_ELEMENT_TYPES.add(ControlFlow_4001);
			KNOWN_ELEMENT_TYPES.add(ObjectFlow_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static class Initializers {

		/**
		 * @generated
		 */
		public static final IObjectInitializer AcceptEventAction_2002 = new ObjectInitializer(UMLPackage.eINSTANCE.getAcceptEventAction()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getAcceptEventAction_Trigger(), new UMLAbstractExpression(UMLPackage.eINSTANCE.getAcceptEventAction()) {

					protected Object doEvaluate(Object context, Map env) {
						AcceptEventAction self = (AcceptEventAction) context;
						return Java.initAcceptTimeEventActionTrigger(self);
					}
				}));
			}
		}; // AcceptEventAction_2002 ObjectInitializer

		/**
		 * @generated
		 */
		public static final IObjectInitializer AcceptEventAction_3013 = new ObjectInitializer(UMLPackage.eINSTANCE.getAcceptEventAction()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getAcceptEventAction_Trigger(), new UMLAbstractExpression(UMLPackage.eINSTANCE.getAcceptEventAction()) {

					protected Object doEvaluate(Object context, Map env) {
						AcceptEventAction self = (AcceptEventAction) context;
						return Java.initAcceptTimeEventActionTrigger(self);
					}
				}));
			}
		}; // AcceptEventAction_3013 ObjectInitializer

		/** 
		 * @generated
		 */
		private Initializers() {
		}

		/** 
		 * @generated
		 */
		public static interface IObjectInitializer {

			/** 
			 * @generated
			 */
			public void init(EObject instance);
		}

		/** 
		 * @generated
		 */
		public static abstract class ObjectInitializer implements IObjectInitializer {

			/** 
			 * @generated
			 */
			final EClass element;

			/** 
			 * @generated
			 */
			private List featureInitializers = new ArrayList();

			/** 
			 * @generated
			 */
			ObjectInitializer(EClass element) {
				this.element = element;
				init();
			}

			/**
			 * @generated
			 */
			protected abstract void init();

			/** 
			 * @generated
			 */
			protected final IFeatureInitializer add(IFeatureInitializer initializer) {
				featureInitializers.add(initializer);
				return initializer;
			}

			/** 
			 * @generated
			 */
			public void init(EObject instance) {
				for (Iterator it = featureInitializers.iterator(); it.hasNext();) {
					IFeatureInitializer nextExpr = (IFeatureInitializer) it.next();
					try {
						nextExpr.init(instance);
					} catch (RuntimeException e) {
						UMLDiagramEditorPlugin.getInstance().logError("Feature initialization failed", e); //$NON-NLS-1$						
					}
				}
			}
		} // end of ObjectInitializer

		/** 
		 * @generated
		 */
		interface IFeatureInitializer {

			/**
			 * @generated
			 */
			void init(EObject contextInstance);
		}

		/**
		 * @generated
		 */
		static IFeatureInitializer createNewElementFeatureInitializer(EStructuralFeature initFeature, ObjectInitializer[] newObjectInitializers) {
			final EStructuralFeature feature = initFeature;
			final ObjectInitializer[] initializers = newObjectInitializers;
			return new IFeatureInitializer() {

				public void init(EObject contextInstance) {
					for (int i = 0; i < initializers.length; i++) {
						EObject newInstance = initializers[i].element.getEPackage().getEFactoryInstance().create(initializers[i].element);
						if (feature.isMany()) {
							((Collection) contextInstance.eGet(feature)).add(newInstance);
						} else {
							contextInstance.eSet(feature, newInstance);
						}
						initializers[i].init(newInstance);
					}
				}
			};
		}

		/**
		 * @generated
		 */
		static IFeatureInitializer createExpressionFeatureInitializer(EStructuralFeature initFeature, UMLAbstractExpression valueExpression) {
			final EStructuralFeature feature = initFeature;
			final UMLAbstractExpression expression = valueExpression;
			return new IFeatureInitializer() {

				public void init(EObject contextInstance) {
					expression.assignTo(feature, contextInstance);
				}
			};
		}

		/** 
		 * @generated
		 */
		static class Java {

			/**
			 * @generated NOT
			 */
			private static EList initAcceptTimeEventActionTrigger(AcceptEventAction self) {
				new AcceptEventAction_2002_Initializer().init(self);
				return new BasicEList();
			}
		} //Java
	} // end of Initializers
}
