package org.eclipse.uml2.diagram.common.wholediagram;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;


public class DiagramCompareSession {
	private MatchRegistry<Node> myNodesRegistry = new MatchRegistry<Node>();
	private MatchRegistry<Edge> myEdgesRegistry = new MatchRegistry<Edge>();
	
	private final Matcher<Edge> myEdgeMatcher;
	private final Matcher<Node> myNodeMatcher;
	
	private ViewFilter myViewFilter = NOTHING_TO_IGNORE;
	
	public DiagramCompareSession(Matcher<Node> nodeMatcher, Matcher<Edge> edgeMatcher){
		myNodeMatcher = nodeMatcher;
		myEdgeMatcher = edgeMatcher;
	}
	
	public void setViewFilter(ViewFilter filter){
		myViewFilter = filter;
		if (myViewFilter == null){
			myViewFilter = NOTHING_TO_IGNORE;
		}
	}
	
	public DiagramCompareSession(){
		this(NODE_MATCHER, EDGE_MATCHER);
	}
	
	public MatchRegistry<Edge> getEdgesRegistry() {
		return myEdgesRegistry;
	}
	
	public MatchRegistry<Node> getNodesRegistry() {
		return myNodesRegistry;
	}
	
	public void clear(){
		myNodesRegistry.clear();
		myEdgesRegistry.clear();
	}

	public void compare(Diagram oldDiagram, Diagram newDiagram){
		matchChildNodes(oldDiagram, newDiagram, myNodeMatcher);
		
		List<Edge> oldEdges = filter(oldDiagram.getEdges(), Edge.class);
		List<Edge> newEdges = filter(newDiagram.getEdges(), Edge.class);
		
		myEdgesRegistry.doMatch(oldEdges, newEdges, myEdgeMatcher);
	}
	
	private void matchChildNodes(View oldRoot, View newRoot, Matcher<Node> nodesMatcher){
		List<Node> oldChildren = filter(oldRoot.getChildren(), Node.class);
		List<Node> newChildren = filter(newRoot.getChildren(), Node.class);
		myNodesRegistry.doMatch(oldChildren, newChildren, nodesMatcher);
		
		for (Node nextOld : oldChildren){
			Node nextNew = myNodesRegistry.getMatch(nextOld);
			if (nextNew != null){
				matchChildNodes(nextOld, nextNew, nodesMatcher);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	private <T extends View> List<T> filter(List list, Class<T> clazz){
		List<T> result = new LinkedList<T>();
		for (Object next : list){
			if (clazz.isInstance(next) && !myViewFilter.ignore((View)next)){
				result.add(clazz.cast(next));
			}
		}
		return result;
	}
	
	public static class MatchRegistry<T> {
		private final HashMap<T, T> myMatches = new HashMap<T, T>();
		private final LinkedHashSet<T> myMissedOlds = new LinkedHashSet<T>();
		private final LinkedHashSet<T> myNotMatchedNews = new LinkedHashSet<T>();
		
		public void clear(){
			myMatches.clear();
			myMissedOlds.clear();
			myNotMatchedNews.clear();
		}
		
		public void addAllMissedOld(List<T> oldTs) {
			myMissedOlds.addAll(oldTs);
		}

		public void addAllNotMatchedNew(List<T> newTs) {
			myNotMatchedNews.addAll(newTs);
		}

		public void addMatch(T oldT, T newT) {
			myMatches.put(oldT, newT);
		}

		public void addMissedOld(T oldT) {
			myMissedOlds.add(oldT);
		}

		public void addNotMatchedNew(T newT) {
			myNotMatchedNews.add(newT);
		}
		
		public Set<T> getMissedOlds() {
			return Collections.unmodifiableSet(myMissedOlds);
		}
		
		public Set<T> getNotMatchedNews() {
			return Collections.unmodifiableSet(myNotMatchedNews);
		}
		
		public T getMatch(T oldT){
			return myMatches.get(oldT);
		}
		
		public void doMatch(List<T> oldTs, List<T> newTs, Matcher<T> matcher){
			LinkedList<T> oldCopy = new LinkedList<T>(oldTs);
			LinkedList<T> newCopy = new LinkedList<T>(newTs);
			
			for (Iterator<T> oldIt = oldCopy.iterator(); oldIt.hasNext();){
				T nextOld = oldIt.next();
				T nextNew = matcher.removeMatched(newCopy, nextOld);
				if (nextNew != null){
					addMatch(nextOld, nextNew);
					oldIt.remove();
				}
			}
			
			addAllMissedOld(oldCopy);
			addAllNotMatchedNew(newCopy);
		}
	}
	
	public static abstract class Matcher<T> {
		public abstract boolean match(T oldT, T newT);
		
		public T removeMatched(List<T> list, T pattern){
			for (Iterator<T> it = list.iterator(); it.hasNext();){
				T next = it.next();
				if (this.match(pattern, next)){
					it.remove();
					return next;
				}
			}
			return null;
		}
	}
	
	public static interface ViewFilter {
		public boolean ignore(View view);
	}
	
	private static boolean sameElement(EObject a, EObject b){
		if (a == null && b == null){
			return true;
		}
		if (a == null || b == null){
			return false;
		}
		if (a.equals(b)){
			return true;
		}
		
		Resource aRes = a.eResource();
		Resource bRes = b.eResource();
		if (false == aRes instanceof XMLResource){
			return false;
		}
		if (false == bRes instanceof XMLResource){
			return false;
		}
		
		String aID = ((XMLResource)aRes).getID(a);
		String bID = ((XMLResource)bRes).getID(b);
		return aID != null && aID.equals(bID);
	}

	private static boolean safeEquals(String a, String b){
		return a == null ? b == null : a.equals(b);
	}

	public static final Matcher<View> VIEW_MATCHER = new Matcher<View>(){
		public boolean match(View oldNode, View newNode) {
			return sameElement(oldNode.getElement(), newNode.getElement()) && 
				safeEquals(oldNode.getType(), newNode.getType()); 
		}
	};
	
	public static final Matcher<Edge> EDGE_MATCHER = new Matcher<Edge>(){
		public boolean match(Edge oldEdge, Edge newEdge) {
			return VIEW_MATCHER.match(oldEdge, newEdge) && //
				VIEW_MATCHER.match(oldEdge.getSource(), newEdge.getSource()) && //
				VIEW_MATCHER.match(oldEdge.getTarget(), newEdge.getTarget());
		}
	};
	
	public static final Matcher<Node> NODE_MATCHER = new Matcher<Node>(){
		public boolean match(Node oldNode, Node newNode) {
			return VIEW_MATCHER.match(oldNode, newNode);
		}
	};
	
	public static final ViewFilter NOTHING_TO_IGNORE = new ViewFilter(){
		public boolean ignore(View view) {
			return false;
		}
	};
}
