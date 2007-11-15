package org.eclipse.uml2.diagram.statemachine.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.uml2.diagram.statemachine.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.statemachine.expressions.UMLOCLFactory;

import org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin;

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
		public static final IObjectInitializer State_3001 = new ObjectInitializer(UMLPackage.eINSTANCE.getState()) {

			protected void init() {
				add(createExpressionFeatureInitializer(
						UMLPackage.eINSTANCE.getNamedElement_Name(),
						UMLOCLFactory
								.getExpression(
										" let base : String = \'State\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
										UMLPackage.eINSTANCE.getState())));
			}
		}; // State_3001 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer State_3012 = new ObjectInitializer(UMLPackage.eINSTANCE.getState()) {

			protected void init() {
				add(createExpressionFeatureInitializer(
						UMLPackage.eINSTANCE.getNamedElement_Name(),
						UMLOCLFactory
								.getExpression(
										" let base : String = \'State\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
										UMLPackage.eINSTANCE.getState())));
				add(createNewElementFeatureInitializer(UMLPackage.eINSTANCE.getState_Region(), new ObjectInitializer[] { region(), }));
			}

			ObjectInitializer region() {
				return new ObjectInitializer(UMLPackage.eINSTANCE.getRegion()) {

					protected void init() {
						add(createExpressionFeatureInitializer(
								UMLPackage.eINSTANCE.getNamedElement_Name(),
								UMLOCLFactory
										.getExpression(
												" let base : String = \'Region\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
												UMLPackage.eINSTANCE.getRegion())));
					}
				};
			}
		}; // State_3012 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer State_3016 = new ObjectInitializer(UMLPackage.eINSTANCE.getState()) {

			protected void init() {
				add(createExpressionFeatureInitializer(
						UMLPackage.eINSTANCE.getNamedElement_Name(),
						UMLOCLFactory
								.getExpression(
										" let base : String = \'SubmachineState\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
										UMLPackage.eINSTANCE.getState())));
			}
		}; // State_3016 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer ConnectionPointReference_3017 = new ObjectInitializer(UMLPackage.eINSTANCE.getConnectionPointReference()) {

			protected void init() {
				add(createExpressionFeatureInitializer(
						UMLPackage.eINSTANCE.getNamedElement_Name(),
						UMLOCLFactory
								.getExpression(
										" let base : String = \'EntryPointConnectionPointReference\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
										UMLPackage.eINSTANCE.getConnectionPointReference())));
			}
		}; // ConnectionPointReference_3017 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer ConnectionPointReference_3018 = new ObjectInitializer(UMLPackage.eINSTANCE.getConnectionPointReference()) {

			protected void init() {
				add(createExpressionFeatureInitializer(
						UMLPackage.eINSTANCE.getNamedElement_Name(),
						UMLOCLFactory
								.getExpression(
										" let base : String = \'ExitPointConnectionPointReference\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
										UMLPackage.eINSTANCE.getConnectionPointReference())));
			}
		}; // ConnectionPointReference_3018 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Pseudostate_3004 = new ObjectInitializer(UMLPackage.eINSTANCE.getPseudostate()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getPseudostate_Kind(), UMLOCLFactory.getExpression("PseudostateKind::initial", //$NON-NLS-1$
						UMLPackage.eINSTANCE.getPseudostate())));
			}
		}; // Pseudostate_3004 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Pseudostate_3005 = new ObjectInitializer(UMLPackage.eINSTANCE.getPseudostate()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getPseudostate_Kind(), UMLOCLFactory.getExpression("PseudostateKind::shallowHistory", //$NON-NLS-1$
						UMLPackage.eINSTANCE.getPseudostate())));
			}
		}; // Pseudostate_3005 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Pseudostate_3006 = new ObjectInitializer(UMLPackage.eINSTANCE.getPseudostate()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getPseudostate_Kind(), UMLOCLFactory.getExpression("PseudostateKind::deepHistory", //$NON-NLS-1$
						UMLPackage.eINSTANCE.getPseudostate())));
			}
		}; // Pseudostate_3006 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Pseudostate_3007 = new ObjectInitializer(UMLPackage.eINSTANCE.getPseudostate()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getPseudostate_Kind(), UMLOCLFactory.getExpression("PseudostateKind::fork", //$NON-NLS-1$
						UMLPackage.eINSTANCE.getPseudostate())));
			}
		}; // Pseudostate_3007 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Pseudostate_3008 = new ObjectInitializer(UMLPackage.eINSTANCE.getPseudostate()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getPseudostate_Kind(), UMLOCLFactory.getExpression("PseudostateKind::join", //$NON-NLS-1$
						UMLPackage.eINSTANCE.getPseudostate())));
			}
		}; // Pseudostate_3008 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Pseudostate_3009 = new ObjectInitializer(UMLPackage.eINSTANCE.getPseudostate()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getPseudostate_Kind(), UMLOCLFactory.getExpression("PseudostateKind::junction", //$NON-NLS-1$
						UMLPackage.eINSTANCE.getPseudostate())));
			}
		}; // Pseudostate_3009 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Pseudostate_3010 = new ObjectInitializer(UMLPackage.eINSTANCE.getPseudostate()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getPseudostate_Kind(), UMLOCLFactory.getExpression("PseudostateKind::choice", //$NON-NLS-1$
						UMLPackage.eINSTANCE.getPseudostate())));
			}
		}; // Pseudostate_3010 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Pseudostate_3011 = new ObjectInitializer(UMLPackage.eINSTANCE.getPseudostate()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getPseudostate_Kind(), UMLOCLFactory.getExpression("PseudostateKind::terminate", //$NON-NLS-1$
						UMLPackage.eINSTANCE.getPseudostate())));
			}
		}; // Pseudostate_3011 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Pseudostate_3014 = new ObjectInitializer(UMLPackage.eINSTANCE.getPseudostate()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getPseudostate_Kind(), UMLOCLFactory.getExpression("PseudostateKind::entryPoint", //$NON-NLS-1$
						UMLPackage.eINSTANCE.getPseudostate())));
				add(createExpressionFeatureInitializer(
						UMLPackage.eINSTANCE.getNamedElement_Name(),
						UMLOCLFactory
								.getExpression(
										" let base : String = \'Entry Point\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
										UMLPackage.eINSTANCE.getPseudostate())));
			}
		}; // Pseudostate_3014 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Pseudostate_3015 = new ObjectInitializer(UMLPackage.eINSTANCE.getPseudostate()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getPseudostate_Kind(), UMLOCLFactory.getExpression("PseudostateKind::exitPoint", //$NON-NLS-1$
						UMLPackage.eINSTANCE.getPseudostate())));
				add(createExpressionFeatureInitializer(
						UMLPackage.eINSTANCE.getNamedElement_Name(),
						UMLOCLFactory
								.getExpression(
										" let base : String = \'Exit Point\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
										UMLPackage.eINSTANCE.getPseudostate())));
			}
		}; // Pseudostate_3015 ObjectInitializer

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
		}
	} // end of Initializers
}
