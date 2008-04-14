package org.eclipse.uml2.diagram.component.tests.tool;

import org.eclipse.uml2.diagram.common.tests.UMLDiagramFacade;
import org.eclipse.uml2.diagram.common.tool.CreationToolTestBase;

public class ComponentDCreationToolTestBase extends CreationToolTestBase {

	public ComponentDCreationToolTestBase(String name) {
		super(name);
	}

	@Override
	protected UMLDiagramFacade getDiagram(String projectPath) {
		return new org.eclipse.uml2.diagram.component.tests.ComponentDiagramFacade(projectPath);
	}

}
