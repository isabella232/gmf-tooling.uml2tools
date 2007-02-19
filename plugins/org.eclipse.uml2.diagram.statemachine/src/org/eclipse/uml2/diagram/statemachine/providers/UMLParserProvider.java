package org.eclipse.uml2.diagram.statemachine.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateName2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachineNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateName2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateName3EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateNameEditPart;

import org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser stateStateName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getStateStateName_5001Parser() {
		if (stateStateName_5001Parser == null) {
			stateStateName_5001Parser = createStateStateName_5001Parser();
		}
		return stateStateName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createStateStateName_5001Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser stateStateName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getStateStateName_5004Parser() {
		if (stateStateName_5004Parser == null) {
			stateStateName_5004Parser = createStateStateName_5004Parser();
		}
		return stateStateName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createStateStateName_5004Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser stateStateName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getStateStateName_5008Parser() {
		if (stateStateName_5008Parser == null) {
			stateStateName_5008Parser = createStateStateName_5008Parser();
		}
		return stateStateName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createStateStateName_5008Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser pseudostatePseudostateName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getPseudostatePseudostateName_5006Parser() {
		if (pseudostatePseudostateName_5006Parser == null) {
			pseudostatePseudostateName_5006Parser = createPseudostatePseudostateName_5006Parser();
		}
		return pseudostatePseudostateName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPseudostatePseudostateName_5006Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser pseudostatePseudostateName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getPseudostatePseudostateName_5007Parser() {
		if (pseudostatePseudostateName_5007Parser == null) {
			pseudostatePseudostateName_5007Parser = createPseudostatePseudostateName_5007Parser();
		}
		return pseudostatePseudostateName_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPseudostatePseudostateName_5007Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser stateMachineStateMachineName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getStateMachineStateMachineName_5005Parser() {
		if (stateMachineStateMachineName_5005Parser == null) {
			stateMachineStateMachineName_5005Parser = createStateMachineStateMachineName_5005Parser();
		}
		return stateMachineStateMachineName_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createStateMachineStateMachineName_5005Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case StateNameEditPart.VISUAL_ID:
			return getStateStateName_5001Parser();
		case StateName3EditPart.VISUAL_ID:
			return getStateStateName_5004Parser();
		case StateName2EditPart.VISUAL_ID:
			return getStateStateName_5008Parser();
		case PseudostateNameEditPart.VISUAL_ID:
			return getPseudostatePseudostateName_5006Parser();
		case PseudostateName2EditPart.VISUAL_ID:
			return getPseudostatePseudostateName_5007Parser();
		case StateMachineNameEditPart.VISUAL_ID:
			return getStateMachineStateMachineName_5005Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(UMLVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(UMLVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (UMLElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}
}
