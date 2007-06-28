package org.eclipse.uml2.diagram.clazz.parser.imports;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLPackage;

public class ElementImportParser implements ISemanticParser {

	@SuppressWarnings("serial") //$NON-NLS-1$
	public List<?> getSemanticElementsBeingParsed(EObject eObject) {
		ElementImport immport = (ElementImport) eObject;
		List<EObject> result = new LinkedList<EObject>() {
			@Override
			public boolean add(EObject o) {
				if (o == null) {
					return false;
				}
				return super.add(o);
			}
		};
		result.add(immport);
		result.add(immport.getImportedElement());
		return result;
	}

	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
		return null;
	}

	public String getEditString(IAdaptable element, int flags) {
		StringBuffer result = new StringBuffer();
		ElementImport subject = doAdapt(element);
		PackageableElement importedElement = subject.getImportedElement();
		if (importedElement != null) {
			String fqn = importedElement.getQualifiedName();
			if (isEmpty(fqn)) {
				fqn = importedElement.getName();
			}
			if (!isEmpty(fqn)) {
				result.append(fqn);
			}
		}
		String alias = subject.getAlias();
		if (!isEmpty(alias)) {
			result.append(" as "); //$NON-NLS-1$
			result.append(alias);
		}
		return result.toString();
	}

	public String getPrintString(IAdaptable element, int flags) {
		return getEditString(element, flags);
	}

	public ICommand getParseCommand(IAdaptable element, String newString, int flags) {
		return UnexecutableCommand.INSTANCE;
	}

	public boolean areSemanticElementsAffected(EObject listener, Object notification) {
		return isAffectingEvent(notification);
	}

	public boolean isAffectingEvent(Object event, int flags) {
		return isAffectingEvent(event);
	}
	
	public IParserEditStatus isValidEditString(IAdaptable element, String editString) {
		return ParserEditStatus.UNEDITABLE_STATUS;
	}

	private ElementImport doAdapt(IAdaptable adaptable) {
		ElementImport element = (ElementImport) adaptable.getAdapter(EObject.class);
		return element;
	}
	
	private boolean isEmpty(String text) {
		return text == null || text.length() == 0;
	}

	private boolean isAffectingEvent(Object notification) {
		if (notification instanceof Notification) {
			Object feature = ((Notification) notification).getFeature();
			return feature == UMLPackage.eINSTANCE.getNamedElement_Name() || feature == UMLPackage.eINSTANCE.getElementImport_Alias()
					|| feature == UMLPackage.eINSTANCE.getElementImport_ImportedElement();
		}
		return false;
	}
}
