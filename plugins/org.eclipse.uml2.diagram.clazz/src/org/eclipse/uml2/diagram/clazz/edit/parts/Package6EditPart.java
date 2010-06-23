package org.eclipse.uml2.diagram.clazz.edit.parts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.uml2.diagram.clazz.edit.policies.OpenDiagramEditPolicy;
import org.eclipse.uml2.diagram.clazz.edit.policies.Package6ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramUpdateCommand;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.common.async.AsyncDiagramComponentEditPolicy;
import org.eclipse.uml2.diagram.common.draw2d.PackageFrameFigure;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.common.editpolicies.U2TResizableShapeEditPolicy;
import org.eclipse.uml2.diagram.common.editpolicies.UpdateDescriptionEditPolicy;
import org.eclipse.uml2.diagram.common.genapi.IUpdaterLinkDescriptor;
import org.eclipse.uml2.diagram.common.genapi.IUpdaterNodeDescriptor;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Usage;

/**
 * @generated
 */
public class Package6EditPart extends ShapeNodeEditPart implements PrimaryShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3032;

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
	private LinkTargetListener myLinkTargetListener;

	/**
	 * @generated
	 */
	public Package6EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		if (UMLVisualIDRegistry.isShortcutDescendant(getNotationView())) {
			installEditPolicy(UpdateDescriptionEditPolicy.ROLE, new UpdateDescriptionEditPolicy(UMLDiagramUpdater.TYPED_ADAPTER, true));
		}
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Package6ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new AsyncDiagramComponentEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

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
		return primaryShape = new PackageAsFrameFigure();
	}

	/**
	 * @generated
	 */
	public PackageAsFrameFigure getPrimaryShape() {
		return (PackageAsFrameFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PackageName4EditPart) {
			((PackageName4EditPart) childEditPart).setLabel(getPrimaryShape().getPackageAsFrameFigure_name());
			return true;
		}
		if (childEditPart instanceof PackageAsFrameContents2EditPart) {
			IFigure pane = getPrimaryShape().getPackageAsFrameFigure_contents();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PackageAsFrameContents2EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof PackageAsFrameContents2EditPart) {
			IFigure pane = getPrimaryShape().getPackageAsFrameFigure_contents();
			pane.remove(((PackageAsFrameContents2EditPart) childEditPart).getFigure());
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
		if (editPart instanceof PackageAsFrameContents2EditPart) {
			return getPrimaryShape().getPackageAsFrameFigure_contents();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(300, 100);
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageName4EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(UMLElementTypes.Dependency_4002);
		types.add(UMLElementTypes.Realization_4010);
		types.add(UMLElementTypes.Usage_4013);
		types.add(UMLElementTypes.TemplateBinding_4016);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(8);
		types.add(UMLElementTypes.Dependency_4002);
		types.add(UMLElementTypes.ConstraintConstrainedElement_4004);
		types.add(UMLElementTypes.DependencySupplier_4006);
		types.add(UMLElementTypes.DependencyClient_4007);
		types.add(UMLElementTypes.Realization_4010);
		types.add(UMLElementTypes.Usage_4013);
		types.add(UMLElementTypes.TemplateBinding_4016);
		types.add(UMLElementTypes.CommentAnnotatedElement_4019);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof Package2EditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof Class2EditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof AssociationClass2EditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof DataType2EditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof PrimitiveType2EditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof Enumeration2EditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof ConstraintEditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof InstanceSpecification2EditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof DependencyEditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof GeneralizationSetEditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof Interface2EditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof Package4EditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof AssociationClassRhombEditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof PackageAsFrameEditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof InstanceSpecification4EditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof PortEditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof RedefinableTemplateSignatureEditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof org.eclipse.uml2.diagram.clazz.edit.parts.Package6EditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof Class5EditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof Enumeration3EditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof InstanceSpecification3EditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof DataType3EditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof PrimitiveType3EditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof Interface4EditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof Interface5EditPart) {
			types.add(UMLElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof Package2EditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof Class2EditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof AssociationClass2EditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof DataType2EditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof PrimitiveType2EditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof Enumeration2EditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof ConstraintEditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof InstanceSpecification2EditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof DependencyEditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof GeneralizationSetEditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof Interface2EditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof Package4EditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof AssociationClassRhombEditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof PackageAsFrameEditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof InstanceSpecification4EditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof PortEditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof RedefinableTemplateSignatureEditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof org.eclipse.uml2.diagram.clazz.edit.parts.Package6EditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof Class5EditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof Enumeration3EditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof InstanceSpecification3EditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof DataType3EditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof PrimitiveType3EditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof Interface4EditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof Interface5EditPart) {
			types.add(UMLElementTypes.Realization_4010);
		}
		if (targetEditPart instanceof Package2EditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof Class2EditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof AssociationClass2EditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof DataType2EditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof PrimitiveType2EditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof Enumeration2EditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof ConstraintEditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof InstanceSpecification2EditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof DependencyEditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof GeneralizationSetEditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof Interface2EditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof Package4EditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof AssociationClassRhombEditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof PackageAsFrameEditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof InstanceSpecification4EditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof PortEditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof RedefinableTemplateSignatureEditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof org.eclipse.uml2.diagram.clazz.edit.parts.Package6EditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof Class5EditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof Enumeration3EditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof InstanceSpecification3EditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof DataType3EditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof PrimitiveType3EditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof Interface4EditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof Interface5EditPart) {
			types.add(UMLElementTypes.Usage_4013);
		}
		if (targetEditPart instanceof Package2EditPart) {
			types.add(UMLElementTypes.TemplateBinding_4016);
		}
		if (targetEditPart instanceof Class2EditPart) {
			types.add(UMLElementTypes.TemplateBinding_4016);
		}
		if (targetEditPart instanceof AssociationClass2EditPart) {
			types.add(UMLElementTypes.TemplateBinding_4016);
		}
		if (targetEditPart instanceof DataType2EditPart) {
			types.add(UMLElementTypes.TemplateBinding_4016);
		}
		if (targetEditPart instanceof PrimitiveType2EditPart) {
			types.add(UMLElementTypes.TemplateBinding_4016);
		}
		if (targetEditPart instanceof Enumeration2EditPart) {
			types.add(UMLElementTypes.TemplateBinding_4016);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(UMLElementTypes.TemplateBinding_4016);
		}
		if (targetEditPart instanceof Interface2EditPart) {
			types.add(UMLElementTypes.TemplateBinding_4016);
		}
		if (targetEditPart instanceof Package4EditPart) {
			types.add(UMLElementTypes.TemplateBinding_4016);
		}
		if (targetEditPart instanceof AssociationClassRhombEditPart) {
			types.add(UMLElementTypes.TemplateBinding_4016);
		}
		if (targetEditPart instanceof PackageAsFrameEditPart) {
			types.add(UMLElementTypes.TemplateBinding_4016);
		}
		if (targetEditPart instanceof org.eclipse.uml2.diagram.clazz.edit.parts.Package6EditPart) {
			types.add(UMLElementTypes.TemplateBinding_4016);
		}
		if (targetEditPart instanceof Class5EditPart) {
			types.add(UMLElementTypes.TemplateBinding_4016);
		}
		if (targetEditPart instanceof Enumeration3EditPart) {
			types.add(UMLElementTypes.TemplateBinding_4016);
		}
		if (targetEditPart instanceof DataType3EditPart) {
			types.add(UMLElementTypes.TemplateBinding_4016);
		}
		if (targetEditPart instanceof PrimitiveType3EditPart) {
			types.add(UMLElementTypes.TemplateBinding_4016);
		}
		if (targetEditPart instanceof Interface4EditPart) {
			types.add(UMLElementTypes.TemplateBinding_4016);
		}
		if (targetEditPart instanceof Interface5EditPart) {
			types.add(UMLElementTypes.TemplateBinding_4016);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == UMLElementTypes.Dependency_4002) {
			types.add(UMLElementTypes.Package_2002);
			types.add(UMLElementTypes.Class_2001);
			types.add(UMLElementTypes.AssociationClass_2007);
			types.add(UMLElementTypes.DataType_2004);
			types.add(UMLElementTypes.PrimitiveType_2005);
			types.add(UMLElementTypes.Enumeration_2003);
			types.add(UMLElementTypes.Interface_2010);
			types.add(UMLElementTypes.Constraint_2006);
			types.add(UMLElementTypes.InstanceSpecification_2008);
			types.add(UMLElementTypes.Dependency_2009);
			types.add(UMLElementTypes.GeneralizationSet_2012);
			types.add(UMLElementTypes.Interface_2013);
			types.add(UMLElementTypes.Package_2014);
			types.add(UMLElementTypes.AssociationClass_2015);
			types.add(UMLElementTypes.Package_2016);
			types.add(UMLElementTypes.InstanceSpecification_2017);
			types.add(UMLElementTypes.Port_3025);
			types.add(UMLElementTypes.RedefinableTemplateSignature_3027);
			types.add(UMLElementTypes.Package_3032);
			types.add(UMLElementTypes.Class_3033);
			types.add(UMLElementTypes.Enumeration_3034);
			types.add(UMLElementTypes.InstanceSpecification_3035);
			types.add(UMLElementTypes.DataType_3036);
			types.add(UMLElementTypes.PrimitiveType_3037);
			types.add(UMLElementTypes.Interface_3042);
			types.add(UMLElementTypes.Interface_3043);
		} else if (relationshipType == UMLElementTypes.ConstraintConstrainedElement_4004) {
			types.add(UMLElementTypes.Constraint_2006);
		} else if (relationshipType == UMLElementTypes.DependencySupplier_4006) {
			types.add(UMLElementTypes.Dependency_2009);
		} else if (relationshipType == UMLElementTypes.DependencyClient_4007) {
			types.add(UMLElementTypes.Dependency_2009);
		} else if (relationshipType == UMLElementTypes.Realization_4010) {
			types.add(UMLElementTypes.Package_2002);
			types.add(UMLElementTypes.Class_2001);
			types.add(UMLElementTypes.AssociationClass_2007);
			types.add(UMLElementTypes.DataType_2004);
			types.add(UMLElementTypes.PrimitiveType_2005);
			types.add(UMLElementTypes.Enumeration_2003);
			types.add(UMLElementTypes.Interface_2010);
			types.add(UMLElementTypes.Constraint_2006);
			types.add(UMLElementTypes.InstanceSpecification_2008);
			types.add(UMLElementTypes.Dependency_2009);
			types.add(UMLElementTypes.GeneralizationSet_2012);
			types.add(UMLElementTypes.Interface_2013);
			types.add(UMLElementTypes.Package_2014);
			types.add(UMLElementTypes.AssociationClass_2015);
			types.add(UMLElementTypes.Package_2016);
			types.add(UMLElementTypes.InstanceSpecification_2017);
			types.add(UMLElementTypes.Port_3025);
			types.add(UMLElementTypes.RedefinableTemplateSignature_3027);
			types.add(UMLElementTypes.Package_3032);
			types.add(UMLElementTypes.Class_3033);
			types.add(UMLElementTypes.Enumeration_3034);
			types.add(UMLElementTypes.InstanceSpecification_3035);
			types.add(UMLElementTypes.DataType_3036);
			types.add(UMLElementTypes.PrimitiveType_3037);
			types.add(UMLElementTypes.Interface_3042);
			types.add(UMLElementTypes.Interface_3043);
		} else if (relationshipType == UMLElementTypes.Usage_4013) {
			types.add(UMLElementTypes.Package_2002);
			types.add(UMLElementTypes.Class_2001);
			types.add(UMLElementTypes.AssociationClass_2007);
			types.add(UMLElementTypes.DataType_2004);
			types.add(UMLElementTypes.PrimitiveType_2005);
			types.add(UMLElementTypes.Enumeration_2003);
			types.add(UMLElementTypes.Interface_2010);
			types.add(UMLElementTypes.Constraint_2006);
			types.add(UMLElementTypes.InstanceSpecification_2008);
			types.add(UMLElementTypes.Dependency_2009);
			types.add(UMLElementTypes.GeneralizationSet_2012);
			types.add(UMLElementTypes.Interface_2013);
			types.add(UMLElementTypes.Package_2014);
			types.add(UMLElementTypes.AssociationClass_2015);
			types.add(UMLElementTypes.Package_2016);
			types.add(UMLElementTypes.InstanceSpecification_2017);
			types.add(UMLElementTypes.Port_3025);
			types.add(UMLElementTypes.RedefinableTemplateSignature_3027);
			types.add(UMLElementTypes.Package_3032);
			types.add(UMLElementTypes.Class_3033);
			types.add(UMLElementTypes.Enumeration_3034);
			types.add(UMLElementTypes.InstanceSpecification_3035);
			types.add(UMLElementTypes.DataType_3036);
			types.add(UMLElementTypes.PrimitiveType_3037);
			types.add(UMLElementTypes.Interface_3042);
			types.add(UMLElementTypes.Interface_3043);
		} else if (relationshipType == UMLElementTypes.TemplateBinding_4016) {
			types.add(UMLElementTypes.Package_2002);
			types.add(UMLElementTypes.Class_2001);
			types.add(UMLElementTypes.AssociationClass_2007);
			types.add(UMLElementTypes.DataType_2004);
			types.add(UMLElementTypes.PrimitiveType_2005);
			types.add(UMLElementTypes.Enumeration_2003);
			types.add(UMLElementTypes.Interface_2010);
			types.add(UMLElementTypes.Interface_2013);
			types.add(UMLElementTypes.Package_2014);
			types.add(UMLElementTypes.AssociationClass_2015);
			types.add(UMLElementTypes.Package_2016);
			types.add(UMLElementTypes.Package_3032);
			types.add(UMLElementTypes.Class_3033);
			types.add(UMLElementTypes.Enumeration_3034);
			types.add(UMLElementTypes.DataType_3036);
			types.add(UMLElementTypes.PrimitiveType_3037);
			types.add(UMLElementTypes.Interface_3042);
			types.add(UMLElementTypes.Interface_3043);
		} else if (relationshipType == UMLElementTypes.CommentAnnotatedElement_4019) {
			types.add(UMLElementTypes.Comment_2018);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == UMLElementTypes.Dependency_4002) {
			types.add(UMLElementTypes.Package_2002);
			types.add(UMLElementTypes.Class_2001);
			types.add(UMLElementTypes.AssociationClass_2007);
			types.add(UMLElementTypes.DataType_2004);
			types.add(UMLElementTypes.PrimitiveType_2005);
			types.add(UMLElementTypes.Enumeration_2003);
			types.add(UMLElementTypes.Interface_2010);
			types.add(UMLElementTypes.Constraint_2006);
			types.add(UMLElementTypes.InstanceSpecification_2008);
			types.add(UMLElementTypes.Dependency_2009);
			types.add(UMLElementTypes.GeneralizationSet_2012);
			types.add(UMLElementTypes.Interface_2013);
			types.add(UMLElementTypes.Package_2014);
			types.add(UMLElementTypes.AssociationClass_2015);
			types.add(UMLElementTypes.Package_2016);
			types.add(UMLElementTypes.InstanceSpecification_2017);
			types.add(UMLElementTypes.Port_3025);
			types.add(UMLElementTypes.RedefinableTemplateSignature_3027);
			types.add(UMLElementTypes.Package_3032);
			types.add(UMLElementTypes.Class_3033);
			types.add(UMLElementTypes.Enumeration_3034);
			types.add(UMLElementTypes.InstanceSpecification_3035);
			types.add(UMLElementTypes.DataType_3036);
			types.add(UMLElementTypes.PrimitiveType_3037);
			types.add(UMLElementTypes.Interface_3042);
			types.add(UMLElementTypes.Interface_3043);
		} else if (relationshipType == UMLElementTypes.Realization_4010) {
			types.add(UMLElementTypes.Package_2002);
			types.add(UMLElementTypes.Class_2001);
			types.add(UMLElementTypes.AssociationClass_2007);
			types.add(UMLElementTypes.DataType_2004);
			types.add(UMLElementTypes.PrimitiveType_2005);
			types.add(UMLElementTypes.Enumeration_2003);
			types.add(UMLElementTypes.Interface_2010);
			types.add(UMLElementTypes.Constraint_2006);
			types.add(UMLElementTypes.InstanceSpecification_2008);
			types.add(UMLElementTypes.Dependency_2009);
			types.add(UMLElementTypes.GeneralizationSet_2012);
			types.add(UMLElementTypes.Interface_2013);
			types.add(UMLElementTypes.Package_2014);
			types.add(UMLElementTypes.AssociationClass_2015);
			types.add(UMLElementTypes.Package_2016);
			types.add(UMLElementTypes.InstanceSpecification_2017);
			types.add(UMLElementTypes.Port_3025);
			types.add(UMLElementTypes.RedefinableTemplateSignature_3027);
			types.add(UMLElementTypes.Package_3032);
			types.add(UMLElementTypes.Class_3033);
			types.add(UMLElementTypes.Enumeration_3034);
			types.add(UMLElementTypes.InstanceSpecification_3035);
			types.add(UMLElementTypes.DataType_3036);
			types.add(UMLElementTypes.PrimitiveType_3037);
			types.add(UMLElementTypes.Interface_3042);
			types.add(UMLElementTypes.Interface_3043);
		} else if (relationshipType == UMLElementTypes.Usage_4013) {
			types.add(UMLElementTypes.Package_2002);
			types.add(UMLElementTypes.Class_2001);
			types.add(UMLElementTypes.AssociationClass_2007);
			types.add(UMLElementTypes.DataType_2004);
			types.add(UMLElementTypes.PrimitiveType_2005);
			types.add(UMLElementTypes.Enumeration_2003);
			types.add(UMLElementTypes.Interface_2010);
			types.add(UMLElementTypes.Constraint_2006);
			types.add(UMLElementTypes.InstanceSpecification_2008);
			types.add(UMLElementTypes.Dependency_2009);
			types.add(UMLElementTypes.GeneralizationSet_2012);
			types.add(UMLElementTypes.Interface_2013);
			types.add(UMLElementTypes.Package_2014);
			types.add(UMLElementTypes.AssociationClass_2015);
			types.add(UMLElementTypes.Package_2016);
			types.add(UMLElementTypes.InstanceSpecification_2017);
			types.add(UMLElementTypes.Port_3025);
			types.add(UMLElementTypes.RedefinableTemplateSignature_3027);
			types.add(UMLElementTypes.Package_3032);
			types.add(UMLElementTypes.Class_3033);
			types.add(UMLElementTypes.Enumeration_3034);
			types.add(UMLElementTypes.InstanceSpecification_3035);
			types.add(UMLElementTypes.DataType_3036);
			types.add(UMLElementTypes.PrimitiveType_3037);
			types.add(UMLElementTypes.Interface_3042);
			types.add(UMLElementTypes.Interface_3043);
		} else if (relationshipType == UMLElementTypes.TemplateBinding_4016) {
			types.add(UMLElementTypes.Package_2002);
			types.add(UMLElementTypes.Class_2001);
			types.add(UMLElementTypes.AssociationClass_2007);
			types.add(UMLElementTypes.DataType_2004);
			types.add(UMLElementTypes.PrimitiveType_2005);
			types.add(UMLElementTypes.Enumeration_2003);
			types.add(UMLElementTypes.Interface_2010);
			types.add(UMLElementTypes.Interface_2013);
			types.add(UMLElementTypes.Package_2014);
			types.add(UMLElementTypes.AssociationClass_2015);
			types.add(UMLElementTypes.Package_2016);
			types.add(UMLElementTypes.Package_3032);
			types.add(UMLElementTypes.Class_3033);
			types.add(UMLElementTypes.Enumeration_3034);
			types.add(UMLElementTypes.DataType_3036);
			types.add(UMLElementTypes.PrimitiveType_3037);
			types.add(UMLElementTypes.Interface_3042);
			types.add(UMLElementTypes.Interface_3043);
		}
		return types;
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		handleTypeLinkModification(event);
	}

	/**
	 * @generated
	 */
	private DiagramEventBroker getDiagramEventBroker() {
		TransactionalEditingDomain theEditingDomain = getEditingDomain();
		if (theEditingDomain != null) {
			return DiagramEventBroker.getInstance(theEditingDomain);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private LinkTargetListener getLinkTargetListener() {
		if (myLinkTargetListener == null) {
			myLinkTargetListener = new LinkTargetListener();
		}
		return myLinkTargetListener;
	}

	/**
	 * @generated
	 */
	private class LinkTargetListener implements NotificationListener {

		/**
		 * @generated
		 */
		Map<EObject, Set<EStructuralFeature>> myNotifiers = new HashMap<EObject, Set<EStructuralFeature>>();

		/**
		 * @generated
		 */
		private void added(EObject link, EStructuralFeature feature) {
			if (!myNotifiers.containsKey(link)) {
				myNotifiers.put(link, new HashSet<EStructuralFeature>());
			}
			myNotifiers.get(link).add(feature);
		}

		/**
		 * @generated
		 */
		private void removed(EObject link, EStructuralFeature feature) {
			if (!myNotifiers.containsKey(link)) {
				return;
			}
			myNotifiers.get(link).remove(feature);
		}

		/**
		 * @generated
		 */
		public void dispose() {
			Set<Map.Entry<EObject, Set<EStructuralFeature>>> entrySet = myNotifiers.entrySet();
			for (Map.Entry<EObject, Set<EStructuralFeature>> entry : entrySet) {
				for (EStructuralFeature feature : entry.getValue()) {
					getDiagramEventBroker().removeNotificationListener(entry.getKey(), feature, this);
				}
			}
		}

		/**
		 * @generated
		 */
		private void removeReferenceListener(EObject link, EStructuralFeature feature) {
			getDiagramEventBroker().removeNotificationListener(link, feature, this);
			removed(link, feature);
		}

		/**
		 * @generated
		 */
		private void addReferenceListener(EObject link, EStructuralFeature feature) {
			getDiagramEventBroker().addNotificationListener(link, feature, this);
			added(link, feature);
		}

		/**
		 * @generated
		 */
		public void notifyChanged(Notification event) {
			if (event.getFeature() == UMLPackage.eINSTANCE.getDependency_Supplier()) {
				guardedRefreshDiagram();
				return;
			}
			if (event.getFeature() == UMLPackage.eINSTANCE.getDependency_Supplier()) {
				guardedRefreshDiagram();
				return;
			}
			if (event.getFeature() == UMLPackage.eINSTANCE.getDependency_Supplier()) {
				guardedRefreshDiagram();
				return;
			}
			if (event.getFeature() == UMLPackage.eINSTANCE.getTemplateSignature_Template()) {
				guardedRefreshDiagram();
				return;
			}
		}
	}

	/**
	 * @generated
	 */
	protected void addSemanticListeners() {
		super.addSemanticListeners();
		for (IUpdaterNodeDescriptor next : getPackage_3032ContainedLinks()) {
			EObject nextLink = next.getModelElement();
			if (nextLink == null) {
				continue;
			}
			switch (next.getVisualID()) {
			case Dependency2EditPart.VISUAL_ID:
				getLinkTargetListener().addReferenceListener(nextLink, UMLPackage.eINSTANCE.getDependency_Supplier());
				break;

			case RealizationEditPart.VISUAL_ID:
				getLinkTargetListener().addReferenceListener(nextLink, UMLPackage.eINSTANCE.getDependency_Supplier());
				break;

			case UsageEditPart.VISUAL_ID:
				getLinkTargetListener().addReferenceListener(nextLink, UMLPackage.eINSTANCE.getDependency_Supplier());
				break;

			case TemplateBindingEditPart.VISUAL_ID:
				getLinkTargetListener().addReferenceListener(nextLink, UMLPackage.eINSTANCE.getTemplateSignature_Template());
				break;

			default:
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private List<? extends IUpdaterLinkDescriptor> getPackage_3032ContainedLinks() {
		return UMLDiagramUpdater.getPackage_3032ContainedLinks(getNotationView());
	}

	/**
	 * @generated
	 */
	protected void removeSemanticListeners() {
		super.removeSemanticListeners();
		getLinkTargetListener().dispose();
	}

	/**
	 * @generated
	 */
	private void handleTypeLinkModification(Notification event) {
		if (event.getFeature() == UMLPackage.eINSTANCE.getPackage_PackagedElement()) {
			switch (event.getEventType()) {
			case Notification.ADD: {
				Object link = event.getNewValue();
				if (link instanceof Dependency) {
					getLinkTargetListener().addReferenceListener((EObject) link, UMLPackage.eINSTANCE.getDependency_Supplier());
				}
				if (link instanceof Realization) {
					getLinkTargetListener().addReferenceListener((EObject) link, UMLPackage.eINSTANCE.getDependency_Supplier());
				}
				if (link instanceof Usage) {
					getLinkTargetListener().addReferenceListener((EObject) link, UMLPackage.eINSTANCE.getDependency_Supplier());
				}
				if (link instanceof Dependency || link instanceof Realization || link instanceof Usage) {
					guardedRefreshDiagram();
				}
				break;
			}
			case Notification.REMOVE: {
				Object link = event.getOldValue();
				if (link instanceof Dependency) {
					getLinkTargetListener().removeReferenceListener((EObject) link, UMLPackage.eINSTANCE.getDependency_Supplier());
				}
				if (link instanceof Realization) {
					getLinkTargetListener().removeReferenceListener((EObject) link, UMLPackage.eINSTANCE.getDependency_Supplier());
				}
				if (link instanceof Usage) {
					getLinkTargetListener().removeReferenceListener((EObject) link, UMLPackage.eINSTANCE.getDependency_Supplier());
				}
				if (link instanceof Dependency || link instanceof Realization || link instanceof Usage) {
					guardedRefreshDiagram();
				}
				break;
			}
			case Notification.ADD_MANY: {
				List<?> links = (List<?>) event.getNewValue();
				for (Object link : links) {
					if (link instanceof Dependency) {
						getLinkTargetListener().addReferenceListener((EObject) link, UMLPackage.eINSTANCE.getDependency_Supplier());
					}
					if (link instanceof Realization) {
						getLinkTargetListener().addReferenceListener((EObject) link, UMLPackage.eINSTANCE.getDependency_Supplier());
					}
					if (link instanceof Usage) {
						getLinkTargetListener().addReferenceListener((EObject) link, UMLPackage.eINSTANCE.getDependency_Supplier());
					}
				}
				for (Object link : links) {
					if (link instanceof Dependency || link instanceof Realization || link instanceof Usage) {
						guardedRefreshDiagram();
						break;
					}
				}
				break;
			}
			case Notification.REMOVE_MANY: {
				List<?> links = (List<?>) event.getOldValue();
				for (Object link : links) {
					if (link instanceof Dependency) {
						getLinkTargetListener().removeReferenceListener((EObject) link, UMLPackage.eINSTANCE.getDependency_Supplier());
					}
					if (link instanceof Realization) {
						getLinkTargetListener().removeReferenceListener((EObject) link, UMLPackage.eINSTANCE.getDependency_Supplier());
					}
					if (link instanceof Usage) {
						getLinkTargetListener().removeReferenceListener((EObject) link, UMLPackage.eINSTANCE.getDependency_Supplier());
					}
				}
				for (Object link : links) {
					if (link instanceof Dependency || link instanceof Realization || link instanceof Usage) {
						guardedRefreshDiagram();
						break;
					}
				}
				break;
			}
			}
		}
		if (event.getFeature() == UMLPackage.eINSTANCE.getTemplateableElement_TemplateBinding()) {
			switch (event.getEventType()) {
			case Notification.ADD: {
				Object link = event.getNewValue();
				if (link instanceof TemplateBinding) {
					getLinkTargetListener().addReferenceListener((EObject) link, UMLPackage.eINSTANCE.getTemplateSignature_Template());
				}
				if (link instanceof TemplateBinding) {
					guardedRefreshDiagram();
				}
				break;
			}
			case Notification.REMOVE: {
				Object link = event.getOldValue();
				if (link instanceof TemplateBinding) {
					getLinkTargetListener().removeReferenceListener((EObject) link, UMLPackage.eINSTANCE.getTemplateSignature_Template());
				}
				if (link instanceof TemplateBinding) {
					guardedRefreshDiagram();
				}
				break;
			}
			case Notification.ADD_MANY: {
				List<?> links = (List<?>) event.getNewValue();
				for (Object link : links) {
					if (link instanceof TemplateBinding) {
						getLinkTargetListener().addReferenceListener((EObject) link, UMLPackage.eINSTANCE.getTemplateSignature_Template());
					}
				}
				for (Object link : links) {
					if (link instanceof TemplateBinding) {
						guardedRefreshDiagram();
						break;
					}
				}
				break;
			}
			case Notification.REMOVE_MANY: {
				List<?> links = (List<?>) event.getOldValue();
				for (Object link : links) {
					if (link instanceof TemplateBinding) {
						getLinkTargetListener().removeReferenceListener((EObject) link, UMLPackage.eINSTANCE.getTemplateSignature_Template());
					}
				}
				for (Object link : links) {
					if (link instanceof TemplateBinding) {
						guardedRefreshDiagram();
						break;
					}
				}
				break;
			}
			}
		}
	}

	/**
	 * @generated
	 */
	private boolean isCanonicalDisabled() {
		if (isCanonicalDisabled(getEditPolicy(EditPolicyRoles.CANONICAL_ROLE))) {
			return true;
		}
		if (getParent() != null && isCanonicalDisabled(getParent().getEditPolicy(EditPolicyRoles.CANONICAL_ROLE))) {
			return true;
		}
		//this particular edit part may not have editpolicy at all, 
		//but its compartments still may have it
		EObject semantic = resolveSemanticElement();
		if (semantic != null) {
			for (Object next : CanonicalEditPolicy.getRegisteredEditPolicies(semantic)) {
				if (next instanceof EditPolicy) {
					EditPolicy nextEP = (EditPolicy) next;
					if (isCanonicalDisabled(nextEP)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static boolean isCanonicalDisabled(EditPolicy editPolicy) {
		return editPolicy instanceof CanonicalEditPolicy && !((CanonicalEditPolicy) editPolicy).isEnabled();
	}

	/**
	 * @generated
	 */
	private void guardedRefreshDiagram() {
		if (!isCanonicalDisabled()) {
			UMLDiagramUpdateCommand.performCanonicalUpdate(getDiagramView().getElement());
		}
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateUnspecifiedTypeRequest) {
			CreateUnspecifiedTypeRequest unspecifiedRequest = (CreateUnspecifiedTypeRequest) request;
			List<IElementType> types = unspecifiedRequest.getElementTypes();
			if (types.contains(UMLElementTypes.Package_3032)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageAsFrameContents2EditPart.VISUAL_ID));
			}
			if (types.contains(UMLElementTypes.Class_3033)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageAsFrameContents2EditPart.VISUAL_ID));
			}
			if (types.contains(UMLElementTypes.Enumeration_3034)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageAsFrameContents2EditPart.VISUAL_ID));
			}
			if (types.contains(UMLElementTypes.InstanceSpecification_3035)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageAsFrameContents2EditPart.VISUAL_ID));
			}
			if (types.contains(UMLElementTypes.DataType_3036)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageAsFrameContents2EditPart.VISUAL_ID));
			}
			if (types.contains(UMLElementTypes.PrimitiveType_3037)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageAsFrameContents2EditPart.VISUAL_ID));
			}
			if (types.contains(UMLElementTypes.Interface_3042)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageAsFrameContents2EditPart.VISUAL_ID));
			}
			if (types.contains(UMLElementTypes.Interface_3043)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageAsFrameContents2EditPart.VISUAL_ID));
			}
		}

		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class PackageAsFrameFigure extends PackageFrameFigure {

		/**
		 * @generated
		 */
		public PackageAsFrameFigure() {

			this.setKindLabelText("package");

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
		 * @generated
		 */
		public Label getPackageAsFrameFigure_name() {
			return getNameLabel();
		}

		/**
		 * @generated
		 */
		public Label getPackageAsFrameFigure_fixed_package() {
			return getKindLabel();
		}

		/**
		 * @generated
		 */
		public RectangleFigure getPackageAsFrameFigure_contents() {
			return getContentPane();
		}

	}

}
