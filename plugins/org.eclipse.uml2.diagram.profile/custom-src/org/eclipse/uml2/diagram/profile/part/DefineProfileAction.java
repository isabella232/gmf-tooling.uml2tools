package org.eclipse.uml2.diagram.profile.part;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Profile;

public class DefineProfileAction extends ProfileModelAction {

	@Override
	protected String getActionLabel() {
		return "Define Profile";
	}

	@Override
	protected void runInModel(EObject selected) {
		Profile profile = (Profile)selected;
		if (!profile.isDefined()) {
			profile.define();
		}
	}
}
