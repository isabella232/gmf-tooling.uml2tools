package org.eclipse.uml2.diagram.deploy.providers;

import org.eclipse.uml2.diagram.deploy.expressions.UMLOCLFactory;
import org.eclipse.uml2.diagram.deploy.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.DeploymentSpecification;
import org.eclipse.uml2.uml.Device;
import org.eclipse.uml2.uml.ExecutionEnvironment;
import org.eclipse.uml2.uml.Node;
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
	public void init_Device_2003(Device instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(0, UMLPackage.eINSTANCE.getDevice(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Node_2004(Node instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(8, UMLPackage.eINSTANCE.getNode(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ExecutionEnvironment_2005(ExecutionEnvironment instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(5, UMLPackage.eINSTANCE.getExecutionEnvironment(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Artifact_2006(Artifact instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(2, UMLPackage.eINSTANCE.getArtifact(), null).evaluate(instance);
			instance.setFileName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DeploymentSpecification_2007(DeploymentSpecification instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(3, UMLPackage.eINSTANCE.getDeploymentSpecification(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Device_3004(Device instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(0, UMLPackage.eINSTANCE.getDevice(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Artifact_3002(Artifact instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(2, UMLPackage.eINSTANCE.getArtifact(), null).evaluate(instance);
			instance.setFileName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Artifact_3008(Artifact instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(2, UMLPackage.eINSTANCE.getArtifact(), null).evaluate(instance);
			instance.setFileName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DeploymentSpecification_3009(DeploymentSpecification instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(3, UMLPackage.eINSTANCE.getDeploymentSpecification(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_ExecutionEnvironment_3005(ExecutionEnvironment instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(5, UMLPackage.eINSTANCE.getExecutionEnvironment(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Artifact_3006(Artifact instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(6, UMLPackage.eINSTANCE.getArtifact(), null).evaluate(instance);
			instance.setFileName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Node_3007(Node instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(8, UMLPackage.eINSTANCE.getNode(), null).evaluate(instance);
			instance.setName((String) value_0);
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

	/**
	 * @generated
	 */
	public void init_Property_3003(Property instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(4, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}
}
