package org.eclipse.uml2.diagram.profile.tests.tool;

import org.eclipse.uml2.diagram.common.tests.UMLDiagramFacade;
import org.eclipse.uml2.diagram.common.tool.CreationToolTestBase;

public class ProfileDCreationToolTestBase extends CreationToolTestBase {

	public ProfileDCreationToolTestBase(String name) {
		super(name);
	}

	@Override
	protected UMLDiagramFacade getDiagram(String projectPath) {
		return new org.eclipse.uml2.diagram.profile.tests.ProfileDiagramFacade(projectPath);
	}

}
