package org.eclipse.uml2.diagram.sequence.tests;

import org.eclipse.uml2.diagram.sequence.model.builder.SDBuilder;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracket;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDCombinedFragment;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDExecution;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrame;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDInteractionOperand;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDInteractionUse;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDInvocation;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDMessage;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDMountingRegion;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDPackage;
import org.eclipse.uml2.uml.Lifeline;


public class SDFramesBuilderTest extends AbstractSDModelBuilderTest {
	public void testCombinedFragment(){
		SDBuilder builder = buildFrame("CombinedFrgament-alt-x2-message-x2.uml", "Interaction");
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
		checkFrame(combined);
		checkFrameCovereds(combined, a, b);
		
		assertEquals(1, a.getBrackets().size());
		assertEquals(1, b.getBrackets().size());
		assertTrue(a.getBrackets().get(0) instanceof SDMountingRegion);
		assertTrue(b.getBrackets().get(0) instanceof SDMountingRegion);
		SDMountingRegion mountingForCombinedOnA = (SDMountingRegion) a.getBrackets().get(0);
		SDMountingRegion mountingForCombinedOnB = (SDMountingRegion) b.getBrackets().get(0);
		assertTrue(combined.getRegions().contains(mountingForCombinedOnA));
		assertTrue(combined.getRegions().contains(mountingForCombinedOnB));
		assertSame(combined.findRegionForSDLifeLine(a), mountingForCombinedOnA);
		assertSame(combined.findRegionForSDLifeLine(b), mountingForCombinedOnA);
		
		assertFalse(combined.getFrames().isEmpty());
		assertEquals(2, combined.getFrames().size());
		for (SDFrame nextOperand : combined.getFrames()){
			assertTrue(nextOperand instanceof SDInteractionOperand);
			checkFrame(nextOperand);
			checkFrameCovereds(nextOperand, a, b);
			
			assertEquals(2, mountingForCombinedOnA.getBrackets().size());
			
			SDMountingRegion operandMounterOnA = mountingForCombinedOnA.findMountingRegionForSubFrame(nextOperand); 
			SDMountingRegion operandMounterOnB = mountingForCombinedOnB.findMountingRegionForSubFrame(nextOperand);
			assertNotNull(operandMounterOnA);
			assertNotNull(operandMounterOnB);
			
			assertEquals(1, operandMounterOnA.getBrackets().size());
			assertEquals(1, operandMounterOnB.getBrackets().size());
			
			checkExpectedMessage(operandMounterOnA.getBrackets().get(0), operandMounterOnB.getBrackets().get(0));
		}
	}
	
	protected void checkMessage(SDBracket invocation, SDBracket execution, SDMessage message){
		assertTrue(invocation instanceof SDInvocation);
		assertTrue(execution instanceof SDExecution);
	}
	
	protected void checkFrameCovereds(SDFrame sdFrame, SDLifeLine... lifeLines){
		for (SDLifeLine next : lifeLines){
			assertTrue(sdFrame.getCoveredLifeLines().contains(next));
		}
	}
	
	protected void checkFrame(SDFrame sdFrame){
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
		}
		
		assertFalse(sdFrame.getRegions().isEmpty());
		assertEquals(sdFrame.getRegions().size(), sdFrame.getCoveredLifeLines().size());
		
		for (SDMountingRegion nextRegion : sdFrame.getRegions()){
			assertNotNull(nextRegion.getCoveredLifeLine());
			assertTrue(sdFrame.getCoveredLifeLines().contains(nextRegion.getCoveredLifeLine()));
		}
	}


}
