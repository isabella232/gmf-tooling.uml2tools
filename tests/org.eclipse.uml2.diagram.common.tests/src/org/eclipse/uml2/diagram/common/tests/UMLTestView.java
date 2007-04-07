package org.eclipse.uml2.diagram.common.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;


public class UMLTestView {
	
	private View myView;
	
	UMLTestView(View view) {
		myView = view;
	}
	protected View getView() {
		return myView;
	}
	@Override
	public boolean equals(Object arg0) {
		if (myView == null || arg0 == null || false == arg0 instanceof UMLTestView){
			return false;
		}
		View view = ((UMLTestView)arg0).getView();
		compareViews(myView, view);
		List children1 = getSemanticViewsList(myView);
		List children2 = getSemanticViewsList(view);
		boolean compareChildren = compareChildren(children1, children2);
		if (!compareChildren) {
			return false;
		}
		boolean compareSourceEdges = compareChildren(myView.getSourceEdges(), view.getSourceEdges());
		if (!compareSourceEdges) {
			return false;
		}
		boolean compareTargetEdges = compareChildren(myView.getTargetEdges(), view.getTargetEdges());
		return compareTargetEdges;
	}
	private boolean compareViews(View view1, View view2) {
		if (!view1.getType().equals(view2.getType())) {
			return false;
		}
		if (!view1.getElement().eClass().equals(view2.getElement().eClass())) {
			return false;
		}
		if (view1 instanceof Edge) {
			if (false == view2 instanceof Edge) {
				return false;
			}
			return compareEdges((Edge)view1, (Edge)view2);
		}
		return true;
	}
	private boolean compareEdges(Edge edge1, Edge edge2) {
		if (!compareViews(edge1.getSource(), edge2.getSource())) {
			return false;
		}
		if (!compareViews(edge1.getTarget(), edge2.getTarget())) {
			return false;
		}
		return true;
	}
	private boolean compareChildren(List children1, List children2) {
		if (children1.size() != children2.size()) {
			return false;
		}
		for (int i = 0; i < children1.size(); i++) {
			View view1 = (View)children1.get(i);
			View view2 = (View)children2.get(i);
			if (!new UMLTestView(view1).equals(new UMLTestView(view2))) {
				return false;
			}
		}
		return true;
	}
	private List getSemanticViewsList(View view) {
		List result = new ArrayList();
		Iterator iter = view.getChildren().iterator();
		while(iter.hasNext()) {
			View next = (View)iter.next();
			int VID;
			try {
				VID = Integer.parseInt(next.getType());
			} catch (NumberFormatException e) {
				continue;
			}
			
			// we do not pay attention to labels
			if (3000 < VID && VID < 4000) {
				continue;
			}
			result.add(next);
		}
		return result;
	}
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(); 
		result.append("[");
		if (myView instanceof Diagram) {
			result.append(((Diagram)myView).getName());
			result.append(": ");
		}
		result.append(myView.getType());
		EList children = myView.getChildren();
		for (int i = 0; i < children.size(); i++) {
			View view = (View)children.get(i);
			result.append(new UMLTestView(view).toString());
			if (i < children.size() - 1) {
				result.append(", ");
			}
		}
		children = myView.getSourceEdges();
		if (children.size() > 0) {
			result.append("SourceEdges: ");
		}
		for (int i = 0; i < children.size(); i++) {
			View view = (View)children.get(i);
			result.append(view.getType());
			if (i < children.size() - 1) {
				result.append(", ");
			}
		}
		children = myView.getTargetEdges();
		if (children.size() > 0) {
			result.append(",TargetEdges: ");
		}
		for (int i = 0; i < children.size(); i++) {
			View view = (View)children.get(i);
			result.append(view.getType());
			if (i < children.size() - 1) {
				result.append(", ");
			}
		}
		result.append("]");
		return result.toString();
	}

}
