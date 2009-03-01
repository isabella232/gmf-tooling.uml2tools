package org.eclipse.uml2.diagram.sequence.tests;

import java.util.Arrays;
import java.util.HashSet;

import org.eclipse.uml2.diagram.sequence.model.builder.SDBuilder;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracketContainer;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDCombinedFragment;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrame;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrameContainer;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDInteractionOperand;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDInteractionUse;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDMountingRegion;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDPackage;
import org.eclipse.uml2.uml.Lifeline;


public class SDFramesBuilderTest extends AbstractSDModelBuilderTest {
	public void testEmptyCombinedFragment(){
		SDBuilder builder = buildFrame("CombinedFragment-alt-x2-empty.uml", "Interaction");
		SDModel sdModel = builder.getSDModel();
		assertNotNull(sdModel);
		checkCallStackCompleted(builder);
		checkTraces(builder);

		SDLifeLine a = findLifeLineByName(sdModel, "a");
		SDLifeLine b = findLifeLineByName(sdModel, "b");
		
		assertFalse(sdModel.getFrames().isEmpty());
		assertEquals(1, sdModel.getFrames().size());

		checkCombinedFragment(sdModel.getFrames().get(0), a, b);
	}
	
	public void testCombinedFragmentWithContents(){
		SDBuilder builder = buildFrame("CombinedFragment-alt-x2-message-x2.uml", "Interaction");
		SDModel sdModel = builder.getSDModel();
		assertNotNull(sdModel);
		checkCallStackCompleted(builder);
		checkTraces(builder);
		
		SDLifeLine a = findLifeLineByName(sdModel, "a");
		SDLifeLine b = findLifeLineByName(sdModel, "b");
		
		assertFalse(sdModel.getFrames().isEmpty());
		assertEquals(1, sdModel.getFrames().size());
		assertTrue(sdModel.getFrames().get(0) instanceof SDCombinedFragment);
		SDCombinedFragment combined = (SDCombinedFragment)sdModel.getFrames().get(0);

		checkCombinedFragment(combined, a, b);
		
		//digging for operand contents
		SDMountingRegion mountingForCombinedOnA = combined.findRegionForSDLifeLine(a);
		SDMountingRegion mountingForCombinedOnB = combined.findRegionForSDLifeLine(b);
		
		assertFalse(combined.getFrames().isEmpty());
		assertEquals(2, combined.getFrames().size());
		for (SDFrame nextOperand : combined.getFrames()){
			assertTrue(nextOperand instanceof SDInteractionOperand);
			checkFrame(nextOperand, a, b);
			
			SDMountingRegion operandMounterOnA = mountingForCombinedOnA.findMountingRegionForSubFrame(nextOperand); 
			SDMountingRegion operandMounterOnB = mountingForCombinedOnB.findMountingRegionForSubFrame(nextOperand);
			assertNotNull(operandMounterOnA);
			assertNotNull(operandMounterOnB);
			
			assertEquals(1, operandMounterOnA.getBrackets().size());
			assertEquals(1, operandMounterOnB.getBrackets().size());
			
			checkExpectedMessage(operandMounterOnA.getBrackets().get(0), operandMounterOnB.getBrackets().get(0));
		}
	}
	
	protected void checkCombinedFragment(SDFrame sdFrame, SDLifeLine...expectedLifeLines){
		checkFrame(sdFrame, expectedLifeLines);
		assertTrue(sdFrame instanceof SDCombinedFragment);
		SDCombinedFragment combined = (SDCombinedFragment)sdFrame;
		
		assertEquals(combined.getUmlCombinedFragment().getOperands().size(), combined.getFrames().size());
		for (SDFrame nextSubFrame : combined.getFrames()){
			assertTrue(nextSubFrame instanceof SDInteractionOperand);
			SDInteractionOperand nextOperand = (SDInteractionOperand)nextSubFrame;
			assertTrue(combined.getUmlCombinedFragment().getOperands().contains(nextOperand.getUmlInteractionOperand()));
			checkFrame(nextSubFrame, expectedLifeLines);
		}
	}
	
	protected void checkFrame(SDFrame sdFrame, SDLifeLine...expectedLifeLines){
		assertNotNull(sdFrame);
		assertNotNull(sdFrame.getFrameContainer());
		assertTrue(sdFrame.getFrameContainer().getFrames().contains(sdFrame));
		
		assertNotNull(sdFrame.getUmlFragment());
		switch (sdFrame.eClass().getClassifierID()){
			case SDPackage.SD_COMBINED_FRAGMENT : 
				assertSame(sdFrame.getUmlFragment(), ((SDCombinedFragment)sdFrame).getUmlCombinedFragment());
				break;
			case SDPackage.SD_INTERACTION_OPERAND : 
				assertSame(sdFrame.getUmlFragment(), ((SDInteractionOperand)sdFrame).getUmlInteractionOperand());
				break;
			case SDPackage.SD_INTERACTION_USE : 
				assertSame(sdFrame.getUmlFragment(), ((SDInteractionUse)sdFrame).getUmlInteractionUse());
				break;
			default: 
				fail("Unknown SDFrame kind: " + sdFrame);
		}
		
		assertFalse(sdFrame.getCoveredLifeLines().isEmpty());
		assertEquals(sdFrame.getCoveredLifeLines().size(), sdFrame.getUmlFragment().getCovereds().size());
		assertEquals(new HashSet<SDLifeLine>(sdFrame.getCoveredLifeLines()), new HashSet<SDLifeLine>(Arrays.asList(expectedLifeLines)));

		for (Lifeline nextUmlLifeline : sdFrame.getUmlFragment().getCovereds()){
			SDLifeLine matchedSDLifeLine = null;
			for (SDLifeLine nextSDLifeLine : sdFrame.getCoveredLifeLines()){
				if (nextSDLifeLine.getUmlLifeline() == nextUmlLifeline){
					matchedSDLifeLine = nextSDLifeLine;
					break;
				}
			}
			assertNotNull("For each uml-lifelines covered by uml-fragment there should be covered sd-lifeline", matchedSDLifeLine);
		}
		
		for (SDLifeLine nextSDLifeLine : sdFrame.getCoveredLifeLines()){
			SDMountingRegion region = sdFrame.findRegionForSDLifeLine(nextSDLifeLine);
			assertNotNull(region);
			assertSame(sdFrame, region.getFrame());
			assertSame(nextSDLifeLine, region.getCoveredLifeLine());
			assertSame(region, sdFrame.findRegionForUmlLifeLine(nextSDLifeLine.getUmlLifeline()));
			
			SDBracketContainer expectedRegionParent; 
			SDFrameContainer frameContainer = sdFrame.getFrameContainer();
			assertNotNull(frameContainer);
			if (frameContainer instanceof SDFrame){
				expectedRegionParent = ((SDFrame)frameContainer).findRegionForSDLifeLine(nextSDLifeLine);
			} else if (frameContainer instanceof SDModel){
				expectedRegionParent = nextSDLifeLine;
			} else {
				fail("Unknown FrameContainer: " + frameContainer);
				throw new InternalError("Never thrown");
			}
			assertNotNull(expectedRegionParent);
			assertSame(expectedRegionParent, region.getBracketContainer());
		}
		
		assertFalse(sdFrame.getRegions().isEmpty());
		assertEquals(sdFrame.getRegions().size(), sdFrame.getCoveredLifeLines().size());
		
		for (SDMountingRegion nextRegion : sdFrame.getRegions()){
			assertNotNull(nextRegion.getCoveredLifeLine());
			assertTrue(sdFrame.getCoveredLifeLines().contains(nextRegion.getCoveredLifeLine()));
		}
	}

}
