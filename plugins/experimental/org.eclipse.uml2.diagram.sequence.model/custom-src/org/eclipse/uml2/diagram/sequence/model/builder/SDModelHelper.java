package org.eclipse.uml2.diagram.sequence.model.builder;

import org.eclipse.uml2.diagram.sequence.model.sequenced.SDAbstractMessage;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBehaviorSpec;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracket;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracketContainer;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDExecution;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrame;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDGate;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessage;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessageEnd;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDInvocation;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLineElement;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDMessage;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDSimpleNode;
import org.eclipse.uml2.diagram.sequence.model.sequenced.util.SDSwitch;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.Lifeline;


public class SDModelHelper {
	public static final SDGate findGate(SDFrame frame, Gate umlGate){
		for (SDGate next : frame.getGates()){
			if (umlGate == next.getUmlGate()){
				return next;
			}
		}
		return null;
	}
	
	public static SDLifeLine findLifeline(SDBracketContainer bracketContainer){
		while (bracketContainer instanceof SDBehaviorSpec){
			bracketContainer = ((SDBehaviorSpec)bracketContainer).getBracketContainer();
		}
		return bracketContainer instanceof SDLifeLine ? (SDLifeLine)bracketContainer : null;
	}
	
	public static SDLifeLine findLifeline(SDFrame frame, Lifeline umlLifeline){
		for (SDLifeLine next : frame.getLifelines()){
			if (umlLifeline == next.getUmlLifeline()){
				return next;
			}
		}
		return null;
	}
	
	public static final SDSwitch<Element> UML_ELEMENT_EXTRACTOR = new SDSwitch<Element>(){

		@Override
		public Element caseSDAbstractMessage(SDAbstractMessage object) {
			return object.getUmlMessage();
		}

		@Override
		public Element caseSDBehaviorSpec(SDBehaviorSpec object) {
			return object.getUmlExecutionSpec();
		}

		@Override
		public Element caseSDFrame(SDFrame object) {
			return object.getUmlInteraction();
		}

		@Override
		public Element caseSDGate(SDGate object) {
			return object.getUmlGate();
		}

		@Override
		public Element caseSDGateMessageEnd(SDGateMessageEnd object) {
			return object.getUmlMessageEnd();
		}

		@Override
		public Element caseSDLifeLine(SDLifeLine object) {
			return object.getUmlLifeline();
		}

		@Override
		public Element caseSDSimpleNode(SDSimpleNode object) {
			return object.getUmlFragment();
		}
		
	};
			
			
	
}
