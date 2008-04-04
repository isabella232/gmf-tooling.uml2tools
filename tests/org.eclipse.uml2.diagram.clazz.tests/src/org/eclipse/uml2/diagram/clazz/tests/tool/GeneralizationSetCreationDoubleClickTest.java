package org.eclipse.uml2.diagram.clazz.tests.tool;

import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationSetEditPart;
import org.eclipse.uml2.diagram.clazz.part.CreateGeneralizationLinkTool;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;


public class GeneralizationSetCreationDoubleClickTest extends GeneralizationSetCreationToolTest {

	public GeneralizationSetCreationDoubleClickTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected IGraphicalEditPart createGeneralizationSet(IGraphicalEditPart sourceEP, ConnectionEditPart targetEP) {
		getDiagramEditPart().getViewer().setSelection(new StructuredSelection(new Object[]{sourceEP, targetEP}));
		createConnectionByToolDoubleClick(new CreateGeneralizationLinkTool());
		IGraphicalEditPart generalizationSet = getDiagramEditPart().getChildBySemanticHint(UMLVisualIDRegistry.getType(GeneralizationSetEditPart.VISUAL_ID));
		return generalizationSet;
	}

}
