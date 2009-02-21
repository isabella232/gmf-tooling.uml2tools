package org.eclipse.uml2.diagram.clazz.view.factories;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.view.factories.BasicNodeViewFactory;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class InstanceSpecificationName2ViewFactory extends BasicNodeViewFactory {

	/**
	 * @generated
	 */
	protected List createStylesGen(View view) {
		List styles = new ArrayList();
		return styles;
	}

	/**
	 * @generated NOT
	 */
	protected List createStyles(View view) {
		List styles = createStylesGen(view);
		styles.add(NotationFactory.eINSTANCE.createFontStyle());
		return styles;
	}
	
	/**
	 * @NOT-generated
	 */
	protected void decorateView(View containerView, View view, IAdaptable semanticAdapter, String semanticHint, int index, boolean persisted) {
		super.decorateView(containerView, view, semanticAdapter, semanticHint, index, persisted);
		FontStyle fontStyle = (FontStyle) view.getStyle(NotationPackage.eINSTANCE.getFontStyle());
		if (fontStyle != null) {
			fontStyle.setUnderline(true);
		}
	}
}
