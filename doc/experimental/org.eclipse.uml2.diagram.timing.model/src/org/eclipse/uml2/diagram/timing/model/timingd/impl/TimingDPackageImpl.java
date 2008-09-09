/**
 * <copyright>
 * </copyright>
 *
 * $Id: TimingDPackageImpl.java,v 1.6 2008/09/09 00:54:50 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.diagram.timing.model.timingd.DBlock;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrame;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrameContainer;
import org.eclipse.uml2.diagram.timing.model.timingd.DInterval;
import org.eclipse.uml2.diagram.timing.model.timingd.DMessage;
import org.eclipse.uml2.diagram.timing.model.timingd.DPointConstraint;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegment;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentEnd;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentMiddlePoint;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart;
import org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch;
import org.eclipse.uml2.diagram.timing.model.timingd.DValueLine;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDFactory;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.StateInvariant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimingDPackageImpl extends EPackageImpl implements TimingDPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dFrameContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dFrameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dValueLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dSegmentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dSegmentMiddlePointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dSegmentStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dSegmentEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dStateSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dPointConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlStateInvariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlLifelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlOccurrenceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlMessageEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimingDPackageImpl() {
		super(eNS_URI, TimingDFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimingDPackage init() {
		if (isInited) return (TimingDPackage)EPackage.Registry.INSTANCE.getEPackage(TimingDPackage.eNS_URI);

		// Obtain or create and register package
		TimingDPackageImpl theTimingDPackage = (TimingDPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof TimingDPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new TimingDPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTimingDPackage.createPackageContents();

		// Initialize created meta-data
		theTimingDPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTimingDPackage.freeze();

		return theTimingDPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDFrameContainer() {
		return dFrameContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFrameContainer_Pakkage() {
		return (EReference)dFrameContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFrameContainer_Frames() {
		return (EReference)dFrameContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDFrame() {
		return dFrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFrame_Container() {
		return (EReference)dFrameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFrame_Interaction() {
		return (EReference)dFrameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDFrame_DisplayName() {
		return (EAttribute)dFrameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFrame_Blocks() {
		return (EReference)dFrameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFrame_Intervals() {
		return (EReference)dFrameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDFrame_Messages() {
		return (EReference)dFrameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBlock() {
		return dBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDBlock_Lifeline() {
		return (EReference)dBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDBlock_Frame() {
		return (EReference)dBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBlock_DisplayName() {
		return (EAttribute)dBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDBlock_States() {
		return (EReference)dBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDBlock_Switches() {
		return (EReference)dBlockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDBlock_Constraint() {
		return (EReference)dBlockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDValueLine() {
		return dValueLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDValueLine_Block() {
		return (EReference)dValueLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDValueLine_InvariantTemplate() {
		return (EReference)dValueLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDValueLine_Segments() {
		return (EReference)dValueLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDValueLine_DisplayName() {
		return (EAttribute)dValueLineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSegment() {
		return dSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSegment_State() {
		return (EReference)dSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSegment_Start() {
		return (EReference)dSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSegment_End() {
		return (EReference)dSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSegment_MiddlePoints() {
		return (EReference)dSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSegment_EndSwitch() {
		return (EReference)dSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSegmentElement() {
		return dSegmentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSegmentElement_Occurrence() {
		return (EReference)dSegmentElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSegmentElement_DebugId() {
		return (EAttribute)dSegmentElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSegmentMiddlePoint() {
		return dSegmentMiddlePointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSegmentMiddlePoint_Segment() {
		return (EReference)dSegmentMiddlePointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSegmentStart() {
		return dSegmentStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSegmentStart_StateInvariant() {
		return (EReference)dSegmentStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSegmentStart_Segment() {
		return (EReference)dSegmentStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSegmentStart_IncomingSwitch() {
		return (EReference)dSegmentStartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSegmentEnd() {
		return dSegmentEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSegmentEnd_Segment() {
		return (EReference)dSegmentEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSegmentEnd_Switch() {
		return (EReference)dSegmentEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDStateSwitch() {
		return dStateSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDStateSwitch_FromSegmentEnd() {
		return (EReference)dStateSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDStateSwitch_ToSegmentStart() {
		return (EReference)dStateSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDStateSwitch_FromSegment() {
		return (EReference)dStateSwitchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDStateSwitch_ToSegment() {
		return (EReference)dStateSwitchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDStateSwitch_FromValueLine() {
		return (EReference)dStateSwitchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDStateSwitch_ToValueLine() {
		return (EReference)dStateSwitchEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMessage() {
		return dMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMessage_UmlMessage() {
		return (EReference)dMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMessage_DisplayName() {
		return (EAttribute)dMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMessage_Frame() {
		return (EReference)dMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMessage_MessageSource() {
		return (EReference)dMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMessage_MessageTarget() {
		return (EReference)dMessageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDInterval() {
		return dIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDInterval_FromPoint() {
		return (EReference)dIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDInterval_ToPoint() {
		return (EReference)dIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDPointConstraint() {
		return dPointConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPointConstraint_Constraint() {
		return (EReference)dPointConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDPointConstraint_ConstraintedSegmentElement() {
		return (EReference)dPointConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLConstraint() {
		return umlConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLStateInvariant() {
		return umlStateInvariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLInteraction() {
		return umlInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLPackage() {
		return umlPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLLifeline() {
		return umlLifelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLOccurrenceSpecification() {
		return umlOccurrenceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLMessage() {
		return umlMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingDFactory getTimingDFactory() {
		return (TimingDFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dFrameContainerEClass = createEClass(DFRAME_CONTAINER);
		createEReference(dFrameContainerEClass, DFRAME_CONTAINER__PAKKAGE);
		createEReference(dFrameContainerEClass, DFRAME_CONTAINER__FRAMES);

		dFrameEClass = createEClass(DFRAME);
		createEReference(dFrameEClass, DFRAME__CONTAINER);
		createEReference(dFrameEClass, DFRAME__INTERACTION);
		createEAttribute(dFrameEClass, DFRAME__DISPLAY_NAME);
		createEReference(dFrameEClass, DFRAME__BLOCKS);
		createEReference(dFrameEClass, DFRAME__INTERVALS);
		createEReference(dFrameEClass, DFRAME__MESSAGES);

		dBlockEClass = createEClass(DBLOCK);
		createEReference(dBlockEClass, DBLOCK__LIFELINE);
		createEReference(dBlockEClass, DBLOCK__FRAME);
		createEAttribute(dBlockEClass, DBLOCK__DISPLAY_NAME);
		createEReference(dBlockEClass, DBLOCK__STATES);
		createEReference(dBlockEClass, DBLOCK__SWITCHES);
		createEReference(dBlockEClass, DBLOCK__CONSTRAINT);

		dValueLineEClass = createEClass(DVALUE_LINE);
		createEReference(dValueLineEClass, DVALUE_LINE__BLOCK);
		createEReference(dValueLineEClass, DVALUE_LINE__INVARIANT_TEMPLATE);
		createEReference(dValueLineEClass, DVALUE_LINE__SEGMENTS);
		createEAttribute(dValueLineEClass, DVALUE_LINE__DISPLAY_NAME);

		dSegmentEClass = createEClass(DSEGMENT);
		createEReference(dSegmentEClass, DSEGMENT__STATE);
		createEReference(dSegmentEClass, DSEGMENT__START);
		createEReference(dSegmentEClass, DSEGMENT__END);
		createEReference(dSegmentEClass, DSEGMENT__MIDDLE_POINTS);
		createEReference(dSegmentEClass, DSEGMENT__END_SWITCH);

		dSegmentElementEClass = createEClass(DSEGMENT_ELEMENT);
		createEReference(dSegmentElementEClass, DSEGMENT_ELEMENT__OCCURRENCE);
		createEAttribute(dSegmentElementEClass, DSEGMENT_ELEMENT__DEBUG_ID);

		dSegmentMiddlePointEClass = createEClass(DSEGMENT_MIDDLE_POINT);
		createEReference(dSegmentMiddlePointEClass, DSEGMENT_MIDDLE_POINT__SEGMENT);

		dSegmentStartEClass = createEClass(DSEGMENT_START);
		createEReference(dSegmentStartEClass, DSEGMENT_START__STATE_INVARIANT);
		createEReference(dSegmentStartEClass, DSEGMENT_START__SEGMENT);
		createEReference(dSegmentStartEClass, DSEGMENT_START__INCOMING_SWITCH);

		dSegmentEndEClass = createEClass(DSEGMENT_END);
		createEReference(dSegmentEndEClass, DSEGMENT_END__SEGMENT);
		createEReference(dSegmentEndEClass, DSEGMENT_END__SWITCH);

		dStateSwitchEClass = createEClass(DSTATE_SWITCH);
		createEReference(dStateSwitchEClass, DSTATE_SWITCH__FROM_SEGMENT_END);
		createEReference(dStateSwitchEClass, DSTATE_SWITCH__TO_SEGMENT_START);
		createEReference(dStateSwitchEClass, DSTATE_SWITCH__FROM_SEGMENT);
		createEReference(dStateSwitchEClass, DSTATE_SWITCH__TO_SEGMENT);
		createEReference(dStateSwitchEClass, DSTATE_SWITCH__FROM_VALUE_LINE);
		createEReference(dStateSwitchEClass, DSTATE_SWITCH__TO_VALUE_LINE);

		dMessageEClass = createEClass(DMESSAGE);
		createEReference(dMessageEClass, DMESSAGE__UML_MESSAGE);
		createEAttribute(dMessageEClass, DMESSAGE__DISPLAY_NAME);
		createEReference(dMessageEClass, DMESSAGE__FRAME);
		createEReference(dMessageEClass, DMESSAGE__MESSAGE_SOURCE);
		createEReference(dMessageEClass, DMESSAGE__MESSAGE_TARGET);

		dIntervalEClass = createEClass(DINTERVAL);
		createEReference(dIntervalEClass, DINTERVAL__FROM_POINT);
		createEReference(dIntervalEClass, DINTERVAL__TO_POINT);

		dPointConstraintEClass = createEClass(DPOINT_CONSTRAINT);
		createEReference(dPointConstraintEClass, DPOINT_CONSTRAINT__CONSTRAINT);
		createEReference(dPointConstraintEClass, DPOINT_CONSTRAINT__CONSTRAINTED_SEGMENT_ELEMENT);

		umlConstraintEClass = createEClass(UML_CONSTRAINT);

		umlStateInvariantEClass = createEClass(UML_STATE_INVARIANT);

		umlInteractionEClass = createEClass(UML_INTERACTION);

		umlPackageEClass = createEClass(UML_PACKAGE);

		umlLifelineEClass = createEClass(UML_LIFELINE);

		umlOccurrenceSpecificationEClass = createEClass(UML_OCCURRENCE_SPECIFICATION);

		umlMessageEClass = createEClass(UML_MESSAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dSegmentMiddlePointEClass.getESuperTypes().add(this.getDSegmentElement());
		dSegmentStartEClass.getESuperTypes().add(this.getDSegmentElement());
		dSegmentEndEClass.getESuperTypes().add(this.getDSegmentElement());

		// Initialize classes and features; add operations and parameters
		initEClass(dFrameContainerEClass, DFrameContainer.class, "DFrameContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDFrameContainer_Pakkage(), this.getUMLPackage(), null, "pakkage", null, 0, 1, DFrameContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDFrameContainer_Frames(), this.getDFrame(), this.getDFrame_Container(), "frames", null, 0, -1, DFrameContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dFrameEClass, DFrame.class, "DFrame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDFrame_Container(), this.getDFrameContainer(), this.getDFrameContainer_Frames(), "container", null, 0, 1, DFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDFrame_Interaction(), this.getUMLInteraction(), null, "interaction", null, 1, 1, DFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDFrame_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, DFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDFrame_Blocks(), this.getDBlock(), this.getDBlock_Frame(), "blocks", null, 1, -1, DFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDFrame_Intervals(), this.getDInterval(), null, "intervals", null, 0, -1, DFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDFrame_Messages(), this.getDMessage(), this.getDMessage_Frame(), "messages", null, 0, -1, DFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dBlockEClass, DBlock.class, "DBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDBlock_Lifeline(), this.getUMLLifeline(), null, "lifeline", null, 0, 1, DBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDBlock_Frame(), this.getDFrame(), this.getDFrame_Blocks(), "frame", null, 0, 1, DBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBlock_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, DBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDBlock_States(), this.getDValueLine(), this.getDValueLine_Block(), "states", null, 0, -1, DBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDBlock_Switches(), this.getDStateSwitch(), null, "switches", null, 0, -1, DBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDBlock_Constraint(), this.getDPointConstraint(), null, "constraint", null, 0, -1, DBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dValueLineEClass, DValueLine.class, "DValueLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDValueLine_Block(), this.getDBlock(), this.getDBlock_States(), "block", null, 0, 1, DValueLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDValueLine_InvariantTemplate(), this.getUMLConstraint(), null, "invariantTemplate", null, 0, 1, DValueLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDValueLine_Segments(), this.getDSegment(), this.getDSegment_State(), "segments", null, 0, -1, DValueLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDValueLine_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, DValueLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dSegmentEClass, DSegment.class, "DSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSegment_State(), this.getDValueLine(), this.getDValueLine_Segments(), "state", null, 0, 1, DSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSegment_Start(), this.getDSegmentStart(), this.getDSegmentStart_Segment(), "start", null, 0, 1, DSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSegment_End(), this.getDSegmentEnd(), this.getDSegmentEnd_Segment(), "end", null, 0, 1, DSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSegment_MiddlePoints(), this.getDSegmentMiddlePoint(), this.getDSegmentMiddlePoint_Segment(), "middlePoints", null, 0, -1, DSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSegment_EndSwitch(), this.getDStateSwitch(), null, "endSwitch", null, 0, 1, DSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(dSegmentEClass, ecorePackage.getEBoolean(), "isClosedSegment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dSegmentElementEClass, DSegmentElement.class, "DSegmentElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSegmentElement_Occurrence(), this.getUMLOccurrenceSpecification(), null, "occurrence", null, 0, 1, DSegmentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSegmentElement_DebugId(), ecorePackage.getEString(), "debugId", null, 0, 1, DSegmentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dSegmentMiddlePointEClass, DSegmentMiddlePoint.class, "DSegmentMiddlePoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSegmentMiddlePoint_Segment(), this.getDSegment(), this.getDSegment_MiddlePoints(), "segment", null, 0, 1, DSegmentMiddlePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dSegmentStartEClass, DSegmentStart.class, "DSegmentStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSegmentStart_StateInvariant(), this.getUMLStateInvariant(), null, "stateInvariant", null, 0, 1, DSegmentStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSegmentStart_Segment(), this.getDSegment(), this.getDSegment_Start(), "segment", null, 0, 1, DSegmentStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSegmentStart_IncomingSwitch(), this.getDStateSwitch(), this.getDStateSwitch_ToSegmentStart(), "incomingSwitch", null, 0, 1, DSegmentStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dSegmentEndEClass, DSegmentEnd.class, "DSegmentEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSegmentEnd_Segment(), this.getDSegment(), this.getDSegment_End(), "segment", null, 0, 1, DSegmentEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDSegmentEnd_Switch(), this.getDStateSwitch(), this.getDStateSwitch_FromSegmentEnd(), "switch", null, 0, 1, DSegmentEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dStateSwitchEClass, DStateSwitch.class, "DStateSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDStateSwitch_FromSegmentEnd(), this.getDSegmentEnd(), this.getDSegmentEnd_Switch(), "fromSegmentEnd", null, 0, 1, DStateSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDStateSwitch_ToSegmentStart(), this.getDSegmentStart(), this.getDSegmentStart_IncomingSwitch(), "toSegmentStart", null, 0, 1, DStateSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDStateSwitch_FromSegment(), this.getDSegment(), null, "fromSegment", null, 0, 1, DStateSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDStateSwitch_ToSegment(), this.getDSegment(), null, "toSegment", null, 0, 1, DStateSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDStateSwitch_FromValueLine(), this.getDValueLine(), null, "fromValueLine", null, 0, 1, DStateSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDStateSwitch_ToValueLine(), this.getDValueLine(), null, "toValueLine", null, 0, 1, DStateSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dMessageEClass, DMessage.class, "DMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDMessage_UmlMessage(), this.getUMLMessage(), null, "umlMessage", null, 0, 1, DMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMessage_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, DMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMessage_Frame(), this.getDFrame(), this.getDFrame_Messages(), "frame", null, 0, 1, DMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMessage_MessageSource(), this.getDSegmentElement(), null, "messageSource", null, 0, 1, DMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMessage_MessageTarget(), this.getDSegmentElement(), null, "messageTarget", null, 0, 1, DMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dIntervalEClass, DInterval.class, "DInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDInterval_FromPoint(), this.getDSegmentElement(), null, "fromPoint", null, 0, 1, DInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDInterval_ToPoint(), this.getDSegmentElement(), null, "toPoint", null, 0, 1, DInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dPointConstraintEClass, DPointConstraint.class, "DPointConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDPointConstraint_Constraint(), this.getUMLConstraint(), null, "constraint", null, 0, 1, DPointConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDPointConstraint_ConstraintedSegmentElement(), this.getDSegmentElement(), null, "constraintedSegmentElement", null, 0, 1, DPointConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlConstraintEClass, Constraint.class, "UMLConstraint", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlStateInvariantEClass, StateInvariant.class, "UMLStateInvariant", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlInteractionEClass, Interaction.class, "UMLInteraction", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlPackageEClass, org.eclipse.uml2.uml.Package.class, "UMLPackage", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlLifelineEClass, Lifeline.class, "UMLLifeline", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlOccurrenceSpecificationEClass, OccurrenceSpecification.class, "UMLOccurrenceSpecification", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlMessageEClass, Message.class, "UMLMessage", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TimingDPackageImpl
