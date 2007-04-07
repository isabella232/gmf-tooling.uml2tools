package org.eclipse.uml2.diagram.common.tests;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;

import junit.framework.TestCase;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.View;
import org.osgi.framework.Bundle;

public abstract class DiagramSampleTest extends TestCase {

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
		return "test" + myModelFileName;
	}

	public void testSample() {
		URL diagramURL = getURL(getSourceFolder() + myDiagramFileName);
		URL modelURL = getURL(getSourceFolder() + myModelFileName);
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
		View view1 = getRoot(templateFile);
		View view2 = myRestoredDiagram.getView();
		assertEquals(new UMLTestView(view1), new UMLTestView(view2));
	}

	protected View getRoot(IFile file) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();
		org.eclipse.emf.common.util.URI diagramModelURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		final Resource diagramResource = resourceSet.getResource(diagramModelURI, true);
		return (View) diagramResource.getContents().get(0);
	}

	protected URL getURL(String fileName) {
		return FileLocator.find(UML_TEST_BUNDLE, new Path(fileName), Collections.EMPTY_MAP);
	}

	protected String getSourceFolder() {
		return "examples//";
	}

	protected abstract UMLTestDiagram restoreDiagram(IFile modelFile, IFile diagramFile) throws ExecutionException, IOException, CoreException;

	private final static Bundle UML_TEST_BUNDLE = Platform.getBundle("org.eclipse.uml2.diagram.clazz.tests");

}
