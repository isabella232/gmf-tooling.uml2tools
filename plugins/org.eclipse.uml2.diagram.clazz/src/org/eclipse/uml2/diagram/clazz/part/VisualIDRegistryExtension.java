package org.eclipse.uml2.diagram.clazz.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClass2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassRhombEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecification2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecification4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Interface4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Interface5EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageAsFrameEditPart;
import org.eclipse.uml2.diagram.common.genapi.IVisualIDRegistryExt.MenuTypeHint;

/**
 * @generated
 */
public class VisualIDRegistryExtension {

	/**
	 * @generated
	 */
	private final List<MenuTypeHint> myPackage2Hints;
	/**
	 * @generated
	 */
	{
		List<MenuTypeHint> Package2Hints = new ArrayList<MenuTypeHint>();
		Package2Hints.add(new MenuTypeHint(Messages.TurnIntoPackage2Action_text,// 
				String.valueOf(Package2EditPart.VISUAL_ID)));
		Package2Hints.add(new MenuTypeHint(Messages.TurnIntoPackageAsFrameAction_text,//
				String.valueOf(PackageAsFrameEditPart.VISUAL_ID)));

		myPackage2Hints = Collections.unmodifiableList(Package2Hints);
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
	private final List<MenuTypeHint> myInstanceSpecification2Hints;
	/**
	 * @generated
	 */
	{
		List<MenuTypeHint> InstanceSpecification2Hints = new ArrayList<MenuTypeHint>();
		InstanceSpecification2Hints.add(new MenuTypeHint(Messages.TurnIntoInstanceSpecification2Action_text,// 
				String.valueOf(InstanceSpecification2EditPart.VISUAL_ID)));
		InstanceSpecification2Hints.add(new MenuTypeHint(Messages.TurnIntoInstanceSpecification4Action_text,//
				String.valueOf(InstanceSpecification4EditPart.VISUAL_ID)));

		myInstanceSpecification2Hints = Collections.unmodifiableList(InstanceSpecification2Hints);
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
	private final List<MenuTypeHint> myPackageAsFrameHints;
	/**
	 * @generated
	 */
	{
		List<MenuTypeHint> PackageAsFrameHints = new ArrayList<MenuTypeHint>();
		PackageAsFrameHints.add(new MenuTypeHint(Messages.TurnIntoPackageAsFrameAction_text,// 
				String.valueOf(PackageAsFrameEditPart.VISUAL_ID)));
		PackageAsFrameHints.add(new MenuTypeHint(Messages.TurnIntoPackage2Action_text,//
				String.valueOf(Package2EditPart.VISUAL_ID)));

		myPackageAsFrameHints = Collections.unmodifiableList(PackageAsFrameHints);
	}

	/**
	 * @generated
	 */
	private final List<MenuTypeHint> myInstanceSpecification4Hints;
	/**
	 * @generated
	 */
	{
		List<MenuTypeHint> InstanceSpecification4Hints = new ArrayList<MenuTypeHint>();
		InstanceSpecification4Hints.add(new MenuTypeHint(Messages.TurnIntoInstanceSpecification4Action_text,// 
				String.valueOf(InstanceSpecification4EditPart.VISUAL_ID)));
		InstanceSpecification4Hints.add(new MenuTypeHint(Messages.TurnIntoInstanceSpecification2Action_text,//
				String.valueOf(InstanceSpecification2EditPart.VISUAL_ID)));

		myInstanceSpecification4Hints = Collections.unmodifiableList(InstanceSpecification4Hints);
	}

	/**
	 * @generated
	 */
	private final List<MenuTypeHint> myInterface4Hints;
	/**
	 * @generated
	 */
	{
		List<MenuTypeHint> Interface4Hints = new ArrayList<MenuTypeHint>();
		Interface4Hints.add(new MenuTypeHint(Messages.TurnIntoInterface4Action_text,// 
				String.valueOf(Interface4EditPart.VISUAL_ID)));
		Interface4Hints.add(new MenuTypeHint(Messages.TurnIntoInterface5Action_text,//
				String.valueOf(Interface5EditPart.VISUAL_ID)));

		myInterface4Hints = Collections.unmodifiableList(Interface4Hints);
	}

	/**
	 * @generated
	 */
	private final List<MenuTypeHint> myInterface5Hints;
	/**
	 * @generated
	 */
	{
		List<MenuTypeHint> Interface5Hints = new ArrayList<MenuTypeHint>();
		Interface5Hints.add(new MenuTypeHint(Messages.TurnIntoInterface5Action_text,// 
				String.valueOf(Interface5EditPart.VISUAL_ID)));
		Interface5Hints.add(new MenuTypeHint(Messages.TurnIntoInterface4Action_text,//
				String.valueOf(Interface4EditPart.VISUAL_ID)));

		myInterface5Hints = Collections.unmodifiableList(Interface5Hints);
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

		case Package2EditPart.VISUAL_ID:
			return myPackage2Hints;
		case InterfaceEditPart.VISUAL_ID:
			return myInterfaceHints;
		case InstanceSpecification2EditPart.VISUAL_ID:
			return myInstanceSpecification2Hints;
		case Interface2EditPart.VISUAL_ID:
			return myInterface2Hints;
		case PackageAsFrameEditPart.VISUAL_ID:
			return myPackageAsFrameHints;
		case InstanceSpecification4EditPart.VISUAL_ID:
			return myInstanceSpecification4Hints;
		case Interface4EditPart.VISUAL_ID:
			return myInterface4Hints;
		case Interface5EditPart.VISUAL_ID:
			return myInterface5Hints;

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

		hintedTypes.add(String.valueOf(Package2EditPart.VISUAL_ID));
		hintedTypes.add(String.valueOf(AssociationClass2EditPart.VISUAL_ID));
		hintedTypes.add(String.valueOf(InterfaceEditPart.VISUAL_ID));
		hintedTypes.add(String.valueOf(InstanceSpecification2EditPart.VISUAL_ID));
		hintedTypes.add(String.valueOf(Interface2EditPart.VISUAL_ID));
		hintedTypes.add(String.valueOf(AssociationClassRhombEditPart.VISUAL_ID));
		hintedTypes.add(String.valueOf(PackageAsFrameEditPart.VISUAL_ID));
		hintedTypes.add(String.valueOf(InstanceSpecification4EditPart.VISUAL_ID));
		hintedTypes.add(String.valueOf(Interface4EditPart.VISUAL_ID));
		hintedTypes.add(String.valueOf(Interface5EditPart.VISUAL_ID));

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
		if ("7034".equals(newParentView.getType()) && String.valueOf(InterfaceEditPart.VISUAL_ID).equals(childView.getType())) {
			return "3043";
		}

		if ("7033".equals(newParentView.getType()) && String.valueOf(InterfaceEditPart.VISUAL_ID).equals(childView.getType())) {
			return "3043";
		}

		if ("7034".equals(newParentView.getType()) && String.valueOf(Interface2EditPart.VISUAL_ID).equals(childView.getType())) {
			return "3042";
		}

		if ("7033".equals(newParentView.getType()) && String.valueOf(Interface2EditPart.VISUAL_ID).equals(childView.getType())) {
			return "3042";
		}

		if ("UMLClass".equals(newParentView.getType()) && String.valueOf(Interface4EditPart.VISUAL_ID).equals(childView.getType())) {
			return "2013";
		}

		if ("UMLClass".equals(newParentView.getType()) && String.valueOf(Interface5EditPart.VISUAL_ID).equals(childView.getType())) {
			return "2010";
		}

		return null;
	}

}
