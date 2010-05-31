package org.eclipse.uml2.diagram.csd.providers;

import java.util.Collection;
import org.eclipse.uml2.diagram.csd.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.csd.expressions.UMLOCLFactory;
import org.eclipse.uml2.diagram.csd.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Collaboration;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorKind;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_Collaboration_2005(Collaboration instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(0, UMLPackage.eINSTANCE.getCollaboration(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Class_2006(Class instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(4, UMLPackage.eINSTANCE.getClass_(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Class_2007(Class instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(13, UMLPackage.eINSTANCE.getClass_(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Interface_2009(Interface instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(17, UMLPackage.eINSTANCE.getInterface(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InstanceSpecification_2011(InstanceSpecification instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(18, UMLPackage.eINSTANCE.getInstanceSpecification(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Constraint_2012(Constraint instance) {
		try {
			OpaqueExpression newInstance_0_0 = UMLFactory.eINSTANCE.createOpaqueExpression();
			instance.setSpecification(newInstance_0_0);
			Object value_0_0_0 = UMLOCLFactory.getExpression(19, UMLPackage.eINSTANCE.getOpaqueExpression(), null).evaluate(newInstance_0_0);
			if (value_0_0_0 instanceof Collection) {
				newInstance_0_0.getLanguages().clear();
				newInstance_0_0.getLanguages().addAll(((Collection) value_0_0_0));
			} else {
				newInstance_0_0.getLanguages().add((String) value_0_0_0);
			}
			Object value_0_0_1 = UMLOCLFactory.getExpression(20, UMLPackage.eINSTANCE.getOpaqueExpression(), null).evaluate(newInstance_0_0);
			if (value_0_0_1 instanceof Collection) {
				newInstance_0_0.getBodies().clear();
				newInstance_0_0.getBodies().addAll(((Collection) value_0_0_1));
			} else {
				newInstance_0_0.getBodies().add((String) value_0_0_1);
			}

		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Interface_2014(Interface instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(21, UMLPackage.eINSTANCE.getInterface(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_CollaborationUse_3002(CollaborationUse instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(1, UMLPackage.eINSTANCE.getCollaborationUse(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Property_3008(Property instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(6, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getAggregationKind());
			instance.setAggregation((AggregationKind) value_0);
			Object value_1 = UMLOCLFactory.getExpression(7, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Operation_3009(Operation instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(8, UMLPackage.eINSTANCE.getOperation(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Class_3010(Class instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(9, UMLPackage.eINSTANCE.getClass_(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Port_3011(Port instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(10, UMLPackage.eINSTANCE.getPort(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getAggregationKind());
			instance.setAggregation((AggregationKind) value_0);
			Object value_1 = UMLOCLFactory.getExpression(11, UMLPackage.eINSTANCE.getPort(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Port_3017(Port instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(15, UMLPackage.eINSTANCE.getPort(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getAggregationKind());
			instance.setAggregation((AggregationKind) value_0);
			Object value_1 = UMLOCLFactory.getExpression(16, UMLPackage.eINSTANCE.getPort(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Property_3018(Property instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(6, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getAggregationKind());
			instance.setAggregation((AggregationKind) value_0);
			Object value_1 = UMLOCLFactory.getExpression(7, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Operation_3019(Operation instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(8, UMLPackage.eINSTANCE.getOperation(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Class_3020(Class instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(9, UMLPackage.eINSTANCE.getClass_(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Connector_4005(Connector instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(23, UMLPackage.eINSTANCE.getConnector(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getConnectorKind());
			instance.setKind((ConnectorKind) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = UMLDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			UMLDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
