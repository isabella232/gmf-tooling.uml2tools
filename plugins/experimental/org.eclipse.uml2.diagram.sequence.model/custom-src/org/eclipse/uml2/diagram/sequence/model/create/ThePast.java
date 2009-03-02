package org.eclipse.uml2.diagram.sequence.model.create;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.uml2.diagram.sequence.model.sequenced.SDExecution;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDInvocation;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.InteractionFragment;


public class ThePast {
	private final List<InteractionFragment> myPastFragments = new ArrayList<InteractionFragment>(5);
	
	public ThePast(){
		//
	}
	
	public ListIterator<InteractionFragment> getAfterThePastPosition(List<InteractionFragment> fragmentsList) {
		if (myPastFragments.isEmpty()) {
			return fragmentsList.listIterator();
		}

		HashSet<InteractionFragment> notFound = new HashSet<InteractionFragment>();
		for (InteractionFragment next : myPastFragments) {
			if (next == null) {
				continue;
			}
			notFound.add(next);
		}

		ListIterator<InteractionFragment> result = fragmentsList.listIterator();
		while (!notFound.isEmpty() && result.hasNext()) {
			InteractionFragment next = result.next();
			notFound.remove(next);
		}
		return result;
	}

	public void executionStarted(SDExecution sdExecution) {
		ExecutionSpecification umlExecution = sdExecution.getUmlExecutionSpec();
		considerAsPast(umlExecution);
		considerAsPast(umlExecution.getStart());

		SDInvocation sdParentInvocation = sdExecution.getInvocation();
		if (sdParentInvocation != null) {
			considerAsPast(sdParentInvocation.getUmlExecutionSpec());
			considerAsPast(sdParentInvocation.getUmlStart());
		}
	}

	protected void fragmentFinished(InteractionFragment fragment) {
		considerAsPast(fragment);
		if (fragment instanceof ExecutionSpecification) {
			considerAsPast(((ExecutionSpecification) fragment).getFinish());
		}
	}

	protected void considerAsPast(InteractionFragment fragment) {
		if (fragment != null) {
			myPastFragments.add(fragment);
		}
	}

}
