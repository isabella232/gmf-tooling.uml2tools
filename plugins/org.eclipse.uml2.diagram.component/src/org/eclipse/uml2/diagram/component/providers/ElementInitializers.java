package org.eclipse.uml2.diagram.component.providers;

import org.eclipse.uml2.diagram.component.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.component.expressions.UMLOCLFactory;
import org.eclipse.uml2.diagram.component.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorKind;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
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
	public void init_Component_2001(Component instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(0, UMLPackage.eINSTANCE.getComponent(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Artifact_2002(Artifact instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(3, UMLPackage.eINSTANCE.getArtifact(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Interface_2003(Interface instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(6, UMLPackage.eINSTANCE.getInterface(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Class_2004(Class instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(5, UMLPackage.eINSTANCE.getClass_(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Package_2006(Package instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(10, UMLPackage.eINSTANCE.getPackage(), null).evaluate(instance);
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
			Object value_0 = UMLOCLFactory.getExpression(16, UMLPackage.eINSTANCE.getClass_(), null).evaluate(instance);
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
			Object value_0 = UMLOCLFactory.getExpression(24, UMLPackage.eINSTANCE.getInterface(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Component_3001(Component instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(0, UMLPackage.eINSTANCE.getComponent(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Port_3002(Port instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(1, UMLPackage.eINSTANCE.getPort(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getAggregationKind());
			instance.setAggregation((AggregationKind) value_0);
			Object value_1 = UMLOCLFactory.getExpression(2, UMLPackage.eINSTANCE.getPort(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Artifact_3003(Artifact instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(3, UMLPackage.eINSTANCE.getArtifact(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Artifact_3016(Artifact instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(3, UMLPackage.eINSTANCE.getArtifact(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Class_3004(Class instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(5, UMLPackage.eINSTANCE.getClass_(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Interface_3005(Interface instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(6, UMLPackage.eINSTANCE.getInterface(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public void init_Property_3006(Property instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(8, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Package_3008(Package instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(11, UMLPackage.eINSTANCE.getPackage(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Class_3009(Class instance) {
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
	public void init_Component_3010(Component instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(14, UMLPackage.eINSTANCE.getComponent(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Property_3011(Property instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(18, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getAggregationKind());
			instance.setAggregation((AggregationKind) value_0);
			Object value_1 = UMLOCLFactory.getExpression(19, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Operation_3012(Operation instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(20, UMLPackage.eINSTANCE.getOperation(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Class_3013(Class instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(21, UMLPackage.eINSTANCE.getClass_(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Port_3014(Port instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(22, UMLPackage.eINSTANCE.getPort(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getAggregationKind());
			instance.setAggregation((AggregationKind) value_0);
			Object value_1 = UMLOCLFactory.getExpression(23, UMLPackage.eINSTANCE.getPort(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Property_3017(Property instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(18, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getAggregationKind());
			instance.setAggregation((AggregationKind) value_0);
			Object value_1 = UMLOCLFactory.getExpression(19, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Operation_3018(Operation instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(20, UMLPackage.eINSTANCE.getOperation(), null).evaluate(instance);
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
			Object value_0 = UMLOCLFactory.getExpression(13, UMLPackage.eINSTANCE.getClass_(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Connector_4008(Connector instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(30, UMLPackage.eINSTANCE.getConnector(), null).evaluate(instance);

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
