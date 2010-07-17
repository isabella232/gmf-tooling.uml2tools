package org.eclipse.uml2.diagram.csd.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.uml2.diagram.common.async.AsyncDiagramComponentEditPolicy;
import org.eclipse.uml2.diagram.common.draw2d.NameAndStereotypeBlock;
import org.eclipse.uml2.diagram.common.draw2d.StereotypeLabel2;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.common.editpolicies.CreationEditPolicyWithCustomReparent;
import org.eclipse.uml2.diagram.common.editpolicies.U2TResizableShapeEditPolicy;
import org.eclipse.uml2.diagram.common.editpolicies.UpdateDescriptionEditPolicy;
import org.eclipse.uml2.diagram.common.links.RefreshComplementaryLinksHelper;
import org.eclipse.uml2.diagram.csd.edit.policies.Interface2ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.csd.edit.policies.UMLTextSelectionEditPolicy;
import org.eclipse.uml2.diagram.csd.links.DiagramLinkInfoProvider;
import org.eclipse.uml2.diagram.csd.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.csd.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.csd.providers.UMLElementTypes;

/**
 * @generated
 */
public class Interface2EditPart extends ShapeNodeEditPart implements PrimaryShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2014;

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
	public Interface2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		if (UMLVisualIDRegistry.isShortcutDescendant(getNotationView())) {
			installEditPolicy(UpdateDescriptionEditPolicy.ROLE, new UpdateDescriptionEditPolicy(UMLDiagramUpdater.TYPED_ADAPTER, true));
		}
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(UMLVisualIDRegistry.TYPED_ADAPTER));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Interface2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new AsyncDiagramComponentEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new UMLTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ClassFigure();
	}

	/**
	 * @generated
	 */
	public ClassFigure getPrimaryShape() {
		return (ClassFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InterfaceName2EditPart) {
			((InterfaceName2EditPart) childEditPart).setLabel(getPrimaryShape().getFigureClassFigure_NameLabel());
			return true;
		}
		if (childEditPart instanceof InterfaceStereotypeEditPart) {
			((InterfaceStereotypeEditPart) childEditPart).setLabel(getPrimaryShape().getFigureClassFigure_StereoLabel());
			return true;
		}
		if (childEditPart instanceof InterfaceAttributesEditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_PropertiesCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((InterfaceAttributesEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof InterfaceOperationsEditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_OperationsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((InterfaceOperationsEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof InterfaceClassesEditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_ClassesCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((InterfaceClassesEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof InterfaceAttributesEditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_PropertiesCompartment();
			pane.remove(((InterfaceAttributesEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof InterfaceOperationsEditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_OperationsCompartment();
			pane.remove(((InterfaceOperationsEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof InterfaceClassesEditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_ClassesCompartment();
			pane.remove(((InterfaceClassesEditPart) childEditPart).getFigure());
			return true;
		}
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
		if (editPart instanceof InterfaceAttributesEditPart) {
			return getPrimaryShape().getFigureClassFigure_PropertiesCompartment();
		}
		if (editPart instanceof InterfaceOperationsEditPart) {
			return getPrimaryShape().getFigureClassFigure_OperationsCompartment();
		}
		if (editPart instanceof InterfaceClassesEditPart) {
			return getPrimaryShape().getFigureClassFigure_ClassesCompartment();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 60);
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		// #265822 Improve appearance of selection feedback
		ResizableEditPolicy result = new U2TResizableShapeEditPolicy();
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
			layout.setSpacing(5);
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
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(InterfaceName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(UMLElementTypes.Dependency_4006);
		types.add(UMLElementTypes.Usage_4008);
		types.add(UMLElementTypes.Association_4011);
		types.add(UMLElementTypes.Dependency_4017);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof CollaborationEditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof ClassEditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof Package2EditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof Class3EditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof InstanceSpecificationEditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof ConstraintEditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof org.eclipse.uml2.diagram.csd.edit.parts.Interface2EditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof CollaborationUse2EditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof PropertyEditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof PortEditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof Property3EditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof Port2EditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof Port3EditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof CollaborationEditPart) {
			types.add(UMLElementTypes.Usage_4008);
		}
		if (targetEditPart instanceof ClassEditPart) {
			types.add(UMLElementTypes.Usage_4008);
		}
		if (targetEditPart instanceof Package2EditPart) {
			types.add(UMLElementTypes.Usage_4008);
		}
		if (targetEditPart instanceof Class3EditPart) {
			types.add(UMLElementTypes.Usage_4008);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(UMLElementTypes.Usage_4008);
		}
		if (targetEditPart instanceof InstanceSpecificationEditPart) {
			types.add(UMLElementTypes.Usage_4008);
		}
		if (targetEditPart instanceof ConstraintEditPart) {
			types.add(UMLElementTypes.Usage_4008);
		}
		if (targetEditPart instanceof org.eclipse.uml2.diagram.csd.edit.parts.Interface2EditPart) {
			types.add(UMLElementTypes.Usage_4008);
		}
		if (targetEditPart instanceof CollaborationUse2EditPart) {
			types.add(UMLElementTypes.Usage_4008);
		}
		if (targetEditPart instanceof PropertyEditPart) {
			types.add(UMLElementTypes.Usage_4008);
		}
		if (targetEditPart instanceof PortEditPart) {
			types.add(UMLElementTypes.Usage_4008);
		}
		if (targetEditPart instanceof Property3EditPart) {
			types.add(UMLElementTypes.Usage_4008);
		}
		if (targetEditPart instanceof Port2EditPart) {
			types.add(UMLElementTypes.Usage_4008);
		}
		if (targetEditPart instanceof Port3EditPart) {
			types.add(UMLElementTypes.Usage_4008);
		}
		if (targetEditPart instanceof CollaborationEditPart) {
			types.add(UMLElementTypes.Association_4011);
		}
		if (targetEditPart instanceof ClassEditPart) {
			types.add(UMLElementTypes.Association_4011);
		}
		if (targetEditPart instanceof Class3EditPart) {
			types.add(UMLElementTypes.Association_4011);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(UMLElementTypes.Association_4011);
		}
		if (targetEditPart instanceof org.eclipse.uml2.diagram.csd.edit.parts.Interface2EditPart) {
			types.add(UMLElementTypes.Association_4011);
		}
		if (targetEditPart instanceof CollaborationEditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if (targetEditPart instanceof ClassEditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if (targetEditPart instanceof Package2EditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if (targetEditPart instanceof Class3EditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if (targetEditPart instanceof InstanceSpecificationEditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if (targetEditPart instanceof ConstraintEditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if (targetEditPart instanceof org.eclipse.uml2.diagram.csd.edit.parts.Interface2EditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if (targetEditPart instanceof CollaborationUse2EditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if (targetEditPart instanceof PropertyEditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if (targetEditPart instanceof PortEditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if (targetEditPart instanceof Property3EditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if (targetEditPart instanceof Port2EditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		if (targetEditPart instanceof Port3EditPart) {
			types.add(UMLElementTypes.Dependency_4017);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.Collaboration_2005);
			types.add(UMLElementTypes.Class_2006);
			types.add(UMLElementTypes.Package_2003);
			types.add(UMLElementTypes.Class_2007);
			types.add(UMLElementTypes.Interface_2009);
			types.add(UMLElementTypes.InstanceSpecification_2011);
			types.add(UMLElementTypes.Constraint_2012);
			types.add(UMLElementTypes.Interface_2014);
			types.add(UMLElementTypes.CollaborationUse_3002);
			types.add(UMLElementTypes.Property_3007);
			types.add(UMLElementTypes.Port_3011);
			types.add(UMLElementTypes.Property_3014);
			types.add(UMLElementTypes.Port_3016);
			types.add(UMLElementTypes.Port_3017);
		} else if (relationshipType == UMLElementTypes.Usage_4008) {
			types.add(UMLElementTypes.Collaboration_2005);
			types.add(UMLElementTypes.Class_2006);
			types.add(UMLElementTypes.Package_2003);
			types.add(UMLElementTypes.Class_2007);
			types.add(UMLElementTypes.Interface_2009);
			types.add(UMLElementTypes.InstanceSpecification_2011);
			types.add(UMLElementTypes.Constraint_2012);
			types.add(UMLElementTypes.Interface_2014);
			types.add(UMLElementTypes.CollaborationUse_3002);
			types.add(UMLElementTypes.Property_3007);
			types.add(UMLElementTypes.Port_3011);
			types.add(UMLElementTypes.Property_3014);
			types.add(UMLElementTypes.Port_3016);
			types.add(UMLElementTypes.Port_3017);
		} else if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Collaboration_2005);
			types.add(UMLElementTypes.Class_2006);
			types.add(UMLElementTypes.Class_2007);
			types.add(UMLElementTypes.Interface_2009);
			types.add(UMLElementTypes.Interface_2014);
		} else if (relationshipType == UMLElementTypes.Dependency_4017) {
			types.add(UMLElementTypes.Collaboration_2005);
			types.add(UMLElementTypes.Class_2006);
			types.add(UMLElementTypes.Package_2003);
			types.add(UMLElementTypes.Class_2007);
			types.add(UMLElementTypes.Interface_2009);
			types.add(UMLElementTypes.InstanceSpecification_2011);
			types.add(UMLElementTypes.Constraint_2012);
			types.add(UMLElementTypes.Interface_2014);
			types.add(UMLElementTypes.CollaborationUse_3002);
			types.add(UMLElementTypes.Property_3007);
			types.add(UMLElementTypes.Port_3011);
			types.add(UMLElementTypes.Property_3014);
			types.add(UMLElementTypes.Port_3016);
			types.add(UMLElementTypes.Port_3017);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(9);
		types.add(UMLElementTypes.Dependency_4006);
		types.add(UMLElementTypes.InterfaceRealization_4007);
		types.add(UMLElementTypes.Usage_4008);
		types.add(UMLElementTypes.PortProvided_4010);
		types.add(UMLElementTypes.Association_4011);
		types.add(UMLElementTypes.ConstraintConstrainedElement_4012);
		types.add(UMLElementTypes.PortRequired_4014);
		types.add(UMLElementTypes.CommentAnnotatedElement_4016);
		types.add(UMLElementTypes.Dependency_4017);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.Collaboration_2005);
			types.add(UMLElementTypes.Class_2006);
			types.add(UMLElementTypes.Package_2003);
			types.add(UMLElementTypes.Class_2007);
			types.add(UMLElementTypes.Interface_2009);
			types.add(UMLElementTypes.InstanceSpecification_2011);
			types.add(UMLElementTypes.Constraint_2012);
			types.add(UMLElementTypes.Interface_2014);
			types.add(UMLElementTypes.CollaborationUse_3002);
			types.add(UMLElementTypes.Property_3007);
			types.add(UMLElementTypes.Port_3011);
			types.add(UMLElementTypes.Property_3014);
			types.add(UMLElementTypes.Port_3016);
			types.add(UMLElementTypes.Port_3017);
		} else if (relationshipType == UMLElementTypes.InterfaceRealization_4007) {
			types.add(UMLElementTypes.Collaboration_2005);
			types.add(UMLElementTypes.Class_2006);
			types.add(UMLElementTypes.Class_2007);
		} else if (relationshipType == UMLElementTypes.Usage_4008) {
			types.add(UMLElementTypes.Collaboration_2005);
			types.add(UMLElementTypes.Class_2006);
			types.add(UMLElementTypes.Package_2003);
			types.add(UMLElementTypes.Class_2007);
			types.add(UMLElementTypes.Interface_2009);
			types.add(UMLElementTypes.InstanceSpecification_2011);
			types.add(UMLElementTypes.Constraint_2012);
			types.add(UMLElementTypes.Interface_2014);
			types.add(UMLElementTypes.CollaborationUse_3002);
			types.add(UMLElementTypes.Property_3007);
			types.add(UMLElementTypes.Port_3011);
			types.add(UMLElementTypes.Property_3014);
			types.add(UMLElementTypes.Port_3016);
			types.add(UMLElementTypes.Port_3017);
		} else if (relationshipType == UMLElementTypes.PortProvided_4010) {
			types.add(UMLElementTypes.Port_3011);
			types.add(UMLElementTypes.Port_3016);
			types.add(UMLElementTypes.Port_3017);
		} else if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Collaboration_2005);
			types.add(UMLElementTypes.Class_2006);
			types.add(UMLElementTypes.Class_2007);
			types.add(UMLElementTypes.Interface_2009);
			types.add(UMLElementTypes.Interface_2014);
		} else if (relationshipType == UMLElementTypes.ConstraintConstrainedElement_4012) {
			types.add(UMLElementTypes.Constraint_2012);
		} else if (relationshipType == UMLElementTypes.PortRequired_4014) {
			types.add(UMLElementTypes.Port_3011);
			types.add(UMLElementTypes.Port_3016);
			types.add(UMLElementTypes.Port_3017);
		} else if (relationshipType == UMLElementTypes.CommentAnnotatedElement_4016) {
			types.add(UMLElementTypes.Comment_2013);
		} else if (relationshipType == UMLElementTypes.Dependency_4017) {
			types.add(UMLElementTypes.Collaboration_2005);
			types.add(UMLElementTypes.Class_2006);
			types.add(UMLElementTypes.Package_2003);
			types.add(UMLElementTypes.Class_2007);
			types.add(UMLElementTypes.Interface_2009);
			types.add(UMLElementTypes.InstanceSpecification_2011);
			types.add(UMLElementTypes.Constraint_2012);
			types.add(UMLElementTypes.Interface_2014);
			types.add(UMLElementTypes.CollaborationUse_3002);
			types.add(UMLElementTypes.Property_3007);
			types.add(UMLElementTypes.Port_3011);
			types.add(UMLElementTypes.Property_3014);
			types.add(UMLElementTypes.Port_3016);
			types.add(UMLElementTypes.Port_3017);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor().getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == UMLElementTypes.Property_3018) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(InterfaceAttributesEditPart.VISUAL_ID));
			}
			if (type == UMLElementTypes.Operation_3019) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(InterfaceOperationsEditPart.VISUAL_ID));
			}
			if (type == UMLElementTypes.Class_3020) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(InterfaceClassesEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated NOT
	 */
	protected void handleNotificationEvent(Notification event) {
		handleNotificationEventGen(event);
		RefreshComplementaryLinksHelper.getInstance().handleNotification(this, event, DiagramLinkInfoProvider.getInstance());
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEventGen(Notification event) {
		if (event.getNotifier() == getModel() && EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class ClassFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureClassFigure_PropertiesCompartment;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureClassFigure_OperationsCompartment;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureClassFigure_ClassesCompartment;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureClassFigure_LiteralsCompartment;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureClassFigure_OthersCompartment;

		/**
		 * @generated
		 */
		private NameAndStereotypeBlock fNameAndStereotypeBlock;

		/**
		 * @generated
		 */
		public ClassFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutThis.setSpacing(0);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			this.setLineWidth(1);

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(1), getMapMode().DPtoLP(1), getMapMode().DPtoLP(10), getMapMode().DPtoLP(1)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fNameAndStereotypeBlock = new NameAndStereotypeBlock();

			fNameAndStereotypeBlock.setBorder(new MarginBorder(getMapMode().DPtoLP(8), getMapMode().DPtoLP(5), getMapMode().DPtoLP(6), getMapMode().DPtoLP(5)));

			this.add(fNameAndStereotypeBlock);

			fFigureClassFigure_PropertiesCompartment = new RectangleFigure();
			fFigureClassFigure_PropertiesCompartment.setOutline(false);
			fFigureClassFigure_PropertiesCompartment.setLineWidth(1);

			this.add(fFigureClassFigure_PropertiesCompartment);

			StackLayout layoutFFigureClassFigure_PropertiesCompartment = new StackLayout();

			layoutFFigureClassFigure_PropertiesCompartment.setObserveVisibility(true);

			fFigureClassFigure_PropertiesCompartment.setLayoutManager(layoutFFigureClassFigure_PropertiesCompartment);

			fFigureClassFigure_OperationsCompartment = new RectangleFigure();
			fFigureClassFigure_OperationsCompartment.setOutline(false);
			fFigureClassFigure_OperationsCompartment.setLineWidth(1);

			this.add(fFigureClassFigure_OperationsCompartment);

			StackLayout layoutFFigureClassFigure_OperationsCompartment = new StackLayout();

			layoutFFigureClassFigure_OperationsCompartment.setObserveVisibility(true);

			fFigureClassFigure_OperationsCompartment.setLayoutManager(layoutFFigureClassFigure_OperationsCompartment);

			fFigureClassFigure_ClassesCompartment = new RectangleFigure();
			fFigureClassFigure_ClassesCompartment.setOutline(false);
			fFigureClassFigure_ClassesCompartment.setLineWidth(1);

			this.add(fFigureClassFigure_ClassesCompartment);

			StackLayout layoutFFigureClassFigure_ClassesCompartment = new StackLayout();

			layoutFFigureClassFigure_ClassesCompartment.setObserveVisibility(true);

			fFigureClassFigure_ClassesCompartment.setLayoutManager(layoutFFigureClassFigure_ClassesCompartment);

			fFigureClassFigure_LiteralsCompartment = new RectangleFigure();
			fFigureClassFigure_LiteralsCompartment.setOutline(false);
			fFigureClassFigure_LiteralsCompartment.setLineWidth(1);

			this.add(fFigureClassFigure_LiteralsCompartment);

			StackLayout layoutFFigureClassFigure_LiteralsCompartment = new StackLayout();

			layoutFFigureClassFigure_LiteralsCompartment.setObserveVisibility(true);

			fFigureClassFigure_LiteralsCompartment.setLayoutManager(layoutFFigureClassFigure_LiteralsCompartment);

			fFigureClassFigure_OthersCompartment = new RectangleFigure();
			fFigureClassFigure_OthersCompartment.setOutline(false);
			fFigureClassFigure_OthersCompartment.setLineWidth(1);

			this.add(fFigureClassFigure_OthersCompartment);

			StackLayout layoutFFigureClassFigure_OthersCompartment = new StackLayout();

			layoutFFigureClassFigure_OthersCompartment.setObserveVisibility(true);

			fFigureClassFigure_OthersCompartment.setLayoutManager(layoutFFigureClassFigure_OthersCompartment);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureClassFigure_PropertiesCompartment() {
			return fFigureClassFigure_PropertiesCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureClassFigure_OperationsCompartment() {
			return fFigureClassFigure_OperationsCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureClassFigure_ClassesCompartment() {
			return fFigureClassFigure_ClassesCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureClassFigure_LiteralsCompartment() {
			return fFigureClassFigure_LiteralsCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureClassFigure_OthersCompartment() {
			return fFigureClassFigure_OthersCompartment;
		}

		/**
		 * @generated
		 */
		public NameAndStereotypeBlock getNameAndStereotypeBlock() {
			return fNameAndStereotypeBlock;
		}

		/**
		 * @generated
		 */
		public StereotypeLabel2 getFigureClassFigure_StereoLabel() {
			return getNameAndStereotypeBlock().getStereotypeLabel();
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClassFigure_NameLabel() {
			return getNameAndStereotypeBlock().getNameLabel();
		}

	}

	/**
	 * @generated
	 */
	protected void performDirectEditRequest(final Request request) {
		EditPart editPart = this;
		if (request instanceof DirectEditRequest) {
			Point p = new Point(((DirectEditRequest) request).getLocation());
			getFigure().translateToRelative(p);
			IFigure fig = getFigure().findFigureAt(p);
			editPart = (EditPart) getViewer().getVisualPartMap().get(fig);
		}
		if (editPart == this) {
			try {
				editPart = (EditPart) getEditingDomain().runExclusive(new RunnableWithResult.Impl() {

					public void run() {
						setResult(chooseLabelEditPartForDirectEditRequest(request));
					}
				});
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (editPart != null && editPart != this) {
				editPart.performRequest(request);
			}
		}
	}

	/**
	 * @generated
	 */
	protected EditPart chooseLabelEditPartForDirectEditRequest(Request request) {
		if (request.getExtendedData().containsKey(RequestConstants.REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR)) {
			Character initialChar = (Character) request.getExtendedData().get(RequestConstants.REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR);
			// '<' has special meaning, because we have both name- and stereo- inplaces for single node edit part
			// we want to activate stereotype inplace if user presses '<' (for "<< stereotype >>" 
			// notation, also we don't include '<' and '>' into actual inplace text).
			// If user presses any other alfanum key, we will activate name-inplace, as for all other figures

			if (initialChar.charValue() == '<') {
				EditPart result = getChildBySemanticHint(UMLVisualIDRegistry.getType(InterfaceStereotypeEditPart.VISUAL_ID));
				if (result != null) {
					return result;
				}
			}
		}
		return getPrimaryChildEditPart();
	}

}
