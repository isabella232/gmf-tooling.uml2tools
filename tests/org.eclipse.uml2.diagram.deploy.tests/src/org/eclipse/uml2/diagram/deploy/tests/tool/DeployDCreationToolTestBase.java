package org.eclipse.uml2.diagram.deploy.tests.tool;

import org.eclipse.uml2.diagram.common.tests.UMLDiagramFacade;
import org.eclipse.uml2.diagram.common.tool.CreationToolTestBase;
import org.eclipse.uml2.diagram.deploy.tests.DeployDiagramFacade;

public class DeployDCreationToolTestBase extends CreationToolTestBase {

	public DeployDCreationToolTestBase(String name) {
		super(name);
	}

	@Override
	protected UMLDiagramFacade getDiagram(String projectPath) {
		return new DeployDiagramFacade(projectPath);
	}

}
