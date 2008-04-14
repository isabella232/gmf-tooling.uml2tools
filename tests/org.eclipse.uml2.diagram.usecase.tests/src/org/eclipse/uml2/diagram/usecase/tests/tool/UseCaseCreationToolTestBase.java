package org.eclipse.uml2.diagram.usecase.tests.tool;

import org.eclipse.uml2.diagram.common.tests.UMLDiagramFacade;
import org.eclipse.uml2.diagram.common.tool.CreationToolTestBase;

public class UseCaseCreationToolTestBase extends CreationToolTestBase {

	public UseCaseCreationToolTestBase(String name) {
		super(name);
	}

	@Override
	protected UMLDiagramFacade getDiagram(String projectPath) {
		return new org.eclipse.uml2.diagram.usecase.tests.UseCaseDiagramFacade(projectPath);
	}

}
