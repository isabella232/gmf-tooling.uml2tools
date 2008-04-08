package org.eclipse.uml2.diagram.clazz.tests.tool;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;

public class PaletteCreationToolTest extends ClassDiagramCreationToolTest {

	public PaletteCreationToolTest(String name) {
		super(name);
	}

	public void testClassProperties() {
		createNodeByTool(UMLElementTypes.Class_2001, 200, 100);
		IGraphicalEditPart clazzEditPart = getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		assertNotNull("Bla. ", clazzEditPart);
		getDiagramEditPart().getViewer().flush();
		assertEquals("Class", clazzEditPart.getNotationView().getElement().eClass().getName());
		createNodeByTool(UMLElementTypes.Property_3001, 201, 101);
		IGraphicalEditPart compartmentEditPart = clazzEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(ClassAttributesEditPart.VISUAL_ID));
		assertNotNull("Bla-bla. ", compartmentEditPart);
		IGraphicalEditPart propertyEditPart = compartmentEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
		assertNotNull("Bla-bla-bla. ", propertyEditPart);
		assertEquals("Property", propertyEditPart.getNotationView().getElement().eClass().getName());
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
