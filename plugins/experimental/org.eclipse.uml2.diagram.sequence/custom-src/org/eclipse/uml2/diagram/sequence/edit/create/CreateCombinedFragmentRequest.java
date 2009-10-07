package org.eclipse.uml2.diagram.sequence.edit.create;

import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDCombinedFragment;

public class CreateCombinedFragmentRequest extends CreateSDElementRequest {
	private SDCombinedFragment myFragmentToTie;
	private Node myFragmentToTieView;

	public CreateCombinedFragmentRequest(PreferencesHint preferencesHint){
		super(preferencesHint);
	}
	
	public void setCombinedFragmentToTie(SDCombinedFragment fragmentToTie, Node fragmentToTieView){
		myFragmentToTie = fragmentToTie;
		myFragmentToTieView = fragmentToTieView;
	}
	
	public boolean isTieRequest(){
		return myFragmentToTie != null;
	}
	
	public SDCombinedFragment getFragmentToTie() {
		return myFragmentToTie;
	}
	
	public Node getFragmentToTieView() {
		return myFragmentToTieView;
	}
}
