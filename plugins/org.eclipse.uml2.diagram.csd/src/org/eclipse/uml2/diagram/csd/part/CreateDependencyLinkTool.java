/**
 * @generated
 */
package org.eclipse.uml2.diagram.csd.part;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.uml2.diagram.common.part.CreateLinkToolBase;
import org.eclipse.uml2.diagram.csd.edit.helpers.DependencyEditHelper;
import org.eclipse.uml2.diagram.csd.providers.UMLElementTypes;
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
		super(Collections.singletonList(UMLElementTypes.Dependency_4017));
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
	 * @generated NOT
	 */
	public static class USAGE extends CreateLinkToolBase {

		private static final List<IHintedType> typeList;
		static {
			List<IHintedType> types = new LinkedList<IHintedType>();
			types.add(UMLElementTypes.Dependency_4017);
			types.add(UMLElementTypes.Usage_4008);
			types.add(UMLElementTypes.PortRequired_4014);
			typeList = Collections.unmodifiableList(types);
		}

		/**
		 * @generated NOT
		 */
		public USAGE() {
			super(typeList);
		}

		protected Map<String, ?> createAdditionalExtendedData() {
			return Collections.singletonMap(DependencyEditHelper.PARAMETER_DEPENDENCY_TYPE, UMLPackage.eINSTANCE.getUsage());
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
