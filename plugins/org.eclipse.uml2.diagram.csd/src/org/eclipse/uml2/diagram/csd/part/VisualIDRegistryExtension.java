package org.eclipse.uml2.diagram.csd.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.genapi.IVisualIDRegistryExt.MenuTypeHint;
import org.eclipse.uml2.diagram.csd.edit.parts.Class3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InterfaceEditPart;

/**
 * @generated
 */
public class VisualIDRegistryExtension {

	/**
	 * @generated
	 */
	private final List<MenuTypeHint> myClassHints;

	/**
	 * @generated
	 */
	{
		List<MenuTypeHint> ClassHints = new ArrayList<MenuTypeHint>();
		ClassHints.add(new MenuTypeHint(Messages.TurnIntoClassAction_text,// 
				String.valueOf(ClassEditPart.VISUAL_ID)));
		ClassHints.add(new MenuTypeHint(Messages.TurnIntoClass3Action_text,//
				String.valueOf(Class3EditPart.VISUAL_ID)));

		myClassHints = Collections.unmodifiableList(ClassHints);
	}

	/**
	 * @generated
	 */
	private final List<MenuTypeHint> myClass3Hints;

	/**
	 * @generated
	 */
	{
		List<MenuTypeHint> Class3Hints = new ArrayList<MenuTypeHint>();
		Class3Hints.add(new MenuTypeHint(Messages.TurnIntoClass3Action_text,// 
				String.valueOf(Class3EditPart.VISUAL_ID)));
		Class3Hints.add(new MenuTypeHint(Messages.TurnIntoClassAction_text,//
				String.valueOf(ClassEditPart.VISUAL_ID)));

		myClass3Hints = Collections.unmodifiableList(Class3Hints);
	}

	/**
	 * @generated
	 */
	private final List<MenuTypeHint> myInterfaceHints;

	/**
	 * @generated
	 */
	{
		List<MenuTypeHint> InterfaceHints = new ArrayList<MenuTypeHint>();
		InterfaceHints.add(new MenuTypeHint(Messages.TurnIntoInterfaceAction_text,// 
				String.valueOf(InterfaceEditPart.VISUAL_ID)));
		InterfaceHints.add(new MenuTypeHint(Messages.TurnIntoInterface2Action_text,//
				String.valueOf(Interface2EditPart.VISUAL_ID)));

		myInterfaceHints = Collections.unmodifiableList(InterfaceHints);
	}

	/**
	 * @generated
	 */
	private final List<MenuTypeHint> myInterface2Hints;

	/**
	 * @generated
	 */
	{
		List<MenuTypeHint> Interface2Hints = new ArrayList<MenuTypeHint>();
		Interface2Hints.add(new MenuTypeHint(Messages.TurnIntoInterface2Action_text,// 
				String.valueOf(Interface2EditPart.VISUAL_ID)));
		Interface2Hints.add(new MenuTypeHint(Messages.TurnIntoInterfaceAction_text,//
				String.valueOf(InterfaceEditPart.VISUAL_ID)));

		myInterface2Hints = Collections.unmodifiableList(Interface2Hints);
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

		case ClassEditPart.VISUAL_ID:
			return myClassHints;
		case Class3EditPart.VISUAL_ID:
			return myClass3Hints;
		case InterfaceEditPart.VISUAL_ID:
			return myInterfaceHints;
		case Interface2EditPart.VISUAL_ID:
			return myInterface2Hints;

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

		hintedTypes.add(String.valueOf(ClassEditPart.VISUAL_ID));
		hintedTypes.add(String.valueOf(Class3EditPart.VISUAL_ID));
		hintedTypes.add(String.valueOf(InterfaceEditPart.VISUAL_ID));
		hintedTypes.add(String.valueOf(Interface2EditPart.VISUAL_ID));

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
