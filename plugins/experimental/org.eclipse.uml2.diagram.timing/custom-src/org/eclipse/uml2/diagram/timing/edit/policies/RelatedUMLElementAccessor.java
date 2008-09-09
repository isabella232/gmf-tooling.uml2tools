package org.eclipse.uml2.diagram.timing.edit.policies;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.uml2.diagram.timing.model.timingd.DBlock;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrame;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrameContainer;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentMiddlePoint;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart;
import org.eclipse.uml2.diagram.timing.model.timingd.util.TimingDSwitch;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Lifeline;


public class RelatedUMLElementAccessor extends TimingDSwitch<List<Element>> {

	@Override
	public List<Element> caseDBlock(DBlock object) {
		List<Element> result = new LinkedList<Element>();
		Lifeline lifeline = object.getLifeline();
		result.add(lifeline);
		if (lifeline != null){
			result.addAll(lifeline.getCoveredBys());
		}
		return result;
	}

	@Override
	public List<Element> caseDFrame(DFrame object) {
		return Collections.<Element>singletonList(object.getInteraction());
	}

	@Override
	public List<Element> caseDFrameContainer(DFrameContainer object) {
		return Collections.<Element>singletonList(object.getPakkage());
	}

	@Override
	public List<Element> caseDSegmentMiddlePoint(DSegmentMiddlePoint object) {
		return Collections.<Element>singletonList(object.getOccurrence());
	}

	@Override
	public List<Element> caseDSegmentStart(DSegmentStart object) {
		// TODO Auto-generated method stub
		return super.caseDSegmentStart(object);
	}
	
}
