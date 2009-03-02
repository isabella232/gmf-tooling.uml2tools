package org.eclipse.uml2.diagram.sequence.model.create;

import org.eclipse.uml2.diagram.sequence.model.sequenced.SDExecution;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDInvocation;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.InteractionFragment;


public class InsertFragmentAfter extends InsertAfter<InteractionFragment> {
	
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

}
