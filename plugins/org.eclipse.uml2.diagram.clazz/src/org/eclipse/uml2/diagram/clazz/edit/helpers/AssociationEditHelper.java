package org.eclipse.uml2.diagram.clazz.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.uml2.diagram.clazz.conventions.AssociationEndConvention;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class AssociationEditHelper extends UMLBaseEditHelper {

	public static final String PARAMETER_CONFIGURE_AGGREGATION_KIND = AssociationEditHelper.class.getName() + ":ConfigureAggregationKind";

	/**
	 * @generated NOT
	 */
	protected ICommand getConfigureCommand(ConfigureRequest req) {
		if (req.getElementToConfigure() instanceof Association && req.getParameter(PARAMETER_CONFIGURE_AGGREGATION_KIND) instanceof AggregationKind) {
			Association association = (Association) req.getElementToConfigure();
			AggregationKind kind = (AggregationKind) req.getParameter(PARAMETER_CONFIGURE_AGGREGATION_KIND);
			SetRequest request = new SetAggregationKindRequest(association, kind);
			return new SetValueCommand(request);
		}
		return super.getConfigureCommand(req);
	}

	/**
	 * @NOT-generated
	 */
	public static class SetAggregationKindRequest extends SetRequest {

		public SetAggregationKindRequest(Association association, AggregationKind kind) {
			super(AssociationEndConvention.getSourceEnd(association), UMLPackage.eINSTANCE.getProperty_Aggregation(), kind);
		}
	}
}