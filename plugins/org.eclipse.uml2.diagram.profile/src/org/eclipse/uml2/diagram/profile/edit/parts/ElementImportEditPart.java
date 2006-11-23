package org.eclipse.uml2.diagram.profile.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.profile.edit.policies.ElementImportItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.profile.part.UMLVisualIDRegistry;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.PackageableElement;

/**
 * @generated
 */
public class ElementImportEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2006;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ElementImportEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ElementImportItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());

	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShapeGen() {
		ReferencedMetaclassFigure figure = new ReferencedMetaclassFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated NOT
	 */
	protected IFigure createNodeShape() {
		ReferencedMetaclassFigure result = (ReferencedMetaclassFigure) createNodeShapeGen();
		refreshHasImportedMetaclass(result);
		return result;
	}

	/**
	 * @generated
	 */
	public ReferencedMetaclassFigure getPrimaryShape() {
		return (ReferencedMetaclassFigure) primaryShape;
	}

	/**
	 * @generated 
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {

		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ReferencedMetaclassNode_classNameEditPart) {
			((ReferencedMetaclassNode_classNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureReferencedMetaclassFigure_className());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		return false;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(40), getMapMode().DPtoLP(40));
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(getMapMode().DPtoLP(5));
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(ReferencedMetaclassNode_classNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @NOT-GENERATED
	 * XXX: fix for #161545 should allow to generate this method  
	 */
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		if (notification.getNotifier() instanceof ElementImport) {
			refreshHasImportedMetaclass(getPrimaryShape());
		}
	}

	/**
	 * @NOT-GENERATED
	 * XXX: fix for #161545 should allow to generate this method  
	 */
	private void refreshHasImportedMetaclass(ReferencedMetaclassFigure figure) {
		ElementImport elementImport = (ElementImport) resolveSemanticElement();
		//OCL here (#161545)
		boolean hasMetaclass = false;
		if (elementImport != null) {
			PackageableElement imported = elementImport.getImportedElement();
			hasMetaclass = imported instanceof org.eclipse.uml2.uml.Class && ((org.eclipse.uml2.uml.Class) imported).isMetaclass();
		}
		figure.setHasActualMetaclassImport(hasMetaclass);
	}

	/**
	 * @generated
	 */
	public class ReferencedMetaclassFigure extends org.eclipse.draw2d.RectangleFigure {

		/**
		 * @generated
		 */
		public ReferencedMetaclassFigure() {

			this.setLayoutManager(new org.eclipse.gmf.internal.codegen.draw2d.GridLayout());
			this.setFill(true);
			this.setFillXOR(false);
			this.setOutline(true);
			this.setOutlineXOR(false);
			this.setLineWidth(1);
			this.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);
			this.setForegroundColor(org.eclipse.draw2d.ColorConstants.gray);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			org.eclipse.draw2d.RectangleFigure referencedMetaclassFigure_FixedLabelPane0 = new org.eclipse.draw2d.RectangleFigure();
			referencedMetaclassFigure_FixedLabelPane0.setFill(false);
			referencedMetaclassFigure_FixedLabelPane0.setFillXOR(false);
			referencedMetaclassFigure_FixedLabelPane0.setOutline(false);
			referencedMetaclassFigure_FixedLabelPane0.setOutlineXOR(false);
			referencedMetaclassFigure_FixedLabelPane0.setLineWidth(1);
			referencedMetaclassFigure_FixedLabelPane0.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);

			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData constraintReferencedMetaclassFigure_FixedLabelPane0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			constraintReferencedMetaclassFigure_FixedLabelPane0.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			constraintReferencedMetaclassFigure_FixedLabelPane0.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			constraintReferencedMetaclassFigure_FixedLabelPane0.horizontalIndent = 0;
			constraintReferencedMetaclassFigure_FixedLabelPane0.horizontalSpan = 1;
			constraintReferencedMetaclassFigure_FixedLabelPane0.verticalSpan = 1;
			constraintReferencedMetaclassFigure_FixedLabelPane0.grabExcessHorizontalSpace = true;
			constraintReferencedMetaclassFigure_FixedLabelPane0.grabExcessVerticalSpace = true;
			this.add(referencedMetaclassFigure_FixedLabelPane0, constraintReferencedMetaclassFigure_FixedLabelPane0);

			org.eclipse.uml2.diagram.common.draw2d.CenterLayout layoutReferencedMetaclassFigure_FixedLabelPane0 = new org.eclipse.uml2.diagram.common.draw2d.CenterLayout();

			referencedMetaclassFigure_FixedLabelPane0.setLayoutManager(layoutReferencedMetaclassFigure_FixedLabelPane0);

			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel referencedMetaclassFigure_fixed_metaclass1 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			referencedMetaclassFigure_fixed_metaclass1.setText("\u00ABmetaclass\u00BB");

			referencedMetaclassFigure_FixedLabelPane0.add(referencedMetaclassFigure_fixed_metaclass1);

			org.eclipse.draw2d.RectangleFigure referencedMetaclassFigure_LabelPane0 = new org.eclipse.draw2d.RectangleFigure();
			referencedMetaclassFigure_LabelPane0.setFill(false);
			referencedMetaclassFigure_LabelPane0.setFillXOR(false);
			referencedMetaclassFigure_LabelPane0.setOutline(false);
			referencedMetaclassFigure_LabelPane0.setOutlineXOR(false);
			referencedMetaclassFigure_LabelPane0.setLineWidth(1);
			referencedMetaclassFigure_LabelPane0.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);

			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData constraintReferencedMetaclassFigure_LabelPane0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			constraintReferencedMetaclassFigure_LabelPane0.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			constraintReferencedMetaclassFigure_LabelPane0.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			constraintReferencedMetaclassFigure_LabelPane0.horizontalIndent = 0;
			constraintReferencedMetaclassFigure_LabelPane0.horizontalSpan = 1;
			constraintReferencedMetaclassFigure_LabelPane0.verticalSpan = 1;
			constraintReferencedMetaclassFigure_LabelPane0.grabExcessHorizontalSpace = true;
			constraintReferencedMetaclassFigure_LabelPane0.grabExcessVerticalSpace = true;
			this.add(referencedMetaclassFigure_LabelPane0, constraintReferencedMetaclassFigure_LabelPane0);

			org.eclipse.uml2.diagram.common.draw2d.CenterLayout layoutReferencedMetaclassFigure_LabelPane0 = new org.eclipse.uml2.diagram.common.draw2d.CenterLayout();

			referencedMetaclassFigure_LabelPane0.setLayoutManager(layoutReferencedMetaclassFigure_LabelPane0);

			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel referencedMetaclassFigure_className1 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			referencedMetaclassFigure_className1.setText("");

			referencedMetaclassFigure_LabelPane0.add(referencedMetaclassFigure_className1);
			setFigureReferencedMetaclassFigure_className(referencedMetaclassFigure_className1);

		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fReferencedMetaclassFigure_className;

		/**
		 * @generated
		 */
		public org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel getFigureReferencedMetaclassFigure_className() {
			return fReferencedMetaclassFigure_className;
		}

		/**
		 * @generated
		 */
		private void setFigureReferencedMetaclassFigure_className(org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig) {
			fReferencedMetaclassFigure_className = fig;
		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @NOT-GENERATED
		 */
		public void setHasActualMetaclassImport(boolean hasActualMetaclassImport) {
			setForegroundColor(hasActualMetaclassImport ? org.eclipse.draw2d.ColorConstants.gray : org.eclipse.draw2d.ColorConstants.red);
		}

	}

}
