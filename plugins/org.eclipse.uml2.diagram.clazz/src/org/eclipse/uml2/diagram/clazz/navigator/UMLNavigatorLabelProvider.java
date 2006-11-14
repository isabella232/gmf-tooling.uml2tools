package org.eclipse.uml2.diagram.clazz.navigator;

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

import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClass2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataType2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataTypeEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataTypeNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Dependency2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyClientEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyName2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencySupplierEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Enumeration2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationLiteralEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecification2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecificationNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.LiteralStringEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation5EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.OperationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PortNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveType2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveTypeNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property5EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property6EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PropertyNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.SlotEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.UsageEditPart;

import org.eclipse.uml2.diagram.clazz.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;

import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;

import org.eclipse.uml2.uml.Generalization;
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
			case Package2EditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?Package", UMLElementTypes.Package_2002);
			case Class2EditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?Class", UMLElementTypes.Class_2001);
			case AssociationClass2EditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?AssociationClass", UMLElementTypes.AssociationClass_2007);
			case DataType2EditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?DataType", UMLElementTypes.DataType_2004);
			case PrimitiveType2EditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?PrimitiveType", UMLElementTypes.PrimitiveType_2005);
			case Enumeration2EditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?Enumeration", UMLElementTypes.Enumeration_2003);
			case InterfaceEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?Interface", UMLElementTypes.Interface_2010);
			case ConstraintEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?Constraint", UMLElementTypes.Constraint_2006);
			case InstanceSpecification2EditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?InstanceSpecification", UMLElementTypes.InstanceSpecification_2008);
			case DependencyEditPart.VISUAL_ID:
				return getImage("Navigator?TopLevelNode?http://www.eclipse.org/uml2/2.0.0/UML?Dependency", UMLElementTypes.Dependency_2009);
			case Package3EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Package", UMLElementTypes.Package_3006);
			case ClassEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Class", UMLElementTypes.Class_3007);
			case DataTypeEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?DataType", UMLElementTypes.DataType_3008);
			case PrimitiveTypeEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?PrimitiveType", UMLElementTypes.PrimitiveType_3009);
			case EnumerationEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Enumeration", UMLElementTypes.Enumeration_3011);
			case AssociationClassEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?AssociationClass", UMLElementTypes.AssociationClass_3012);
			case InstanceSpecificationEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?InstanceSpecification", UMLElementTypes.InstanceSpecification_3013);
			case PropertyEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Property", UMLElementTypes.Property_3001);
			case OperationEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Operation", UMLElementTypes.Operation_3002);
			case Class3EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Class", UMLElementTypes.Class_3003);
			case PortEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Port", UMLElementTypes.Port_3025);
			case Property2EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Property", UMLElementTypes.Property_3019);
			case Operation2EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Operation", UMLElementTypes.Operation_3020);
			case Property3EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Property", UMLElementTypes.Property_3014);
			case Operation3EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Operation", UMLElementTypes.Operation_3015);
			case Property4EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Property", UMLElementTypes.Property_3021);
			case Operation4EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Operation", UMLElementTypes.Operation_3022);
			case EnumerationLiteralEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?EnumerationLiteral", UMLElementTypes.EnumerationLiteral_3016);
			case Property5EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Property", UMLElementTypes.Property_3023);
			case Operation5EditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Operation", UMLElementTypes.Operation_3024);
			case LiteralStringEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?LiteralString", UMLElementTypes.LiteralString_3005);
			case SlotEditPart.VISUAL_ID:
				return getImage("Navigator?Node?http://www.eclipse.org/uml2/2.0.0/UML?Slot", UMLElementTypes.Slot_3017);
			case PackageEditPart.VISUAL_ID:
				return getImage("Navigator?Diagram?http://www.eclipse.org/uml2/2.0.0/UML?Package", UMLElementTypes.Package_1000);
			case GeneralizationEditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.0.0/UML?Generalization", UMLElementTypes.Generalization_4001);
			case Dependency2EditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.0.0/UML?Dependency", UMLElementTypes.Dependency_4002);
			case Property6EditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.0.0/UML?Property", UMLElementTypes.Property_4003);
			case ConstraintConstrainedElementEditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.0.0/UML?Constraint?constrainedElement", UMLElementTypes.ConstraintConstrainedElement_4004);
			case AssociationEditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.0.0/UML?Association", UMLElementTypes.Association_4005);
			case DependencySupplierEditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.0.0/UML?Dependency?supplier", UMLElementTypes.DependencySupplier_4006);
			case DependencyClientEditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.0.0/UML?Dependency?client", UMLElementTypes.DependencyClient_4007);
			case InterfaceRealizationEditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.0.0/UML?InterfaceRealization", UMLElementTypes.InterfaceRealization_4008);
			case UsageEditPart.VISUAL_ID:
				return getImage("Navigator?Link?http://www.eclipse.org/uml2/2.0.0/UML?Usage", UMLElementTypes.Usage_4009);
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
			case Package2EditPart.VISUAL_ID:
				return getPackage_2002Text(navigatorItem.getView());
			case Class2EditPart.VISUAL_ID:
				return getClass_2001Text(navigatorItem.getView());
			case AssociationClass2EditPart.VISUAL_ID:
				return getAssociationClass_2007Text(navigatorItem.getView());
			case DataType2EditPart.VISUAL_ID:
				return getDataType_2004Text(navigatorItem.getView());
			case PrimitiveType2EditPart.VISUAL_ID:
				return getPrimitiveType_2005Text(navigatorItem.getView());
			case Enumeration2EditPart.VISUAL_ID:
				return getEnumeration_2003Text(navigatorItem.getView());
			case InterfaceEditPart.VISUAL_ID:
				return getInterface_2010Text(navigatorItem.getView());
			case ConstraintEditPart.VISUAL_ID:
				return getConstraint_2006Text(navigatorItem.getView());
			case InstanceSpecification2EditPart.VISUAL_ID:
				return getInstanceSpecification_2008Text(navigatorItem.getView());
			case DependencyEditPart.VISUAL_ID:
				return getDependency_2009Text(navigatorItem.getView());
			case Package3EditPart.VISUAL_ID:
				return getPackage_3006Text(navigatorItem.getView());
			case ClassEditPart.VISUAL_ID:
				return getClass_3007Text(navigatorItem.getView());
			case DataTypeEditPart.VISUAL_ID:
				return getDataType_3008Text(navigatorItem.getView());
			case PrimitiveTypeEditPart.VISUAL_ID:
				return getPrimitiveType_3009Text(navigatorItem.getView());
			case EnumerationEditPart.VISUAL_ID:
				return getEnumeration_3011Text(navigatorItem.getView());
			case AssociationClassEditPart.VISUAL_ID:
				return getAssociationClass_3012Text(navigatorItem.getView());
			case InstanceSpecificationEditPart.VISUAL_ID:
				return getInstanceSpecification_3013Text(navigatorItem.getView());
			case PropertyEditPart.VISUAL_ID:
				return getProperty_3001Text(navigatorItem.getView());
			case OperationEditPart.VISUAL_ID:
				return getOperation_3002Text(navigatorItem.getView());
			case Class3EditPart.VISUAL_ID:
				return getClass_3003Text(navigatorItem.getView());
			case PortEditPart.VISUAL_ID:
				return getPort_3025Text(navigatorItem.getView());
			case Property2EditPart.VISUAL_ID:
				return getProperty_3019Text(navigatorItem.getView());
			case Operation2EditPart.VISUAL_ID:
				return getOperation_3020Text(navigatorItem.getView());
			case Property3EditPart.VISUAL_ID:
				return getProperty_3014Text(navigatorItem.getView());
			case Operation3EditPart.VISUAL_ID:
				return getOperation_3015Text(navigatorItem.getView());
			case Property4EditPart.VISUAL_ID:
				return getProperty_3021Text(navigatorItem.getView());
			case Operation4EditPart.VISUAL_ID:
				return getOperation_3022Text(navigatorItem.getView());
			case EnumerationLiteralEditPart.VISUAL_ID:
				return getEnumerationLiteral_3016Text(navigatorItem.getView());
			case Property5EditPart.VISUAL_ID:
				return getProperty_3023Text(navigatorItem.getView());
			case Operation5EditPart.VISUAL_ID:
				return getOperation_3024Text(navigatorItem.getView());
			case LiteralStringEditPart.VISUAL_ID:
				return getLiteralString_3005Text(navigatorItem.getView());
			case SlotEditPart.VISUAL_ID:
				return getSlot_3017Text(navigatorItem.getView());
			case PackageEditPart.VISUAL_ID:
				return getPackage_1000Text(navigatorItem.getView());
			case GeneralizationEditPart.VISUAL_ID:
				return getGeneralization_4001Text(navigatorItem.getView());
			case Dependency2EditPart.VISUAL_ID:
				return getDependency_4002Text(navigatorItem.getView());
			case Property6EditPart.VISUAL_ID:
				return getProperty_4003Text(navigatorItem.getView());
			case ConstraintConstrainedElementEditPart.VISUAL_ID:
				return getConstraintConstrainedElement_4004Text(navigatorItem.getView());
			case AssociationEditPart.VISUAL_ID:
				return getAssociation_4005Text(navigatorItem.getView());
			case DependencySupplierEditPart.VISUAL_ID:
				return getDependencySupplier_4006Text(navigatorItem.getView());
			case DependencyClientEditPart.VISUAL_ID:
				return getDependencyClient_4007Text(navigatorItem.getView());
			case InterfaceRealizationEditPart.VISUAL_ID:
				return getInterfaceRealization_4008Text(navigatorItem.getView());
			case UsageEditPart.VISUAL_ID:
				return getUsage_4009Text(navigatorItem.getView());
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
	private String getPackage_2002Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(PackageNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Package_2002;
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
	private String getClass_2001Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(ClassNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Class_2001;
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
	private String getAssociationClass_2007Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(AssociationClassNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.AssociationClass_2007;
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
	private String getDataType_2004Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(DataTypeNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.DataType_2004;
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
	private String getPrimitiveType_2005Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(PrimitiveTypeNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.PrimitiveType_2005;
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
	private String getEnumeration_2003Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(EnumerationNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Enumeration_2003;
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
	private String getInterface_2010Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(InterfaceNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Interface_2010;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getConstraint_2006Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(ConstraintNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Constraint_2006;
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
	private String getInstanceSpecification_2008Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(InstanceSpecificationNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.InstanceSpecification_2008;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getDependency_2009Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(DependencyNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Dependency_2009;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPackage_3006Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Package_3006;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3006);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getClass_3007Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Class_3007;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3007);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getDataType_3008Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.DataType_3008;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3008);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPrimitiveType_3009Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.PrimitiveType_3009;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3009);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEnumeration_3011Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Enumeration_3011;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3011);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getAssociationClass_3012Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.AssociationClass_3012;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3012);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getInstanceSpecification_3013Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(InstanceSpecificationEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.InstanceSpecification_3013;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3013);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3001Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Property_3001;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3001);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_3002Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(OperationEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Operation_3002;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3002);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getClass_3003Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Class_3003;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3003);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getPort_3025Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(PortNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Port_3025;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3019Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(Property2EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Property_3019;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3019);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_3020Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(Operation2EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Operation_3020;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3020);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3014Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(Property3EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Property_3014;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3014);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_3015Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(Operation3EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Operation_3015;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3015);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3021Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(Property4EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Property_3021;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3021);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_3022Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(Operation4EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Operation_3022;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3022);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getEnumerationLiteral_3016Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.EnumerationLiteral_3016;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3016);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_3023Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(Property5EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Property_3023;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3023);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_3024Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(Operation5EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Operation_3024;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3024);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getLiteralString_3005Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(LiteralStringEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.LiteralString_3005;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3005);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getSlot_3017Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(SlotEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Slot_3017;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 3017);
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
	private String getGeneralization_4001Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((Generalization) domainModelElement).isSubstitutable());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4001);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getDependency_4002Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(DependencyName2EditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Dependency_4002;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_4003Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(PropertyNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Property_4003;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getConstraintConstrainedElement_4004Text(View view) {
		return "";
	}

	/**
	 * @generated
	 */
	private String getAssociation_4005Text(View view) {
		IParser parser = ParserService.getInstance().getParser(new IAdaptable() {

			public Object getAdapter(Class adapter) {
				if (String.class.equals(adapter)) {
					return UMLVisualIDRegistry.getType(AssociationNameEditPart.VISUAL_ID);
				}
				if (IElementType.class.equals(adapter)) {
					return UMLElementTypes.Association_4005;
				}
				return null;
			}
		});
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getDependencySupplier_4006Text(View view) {
		return "";
	}

	/**
	 * @generated
	 */
	private String getDependencyClient_4007Text(View view) {
		return "";
	}

	/**
	 * @generated
	 */
	private String getInterfaceRealization_4008Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4008);
			return "";
		}
	}

	/**
	 * @generated
	 */
	private String getUsage_4009Text(View view) {
		EObject domainModelElement = view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(((NamedElement) domainModelElement).getName());
		} else {
			UMLDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4009);
			return "";
		}
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
