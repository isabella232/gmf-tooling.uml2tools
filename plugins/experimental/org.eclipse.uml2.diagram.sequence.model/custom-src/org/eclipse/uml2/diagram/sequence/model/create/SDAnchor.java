package org.eclipse.uml2.diagram.sequence.model.create;

import java.util.List;

import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracket;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracketContainer;


public class SDAnchor {
	private final SDBracket myAnchor;
	private final boolean myIsBeforeNotAfterAnchor;

	public SDAnchor(SDBracket anchor, boolean isBeforeNotAfterAnchor){
		myAnchor = anchor;
		myIsBeforeNotAfterAnchor = isBeforeNotAfterAnchor;
	}
	
	public boolean isBeforeNotAfterAnchor() {
		return myIsBeforeNotAfterAnchor;
	}
	
	public SDBracket getAnchor() {
		return myAnchor;
	}
	
	public static SDAnchor after(SDBracket bracket){
		return new SDAnchor(bracket, false);
	}
	
	public static SDAnchor firstChildFor(SDBracketContainer container){
		return container.getBrackets().isEmpty() ? theOnlyChildFor(container) : new SDAnchor(container.getBrackets().get(0), true);
	}
	
	public static SDAnchor lastChildFor(SDBracketContainer container){
		List<SDBracket> brackets = container.getBrackets(); 
		return brackets.isEmpty() ? theOnlyChildFor(container) : after(brackets.get(brackets.size() - 1));
	}
	
	private static SDAnchor theOnlyChildFor(SDBracketContainer container){
		if (!container.getBrackets().isEmpty()){
			throw new IllegalArgumentException("Container already has brackets " + container);
		}
		//kinda legitimate anchor, everything should work
		return null;
	}
	
}
