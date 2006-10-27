package org.eclipse.uml2.diagram.component.navigator;

import org.eclipse.core.runtime.IAdaptable;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;

import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;

import org.eclipse.jface.viewers.LabelProvider;

import org.eclipse.swt.graphics.Image;

import org.eclipse.ui.IMemento;

import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import org.eclipse.uml2.diagram.component.edit.parts.Artifact2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Component2EditPart;
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
import org.eclipse.uml2.diagram.component.edit.parts.PortProvidedEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortRequiredEditPart;
import org.eclipse.uml2.diagram.component.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.diagram.component.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.component.providers.UMLElementTypes;
import org.eclipse.uml2.uml.NamedElement;

/**
 * @generated
 */
public class UMLNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider {

	/**
	 * @generated
	 */
	static {
		UMLDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?InvalidElement", ImageDescriptor.getMissingImageDescriptor());
		UMLDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor());
		UMLDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (false == element instanceof UMLAbstractNavigatorItem) {
			return super.getImage(element);
		}

		UMLAbstractNavigatorItem abstractNavigatorItem = (UMLAbstractNavigatorItem) element;
		if (!PackageEditPart.MODEL_ID.equals(abstractNavigatorItem.getModelID())) {
			return super.getImage(element);
		}

		if (abstractNavigatorItem instanceof UMLNavigatorItem) {
			UMLNavigatorItem navigatorItem = (UMLNavigatorItem) abstractNavigatorItem;
			switch (navigatorItem.getVisualID()) {
			case ComponentEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?Component", UMLElementTypes.Component_2001);
			case Artifact2EditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?Artifact", UMLElementTypes.Artifact_2002);
			case Interface2EditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?Interface", UMLElementTypes.Interface_2003);
			case Class2EditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?Class", UMLElementTypes.Class_2004);
			case Component2EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Component", UMLElementTypes.Component_3001);
			case PortEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Port", UMLElementTypes.Port_3002);
			case ArtifactEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Artifact", UMLElementTypes.Artifact_3003);
			case ClassEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Class", UMLElementTypes.Class_3004);
			case InterfaceEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Interface", UMLElementTypes.Interface_3005);
			case PackageEditPart.VISUAL_ID:
				return getImage("Navigator?Diagram?http://www.eclipse.org/uml2/2.0.0/UML?Package", UMLElementTypes.Package_1000);
			case InterfaceRealizationEditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.0.0/UML?InterfaceRealization", UMLElementTypes.InterfaceRealization_4001);
			case PortProvidedEditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.0.0/UML?Port?provided", UMLElementTypes.PortProvided_4006);
			case PortRequiredEditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.0.0/UML?Port?required", UMLElementTypes.PortRequired_4004);
			default:
				return getImage("Navigator?UnknownElement", null);
			}
		} else if (abstractNavigatorItem instanceof UMLNavigatorGroup) {
			UMLNavigatorGroup group = (UMLNavigatorGroup) element;
			return UMLDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}
		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = UMLDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && UMLElementTypes.isKnownElementType(elementType)) {
			image = UMLElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound");
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (false == element instanceof UMLAbstractNavigatorItem) {
			return super.getText(element);
		}

		UMLAbstractNavigatorItem abstractNavigatorItem = (UMLAbstractNavigatorItem) element;
		if (!PackageEditPart.MODEL_ID.equals(abstractNavigatorItem.getModelID())) {
			return super.getText(element);
		}

		if (abstractNavigatorItem instanceof UMLNavigatorItem) {
			UMLNavigatorItem navigatorItem = (UMLNavigatorItem) abstractNavigatorItem;
			switch (navigatorItem.getVisualID()) {
			case ComponentEditPart.VISUAL_ID:
				return getComponent_2001Text(navigatorItem.getView());
			case Artifact2EditPart.VISUAL_ID:
				return getArtifact_2002Text(navigatorItem.getView());
			case Interface2EditPart.VISUAL_ID:
				return getInterface_2003Text(navigatorItem.getView());
			case Class2EditPart.VISUAL_ID:
				return getClass_2004Text(navigatorItem.getView());
			case Component2EditPart.VISUAL_ID:
				return getComponent_3001Text(navigatorItem.getView());
			case PortEditPart.VISUAL_ID:
				return getPort_3002Text(navigatorItem.getView());
			case ArtifactEditPart.VISUAL_ID:
				return getArtifact_3003Text(navigatorItem.getView());
			case ClassEditPart.VISUAL_ID:
				return getClass_3004Text(navigatorItem.getView());
			case InterfaceEditPart.VISUAL_ID:
				return getInterface_3005Text(navigatorItem.getView());
			case PackageEditPart.VISUAL_ID:
				return getPackage_1000Text(navigatorItem.getView());
			case InterfaceRealizationEditPart.VISUAL_ID:
				return getInterfaceRealization_4001Text(navigatorItem.getView());
			case PortProvidedEditPart.VISUAL_ID:
				return getPortProvided_4006Text(navigatorItem.getView());
			case PortRequiredEditPart.VISUAL_ID:
				return getPortRequired_4004Text(navigatorItem.getView());
			default:
				return getUnknownElementText(navigatorItem.getView());
			}
		} else if (abstractNavigatorItem instanceof UMLNavigatorGroup) {
			UMLNavigatorGroup group = (UMLNavigatorGroup) element;
			return group.getGroupName();
		}
		return super.getText(element);
	}

	/**
	 * @generated
	 */
	private String getComponent_2001Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(ComponentName2EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Component_2001;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getArtifact_2002Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(ArtifactName2EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Artifact_2002;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getInterface_2003Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(InterfaceName2EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Interface_2003;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getClass_2004Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(ClassName2EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Class_2004;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getComponent_3001Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(ComponentNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Component_3001;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPort_3002Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(PortNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Port_3002;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getArtifact_3003Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(ArtifactNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Artifact_3003;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getClass_3004Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(ClassNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Class_3004;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getInterface_3005Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(InterfaceNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Interface_3005;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPackage_1000Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getInterfaceRealization_4001Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4001);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPortProvided_4006Text(View view) {
		return "";
	}

	/**
	 * @generated
	 */
	private String getPortRequired_4004Text(View view) {
		return "";
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">";
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

}
