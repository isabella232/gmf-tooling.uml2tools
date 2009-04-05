package org.eclipse.uml2.diagram.profile.tests;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.diagram.common.tests.UMLDiagramFacade;
import org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorUtil;
import org.eclipse.uml2.uml.UMLPackage;

public class ProfileDiagramFacade extends UMLDiagramFacade {

	public ProfileDiagramFacade(String path) {
		super(path, DIAGRAM_FILE_EXTENSION);
	}

	@Override
	protected Resource createDiagram(URI diagramModelURI, URI domainModelURI) {
		return UMLDiagramEditorUtil.createDiagram(diagramModelURI, domainModelURI, //
				UMLPackage.eINSTANCE.getProfile().getName(), // 
				"UTF-8", new NullProgressMonitor());
	}

	public static final String DIAGRAM_FILE_EXTENSION = "umlprofile_diagram";

}
