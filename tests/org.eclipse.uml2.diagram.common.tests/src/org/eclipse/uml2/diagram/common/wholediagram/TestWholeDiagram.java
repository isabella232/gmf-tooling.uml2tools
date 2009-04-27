package org.eclipse.uml2.diagram.common.wholediagram;

import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.tests.UMLProjectFacade;
import org.eclipse.uml2.uml.NamedElement;

public abstract class TestWholeDiagram extends TestCase {

	protected abstract UMLInitDiagramFacade getInitDiagramFacade(IFile modelFile, IFile diagramFile);

	protected abstract URL findFileInTestPlugin(String fileName);

	private String myModelFileName;

	private String myDiagramFileName;

	private UMLInitDiagramFacade myInitDiagramFacade;

	public TestWholeDiagram(String modelFileName, String diagramFileName) {
		myModelFileName = modelFileName;
		myDiagramFileName = diagramFileName;
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		myInitDiagramFacade.close();
		myInitDiagramFacade = null;
		myModelFileName = null;
		myDiagramFileName = null;
	}

	@Override
	protected void runTest() throws Throwable {
		testSample();
	}

	/*
	 * A name of test. It used, e.g. by JUnit perspective, to display test result.
	 */
	@Override
	public String getName() {
		return "test_" + myModelFileName;
	}

	public void testSample() throws Exception {
		URL diagramURL = findFileInTestPlugin(myDiagramFileName);
		URL modelURL = findFileInTestPlugin(myModelFileName);
		assertNotNull("Cannot find diagram file " + myDiagramFileName + ".", diagramURL);
		assertNotNull("Cannot find model file " + myModelFileName + ".", modelURL);

		UMLProjectFacade project = null;
		try {
			project = new UMLProjectFacade();
		} catch (CoreException e1) {
			fail("Cannot create project.");
		}
		IFile templateFile = project.getFile(myDiagramFileName);
		IFile modelFile = project.getFile(myModelFileName);
		templateFile.create(diagramURL.openStream(), true, null);
		modelFile.create(modelURL.openStream(), true, null);
		Diagram view1 = getDiagramRoot(templateFile);
		myInitDiagramFacade = getInitDiagramFacade(modelFile, project.createEmptyFile("restored" + myDiagramFileName));
		Diagram view2 = myInitDiagramFacade.getDiagramView();
		compareDiagrams(view1, view2);
	}

	private Diagram getDiagramRoot(IFile file) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();
		org.eclipse.emf.common.util.URI diagramModelURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		Resource diagramResource = resourceSet.getResource(diagramModelURI, true);
		return (Diagram) diagramResource.getContents().get(0);
	}

	protected void compareDiagrams(Diagram diagram1, Diagram diagram2) {
		DiagramCompareSession session = new DiagramCompareSession();
		session.setViewFilter(createViewFilter());
		session.compare(diagram1, diagram2);
		
		DiagramCompareSession.MatchRegistry<Node> nodesRegistry = session.getNodesRegistry();
		DiagramCompareSession.MatchRegistry<Edge> edgesRegistry = session.getEdgesRegistry();
		
		if (!nodesRegistry.getMissedOlds().isEmpty()){
			fail("Some nodes were not found in the initialized diagram: " + getPringString(nodesRegistry.getMissedOlds()));
		}
		
		if (!edgesRegistry.getMissedOlds().isEmpty()){
			fail("Some edges were not found in the initialized diagram: " + getPringString(edgesRegistry.getMissedOlds()));
		}
		
		if (!nodesRegistry.getNotMatchedNews().isEmpty()){
			fail("The following nodes are not expected, but they exist: " + getPringString(nodesRegistry.getNotMatchedNews()));
		}
		
		if (!edgesRegistry.getNotMatchedNews().isEmpty()){
			fail("The following edges are not expected, but they exist: " + getPringString(edgesRegistry.getNotMatchedNews()));
		}
	}

	private final static StringBuffer getStackTrace(View view) {
		if (view == null) {
			return new StringBuffer();
		}
		StringBuffer result = new StringBuffer();
		if (view.getElement() instanceof NamedElement) {
			result.append("'").append(((NamedElement) view.getElement()).getName()).append("'").append(", ");
		}
		result.append("vid = ").append(view.getType());
		StringBuffer parentStack = getStackTrace((View) view.eContainer());
		if (parentStack.length() > 0) {
			result.append(" from ").append(parentStack);
		}
		return result;
	}

	private static StringBuffer getPringString(Collection<? extends View> list) {
		StringBuffer result = new StringBuffer();		
		for (View next : list) {
			result.append(getPringString(next )).append(";\n");
		}
		
		result.append("\n Details: \n");
		for (View next : list){
			result.append(getStackTrace(next)).append(";\n");
		}
		return result;
	}
	
	private static StringBuffer getPringString(View node) {
		StringBuffer result = new StringBuffer();
		if (node != null) {
			if (node.getElement() instanceof NamedElement) {
				result.append(((NamedElement) node.getElement()).getName()).append(", ");
			}
			result.append("vid = ").append(node.getType());
		}
		return result;
	}
	
	protected DiagramCompareSession.ViewFilter createViewFilter(){
		return new ByViewTypeFilter();
	}
	
	protected static class ByViewTypeFilter implements DiagramCompareSession.ViewFilter {
		private final Set<String> myTextTypesToIgnore = new HashSet<String>();
		
		public ByViewTypeFilter(){
			this("Text", "Note", "NoteAttachment");
		}
		
		public ByViewTypeFilter(String ...textTypes){
			myTextTypesToIgnore.addAll(Arrays.asList(textTypes));
		}
		
		public boolean ignore(View view) {
			String type = view.getType();
			if (myTextTypesToIgnore.contains(type)){
				return true;
			}
			//all others are integers (at least expected)
			int visualId = Integer.parseInt(type);
			
			return ignoreVisualId(visualId);
		}
		
		protected boolean ignoreVisualId(int visualId){
			return 5000 < visualId && visualId < 6000;
		}
	}
	
}
