package org.eclipse.uml2.diagram.timing.edit.policies.create;

import org.eclipse.uml2.diagram.timing.model.timingd.DBlock;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegment;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentEnd;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart;
import org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch;
import org.eclipse.uml2.diagram.timing.model.timingd.DValueLine;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDFactory;


public class SemanticHelper {
	public static DStateSwitch createSemanticSwitch(DSegmentEnd from, DSegmentStart to){
		DSegment fromSegment = from.getSegment();
		DSegment toSegment = to.getSegment();
		
		DValueLine fromState = fromSegment.getState();
		DValueLine toState = toSegment.getState();
		
		DBlock block = fromState.getBlock(); 
		if (block != toState.getBlock()){
			throw new IllegalStateException("Switch can't cross the block boundaries: from: " + from + ", to: " + to);
		}
		
		DStateSwitch newSwitch = TimingDFactory.eINSTANCE.createDStateSwitch();
		reconnectSource(newSwitch, from);
		reconnectTarget(newSwitch, to);
		block.getSwitches().add(newSwitch);
		
		return newSwitch;
	}
	
	public static void reconnectSource(DStateSwitch stateSwitch, DSegmentEnd newSource){
		DSegmentEnd currentSource = stateSwitch.getFromSegmentEnd(); 
		if (currentSource != null && currentSource.equals(newSource)){
			return;
		}
		
		stateSwitch.setFromSegmentEnd(newSource);
		stateSwitch.setFromSegment(newSource.getSegment());
		stateSwitch.setFromValueLine(newSource.getSegment().getState());
	}
	
	public static void reconnectTarget(DStateSwitch stateSwitch, DSegmentStart newTarget){
		DSegmentStart currentTarget = stateSwitch.getToSegmentStart(); 
		if (currentTarget != null && currentTarget.equals(newTarget)){
			return;
		}
		
		stateSwitch.setToSegmentStart(newTarget);
		stateSwitch.setToSegment(newTarget.getSegment());
		stateSwitch.setToValueLine(newTarget.getSegment().getState());
	}

}
