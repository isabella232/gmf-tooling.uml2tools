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
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionName4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityParameterNodeNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartitionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartitionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeName4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeOrdering2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeOrderingEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ControlFlowName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ControlFlowNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeName4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinName4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinName5EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinName6EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LiteralString2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LiteralStringEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectFlowName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectFlowNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueBehaviorNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinName4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.SendSignalActionNameEditPart;
import org.eclipse.uml2.diagram.activity.parser.ActivityEdgeWeightParser;
import org.eclipse.uml2.diagram.activity.parser.ObjectNodeAttributesParser;
import org.eclipse.uml2.diagram.activity.parser.ObjectNodeInStateParser;
import org.eclipse.uml2.diagram.activity.parser.ObjectNodeTypeParser;
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser acceptEventActionName_5040Parser;

	/**
	 * @generated
	 */
	private IParser getAcceptEventActionName_5040Parser() {
		if (acceptEventActionName_5040Parser == null) {
			acceptEventActionName_5040Parser = createAcceptEventActionName_5040Parser();
		}
		return acceptEventActionName_5040Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAcceptEventActionName_5040Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser acceptEventActionName_5042Parser;

	/**
	 * @generated
	 */
	private IParser getAcceptEventActionName_5042Parser() {
		if (acceptEventActionName_5042Parser == null) {
			acceptEventActionName_5042Parser = createAcceptEventActionName_5042Parser();
		}
		return acceptEventActionName_5042Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAcceptEventActionName_5042Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dataStoreNodeName_5034Parser;

	/**
	 * @generated
	 */
	private IParser getDataStoreNodeName_5034Parser() {
		if (dataStoreNodeName_5034Parser == null) {
			dataStoreNodeName_5034Parser = createDataStoreNodeName_5034Parser();
		}
		return dataStoreNodeName_5034Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createDataStoreNodeName_5034Parser() {
		return new ObjectNodeTypeParser();
	}

	/**
	 * @generated
	 */
	private IParser dataStoreNodeName_5036Parser;

	/**
	 * @generated
	 */
	private IParser getDataStoreNodeName_5036Parser() {
		if (dataStoreNodeName_5036Parser == null) {
			dataStoreNodeName_5036Parser = createDataStoreNodeName_5036Parser();
		}
		return dataStoreNodeName_5036Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createDataStoreNodeName_5036Parser() {
		return new ObjectNodeInStateParser();
	}

	/**
	 * @generated
	 */
	private IParser centralBufferNodeName_5032Parser;

	/**
	 * @generated
	 */
	private IParser getCentralBufferNodeName_5032Parser() {
		if (centralBufferNodeName_5032Parser == null) {
			centralBufferNodeName_5032Parser = createCentralBufferNodeName_5032Parser();
		}
		return centralBufferNodeName_5032Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createCentralBufferNodeName_5032Parser() {
		return new ObjectNodeTypeParser();
	}

	/**
	 * @generated
	 */
	private IParser centralBufferNodeName_5038Parser;

	/**
	 * @generated
	 */
	private IParser getCentralBufferNodeName_5038Parser() {
		if (centralBufferNodeName_5038Parser == null) {
			centralBufferNodeName_5038Parser = createCentralBufferNodeName_5038Parser();
		}
		return centralBufferNodeName_5038Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createCentralBufferNodeName_5038Parser() {
		return new ObjectNodeInStateParser();
	}

	/**
	 * @generated
	 */
	private IParser centralBufferNodeOrdering_5049Parser;

	/**
	 * @generated
	 */
	private IParser getCentralBufferNodeOrdering_5049Parser() {
		if (centralBufferNodeOrdering_5049Parser == null) {
			centralBufferNodeOrdering_5049Parser = createCentralBufferNodeOrdering_5049Parser();
		}
		return centralBufferNodeOrdering_5049Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createCentralBufferNodeOrdering_5049Parser() {
		return new ObjectNodeAttributesParser();
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
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
	 * @generated NOT
	 */
	protected IParser createOutputPinName_5003Parser() {
		return new ObjectNodeTypeParser();
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
	 * @generated NOT
	 */
	protected IParser createPinName_5024Parser() {
		return new ObjectNodeTypeParser();
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
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
	 * @generated NOT
	 */
	protected IParser createOutputPinName_5004Parser() {
		return new ObjectNodeTypeParser();
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
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
	 * @generated NOT
	 */
	protected IParser createInputPinName_5006Parser() {
		return new ObjectNodeTypeParser();
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
	 * @generated NOT
	 */
	protected IParser createInputPinName_5007Parser() {
		return new ObjectNodeTypeParser();
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
	 * @generated NOT
	 */
	protected IParser createInputPinName_5008Parser() {
		return new ObjectNodeTypeParser();
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
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
	 * @generated NOT
	 */
	protected IParser createOutputPinName_5010Parser() {
		return new ObjectNodeTypeParser();
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
	 * @generated NOT
	 */
	protected IParser createInputPinName_5011Parser() {
		return new ObjectNodeTypeParser();
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
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
	 * @generated NOT
	 */
	protected IParser createInputPinName_5013Parser() {
		return new ObjectNodeTypeParser();
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser acceptEventActionName_5041Parser;

	/**
	 * @generated
	 */
	private IParser getAcceptEventActionName_5041Parser() {
		if (acceptEventActionName_5041Parser == null) {
			acceptEventActionName_5041Parser = createAcceptEventActionName_5041Parser();
		}
		return acceptEventActionName_5041Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAcceptEventActionName_5041Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser acceptEventActionName_5043Parser;

	/**
	 * @generated
	 */
	private IParser getAcceptEventActionName_5043Parser() {
		if (acceptEventActionName_5043Parser == null) {
			acceptEventActionName_5043Parser = createAcceptEventActionName_5043Parser();
		}
		return acceptEventActionName_5043Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createAcceptEventActionName_5043Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
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
	 * @generated NOT
	 */
	protected IParser createPinName_5016Parser() {
		return new ObjectNodeTypeParser();
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dataStoreNodeName_5035Parser;

	/**
	 * @generated
	 */
	private IParser getDataStoreNodeName_5035Parser() {
		if (dataStoreNodeName_5035Parser == null) {
			dataStoreNodeName_5035Parser = createDataStoreNodeName_5035Parser();
		}
		return dataStoreNodeName_5035Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createDataStoreNodeName_5035Parser() {
		return new ObjectNodeTypeParser();
	}

	/**
	 * @generated
	 */
	private IParser dataStoreNodeName_5037Parser;

	/**
	 * @generated
	 */
	private IParser getDataStoreNodeName_5037Parser() {
		if (dataStoreNodeName_5037Parser == null) {
			dataStoreNodeName_5037Parser = createDataStoreNodeName_5037Parser();
		}
		return dataStoreNodeName_5037Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createDataStoreNodeName_5037Parser() {
		return new ObjectNodeInStateParser();
	}

	/**
	 * @generated
	 */
	private IParser centralBufferNodeName_5033Parser;

	/**
	 * @generated
	 */
	private IParser getCentralBufferNodeName_5033Parser() {
		if (centralBufferNodeName_5033Parser == null) {
			centralBufferNodeName_5033Parser = createCentralBufferNodeName_5033Parser();
		}
		return centralBufferNodeName_5033Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createCentralBufferNodeName_5033Parser() {
		return new ObjectNodeTypeParser();
	}

	/**
	 * @generated
	 */
	private IParser centralBufferNodeName_5039Parser;

	/**
	 * @generated
	 */
	private IParser getCentralBufferNodeName_5039Parser() {
		if (centralBufferNodeName_5039Parser == null) {
			centralBufferNodeName_5039Parser = createCentralBufferNodeName_5039Parser();
		}
		return centralBufferNodeName_5039Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createCentralBufferNodeName_5039Parser() {
		return new ObjectNodeInStateParser();
	}

	/**
	 * @generated
	 */
	private IParser centralBufferNodeOrdering_5050Parser;

	/**
	 * @generated
	 */
	private IParser getCentralBufferNodeOrdering_5050Parser() {
		if (centralBufferNodeOrdering_5050Parser == null) {
			centralBufferNodeOrdering_5050Parser = createCentralBufferNodeOrdering_5050Parser();
		}
		return centralBufferNodeOrdering_5050Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createCentralBufferNodeOrdering_5050Parser() {
		return new ObjectNodeAttributesParser();
	}

	/**
	 * @generated
	 */
	private IParser inputPinName_5047Parser;

	/**
	 * @generated
	 */
	private IParser getInputPinName_5047Parser() {
		if (inputPinName_5047Parser == null) {
			inputPinName_5047Parser = createInputPinName_5047Parser();
		}
		return inputPinName_5047Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInputPinName_5047Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser outputPinName_5048Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPinName_5048Parser() {
		if (outputPinName_5048Parser == null) {
			outputPinName_5048Parser = createOutputPinName_5048Parser();
		}
		return outputPinName_5048Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOutputPinName_5048Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser sendSignalActionName_5044Parser;

	/**
	 * @generated
	 */
	private IParser getSendSignalActionName_5044Parser() {
		if (sendSignalActionName_5044Parser == null) {
			sendSignalActionName_5044Parser = createSendSignalActionName_5044Parser();
		}
		return sendSignalActionName_5044Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSendSignalActionName_5044Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser activityPartitionName_5045Parser;

	/**
	 * @generated
	 */
	private IParser getActivityPartitionName_5045Parser() {
		if (activityPartitionName_5045Parser == null) {
			activityPartitionName_5045Parser = createActivityPartitionName_5045Parser();
		}
		return activityPartitionName_5045Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createActivityPartitionName_5045Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser activityPartitionName_5046Parser;

	/**
	 * @generated
	 */
	private IParser getActivityPartitionName_5046Parser() {
		if (activityPartitionName_5046Parser == null) {
			activityPartitionName_5046Parser = createActivityPartitionName_5046Parser();
		}
		return activityPartitionName_5046Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createActivityPartitionName_5046Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getLiteralString_Value(), };
		MessageFormatParser parser = new MessageFormatParser(features);
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getLiteralString_Value(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser controlFlowName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getControlFlowName_6003Parser() {
		if (controlFlowName_6003Parser == null) {
			controlFlowName_6003Parser = createControlFlowName_6003Parser();
		}
		return controlFlowName_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createControlFlowName_6003Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser controlFlowName_6005Parser;

	/**
	 * @generated
	 */
	private IParser getControlFlowName_6005Parser() {
		if (controlFlowName_6005Parser == null) {
			controlFlowName_6005Parser = createControlFlowName_6005Parser();
		}
		return controlFlowName_6005Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createControlFlowName_6005Parser() {
		return new ActivityEdgeWeightParser();
	}

	/**
	 * @generated
	 */
	private IParser objectFlowName_6004Parser;

	/**
	 * @generated
	 */
	private IParser getObjectFlowName_6004Parser() {
		if (objectFlowName_6004Parser == null) {
			objectFlowName_6004Parser = createObjectFlowName_6004Parser();
		}
		return objectFlowName_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createObjectFlowName_6004Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser objectFlowName_6006Parser;

	/**
	 * @generated
	 */
	private IParser getObjectFlowName_6006Parser() {
		if (objectFlowName_6006Parser == null) {
			objectFlowName_6006Parser = createObjectFlowName_6006Parser();
		}
		return objectFlowName_6006Parser;
	}

	/**
	 * @generated NOT
	 */
	protected IParser createObjectFlowName_6006Parser() {
		return new ActivityEdgeWeightParser();
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ActivityNameEditPart.VISUAL_ID:
			return getActivityName_5030Parser();
		case AcceptEventActionNameEditPart.VISUAL_ID:
			return getAcceptEventActionName_5040Parser();
		case AcceptEventActionName3EditPart.VISUAL_ID:
			return getAcceptEventActionName_5042Parser();
		case DataStoreNodeNameEditPart.VISUAL_ID:
			return getDataStoreNodeName_5034Parser();
		case DataStoreNodeName2EditPart.VISUAL_ID:
			return getDataStoreNodeName_5036Parser();
		case CentralBufferNodeNameEditPart.VISUAL_ID:
			return getCentralBufferNodeName_5032Parser();
		case CentralBufferNodeName2EditPart.VISUAL_ID:
			return getCentralBufferNodeName_5038Parser();
		case CentralBufferNodeOrderingEditPart.VISUAL_ID:
			return getCentralBufferNodeOrdering_5049Parser();
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
		case AcceptEventActionName2EditPart.VISUAL_ID:
			return getAcceptEventActionName_5041Parser();
		case AcceptEventActionName4EditPart.VISUAL_ID:
			return getAcceptEventActionName_5043Parser();
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
		case DataStoreNodeName3EditPart.VISUAL_ID:
			return getDataStoreNodeName_5035Parser();
		case DataStoreNodeName4EditPart.VISUAL_ID:
			return getDataStoreNodeName_5037Parser();
		case CentralBufferNodeName3EditPart.VISUAL_ID:
			return getCentralBufferNodeName_5033Parser();
		case CentralBufferNodeName4EditPart.VISUAL_ID:
			return getCentralBufferNodeName_5039Parser();
		case CentralBufferNodeOrdering2EditPart.VISUAL_ID:
			return getCentralBufferNodeOrdering_5050Parser();
		case InputPinName6EditPart.VISUAL_ID:
			return getInputPinName_5047Parser();
		case OutputPinName4EditPart.VISUAL_ID:
			return getOutputPinName_5048Parser();
		case OpaqueBehaviorNameEditPart.VISUAL_ID:
			return getOpaqueBehaviorName_5029Parser();
		case ActivityParameterNodeNameEditPart.VISUAL_ID:
			return getActivityParameterNodeName_5031Parser();
		case SendSignalActionNameEditPart.VISUAL_ID:
			return getSendSignalActionName_5044Parser();
		case ActivityPartitionNameEditPart.VISUAL_ID:
			return getActivityPartitionName_5045Parser();
		case ActivityPartitionName2EditPart.VISUAL_ID:
			return getActivityPartitionName_5046Parser();
		case LiteralStringEditPart.VISUAL_ID:
			return getLiteralString_3049Parser();
		case LiteralString2EditPart.VISUAL_ID:
			return getLiteralString_3051Parser();
		case ControlFlowNameEditPart.VISUAL_ID:
			return getControlFlowName_6003Parser();
		case ControlFlowName2EditPart.VISUAL_ID:
			return getControlFlowName_6005Parser();
		case ObjectFlowNameEditPart.VISUAL_ID:
			return getObjectFlowName_6004Parser();
		case ObjectFlowName2EditPart.VISUAL_ID:
			return getObjectFlowName_6006Parser();
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
