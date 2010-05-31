package org.eclipse.uml2.diagram.common.links;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.genapi.IUpdaterLinkDescriptor;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Usage;

public class RefreshComplementaryLinksHelper {

	public static final String PORT_PROVIDED_INTERFACES_AFTER_PORT_EVENT = "Port`s provided interfaces after port event";

	public static final String PORT_PROVIDED_INTERFACE_AFTER_PORT_PROVIDED_SOURCE_CHANGED = "Port`s provided interface`s interface realization links";

	public static final String INTERFACE_TARGET_INTERFACE_REALIZATIONS_AFTER_PORT_PROVIDED_TARGET_CHANGED = "Interface`s target interface realization links";

	public static final String PORT_AFTER_INTERFACE_REALIZATION_TARGET_CHANGED = "Port`s provided interfaces, corresponding to interface realization, after interface realization target changed";

	public static final String PORT_AFTER_INTERFACE_REALIZATION_SOURCE_CHANGED = "Port`s provided interfaces, corresponding to interface realization, after interface realization source changed";

	public static final String INTERFACE_AFTER_PORT_REQUIRED_REORIENTED = "Usages targeted by interface";

	public static final String PORT_REQUIRED_INTERFACE_TARGET_USAGES_AFTER_REQUIRED_INTERFACE_SOURCE_CHANGED = "Usages targeted by link`s target interface";

	public static final String PORT_AFTER_USAGE_TARGET_CHANGED = "Required interface links of ports typed by unchanged usage source";

	public static final String PORT_AFTER_USAGE_SOURCE_CHANGED = "Required interface links of ports typed by new and old usage source";

	private final Map<EObject, View> myViewMap;

	private final Map<NotificationDescription, String> myNotificationDescriptions;

	private static final RefreshComplementaryLinksHelper INSTANCE = new RefreshComplementaryLinksHelper();

	public static RefreshComplementaryLinksHelper getInstance() {
		return INSTANCE;
	}

	private RefreshComplementaryLinksHelper() {
		myViewMap = new HashMap<EObject, View>();
		myNotificationDescriptions = new HashMap<NotificationDescription, String>();
	}

	public static interface IDiagramLinkInfoProvider {

		ILinkDetector getLinkDetector();

		Collection<? extends IUpdaterLinkDescriptor> getContainedLinks(View view);

		boolean isPortProvidedEdge(Edge edge);

		boolean isInterfaceRealizationEdge(Edge edge);

		boolean isPortRequiredEdge(Edge edge);

		boolean isUsageEdge(Edge edge);

		boolean hasVisualId(Edge edge, int visualId);

		String getType(int visualId);

		IUpdaterLinkDescriptor createInterfaceRealizationLinkDescriptor(Classifier source, Interface target, InterfaceRealization link);

		IUpdaterLinkDescriptor createUsageLinkDescriptor(Classifier source, Interface target, Usage link);
	}

	public void addNotificationDescription(EObject semanticObject, Object notificationFeature, String action) {
		myNotificationDescriptions.put(new NotificationDescription(semanticObject, notificationFeature), action);
	}

	public void handleNotification(IGraphicalEditPart editPart, Notification notification, IDiagramLinkInfoProvider provider) {
		NotificationDescription descr = new NotificationDescription(editPart.getNotationView().getElement(), notification.getFeature());
		String action = myNotificationDescriptions.get(descr);
		if (action != null) {
			myNotificationDescriptions.remove(descr);
			if (action == PORT_PROVIDED_INTERFACES_AFTER_PORT_EVENT) {
				refreshPortProvidedInterfaceConnections(editPart, provider);
			} else if (action == PORT_PROVIDED_INTERFACE_AFTER_PORT_PROVIDED_SOURCE_CHANGED) {
				refreshPortProvidedInterfaceConnectionsAfterPortProvidedSourceChanged(editPart, notification, provider);
			} else if (action == INTERFACE_TARGET_INTERFACE_REALIZATIONS_AFTER_PORT_PROVIDED_TARGET_CHANGED) {
				refreshInterfaceConnectionsAfterPortProvidedTargetChanged(editPart, provider);
			} else if (action == PORT_AFTER_INTERFACE_REALIZATION_TARGET_CHANGED) {
				refreshPortConnectionsAfterInterfaceRealizationTargetChanged(editPart, notification, provider);
			} else if (action == PORT_AFTER_INTERFACE_REALIZATION_SOURCE_CHANGED) {
				refreshPortConnectionsAfterInterfaceRealizationSourceChanged(editPart, notification, provider);
			} else if (action == INTERFACE_AFTER_PORT_REQUIRED_REORIENTED) {
				refreshInterfaceConnectionsAfterPortRequiredReoriented(editPart, provider);
			} else if (action == PORT_REQUIRED_INTERFACE_TARGET_USAGES_AFTER_REQUIRED_INTERFACE_SOURCE_CHANGED) {
				refreshPortRequiredInterfaceConnectionsAfterRequiredInterfaceSourceChanged(editPart, notification, provider);
			} else if (action == PORT_AFTER_USAGE_TARGET_CHANGED) {
				refreshPortAfterUsageTargetChanged(editPart, notification, provider);
			} else if (action == PORT_AFTER_USAGE_SOURCE_CHANGED) {
				refreshRelatingPortsAfterUsageSourceChanged(editPart, notification, provider);
			}
		}
	}

	private void refreshPortProvidedInterfaceConnections(IGraphicalEditPart portEditPart, IDiagramLinkInfoProvider provider) {
		View view = portEditPart.getNotationView();
		Collection<? extends IUpdaterLinkDescriptor> portLinks = provider.getContainedLinks(view);
		List<IUpdaterLinkDescriptor> proposedLinks = new LinkedList<IUpdaterLinkDescriptor>();

		EObject element = view.getElement();
		ILinkDetector linkDetector = provider.getLinkDetector();
		for (IUpdaterLinkDescriptor link : portLinks) {
			if (linkDetector.isProvidedInterfaceLink(link) && //
					link.getSource() == element) {
				proposedLinks.add(link);
			}
		}

		@SuppressWarnings("unchecked")
		Collection<EditPart> connectionEditParts = new LinkedList<EditPart>(portEditPart.getSourceConnections());
		Collection<EditPart> existingEditParts = new LinkedList<EditPart>();
		for (EditPart editPart : connectionEditParts) {
			Edge edge = (Edge) editPart.getModel();
			if (provider.isPortProvidedEdge(edge)) {
				existingEditParts.add(editPart);
			}
		}

		refreshConnections(proposedLinks, existingEditParts, portEditPart, provider);
	}

	private void refreshPortRequiredInterfaceConnections(IGraphicalEditPart portEditPart, Notification notification, IDiagramLinkInfoProvider provider) {
		View view = portEditPart.getNotationView();
		Collection<? extends IUpdaterLinkDescriptor> portLinks = provider.getContainedLinks(view);
		List<IUpdaterLinkDescriptor> proposedLinks = new LinkedList<IUpdaterLinkDescriptor>();

		EObject element = view.getElement();
		ILinkDetector linkDetector = provider.getLinkDetector();
		for (IUpdaterLinkDescriptor link : portLinks) {
			if (linkDetector.isRequiredInterfaceLink(link) && //
					link.getSource() == element) {
				proposedLinks.add(link);
			}
		}

		@SuppressWarnings("unchecked")
		Collection<EditPart> connectionEditParts = new LinkedList<EditPart>(portEditPart.getSourceConnections());
		Collection<EditPart> existingEditParts = new LinkedList<EditPart>();
		for (EditPart editPart : connectionEditParts) {
			Edge edge = (Edge) editPart.getModel();
			if (provider.isPortRequiredEdge(edge)) {
				existingEditParts.add(editPart);
			}
		}

		refreshConnections(proposedLinks, existingEditParts, portEditPart, provider);
	}

	private void refreshPortAfterUsageTargetChanged(IGraphicalEditPart interfaceEditPart, Notification notification, IDiagramLinkInfoProvider provider) {
		Set<View> portViews = new HashSet<View>();

		Edge usageEdge = (Edge) (notification.getOldValue() == null ? notification.getNewValue() : notification.getOldValue());
		EObject classifierObject = usageEdge.getSource().getElement();

		if (!(classifierObject instanceof Classifier)) {
			return;
		}

		Classifier classifier = (Classifier) classifierObject;
		View interfaceView = interfaceEditPart.getNotationView();

		for (Object targetEdgeObject : interfaceView.getTargetEdges()) {
			Edge targetEdge = (Edge) targetEdgeObject;
			if (provider.isPortRequiredEdge(targetEdge)) {
				Port port = (Port) targetEdge.getSource().getElement();
				if (port.getType() != classifier) {
					continue;
				}
				portViews.add(targetEdge.getSource());
			}
		}

		for (View view : portViews) {
			IGraphicalEditPart portEditPart = getEditPart(view, interfaceEditPart);
			refreshPortRequiredInterfaceConnections(portEditPart, notification, provider);
		}
	}

	private void refreshPortProvidedInterfaceConnectionsAfterPortProvidedSourceChanged(IGraphicalEditPart portEditPart, Notification notification, IDiagramLinkInfoProvider provider) {
		Edge portProvidedEdge = (Edge) notification.getNewValue();
		View interfaceView = portProvidedEdge.getTarget();
		IGraphicalEditPart interfaceEditPart = getEditPart(interfaceView, portEditPart);
		refreshInterfaceInterfaceRealizations(interfaceEditPart, provider);
	}

	private void refreshRelatingPortsAfterUsageSourceChanged(IGraphicalEditPart usageEditPart, Notification notification, IDiagramLinkInfoProvider provider) {
		View oldSourceView = (View) notification.getOldValue();
		View newSourceView = (View) notification.getNewValue();

		if (oldSourceView == null || newSourceView == null) {
			return;
		}

		Map<EObject, View> portViews = new HashMap<EObject, View>();
		EObject oldClassifierObject = oldSourceView.getElement();
		EObject newClassifierObject = newSourceView.getElement();

		if (!(oldClassifierObject instanceof Classifier) || !(newClassifierObject instanceof Classifier)) {
			return;
		}

		Classifier oldClassifier = (Classifier) oldClassifierObject;
		Classifier newClassifier = (Classifier) newClassifierObject;

		Diagram diagram = oldSourceView.getDiagram();

		List<View> views = new ArrayList<View>();
		views.add(diagram);

		for (int i = 0; i < views.size(); i++) {
			View next = views.get(i);
			EObject element = next.getElement();
			if (element instanceof Port) {
				Port port = (Port) element;
				if ((port.getType() == oldClassifier || port.getType() == newClassifier) && !portViews.containsKey(element)) {
					portViews.put(element, next);
				}
			}
			addAllChildrenViews(views, next);
		}

		for (View view : portViews.values()) {
			IGraphicalEditPart portEditPart = getEditPart(view, usageEditPart);
			refreshPortRequiredInterfaceConnections(portEditPart, notification, provider);
		}
	}

	private void refreshInterfaceTargetUsageConnections(IGraphicalEditPart interfaceEditPart, IDiagramLinkInfoProvider provider) {
		View view = interfaceEditPart.getNotationView();
		Interface element = (Interface) view.getElement();
		Collection<IUpdaterLinkDescriptor> interfaceLinks = getTargetUsageLinks(element, provider);
		List<IUpdaterLinkDescriptor> proposedLinks = new LinkedList<IUpdaterLinkDescriptor>();

		ILinkDetector linkDetector = provider.getLinkDetector();
		for (IUpdaterLinkDescriptor link : interfaceLinks) {
			if (linkDetector.isUsageLink(link) && link.getDestination() == element) {
				proposedLinks.add(link);
			}
		}

		@SuppressWarnings("unchecked")
		Collection<EditPart> connectionEditParts = new LinkedList<EditPart>(interfaceEditPart.getTargetConnections());
		Collection<EditPart> existingEditParts = new LinkedList<EditPart>();
		for (EditPart editPart : connectionEditParts) {
			Edge edge = (Edge) editPart.getModel();
			if (provider.isUsageEdge(edge)) {
				existingEditParts.add(editPart);
			}
		}

		refreshConnections(proposedLinks, existingEditParts, interfaceEditPart, provider);
	}

	private void refreshInterfaceConnectionsAfterPortProvidedTargetChanged(IGraphicalEditPart interfaceEditPart, IDiagramLinkInfoProvider provider) {
		refreshInterfaceInterfaceRealizations(interfaceEditPart, provider);
	}

	private void refreshInterfaceInterfaceRealizations(IGraphicalEditPart interfaceEditPart, IDiagramLinkInfoProvider provider) {
		View view = interfaceEditPart.getNotationView();
		Collection<IUpdaterLinkDescriptor> interfaceLinks = getTargetInterfaceRealizationLinks((Interface) view.getElement(), provider);
		List<IUpdaterLinkDescriptor> proposedLinks = new LinkedList<IUpdaterLinkDescriptor>();

		EObject element = (view).getElement();
		ILinkDetector linkDetector = provider.getLinkDetector();
		for (IUpdaterLinkDescriptor link : interfaceLinks) {
			if (linkDetector.isInterfaceRealizationLink(link) && link.getDestination() == element) {
				proposedLinks.add(link);
			}
		}

		@SuppressWarnings("unchecked")
		Collection<EditPart> connectionEditParts = new LinkedList<EditPart>(interfaceEditPart.getTargetConnections());
		Collection<EditPart> existingEditParts = new LinkedList<EditPart>();
		for (EditPart editPart : connectionEditParts) {
			Edge edge = (Edge) editPart.getModel();
			if (provider.isInterfaceRealizationEdge(edge)) {
				existingEditParts.add(editPart);
			}
		}

		refreshConnections(proposedLinks, existingEditParts, interfaceEditPart, provider);
	}

	private void refreshPortConnectionsAfterInterfaceRealizationTargetChanged(IGraphicalEditPart interfaceRealizationEditPart, Notification notification, IDiagramLinkInfoProvider provider) {
		View oldInterfaceView = (View) notification.getOldValue();
		Edge edge = (Edge) interfaceRealizationEditPart.getModel();
		View classifierView = edge.getSource();
		EObject classifier = classifierView.getElement();

		Set<View> portViews = new HashSet<View>();
		for (Object targetObject : oldInterfaceView.getTargetEdges()) {
			Edge targetEdge = (Edge) targetObject;
			if (provider.isPortProvidedEdge(targetEdge) && targetEdge.getSource() != null && targetEdge.getSource().getElement() != null && //
					((Port) targetEdge.getSource().getElement()).getType() == classifier) {
				portViews.add(targetEdge.getSource());
			}
		}
		for (View portView : portViews) {
			refreshPortProvidedInterfaceConnections((IGraphicalEditPart) interfaceRealizationEditPart.getViewer().getEditPartRegistry().get(portView), provider);
		}
	}

	private void refreshPortConnectionsAfterInterfaceRealizationSourceChanged(IGraphicalEditPart interfaceRealizationEditPart, Notification notification, IDiagramLinkInfoProvider provider) {
		View oldSourceView = (View) notification.getOldValue();
		View newSourceView = (View) notification.getNewValue();

		if (oldSourceView == null || newSourceView == null) {
			return;
		}

		Map<EObject, View> portViews = new HashMap<EObject, View>();
		EObject oldClassifierObject = oldSourceView.getElement();
		EObject newClassifierObject = newSourceView.getElement();

		if (!(oldClassifierObject instanceof Classifier) || !(newClassifierObject instanceof Classifier)) {
			return;
		}

		Classifier oldClassifier = (Classifier) oldClassifierObject;
		Classifier newClassifier = (Classifier) newClassifierObject;

		Diagram diagram = oldSourceView.getDiagram();

		List<View> views = new ArrayList<View>();
		views.add(diagram);

		for (int i = 0; i < views.size(); i++) {
			View next = views.get(i);
			EObject element = next.getElement();
			if (element instanceof Port) {
				Port port = (Port) element;
				if ((port.getType() == oldClassifier || port.getType() == newClassifier) && !portViews.containsKey(element)) {
					portViews.put(element, next);
				}
			}
			addAllChildrenViews(views, next);
		}

		for (View view : portViews.values()) {
			IGraphicalEditPart portEditPart = getEditPart(view, interfaceRealizationEditPart);
			refreshPortProvidedInterfaceConnections(portEditPart, provider);
		}
	}

	private void refreshInterfaceConnectionsAfterPortRequiredReoriented(IGraphicalEditPart interfaceEditPart, IDiagramLinkInfoProvider provider) {
		refreshInterfaceTargetUsageConnections(interfaceEditPart, provider);
	}

	private void refreshPortRequiredInterfaceConnectionsAfterRequiredInterfaceSourceChanged(IGraphicalEditPart portEditPart, Notification notification, IDiagramLinkInfoProvider provider) {
		Edge edge = (Edge) (notification.getNewValue() == null ? notification.getOldValue() : notification.getNewValue());

		View interfaceView = edge.getTarget();
		IGraphicalEditPart interfaceEditPart = (IGraphicalEditPart) portEditPart.getViewer().getEditPartRegistry().get(interfaceView);
		refreshInterfaceTargetUsageConnections(interfaceEditPart, provider);
	}

	private void refreshConnections(Collection<IUpdaterLinkDescriptor> proposedLinks, Collection<EditPart> existingEditParts,//
			IGraphicalEditPart editPart, IDiagramLinkInfoProvider provider) {
		List<EditPart> editPartsToRemove = new LinkedList<EditPart>();

		for (EditPart existingEditPart : existingEditParts) {
			Edge edge = (Edge) existingEditPart.getModel();

			boolean found = false;

			for (Iterator<IUpdaterLinkDescriptor> linkIterator = proposedLinks.iterator(); linkIterator.hasNext();) {
				IUpdaterLinkDescriptor linkDescriptor = linkIterator.next();
				if (provider.hasVisualId(edge, linkDescriptor.getVisualID()) && //
						linkDescriptor.getSource() == edge.getSource().getElement() && //
						linkDescriptor.getDestination() == edge.getTarget().getElement()) {
					linkIterator.remove();
					found = true;
				}
			}
			if (!found) {
				editPartsToRemove.add(existingEditPart);
			}
		}
		deleteViews(editPartsToRemove.iterator(), editPart);
		createConnections(proposedLinks, editPart, provider);
	}

	private void deleteViews(Iterator<EditPart> editParts, IGraphicalEditPart baseEditPart) {
		final CompoundCommand cc = new CompoundCommand(DiagramUIMessages.DeleteCommand_Label);
		while (editParts.hasNext()) {
			cc.add(getDeleteViewCommand(editParts.next()));
		}

		boolean doDelete = !cc.isEmpty() && cc.canExecute();
		if (doDelete) {
			executeCommand(cc, baseEditPart);
		}
	}

	private Command getDeleteViewCommand(EditPart editPart) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) editPart).getEditingDomain();
		return new ICommandProxy(new DeleteCommand(editingDomain, (View) editPart.getModel()));
	}

	private Collection<IAdaptable> createConnections(Collection<IUpdaterLinkDescriptor> linkDescriptors, //
			IGraphicalEditPart givenEditPart, IDiagramLinkInfoProvider provider) {
		List<IAdaptable> adapters = new LinkedList<IAdaptable>();
		for (Iterator<IUpdaterLinkDescriptor> linkDescriptorsIterator = linkDescriptors.iterator(); linkDescriptorsIterator.hasNext();) {
			final IUpdaterLinkDescriptor nextLinkDescriptor = linkDescriptorsIterator.next();
			EditPart sourceEditPart = getEditPart(nextLinkDescriptor.getSource(), givenEditPart);
			EditPart targetEditPart = getEditPart(nextLinkDescriptor.getDestination(), givenEditPart);
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(nextLinkDescriptor.getSemanticAdapter(), provider
					.getType(nextLinkDescriptor.getVisualID()), ViewUtil.APPEND, false, givenEditPart.getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd, givenEditPart);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	private View findView(EObject element, IGraphicalEditPart editPart) {
		View view = myViewMap.get(element);
		if (view == null || view.getElement() != element || view.getDiagram() != (editPart.getNotationView()).getDiagram()) {
			view = searchView(element, editPart);
		}
		return view;
	}

	private View searchView(EObject element, IGraphicalEditPart editPart) {
		View topElement = editPart.getNotationView().getDiagram();
		ArrayList<View> views = new ArrayList<View>();
		views.add(topElement);
		myViewMap.clear();

		for (int i = 0; i < views.size(); i++) {
			View currentView = views.get(i);
			EObject currentElement = currentView.getElement();
			if (currentElement != null) {
				if (!myViewMap.containsKey(currentElement)) {
					myViewMap.put(currentElement, currentView);
				}
				if (currentElement == element) {
					return currentView;
				}
			}
			addAllChildrenViews(views, currentView);
		}
		return null;
	}

	private IGraphicalEditPart getEditPart(EObject element, IGraphicalEditPart knownEditPart) {
		View view = findView(element, knownEditPart);
		if (view == null) {
			return null;
		}
		return (IGraphicalEditPart) knownEditPart.getViewer().getEditPartRegistry().get(view);
	}

	private IGraphicalEditPart getEditPart(View view, IGraphicalEditPart knownEditPart) {
		return (IGraphicalEditPart) knownEditPart.getViewer().getEditPartRegistry().get(view);
	}

	private void executeCommand(Command command, IGraphicalEditPart knownEditPart) {
		knownEditPart.getViewer().getEditDomain().getCommandStack().execute(command);
	}

	private Collection<IUpdaterLinkDescriptor> getTargetInterfaceRealizationLinks(Interface target, IDiagramLinkInfoProvider provider) {
		Collection<IUpdaterLinkDescriptor> result = new LinkedList<IUpdaterLinkDescriptor>();

		for (Iterator<Relationship> links = target.getRelationships(UMLPackage.eINSTANCE.getInterfaceRealization()).iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InterfaceRealization) {
				continue;
			}
			InterfaceRealization link = (InterfaceRealization) linkObject;

			EList<NamedElement> sources = link.getClients();
			if (sources.size() != 1) {
				continue;
			}

			NamedElement source = sources.get(0);
			if (false == source instanceof Classifier) {
				continue;
			}
			if (link.getSuppliers().contains(target)) {
				result.add(provider.createInterfaceRealizationLinkDescriptor((Classifier) sources.get(0), target, link));
			}
		}
		return result;
	}

	private Collection<IUpdaterLinkDescriptor> getTargetUsageLinks(Interface target, IDiagramLinkInfoProvider provider) {
		Collection<IUpdaterLinkDescriptor> result = new LinkedList<IUpdaterLinkDescriptor>();

		for (Iterator<Relationship> links = target.getRelationships(UMLPackage.eINSTANCE.getUsage()).iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Usage) {
				continue;
			}
			Usage link = (Usage) linkObject;

			EList<NamedElement> sources = link.getClients();
			if (sources.size() != 1) {
				continue;
			}

			NamedElement source = sources.get(0);
			if (false == source instanceof Classifier) {
				continue;
			}
			if (link.getSuppliers().contains(target)) {
				result.add(provider.createUsageLinkDescriptor((Classifier) source, target, link));
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private static Collection<View> addAllChildrenViews(Collection<View> output, View parent){
		output.addAll(parent.getChildren());
		return output;
	}

	private class NotificationDescription {

		private EObject object;

		private Object notificationFeature;

		public NotificationDescription(EObject object, Object notificationFeature) {
			this.object = object;
			this.notificationFeature = notificationFeature;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((notificationFeature == null) ? 0 : notificationFeature.hashCode());
			result = prime * result + ((object == null) ? 0 : object.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (!(obj instanceof NotificationDescription))
				return false;
			NotificationDescription other = (NotificationDescription) obj;

			if (notificationFeature == null) {
				if (other.notificationFeature != null)
					return false;
			} else if (!notificationFeature.equals(other.notificationFeature))
				return false;
			if (object == null) {
				if (other.object != null)
					return false;
			} else if (!object.equals(other.object))
				return false;
			return true;
		}
	}
}
