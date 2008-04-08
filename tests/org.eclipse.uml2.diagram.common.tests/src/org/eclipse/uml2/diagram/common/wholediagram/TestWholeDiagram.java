package org.eclipse.uml2.diagram.common.wholediagram;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
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
		compareChildren(diagram1, diagram2);
		compareEdges(diagram1, diagram2);

	}

	private void compareViews(View view1, View view2) {
		assertEquals("Incorrect View type " + getStackTrace(view2) + " for element " + view2.getElement(), view1.getType(), view2.getType());
		assertEquals("Incorrect Element eClass " + getStackTrace(view2), view1.getElement().eClass(), view2.getElement().eClass());
		assertEquals("Incorrect View eClass " + getStackTrace(view2), view1.eClass(), view2.eClass());
	}

	private void compareEdges(Diagram diagram1, Diagram diagram2) {
		EList edges1 = diagram1.getEdges();
		EList edges2 = diagram2.getEdges();
		assertEquals("Diagram has incorrect edges size", edges1.size(), edges2.size());
		for (int i = 0; i < edges1.size(); i++) {
			Edge edge1 = (Edge) edges1.get(i);
			Edge edge2 = (Edge) edges2.get(i);
			assertEquals("Incorrect Edge source type: edge = " + edge2.getElement(), edge1.getSource().getType(), edge2.getSource().getType());
			assertEquals("Incorrect Edge source element eClass: edge = " + edge2.getElement(), edge1.getSource().getElement().eClass(), edge2.getSource().getElement().eClass());
			assertEquals("Incorrect Edge target type: edge = " + edge2.getElement(), edge1.getTarget().getType(), edge2.getTarget().getType());
			assertEquals("Incorrect Edge target element eClass: edge = " + edge2.getElement(), edge1.getTarget().getElement().eClass(), edge2.getTarget().getElement().eClass());
		}
	}

	private void compareChildren(View view1, View view2) {
		compareViews(view1, view2);

		List<View> children1 = getFilteredChildren(view1);
		List<View> children2 = getFilteredChildren(view2);
		for (int i = 0; i < Math.min(children1.size(), children2.size()); i++) {
			View child1 = (View) children1.get(i);
			View child2 = (View) children2.get(i);
			compareChildren(child1, child2);
		}
		assertEquals("View " + getStackTrace(view2) + " has a different set of children: " + getPringString(children2) + ". Expected: " + getPringString(children1), children1.size(), children2.size());
	}

	private StringBuffer getStackTrace(View node) {
		if (node == null) {
			return EMPTY;
		}
		StringBuffer result = new StringBuffer();
		if (node.getElement() instanceof NamedElement) {
			result.append("'").append(((NamedElement) node.getElement()).getName()).append("'").append(", ");
		}
		result.append("vid = ").append(node.getType());
		StringBuffer parentStack = getStackTrace((View) node.eContainer());
		if (parentStack.length() > 0) {
			result.append(" from ").append(parentStack);
		}
		return result;
	}

	private static StringBuffer getPringString(List<View> children) {
		StringBuffer result = new StringBuffer();		
		for (View child: children ) {
			result.append(getPringString(child)).append("; ");
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

	private List<View> getFilteredChildren(View view) {
		List<View> result = new ArrayList<View>();
		Iterator iter = view.getChildren().iterator();
		while (iter.hasNext()) {
			View next = (View) iter.next();
			int visualId;
			try {
				visualId = Integer.parseInt(next.getType());
			} catch (NumberFormatException e) {
				continue;
			}

			if (ignoreView(visualId)) {
				continue;
			}
			result.add(next);
		}
		return result;
	}
	
	protected boolean ignoreView(int visualId) {
		// we do not pay attention to labels
		return 3000 < visualId && visualId < 4000;
	}
	
	private static StringBuffer EMPTY = new StringBuffer(0); 

}
