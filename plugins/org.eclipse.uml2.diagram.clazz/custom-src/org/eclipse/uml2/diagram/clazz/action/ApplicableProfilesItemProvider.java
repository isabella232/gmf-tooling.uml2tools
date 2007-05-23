package org.eclipse.uml2.diagram.clazz.action;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.runtime.common.core.service.IProvider;
import org.eclipse.gmf.runtime.common.ui.services.action.contributionitem.AbstractContributionItemProvider;
import org.eclipse.gmf.runtime.common.ui.util.IWorkbenchPartDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class ApplicableProfilesItemProvider  extends AbstractContributionItemProvider implements IProvider {
	public static final String MENU_APPLY_PROFILE = "menu_apply_unapply_profile"; //$NON-NLS-1$
	
	@Override
	protected IMenuManager createMenuManager(String menuId, IWorkbenchPartDescriptor partDescriptor) {
		if (!MENU_APPLY_PROFILE.equals(menuId)) {
			return super.createMenuManager(menuId, partDescriptor);
		}
		MenuManager menuManager = new MenuManager("Apply Profile");
		MenuBuilder builder = new MenuBuilder(partDescriptor);
		//XXX: build initial content -- otherwise menu is never shown
		builder.buildMenu(menuManager);

		menuManager.addMenuListener(builder);
		return menuManager;
	}

	private class MenuBuilder implements IMenuListener {
		private final IWorkbenchPartDescriptor myWorkbenchPart;

		public MenuBuilder(IWorkbenchPartDescriptor workbenchPart){
			myWorkbenchPart = workbenchPart;
		}
		
		public void menuAboutToShow(IMenuManager manager) {
			buildMenu(manager);
		}
		
		public void buildMenu(IMenuManager manager) {
			manager.removeAll();
			GraphicalEditPart selected = (GraphicalEditPart) getSelectedObject(myWorkbenchPart);
			org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) selected.getNotationView().getElement();
			List<Profile> profiles = getProfiles(package_);
			for (Profile profile : profiles) {
				// no much sense to cache dynamic target specific actions
				ApplyProfileAction action = new ApplyProfileAction(getWorkbenchPage(), package_, profile);
				action.init();
				manager.add(action);
			}
		}

		private IWorkbenchPage getWorkbenchPage(){
			return myWorkbenchPart.getPartPage();
		}
	}

	private List<Profile> getProfiles(final org.eclipse.uml2.uml.Package package_) {
		// copy of code from org.eclipse.uml2.uml.editor.actions.ApplyProfileAction 
		final List<Profile> choiceOfValues = new ArrayList<Profile>();

		ResourceSet resourceSet = package_.eResource().getResourceSet();
		try {
			resourceSet.getResource(URI.createURI(UMLResource.STANDARD_PROFILE_URI), true);
			resourceSet.getResource(URI.createURI(UMLResource.ECORE_PROFILE_URI), true);
		} catch (Exception e) {
			// ignore
		}

		for (Resource resource : resourceSet.getResources()) {
			TreeIterator<EObject> allContents = resource.getAllContents();

			while (allContents.hasNext()) {

				new UMLSwitch<Object>() {

					@Override
					public Object caseProfile(Profile profile) {
						if (profile.isDefined()) {
							choiceOfValues.add(profile);
						}
						return profile;
					}
				}.doSwitch(allContents.next());
			}
		}
		return choiceOfValues;

	}

}
