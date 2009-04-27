package org.eclipse.uml2.diagram.component.tests;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.diagram.common.tests.UMLDiagramFacade;
import org.eclipse.uml2.diagram.component.part.UMLDiagramEditorUtil;
import org.eclipse.uml2.uml.UMLPackage;

public class ComponentDiagramFacade extends UMLDiagramFacade {

	public ComponentDiagramFacade(String path) {
		super(path, DIAGRAM_FILE_EXTENSION);
	}

	@Override
	protected Resource createDiagram(URI diagramModelURI, URI domainModelURI) {
		return UMLDiagramEditorUtil.createDiagram(//
				diagramModelURI, domainModelURI, 
				UMLPackage.eINSTANCE.getPackage(), 
				"UTF-8", new NullProgressMonitor());
	}
	
	public static final String DIAGRAM_FILE_EXTENSION = "umlcomponent_diagram";

}
