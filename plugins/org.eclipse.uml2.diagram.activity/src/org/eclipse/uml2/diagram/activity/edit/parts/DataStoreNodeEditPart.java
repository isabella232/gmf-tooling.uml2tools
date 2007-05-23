package org.eclipse.uml2.diagram.activity.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
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
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.policies.DataStoreNodeCanonicalEditPolicy;
import org.eclipse.uml2.diagram.activity.edit.policies.DataStoreNodeItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;

/**
 * @generated
 */
public class DataStoreNodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3036;

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
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new DataStoreNodeCanonicalEditPolicy());
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
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DataStoreNodeNameEditPart) {
			((DataStoreNodeNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureDataStoreFigure_name());
			return true;
		}
		if (childEditPart instanceof DataStoreNodeName2EditPart) {
			((DataStoreNodeName2EditPart) childEditPart).setLabel(getPrimaryShape().getFigureDataStoreFigure_states());
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
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {

		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(60), getMapMode().DPtoLP(30));
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(DataStoreNodeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class DataStoreFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		public DataStoreFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setFill(true);
			this.setFillXOR(false);
			this.setOutline(true);
			this.setOutlineXOR(false);
			this.setLineWidth(1);
			this.setLineStyle(Graphics.LINE_SOLID);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(60), getMapMode().DPtoLP(30)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure dataStoreFigure_NameContainer0 = new RectangleFigure();
			dataStoreFigure_NameContainer0.setFill(false);
			dataStoreFigure_NameContainer0.setFillXOR(false);
			dataStoreFigure_NameContainer0.setOutline(false);
			dataStoreFigure_NameContainer0.setOutlineXOR(false);
			dataStoreFigure_NameContainer0.setLineWidth(1);
			dataStoreFigure_NameContainer0.setLineStyle(Graphics.LINE_SOLID);

			GridData constraintDataStoreFigure_NameContainer0 = new GridData();
			constraintDataStoreFigure_NameContainer0.verticalAlignment = GridData.CENTER;
			constraintDataStoreFigure_NameContainer0.horizontalAlignment = GridData.CENTER;
			constraintDataStoreFigure_NameContainer0.horizontalIndent = 0;
			constraintDataStoreFigure_NameContainer0.horizontalSpan = 1;
			constraintDataStoreFigure_NameContainer0.verticalSpan = 1;
			constraintDataStoreFigure_NameContainer0.grabExcessHorizontalSpace = true;
			constraintDataStoreFigure_NameContainer0.grabExcessVerticalSpace = true;
			this.add(dataStoreFigure_NameContainer0, constraintDataStoreFigure_NameContainer0);

			GridLayout layoutDataStoreFigure_NameContainer0 = new GridLayout();
			layoutDataStoreFigure_NameContainer0.numColumns = 1;
			layoutDataStoreFigure_NameContainer0.makeColumnsEqualWidth = true;
			dataStoreFigure_NameContainer0.setLayoutManager(layoutDataStoreFigure_NameContainer0);

			WrapLabel dataStore_fixed_datastore1 = new WrapLabel();
			dataStore_fixed_datastore1.setText("\u00ABdatastore\u00BB");

			GridData constraintDataStore_fixed_datastore1 = new GridData();
			constraintDataStore_fixed_datastore1.verticalAlignment = GridData.CENTER;
			constraintDataStore_fixed_datastore1.horizontalAlignment = GridData.CENTER;
			constraintDataStore_fixed_datastore1.horizontalIndent = 0;
			constraintDataStore_fixed_datastore1.horizontalSpan = 1;
			constraintDataStore_fixed_datastore1.verticalSpan = 1;
			constraintDataStore_fixed_datastore1.grabExcessHorizontalSpace = true;
			constraintDataStore_fixed_datastore1.grabExcessVerticalSpace = false;
			dataStoreFigure_NameContainer0.add(dataStore_fixed_datastore1, constraintDataStore_fixed_datastore1);

			WrapLabel dataStoreFigure_name1 = new WrapLabel();
			dataStoreFigure_name1.setText("");

			GridData constraintDataStoreFigure_name1 = new GridData();
			constraintDataStoreFigure_name1.verticalAlignment = GridData.CENTER;
			constraintDataStoreFigure_name1.horizontalAlignment = GridData.CENTER;
			constraintDataStoreFigure_name1.horizontalIndent = 0;
			constraintDataStoreFigure_name1.horizontalSpan = 1;
			constraintDataStoreFigure_name1.verticalSpan = 1;
			constraintDataStoreFigure_name1.grabExcessHorizontalSpace = true;
			constraintDataStoreFigure_name1.grabExcessVerticalSpace = false;
			dataStoreFigure_NameContainer0.add(dataStoreFigure_name1, constraintDataStoreFigure_name1);

			setFigureDataStoreFigure_name(dataStoreFigure_name1);

			WrapLabel dataStoreFigure_states1 = new WrapLabel();
			dataStoreFigure_states1.setText("");

			GridData constraintDataStoreFigure_states1 = new GridData();
			constraintDataStoreFigure_states1.verticalAlignment = GridData.CENTER;
			constraintDataStoreFigure_states1.horizontalAlignment = GridData.CENTER;
			constraintDataStoreFigure_states1.horizontalIndent = 0;
			constraintDataStoreFigure_states1.horizontalSpan = 1;
			constraintDataStoreFigure_states1.verticalSpan = 1;
			constraintDataStoreFigure_states1.grabExcessHorizontalSpace = true;
			constraintDataStoreFigure_states1.grabExcessVerticalSpace = false;
			dataStoreFigure_NameContainer0.add(dataStoreFigure_states1, constraintDataStoreFigure_states1);

			setFigureDataStoreFigure_states(dataStoreFigure_states1);

		}

		/**
		 * @generated
		 */
		private WrapLabel fDataStoreFigure_name;

		/**
		 * @generated
		 */
		public WrapLabel getFigureDataStoreFigure_name() {
			return fDataStoreFigure_name;
		}

		/**
		 * @generated
		 */
		private void setFigureDataStoreFigure_name(WrapLabel fig) {
			fDataStoreFigure_name = fig;
		}

		/**
		 * @generated
		 */
		private WrapLabel fDataStoreFigure_states;

		/**
		 * @generated
		 */
		public WrapLabel getFigureDataStoreFigure_states() {
			return fDataStoreFigure_states;
		}

		/**
		 * @generated
		 */
		private void setFigureDataStoreFigure_states(WrapLabel fig) {
			fDataStoreFigure_states = fig;
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
