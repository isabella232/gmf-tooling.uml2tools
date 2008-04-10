package org.eclipse.uml2.diagram.activity.tests;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorUtil;
import org.eclipse.uml2.diagram.common.tests.UMLDiagramFacade;


public class ActivityDiagramFacade extends UMLDiagramFacade {

	public ActivityDiagramFacade(String path) {
		super(path, DIAGRAM_FILE_EXTENSION);
	}

	@Override
	protected Resource createDiagram(URI diagramModelURI, URI domainModelURI) {
		return UMLDiagramEditorUtil.createDiagram(diagramModelURI, domainModelURI, new NullProgressMonitor());
	}
	
	private static final String DIAGRAM_FILE_EXTENSION = "umlactivity_diagram"; //$NON-NLS-1$


}
