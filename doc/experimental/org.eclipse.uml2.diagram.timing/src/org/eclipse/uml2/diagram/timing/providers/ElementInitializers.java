package org.eclipse.uml2.diagram.timing.providers;

import org.eclipse.uml2.diagram.timing.expressions.TimingDOCLFactory;
import org.eclipse.uml2.diagram.timing.model.timingd.DBlock;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrame;
import org.eclipse.uml2.diagram.timing.model.timingd.DValueLine;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;
import org.eclipse.uml2.diagram.timing.part.TimingDDiagramEditorPlugin;

/**
 * @generated
 */

public class ElementInitializers {

	/**
	 * @generated
	 */
	public static void init_DFrame_2001(DFrame instance) {
		try {
			Object value_0 = TimingDOCLFactory
					.getExpression(
							"let base : String = \'Interaction\' in\r\nlet suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\'} in \r\nlet space : DFrameContainer = self.container in\r\nlet allMissed : Sequence(String) = suffixes->\r\n    select(s : String | not space.frames->exists(e : DFrame | e.displayName = base.concat(s))\r\n    ) in\r\nlet firstMissed : String = allMissed->first() in \r\nlet noMisses : Boolean = firstMissed.oclIsUndefined() in\r\nlet allNames : Set(String) = \r\n    if noMisses \r\n    then \r\n    space.frames->collect(e : DFrame | \r\n         if e = self or e.displayName.oclIsUndefined() or e.displayName.substring(1, e.displayName.size().min(base.size())) <> base\r\n         then \'\' \r\n         else e.displayName \r\n         endif)->asSet()->excluding(\'\') else Set{\'not in use\'} \r\n    endif in \r\nlet longestName : String = \r\n    if noMisses\r\n    then allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first() \r\n    else \'not in use\' \r\n    endif in \r\nif noMisses then \r\n    if longestName.oclIsUndefined() \r\n    then base \r\n    else longestName.concat(\'1\') \r\n    endif \r\nelse \r\n    base.concat(firstMissed) \r\nendif ",
							TimingDPackage.eINSTANCE.getDFrame()).evaluate(instance);
			instance.setDisplayName((String) value_0);
		} catch (RuntimeException e) {
			TimingDDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_DBlock_3001(DBlock instance) {
		try {
			Object value_0 = TimingDOCLFactory
					.getExpression(
							"let base : String = \'\' in\r\nlet suffixes : Sequence(String) = Sequence {\'a\', \'b\', \'c\', \'d\', \'e\', \'f\', \'g\', \'h\', \'i\', \'k\', \'l\'} in \r\nlet space : DFrame = self.frame in\r\nlet allMissed : Sequence(String) = suffixes->\r\n    select(s : String | not space.blocks->exists(e : DBlock | e.displayName = base.concat(s))\r\n    ) in\r\nlet firstMissed : String = allMissed->first() in \r\nlet noMisses : Boolean = firstMissed.oclIsUndefined() in\r\nlet allNames : Set(String) = \r\n    if noMisses \r\n    then \r\n    space.blocks->collect(e : DBlock | \r\n         if e = self or e.displayName.oclIsUndefined() or e.displayName.substring(1, e.displayName.size().min(base.size())) <> base\r\n         then \'\' \r\n         else e.displayName \r\n         endif)->asSet()->excluding(\'\') else Set{\'not in use\'} \r\n    endif in \r\nlet longestName : String = \r\n    if noMisses\r\n    then allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first() \r\n    else \'not in use\' \r\n    endif in \r\nif noMisses then \r\n    if longestName.oclIsUndefined() \r\n    then base \r\n    else longestName.concat(\'1\') \r\n    endif \r\nelse \r\n    base.concat(firstMissed) \r\nendif ",
							TimingDPackage.eINSTANCE.getDBlock()).evaluate(instance);
			instance.setDisplayName((String) value_0);
		} catch (RuntimeException e) {
			TimingDDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_DValueLine_3002(DValueLine instance) {
		try {
			Object value_0 = TimingDOCLFactory
					.getExpression(
							"let base : String = \'State\' in\r\nlet suffixes : Sequence(String) = Sequence {\'\', \'1\', \'2\', \'3\', \'4\', \'5\', \'6\', \'7\', \'8\', \'9\', \'10\'} in \r\nlet space : DBlock = self.block in\r\nlet allMissed : Sequence(String) = suffixes->\r\n    select(s : String | not space.states->exists(e : DValueLine | e.displayName = base.concat(s))\r\n    ) in\r\nlet firstMissed : String = allMissed->first() in \r\nlet noMisses : Boolean = firstMissed.oclIsUndefined() in\r\nlet allNames : Set(String) = \r\n    if noMisses \r\n    then \r\n    space.states->collect(e : DValueLine | \r\n         if e = self or e.displayName.oclIsUndefined() or e.displayName.substring(1, e.displayName.size().min(base.size())) <> base\r\n         then \'\' \r\n         else e.displayName \r\n         endif)->asSet()->excluding(\'\') else Set{\'not in use\'} \r\n    endif in \r\nlet longestName : String = \r\n    if noMisses\r\n    then allNames->select(n : String | not allNames->exists(nn : String | nn.size() > n.size()))->asSequence()->first() \r\n    else \'not in use\' \r\n    endif in \r\nif noMisses then \r\n    if longestName.oclIsUndefined() \r\n    then base \r\n    else longestName.concat(\'1\') \r\n    endif \r\nelse \r\n    base.concat(firstMissed) \r\nendif ",
							TimingDPackage.eINSTANCE.getDValueLine()).evaluate(instance);
			instance.setDisplayName((String) value_0);
		} catch (RuntimeException e) {
			TimingDDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

}
