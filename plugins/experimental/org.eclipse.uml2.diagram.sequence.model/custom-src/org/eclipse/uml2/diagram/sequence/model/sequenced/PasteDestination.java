//package org.eclipse.uml2.diagram.sequence.model.sequenced;
//
//public class PasteDestination {
//	private SDEntity myContainer;
//	private SDEntity myAnchor;
//	private boolean myIsAfter;
//	
//	public PasteDestination(SDEntity container){
//		this(container, null, false);
//	}
//	
//	public PasteDestination(SDEntity container, SDEntity anchor, boolean isAfter){
//		if (container == null){
//			throw new IllegalArgumentException("Container is null");
//		}
//		myContainer = container;
//		myAnchor = anchor;
//		myIsAfter = isAfter;
//	}
//	
//	public SDEntity getContainer(){
//		return myContainer;
//	}
//	
//	public SDEntity getAnchor(){
//		return myAnchor;
//	}
//	
//	public boolean isAfterAnchor(){
//		return myIsAfter;
//	}
//	
//	public boolean isFirstElement(){
//		return !myIsAfter && myAnchor == null; 
//	}
//}
