package org.eclipse.uml2.diagram.common.tests;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.core.commands.ExecutionException;
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
import org.eclipse.uml2.uml.NamedElement;

public abstract class DiagramSampleTest extends TestCase {

	protected abstract UMLTestDiagram restoreDiagram(IFile modelFile, IFile diagramFile) throws ExecutionException, IOException, CoreException;

	protected abstract URL getURL(String fileName);

	private String myModelFileName;

	private String myDiagramFileName;

	private UMLTestDiagram myRestoredDiagram;

	public DiagramSampleTest(String modelFileName, String diagramFileName) {
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
		myRestoredDiagram.close();
	}

	@Override
	protected void runTest() throws Throwable {
		testSample();
	}

	@Override
	public String getName() {
		return "test_" + myModelFileName;
	}

	public void testSample() {
		URL diagramURL = getURL(myDiagramFileName);
		URL modelURL = getURL(myModelFileName);
		assertNotNull("Cannot find diagram file " + myDiagramFileName + ".", diagramURL);
		assertNotNull("Cannot find model file " + myModelFileName + ".", modelURL);

		UMLTestProject project = null;
		try {
			project = new UMLTestProject();
		} catch (CoreException e1) {
			fail("Cannot create project.");
		}
		IFile templateFile = project.getFile(myDiagramFileName);
		IFile modelFile = project.getFile(myModelFileName);
		try {
			templateFile.create(diagramURL.openStream(), true, null);
			modelFile.create(modelURL.openStream(), true, null);
		} catch (CoreException e) {
			fail("Unable to copy diagram or model file.");
		} catch (IOException e) {
			fail("Unable to copy diagram or model file.");
		}
		try {
			myRestoredDiagram = restoreDiagram(modelFile, project.createEmptyFile("restored" + myDiagramFileName));
		} catch (ExecutionException e) {
			fail("Cannot to restore diagram.");
		} catch (IOException e) {
			fail("Cannot to restore diagram.");
		} catch (CoreException e) {
			fail("Cannot to restore diagram.");
		}
		Diagram view1 = getRoot(templateFile);
		Diagram view2 = myRestoredDiagram.getView();
		compareDiagrams(view1, view2);
	}

	protected Diagram getRoot(IFile file) {
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
		assertEquals("Incorrect View type " + getParentStack(view2), view1.getType(), view2.getType());
		assertEquals("Incorrect Element eClass " + getParentStack(view2), view1.getElement().eClass(), view2.getElement().eClass());
		assertEquals("Incorrect View eClass " + getParentStack(view2), view1.eClass(), view2.eClass());
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

		List children1 = getSemanticViewsList(view1);
		List children2 = getSemanticViewsList(view2);
		String name = (view2.getElement() == null || false == view2.getElement() instanceof NamedElement) ? null : ((NamedElement) view2.getElement()).getName();
		assertEquals("View " + getParentStack(view2) + " " + name + " has incorrent children size. ", children1.size(), children2.size());
		for (int i = 0; i < children1.size(); i++) {
			View child1 = (View) children1.get(i);
			View child2 = (View) children2.get(i);
			compareChildren(child1, child2);
		}
	}

	private StringBuffer getParentStack(View node) {
		StringBuffer result = new StringBuffer();
		if (node != null) {
			result.append(" [");
			if (node instanceof NamedElement) {
				result.append(((NamedElement) node.getElement()).getName());
			}
			result.append("(id = ");
			result.append(node.getType());
			result.append(")");
			result.append(getParentStack((View) node.eContainer()));
			result.append("]");
		}
		return result;
	}

	private List getSemanticViewsList(View view) {
		List result = new ArrayList();
		Iterator iter = view.getChildren().iterator();
		while (iter.hasNext()) {
			View next = (View) iter.next();
			int VID;
			try {
				VID = Integer.parseInt(next.getType());
			} catch (NumberFormatException e) {
				continue;
			}

			// we do not pay attention to labels
			if (3000 < VID && VID < 4000) {
				continue;
			}
			result.add(next);
		}
		return result;
	}

}
