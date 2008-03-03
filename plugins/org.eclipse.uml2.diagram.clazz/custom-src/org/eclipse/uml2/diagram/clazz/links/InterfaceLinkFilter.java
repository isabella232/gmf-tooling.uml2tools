package org.eclipse.uml2.diagram.clazz.links;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.diagram.clazz.part.UMLLinkDescriptor;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;


public abstract class InterfaceLinkFilter {

	protected final boolean ourHideReferencedGenuine;
	protected final boolean ourHideDerived;
	
	private final Collection<UMLLinkDescriptor> myInterfaceLinks = new LinkedList<UMLLinkDescriptor>();
	private final List<Classifier> myClassifiersTypingPort = new ArrayList<Classifier>(1);

	public InterfaceLinkFilter(boolean hideDerived, boolean hideReferencedGenuine) {
		ourHideDerived = hideDerived;
		ourHideReferencedGenuine = hideReferencedGenuine;
	}
	
	public void visit(UMLLinkDescriptor link) {
		visitReqiredOrProvidedInterfaceLink(link);
	}

	public Collection<UMLLinkDescriptor> getFilteredLinks() {
		return getFilteredLinks(myInterfaceLinks);
	}
	
	protected Collection<UMLLinkDescriptor> getFilteredLinks(Collection<UMLLinkDescriptor> links) {
		List<UMLLinkDescriptor> result = new ArrayList<UMLLinkDescriptor>();
		for (UMLLinkDescriptor next : links) {
			if (ourHideDerived && isDerivedLink(next)) {
				continue;
			}
			if (ourHideReferencedGenuine && isGenuineLink(next)) {
				continue;
			}
			result.add(next);
		}
		return result;
	}

	protected void visitReqiredOrProvidedInterfaceLink(UMLLinkDescriptor link) {
		if (!isInterfaceLink(link)) {
			return;
		}
		// both required and provided links refer to their types and its parents 
		myInterfaceLinks.add(link);
		EObject source = link.getSource();
		if (source instanceof Port) {
			Port port = (Port) source;
			Type type = (Type) port.eGet(UMLPackage.Literals.TYPED_ELEMENT__TYPE, false);
			if (type instanceof Classifier && !(type instanceof Interface)) {
				Classifier classifier = (Classifier) port.getType();
				myClassifiersTypingPort.add(classifier);
				myClassifiersTypingPort.addAll(classifier.allParents());
			}
		}
	}

	/*
	 * We say that Required/Provided Link is Derived if it goes out of port 
	 */
	protected boolean isDerivedLink(UMLLinkDescriptor link) {
		return (link.getSource() != null && link.getSource() instanceof Port);
	}

	/*
	 * Returns Genuine links for which Port#getRequireds()/getProvideds() derived link exists 
	 */
	protected boolean isGenuineLink(UMLLinkDescriptor link) {
		EObject source = link.getSource();
		return myClassifiersTypingPort.contains(source);
	}

	protected boolean isInterfaceLink(UMLLinkDescriptor link) {
		return false;
	}

}
