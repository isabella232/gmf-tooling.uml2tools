package org.eclipse.uml2.diagram.statemachine.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.parser.stereotype.AppliedStereotypeParser;
import org.eclipse.uml2.diagram.statemachine.edit.parts.CommentBodyEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.CompositeStateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.CompositeStateStereotypeEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.DoActivityEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.EntryActivityEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.EntryConnectionPointReferenceNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.EntryPointPseudostateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ExitActivityEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ExitConnectionPointReferenceNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ExitPointPseudostateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.FinalStateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.InternalTransitionEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateName2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateName3EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateName4EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateName5EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateName6EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateName7EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateName8EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.RegionName2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.RegionNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.SimpleStateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.SimpleStateStereotypeEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachineNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachineStereotypeEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.SubmachineStateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.SubmachineStateStereotypeEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.TransitionNameEditPart;
import org.eclipse.uml2.diagram.statemachine.parser.SubmachineStateParser;
import org.eclipse.uml2.diagram.statemachine.parser.TransitionParser;
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
	private IParser stateMachineName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getStateMachineName_5011Parser() {
		if (stateMachineName_5011Parser == null) {
			stateMachineName_5011Parser = createStateMachineName_5011Parser();
		}
		return stateMachineName_5011Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createStateMachineName_5011Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser stateMachineQualifiedName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getStateMachineQualifiedName_5012Parser() {
		if (stateMachineQualifiedName_5012Parser == null) {
			stateMachineQualifiedName_5012Parser = new AppliedStereotypeParser();
		}
		return stateMachineQualifiedName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser commentBody_5016Parser;

	/**
	* @generated
	*/
	private IParser getCommentBody_5016Parser() {
		if (commentBody_5016Parser == null) {
			commentBody_5016Parser = createCommentBody_5016Parser();
		}
		return commentBody_5016Parser;
	}

	/**
	* @generated
	*/
	protected IParser createCommentBody_5016Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getComment_Body() };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	* @generated
	*/
	private IParser regionName_5027Parser;

	/**
	* @generated
	*/
	private IParser getRegionName_5027Parser() {
		if (regionName_5027Parser == null) {
			regionName_5027Parser = createRegionName_5027Parser();
		}
		return regionName_5027Parser;
	}

	/**
	* @generated
	*/
	protected IParser createRegionName_5027Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser stateQualifiedName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getStateQualifiedName_5015Parser() {
		if (stateQualifiedName_5015Parser == null) {
			stateQualifiedName_5015Parser = new AppliedStereotypeParser();
		}
		return stateQualifiedName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser behavior_3019Parser;

	/**
	 * @generated
	 */
	private IParser getBehavior_3019Parser() {
		if (behavior_3019Parser == null) {
			behavior_3019Parser = createBehavior_3019Parser();
		}
		return behavior_3019Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBehavior_3019Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("entry / {0}"); //$NON-NLS-1$
		parser.setEditorPattern("entry / {0}"); //$NON-NLS-1$
		parser.setEditPattern("entry / {0}"); //$NON-NLS-1$
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser behavior_3020Parser;

	/**
	 * @generated
	 */
	private IParser getBehavior_3020Parser() {
		if (behavior_3020Parser == null) {
			behavior_3020Parser = createBehavior_3020Parser();
		}
		return behavior_3020Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBehavior_3020Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("exit / {0}"); //$NON-NLS-1$
		parser.setEditorPattern("exit / {0}"); //$NON-NLS-1$
		parser.setEditPattern("exit / {0}"); //$NON-NLS-1$
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser behavior_3021Parser;

	/**
	 * @generated
	 */
	private IParser getBehavior_3021Parser() {
		if (behavior_3021Parser == null) {
			behavior_3021Parser = createBehavior_3021Parser();
		}
		return behavior_3021Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBehavior_3021Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("do / {0}"); //$NON-NLS-1$
		parser.setEditorPattern("do / {0}"); //$NON-NLS-1$
		parser.setEditPattern("do / {0}"); //$NON-NLS-1$
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser stateQualifiedName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getStateQualifiedName_5013Parser() {
		if (stateQualifiedName_5013Parser == null) {
			stateQualifiedName_5013Parser = new AppliedStereotypeParser();
		}
		return stateQualifiedName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser regionName_5026Parser;

	/**
	* @generated
	*/
	private IParser getRegionName_5026Parser() {
		if (regionName_5026Parser == null) {
			regionName_5026Parser = createRegionName_5026Parser();
		}
		return regionName_5026Parser;
	}

	/**
	* @generated
	*/
	protected IParser createRegionName_5026Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private SubmachineStateParser stateName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getStateName_5008Parser() {
		if (stateName_5008Parser == null) {
			stateName_5008Parser = new SubmachineStateParser();
		}
		return stateName_5008Parser;
	}

	/**
	 * @generated
	 */
	private AppliedStereotypeParser stateQualifiedName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getStateQualifiedName_5014Parser() {
		if (stateQualifiedName_5014Parser == null) {
			stateQualifiedName_5014Parser = new AppliedStereotypeParser();
		}
		return stateQualifiedName_5014Parser;
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private TransitionParser transition_3022Parser;

	/**
	 * @generated
	 */
	private IParser getTransition_3022Parser() {
		if (transition_3022Parser == null) {
			transition_3022Parser = new TransitionParser();
		}
		return transition_3022Parser;
	}

	/**
	* @generated
	*/
	private IParser finalStateName_5017Parser;

	/**
	* @generated
	*/
	private IParser getFinalStateName_5017Parser() {
		if (finalStateName_5017Parser == null) {
			finalStateName_5017Parser = createFinalStateName_5017Parser();
		}
		return finalStateName_5017Parser;
	}

	/**
	* @generated
	*/
	protected IParser createFinalStateName_5017Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	* @generated
	*/
	private IParser pseudostateName_5018Parser;

	/**
	* @generated
	*/
	private IParser getPseudostateName_5018Parser() {
		if (pseudostateName_5018Parser == null) {
			pseudostateName_5018Parser = createPseudostateName_5018Parser();
		}
		return pseudostateName_5018Parser;
	}

	/**
	* @generated
	*/
	protected IParser createPseudostateName_5018Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	* @generated
	*/
	private IParser pseudostateName_5019Parser;

	/**
	* @generated
	*/
	private IParser getPseudostateName_5019Parser() {
		if (pseudostateName_5019Parser == null) {
			pseudostateName_5019Parser = createPseudostateName_5019Parser();
		}
		return pseudostateName_5019Parser;
	}

	/**
	* @generated
	*/
	protected IParser createPseudostateName_5019Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	* @generated
	*/
	private IParser pseudostateName_5020Parser;

	/**
	* @generated
	*/
	private IParser getPseudostateName_5020Parser() {
		if (pseudostateName_5020Parser == null) {
			pseudostateName_5020Parser = createPseudostateName_5020Parser();
		}
		return pseudostateName_5020Parser;
	}

	/**
	* @generated
	*/
	protected IParser createPseudostateName_5020Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	* @generated
	*/
	private IParser pseudostateName_5021Parser;

	/**
	* @generated
	*/
	private IParser getPseudostateName_5021Parser() {
		if (pseudostateName_5021Parser == null) {
			pseudostateName_5021Parser = createPseudostateName_5021Parser();
		}
		return pseudostateName_5021Parser;
	}

	/**
	* @generated
	*/
	protected IParser createPseudostateName_5021Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	* @generated
	*/
	private IParser pseudostateName_5022Parser;

	/**
	* @generated
	*/
	private IParser getPseudostateName_5022Parser() {
		if (pseudostateName_5022Parser == null) {
			pseudostateName_5022Parser = createPseudostateName_5022Parser();
		}
		return pseudostateName_5022Parser;
	}

	/**
	* @generated
	*/
	protected IParser createPseudostateName_5022Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	* @generated
	*/
	private IParser pseudostateName_5023Parser;

	/**
	* @generated
	*/
	private IParser getPseudostateName_5023Parser() {
		if (pseudostateName_5023Parser == null) {
			pseudostateName_5023Parser = createPseudostateName_5023Parser();
		}
		return pseudostateName_5023Parser;
	}

	/**
	* @generated
	*/
	protected IParser createPseudostateName_5023Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	* @generated
	*/
	private IParser pseudostateName_5024Parser;

	/**
	* @generated
	*/
	private IParser getPseudostateName_5024Parser() {
		if (pseudostateName_5024Parser == null) {
			pseudostateName_5024Parser = createPseudostateName_5024Parser();
		}
		return pseudostateName_5024Parser;
	}

	/**
	* @generated
	*/
	protected IParser createPseudostateName_5024Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	* @generated
	*/
	private IParser pseudostateName_5025Parser;

	/**
	* @generated
	*/
	private IParser getPseudostateName_5025Parser() {
		if (pseudostateName_5025Parser == null) {
			pseudostateName_5025Parser = createPseudostateName_5025Parser();
		}
		return pseudostateName_5025Parser;
	}

	/**
	* @generated
	*/
	protected IParser createPseudostateName_5025Parser() {
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
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
		EAttribute[] features = new EAttribute[] { UMLPackage.eINSTANCE.getNamedElement_Name() };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private TransitionParser transitionName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionName_6001Parser() {
		if (transitionName_6001Parser == null) {
			transitionName_6001Parser = new TransitionParser();
		}
		return transitionName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case StateMachineNameEditPart.VISUAL_ID:
			return getStateMachineName_5011Parser();
		case StateMachineStereotypeEditPart.VISUAL_ID:
			return getStateMachineQualifiedName_5012Parser();
		case CommentBodyEditPart.VISUAL_ID:
			return getCommentBody_5016Parser();
		case RegionNameEditPart.VISUAL_ID:
			return getRegionName_5027Parser();
		case SimpleStateNameEditPart.VISUAL_ID:
			return getStateName_5001Parser();
		case SimpleStateStereotypeEditPart.VISUAL_ID:
			return getStateQualifiedName_5015Parser();
		case EntryActivityEditPart.VISUAL_ID:
			return getBehavior_3019Parser();
		case ExitActivityEditPart.VISUAL_ID:
			return getBehavior_3020Parser();
		case DoActivityEditPart.VISUAL_ID:
			return getBehavior_3021Parser();
		case CompositeStateNameEditPart.VISUAL_ID:
			return getStateName_5004Parser();
		case CompositeStateStereotypeEditPart.VISUAL_ID:
			return getStateQualifiedName_5013Parser();
		case RegionName2EditPart.VISUAL_ID:
			return getRegionName_5026Parser();
		case SubmachineStateNameEditPart.VISUAL_ID:
			return getStateName_5008Parser();
		case SubmachineStateStereotypeEditPart.VISUAL_ID:
			return getStateQualifiedName_5014Parser();
		case EntryConnectionPointReferenceNameEditPart.VISUAL_ID:
			return getConnectionPointReferenceName_5009Parser();
		case ExitConnectionPointReferenceNameEditPart.VISUAL_ID:
			return getConnectionPointReferenceName_5010Parser();
		case InternalTransitionEditPart.VISUAL_ID:
			return getTransition_3022Parser();
		case FinalStateNameEditPart.VISUAL_ID:
			return getFinalStateName_5017Parser();
		case PseudostateNameEditPart.VISUAL_ID:
			return getPseudostateName_5018Parser();
		case PseudostateName2EditPart.VISUAL_ID:
			return getPseudostateName_5019Parser();
		case PseudostateName3EditPart.VISUAL_ID:
			return getPseudostateName_5020Parser();
		case PseudostateName4EditPart.VISUAL_ID:
			return getPseudostateName_5021Parser();
		case PseudostateName5EditPart.VISUAL_ID:
			return getPseudostateName_5022Parser();
		case PseudostateName6EditPart.VISUAL_ID:
			return getPseudostateName_5023Parser();
		case PseudostateName7EditPart.VISUAL_ID:
			return getPseudostateName_5024Parser();
		case PseudostateName8EditPart.VISUAL_ID:
			return getPseudostateName_5025Parser();
		case EntryPointPseudostateNameEditPart.VISUAL_ID:
			return getPseudostateName_5006Parser();
		case ExitPointPseudostateNameEditPart.VISUAL_ID:
			return getPseudostateName_5007Parser();
		case TransitionNameEditPart.VISUAL_ID:
			return getTransitionName_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
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
	private static class HintAdapter extends ParserHintAdapter {

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
