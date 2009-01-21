package org.eclipse.uml2.diagram.common.tests;

import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.diagram.common.sheet.chooser.MetaclassContainmentFilter;
import org.eclipse.uml2.diagram.common.sheet.chooser.UMLContainmentFilter;
import org.eclipse.uml2.uml.UMLPackage;

public class MetaclassFilterTest extends TestCase {
	public void testMetaclassContainmentFilter() {
		UMLPackage UML = UMLPackage.eINSTANCE;
		MetaclassContainmentFilter filter = UMLContainmentFilter.getWithoutTemplatesInstance();
		Set<EClass> forType = filter.getAncestorsOrSelf(UML.getType());
		
		assertNotNull(forType);
		assertTrue(forType.contains(UML.getType()));
		assertTrue(forType.contains(UML.getClass_()));
		assertTrue(forType.contains(UML.getInterface()));
		assertTrue(forType.contains(UML.getStateMachine()));
		assertTrue(forType.contains(UML.getPackage()));
		assertTrue(forType.contains(UML.getModel()));
		assertTrue(forType.contains(UML.getAssociation()));
		
		assertTrue(forType.contains(UML.getProperty())); //via DeploymentTarget#deployment
		assertTrue(forType.contains(UML.getPort())); //via DeploymentTarget#deployment
		assertTrue(forType.contains(UML.getInstanceSpecification())); //via DeploymentTarget#deployment
		
		assertFalse(forType.contains(UML.getValueSpecification()));
		assertFalse(forType.contains(UML.getUnlimitedNatural()));
		assertFalse(forType.contains(UML.getConstraint()));
		assertFalse(forType.contains(UML.getGeneralization()));
		assertFalse(forType.contains(UML.getAction()));
	}
}
