package org.eclipse.uml2.diagram.clazz.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.runtime.common.core.service.IProvider;
import org.eclipse.gmf.runtime.common.ui.services.action.contributionitem.AbstractContributionItemProvider;
import org.eclipse.gmf.runtime.common.ui.util.IWorkbenchPartDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.emf.core.internal.resources.PathmapManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.uml2.diagram.clazz.part.CustomMessages;
import org.eclipse.uml2.diagram.common.pathmap.PathMapService;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class ApplicableProfilesItemProvider extends AbstractContributionItemProvider implements IProvider {

	public static final String MENU_APPLY_PROFILE = "menu_apply_unapply_profile"; //$NON-NLS-1$

	@Override
	protected IMenuManager createMenuManager(String menuId, IWorkbenchPartDescriptor partDescriptor) {
		if (!MENU_APPLY_PROFILE.equals(menuId)) {
			return super.createMenuManager(menuId, partDescriptor);
		}
		MenuManager menuManager = new MenuManager(CustomMessages.ApplicableProfilesItemProvider_apply_profile_menu);
		MenuBuilder builder = new MenuBuilder(partDescriptor);
		// XXX: build initial content -- otherwise menu is never shown
		builder.buildMenu(menuManager);

		menuManager.addMenuListener(builder);
		return menuManager;
	}

	private class MenuBuilder implements IMenuListener {

		private final IWorkbenchPartDescriptor myWorkbenchPart;

		public MenuBuilder(IWorkbenchPartDescriptor workbenchPart) {
			myWorkbenchPart = workbenchPart;
		}

		public void menuAboutToShow(IMenuManager manager) {
			buildMenu(manager);
		}

		public void buildMenu(IMenuManager manager) {
			manager.removeAll();
			GraphicalEditPart selected = (GraphicalEditPart) getSelectedObject(myWorkbenchPart);

			org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) selected.getNotationView().getElement();
			loadProfilesFromRegistry(package_);

			List<Profile> profiles = getProfiles(package_);
			for (Profile profile : profiles) {
				// no much sense to cache dynamic target specific actions
				ApplyProfileAction action = new ApplyProfileAction(getWorkbenchPage(), package_, profile);
				action.init();
				manager.add(action);
			}
		}

		private void loadProfilesFromRegistry(org.eclipse.uml2.uml.Package package_) {
			ResourceSet resourceSet = package_.eResource().getResourceSet();
			for (URI profileURI : UMLPlugin.getEPackageNsURIToProfileLocationMap().values()) {
				try {
					resourceSet.getResource(profileURI.trimFragment(), true);
				} catch (Exception e) { // ignore
				}
			}
		}

		private IWorkbenchPage getWorkbenchPage() {
			return myWorkbenchPart.getPartPage();
		}
	}

	private List<Profile> getProfiles(final org.eclipse.uml2.uml.Package package_) {
		// copy of code from
		// org.eclipse.uml2.uml.editor.actions.ApplyProfileAction
		final List<Profile> choiceOfValues = new ArrayList<Profile>();

		ResourceSet resourceSet = package_.eResource().getResourceSet();

		addResourcesFromPathMap(resourceSet);

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

	private void addResourcesFromPathMap(ResourceSet resourceSet) {
		try {
			Set<?> pathVariables = PathmapManager.getAllPathVariables();
			for (Object currVariable : pathVariables) {
				String varName = (String) currVariable;
				String varValue = PathmapManager.getRegisteredValue(varName);
				Collection<String> profiles = PathMapService.getInstance().getProfiles(varName, varValue);
				for (String pathmap : profiles) {
					loadResource(resourceSet, pathmap);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Resource loadResource(ResourceSet resourceSet, String pathmap) {
		URI profileURI = URI.createURI(pathmap);
		return resourceSet.getResource(profileURI, true);
	}

}
