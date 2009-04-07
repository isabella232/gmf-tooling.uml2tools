package org.eclipse.uml2.diagram.clazz.tests.stereo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.diagram.common.stereo.StereotypeListener;
import org.eclipse.uml2.diagram.common.stereo.StereotypeUtil;
import org.eclipse.uml2.diagram.common.stereo.TaggedValueHelper;
import org.eclipse.uml2.diagram.common.stereo.TaggedValueListener;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

public class TestStereotypeListeners extends TestCase {

	protected static final ResourceSet RESOURCE_SET = new ResourceSetImpl();

	private Class clazzA;

	private Package pakkage;

	private Stereotype stereo;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		pakkage = UMLFactory.eINSTANCE.createPackage();
		clazzA = pakkage.createOwnedClass("A", false);
		createResourceForPackage(pakkage);
		Profile profile = getProfile();
		assertNotNull(profile);
		pakkage.applyProfile(profile);
		assertTrue(pakkage.getAppliedProfiles().size() == 1);
		assertNotNull(profile.equals(pakkage.getAppliedProfiles().get(0)));
		stereo = profile.getOwnedStereotype("StereotypeA");
		assertNotNull(stereo);
	}

	@Override
	protected void tearDown() throws Exception {
		clazzA = null;
		stereo = null;
		pakkage = null;
		super.tearDown();
	}

	public void testApplyStereotype() {
		MockStereotypeListener l = new MockStereotypeListener();
		StereotypeUtil.addStereotypeListener(pakkage, l);

		clazzA.applyStereotype(stereo);

		List<Event> actual = l.getEvents();
		assertTrue(actual.size() <= 1);
		assertEquals(new Event(Event.APPLY_STEREOTYPE, clazzA, stereo), actual.get(0));
	}

	public void testApplyAndThenUnapplyStereotype() {
		MockStereotypeListener l = new MockStereotypeListener();
		StereotypeUtil.addStereotypeListener(pakkage, l);

		clazzA.applyStereotype(stereo);
		assertEquals(stereo, clazzA.getAppliedStereotypes().get(0));
		clazzA.unapplyStereotype(stereo);

		List<Event> actual = l.getEvents();
		assertTrue(actual.size() <= 2);

		assertEquals(new Event(Event.APPLY_STEREOTYPE, clazzA, stereo), actual.get(0));
		assertEquals(new Event(Event.UNAPPLY_STEREOTYPE, clazzA, stereo), actual.get(1));
	}

	public void testUnapplyStereotype() {
		clazzA.applyStereotype(stereo);
		assertEquals(stereo, clazzA.getAppliedStereotypes().get(0));

		MockStereotypeListener l = new MockStereotypeListener();
		StereotypeUtil.addStereotypeListener(pakkage, l);

		clazzA.unapplyStereotype(stereo);

		List<Event> actual = l.getEvents();
		assertTrue(actual.size() <= 1);
		assertEquals(new Event(Event.UNAPPLY_STEREOTYPE, clazzA, stereo), actual.get(0));
	}

	public void testChangeSimpleTaggedValue() {
		clazzA.applyStereotype(stereo);
		assertEquals(stereo, clazzA.getAppliedStereotypes().get(0));

		MockTaggedValueListener l = new MockTaggedValueListener();
		StereotypeUtil.createTaggedValueHelper(clazzA, stereo).addTaggedValueListener(l);
		String newValue = "qwwrty";
		Property p = stereo.getOwnedAttributes().get(0);
		clazzA.setValue(stereo, p.getName(), newValue);

		List<Event> actual = l.getEvents();
		assertTrue(actual.size() <= 1);
		assertEquals(new Event(Event.TAGGED_VALUE_CHANGED, clazzA, stereo, p, newValue), actual.get(0));
	}

	public void testChangeSimpleTaggedValueTwice() {
		clazzA.applyStereotype(stereo);
		assertEquals(stereo, clazzA.getAppliedStereotypes().get(0));

		MockTaggedValueListener l = new MockTaggedValueListener();
		StereotypeUtil.createTaggedValueHelper(clazzA, stereo).addTaggedValueListener(l);
		String newValue = "qwwrty";
		Property p = stereo.getOwnedAttributes().get(0);
		clazzA.setValue(stereo, p.getName(), newValue);

		String newValue2 = "AAA";
		Property p2 = stereo.getOwnedAttributes().get(1);
		clazzA.setValue(stereo, p2.getName(), newValue2);

		List<Event> actual = l.getEvents();
		assertTrue(actual.size() <= 2);
		assertEquals(new Event(Event.TAGGED_VALUE_CHANGED, clazzA, stereo, p, newValue), actual.get(0));
		assertEquals(new Event(Event.TAGGED_VALUE_CHANGED, clazzA, stereo, p2, newValue2), actual.get(1));
	}

	public void testChangeMultivaluedTaggedValue() {
		clazzA.applyStereotype(stereo);
		assertEquals(stereo, clazzA.getAppliedStereotypes().get(0));

		MockTaggedValueListener l = new MockTaggedValueListener();
		StereotypeUtil.createTaggedValueHelper(clazzA, stereo).addTaggedValueListener(l);
		List newValue = new LinkedList();
		newValue.add("qwwrty");
		Property p = stereo.getOwnedAttributes().get(2);
		clazzA.setValue(stereo, p.getName(), newValue);

		List<Event> actual = l.getEvents();
		assertTrue(actual.size() <= 1);
		assertEquals(new Event(Event.TAGGED_VALUE_CHANGED, clazzA, stereo, p, newValue.get(0)), actual.get(0));
	}

	public void testSetMultivaluedTaggedValueTwice() {
		clazzA.applyStereotype(stereo);
		assertEquals(stereo, clazzA.getAppliedStereotypes().get(0));

		MockTaggedValueListener l = new MockTaggedValueListener();
		StereotypeUtil.createTaggedValueHelper(clazzA, stereo).addTaggedValueListener(l);
		List newValue = new LinkedList();
		newValue.add("qwwrty");
		Property p = stereo.getOwnedAttributes().get(2);
		clazzA.setValue(stereo, p.getName(), newValue);
		newValue.add("AAA");
		clazzA.setValue(stereo, p.getName(), newValue);

		List<Event> actual = l.getEvents();
		assertTrue(actual.size() <= 3);
		assertEquals(new Event(Event.TAGGED_VALUE_CHANGED, clazzA, stereo, p, newValue.get(0)), actual.get(0));
		assertEquals(new Event(Event.TAGGED_VALUE_CHANGED, clazzA, stereo, p, null), actual.get(1));
		assertEquals(new Event(Event.TAGGED_VALUE_CHANGED, clazzA, stereo, p, newValue), actual.get(2));
	}

	public void testRemoveMultivaluedTaggedValueWhenOneValueSet() {
		clazzA.applyStereotype(stereo);
		assertEquals(stereo, clazzA.getAppliedStereotypes().get(0));

		MockTaggedValueListener l = new MockTaggedValueListener();
		StereotypeUtil.createTaggedValueHelper(clazzA, stereo).addTaggedValueListener(l);
		List newValue = new LinkedList();
		newValue.add("qwwrty");
		Property p = stereo.getOwnedAttributes().get(2);
		clazzA.setValue(stereo, p.getName(), newValue);
		clazzA.setValue(stereo, p.getName(), Collections.emptyList());

		List<Event> actual = l.getEvents();
		assertTrue(actual.size() <= 2);
		assertEquals(new Event(Event.TAGGED_VALUE_CHANGED, clazzA, stereo, p, newValue.get(0)), actual.get(0));
		assertEquals(new Event(Event.TAGGED_VALUE_CHANGED, clazzA, stereo, p, null), actual.get(1));
	}

	public void testRemoveMultivaluedTaggedValueWhenManyValuesSet() {
		clazzA.applyStereotype(stereo);
		assertEquals(stereo, clazzA.getAppliedStereotypes().get(0));

		MockTaggedValueListener l = new MockTaggedValueListener();
		StereotypeUtil.createTaggedValueHelper(clazzA, stereo).addTaggedValueListener(l);
		List newValue = new LinkedList();
		newValue.add("qwwrty");
		newValue.add("AAA");
		Property p = stereo.getOwnedAttributes().get(2);
		clazzA.setValue(stereo, p.getName(), newValue);
		clazzA.setValue(stereo, p.getName(), Collections.emptyList());

		List<Event> actual = l.getEvents();
		assertTrue(actual.size() <= 2);
		assertEquals(new Event(Event.TAGGED_VALUE_CHANGED, clazzA, stereo, p, newValue), actual.get(0));
		assertEquals(new Event(Event.TAGGED_VALUE_CHANGED, clazzA, stereo, p, null), actual.get(1));
	}

	public void testDefaultTaggedValue() {
		fail("To implement");
		//when tagged value has a default value, no value is set to the StereotypeApplication
	}

	public void testRequiredStereotype() {
		fail("To implement");
	}

	private static Resource createResourceForPackage(org.eclipse.uml2.uml.Package pakkage) {
		Resource res = RESOURCE_SET.createResource(URI.createURI("xttp://myresource"));
		res.getContents().add(pakkage);
		return res;
	}

	private static Profile getProfile() {
		Resource resource = RESOURCE_SET.getResource(URI.createURI(PROFILE_SAMPLE_URI), true);
		return (Profile) EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.PROFILE);
	}

	private static class MockStereotypeListener implements StereotypeListener {

		private List<Event> myEvents = new ArrayList<Event>();

		public TaggedValueHelper stereotypeApplied(Element owner, Stereotype applied, EObject application) {
			myEvents.add(new Event(Event.APPLY_STEREOTYPE, owner, applied));
			return null;
		}

		public void stereotypeUnapplied(Element owner, Stereotype applied) {
			myEvents.add(new Event(Event.UNAPPLY_STEREOTYPE, owner, applied));
		}

		public List<Event> getEvents() {
			return myEvents;
		}

	}

	private static class Event {

		public static final int APPLY_STEREOTYPE = 0;

		public static final int UNAPPLY_STEREOTYPE = 1;

		public static final int TAGGED_VALUE_CHANGED = 2;

		public final int type;

		public final Element owner;

		public final Stereotype stereo;

		public final Property metaTaggedValue;

		public final Object newValue;

		public Event(int t, Element o, Stereotype s) {
			type = t;
			owner = o;
			stereo = s;
			metaTaggedValue = null;
			newValue = null;
		}

		public Event(int t, Element o, Stereotype s, Property mtv, Object nv) {
			type = t;
			owner = o;
			stereo = s;
			metaTaggedValue = mtv;
			newValue = nv;
		}

		@Override
		public String toString() {
			return "type=" + type + ",owner=" + owner + ",stereo=" + stereo.getName() + ", metataggedValue=" + metaTaggedValue + ", newValue=" + newValue;
		}

		@Override
		public boolean equals(Object obj) {
			if (false == obj instanceof Event) {
				return false;
			}
			Event e = (Event) obj;
			if (type != e.type) {
				return false;
			}
			if (!equals(owner, e.owner)) {
				return false;
			}
			if (!equals(stereo, e.stereo)) {
				return false;
			}
			if (!equals(metaTaggedValue, e.metaTaggedValue)) {
				return false;
			}
			if (!equals(newValue, e.newValue)) {
				return false;
			}
			if (false == ((stereo != null) ? owner.equals(e.owner) : e.owner == null)) {
				return false;
			}
			return true;
		}

		private boolean equals(Object ob1, Object ob2) {
			return (ob1 != null) ? ob1.equals(ob2) : ob2 == null;
		}
	}

	private static class MockTaggedValueListener implements TaggedValueListener {

		private List<Event> myEvents = new ArrayList<Event>();

		public void taggedValueChanged(Element stereotypeOwner, Stereotype stereo, Property metaTaggedValue, Notification raw) {
			myEvents.add(new Event(Event.TAGGED_VALUE_CHANGED, stereotypeOwner, stereo, metaTaggedValue, raw.getNewValue()));
		}

		public List<Event> getEvents() {
			return myEvents;
		}

	}

	private final static String PROFILE_SAMPLE_URI = "platform:/plugin/org.eclipse.uml2.diagram.clazz.tests/examples/stereo/SampleProfile.profile.uml";

}
