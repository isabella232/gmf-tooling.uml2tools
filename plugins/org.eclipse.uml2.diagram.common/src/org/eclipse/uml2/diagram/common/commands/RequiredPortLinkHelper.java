package org.eclipse.uml2.diagram.common.commands;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.uml2.diagram.common.links.PortOperationsExt;
import org.eclipse.uml2.diagram.common.links.RefreshComplementaryLinksHelper;
import org.eclipse.uml2.diagram.common.links.RequiredInterfaceLink;
import org.eclipse.uml2.diagram.common.preferences.UMLPreferencesConstants;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Type;

public class RequiredPortLinkHelper {

	private final AdapterFactoryEditingDomain myEditingDomain;

	private final EObject mySource;

	private final EObject myTarget;

	private final IPreferenceStore myStore;

	public RequiredPortLinkHelper(AdapterFactoryEditingDomain editingDomain, EObject source, EObject target, IPreferenceStore store) {
		myEditingDomain = editingDomain;
		mySource = source;
		myTarget = target;
		myStore = store;
	}

	public void create() {
		if (getSource() == null || getTarget() == null || getSource().getType() == null) {
			return;
		}
		Type type = getSource().getType();
		if (type instanceof Classifier && !(type instanceof Interface)) {
			Classifier classifier = (Classifier) type;
			classifier.createUsage(getTarget());
			RefreshComplementaryLinksHelper.getInstance().addNotificationDescription(getTarget(), NotationPackage.eINSTANCE.getView_TargetEdges(),
					RefreshComplementaryLinksHelper.INTERFACE_AFTER_PORT_REQUIRED_REORIENTED); 
		}
	}

	public boolean canCreate() {
		if (myStore.getBoolean(UMLPreferencesConstants.PREF_MANAGE_LINKS_HIDE_REQUIRED_INTERFACE_LINKS)) {
			return false;
		}

		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		Type type = getSource().getType();
		if (type == null) {
			return false;
		}
		if (false == type instanceof Classifier || (type instanceof Interface)) {
			return false;
		}
		boolean isReadOnly = myEditingDomain.isReadOnly(type.eResource()); 
		return !isReadOnly;
	}

	public void reorientSource(Port newSource) {
		RequiredInterfaceLink link = PortOperationsExt.getRequireds(getSource(), getTarget());
		link.getLink().getClients().remove(link.getSource());
		link.getLink().getClients().add(newSource.getType());

		RefreshComplementaryLinksHelper.getInstance().addNotificationDescription(newSource,//
				NotationPackage.eINSTANCE.getView_SourceEdges(), RefreshComplementaryLinksHelper.PORT_REQUIRED_INTERFACE_TARGET_USAGES_AFTER_REQUIRED_INTERFACE_SOURCE_CHANGED);
	}

	public boolean canReorientSource(Port newSource) {
		Type type = newSource.getType();
		return (type != null) && (type instanceof Classifier) && (false == type instanceof Interface);
	}

	public void reorientTarget(Interface newTarget) {
		RequiredInterfaceLink link = PortOperationsExt.getRequireds(getSource(), getTarget());

		NamedElement oldTarget = link.getTarget();
		link.getLink().getSuppliers().remove(oldTarget);
		link.getLink().getSuppliers().add(newTarget);

		RefreshComplementaryLinksHelper.getInstance().addNotificationDescription(newTarget,//
				NotationPackage.eINSTANCE.getView_TargetEdges(), RefreshComplementaryLinksHelper.INTERFACE_AFTER_PORT_REQUIRED_REORIENTED);
		RefreshComplementaryLinksHelper.getInstance().addNotificationDescription(oldTarget,//
				NotationPackage.eINSTANCE.getView_TargetEdges(), RefreshComplementaryLinksHelper.INTERFACE_AFTER_PORT_REQUIRED_REORIENTED);
	}

	public boolean canReorientTarget(Interface newTarget) {
		return true;
	}

	private Port getSource() {
		return (Port) mySource;
	}

	private Interface getTarget() {
		return (Interface) myTarget;
	}

}
