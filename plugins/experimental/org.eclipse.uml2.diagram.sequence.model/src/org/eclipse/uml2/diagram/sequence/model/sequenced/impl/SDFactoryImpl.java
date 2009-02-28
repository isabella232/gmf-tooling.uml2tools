/**
 * <copyright>
 * </copyright>
 *
 * $Id: SDFactoryImpl.java,v 1.4 2009/02/28 15:21:20 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.sequence.model.sequenced.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.uml2.diagram.sequence.model.sequenced.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SDFactoryImpl extends EFactoryImpl implements SDFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SDFactory init() {
		try {
			SDFactory theSDFactory = (SDFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/mdt/uml2tools/sequence-diagram/1.0"); 
			if (theSDFactory != null) {
				return theSDFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SDFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SDPackage.SD_MODEL: return createSDModel();
			case SDPackage.SD_GATE: return createSDGate();
			case SDPackage.SD_LIFE_LINE: return createSDLifeLine();
			case SDPackage.SD_EXECUTION: return createSDExecution();
			case SDPackage.SD_INVOCATION: return createSDInvocation();
			case SDPackage.SD_MESSAGE: return createSDMessage();
			case SDPackage.SD_GATE_MESSAGE: return createSDGateMessage();
			case SDPackage.SD_GATE_MESSAGE_END: return createSDGateMessageEnd();
			case SDPackage.SD_SIMPLE_NODE: return createSDSimpleNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDModel createSDModel() {
		SDModelImpl sdModel = new SDModelImpl();
		return sdModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDGate createSDGate() {
		SDGateImpl sdGate = new SDGateImpl();
		return sdGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDLifeLine createSDLifeLine() {
		SDLifeLineImpl sdLifeLine = new SDLifeLineImpl();
		return sdLifeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDExecution createSDExecution() {
		SDExecutionImpl sdExecution = new SDExecutionImpl();
		return sdExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDInvocation createSDInvocation() {
		SDInvocationImpl sdInvocation = new SDInvocationImpl();
		return sdInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDMessage createSDMessage() {
		SDMessageImpl sdMessage = new SDMessageImpl();
		return sdMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDGateMessage createSDGateMessage() {
		SDGateMessageImpl sdGateMessage = new SDGateMessageImpl();
		return sdGateMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDGateMessageEnd createSDGateMessageEnd() {
		SDGateMessageEndImpl sdGateMessageEnd = new SDGateMessageEndImpl();
		return sdGateMessageEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDSimpleNode createSDSimpleNode() {
		SDSimpleNodeImpl sdSimpleNode = new SDSimpleNodeImpl();
		return sdSimpleNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDPackage getSDPackage() {
		return (SDPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SDPackage getPackage() {
		return SDPackage.eINSTANCE;
	}

} //SDFactoryImpl
