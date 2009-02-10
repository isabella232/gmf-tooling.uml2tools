package org.eclipse.uml2.diagram.sequence.model.builder;

import java.util.HashMap;

import org.eclipse.uml2.diagram.sequence.model.sequenced.SDAbstractMessage;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDBehaviorSpec;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDExecution;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDFactory;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDGateMessage;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDInvocation;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDMessage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;


public class SDBuilderTrace {
	private final HashMap<ExecutionSpecification, SDBehaviorSpec> myExecutionSpecs;
	private final HashMap<Message, SDAbstractMessage> myMessages;
	private final HashMap<Lifeline, SDLifeLine> myLifelines;
	
	public SDBuilderTrace(){
		myExecutionSpecs = new HashMap<ExecutionSpecification, SDBehaviorSpec>();
		myMessages = new HashMap<Message, SDAbstractMessage>();
		myLifelines = new HashMap<Lifeline, SDLifeLine>();
	}
	
	void clear(){
		myExecutionSpecs.clear();
		myMessages.clear();
		myLifelines.clear();
	}
	
	SDLifeLine bindNewLifeline(Lifeline umlLifeline){
		assert umlLifeline != null;
		SDLifeLine result = SDFactory.eINSTANCE.createSDLifeLine();
		result.setUmlLifeline(umlLifeline);
		
		SDLifeLine oldOne = myLifelines.put(umlLifeline, result);
		if (oldOne != null){
			throw new SDBuilderInternalProblem("Only one SDLifeline is expected for :" + umlLifeline + ", old: " + oldOne);
		}
		return result;
	}
	
	SDExecution bindNewExecution(ExecutionSpecification umlSpec){
		SDExecution result = SDFactory.eINSTANCE.createSDExecution();
		bind(umlSpec, result);
		return result;
	}
	
	SDInvocation bindNewInvocation(ExecutionSpecification umlSpec){
		SDInvocation result = SDFactory.eINSTANCE.createSDInvocation();
		bind(umlSpec, result);
		return result;
	}
	
	SDMessage bindNewMessage(Message umlMessage){
		SDMessage result = SDFactory.eINSTANCE.createSDMessage();
		bind(umlMessage, result);
		return result;
	}
	
	SDGateMessage bindNewGateMessage(Message umlMessage){
		SDGateMessage result = SDFactory.eINSTANCE.createSDGateMessage();
		bind(umlMessage, result);
		return result;
		
	}
	
	private void bind(Message umlMessage, SDAbstractMessage sdMessage){
		checkBindToNull(umlMessage, sdMessage);
		SDAbstractMessage oldOne = myMessages.put(umlMessage, sdMessage);
		if (oldOne != null){
			throw new SDBuilderInternalProblem("Only one SDMessage is expected for :" + umlMessage + ", old: " + oldOne + ", new: " + sdMessage);
		}
		sdMessage.setUmlMessage(umlMessage);
	}
	
	private void bind(ExecutionSpecification umlSpec, SDBehaviorSpec sdSpec){
		if (umlSpec == null){
			if (sdSpec instanceof SDExecution){
				throw new SDBuilderInternalProblem("SDExecution should always be backed by uml ExecutionSpec: " + sdSpec);
			}
			//for invocations its probably ok
			return;
		}
		checkBindToNull(umlSpec, sdSpec);

		SDBehaviorSpec oldOne = myExecutionSpecs.put(umlSpec, sdSpec);
		if (oldOne != null){
			//rollback?
			throw new SDBuilderInternalProblem("Only one SDBehaviorSpec is expected for :" + umlSpec + ", old: " + oldOne + ", new: " + sdSpec);
		}
		sdSpec.setUmlExecutionSpec(umlSpec);
	}
	
	public SDBehaviorSpec findBehaviorSpec(ExecutionSpecification umlSpec){
		return myExecutionSpecs.get(umlSpec);
	}
	
	public SDAbstractMessage findMessage(Message umlMessage){
		return myMessages.get(umlMessage);
	}
	
	public SDLifeLine findLifeLine(Lifeline umlLifeline){
		return myLifelines.get(umlLifeline);
	}
	
	private static void checkBindToNull(Element umlElement, Object sdElement){
		if (sdElement == null){
			throw new SDBuilderInternalProblem("Can't bind to null: " + umlElement);
		}
	}
	
}
