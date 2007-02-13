package org.eclipse.uml2.diagram.clazz.parser;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.uml2.diagram.clazz.providers.UMLStructuralFeaturesParser;
import org.eclipse.uml2.diagram.parser.assist.FixedSetCompletionProcessor;
import org.eclipse.uml2.uml.UMLPackage;

public class GeneralizationSetParser extends UMLStructuralFeaturesParser {

	private static final String COMPLETE = "complete";

	private static final String INCOMPLETE = "incomplete";

	private static final String DISJOINT = "disjoint";

	private static final String OVERLAPPING = "overlapping";

	static List features = new ArrayList(2);
	static {
		features.add(UMLPackage.eINSTANCE.getGeneralizationSet_IsCovering());
		features.add(UMLPackage.eINSTANCE.getGeneralizationSet_IsDisjoint());
	}

	public GeneralizationSetParser() {
		super(features);
		setViewPattern("{0}, {1}");
		setEditPattern("{0}, {1}");
	}

	@Override
	protected Object getValidValue(EStructuralFeature feature, Object value) {
		if (UMLPackage.eINSTANCE.getGeneralizationSet_IsCovering().equals(feature)) {
			return Boolean.TRUE.equals(value) ? COMPLETE : INCOMPLETE;
		}
		if (UMLPackage.eINSTANCE.getGeneralizationSet_IsDisjoint().equals(feature)) {
			return Boolean.TRUE.equals(value) ? DISJOINT : OVERLAPPING;
		}
		return super.getValidValue(feature, value);
	}

	@Override
	protected Object getValidNewValue(EStructuralFeature feature, Object value) {
		if (UMLPackage.eINSTANCE.getGeneralizationSet_IsCovering().equals(feature)) {
			return COMPLETE.equals(value);
		}
		if (UMLPackage.eINSTANCE.getGeneralizationSet_IsDisjoint().equals(feature)) {
			return DISJOINT.equals(value);
		}
		return super.getValidNewValue(feature, value);
	}
	
	@Override
	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
		return new FixedSetCompletionProcessor(COMPLETE, INCOMPLETE, DISJOINT, OVERLAPPING);
	}
}
