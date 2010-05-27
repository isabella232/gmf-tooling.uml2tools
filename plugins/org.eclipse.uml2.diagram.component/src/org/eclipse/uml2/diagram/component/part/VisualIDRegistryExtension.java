package org.eclipse.uml2.diagram.component.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.genapi.IVisualIDRegistryExt.MenuTypeHint;
import org.eclipse.uml2.diagram.component.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassDiagramNotationClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Interface3EditPart;

/**
 * @generated
 */
public class VisualIDRegistryExtension {

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
		Interface2Hints.add(new MenuTypeHint(Messages.TurnIntoInterface3Action_text,//
				String.valueOf(Interface3EditPart.VISUAL_ID)));

		myInterface2Hints = Collections.unmodifiableList(Interface2Hints);
	}

	/**
	 * @generated
	 */
	private final List<MenuTypeHint> myClass2Hints;

	/**
	 * @generated
	 */
	{
		List<MenuTypeHint> Class2Hints = new ArrayList<MenuTypeHint>();
		Class2Hints.add(new MenuTypeHint(Messages.TurnIntoClass2Action_text,// 
				String.valueOf(Class2EditPart.VISUAL_ID)));
		Class2Hints.add(new MenuTypeHint(Messages.TurnIntoClassDiagramNotationClassAction_text,//
				String.valueOf(ClassDiagramNotationClassEditPart.VISUAL_ID)));

		myClass2Hints = Collections.unmodifiableList(Class2Hints);
	}

	/**
	 * @generated
	 */
	private final List<MenuTypeHint> myClassDiagramNotationClassHints;

	/**
	 * @generated
	 */
	{
		List<MenuTypeHint> ClassDiagramNotationClassHints = new ArrayList<MenuTypeHint>();
		ClassDiagramNotationClassHints.add(new MenuTypeHint(Messages.TurnIntoClassDiagramNotationClassAction_text,// 
				String.valueOf(ClassDiagramNotationClassEditPart.VISUAL_ID)));
		ClassDiagramNotationClassHints.add(new MenuTypeHint(Messages.TurnIntoClass2Action_text,//
				String.valueOf(Class2EditPart.VISUAL_ID)));

		myClassDiagramNotationClassHints = Collections.unmodifiableList(ClassDiagramNotationClassHints);
	}

	/**
	 * @generated
	 */
	private final List<MenuTypeHint> myInterface3Hints;

	/**
	 * @generated
	 */
	{
		List<MenuTypeHint> Interface3Hints = new ArrayList<MenuTypeHint>();
		Interface3Hints.add(new MenuTypeHint(Messages.TurnIntoInterface3Action_text,// 
				String.valueOf(Interface3EditPart.VISUAL_ID)));
		Interface3Hints.add(new MenuTypeHint(Messages.TurnIntoInterface2Action_text,//
				String.valueOf(Interface2EditPart.VISUAL_ID)));

		myInterface3Hints = Collections.unmodifiableList(Interface3Hints);
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

		case Interface2EditPart.VISUAL_ID:
			return myInterface2Hints;
		case Class2EditPart.VISUAL_ID:
			return myClass2Hints;
		case ClassDiagramNotationClassEditPart.VISUAL_ID:
			return myClassDiagramNotationClassHints;
		case Interface3EditPart.VISUAL_ID:
			return myInterface3Hints;

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

		hintedTypes.add(String.valueOf(Interface2EditPart.VISUAL_ID));
		hintedTypes.add(String.valueOf(Class2EditPart.VISUAL_ID));
		hintedTypes.add(String.valueOf(ClassDiagramNotationClassEditPart.VISUAL_ID));
		hintedTypes.add(String.valueOf(Interface3EditPart.VISUAL_ID));

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
