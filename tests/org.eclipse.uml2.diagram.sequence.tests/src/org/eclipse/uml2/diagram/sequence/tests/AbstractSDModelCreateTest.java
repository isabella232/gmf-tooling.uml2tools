package org.eclipse.uml2.diagram.sequence.tests;

import java.util.LinkedList;

import org.eclipse.uml2.diagram.sequence.model.builder.SDBuilder;
import org.eclipse.uml2.diagram.sequence.model.builder.SDModelHelper;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracket;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracketContainer;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrame;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrameContainer;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.UMLFactory;

public class AbstractSDModelCreateTest extends AbstractSDModelBuilderTest {

	public void testPreconditionsCreatetLifelineX2() {
		SDModel sdModel = createSimpleLifeLineX2();
		assertNotNull(sdModel);

		SDLifeLine a = findLifeLineByName(sdModel, "a");
		SDLifeLine b = findLifeLineByName(sdModel, "b");
		assertNotNull(a);
		assertNotNull(b);
	}
	
	protected final void checkModelReparsableAndContainsCopyFor(SDBracket justCreated){
		assertNotNull(justCreated.getCoveredLifeLine());
		Element justCreatedUML = SDModelHelper.UML_ELEMENT_EXTRACTOR.doSwitch(justCreated);
		assertNotNull(justCreatedUML);
		
		SDModel actualSDModel = rootSDModel(justCreated);
		assertNotNull(actualSDModel);
		SDModel reparsed = new SDBuilder(actualSDModel.getUmlInteraction()).getSDModel();
		assertNotNull(reparsed);
		
		SDLifeLine reparsedLifeLine = reparsed.getUMLTracing().findLifeLine(justCreated.getCoveredLifeLine().getUmlLifeline());
		LinkedList<SDBracket> bracketsSearch = new LinkedList<SDBracket>(reparsedLifeLine.getBrackets());
		SDBracket foundCopy = null;
		while (foundCopy == null && !bracketsSearch.isEmpty()){
			SDBracket next = bracketsSearch.removeFirst();
			Element nextUML = SDModelHelper.UML_ELEMENT_EXTRACTOR.doSwitch(next);
			if (justCreatedUML == nextUML){
				foundCopy = next;
			}
		}
		assertNotNull(foundCopy);
	}

	protected final void checkModelReparsableAndContainsCopyFor(SDFrame justCreated){
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
	
	protected static final SDModel rootSDModel(SDBracket bracket){
		return bracket.getCoveredLifeLine().getModel();
	}
	
	protected static final SDModel rootSDModel(SDFrame frame){
		if (frame == null){
			return null;
		}
		SDFrameContainer container = frame.getFrameContainer();
		if (container instanceof SDModel){
			return (SDModel)container;
		}
		return rootSDModel((SDFrame)container); 
	}
	

	protected final void checkSiblingsInOrder(SDBracket... siblings) {
		assertTrue(siblings.length >= 2);
		for (int i = 0; i < siblings.length - 1; i++) {
			checkIsSiblingBefore(siblings[i], siblings[i + 1]);
		}
	}

	protected final void checkIsSiblingBefore(SDBracket expectedBefore, SDBracket expectedAfter) {
		assertFalse(expectedBefore == expectedAfter);
		assertNotNull(expectedBefore.getBracketContainer());
		assertSame(expectedBefore.getBracketContainer(), expectedAfter.getBracketContainer());

		SDBracketContainer commonContainer = expectedAfter.getBracketContainer();
		assertTrue(commonContainer.getBrackets().indexOf(expectedAfter) > -1);
		assertTrue(commonContainer.getBrackets().indexOf(expectedBefore) > -1);
		assertTrue(commonContainer.getBrackets().indexOf(expectedBefore) < commonContainer.getBrackets().indexOf(expectedAfter));
	}

	protected final SDModel createSimpleLifeLineX2() {
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
