package org.eclipse.uml2.diagram.clazz.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClass2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class5EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataType2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataType3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Enumeration2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Enumeration3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationSetEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecification2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecification3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageAsFrameContents2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageAsFrameContentsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveType2EditPart;

import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveType3EditPart;
import org.eclipse.uml2.diagram.clazz.part.Messages;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramEditorPlugin;

/**
 * @generated
 */
public class UMLModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof Package2EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.Package_3006);
			types.add(UMLElementTypes.Class_3007);
			types.add(UMLElementTypes.DataType_3008);
			types.add(UMLElementTypes.PrimitiveType_3009);
			types.add(UMLElementTypes.Enumeration_3011);
			types.add(UMLElementTypes.AssociationClass_3012);
			types.add(UMLElementTypes.InstanceSpecification_3013);
			return types;
		}
		if (editPart instanceof Class2EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.Port_3025);
			types.add(UMLElementTypes.RedefinableTemplateSignature_3027);
			types.add(UMLElementTypes.Property_3001);
			types.add(UMLElementTypes.Operation_3002);
			types.add(UMLElementTypes.Class_3003);
			return types;
		}
		if (editPart instanceof AssociationClass2EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.RedefinableTemplateSignature_3027);
			types.add(UMLElementTypes.Property_3019);
			types.add(UMLElementTypes.Operation_3020);
			types.add(UMLElementTypes.Class_3003);
			return types;
		}
		if (editPart instanceof DataType2EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.RedefinableTemplateSignature_3027);
			types.add(UMLElementTypes.Property_3014);
			types.add(UMLElementTypes.Operation_3015);
			return types;
		}
		if (editPart instanceof PrimitiveType2EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.RedefinableTemplateSignature_3027);
			types.add(UMLElementTypes.Property_3021);
			types.add(UMLElementTypes.Operation_3022);
			return types;
		}
		if (editPart instanceof Enumeration2EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.RedefinableTemplateSignature_3027);
			types.add(UMLElementTypes.EnumerationLiteral_3016);
			types.add(UMLElementTypes.Property_3023);
			types.add(UMLElementTypes.Operation_3024);
			return types;
		}
		if (editPart instanceof InstanceSpecification2EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.Slot_3017);
			return types;
		}
		if (editPart instanceof Interface2EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.Property_3028);
			types.add(UMLElementTypes.Operation_3029);
			types.add(UMLElementTypes.Class_3030);
			return types;
		}
		if (editPart instanceof Package4EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.ElementImport_3031);
			return types;
		}
		if (editPart instanceof Class5EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.Port_3025);
			types.add(UMLElementTypes.RedefinableTemplateSignature_3027);
			types.add(UMLElementTypes.Property_3001);
			types.add(UMLElementTypes.Operation_3002);
			types.add(UMLElementTypes.Class_3003);
			return types;
		}
		if (editPart instanceof Enumeration3EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.RedefinableTemplateSignature_3027);
			types.add(UMLElementTypes.EnumerationLiteral_3016);
			types.add(UMLElementTypes.Property_3023);
			types.add(UMLElementTypes.Operation_3024);
			return types;
		}
		if (editPart instanceof InstanceSpecification3EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.Slot_3017);
			return types;
		}
		if (editPart instanceof DataType3EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.RedefinableTemplateSignature_3027);
			types.add(UMLElementTypes.Property_3014);
			types.add(UMLElementTypes.Operation_3015);
			return types;
		}
		if (editPart instanceof PrimitiveType3EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.RedefinableTemplateSignature_3027);
			types.add(UMLElementTypes.Property_3021);
			types.add(UMLElementTypes.Operation_3022);
			return types;
		}
		if (editPart instanceof PackageAsFrameContentsEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.Package_3032);
			types.add(UMLElementTypes.Class_3033);
			types.add(UMLElementTypes.Enumeration_3034);
			types.add(UMLElementTypes.InstanceSpecification_3035);
			types.add(UMLElementTypes.DataType_3036);
			types.add(UMLElementTypes.PrimitiveType_3037);
			return types;
		}
		if (editPart instanceof PackageAsFrameContents2EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.Package_3032);
			types.add(UMLElementTypes.Class_3033);
			types.add(UMLElementTypes.Enumeration_3034);
			types.add(UMLElementTypes.InstanceSpecification_3035);
			types.add(UMLElementTypes.DataType_3036);
			types.add(UMLElementTypes.PrimitiveType_3037);
			return types;
		}
		if (editPart instanceof PackageEditPart) {
			List types = new ArrayList();
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
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ConstraintEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.ConstraintConstrainedElement_4004);
			return types;
		}
		if (sourceEditPart instanceof InstanceSpecification2EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.Slot_4015);
			return types;
		}
		if (sourceEditPart instanceof DependencyEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.DependencySupplier_4006);
			types.add(UMLElementTypes.DependencyClient_4007);
			return types;
		}
		if (sourceEditPart instanceof InstanceSpecificationEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.Slot_4015);
			return types;
		}
		if (sourceEditPart instanceof InstanceSpecification3EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.Slot_4015);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof InterfaceEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.InterfaceRealization_4008);
			return types;
		}
		if (targetEditPart instanceof InstanceSpecification2EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.Slot_4015);
			return types;
		}
		if (targetEditPart instanceof GeneralizationSetEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.Generalization_4011);
			return types;
		}
		if (targetEditPart instanceof Interface2EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.InterfaceRealization_4008);
			return types;
		}
		if (targetEditPart instanceof InstanceSpecificationEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.Slot_4015);
			return types;
		}
		if (targetEditPart instanceof InstanceSpecification3EditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.Slot_4015);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ConstraintEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (sourceEditPart instanceof InstanceSpecification2EditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof InstanceSpecification2EditPart) {
				types.add(UMLElementTypes.Slot_4015);
			}
			if (targetEditPart instanceof InstanceSpecificationEditPart) {
				types.add(UMLElementTypes.Slot_4015);
			}
			if (targetEditPart instanceof InstanceSpecification3EditPart) {
				types.add(UMLElementTypes.Slot_4015);
			}
			return types;
		}
		if (sourceEditPart instanceof DependencyEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (sourceEditPart instanceof InstanceSpecificationEditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof InstanceSpecification2EditPart) {
				types.add(UMLElementTypes.Slot_4015);
			}
			if (targetEditPart instanceof InstanceSpecificationEditPart) {
				types.add(UMLElementTypes.Slot_4015);
			}
			if (targetEditPart instanceof InstanceSpecification3EditPart) {
				types.add(UMLElementTypes.Slot_4015);
			}
			return types;
		}
		if (sourceEditPart instanceof InstanceSpecification3EditPart) {
			List types = new ArrayList();
			if (targetEditPart instanceof InstanceSpecification2EditPart) {
				types.add(UMLElementTypes.Slot_4015);
			}
			if (targetEditPart instanceof InstanceSpecificationEditPart) {
				types.add(UMLElementTypes.Slot_4015);
			}
			if (targetEditPart instanceof InstanceSpecification3EditPart) {
				types.add(UMLElementTypes.Slot_4015);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof InterfaceEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (targetEditPart instanceof InstanceSpecification2EditPart) {
			List types = new ArrayList();
			if (relationshipType == UMLElementTypes.Slot_4015) {
				types.add(UMLElementTypes.InstanceSpecification_2008);
			}
			if (relationshipType == UMLElementTypes.Slot_4015) {
				types.add(UMLElementTypes.InstanceSpecification_3013);
			}
			if (relationshipType == UMLElementTypes.Slot_4015) {
				types.add(UMLElementTypes.InstanceSpecification_3035);
			}
			return types;
		}
		if (targetEditPart instanceof GeneralizationSetEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (targetEditPart instanceof Interface2EditPart) {
			List types = new ArrayList();
			return types;
		}
		if (targetEditPart instanceof InstanceSpecificationEditPart) {
			List types = new ArrayList();
			if (relationshipType == UMLElementTypes.Slot_4015) {
				types.add(UMLElementTypes.InstanceSpecification_2008);
			}
			if (relationshipType == UMLElementTypes.Slot_4015) {
				types.add(UMLElementTypes.InstanceSpecification_3013);
			}
			if (relationshipType == UMLElementTypes.Slot_4015) {
				types.add(UMLElementTypes.InstanceSpecification_3035);
			}
			return types;
		}
		if (targetEditPart instanceof InstanceSpecification3EditPart) {
			List types = new ArrayList();
			if (relationshipType == UMLElementTypes.Slot_4015) {
				types.add(UMLElementTypes.InstanceSpecification_2008);
			}
			if (relationshipType == UMLElementTypes.Slot_4015) {
				types.add(UMLElementTypes.InstanceSpecification_3013);
			}
			if (relationshipType == UMLElementTypes.Slot_4015) {
				types.add(UMLElementTypes.InstanceSpecification_3035);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ConstraintEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (sourceEditPart instanceof InstanceSpecification2EditPart) {
			List types = new ArrayList();
			if (relationshipType == UMLElementTypes.Slot_4015) {
				types.add(UMLElementTypes.InstanceSpecification_2008);
			}
			if (relationshipType == UMLElementTypes.Slot_4015) {
				types.add(UMLElementTypes.InstanceSpecification_3013);
			}
			if (relationshipType == UMLElementTypes.Slot_4015) {
				types.add(UMLElementTypes.InstanceSpecification_3035);
			}
			return types;
		}
		if (sourceEditPart instanceof DependencyEditPart) {
			List types = new ArrayList();
			return types;
		}
		if (sourceEditPart instanceof InstanceSpecificationEditPart) {
			List types = new ArrayList();
			if (relationshipType == UMLElementTypes.Slot_4015) {
				types.add(UMLElementTypes.InstanceSpecification_2008);
			}
			if (relationshipType == UMLElementTypes.Slot_4015) {
				types.add(UMLElementTypes.InstanceSpecification_3013);
			}
			if (relationshipType == UMLElementTypes.Slot_4015) {
				types.add(UMLElementTypes.InstanceSpecification_3035);
			}
			return types;
		}
		if (sourceEditPart instanceof InstanceSpecification3EditPart) {
			List types = new ArrayList();
			if (relationshipType == UMLElementTypes.Slot_4015) {
				types.add(UMLElementTypes.InstanceSpecification_2008);
			}
			if (relationshipType == UMLElementTypes.Slot_4015) {
				types.add(UMLElementTypes.InstanceSpecification_3013);
			}
			if (relationshipType == UMLElementTypes.Slot_4015) {
				types.add(UMLElementTypes.InstanceSpecification_3035);
			}
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target, IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source, IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(UMLDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, labelProvider);
		dialog.setMessage(Messages.UMLModelingAssistantProviderMessage);
		dialog.setTitle(Messages.UMLModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
