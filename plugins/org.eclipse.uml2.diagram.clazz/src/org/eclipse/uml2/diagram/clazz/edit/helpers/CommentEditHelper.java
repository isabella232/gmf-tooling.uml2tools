package org.eclipse.uml2.diagram.clazz.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */

public class CommentEditHelper extends UMLBaseEditHelper {

	/**
	 * @NOT-generated
	 */
	public static final String PARAMETER_COMMENT_BODY = CommentEditHelper.class.getName() + ":SetCommentBody"; //$NON-NLS-1$

	/**
	 * @NOT-generated
	 */
	protected ICommand getConfigureCommand(ConfigureRequest req) {
		if (req.getElementToConfigure() instanceof Comment && req.getParameter(PARAMETER_COMMENT_BODY) instanceof String) {
			Comment element = (Comment) req.getElementToConfigure();
			String name = (String) req.getParameter(PARAMETER_COMMENT_BODY);
			SetRequest request = new SetRequest(element, UMLPackage.eINSTANCE.getComment_Body(), name);
			return new SetValueCommand(request);
		}
		return super.getConfigureCommand(req);
	}
}
