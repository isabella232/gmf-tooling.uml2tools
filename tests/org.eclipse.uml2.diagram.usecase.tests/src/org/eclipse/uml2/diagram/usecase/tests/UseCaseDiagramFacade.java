package org.eclipse.uml2.diagram.usecase.tests;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.diagram.common.tests.UMLDiagramFacade;
import org.eclipse.uml2.diagram.usecase.part.UMLDiagramEditorUtil;
import org.eclipse.uml2.uml.UMLPackage;


public class UseCaseDiagramFacade extends UMLDiagramFacade {

	public UseCaseDiagramFacade(String path) {
		super(path, DIAGRAM_FILE_EXTENSION);
	}

	@Override
	protected Resource createDiagram(URI diagramModelURI, URI domainModelURI) {
		return UMLDiagramEditorUtil.createDiagram(//
				diagramModelURI, domainModelURI, 
				UMLPackage.eINSTANCE.getPackage(), 
				"UTF-8", new NullProgressMonitor());
	}
	
	public static final String DIAGRAM_FILE_EXTENSION = "umlusecase_diagram";

}
