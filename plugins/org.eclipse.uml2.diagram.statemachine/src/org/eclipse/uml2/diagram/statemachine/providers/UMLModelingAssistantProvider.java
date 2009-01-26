package org.eclipse.uml2.diagram.statemachine.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
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
import org.eclipse.uml2.diagram.statemachine.edit.parts.CompositeStateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ConnectionPointReference2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ConnectionPointReferenceEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.FinalStateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate10EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate3EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate4EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate5EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate6EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate7EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate8EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate9EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.RegionSubvertices2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.RegionSubverticesEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.SimpleStateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachine2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachineEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.SubmachineStateEditPart;
import org.eclipse.uml2.diagram.statemachine.part.Messages;
import org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin;

/**
 * @generated
 */
public class UMLModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated NOT
	 * #227133 Exception on Behavior creation
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof SimpleStateEditPart) {
			List types = new ArrayList();
			//			types.add(UMLElementTypes.Behavior_3019);
			//			types.add(UMLElementTypes.Behavior_3020);
			//			types.add(UMLElementTypes.Behavior_3021);
			return types;
		}
		if (editPart instanceof CompositeStateEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.Region_3002);
			//			types.add(UMLElementTypes.Behavior_3019);
			//			types.add(UMLElementTypes.Behavior_3020);
			//			types.add(UMLElementTypes.Behavior_3021);
			return types;
		}
		if (editPart instanceof SubmachineStateEditPart) {
			List types = new ArrayList();
			types.add(UMLElementTypes.Region_3002);
			types.add(UMLElementTypes.ConnectionPointReference_3017);
			types.add(UMLElementTypes.ConnectionPointReference_3018);
			//			types.add(UMLElementTypes.Behavior_3019);
			//			types.add(UMLElementTypes.Behavior_3020);
			//			types.add(UMLElementTypes.Behavior_3021);
			return types;
		}
		return getTypesForPopupBarGen(host);
	}

	/**
	 * @generated
	 */
	public List<?> getTypesForPopupBarGen(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);

		if (editPart instanceof StateMachine2EditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.Region_3013);
			types.add(UMLElementTypes.Pseudostate_3014);
			types.add(UMLElementTypes.Pseudostate_3015);
			return types;
		}

		if (editPart instanceof SimpleStateEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.Behavior_3019);
			types.add(UMLElementTypes.Behavior_3020);
			types.add(UMLElementTypes.Behavior_3021);
			return types;
		}

		if (editPart instanceof CompositeStateEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.Region_3002);
			types.add(UMLElementTypes.Behavior_3019);
			types.add(UMLElementTypes.Behavior_3020);
			types.add(UMLElementTypes.Behavior_3021);
			types.add(UMLElementTypes.Transition_3022);
			return types;
		}

		if (editPart instanceof SubmachineStateEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.Region_3002);
			types.add(UMLElementTypes.ConnectionPointReference_3017);
			types.add(UMLElementTypes.ConnectionPointReference_3018);
			types.add(UMLElementTypes.Behavior_3019);
			types.add(UMLElementTypes.Behavior_3020);
			types.add(UMLElementTypes.Behavior_3021);
			types.add(UMLElementTypes.Transition_3022);
			return types;
		}

		if (editPart instanceof RegionSubverticesEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.State_3001);
			types.add(UMLElementTypes.State_3012);
			types.add(UMLElementTypes.State_3016);
			types.add(UMLElementTypes.FinalState_3003);
			types.add(UMLElementTypes.Pseudostate_3004);
			types.add(UMLElementTypes.Pseudostate_3005);
			types.add(UMLElementTypes.Pseudostate_3006);
			types.add(UMLElementTypes.Pseudostate_3007);
			types.add(UMLElementTypes.Pseudostate_3008);
			types.add(UMLElementTypes.Pseudostate_3009);
			types.add(UMLElementTypes.Pseudostate_3010);
			types.add(UMLElementTypes.Pseudostate_3011);
			return types;
		}

		if (editPart instanceof RegionSubvertices2EditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.State_3001);
			types.add(UMLElementTypes.State_3012);
			types.add(UMLElementTypes.State_3016);
			types.add(UMLElementTypes.FinalState_3003);
			types.add(UMLElementTypes.Pseudostate_3004);
			types.add(UMLElementTypes.Pseudostate_3005);
			types.add(UMLElementTypes.Pseudostate_3006);
			types.add(UMLElementTypes.Pseudostate_3007);
			types.add(UMLElementTypes.Pseudostate_3008);
			types.add(UMLElementTypes.Pseudostate_3009);
			types.add(UMLElementTypes.Pseudostate_3010);
			types.add(UMLElementTypes.Pseudostate_3011);
			return types;
		}

		if (editPart instanceof StateMachineEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.StateMachine_2005);
			return types;
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof SimpleStateEditPart) {
			return ((SimpleStateEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompositeStateEditPart) {
			return ((CompositeStateEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SubmachineStateEditPart) {
			return ((SubmachineStateEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ConnectionPointReferenceEditPart) {
			return ((ConnectionPointReferenceEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ConnectionPointReference2EditPart) {
			return ((ConnectionPointReference2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FinalStateEditPart) {
			return ((FinalStateEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PseudostateEditPart) {
			return ((PseudostateEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Pseudostate2EditPart) {
			return ((Pseudostate2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Pseudostate3EditPart) {
			return ((Pseudostate3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Pseudostate4EditPart) {
			return ((Pseudostate4EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Pseudostate5EditPart) {
			return ((Pseudostate5EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Pseudostate6EditPart) {
			return ((Pseudostate6EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Pseudostate7EditPart) {
			return ((Pseudostate7EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Pseudostate8EditPart) {
			return ((Pseudostate8EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Pseudostate9EditPart) {
			return ((Pseudostate9EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Pseudostate10EditPart) {
			return ((Pseudostate10EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof SimpleStateEditPart) {
			return ((SimpleStateEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CompositeStateEditPart) {
			return ((CompositeStateEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SubmachineStateEditPart) {
			return ((SubmachineStateEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ConnectionPointReferenceEditPart) {
			return ((ConnectionPointReferenceEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ConnectionPointReference2EditPart) {
			return ((ConnectionPointReference2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FinalStateEditPart) {
			return ((FinalStateEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PseudostateEditPart) {
			return ((PseudostateEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Pseudostate2EditPart) {
			return ((Pseudostate2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Pseudostate3EditPart) {
			return ((Pseudostate3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Pseudostate4EditPart) {
			return ((Pseudostate4EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Pseudostate5EditPart) {
			return ((Pseudostate5EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Pseudostate6EditPart) {
			return ((Pseudostate6EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Pseudostate7EditPart) {
			return ((Pseudostate7EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Pseudostate8EditPart) {
			return ((Pseudostate8EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Pseudostate9EditPart) {
			return ((Pseudostate9EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Pseudostate10EditPart) {
			return ((Pseudostate10EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof SimpleStateEditPart) {
			return ((SimpleStateEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompositeStateEditPart) {
			return ((CompositeStateEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SubmachineStateEditPart) {
			return ((SubmachineStateEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ConnectionPointReferenceEditPart) {
			return ((ConnectionPointReferenceEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ConnectionPointReference2EditPart) {
			return ((ConnectionPointReference2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FinalStateEditPart) {
			return ((FinalStateEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PseudostateEditPart) {
			return ((PseudostateEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Pseudostate2EditPart) {
			return ((Pseudostate2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Pseudostate3EditPart) {
			return ((Pseudostate3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Pseudostate4EditPart) {
			return ((Pseudostate4EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Pseudostate5EditPart) {
			return ((Pseudostate5EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Pseudostate6EditPart) {
			return ((Pseudostate6EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Pseudostate7EditPart) {
			return ((Pseudostate7EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Pseudostate8EditPart) {
			return ((Pseudostate8EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Pseudostate9EditPart) {
			return ((Pseudostate9EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Pseudostate10EditPart) {
			return ((Pseudostate10EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof SimpleStateEditPart) {
			return ((SimpleStateEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CompositeStateEditPart) {
			return ((CompositeStateEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SubmachineStateEditPart) {
			return ((SubmachineStateEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ConnectionPointReferenceEditPart) {
			return ((ConnectionPointReferenceEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ConnectionPointReference2EditPart) {
			return ((ConnectionPointReference2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FinalStateEditPart) {
			return ((FinalStateEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PseudostateEditPart) {
			return ((PseudostateEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Pseudostate2EditPart) {
			return ((Pseudostate2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Pseudostate3EditPart) {
			return ((Pseudostate3EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Pseudostate4EditPart) {
			return ((Pseudostate4EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Pseudostate5EditPart) {
			return ((Pseudostate5EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Pseudostate6EditPart) {
			return ((Pseudostate6EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Pseudostate7EditPart) {
			return ((Pseudostate7EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Pseudostate8EditPart) {
			return ((Pseudostate8EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Pseudostate9EditPart) {
			return ((Pseudostate9EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Pseudostate10EditPart) {
			return ((Pseudostate10EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof SimpleStateEditPart) {
			return ((SimpleStateEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompositeStateEditPart) {
			return ((CompositeStateEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SubmachineStateEditPart) {
			return ((SubmachineStateEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ConnectionPointReferenceEditPart) {
			return ((ConnectionPointReferenceEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ConnectionPointReference2EditPart) {
			return ((ConnectionPointReference2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FinalStateEditPart) {
			return ((FinalStateEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PseudostateEditPart) {
			return ((PseudostateEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Pseudostate2EditPart) {
			return ((Pseudostate2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Pseudostate3EditPart) {
			return ((Pseudostate3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Pseudostate4EditPart) {
			return ((Pseudostate4EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Pseudostate5EditPart) {
			return ((Pseudostate5EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Pseudostate6EditPart) {
			return ((Pseudostate6EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Pseudostate7EditPart) {
			return ((Pseudostate7EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Pseudostate8EditPart) {
			return ((Pseudostate8EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Pseudostate9EditPart) {
			return ((Pseudostate9EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Pseudostate10EditPart) {
			return ((Pseudostate10EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
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
