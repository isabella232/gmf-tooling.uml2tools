package org.eclipse.uml2.diagram.profile.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.uml2.diagram.profile.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.profile.expressions.UMLOCLFactory;

import org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin;

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
		public static final IObjectInitializer Stereotype_2001 = new ObjectInitializer(UMLPackage.eINSTANCE.getStereotype()) {

			protected void init() {
				add(createExpressionFeatureInitializer(
						UMLPackage.eINSTANCE.getNamedElement_Name(),
						UMLOCLFactory
								.getExpression(
										"let base : String = \'Stereotype\' in \r\nlet suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  \r\nlet space : Namespace = self.namespace in  \r\nlet allMissed : Sequence(String) = suffixes-> \t\r\n     select(s : String | not space.member->\r\n          exists(e : NamedElement | e.name = base.concat(s)) \r\n     ) in  \r\nlet firstMissed : String = allMissed->first() in  \r\nlet noMisses : Boolean = firstMissed.oclIsUndefined() in  \r\nlet allNames : Set(String) =  \t\r\nif noMisses \r\nthen\r\n    space.member->collect(e : NamedElement | \t\t\t\r\n         if e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\t\r\n         then \'\' \r\n         else e.name \t\t\t\r\n         endif\r\n    )->asSet()->excluding(\'\') \t\t\r\nelse Set{\'not in use\'} \t\t\r\nendif in  \r\nlet longestName : String = \t\t\r\n   if noMisses \t\t\r\n   then allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\r\n   else \'not in use\' \t\t\r\n   endif \t\r\nin  \r\nif noMisses then \t\t\r\n   if longestName.oclIsUndefined() \r\n   then base \t\t\r\n   else longestName.concat(\'1\') \r\n   endif  \r\nelse \r\nbase.concat(firstMissed)  \r\nendif ", //$NON-NLS-1$
										UMLPackage.eINSTANCE.getStereotype())));
			}
		}; // Stereotype_2001 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Profile_2002 = new ObjectInitializer(UMLPackage.eINSTANCE.getProfile()) {

			protected void init() {
				add(createExpressionFeatureInitializer(
						UMLPackage.eINSTANCE.getNamedElement_Name(),
						UMLOCLFactory
								.getExpression(
										"let base : String = \'profile\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
										UMLPackage.eINSTANCE.getProfile())));
			}
		}; // Profile_2002 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Enumeration_2003 = new ObjectInitializer(UMLPackage.eINSTANCE.getEnumeration()) {

			protected void init() {
				add(createExpressionFeatureInitializer(
						UMLPackage.eINSTANCE.getNamedElement_Name(),
						UMLOCLFactory
								.getExpression(
										" let base : String = \'enumeration\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
										UMLPackage.eINSTANCE.getEnumeration())));
			}
		}; // Enumeration_2003 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Property_3001 = new ObjectInitializer(UMLPackage.eINSTANCE.getProperty()) {

			protected void init() {
				add(createExpressionFeatureInitializer(
						UMLPackage.eINSTANCE.getNamedElement_Name(),
						UMLOCLFactory
								.getExpression(
										"let base : String = \'property\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
										UMLPackage.eINSTANCE.getProperty())));
			}
		}; // Property_3001 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Constraint_3008 = new ObjectInitializer(UMLPackage.eINSTANCE.getConstraint()) {

			protected void init() {
				add(createExpressionFeatureInitializer(
						UMLPackage.eINSTANCE.getNamedElement_Name(),
						UMLOCLFactory
								.getExpression(
										"let base : String = \'constraint\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
										UMLPackage.eINSTANCE.getConstraint())));
			}
		}; // Constraint_3008 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Stereotype_3003 = new ObjectInitializer(UMLPackage.eINSTANCE.getStereotype()) {

			protected void init() {
				add(createExpressionFeatureInitializer(
						UMLPackage.eINSTANCE.getNamedElement_Name(),
						UMLOCLFactory
								.getExpression(
										"let base : String = \'stereotype\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
										UMLPackage.eINSTANCE.getStereotype())));
			}
		}; // Stereotype_3003 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer EnumerationLiteral_3005 = new ObjectInitializer(UMLPackage.eINSTANCE.getEnumerationLiteral()) {

			protected void init() {
				add(createExpressionFeatureInitializer(
						UMLPackage.eINSTANCE.getNamedElement_Name(),
						UMLOCLFactory
								.getExpression(
										" let base : String = \'enumerationLiteral\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
										UMLPackage.eINSTANCE.getEnumerationLiteral())));
			}
		}; // EnumerationLiteral_3005 ObjectInitializer

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
