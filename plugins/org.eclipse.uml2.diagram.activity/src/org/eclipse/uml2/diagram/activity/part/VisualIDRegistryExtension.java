package org.eclipse.uml2.diagram.activity.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.parts.LocalPostconditionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LocalPreconditionEditPart;
import org.eclipse.uml2.diagram.common.genapi.IVisualIDRegistryExt.MenuTypeHint;

/**
 * @generated
 */
public class VisualIDRegistryExtension {

	/**
	 * @generated
	 */
	private final List<MenuTypeHint> myLocalPreconditionHints;

	/**
	 * @generated
	 */
	{
		List<MenuTypeHint> LocalPreconditionHints = new ArrayList<MenuTypeHint>();
		LocalPreconditionHints.add(new MenuTypeHint(Messages.TurnIntoLocalPreconditionAction_text,// 
				String.valueOf(LocalPreconditionEditPart.VISUAL_ID)));
		LocalPreconditionHints.add(new MenuTypeHint(Messages.TurnIntoLocalPostconditionAction_text,//
				String.valueOf(LocalPostconditionEditPart.VISUAL_ID)));

		myLocalPreconditionHints = Collections.unmodifiableList(LocalPreconditionHints);
	}

	/**
	 * @generated
	 */
	private final List<MenuTypeHint> myLocalPostconditionHints;

	/**
	 * @generated
	 */
	{
		List<MenuTypeHint> LocalPostconditionHints = new ArrayList<MenuTypeHint>();
		LocalPostconditionHints.add(new MenuTypeHint(Messages.TurnIntoLocalPostconditionAction_text,// 
				String.valueOf(LocalPostconditionEditPart.VISUAL_ID)));
		LocalPostconditionHints.add(new MenuTypeHint(Messages.TurnIntoLocalPreconditionAction_text,//
				String.valueOf(LocalPreconditionEditPart.VISUAL_ID)));

		myLocalPostconditionHints = Collections.unmodifiableList(LocalPostconditionHints);
	}

	/**
	 * @generated
	 */
	public List<MenuTypeHint> getMenuTypeHints(String type) {
		int visualId = 0;
		try {
			visualId = Integer.parseInt(type);
		} catch (NumberFormatException e) {
			return Collections.emptyList();
		}

		switch (visualId) {

		case LocalPreconditionEditPart.VISUAL_ID:
			return myLocalPreconditionHints;
		case LocalPostconditionEditPart.VISUAL_ID:
			return myLocalPostconditionHints;

		default:
			List<MenuTypeHint> hints = new LinkedList<MenuTypeHint>();
			hints.add(new MenuTypeHint("", type));
			return hints;
		}
	}

	/**
	 * @generated
	 */
	private final List<String> myHintedTypes;

	/**
	 * @generated
	 */
	{
		List<String> hintedTypes = new LinkedList<String>();

		hintedTypes.add(String.valueOf(LocalPreconditionEditPart.VISUAL_ID));
		hintedTypes.add(String.valueOf(LocalPostconditionEditPart.VISUAL_ID));

		myHintedTypes = Collections.unmodifiableList(hintedTypes);
	}

	/**
	 * @generated
	 */
	public List<String> getAllHintedTypes() {
		return myHintedTypes;
	}

	/**
	 * @generated
	 */
	public String getSemanticHint(View childView, View newParentView) {
		return null;
	}

}
