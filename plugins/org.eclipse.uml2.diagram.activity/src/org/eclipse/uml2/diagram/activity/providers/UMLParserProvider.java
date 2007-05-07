package org.eclipse.uml2.diagram.activity.providers;

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
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityParameterNodeNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinName4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinName5EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LiteralString2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LiteralStringEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueBehaviorNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinNameEditPart;
import org.eclipse.uml2.diagram.activity.parsers.MessageFormatParser;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser activityName_5030Parser;

	/**
	 * @generated
	 */
	private IParser getActivityName_5030Parser() {
		if (activityName_5030Parser == null) {
			activityName_5030Parser = createActivityName_5030Parser();
		}
		return activityName_5030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createActivityName_5030Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActionName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActionName_5023Parser() {
		if (opaqueActionName_5023Parser == null) {
			opaqueActionName_5023Parser = createOpaqueActionName_5023Parser();
		}
		return opaqueActionName_5023Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOpaqueActionName_5023Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser outputPinName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinName_5003Parser() {
		if (outputPinName_5003Parser == null) {
			outputPinName_5003Parser = createOutputPinName_5003Parser();
		}
		return outputPinName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOutputPinName_5003Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser pinName_5024Parser;

	/**
	 * @generated
	 */
	private IParser getPinName_5024Parser() {
		if (pinName_5024Parser == null) {
			pinName_5024Parser = createPinName_5024Parser();
		}
		return pinName_5024Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPinName_5024Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser createObjectActionName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getCreateObjectActionName_5025Parser() {
		if (createObjectActionName_5025Parser == null) {
			createObjectActionName_5025Parser = createCreateObjectActionName_5025Parser();
		}
		return createObjectActionName_5025Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCreateObjectActionName_5025Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser outputPinName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinName_5004Parser() {
		if (outputPinName_5004Parser == null) {
			outputPinName_5004Parser = createOutputPinName_5004Parser();
		}
		return outputPinName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOutputPinName_5004Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser addStructuralFeatureValueActionName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getAddStructuralFeatureValueActionName_5026Parser() {
		if (addStructuralFeatureValueActionName_5026Parser == null) {
			addStructuralFeatureValueActionName_5026Parser = createAddStructuralFeatureValueActionName_5026Parser();
		}
		return addStructuralFeatureValueActionName_5026Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAddStructuralFeatureValueActionName_5026Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser inputPinName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinName_5006Parser() {
		if (inputPinName_5006Parser == null) {
			inputPinName_5006Parser = createInputPinName_5006Parser();
		}
		return inputPinName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInputPinName_5006Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser inputPinName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinName_5007Parser() {
		if (inputPinName_5007Parser == null) {
			inputPinName_5007Parser = createInputPinName_5007Parser();
		}
		return inputPinName_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInputPinName_5007Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser inputPinName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinName_5008Parser() {
		if (inputPinName_5008Parser == null) {
			inputPinName_5008Parser = createInputPinName_5008Parser();
		}
		return inputPinName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInputPinName_5008Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser callBehaviorActionName_5027Parser;

	/**
	 * @generated
	 */
	private IParser getCallBehaviorActionName_5027Parser() {
		if (callBehaviorActionName_5027Parser == null) {
			callBehaviorActionName_5027Parser = createCallBehaviorActionName_5027Parser();
		}
		return callBehaviorActionName_5027Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCallBehaviorActionName_5027Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser outputPinName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinName_5010Parser() {
		if (outputPinName_5010Parser == null) {
			outputPinName_5010Parser = createOutputPinName_5010Parser();
		}
		return outputPinName_5010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOutputPinName_5010Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser inputPinName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinName_5011Parser() {
		if (inputPinName_5011Parser == null) {
			inputPinName_5011Parser = createInputPinName_5011Parser();
		}
		return inputPinName_5011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInputPinName_5011Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser callOperationActionName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getCallOperationActionName_5028Parser() {
		if (callOperationActionName_5028Parser == null) {
			callOperationActionName_5028Parser = createCallOperationActionName_5028Parser();
		}
		return callOperationActionName_5028Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCallOperationActionName_5028Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser inputPinName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinName_5013Parser() {
		if (inputPinName_5013Parser == null) {
			inputPinName_5013Parser = createInputPinName_5013Parser();
		}
		return inputPinName_5013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInputPinName_5013Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActionName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActionName_5015Parser() {
		if (opaqueActionName_5015Parser == null) {
			opaqueActionName_5015Parser = createOpaqueActionName_5015Parser();
		}
		return opaqueActionName_5015Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOpaqueActionName_5015Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser pinName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getPinName_5016Parser() {
		if (pinName_5016Parser == null) {
			pinName_5016Parser = createPinName_5016Parser();
		}
		return pinName_5016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPinName_5016Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser createObjectActionName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getCreateObjectActionName_5017Parser() {
		if (createObjectActionName_5017Parser == null) {
			createObjectActionName_5017Parser = createCreateObjectActionName_5017Parser();
		}
		return createObjectActionName_5017Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCreateObjectActionName_5017Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser callBehaviorActionName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getCallBehaviorActionName_5018Parser() {
		if (callBehaviorActionName_5018Parser == null) {
			callBehaviorActionName_5018Parser = createCallBehaviorActionName_5018Parser();
		}
		return callBehaviorActionName_5018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCallBehaviorActionName_5018Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser callOperationActionName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getCallOperationActionName_5019Parser() {
		if (callOperationActionName_5019Parser == null) {
			callOperationActionName_5019Parser = createCallOperationActionName_5019Parser();
		}
		return callOperationActionName_5019Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCallOperationActionName_5019Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser addStructuralFeatureValueActionName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getAddStructuralFeatureValueActionName_5020Parser() {
		if (addStructuralFeatureValueActionName_5020Parser == null) {
			addStructuralFeatureValueActionName_5020Parser = createAddStructuralFeatureValueActionName_5020Parser();
		}
		return addStructuralFeatureValueActionName_5020Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAddStructuralFeatureValueActionName_5020Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueBehaviorName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueBehaviorName_5029Parser() {
		if (opaqueBehaviorName_5029Parser == null) {
			opaqueBehaviorName_5029Parser = createOpaqueBehaviorName_5029Parser();
		}
		return opaqueBehaviorName_5029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOpaqueBehaviorName_5029Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser activityParameterNodeName_5031Parser;

	/**
	 * @generated
	 */
	private IParser getActivityParameterNodeName_5031Parser() {
		if (activityParameterNodeName_5031Parser == null) {
			activityParameterNodeName_5031Parser = createActivityParameterNodeName_5031Parser();
		}
		return activityParameterNodeName_5031Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createActivityParameterNodeName_5031Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser literalString_3049Parser;

	/**
	 * @generated
	 */
	private IParser getLiteralString_3049Parser() {
		if (literalString_3049Parser == null) {
			literalString_3049Parser = createLiteralString_3049Parser();
		}
		return literalString_3049Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createLiteralString_3049Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getLiteralString_Value(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser literalString_3051Parser;

	/**
	 * @generated
	 */
	private IParser getLiteralString_3051Parser() {
		if (literalString_3051Parser == null) {
			literalString_3051Parser = createLiteralString_3051Parser();
		}
		return literalString_3051Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createLiteralString_3051Parser() {
		MessageFormatParser parser = new MessageFormatParser(new EAttribute[] { UMLPackage.eINSTANCE.getLiteralString_Value(), });
		parser.setViewPattern("{0}");
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ActivityNameEditPart.VISUAL_ID:
			return getActivityName_5030Parser();
		case OpaqueActionNameEditPart.VISUAL_ID:
			return getOpaqueActionName_5023Parser();
		case OutputPinNameEditPart.VISUAL_ID:
			return getOutputPinName_5003Parser();
		case PinNameEditPart.VISUAL_ID:
			return getPinName_5024Parser();
		case CreateObjectActionNameEditPart.VISUAL_ID:
			return getCreateObjectActionName_5025Parser();
		case OutputPinName2EditPart.VISUAL_ID:
			return getOutputPinName_5004Parser();
		case AddStructuralFeatureValueActionNameEditPart.VISUAL_ID:
			return getAddStructuralFeatureValueActionName_5026Parser();
		case InputPinNameEditPart.VISUAL_ID:
			return getInputPinName_5006Parser();
		case InputPinName2EditPart.VISUAL_ID:
			return getInputPinName_5007Parser();
		case InputPinName3EditPart.VISUAL_ID:
			return getInputPinName_5008Parser();
		case CallBehaviorActionNameEditPart.VISUAL_ID:
			return getCallBehaviorActionName_5027Parser();
		case OutputPinName3EditPart.VISUAL_ID:
			return getOutputPinName_5010Parser();
		case InputPinName4EditPart.VISUAL_ID:
			return getInputPinName_5011Parser();
		case CallOperationActionNameEditPart.VISUAL_ID:
			return getCallOperationActionName_5028Parser();
		case InputPinName5EditPart.VISUAL_ID:
			return getInputPinName_5013Parser();
		case OpaqueActionName2EditPart.VISUAL_ID:
			return getOpaqueActionName_5015Parser();
		case PinName2EditPart.VISUAL_ID:
			return getPinName_5016Parser();
		case CreateObjectActionName2EditPart.VISUAL_ID:
			return getCreateObjectActionName_5017Parser();
		case CallBehaviorActionName2EditPart.VISUAL_ID:
			return getCallBehaviorActionName_5018Parser();
		case CallOperationActionName2EditPart.VISUAL_ID:
			return getCallOperationActionName_5019Parser();
		case AddStructuralFeatureValueActionName2EditPart.VISUAL_ID:
			return getAddStructuralFeatureValueActionName_5020Parser();
		case OpaqueBehaviorNameEditPart.VISUAL_ID:
			return getOpaqueBehaviorName_5029Parser();
		case ActivityParameterNodeNameEditPart.VISUAL_ID:
			return getActivityParameterNodeName_5031Parser();
		case LiteralStringEditPart.VISUAL_ID:
			return getLiteralString_3049Parser();
		case LiteralString2EditPart.VISUAL_ID:
			return getLiteralString_3051Parser();
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
