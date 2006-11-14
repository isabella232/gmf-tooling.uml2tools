package org.eclipse.uml2.diagram.statemachine.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.diagram.statemachine.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.statemachine.expressions.UMLOCLFactory;

import org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin;

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
			elements.put(StateMachine_1000, UMLPackage.eINSTANCE.getStateMachine());
			elements.put(State_3001, UMLPackage.eINSTANCE.getState());
			elements.put(State_3012, UMLPackage.eINSTANCE.getState());
			elements.put(Region_3002, UMLPackage.eINSTANCE.getRegion());
			elements.put(FinalState_3003, UMLPackage.eINSTANCE.getFinalState());
			elements.put(Pseudostate_3004, UMLPackage.eINSTANCE.getPseudostate());
			elements.put(Pseudostate_3005, UMLPackage.eINSTANCE.getPseudostate());
			elements.put(Pseudostate_3006, UMLPackage.eINSTANCE.getPseudostate());
			elements.put(Pseudostate_3007, UMLPackage.eINSTANCE.getPseudostate());
			elements.put(Pseudostate_3008, UMLPackage.eINSTANCE.getPseudostate());
			elements.put(Pseudostate_3009, UMLPackage.eINSTANCE.getPseudostate());
			elements.put(Pseudostate_3010, UMLPackage.eINSTANCE.getPseudostate());
			elements.put(Pseudostate_3011, UMLPackage.eINSTANCE.getPseudostate());
			elements.put(Region_2001, UMLPackage.eINSTANCE.getRegion());
			elements.put(Pseudostate_2002, UMLPackage.eINSTANCE.getPseudostate());
			elements.put(Pseudostate_2003, UMLPackage.eINSTANCE.getPseudostate());
			elements.put(Transition_4001, UMLPackage.eINSTANCE.getTransition());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	public static final IElementType StateMachine_1000 = getElementType("org.eclipse.uml2.diagram.statemachine.StateMachine_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType State_3001 = getElementType("org.eclipse.uml2.diagram.statemachine.State_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType State_3012 = getElementType("org.eclipse.uml2.diagram.statemachine.State_3012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Region_3002 = getElementType("org.eclipse.uml2.diagram.statemachine.Region_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FinalState_3003 = getElementType("org.eclipse.uml2.diagram.statemachine.FinalState_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Pseudostate_3004 = getElementType("org.eclipse.uml2.diagram.statemachine.Pseudostate_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Pseudostate_3005 = getElementType("org.eclipse.uml2.diagram.statemachine.Pseudostate_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Pseudostate_3006 = getElementType("org.eclipse.uml2.diagram.statemachine.Pseudostate_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Pseudostate_3007 = getElementType("org.eclipse.uml2.diagram.statemachine.Pseudostate_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Pseudostate_3008 = getElementType("org.eclipse.uml2.diagram.statemachine.Pseudostate_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Pseudostate_3009 = getElementType("org.eclipse.uml2.diagram.statemachine.Pseudostate_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Pseudostate_3010 = getElementType("org.eclipse.uml2.diagram.statemachine.Pseudostate_3010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Pseudostate_3011 = getElementType("org.eclipse.uml2.diagram.statemachine.Pseudostate_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Region_2001 = getElementType("org.eclipse.uml2.diagram.statemachine.Region_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Pseudostate_2002 = getElementType("org.eclipse.uml2.diagram.statemachine.Pseudostate_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Pseudostate_2003 = getElementType("org.eclipse.uml2.diagram.statemachine.Pseudostate_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Transition_4001 = getElementType("org.eclipse.uml2.diagram.statemachine.Transition_4001"); //$NON-NLS-1$

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
			KNOWN_ELEMENT_TYPES.add(StateMachine_1000);
			KNOWN_ELEMENT_TYPES.add(State_3001);
			KNOWN_ELEMENT_TYPES.add(State_3012);
			KNOWN_ELEMENT_TYPES.add(Region_3002);
			KNOWN_ELEMENT_TYPES.add(FinalState_3003);
			KNOWN_ELEMENT_TYPES.add(Pseudostate_3004);
			KNOWN_ELEMENT_TYPES.add(Pseudostate_3005);
			KNOWN_ELEMENT_TYPES.add(Pseudostate_3006);
			KNOWN_ELEMENT_TYPES.add(Pseudostate_3007);
			KNOWN_ELEMENT_TYPES.add(Pseudostate_3008);
			KNOWN_ELEMENT_TYPES.add(Pseudostate_3009);
			KNOWN_ELEMENT_TYPES.add(Pseudostate_3010);
			KNOWN_ELEMENT_TYPES.add(Pseudostate_3011);
			KNOWN_ELEMENT_TYPES.add(Region_2001);
			KNOWN_ELEMENT_TYPES.add(Pseudostate_2002);
			KNOWN_ELEMENT_TYPES.add(Pseudostate_2003);
			KNOWN_ELEMENT_TYPES.add(Transition_4001);
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
		public static final IObjectInitializer Pseudostate_2002 = new ObjectInitializer(org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getPseudostate()) {

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
		}; // Pseudostate_2002 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Pseudostate_2003 = new ObjectInitializer(org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getPseudostate()) {

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
		}; // Pseudostate_2003 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer State_3001 = new ObjectInitializer(org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getState()) {

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
		public static final IObjectInitializer State_3012 = new ObjectInitializer(org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getState()) {

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
				return new ObjectInitializer(org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getRegion()) {

					protected void init() {
						add(createExpressionFeatureInitializer(
								UMLPackage.eINSTANCE.getNamedElement_Name(),
								UMLOCLFactory
										.getExpression(
												" let base : String = \'Region\' in  let suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in  let space : Namespace = self.namespace in  let allMissed : Sequence(String) = suffixes-> \tselect(s : String | not space.member->exists(e : NamedElement | e.name = base.concat(s)) ) in  let firstMissed : String = allMissed->first() in  let noMisses : Boolean = firstMissed.oclIsUndefined() in  let allNames : Set(String) =  \tif noMisses \t\tthen \t\tspace.member->collect(e : NamedElement | \t\t\tif e = self or e.name.oclIsUndefined() or e.name.substring(1, e.name.size().min(base.size())) <> base \t\t\tthen \'\' else e.name \t\t\tendif \t\t)->asSet()->excluding(\'\') \t\telse Set{\'not in use\'} \t\tendif in  let longestName : String = \t\tif noMisses \t\tthen allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first()\t\telse \'not in use\' \t\tendif \tin  if noMisses then \t\tif longestName.oclIsUndefined() \t\tthen base \t\telse longestName.concat(\'1\') \t\tendif  else base.concat(firstMissed)  endif ", //$NON-NLS-1$
												UMLPackage.eINSTANCE.getRegion())));
					}
				}; // region ObjectInitializer
			}
		}; // State_3012 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Pseudostate_3004 = new ObjectInitializer(org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getPseudostate()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getPseudostate_Kind(), UMLOCLFactory.getExpression("PseudostateKind::initial", //$NON-NLS-1$
						UMLPackage.eINSTANCE.getPseudostate())));
			}
		}; // Pseudostate_3004 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Pseudostate_3005 = new ObjectInitializer(org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getPseudostate()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getPseudostate_Kind(), UMLOCLFactory.getExpression("PseudostateKind::shallowHistory", //$NON-NLS-1$
						UMLPackage.eINSTANCE.getPseudostate())));
			}
		}; // Pseudostate_3005 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Pseudostate_3006 = new ObjectInitializer(org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getPseudostate()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getPseudostate_Kind(), UMLOCLFactory.getExpression("PseudostateKind::deepHistory", //$NON-NLS-1$
						UMLPackage.eINSTANCE.getPseudostate())));
			}
		}; // Pseudostate_3006 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Pseudostate_3007 = new ObjectInitializer(org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getPseudostate()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getPseudostate_Kind(), UMLOCLFactory.getExpression("PseudostateKind::fork", //$NON-NLS-1$
						UMLPackage.eINSTANCE.getPseudostate())));
			}
		}; // Pseudostate_3007 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Pseudostate_3008 = new ObjectInitializer(org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getPseudostate()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getPseudostate_Kind(), UMLOCLFactory.getExpression("PseudostateKind::join", //$NON-NLS-1$
						UMLPackage.eINSTANCE.getPseudostate())));
			}
		}; // Pseudostate_3008 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Pseudostate_3009 = new ObjectInitializer(org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getPseudostate()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getPseudostate_Kind(), UMLOCLFactory.getExpression("PseudostateKind::junction", //$NON-NLS-1$
						UMLPackage.eINSTANCE.getPseudostate())));
			}
		}; // Pseudostate_3009 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Pseudostate_3010 = new ObjectInitializer(org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getPseudostate()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getPseudostate_Kind(), UMLOCLFactory.getExpression("PseudostateKind::choice", //$NON-NLS-1$
						UMLPackage.eINSTANCE.getPseudostate())));
			}
		}; // Pseudostate_3010 ObjectInitializer		

		/**
		 * @generated
		 */
		public static final IObjectInitializer Pseudostate_3011 = new ObjectInitializer(org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getPseudostate()) {

			protected void init() {
				add(createExpressionFeatureInitializer(UMLPackage.eINSTANCE.getPseudostate_Kind(), UMLOCLFactory.getExpression("PseudostateKind::terminate", //$NON-NLS-1$
						UMLPackage.eINSTANCE.getPseudostate())));
			}
		}; // Pseudostate_3011 ObjectInitializer

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
				for (java.util.Iterator it = featureInitializers.iterator(); it.hasNext();) {
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
	} // end of Initializers
}
