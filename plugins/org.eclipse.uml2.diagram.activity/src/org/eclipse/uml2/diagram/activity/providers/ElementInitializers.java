package org.eclipse.uml2.diagram.activity.providers;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.diagram.activity.expressions.UMLAbstractExpression;

import org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin;

import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ElementInitializers {

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
			 * @generated
			 */
			private static EList<Trigger> initAcceptTimeEventActionTrigger(AcceptEventAction self) {
				// TODO: implement this method
				// Ensure that you remove @generated or mark it @generated NOT

				throw new UMLAbstractExpression.NoImplException("No user java implementation provided in 'initAcceptTimeEventActionTrigger' operation"); //$NON-NLS-1$
			}
		} //Java
	} // end of Initializers
}
