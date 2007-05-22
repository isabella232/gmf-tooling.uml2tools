package org.eclipse.uml2.diagram.statemachine.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ConnectionPointReferenceName2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ConnectionPointReferenceNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateName2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachineNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateName2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateName3EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.parsers.MessageFormatParser;
import org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser stateMachineName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getStateMachineName_5005Parser() {
		if (stateMachineName_5005Parser == null) {
			stateMachineName_5005Parser = createStateMachineName_5005Parser();
		}
		return stateMachineName_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createStateMachineName_5005Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser stateName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getStateName_5001Parser() {
		if (stateName_5001Parser == null) {
			stateName_5001Parser = createStateName_5001Parser();
		}
		return stateName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createStateName_5001Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser stateName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getStateName_5004Parser() {
		if (stateName_5004Parser == null) {
			stateName_5004Parser = createStateName_5004Parser();
		}
		return stateName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createStateName_5004Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser stateName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getStateName_5008Parser() {
		if (stateName_5008Parser == null) {
			stateName_5008Parser = createStateName_5008Parser();
		}
		return stateName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createStateName_5008Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionPointReferenceName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionPointReferenceName_5009Parser() {
		if (connectionPointReferenceName_5009Parser == null) {
			connectionPointReferenceName_5009Parser = createConnectionPointReferenceName_5009Parser();
		}
		return connectionPointReferenceName_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createConnectionPointReferenceName_5009Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionPointReferenceName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionPointReferenceName_5010Parser() {
		if (connectionPointReferenceName_5010Parser == null) {
			connectionPointReferenceName_5010Parser = createConnectionPointReferenceName_5010Parser();
		}
		return connectionPointReferenceName_5010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createConnectionPointReferenceName_5010Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser pseudostateName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getPseudostateName_5006Parser() {
		if (pseudostateName_5006Parser == null) {
			pseudostateName_5006Parser = createPseudostateName_5006Parser();
		}
		return pseudostateName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPseudostateName_5006Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser pseudostateName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getPseudostateName_5007Parser() {
		if (pseudostateName_5007Parser == null) {
			pseudostateName_5007Parser = createPseudostateName_5007Parser();
		}
		return pseudostateName_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPseudostateName_5007Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case StateMachineNameEditPart.VISUAL_ID:
			return getStateMachineName_5005Parser();
		case StateNameEditPart.VISUAL_ID:
			return getStateName_5001Parser();
		case StateName3EditPart.VISUAL_ID:
			return getStateName_5004Parser();
		case StateName2EditPart.VISUAL_ID:
			return getStateName_5008Parser();
		case ConnectionPointReferenceNameEditPart.VISUAL_ID:
			return getConnectionPointReferenceName_5009Parser();
		case ConnectionPointReferenceName2EditPart.VISUAL_ID:
			return getConnectionPointReferenceName_5010Parser();
		case PseudostateNameEditPart.VISUAL_ID:
			return getPseudostateName_5006Parser();
		case PseudostateName2EditPart.VISUAL_ID:
			return getPseudostateName_5007Parser();
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

	/**
	 * @generated
	 */
	public static class HintAdapter extends ParserHintAdapter {

		private final IElementType elementType;

		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
