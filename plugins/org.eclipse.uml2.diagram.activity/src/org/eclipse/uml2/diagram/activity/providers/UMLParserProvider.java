package org.eclipse.uml2.diagram.activity.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
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

import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser opaqueActionOpaqueActionName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActionOpaqueActionName_5023Parser() {
		if (opaqueActionOpaqueActionName_5023Parser == null) {
			opaqueActionOpaqueActionName_5023Parser = createOpaqueActionOpaqueActionName_5023Parser();
		}
		return opaqueActionOpaqueActionName_5023Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOpaqueActionOpaqueActionName_5023Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser outputPinOutputPinName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinOutputPinName_5003Parser() {
		if (outputPinOutputPinName_5003Parser == null) {
			outputPinOutputPinName_5003Parser = createOutputPinOutputPinName_5003Parser();
		}
		return outputPinOutputPinName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOutputPinOutputPinName_5003Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser pinPinName_5024Parser;

	/**
	 * @generated
	 */
	private IParser getPinPinName_5024Parser() {
		if (pinPinName_5024Parser == null) {
			pinPinName_5024Parser = createPinPinName_5024Parser();
		}
		return pinPinName_5024Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPinPinName_5024Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser createObjectActionCreateObjectActionName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getCreateObjectActionCreateObjectActionName_5025Parser() {
		if (createObjectActionCreateObjectActionName_5025Parser == null) {
			createObjectActionCreateObjectActionName_5025Parser = createCreateObjectActionCreateObjectActionName_5025Parser();
		}
		return createObjectActionCreateObjectActionName_5025Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCreateObjectActionCreateObjectActionName_5025Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser outputPinOutputPinName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinOutputPinName_5004Parser() {
		if (outputPinOutputPinName_5004Parser == null) {
			outputPinOutputPinName_5004Parser = createOutputPinOutputPinName_5004Parser();
		}
		return outputPinOutputPinName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOutputPinOutputPinName_5004Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser addStructuralFeatureValueActionAddStructuralFeatureValueActionName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getAddStructuralFeatureValueActionAddStructuralFeatureValueActionName_5026Parser() {
		if (addStructuralFeatureValueActionAddStructuralFeatureValueActionName_5026Parser == null) {
			addStructuralFeatureValueActionAddStructuralFeatureValueActionName_5026Parser = createAddStructuralFeatureValueActionAddStructuralFeatureValueActionName_5026Parser();
		}
		return addStructuralFeatureValueActionAddStructuralFeatureValueActionName_5026Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAddStructuralFeatureValueActionAddStructuralFeatureValueActionName_5026Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser inputPinInputPinName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinInputPinName_5006Parser() {
		if (inputPinInputPinName_5006Parser == null) {
			inputPinInputPinName_5006Parser = createInputPinInputPinName_5006Parser();
		}
		return inputPinInputPinName_5006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInputPinInputPinName_5006Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser inputPinInputPinName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinInputPinName_5007Parser() {
		if (inputPinInputPinName_5007Parser == null) {
			inputPinInputPinName_5007Parser = createInputPinInputPinName_5007Parser();
		}
		return inputPinInputPinName_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInputPinInputPinName_5007Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser inputPinInputPinName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinInputPinName_5008Parser() {
		if (inputPinInputPinName_5008Parser == null) {
			inputPinInputPinName_5008Parser = createInputPinInputPinName_5008Parser();
		}
		return inputPinInputPinName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInputPinInputPinName_5008Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser callBehaviorActionCallBehaviorActionName_5027Parser;

	/**
	 * @generated
	 */
	private IParser getCallBehaviorActionCallBehaviorActionName_5027Parser() {
		if (callBehaviorActionCallBehaviorActionName_5027Parser == null) {
			callBehaviorActionCallBehaviorActionName_5027Parser = createCallBehaviorActionCallBehaviorActionName_5027Parser();
		}
		return callBehaviorActionCallBehaviorActionName_5027Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCallBehaviorActionCallBehaviorActionName_5027Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser outputPinOutputPinName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinOutputPinName_5010Parser() {
		if (outputPinOutputPinName_5010Parser == null) {
			outputPinOutputPinName_5010Parser = createOutputPinOutputPinName_5010Parser();
		}
		return outputPinOutputPinName_5010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOutputPinOutputPinName_5010Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser inputPinInputPinName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinInputPinName_5011Parser() {
		if (inputPinInputPinName_5011Parser == null) {
			inputPinInputPinName_5011Parser = createInputPinInputPinName_5011Parser();
		}
		return inputPinInputPinName_5011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInputPinInputPinName_5011Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser callOperationActionCallOperationActionName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getCallOperationActionCallOperationActionName_5028Parser() {
		if (callOperationActionCallOperationActionName_5028Parser == null) {
			callOperationActionCallOperationActionName_5028Parser = createCallOperationActionCallOperationActionName_5028Parser();
		}
		return callOperationActionCallOperationActionName_5028Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCallOperationActionCallOperationActionName_5028Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser inputPinInputPinName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinInputPinName_5013Parser() {
		if (inputPinInputPinName_5013Parser == null) {
			inputPinInputPinName_5013Parser = createInputPinInputPinName_5013Parser();
		}
		return inputPinInputPinName_5013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInputPinInputPinName_5013Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueActionOpaqueActionName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueActionOpaqueActionName_5015Parser() {
		if (opaqueActionOpaqueActionName_5015Parser == null) {
			opaqueActionOpaqueActionName_5015Parser = createOpaqueActionOpaqueActionName_5015Parser();
		}
		return opaqueActionOpaqueActionName_5015Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOpaqueActionOpaqueActionName_5015Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser pinPinName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getPinPinName_5016Parser() {
		if (pinPinName_5016Parser == null) {
			pinPinName_5016Parser = createPinPinName_5016Parser();
		}
		return pinPinName_5016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPinPinName_5016Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser createObjectActionCreateObjectActionName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getCreateObjectActionCreateObjectActionName_5017Parser() {
		if (createObjectActionCreateObjectActionName_5017Parser == null) {
			createObjectActionCreateObjectActionName_5017Parser = createCreateObjectActionCreateObjectActionName_5017Parser();
		}
		return createObjectActionCreateObjectActionName_5017Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCreateObjectActionCreateObjectActionName_5017Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser callBehaviorActionCallBehaviorActionName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getCallBehaviorActionCallBehaviorActionName_5018Parser() {
		if (callBehaviorActionCallBehaviorActionName_5018Parser == null) {
			callBehaviorActionCallBehaviorActionName_5018Parser = createCallBehaviorActionCallBehaviorActionName_5018Parser();
		}
		return callBehaviorActionCallBehaviorActionName_5018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCallBehaviorActionCallBehaviorActionName_5018Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser callOperationActionCallOperationActionName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getCallOperationActionCallOperationActionName_5019Parser() {
		if (callOperationActionCallOperationActionName_5019Parser == null) {
			callOperationActionCallOperationActionName_5019Parser = createCallOperationActionCallOperationActionName_5019Parser();
		}
		return callOperationActionCallOperationActionName_5019Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCallOperationActionCallOperationActionName_5019Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser addStructuralFeatureValueActionAddStructuralFeatureValueActionName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getAddStructuralFeatureValueActionAddStructuralFeatureValueActionName_5020Parser() {
		if (addStructuralFeatureValueActionAddStructuralFeatureValueActionName_5020Parser == null) {
			addStructuralFeatureValueActionAddStructuralFeatureValueActionName_5020Parser = createAddStructuralFeatureValueActionAddStructuralFeatureValueActionName_5020Parser();
		}
		return addStructuralFeatureValueActionAddStructuralFeatureValueActionName_5020Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAddStructuralFeatureValueActionAddStructuralFeatureValueActionName_5020Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser opaqueBehaviorOpaqueBehaviorName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getOpaqueBehaviorOpaqueBehaviorName_5029Parser() {
		if (opaqueBehaviorOpaqueBehaviorName_5029Parser == null) {
			opaqueBehaviorOpaqueBehaviorName_5029Parser = createOpaqueBehaviorOpaqueBehaviorName_5029Parser();
		}
		return opaqueBehaviorOpaqueBehaviorName_5029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOpaqueBehaviorOpaqueBehaviorName_5029Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser activityParameterNodeActivityParameterNodeName_5031Parser;

	/**
	 * @generated
	 */
	private IParser getActivityParameterNodeActivityParameterNodeName_5031Parser() {
		if (activityParameterNodeActivityParameterNodeName_5031Parser == null) {
			activityParameterNodeActivityParameterNodeName_5031Parser = createActivityParameterNodeActivityParameterNodeName_5031Parser();
		}
		return activityParameterNodeActivityParameterNodeName_5031Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createActivityParameterNodeActivityParameterNodeName_5031Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser literalStringLiteralString_3049Parser;

	/**
	 * @generated
	 */
	private IParser getLiteralStringLiteralString_3049Parser() {
		if (literalStringLiteralString_3049Parser == null) {
			literalStringLiteralString_3049Parser = createLiteralStringLiteralString_3049Parser();
		}
		return literalStringLiteralString_3049Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createLiteralStringLiteralString_3049Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getLiteralString_Value());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser literalStringLiteralString_3051Parser;

	/**
	 * @generated
	 */
	private IParser getLiteralStringLiteralString_3051Parser() {
		if (literalStringLiteralString_3051Parser == null) {
			literalStringLiteralString_3051Parser = createLiteralStringLiteralString_3051Parser();
		}
		return literalStringLiteralString_3051Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createLiteralStringLiteralString_3051Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getLiteralString_Value());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser activityActivityName_5030Parser;

	/**
	 * @generated
	 */
	private IParser getActivityActivityName_5030Parser() {
		if (activityActivityName_5030Parser == null) {
			activityActivityName_5030Parser = createActivityActivityName_5030Parser();
		}
		return activityActivityName_5030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createActivityActivityName_5030Parser() {
		UMLStructuralFeatureParser parser = new UMLStructuralFeatureParser(UMLPackage.eINSTANCE.getNamedElement_Name());
		parser.setViewPattern("{0}");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case OpaqueActionNameEditPart.VISUAL_ID:
			return getOpaqueActionOpaqueActionName_5023Parser();
		case OutputPinNameEditPart.VISUAL_ID:
			return getOutputPinOutputPinName_5003Parser();
		case PinNameEditPart.VISUAL_ID:
			return getPinPinName_5024Parser();
		case CreateObjectActionNameEditPart.VISUAL_ID:
			return getCreateObjectActionCreateObjectActionName_5025Parser();
		case OutputPinName2EditPart.VISUAL_ID:
			return getOutputPinOutputPinName_5004Parser();
		case AddStructuralFeatureValueActionNameEditPart.VISUAL_ID:
			return getAddStructuralFeatureValueActionAddStructuralFeatureValueActionName_5026Parser();
		case InputPinNameEditPart.VISUAL_ID:
			return getInputPinInputPinName_5006Parser();
		case InputPinName2EditPart.VISUAL_ID:
			return getInputPinInputPinName_5007Parser();
		case InputPinName3EditPart.VISUAL_ID:
			return getInputPinInputPinName_5008Parser();
		case CallBehaviorActionNameEditPart.VISUAL_ID:
			return getCallBehaviorActionCallBehaviorActionName_5027Parser();
		case OutputPinName3EditPart.VISUAL_ID:
			return getOutputPinOutputPinName_5010Parser();
		case InputPinName4EditPart.VISUAL_ID:
			return getInputPinInputPinName_5011Parser();
		case CallOperationActionNameEditPart.VISUAL_ID:
			return getCallOperationActionCallOperationActionName_5028Parser();
		case InputPinName5EditPart.VISUAL_ID:
			return getInputPinInputPinName_5013Parser();
		case OpaqueActionName2EditPart.VISUAL_ID:
			return getOpaqueActionOpaqueActionName_5015Parser();
		case PinName2EditPart.VISUAL_ID:
			return getPinPinName_5016Parser();
		case CreateObjectActionName2EditPart.VISUAL_ID:
			return getCreateObjectActionCreateObjectActionName_5017Parser();
		case CallBehaviorActionName2EditPart.VISUAL_ID:
			return getCallBehaviorActionCallBehaviorActionName_5018Parser();
		case CallOperationActionName2EditPart.VISUAL_ID:
			return getCallOperationActionCallOperationActionName_5019Parser();
		case AddStructuralFeatureValueActionName2EditPart.VISUAL_ID:
			return getAddStructuralFeatureValueActionAddStructuralFeatureValueActionName_5020Parser();
		case OpaqueBehaviorNameEditPart.VISUAL_ID:
			return getOpaqueBehaviorOpaqueBehaviorName_5029Parser();
		case ActivityParameterNodeNameEditPart.VISUAL_ID:
			return getActivityParameterNodeActivityParameterNodeName_5031Parser();
		case LiteralStringEditPart.VISUAL_ID:
			return getLiteralStringLiteralString_3049Parser();
		case LiteralString2EditPart.VISUAL_ID:
			return getLiteralStringLiteralString_3051Parser();
		case ActivityNameEditPart.VISUAL_ID:
			return getActivityActivityName_5030Parser();
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
