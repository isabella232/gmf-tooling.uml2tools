package org.eclipse.uml2.diagram.statemachine.navigator;

import java.util.Collection;
import java.util.LinkedList;

/**
 * @generated
 */
public class UMLNavigatorGroup extends UMLAbstractNavigatorItem {

	/**
	 * @generated
	 */
	private String myGroupName;

	/**
	 * @generated
	 */
	private String myIcon;

	/**
	 * @generated
	 */
	private String myModelID;

	/**
	 * @generated
	 */
	private Collection myChildren = new LinkedList();

	/**
	 * @generated
	 */
	UMLNavigatorGroup(String groupName, String icon, String modelID, Object parent) {
		super(parent);
		myGroupName = groupName;
		myIcon = icon;
		myModelID = modelID;
	}

	/**
	 * @generated
	 */
	public String getGroupName() {
		return myGroupName;
	}

	/**
	 * @generated
	 */
	public String getIcon() {
		return myIcon;
	}

	/**
	 * @generated
	 */
	public Object[] getChildren() {
		return myChildren.toArray();
	}

	/**
	 * @generated
	 */
	public void addChildren(Collection children) {
		myChildren.addAll(children);
	}

	/**
	 * @generated
	 */
	public void addChild(Object child) {
		myChildren.add(child);
	}

	/**
	 * @generated
	 */
	public boolean isEmpty() {
		return myChildren.size() == 0;
	}

	/**
	 * @generated
	 */
	public String getModelID() {
		return myModelID;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj instanceof UMLNavigatorGroup) {
			UMLNavigatorGroup anotherGroup = (UMLNavigatorGroup) obj;
			if (getGroupName().equals(anotherGroup.getGroupName())) {
				return getParent().equals(anotherGroup.getParent());
			}
		}
		return super.equals(obj);
	}

}
