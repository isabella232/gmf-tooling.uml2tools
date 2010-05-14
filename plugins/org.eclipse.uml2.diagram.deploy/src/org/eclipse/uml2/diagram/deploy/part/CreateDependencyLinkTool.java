/**
 * @generated
 */
package org.eclipse.uml2.diagram.deploy.part;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.diagram.common.part.CreateLinkToolBase;
import org.eclipse.uml2.diagram.deploy.edit.helpers.DependencyEditHelper;
import org.eclipse.uml2.diagram.deploy.providers.UMLElementTypes;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class CreateDependencyLinkTool extends CreateLinkToolBase {

	/**
	 * @generated
	 */
	private final EClass myLinkEClass;

	/**
	 * @generated
	 */
	public CreateDependencyLinkTool(EClass linkEClass) {
		super(Collections.singletonList(UMLElementTypes.Dependency_4005));
		myLinkEClass = linkEClass;
	}

	/**
	 * @generated
	 */
	protected Map<String, ?> createAdditionalExtendedData() {
		return Collections.singletonMap(DependencyEditHelper.PARAMETER_DEPENDENCY_TYPE, myLinkEClass);
	}

	/**
	 * @generated
	 */
	public static class DEPENDENCY extends CreateDependencyLinkTool {

		/**
		 * @generated
		 */
		public DEPENDENCY() {
			super(UMLPackage.eINSTANCE.getDependency());
		}
	}

	/**
	 * @generated
	 */
	public static class ABSTRACTION extends CreateDependencyLinkTool {

		/**
		 * @generated
		 */
		public ABSTRACTION() {
			super(UMLPackage.eINSTANCE.getAbstraction());
		}
	}

	/**
	 * @generated
	 */
	public static class USAGE extends CreateDependencyLinkTool {

		/**
		 * @generated
		 */
		public USAGE() {
			super(UMLPackage.eINSTANCE.getUsage());
		}
	}

	/**
	 * @generated
	 */
	public static class SUBSTITUTION extends CreateDependencyLinkTool {

		/**
		 * @generated
		 */
		public SUBSTITUTION() {
			super(UMLPackage.eINSTANCE.getSubstitution());
		}
	}
}
