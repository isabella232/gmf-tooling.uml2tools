package org.eclipse.uml2.diagram.clazz.providers;

import java.util.Collection;

import org.eclipse.uml2.diagram.clazz.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.clazz.expressions.UMLOCLFactory;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.PrimitiveType;
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
	public void init_Package_2002(Package instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(0, UMLPackage.eINSTANCE.getPackage(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Class_2001(Class instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(12, UMLPackage.eINSTANCE.getClass_(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_AssociationClass_2007(AssociationClass instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(19, UMLPackage.eINSTANCE.getAssociationClass(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DataType_2004(DataType instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(24, UMLPackage.eINSTANCE.getDataType(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_PrimitiveType_2005(PrimitiveType instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(28, UMLPackage.eINSTANCE.getPrimitiveType(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Enumeration_2003(Enumeration instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(32, UMLPackage.eINSTANCE.getEnumeration(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Interface_2010(Interface instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(37, UMLPackage.eINSTANCE.getInterface(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Constraint_2006(Constraint instance) {
		try {
			OpaqueExpression newInstance_0_0 = UMLFactory.eINSTANCE.createOpaqueExpression();
			instance.setSpecification(newInstance_0_0);
			Object value_0_0_0 = UMLOCLFactory.getExpression(38, UMLPackage.eINSTANCE.getOpaqueExpression(), null).evaluate(newInstance_0_0);
			if (value_0_0_0 instanceof Collection) {
				newInstance_0_0.getLanguages().clear();
				newInstance_0_0.getLanguages().addAll(((Collection) value_0_0_0));
			} else {
				newInstance_0_0.getLanguages().add((String) value_0_0_0);
			}
			Object value_0_0_1 = UMLOCLFactory.getExpression(39, UMLPackage.eINSTANCE.getOpaqueExpression(), null).evaluate(newInstance_0_0);
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
	public void init_InstanceSpecification_2008(InstanceSpecification instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(40, UMLPackage.eINSTANCE.getInstanceSpecification(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Dependency_2009(Dependency instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(43, UMLPackage.eINSTANCE.getDependency(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Interface_2013(Interface instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(44, UMLPackage.eINSTANCE.getInterface(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Package_2016(Package instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(49, UMLPackage.eINSTANCE.getPackage(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InstanceSpecification_2017(InstanceSpecification instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(50, UMLPackage.eINSTANCE.getInstanceSpecification(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Package_3006(Package instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(1, UMLPackage.eINSTANCE.getPackage(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Class_3007(Class instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(3, UMLPackage.eINSTANCE.getClass_(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DataType_3008(DataType instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(5, UMLPackage.eINSTANCE.getDataType(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_PrimitiveType_3009(PrimitiveType instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(6, UMLPackage.eINSTANCE.getPrimitiveType(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Enumeration_3011(Enumeration instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(7, UMLPackage.eINSTANCE.getEnumeration(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_AssociationClass_3012(AssociationClass instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(8, UMLPackage.eINSTANCE.getAssociationClass(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Interface_3041(Interface instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(9, UMLPackage.eINSTANCE.getInterface(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InstanceSpecification_3013(InstanceSpecification instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(10, UMLPackage.eINSTANCE.getInstanceSpecification(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Property_3001(Property instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(14, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getAggregationKind());
			instance.setAggregation((AggregationKind) value_0);
			Object value_1 = UMLOCLFactory.getExpression(15, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Operation_3002(Operation instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(16, UMLPackage.eINSTANCE.getOperation(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Class_3003(Class instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(3, UMLPackage.eINSTANCE.getClass_(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Port_3025(Port instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(17, UMLPackage.eINSTANCE.getPort(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getAggregationKind());
			instance.setAggregation((AggregationKind) value_0);
			Object value_1 = UMLOCLFactory.getExpression(18, UMLPackage.eINSTANCE.getPort(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Property_3019(Property instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(20, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getAggregationKind());
			instance.setAggregation((AggregationKind) value_0);
			Object value_1 = UMLOCLFactory.getExpression(21, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Operation_3020(Operation instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(22, UMLPackage.eINSTANCE.getOperation(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Property_3014(Property instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(25, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getAggregationKind());
			instance.setAggregation((AggregationKind) value_0);
			Object value_1 = UMLOCLFactory.getExpression(26, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Operation_3015(Operation instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(27, UMLPackage.eINSTANCE.getOperation(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Property_3021(Property instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(29, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getAggregationKind());
			instance.setAggregation((AggregationKind) value_0);
			Object value_1 = UMLOCLFactory.getExpression(30, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Operation_3022(Operation instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(31, UMLPackage.eINSTANCE.getOperation(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_EnumerationLiteral_3016(EnumerationLiteral instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(33, UMLPackage.eINSTANCE.getEnumerationLiteral(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Property_3023(Property instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(34, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getAggregationKind());
			instance.setAggregation((AggregationKind) value_0);
			Object value_1 = UMLOCLFactory.getExpression(35, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Operation_3024(Operation instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(36, UMLPackage.eINSTANCE.getOperation(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Property_3028(Property instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(46, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);

			value_0 = UMLAbstractExpression.performCast(value_0, UMLPackage.eINSTANCE.getAggregationKind());
			instance.setAggregation((AggregationKind) value_0);
			Object value_1 = UMLOCLFactory.getExpression(47, UMLPackage.eINSTANCE.getProperty(), null).evaluate(instance);
			instance.setName((String) value_1);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Operation_3029(Operation instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(48, UMLPackage.eINSTANCE.getOperation(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Class_3030(Class instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(3, UMLPackage.eINSTANCE.getClass_(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Package_3032(Package instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(49, UMLPackage.eINSTANCE.getPackage(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Class_3033(Class instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(12, UMLPackage.eINSTANCE.getClass_(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Enumeration_3034(Enumeration instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(32, UMLPackage.eINSTANCE.getEnumeration(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_InstanceSpecification_3035(InstanceSpecification instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(40, UMLPackage.eINSTANCE.getInstanceSpecification(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_DataType_3036(DataType instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(24, UMLPackage.eINSTANCE.getDataType(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_PrimitiveType_3037(PrimitiveType instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(28, UMLPackage.eINSTANCE.getPrimitiveType(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Interface_3042(Interface instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(44, UMLPackage.eINSTANCE.getInterface(), null).evaluate(instance);
			instance.setName((String) value_0);
		} catch (RuntimeException e) {
			UMLDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Interface_3043(Interface instance) {
		try {
			Object value_0 = UMLOCLFactory.getExpression(37, UMLPackage.eINSTANCE.getInterface(), null).evaluate(instance);
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
}
