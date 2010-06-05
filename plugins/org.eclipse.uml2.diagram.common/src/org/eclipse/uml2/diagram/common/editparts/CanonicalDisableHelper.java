package org.eclipse.uml2.diagram.common.editparts;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * In some cases, see, e.g #315192, #270261, default GMF strategy of disabling
 * edit-policies of link ends and their parents is not enough, because semantic
 * link will be created in the nearest package.
 * <p>
 * To avoid update from the middle of link creation we need to additionally
 * disable the canonical edit-policy for the element which will be the container
 * of the semantic link.
 */
public class CanonicalDisableHelper {

	public static final CanonicalDisableHelper SHARED_PACKAGE_DISABLER = new CanonicalDisableHelper();

	private final EClass myLinkContainerMeta;

	/**
	 * Most common observed case -- semantic link is created inside uml Package.
	 */
	public CanonicalDisableHelper() {
		this(UMLPackage.eINSTANCE.getPackage());
	}

	public CanonicalDisableHelper(EClass linkContainerMeta) {
		myLinkContainerMeta = linkContainerMeta;
	}

	public Collection<?> disableCanonicalFor(EditPart host, Request request, Collection<?> disabledBySuper) {
		if (request instanceof CreateConnectionRequest) {
			EditPart root = null;
			for (; root == null && host != null;) {
				if (host.getModel() instanceof View && myLinkContainerMeta.isInstance(((View) host.getModel()).getElement())) {
					root = host;
				}
				host = host.getParent();
			}

			if (root != null) {
				Set<Object> disabled = new HashSet<Object>(disabledBySuper);
				disabled.add(root);
				return disabled;
			}
		}
		return disabledBySuper;
	}
}
