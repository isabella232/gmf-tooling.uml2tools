package org.eclipse.uml2.diagram.sequence.tests;

import java.util.LinkedList;

import org.eclipse.uml2.diagram.sequence.model.builder.SDBuilder;
import org.eclipse.uml2.diagram.sequence.model.create.CreateCombinedFragment;
import org.eclipse.uml2.diagram.sequence.model.create.SDAnchor;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracket;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracketContainer;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDCombinedFragment;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrame;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrameContainer;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDInteractionOperand;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDMountingRegion;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperatorKind;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.UMLFactory;

public class SDModelCreateTest extends AbstractSDModelBuilderTest {

	public void testPreconditionsCreatetLifelineX2() {
		SDModel sdModel = createSimpleLifeLineX2();
		assertNotNull(sdModel);

		SDLifeLine a = findLifeLineByName(sdModel, "a");
		SDLifeLine b = findLifeLineByName(sdModel, "b");
		assertNotNull(a);
		assertNotNull(b);
	}

	public void testFirstCreateCombinedFragmentOnLifeline() {
		SDModel sdModel = createSimpleLifeLineX2();
		SDLifeLine a = findLifeLineByName(sdModel, "a");
		SDLifeLine b = findLifeLineByName(sdModel, "b");

		final InteractionOperatorKind ALT_LITERAL = InteractionOperatorKind.ALT_LITERAL;

		SDAnchor forFirstCreated = null;
		CreateCombinedFragment creator = new CreateCombinedFragment(sdModel);
		SDCombinedFragment firstForA = creator.createCombinedFragment(//
				a, forFirstCreated, ALT_LITERAL, 3);

		basicCheckCreatedCombinedFragment(firstForA, ALT_LITERAL, 3, a);

		assertTrue(sdModel.getFrames().contains(firstForA));
		assertTrue(firstForA.getCoveredLifeLines().contains(a));
		assertFalse(firstForA.getCoveredLifeLines().contains(b));

		assertFalse(a.getBrackets().isEmpty());
		assertTrue(b.getBrackets().isEmpty());

		assertNotNull(firstForA.findRegionForSDLifeLine(a));
		assertNull(firstForA.findRegionForSDLifeLine(b));
		assertTrue(a.getBrackets().contains(firstForA.findRegionForSDLifeLine(a)));

		SDModel rebuilt = new SDBuilder(sdModel.getUmlInteraction()).getSDModel();
		assertNotNull(rebuilt);
		assertEquals(1, rebuilt.getFrames().size());
		assertTrue(rebuilt.getFrames().get(0) instanceof SDCombinedFragment);
		assertSame(firstForA.getUmlFragment(), rebuilt.getFrames().get(0).getUmlFragment());
	}

	public void testCreateCombinedFragmentAfterAnchor() {
		SDModel sdModel = createSimpleLifeLineX2();
		SDLifeLine a = findLifeLineByName(sdModel, "a");
		SDLifeLine b = findLifeLineByName(sdModel, "b");

		final InteractionOperatorKind SEQ_LITERAL = InteractionOperatorKind.SEQ_LITERAL;
		final InteractionOperatorKind ASSERT_LITERAL = InteractionOperatorKind.ASSERT_LITERAL;
		final CreateCombinedFragment creator = new CreateCombinedFragment(sdModel);

		SDCombinedFragment anchorOnB = creator.createCombinedFragment(//
				b, null, SEQ_LITERAL, 4);
		basicCheckCreatedCombinedFragment(anchorOnB, SEQ_LITERAL, 4, b);

		SDMountingRegion anchorMounter = anchorOnB.findRegionForSDLifeLine(b);
		assertNotNull(anchorMounter);
		assertSame(b, anchorMounter.getBracketContainer());

		SDAnchor afterAnchor = SDAnchor.after(anchorMounter);
		SDCombinedFragment subj = creator.createCombinedFragment(b, afterAnchor, ASSERT_LITERAL, 1);
		basicCheckCreatedCombinedFragment(subj, ASSERT_LITERAL, 1, b);

		assertTrue(subj.getCoveredLifeLines().contains(b));
		assertFalse(subj.getCoveredLifeLines().contains(a));

		assertNotNull(subj.findRegionForSDLifeLine(b));
		assertNull(subj.findRegionForSDLifeLine(a));

		SDMountingRegion subjMounter = subj.findRegionForSDLifeLine(b);
		assertSame(b, subjMounter.getBracketContainer());

		checkIsSiblingBefore(anchorMounter, subjMounter);
	}

	public void testCreateCombinedFragmentBeforeAnchor() {
		SDModel sdModel = createSimpleLifeLineX2();
		SDLifeLine a = findLifeLineByName(sdModel, "a");
		SDLifeLine b = findLifeLineByName(sdModel, "b");

		final InteractionOperatorKind LOOP_LITERAL = InteractionOperatorKind.LOOP_LITERAL;

		final CreateCombinedFragment creator = new CreateCombinedFragment(sdModel);

		SDCombinedFragment anchorOnA = creator.createCombinedFragment(//
				a, null, LOOP_LITERAL, 1);
		basicCheckCreatedCombinedFragment(anchorOnA, LOOP_LITERAL, 1, a);

		assertNull(anchorOnA.findRegionForSDLifeLine(b));
		SDMountingRegion anchorMounter = anchorOnA.findRegionForSDLifeLine(a);
		assertNotNull(anchorMounter);
		assertSame(a, anchorMounter.getBracketContainer());

		SDAnchor beforeAnchor = SDAnchor.firstChildFor(a);
		SDCombinedFragment subj = creator.createCombinedFragment(a, beforeAnchor, LOOP_LITERAL, 1);
		basicCheckCreatedCombinedFragment(subj, LOOP_LITERAL, 1, a);

		assertFalse(subj.getCoveredLifeLines().contains(b));
		assertTrue(subj.getCoveredLifeLines().contains(a));

		assertNull(subj.findRegionForSDLifeLine(b));
		assertNotNull(subj.findRegionForSDLifeLine(a));

		SDMountingRegion subjMounter = subj.findRegionForSDLifeLine(a);
		assertSame(a, subjMounter.getBracketContainer());

		checkIsSiblingBefore(subjMounter, anchorMounter);
	}
	
	public void testCombinedMountingRegionsAreInvalidContainers(){
		SDModel sdModel = createSimpleLifeLineX2();
		SDLifeLine a = findLifeLineByName(sdModel, "a");

		final InteractionOperatorKind SOME_LITERAL = InteractionOperatorKind.STRICT_LITERAL;

		final CreateCombinedFragment creator = new CreateCombinedFragment(sdModel);

		SDCombinedFragment combineParent = creator.createCombinedFragment(//
				a, null, SOME_LITERAL, 1);
		basicCheckCreatedCombinedFragment(combineParent, SOME_LITERAL, 1, a);

		assertNotNull(combineParent.findRegionForSDLifeLine(a));
		SDMountingRegion combinedMounter = combineParent.findRegionForSDLifeLine(a);
		assertNotNull(combinedMounter);
		assertSame(a, combinedMounter.getBracketContainer());
		
		assertNull(creator.createCombinedFragment(//
				combinedMounter, SDAnchor.firstChildFor(combinedMounter), SOME_LITERAL, 1));
	}
	
	public void testCreateNestedCombinedRegion(){
		SDModel sdModel = createSimpleLifeLineX2();
		SDLifeLine a = findLifeLineByName(sdModel, "a");

		final InteractionOperatorKind SOME_LITERAL = InteractionOperatorKind.OPT_LITERAL;
		final int OPERANDS = 2;

		final CreateCombinedFragment creator = new CreateCombinedFragment(sdModel);
		SDCombinedFragment combineParent = creator.createCombinedFragment(//
				a, null, SOME_LITERAL, OPERANDS);
		
		basicCheckCreatedCombinedFragment(combineParent, SOME_LITERAL, OPERANDS, a);

		assertNotNull(combineParent.findRegionForSDLifeLine(a));
		SDMountingRegion combinedMounter = combineParent.findRegionForSDLifeLine(a);
		assertNotNull(combinedMounter);
		assertSame(a, combinedMounter.getBracketContainer());
		
		assertEquals(OPERANDS, combinedMounter.getBrackets().size());
		for (SDBracket nextOperandMounter : combinedMounter.getBrackets()){
			assertTrue(nextOperandMounter instanceof SDMountingRegion);
			
			SDCombinedFragment nextInner = creator.createCombinedFragment(//
					(SDMountingRegion)nextOperandMounter, null, SOME_LITERAL, 1);
			
			basicCheckCreatedCombinedFragment(nextInner, SOME_LITERAL, 1, a);
		}
	}

	private void basicCheckCreatedCombinedFragment(SDCombinedFragment combined, InteractionOperatorKind expectedOperator, int expectedOperands, SDLifeLine... expectedCovereds) {
		assertNotNull(combined);
		assertNotNull(combined.getUmlFragment());
		assertNotNull(combined.getUmlCombinedFragment());
		assertEquals(expectedOperator, combined.getUmlCombinedFragment().getInteractionOperator());

		assertEquals(expectedCovereds.length, combined.getCoveredLifeLines().size());
		for (SDLifeLine nextLifeLine : expectedCovereds) {
			assertTrue(combined.getCoveredLifeLines().contains(nextLifeLine));
			assertNotNull(combined.findRegionForSDLifeLine(nextLifeLine));
		}

		assertEquals(expectedOperands, combined.getFrames().size());
		for (SDFrame nextOperand : combined.getFrames()) {
			assertTrue(nextOperand instanceof SDInteractionOperand);
			assertEquals(expectedCovereds.length, nextOperand.getCoveredLifeLines().size());

			for (SDLifeLine nextLifeLine : expectedCovereds) {
				assertTrue(nextOperand.getCoveredLifeLines().contains(nextLifeLine));
				assertNotNull(nextOperand.findRegionForSDLifeLine(nextLifeLine));
				assertTrue(nextOperand.findRegionForSDLifeLine(nextLifeLine).getBrackets().isEmpty());
			}
		}
		checkModelReparsableAndContainsCopyFor(combined);
	}
	
	protected void checkModelReparsableAndContainsCopyFor(SDFrame justCreated){
		SDModel actualSDModel = rootSDModel(justCreated);
		assertNotNull(actualSDModel);
		SDModel reparsed = new SDBuilder(actualSDModel.getUmlInteraction()).getSDModel();
		assertNotNull(reparsed);
		
		LinkedList<SDFrame> framesSearch = new LinkedList<SDFrame>(reparsed.getFrames());
		SDFrame foundCopy = null;
		while (foundCopy == null && !framesSearch.isEmpty()){
			SDFrame next = framesSearch.removeFirst();
			if (next.getUmlFragment() == justCreated.getUmlFragment()){
				foundCopy = next;
			} else {
				framesSearch.addAll(next.getFrames());
			}
		}
		assertNotNull(foundCopy);
	}
	
	private static SDModel rootSDModel(SDFrame frame){
		if (frame == null){
			return null;
		}
		SDFrameContainer container = frame.getFrameContainer();
		if (container instanceof SDModel){
			return (SDModel)container;
		}
		return rootSDModel((SDFrame)container); 
	}

	protected void checkSiblingsInOrder(SDBracket... siblings) {
		assertTrue(siblings.length >= 2);
		for (int i = 0; i < siblings.length - 1; i++) {
			checkIsSiblingBefore(siblings[i], siblings[i + 1]);
		}
	}

	protected void checkIsSiblingBefore(SDBracket expectedBefore, SDBracket expectedAfter) {
		assertFalse(expectedBefore == expectedAfter);
		assertNotNull(expectedBefore.getBracketContainer());
		assertSame(expectedBefore.getBracketContainer(), expectedAfter.getBracketContainer());

		SDBracketContainer commonContainer = expectedAfter.getBracketContainer();
		assertTrue(commonContainer.getBrackets().indexOf(expectedAfter) > -1);
		assertTrue(commonContainer.getBrackets().indexOf(expectedBefore) > -1);
		assertTrue(commonContainer.getBrackets().indexOf(expectedBefore) < commonContainer.getBrackets().indexOf(expectedAfter));
	}

	private SDModel createSimpleLifeLineX2() {
		Interaction umlResult = UMLFactory.eINSTANCE.createInteraction();
		umlResult.setName("Interaction");
		Lifeline a = umlResult.createLifeline("a");
		Lifeline b = umlResult.createLifeline("b");

		SDModel sdModel = new SDBuilder(umlResult).getSDModel();

		assertNotNull(sdModel);
		assertEquals(2, sdModel.getLifelines().size());
		assertTrue(sdModel.getFrames().isEmpty());
		assertTrue(sdModel.getGates().isEmpty());
		assertTrue(sdModel.getMessages().isEmpty());
		assertSame(umlResult, sdModel.getUmlInteraction());
		assertNotNull(sdModel.getUMLTracing());

		SDLifeLine sdLifeLineA = findLifeLineByName(sdModel, "a");
		SDLifeLine sdLifeLineB = findLifeLineByName(sdModel, "b");

		assertNotNull(sdLifeLineA);
		assertNotNull(sdLifeLineB);
		assertSame(a, sdLifeLineA.getUmlLifeline());
		assertSame(b, sdLifeLineB.getUmlLifeline());

		assertSame(sdLifeLineA, sdLifeLineA.getCoveredLifeLine());
		assertSame(sdLifeLineB, sdLifeLineB.getCoveredLifeLine());

		return sdModel;
	}
	

}
