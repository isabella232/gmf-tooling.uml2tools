package org.eclipse.uml2.diagram.csd.tests.tool;

import org.eclipse.uml2.diagram.common.tests.UMLDiagramFacade;
import org.eclipse.uml2.diagram.common.tool.CreationToolTestBase;
import org.eclipse.uml2.diagram.csd.tests.CSDiagramFacade;


public class CSDCreationToolTestBase extends CreationToolTestBase {

	public CSDCreationToolTestBase(String name) {
		super(name);
	}

	@Override
	protected UMLDiagramFacade getDiagram(String projectPath) {
		return new CSDiagramFacade(projectPath);
	}

}
