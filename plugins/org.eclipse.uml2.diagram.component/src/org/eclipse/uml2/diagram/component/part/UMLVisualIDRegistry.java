package org.eclipse.uml2.diagram.component.part;

import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.diagram.component.edit.parts.Artifact2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Component2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentContents2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentContentsEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortNameEditPart;

import org.eclipse.uml2.diagram.component.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.component.expressions.UMLOCLFactory;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented 
 * by a domain model object.
 *
 * @generated
 */
public class UMLVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = UMLDiagramEditorPlugin.getInstance().getBundle().getSymbolicName() + "/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PackageEditPart.MODEL_ID.equals(view.getType())) {
				return PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				UMLDiagramEditorPlugin.getInstance().logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getDiagramVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	private static int getDiagramVisualID(EObject domainElement, EClass domainElementMetaclass) {
		if (UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElementMetaclass) && isDiagramPackage_1000((org.eclipse.uml2.uml.Package) domainElement)) {
			return PackageEditPart.VISUAL_ID;
		}
		return getUnrecognizedDiagramID(domainElement);
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getNodeVisualID(containerView, domainElement, domainElementMetaclass, null);
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement, EClass domainElementMetaclass, String semanticHint) {
		String containerModelID = getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		int nodeVisualID = semanticHint != null ? getVisualID(semanticHint) : -1;
		switch (containerVisualID) {
		case ComponentEditPart.VISUAL_ID:
			if (ComponentName2EditPart.VISUAL_ID == nodeVisualID) {
				return ComponentName2EditPart.VISUAL_ID;
			}
			if (ComponentContentsEditPart.VISUAL_ID == nodeVisualID) {
				return ComponentContentsEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PortEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePort_3002((Port) domainElement))) {
				return PortEditPart.VISUAL_ID;
			}
			return getUnrecognizedComponent_2001ChildNodeID(domainElement, semanticHint);
		case Artifact2EditPart.VISUAL_ID:
			if (ArtifactName2EditPart.VISUAL_ID == nodeVisualID) {
				return ArtifactName2EditPart.VISUAL_ID;
			}
			return getUnrecognizedArtifact_2002ChildNodeID(domainElement, semanticHint);
		case Interface2EditPart.VISUAL_ID:
			if (InterfaceName2EditPart.VISUAL_ID == nodeVisualID) {
				return InterfaceName2EditPart.VISUAL_ID;
			}
			return getUnrecognizedInterface_2003ChildNodeID(domainElement, semanticHint);
		case Class2EditPart.VISUAL_ID:
			if (ClassName2EditPart.VISUAL_ID == nodeVisualID) {
				return ClassName2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PortEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePort_3002((Port) domainElement))) {
				return PortEditPart.VISUAL_ID;
			}
			return getUnrecognizedClass_2004ChildNodeID(domainElement, semanticHint);
		case Component2EditPart.VISUAL_ID:
			if (ComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return ComponentNameEditPart.VISUAL_ID;
			}
			if (ComponentContents2EditPart.VISUAL_ID == nodeVisualID) {
				return ComponentContents2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PortEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePort_3002((Port) domainElement))) {
				return PortEditPart.VISUAL_ID;
			}
			return getUnrecognizedComponent_3001ChildNodeID(domainElement, semanticHint);
		case PortEditPart.VISUAL_ID:
			if (PortNameEditPart.VISUAL_ID == nodeVisualID) {
				return PortNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedPort_3002ChildNodeID(domainElement, semanticHint);
		case ArtifactEditPart.VISUAL_ID:
			if (ArtifactNameEditPart.VISUAL_ID == nodeVisualID) {
				return ArtifactNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedArtifact_3003ChildNodeID(domainElement, semanticHint);
		case ClassEditPart.VISUAL_ID:
			if (ClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return ClassNameEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PortEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePort_3002((Port) domainElement))) {
				return PortEditPart.VISUAL_ID;
			}
			return getUnrecognizedClass_3004ChildNodeID(domainElement, semanticHint);
		case InterfaceEditPart.VISUAL_ID:
			if (InterfaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return InterfaceNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedInterface_3005ChildNodeID(domainElement, semanticHint);
		case ComponentContentsEditPart.VISUAL_ID:
			if ((semanticHint == null || Component2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeComponent_3001((Component) domainElement))) {
				return Component2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || ArtifactEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeArtifact_3003((Artifact) domainElement))) {
				return ArtifactEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || ClassEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeClass_3004((org.eclipse.uml2.uml.Class) domainElement))) {
				return ClassEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || InterfaceEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInterface_3005((Interface) domainElement))) {
				return InterfaceEditPart.VISUAL_ID;
			}
			return getUnrecognizedComponentContents_7001ChildNodeID(domainElement, semanticHint);
		case ComponentContents2EditPart.VISUAL_ID:
			if ((semanticHint == null || Component2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeComponent_3001((Component) domainElement))) {
				return Component2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || ArtifactEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeArtifact_3003((Artifact) domainElement))) {
				return ArtifactEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || ClassEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeClass_3004((org.eclipse.uml2.uml.Class) domainElement))) {
				return ClassEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || InterfaceEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInterface_3005((Interface) domainElement))) {
				return InterfaceEditPart.VISUAL_ID;
			}
			return getUnrecognizedComponentContents_7002ChildNodeID(domainElement, semanticHint);
		case PackageEditPart.VISUAL_ID:
			if ((semanticHint == null || ComponentEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getComponent().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeComponent_2001((Component) domainElement))) {
				return ComponentEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Artifact2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getArtifact().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeArtifact_2002((Artifact) domainElement))) {
				return Artifact2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Interface2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInterface_2003((Interface) domainElement))) {
				return Interface2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Class2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeClass_2004((org.eclipse.uml2.uml.Class) domainElement))) {
				return Class2EditPart.VISUAL_ID;
			}
			return getUnrecognizedPackage_1000ChildNodeID(domainElement, semanticHint);
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getLinkWithClassVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement, EClass domainElementMetaclass) {
		if (UMLPackage.eINSTANCE.getInterfaceRealization().isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassInterfaceRealization_4001((InterfaceRealization) domainElement))) {
			return InterfaceRealizationEditPart.VISUAL_ID;
		} else {
			return getUnrecognizedLinkWithClassID(domainElement);
		}
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isDiagramPackage_1000(org.eclipse.uml2.uml.Package element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDiagramID(EObject domainElement) {
		return -1;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeComponent_2001(Component element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeArtifact_2002(Artifact element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeInterface_2003(Interface element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeClass_2004(org.eclipse.uml2.uml.Class element) {
		return Class_2004.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeComponent_3001(Component element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePort_3002(Port element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeArtifact_3003(Artifact element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeClass_3004(org.eclipse.uml2.uml.Class element) {
		return Class_3004.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeInterface_3005(Interface element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedComponent_2001ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedArtifact_2002ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedInterface_2003ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedClass_2004ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedComponent_3001ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPort_3002ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedArtifact_3003ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedClass_3004ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedInterface_3005ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedComponentContents_7001ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedComponentContents_7002ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPackage_1000ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedLinkWithClassID(EObject domainElement) {
		return -1;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassInterfaceRealization_4001(InterfaceRealization element) {
		return InterfaceRealization_4001.matches(element);
	}

	/**
	 * @generated
	 */
	private static final Matcher Class_3004 = new Matcher(UMLOCLFactory.getExpression("self.oclIsKindOf(uml::Class)", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getClass_()));

	/**
	 * @generated
	 */
	private static final Matcher Class_2004 = new Matcher(UMLOCLFactory.getExpression("self.oclIsKindOf(uml::Class)", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getClass_()));

	/**
	 * @generated
	 */
	private static final Matcher InterfaceRealization_4001 = new Matcher(UMLOCLFactory.getExpression("self.implementingClassifier.oclIsKindOf(uml::Component)", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getInterfaceRealization()));

	/**
	 * @generated	
	 */
	static class Matcher {

		/**
		 * @generated	
		 */
		private UMLAbstractExpression condition;

		/**
		 * @generated	
		 */
		Matcher(UMLAbstractExpression conditionExpression) {
			this.condition = conditionExpression;
		}

		/**
		 * @generated	
		 */
		boolean matches(EObject object) {
			Object result = condition.evaluate(object);
			return result instanceof Boolean && ((Boolean) result).booleanValue();
		}
	}// Matcher
}
