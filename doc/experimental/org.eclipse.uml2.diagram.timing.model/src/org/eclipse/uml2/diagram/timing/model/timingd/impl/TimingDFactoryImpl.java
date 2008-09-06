/**
 * <copyright>
 * </copyright>
 *
 * $Id: TimingDFactoryImpl.java,v 1.1 2008/09/06 19:44:14 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.uml2.diagram.timing.model.timingd.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimingDFactoryImpl extends EFactoryImpl implements TimingDFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimingDFactory init() {
		try {
			TimingDFactory theTimingDFactory = (TimingDFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/mdt/uml2tools/timing-diagram/1.0"); 
			if (theTimingDFactory != null) {
				return theTimingDFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimingDFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingDFactoryImpl() {
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
			case TimingDPackage.DFRAME_CONTAINER: return createDFrameContainer();
			case TimingDPackage.DFRAME: return createDFrame();
			case TimingDPackage.DBLOCK: return createDBlock();
			case TimingDPackage.DVALUE_LINE: return createDValueLine();
			case TimingDPackage.DSEGMENT: return createDSegment();
			case TimingDPackage.DSEGMENT_ELEMENT: return createDSegmentElement();
			case TimingDPackage.DSEGMENT_MIDDLE_POINT: return createDSegmentMiddlePoint();
			case TimingDPackage.DSEGMENT_START: return createDSegmentStart();
			case TimingDPackage.DSEGMENT_END: return createDSegmentEnd();
			case TimingDPackage.DSTATE_SWITCH: return createDStateSwitch();
			case TimingDPackage.DINTERVAL: return createDInterval();
			case TimingDPackage.DPOINT_CONSTRAINT: return createDPointConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFrameContainer createDFrameContainer() {
		DFrameContainerImpl dFrameContainer = new DFrameContainerImpl();
		return dFrameContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFrame createDFrame() {
		DFrameImpl dFrame = new DFrameImpl();
		return dFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBlock createDBlock() {
		DBlockImpl dBlock = new DBlockImpl();
		return dBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DValueLine createDValueLine() {
		DValueLineImpl dValueLine = new DValueLineImpl();
		return dValueLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegment createDSegment() {
		DSegmentImpl dSegment = new DSegmentImpl();
		return dSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentElement createDSegmentElement() {
		DSegmentElementImpl dSegmentElement = new DSegmentElementImpl();
		return dSegmentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentMiddlePoint createDSegmentMiddlePoint() {
		DSegmentMiddlePointImpl dSegmentMiddlePoint = new DSegmentMiddlePointImpl();
		return dSegmentMiddlePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentStart createDSegmentStart() {
		DSegmentStartImpl dSegmentStart = new DSegmentStartImpl();
		return dSegmentStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentEnd createDSegmentEnd() {
		DSegmentEndImpl dSegmentEnd = new DSegmentEndImpl();
		return dSegmentEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DStateSwitch createDStateSwitch() {
		DStateSwitchImpl dStateSwitch = new DStateSwitchImpl();
		return dStateSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DInterval createDInterval() {
		DIntervalImpl dInterval = new DIntervalImpl();
		return dInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPointConstraint createDPointConstraint() {
		DPointConstraintImpl dPointConstraint = new DPointConstraintImpl();
		return dPointConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingDPackage getTimingDPackage() {
		return (TimingDPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimingDPackage getPackage() {
		return TimingDPackage.eINSTANCE;
	}

} //TimingDFactoryImpl
