package org.eclipse.uml2.diagram.timing.draw2d;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.uml2.diagram.timing.draw2d.layout.InteractionLayout;


public class InteractionShape extends RectangleFigure {
	private Label myNameLabel;
	private Label myFixedLabel;
	private InteractionPentagon myPentagon;
	private IFigure myLabelPanel;
	private RectangleFigure myInteractionContents;
	private InteractionLayout myInteractionLayout;
	
	public InteractionShape(){
		setLayoutManager(new BorderLayout());
		
		RectangleFigure pentagonPanel = new RectangleFigure();
		pentagonPanel.setFill(false);
		pentagonPanel.setOutline(false);
		pentagonPanel.setLayoutManager(new FlowLayout(true));
		
		myPentagon = new InteractionPentagon();
		myLabelPanel = createLabelPanel();
		myPentagon.setContent(myLabelPanel);
		pentagonPanel.add(myPentagon);
		
		add(pentagonPanel, BorderLayout.TOP);
		
		myInteractionContents = new InvisibleRectangle();
		myInteractionContents.setOutline(false);
		myInteractionContents.setBorder(new MarginBorder(1, 1, 1, 1));
		myInteractionLayout = new InteractionLayout();
		myInteractionContents.setLayoutManager(myInteractionLayout);
		add(myInteractionContents, BorderLayout.CENTER);
	}
	
	public Label getNameLabel() {
		return myNameLabel;
	}
	
	public InteractionPentagon getPentagon() {
		return myPentagon;
	}
	
	public Label getFixedLabel() {
		return myFixedLabel;
	}
	
	public RectangleFigure getInteractionContents() {
		return myInteractionContents;
	}
	
	public void setViewer(EditPartViewer viewer){
		myInteractionLayout.setViewer(viewer);
	}
	
	private IFigure createLabelPanel(){
		RectangleFigure result = new RectangleFigure();
		result.setOutline(false);
		result.setFill(false);
		FlowLayout flowLayout = new FlowLayout(true);
		flowLayout.setMajorAlignment(FlowLayout.ALIGN_CENTER);
		flowLayout.setMajorSpacing(5);
		result.setLayoutManager(flowLayout);
		
		myFixedLabel = myPentagon.createPentagonLabel();
		myFixedLabel.setText("sd");
		result.add(myFixedLabel);
		
		myNameLabel = myPentagon.createPentagonLabel();
		myNameLabel.setText("Interaction");
		result.add(myNameLabel);
		
		return result;
	}
	
	private static class InvisibleRectangle extends RectangleFigure {
		public void paintFigure(Graphics g) {
			if (!isHidden()) {
				super.paintFigure(g);
			}
		}

		public void setHidden(boolean hidden) {
			myHidden = hidden;
			// DO NOT REPAINT - see ShadowPlate
		}

		public boolean isHidden() {
			return myHidden;
		}

		protected boolean myHidden = true;
	}	

}
