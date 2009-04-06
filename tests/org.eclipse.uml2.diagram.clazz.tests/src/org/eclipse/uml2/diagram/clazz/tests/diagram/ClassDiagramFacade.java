package org.eclipse.uml2.diagram.clazz.tests.diagram;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramEditorUtil;
import org.eclipse.uml2.diagram.common.tests.UMLDiagramFacade;
import org.eclipse.uml2.uml.UMLPackage;


public class ClassDiagramFacade extends UMLDiagramFacade {

	public ClassDiagramFacade(String path) {
		super(path, DIAGRAM_FILE_EXTENSION);
	}

	@Override
	protected Resource createDiagram(URI diagramModelURI, URI domainModelURI) {
		return UMLDiagramEditorUtil.createDiagram(//
				diagramModelURI, domainModelURI, 
				UMLPackage.eINSTANCE.getPackage(), 
				"UTF-8", new NullProgressMonitor());
	}
	
	private static final String DIAGRAM_FILE_EXTENSION = "umlclass_diagram";


}
