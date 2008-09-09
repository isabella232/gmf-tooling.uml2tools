package org.eclipse.uml2.diagram.timing.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.eclipse.uml2.diagram.timing.edit.parts.DBlockDisplayNameEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DBlockEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DFrameContainerEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DFrameDisplayNameEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DFrameEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DMessageDisplayNameEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DMessageEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEndEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentMiddlePointEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentStartEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DStateSwitchEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DValueLineDisplayNameEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DValueLineEditPart;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrame;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentEnd;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentMiddlePoint;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart;
import org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch;
import org.eclipse.uml2.diagram.timing.part.TimingDDiagramEditorPlugin;
import org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;
import org.eclipse.uml2.diagram.timing.providers.TimingDParserProvider;

/**
 * @generated
 */

public class TimingDNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		TimingDDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		TimingDDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof TimingDNavigatorItem && !isOwnView(((TimingDNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof TimingDNavigatorGroup) {
			TimingDNavigatorGroup group = (TimingDNavigatorGroup) element;
			return TimingDDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof TimingDNavigatorItem) {
			TimingDNavigatorItem navigatorItem = (TimingDNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (TimingDVisualIDRegistry.getVisualID(view)) {
		case DFrameContainerEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.eclipse.org/mdt/uml2tools/timing-diagram/1.0?DFrameContainer", TimingDElementTypes.DFrameContainer_1000); //$NON-NLS-1$
		case DFrameEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.eclipse.org/mdt/uml2tools/timing-diagram/1.0?DFrame", TimingDElementTypes.DFrame_2001); //$NON-NLS-1$
		case DBlockEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/mdt/uml2tools/timing-diagram/1.0?DBlock", TimingDElementTypes.DBlock_3001); //$NON-NLS-1$
		case DValueLineEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/mdt/uml2tools/timing-diagram/1.0?DValueLine", TimingDElementTypes.DValueLine_3002); //$NON-NLS-1$
		case DSegmentEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/mdt/uml2tools/timing-diagram/1.0?DSegment", TimingDElementTypes.DSegment_3003); //$NON-NLS-1$
		case DSegmentMiddlePointEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/mdt/uml2tools/timing-diagram/1.0?DSegmentMiddlePoint", TimingDElementTypes.DSegmentMiddlePoint_3004); //$NON-NLS-1$
		case DSegmentStartEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/mdt/uml2tools/timing-diagram/1.0?DSegmentStart", TimingDElementTypes.DSegmentStart_3005); //$NON-NLS-1$
		case DSegmentEndEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.eclipse.org/mdt/uml2tools/timing-diagram/1.0?DSegmentEnd", TimingDElementTypes.DSegmentEnd_3006); //$NON-NLS-1$
		case DStateSwitchEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.eclipse.org/mdt/uml2tools/timing-diagram/1.0?DStateSwitch", TimingDElementTypes.DStateSwitch_4001); //$NON-NLS-1$
		case DMessageEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.eclipse.org/mdt/uml2tools/timing-diagram/1.0?DMessage", TimingDElementTypes.DMessage_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = TimingDDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && TimingDElementTypes.isKnownElementType(elementType)) {
			image = TimingDElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof TimingDNavigatorGroup) {
			TimingDNavigatorGroup group = (TimingDNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof TimingDNavigatorItem) {
			TimingDNavigatorItem navigatorItem = (TimingDNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (TimingDVisualIDRegistry.getVisualID(view)) {
		case DFrameContainerEditPart.VISUAL_ID:
			return getDFrameContainer_1000Text(view);
		case DFrameEditPart.VISUAL_ID:
			return getDFrame_2001Text(view);
		case DBlockEditPart.VISUAL_ID:
			return getDBlock_3001Text(view);
		case DValueLineEditPart.VISUAL_ID:
			return getDValueLine_3002Text(view);
		case DSegmentEditPart.VISUAL_ID:
			return getDSegment_3003Text(view);
		case DSegmentMiddlePointEditPart.VISUAL_ID:
			return getDSegmentMiddlePoint_3004Text(view);
		case DSegmentStartEditPart.VISUAL_ID:
			return getDSegmentStart_3005Text(view);
		case DSegmentEndEditPart.VISUAL_ID:
			return getDSegmentEnd_3006Text(view);
		case DStateSwitchEditPart.VISUAL_ID:
			return getDStateSwitch_4001Text(view);
		case DMessageEditPart.VISUAL_ID:
			return getDMessage_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDFrameContainer_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDFrame_2001Text(View view) {
		IParser parser = TimingDParserProvider.getParser(TimingDElementTypes.DFrame_2001, view.getElement() != null ? view.getElement() : view, TimingDVisualIDRegistry
				.getType(DFrameDisplayNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			TimingDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDBlock_3001Text(View view) {
		IParser parser = TimingDParserProvider.getParser(TimingDElementTypes.DBlock_3001, view.getElement() != null ? view.getElement() : view, TimingDVisualIDRegistry
				.getType(DBlockDisplayNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			TimingDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDValueLine_3002Text(View view) {
		IParser parser = TimingDParserProvider.getParser(TimingDElementTypes.DValueLine_3002, view.getElement() != null ? view.getElement() : view, TimingDVisualIDRegistry
				.getType(DValueLineDisplayNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			TimingDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDSegment_3003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDSegmentMiddlePoint_3004Text(View view) {
		DSegmentMiddlePoint domainModelElement = (DSegmentMiddlePoint) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDebugId();
		} else {
			TimingDDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDSegmentStart_3005Text(View view) {
		DSegmentStart domainModelElement = (DSegmentStart) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDebugId();
		} else {
			TimingDDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDSegmentEnd_3006Text(View view) {
		DSegmentEnd domainModelElement = (DSegmentEnd) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDebugId();
		} else {
			TimingDDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDStateSwitch_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDMessage_4002Text(View view) {
		IParser parser = TimingDParserProvider.getParser(TimingDElementTypes.DMessage_4002, view.getElement() != null ? view.getElement() : view, TimingDVisualIDRegistry
				.getType(DMessageDisplayNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view), ParserOptions.NONE.intValue());
		} else {
			TimingDDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
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

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DFrameContainerEditPart.MODEL_ID.equals(TimingDVisualIDRegistry.getModelID(view));
	}

}
