package org.eclipse.uml2.diagram.clazz.part;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.clazz.edit.helpers.GeneralizationSetEditHelper;
import org.eclipse.uml2.diagram.clazz.edit.parts.Generalization2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationGeneralEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationSetEditPart;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.uml.UMLPackage;

public class CreateGeneralizationLinkTool extends UnspecifiedTypeConnectionTool {

	public CreateGeneralizationLinkTool() {
		super(GENERALISATION_TYPES);
	}

	@Override
	protected Command getCommand() {
		if (getTargetEditPart() == null) {
			return null;
		}		
		if (getTargetEditPart() instanceof GeneralizationEditPart) {
			return getCreateSetAndThenGeneralizationCommand();
		}
		if (getTargetEditPart() instanceof Generalization2EditPart) {
			Generalization2EditPart generalization2EditPart = (Generalization2EditPart)getTargetEditPart();
			EditPart generalizationSetEditPart = generalization2EditPart.getTarget();
			return generalizationSetEditPart.getCommand(getTargetRequest());
		}
		if (getTargetEditPart() instanceof GeneralizationGeneralEditPart) {
			GeneralizationGeneralEditPart generalizationGeneralEditPart = (GeneralizationGeneralEditPart)getTargetEditPart();
			EditPart generalizationSetEditPart = generalizationGeneralEditPart.getSource();
			return generalizationSetEditPart.getCommand(getTargetRequest());
		}
		return super.getCommand();
	}
	
	private Command getCreateSetAndThenGeneralizationCommand() {
		GeneralizationEditPart targetEditPart = (GeneralizationEditPart) getTargetEditPart();
		GraphicalEditPart packageEditPart = (GraphicalEditPart) targetEditPart.getRoot().getContents();

		View generalization = targetEditPart.getNotationView();
		View container = packageEditPart.getNotationView();

		CreateViewAndElementRequest createGeneralizationSetRequest = getCreateGeneralizationSetRequest(container, generalization);
		Command createGeneralizationSetCommand = packageEditPart.getCommand(createGeneralizationSetRequest);
		
		final ViewAndElementDescriptor created = getCreatedElement(createGeneralizationSetRequest);

		if (created == null) {
			return UnexecutableCommand.INSTANCE;
		}

		CompoundCommand result = new CompoundCommand();
		result.add(createGeneralizationSetCommand);
		result.add(getDeleteViewCommand(targetEditPart));

		result.add(getCreateGeneralizationCommand(packageEditPart, created));
		return result;
	}
	
	private ViewAndElementDescriptor getCreatedElement(CreateViewAndElementRequest createGeneralizationSetRequest) {
		List newObject = (List) createGeneralizationSetRequest.getNewObject();
		return (ViewAndElementDescriptor) ((List) newObject).get(0);
	}

	private Command getCreateGeneralizationCommand(GraphicalEditPart packageEditPart, final ViewAndElementDescriptor created) {
		AbstractTransactionalCommand createGeneralization = new AbstractTransactionalCommand(packageEditPart.getEditingDomain(), "Change Generalization Notation", null) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				View view = (View) created.getAdapter(View.class);
				EditPart editPart = (EditPart) getCurrentViewer().getEditPartRegistry().get(view);

				Command createConnectionCmd = editPart.getCommand(getTargetRequest());
				if (createConnectionCmd.canExecute()) {
					createConnectionCmd.execute();
				}
				return CommandResult.newOKCommandResult();
			}
		};
		return new ICommandProxy(createGeneralization);
	}

	private CreateViewAndElementRequest getCreateGeneralizationSetRequest(View container, View generalization) {
		CreateElementRequest createElementRequest = new CreateElementRequest(container.getElement(), UMLElementTypes.GeneralizationSet_2012, UMLPackage.eINSTANCE.getPackage_PackagedElement());
		ViewAndElementDescriptor descriptor = new ViewAndElementDescriptor(new CreateElementRequestAdapter(createElementRequest), Node.class, Integer.toString(GeneralizationSetEditPart.VISUAL_ID),
				getPreferencesHint());
		CreateViewAndElementRequest createGeneralizationSetRequest = new CreateViewAndElementRequest(descriptor);
		createGeneralizationSetRequest.getExtendedData().put(GeneralizationSetEditHelper.PARAMETER_SET_GENERALIZATION, generalization.getElement());
		createGeneralizationSetRequest.setLocation(getLocation());
		return createGeneralizationSetRequest;
	}

	private Command getDeleteViewCommand(GeneralizationEditPart editPart) {
		View view = editPart.getNotationView();
		return new ICommandProxy(new DeleteCommand(view));
	}

	private static List<IElementType> GENERALISATION_TYPES = Arrays.asList(new IElementType[] {
			UMLElementTypes.Generalization_4001,
			UMLElementTypes.Generalization_4011, 
		});

}
