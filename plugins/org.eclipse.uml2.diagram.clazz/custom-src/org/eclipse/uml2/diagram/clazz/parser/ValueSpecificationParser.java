package org.eclipse.uml2.diagram.clazz.parser;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.uml2.uml.Expression;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class ValueSpecificationParser implements ISemanticParser {

	public boolean areSemanticElementsAffected(EObject listener, Object notification) {
		return isAffectingEvent(notification, 0);
	}

	public boolean isAffectingEvent(Object notification, int flags) {
		if (notification instanceof Notification) {
			Object feature = ((Notification) notification).getFeature();
			return UMLPackage.eINSTANCE.getLiteralInteger_Value().equals(feature) || UMLPackage.eINSTANCE.getLiteralString_Value().equals(feature)
					|| UMLPackage.eINSTANCE.getExpression_Symbol().equals(feature);
		}
		return false;
	}

	public List<?> getSemanticElementsBeingParsed(EObject element) {
		if (element == null || false == element instanceof ValueSpecification) {
			return Collections.emptyList();
		}
		return Collections.singletonList(element);
	}

	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
		return null;
	}

	public String getEditString(IAdaptable element, int flags) {
		ValueSpecification specification = getValueSpecification(element);
		if (specification == null) {
			return "";
		}
		UMLSwitch<String> valueSwitch = new UMLSwitch<String>() {

			@Override
			public String caseLiteralString(LiteralString object) {
				return object.getValue();
			}

			@Override
			public String caseLiteralInteger(LiteralInteger object) {
				return Integer.toString(object.getValue());
			}

			@Override
			public String caseExpression(Expression object) {
				return object.getSymbol();
			}

			@Override
			public String defaultCase(EObject object) {
				return "";
			}

		};
		return valueSwitch.doSwitch(specification);
	}

	public ICommand getParseCommand(IAdaptable element, final String newString, int flags) {
		final ValueSpecification vs = getValueSpecification(element);
		if (vs == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (newString == null) {
			return UnexecutableCommand.INSTANCE;
		}
		UMLSwitch<ICommand> valueSwitch = new UMLSwitch<ICommand>() {

			@Override
			public ICommand caseLiteralString(LiteralString object) {
				EStructuralFeature feature = UMLPackage.eINSTANCE.getLiteralString_Value();
				return new SetValueCommand(new SetRequest(vs, feature, newString));
			}

			@Override
			public ICommand caseLiteralInteger(LiteralInteger object) {
				try {
					Integer intValue = Integer.parseInt(newString);
					EStructuralFeature feature = UMLPackage.eINSTANCE.getLiteralInteger_Value();
					return new SetValueCommand(new SetRequest(vs, feature, intValue));
				} catch (NumberFormatException e) {
					return UnexecutableCommand.INSTANCE;
				}
			}

			@Override
			public ICommand caseExpression(Expression object) {
				EStructuralFeature feature = UMLPackage.eINSTANCE.getExpression_Symbol();
				return new SetValueCommand(new SetRequest(vs, feature, newString));
			}

			@Override
			public ICommand defaultCase(EObject object) {
				return UnexecutableCommand.INSTANCE;
			}

		};

		return valueSwitch.doSwitch(vs);
	}

	public String getPrintString(IAdaptable element, int flags) {
		return getEditString(element, flags);
	}

	public IParserEditStatus isValidEditString(IAdaptable element, String editString) {
		return ParserEditStatus.UNEDITABLE_STATUS;
	}

	protected ValueSpecification getValueSpecification(IAdaptable adaptable) {
		return (ValueSpecification) adaptable.getAdapter(EObject.class);
	}

}
