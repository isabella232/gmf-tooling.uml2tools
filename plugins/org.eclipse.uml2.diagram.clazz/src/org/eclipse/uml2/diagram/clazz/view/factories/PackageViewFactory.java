package org.eclipse.uml2.diagram.clazz.view.factories;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gmf.runtime.diagram.ui.view.factories.DiagramViewFactory;
import org.eclipse.gmf.runtime.notation.CanonicalStyle;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TDiagramCanonicalStyle;
import org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TNotationFactory;

/**
 * @generated
 */
public class PackageViewFactory extends DiagramViewFactory {

	/**
	 * @generated
	 */
	protected List createStylesGen(View view) {
		List styles = new ArrayList();
		styles.add(NotationFactory.eINSTANCE.createDiagramStyle());
		U2TDiagramCanonicalStyle canonicalStyle = U2TNotationFactory.eINSTANCE.createU2TDiagramCanonicalStyle();
		canonicalStyle.setCanonical(true);
		canonicalStyle.setSyncNodes(true);
		canonicalStyle.setSyncLinks(true);
		styles.add(canonicalStyle);
		return styles;
	}

	/**
	 * @generated NOT
	 */
	protected List createStyles(View view) {
		List result = createStylesGen(view);
		result.add(NotationFactory.eINSTANCE.createFilteringStyle()); //[171240]
		result.add(U2TNotationFactory.eINSTANCE.createU2TDiagramCanonicalStyle());
		return result;
	}

	/**
	 * @generated
	 */
	protected MeasurementUnit getMeasurementUnit() {
		return MeasurementUnit.PIXEL_LITERAL;
	}

}
