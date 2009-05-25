package org.eclipse.uml2.diagram.clazz.tests.parser;

import junit.framework.TestCase;

import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.uml2.diagram.clazz.parser.NamedElementParser;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.VisibilityKind;


public class NamedElementParserTest extends TestCase {
	public void testViewStrings(){
		NamedElementParser parser = new NamedElementParser();
		Class umlClass = UMLFactory.eINSTANCE.createClass();
		umlClass.setName("abc");
		umlClass.setVisibility(VisibilityKind.PRIVATE_LITERAL);
		EObjectAdapter adapter = new EObjectAdapter(umlClass);
		assertEquals("-abc", parser.getPrintString(adapter, 0));
		
		umlClass.setVisibility(VisibilityKind.PROTECTED_LITERAL);
		assertEquals("#abc", parser.getPrintString(adapter, 0));

		umlClass.setVisibility(VisibilityKind.PACKAGE_LITERAL);
		assertEquals("~abc", parser.getPrintString(adapter, 0));
	
		umlClass.setVisibility(VisibilityKind.PUBLIC_LITERAL);
		assertEquals("abc", parser.getPrintString(adapter, 0));
	}
	
	public void testParseCommandsWithSpace() throws Exception {
		checkParseCommand("- abc", "abc", VisibilityKind.PRIVATE_LITERAL);
		checkParseCommand("# cde", "cde", VisibilityKind.PROTECTED_LITERAL);
		checkParseCommand("~ xyz", "xyz", VisibilityKind.PACKAGE_LITERAL);
		checkParseCommand(" klm", "klm", VisibilityKind.PUBLIC_LITERAL);
	}
	
	public void testParseCommandsWithoutSpaces() throws Exception {
		checkParseCommand("-abc", "abc", VisibilityKind.PRIVATE_LITERAL);
		checkParseCommand("#cde", "cde", VisibilityKind.PROTECTED_LITERAL);
		checkParseCommand("~xyz", "xyz", VisibilityKind.PACKAGE_LITERAL);
		checkParseCommand("klm", "klm", VisibilityKind.PUBLIC_LITERAL);
	}
	
	public void testParseCommandWithExsessiveSpaces() throws Exception {
		checkParseCommand("-       abc", "abc", VisibilityKind.PRIVATE_LITERAL);
		checkParseCommand("#       cde", "cde", VisibilityKind.PROTECTED_LITERAL);
		checkParseCommand("~       xyz", "xyz", VisibilityKind.PACKAGE_LITERAL);
		checkParseCommand("        klm", "klm", VisibilityKind.PUBLIC_LITERAL);
	}
	
	public void testParseCommandVisibilityOmitted() throws Exception {
		checkParseCommand("JustNameNothingElse", "JustNameNothingElse", VisibilityKind.PUBLIC_LITERAL);
	}
	
	private void checkParseCommand(String editString, String expectedName, VisibilityKind expectedVisibility) throws Exception {
		NamedElementParser parser = new NamedElementParser();
		Class umlClass = UMLFactory.eINSTANCE.createClass();
		umlClass.setName("SomeName".equals(expectedName) ? "SomeOtherName" : "SomeName");
		umlClass.setVisibility(expectedVisibility == VisibilityKind.PUBLIC_LITERAL ? VisibilityKind.PRIVATE_LITERAL : expectedVisibility);
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI("uri://NamedElementParserTest/contents.uml"));
		resource.getContents().add(umlClass);
		GMFEditingDomainFactory.getInstance().createEditingDomain(resourceSet);

		EObjectAdapter adapter = new EObjectAdapter(umlClass);
		ICommand command = parser.getParseCommand(adapter, editString, 0);
		assertNotNull(command);
		assertTrue(command.canExecute());
		IStatus status = OperationHistoryFactory.getOperationHistory().execute(command, new NullProgressMonitor(), null);
		assertTrue(status.isOK());
		
		assertEquals("problem for editString='" + editString + "'", expectedName, umlClass.getName());
		assertEquals("problem for editString='" + editString + "'", expectedVisibility, umlClass.getVisibility());
	}

}
