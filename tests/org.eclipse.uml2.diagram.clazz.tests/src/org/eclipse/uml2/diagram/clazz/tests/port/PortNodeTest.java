package org.eclipse.uml2.diagram.clazz.tests.port;

import java.util.Collections;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLPaletteFactory;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.clazz.tests.tool.ClassDiagramCreationToolTest;
import org.eclipse.uml2.diagram.common.tests.UMLDiagramFacade;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;


public class PortNodeTest extends ClassDiagramCreationToolTest {
	PaletteRoot myRoot = new PaletteRoot();

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		new UMLPaletteFactory().fillPalette(myRoot);
	}

	public PortNodeTest(String name) {
		super(name);
	}
	
	public void testIncorrectHighlight() throws Exception {
		IGraphicalEditPart portPart = createPortOnClass();
		setType(portPart, createClass());
		UMLDiagramFacade.flushEventQueue();
		System.out.println(portPart.getFigure().getForegroundColor());
	}
	
	private IGraphicalEditPart createPortOnClass() {
		IGraphicalEditPart diagramEditPart = getDiagramEditPart();
		ToolEntry classTool = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(0)).getChildren().get(0);
		createNodeByTool(classTool.createTool(), 200, 100);

		IGraphicalEditPart classPart = diagramEditPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		assertNotNull(classPart);
		assertEquals("Class", getMetaclassName(classPart));
		getDiagramEditPart().getViewer().flush();

		ToolEntry portTool = (ToolEntry) ((PaletteContainer) myRoot.getChildren().get(1)).getChildren().get(3);
		createNodeByTool(portTool.createTool(), 200, 101);

		IGraphicalEditPart portPart = classPart.getChildBySemanticHint(UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		assertNotNull(portPart);
		assertEquals("Port", getMetaclassName(portPart));
		UMLDiagramFacade.flushEventQueue();
		return portPart;
	}
	
	private IGraphicalEditPart createClass() {
		Point p = getDiagramEditPart().getChildrenBounds().getCopy().expand(2, 2).getBottomRight();
		Tool classTool = new UnspecifiedTypeCreationTool(Collections.singletonList(UMLElementTypes.Class_2001));
		createNodeByTool(classTool, p);
		IGraphicalEditPart classEP = getSelectedEP();
		UMLDiagramFacade.flushEventQueue();
		assertNotNull(classEP);
		return classEP;
	}
	
	private void setType(IGraphicalEditPart sourceEP, IGraphicalEditPart typeEP) throws Exception {
		new SetValueCommand(new SetRequest(sourceEP.getNotationView().getElement(), UMLPackage.eINSTANCE.getTypedElement_Type(), (Type) typeEP.getNotationView().getElement())).execute(null, null);
	}

	private static java.lang.String getMetaclassName(IGraphicalEditPart editPart) {
		return editPart.getNotationView().getElement().eClass().getName();
	}

}
