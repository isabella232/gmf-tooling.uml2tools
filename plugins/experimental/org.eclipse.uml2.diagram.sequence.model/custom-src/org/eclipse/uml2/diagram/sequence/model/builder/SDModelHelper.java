package org.eclipse.uml2.diagram.sequence.model.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDAbstractMessage;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBackedByFragment;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBracket;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDEntity;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDExecution;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDGate;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessage;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessageEnd;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDInvocation;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDMessage;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDSimpleNode;
import org.eclipse.uml2.diagram.sequence.model.sequenced.util.SDSwitch;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.Message;

public class SDModelHelper {

	public static final SDGate findGate(SDModel model, Gate umlGate) {
		for (SDGate next : model.getGates()) {
			if (umlGate == next.getUmlGate()) {
				return next;
			}
		}
		return null;
	}

	public static final SDSwitch<Element> UML_ELEMENT_EXTRACTOR = new SDSwitch<Element>() {

		@Override
		public Element caseSDAbstractMessage(SDAbstractMessage object) {
			return object.getUmlMessage();
		}

		@Override
		public Element caseSDModel(SDModel object) {
			return object.getUmlInteraction();
		}

		@Override
		public Element caseSDGate(SDGate object) {
			return object.getUmlGate();
		}

		@Override
		public Element caseSDGateMessageEnd(SDGateMessageEnd object) {
			return object.getUmlMessageEnd();
		}

		@Override
		public Element caseSDLifeLine(SDLifeLine object) {
			return object.getUmlLifeline();
		}

		@Override
		public Element caseSDBackedByFragment(SDBackedByFragment object) {
			return object.getUmlFragment();
		}
	};

	public static class ChainedElementsCollector extends SDSwitch<Object> {

		private final LinkedHashSet<Element> myOutput;

		private final HashSet<SDEntity> myProcessedEntitiesGuard;

		public ChainedElementsCollector() {
			myOutput = new LinkedHashSet<Element>(10) {

				private static final long serialVersionUID = 1512122997492710727L;

				@Override
				public boolean add(Element e) {
					if (e == null) {
						return false;
					}
					return super.add(e);
				}
			};
			myProcessedEntitiesGuard = new HashSet<SDEntity>();
		}

		public void reset() {
			myOutput.clear();
			myProcessedEntitiesGuard.clear();
		}

		public List<Element> getCollectedElements() {
			ArrayList<Element> result = new ArrayList<Element>(myOutput);
			Collections.sort(result, MESSAGES_FIRST);
			return result;
		}

		@Override
		public Object doSwitch(EObject theEObject) {
			if (theEObject == null) {
				return null;
			}
			if (myProcessedEntitiesGuard.contains(theEObject)) {
				return null;
			}
			if (false == theEObject instanceof SDEntity) {
				return null;
			}
			myProcessedEntitiesGuard.add((SDEntity) theEObject);
			Object result = super.doSwitch(theEObject);
			return result;
		}

		@Override
		public Object caseSDInvocation(SDInvocation invocation) {
			myOutput.add(invocation.getUmlExecutionSpec());
			myOutput.add(invocation.getUmlStart());
			myOutput.add(invocation.getUmlFinish());

			doSwitch(invocation.getOutgoingMessage());

			return null;
		}

		@Override
		public Object caseSDExecution(SDExecution object) {
			myOutput.add(object.getUmlExecutionSpec());
			myOutput.add(object.getUmlStart());
			myOutput.add(object.getUmlFinish());

			for (SDBracket next : object.getBrackets()) {
				doSwitch(next);
			}

			return null;
		}

		@Override
		public Object caseSDGateMessage(SDGateMessage object) {
			myOutput.add(object.getUmlMessage());

			doSwitch(object.getNormalEnd());

			return null;
		}

		@Override
		public Object caseSDMessage(SDMessage sdMessage) {
			myOutput.add(sdMessage.getUmlMessage());

			doSwitch(sdMessage.getSource());
			doSwitch(sdMessage.getTarget());

			return null;
		}

		@Override
		public Object caseSDSimpleNode(SDSimpleNode object) {
			myOutput.add(object.getUmlSimpleFragment());
			return null;
		}

		private static final Comparator<Element> MESSAGES_FIRST = new Comparator<Element>() {

			public int compare(Element o1, Element o2) {
				boolean isMessage1 = o1 instanceof Message;
				boolean isMessage2 = o2 instanceof Message;
				if (isMessage1 == isMessage2) {
					return 0;
				}
				return isMessage1 ? -1 : 1;
			}
		};

	}

}
