package org.eclipse.uml2.diagram.usecase.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.genapi.IVisualIDRegistryExt.MenuTypeHint;
import org.eclipse.uml2.diagram.usecase.edit.parts.ActorAsRectangleEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.ActorEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseAsClassEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.UseCaseEditPart;

/**
 * @generated
 */
public class VisualIDRegistryExtension {

	/**
	 * @generated
	 */
	private final List<MenuTypeHint> myActorHints;

	/**
	 * @generated
	 */
	{
		List<MenuTypeHint> ActorHints = new ArrayList<MenuTypeHint>();
		ActorHints.add(new MenuTypeHint(Messages.TurnIntoActorAction_text,// 
				String.valueOf(ActorEditPart.VISUAL_ID)));
		ActorHints.add(new MenuTypeHint(Messages.TurnIntoActorAsRectangleAction_text,//
				String.valueOf(ActorAsRectangleEditPart.VISUAL_ID)));

		myActorHints = Collections.unmodifiableList(ActorHints);
	}

	/**
	 * @generated
	 */
	private final List<MenuTypeHint> myActorAsRectangleHints;

	/**
	 * @generated
	 */
	{
		List<MenuTypeHint> ActorAsRectangleHints = new ArrayList<MenuTypeHint>();
		ActorAsRectangleHints.add(new MenuTypeHint(Messages.TurnIntoActorAsRectangleAction_text,// 
				String.valueOf(ActorAsRectangleEditPart.VISUAL_ID)));
		ActorAsRectangleHints.add(new MenuTypeHint(Messages.TurnIntoActorAction_text,//
				String.valueOf(ActorEditPart.VISUAL_ID)));

		myActorAsRectangleHints = Collections.unmodifiableList(ActorAsRectangleHints);
	}

	/**
	 * @generated
	 */
	private final List<MenuTypeHint> myUseCaseHints;

	/**
	 * @generated
	 */
	{
		List<MenuTypeHint> UseCaseHints = new ArrayList<MenuTypeHint>();
		UseCaseHints.add(new MenuTypeHint(Messages.TurnIntoUseCaseAction_text,// 
				String.valueOf(UseCaseEditPart.VISUAL_ID)));
		UseCaseHints.add(new MenuTypeHint(Messages.TurnIntoUseCaseAsClassAction_text,//
				String.valueOf(UseCaseAsClassEditPart.VISUAL_ID)));

		myUseCaseHints = Collections.unmodifiableList(UseCaseHints);
	}

	/**
	 * @generated
	 */
	private final List<MenuTypeHint> myUseCaseAsClassHints;

	/**
	 * @generated
	 */
	{
		List<MenuTypeHint> UseCaseAsClassHints = new ArrayList<MenuTypeHint>();
		UseCaseAsClassHints.add(new MenuTypeHint(Messages.TurnIntoUseCaseAsClassAction_text,// 
				String.valueOf(UseCaseAsClassEditPart.VISUAL_ID)));
		UseCaseAsClassHints.add(new MenuTypeHint(Messages.TurnIntoUseCaseAction_text,//
				String.valueOf(UseCaseEditPart.VISUAL_ID)));

		myUseCaseAsClassHints = Collections.unmodifiableList(UseCaseAsClassHints);
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

		case ActorEditPart.VISUAL_ID:
			return myActorHints;
		case ActorAsRectangleEditPart.VISUAL_ID:
			return myActorAsRectangleHints;
		case UseCaseEditPart.VISUAL_ID:
			return myUseCaseHints;
		case UseCaseAsClassEditPart.VISUAL_ID:
			return myUseCaseAsClassHints;

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

		hintedTypes.add(String.valueOf(ActorEditPart.VISUAL_ID));
		hintedTypes.add(String.valueOf(ActorAsRectangleEditPart.VISUAL_ID));
		hintedTypes.add(String.valueOf(UseCaseEditPart.VISUAL_ID));
		hintedTypes.add(String.valueOf(UseCaseAsClassEditPart.VISUAL_ID));

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
