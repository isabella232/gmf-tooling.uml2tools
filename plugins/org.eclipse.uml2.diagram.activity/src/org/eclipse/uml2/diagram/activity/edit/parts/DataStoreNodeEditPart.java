package org.eclipse.uml2.diagram.activity.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.policies.DataStoreNodeItemSemanticEditPolicy;

/**
 * @generated
 */
public class DataStoreNodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2008;

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
	public DataStoreNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new DataStoreNodeItemSemanticEditPolicy());
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
	protected IFigure createNodeShape() {
		DataStoreFigure figure = new DataStoreFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public DataStoreFigure getPrimaryShape() {
		return (DataStoreFigure) primaryShape;
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
	public class DataStoreFigure extends org.eclipse.draw2d.RectangleFigure {

		/**
		 * @generated
		 */
		public DataStoreFigure() {

			org.eclipse.draw2d.BorderLayout myGenLayoutManager = new org.eclipse.draw2d.BorderLayout();

			this.setLayoutManager(myGenLayoutManager);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig_0 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			fig_0.setText("\u00ABdatastore\u00BB");

			setFigureDataStore_fixed_datastore(fig_0);

			Object layData0 = org.eclipse.draw2d.BorderLayout.TOP;

			this.add(fig_0, layData0);
			org.eclipse.draw2d.RectangleFigure fig_1 = new org.eclipse.draw2d.RectangleFigure();
			fig_1.setFill(false);
			fig_1.setOutline(false);

			setFigureDataStoreFigure_ContentPane(fig_1);

			Object layData1 = org.eclipse.draw2d.BorderLayout.CENTER;

			this.add(fig_1, layData1);
		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fDataStore_fixed_datastore;

		/**
		 * @generated
		 */
		public org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel getFigureDataStore_fixed_datastore() {
			return fDataStore_fixed_datastore;
		}

		/**
		 * @generated
		 */
		private void setFigureDataStore_fixed_datastore(org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig) {
			fDataStore_fixed_datastore = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fDataStoreFigure_ContentPane;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigureDataStoreFigure_ContentPane() {
			return fDataStoreFigure_ContentPane;
		}

		/**
		 * @generated
		 */
		private void setFigureDataStoreFigure_ContentPane(org.eclipse.draw2d.RectangleFigure fig) {
			fDataStoreFigure_ContentPane = fig;
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

	}

}
