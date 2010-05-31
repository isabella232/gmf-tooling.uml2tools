package org.eclipse.uml2.diagram.profile.expressions;

import java.lang.ref.WeakReference;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.ETypedElement;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.Variable;

import org.eclipse.ocl.helper.OCLHelper;

import org.eclipse.ocl.options.ParsingOptions;
import org.eclipse.ocl.utilities.AbstractVisitor;
import org.eclipse.ocl.utilities.PredefinedType;

import org.eclipse.uml2.diagram.parser.lookup.OCLLookup;
import org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin;

/**
 * @generated 
 */
public class UMLOCLFactory {

	/**
	 * @generated
	 */
	private final UMLAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	public static OCLLookup.Expression getOCLLookupExpression(String body, EClassifier context) {
		final UMLAbstractExpression expression = getExpression(body, context);
		if (!expression.getStatus().isOK()) {
			throw new IllegalArgumentException("Bad OCL:" + body);
		}
		return new OCLLookup.Expression() {

			public Object evaluate(Object context) {
				return expression.evaluate(context);
			}
		};
	}

	/**
	 * @generated 
	 */
	protected UMLOCLFactory() {
		this.expressions = new UMLAbstractExpression[16];
	}

	/**
	 * @generated
	 */
	public static UMLAbstractExpression getExpression(int index, EClassifier context, Map<String, EClassifier> environment) {
		UMLOCLFactory cached = UMLDiagramEditorPlugin.getInstance().getUMLOCLFactory();
		if (cached == null) {
			UMLDiagramEditorPlugin.getInstance().setUMLOCLFactory(cached = new UMLOCLFactory());
		}
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			final String[] exprBodies = new String[] {
					"generalization.general->forAll(e | e.oclIsKindOf(uml::Stereotype)) and\r\ngeneralization.specific->forAll(e | e.oclIsKindOf(uml::Stereotype))", //$NON-NLS-1$
					"let base : String = \'Stereotype\' in \r\nlet suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  \r\nlet space : Namespace = self.namespace in  \r\nlet allMissed : Sequence(String) = suffixes-> \t\r\n     select(s : String | not space.member->\r\n          exists(e : NamedElement | e.name = base.concat(s)) \r\n     ) in  \r\nlet firstMissed : String = allMissed->first() in  \r\nlet noMisses : Boolean = firstMissed.oclIsUndefined() in  \r\nlet allNames : Set(String) =  \t\r\nif noMisses \r\nthen\r\n    space.member->collect(e : NamedElement | \t\t\t\r\n         if e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\t\r\n         then \'\' \r\n         else e.name \t\t\t\r\n         endif\r\n    )->asSet()->excluding(\'\') \t\t\r\nelse Set{\'not in use\'} \t\t\r\nendif in  \r\nlet longestName : String = \t\t\r\n   if noMisses \t\t\r\n   then allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\r\n   else \'not in use\' \t\t\r\n   endif \t\r\nin  \r\nif noMisses then \t\t\r\n   if longestName.oclIsUndefined() \r\n   then base \t\t\r\n   else longestName.concat(\'1\') \r\n   endif  \r\nelse \r\nbase.concat(firstMissed)  \r\nendif ", //$NON-NLS-1$
					"self.association.oclIsUndefined() or not self.association.oclIsKindOf(uml::Extension)", //$NON-NLS-1$
					"let base : String = \'property\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
					"\'OCL\'", //$NON-NLS-1$
					"\'true\'", //$NON-NLS-1$
					"\'/icons\'", //$NON-NLS-1$
					"let base : String = \'Profile\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
					"let base : String = \'stereotype\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
					" let base : String = \'Enumeration\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
					" let base : String = \'enumerationLiteral\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
					"self.importedElement.oclIsUndefined() or self.importedElement.oclAsType(uml::Class).isMetaclass()", //$NON-NLS-1$
					"let imported : NamedElement = self.importedElement in \r\nimported.oclIsUndefined() or not imported.oclIsKindOf(Class) or not imported.oclAsType(Class).isMetaclass()\r\n", //$NON-NLS-1$
					"\'OCL\'", //$NON-NLS-1$
					"\'true\'", //$NON-NLS-1$
					"self.importedElement<>null and \r\nlet metaclass : Class = self.importedElement.oclAsType(Class) in\r\nmetaclass.isMetaclass() and \r\nnot oppositeEnd.getAllExtendedMetaclasses()->includes(metaclass)\r\n", //$NON-NLS-1$
			};
			cached.expressions[index] = getExpression(exprBodies[index], context, environment == null ? Collections.<String, EClassifier> emptyMap() : environment);
		}
		return cached.expressions[index];
	}

	/**
	 * @generated 
	 */
	public static UMLAbstractExpression getExpression(String body, EClassifier context, Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * @generated 
	 */
	public static UMLAbstractExpression getExpression(String body, EClassifier context) {
		return getExpression(body, context, Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated 
	 */
	private static class Expression extends UMLAbstractExpression {

		/**
		 * @generated 
		 */
		private final org.eclipse.ocl.ecore.OCL oclInstance;

		/**
		 * @generated
		 */
		private org.eclipse.ocl.ecore.OCLExpression oclExpression;

		/**
		 * @generated 
		 */
		public Expression(String body, EClassifier context, Map<String, EClassifier> environment) {
			super(body, context);
			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
			initCustomEnv(oclInstance.getEnvironment(), environment);
			Helper oclHelper = oclInstance.createOCLHelper();
			oclHelper.setContext(context());
			try {
				oclExpression = oclHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (ParserException e) {
				setStatus(IStatus.ERROR, e.getMessage(), e);
			}
		}

		/**
		 * @generated 
		 */
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
			if (oclExpression == null) {
				return null;
			}
			// on the first call, both evalEnvironment and extentMap are clear, for later we have finally, below.
			EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = oclInstance.getEvaluationEnvironment();
			// initialize environment
			for (Object nextKey : env.keySet()) {
				evalEnv.replace((String) nextKey, env.get(nextKey));
			}
			try {
				Object result = oclInstance.evaluate(context, oclExpression);
				return oclInstance.isInvalid(result) ? null : result;
			} finally {
				evalEnv.clear();
				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
			}
		}

		/**
		 * @generated 
		 */
		private static void initCustomEnv(Environment<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, ?, ?, ?> ecoreEnv, Map<String, EClassifier> environment) {
			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
			ParsingOptions.setOption(ecoreEnv, ParsingOptions.implicitRootClass(ecoreEnv), EcorePackage.eINSTANCE.getEObject());
			for (String varName : environment.keySet()) {
				EClassifier varType = environment.get(varName);
				ecoreEnv.addElement(varName, createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		 * @generated 
		 */
		private static org.eclipse.ocl.ecore.Variable createVar(Environment<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ecoreEnv, String name, EClassifier type) {
			org.eclipse.ocl.ecore.Variable var = EcoreFactory.eINSTANCE.createVariable();
			var.setName(name);
			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
			return var;
		}
	}
}
