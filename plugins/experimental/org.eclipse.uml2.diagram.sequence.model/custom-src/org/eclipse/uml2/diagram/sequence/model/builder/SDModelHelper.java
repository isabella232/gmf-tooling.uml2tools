package org.eclipse.uml2.diagram.sequence.model.builder;

import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBehaviorSpec;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracketContainer;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrame;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDGate;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine;
import org.eclipse.uml2.uml.Gate;


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
	
}
