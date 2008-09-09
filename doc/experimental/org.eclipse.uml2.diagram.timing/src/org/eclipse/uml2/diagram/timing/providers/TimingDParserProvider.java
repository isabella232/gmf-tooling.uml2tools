package org.eclipse.uml2.diagram.timing.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.timing.edit.parts.DBlockDisplayNameEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DFrameDisplayNameEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DMessageDisplayNameEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DValueLineDisplayNameEditPart;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;
import org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry;

/**
 * @generated
 */

public class TimingDParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser dFrameDisplayName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getDFrameDisplayName_5003Parser() {
		if (dFrameDisplayName_5003Parser == null) {
			dFrameDisplayName_5003Parser = createDFrameDisplayName_5003Parser();
		}
		return dFrameDisplayName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDFrameDisplayName_5003Parser() {
		EAttribute[] features = new EAttribute[] { TimingDPackage.eINSTANCE.getDFrame_DisplayName() };
		Parser_0_0 parser = new Parser_0_0(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dBlockDisplayName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getDBlockDisplayName_5001Parser() {
		if (dBlockDisplayName_5001Parser == null) {
			dBlockDisplayName_5001Parser = createDBlockDisplayName_5001Parser();
		}
		return dBlockDisplayName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDBlockDisplayName_5001Parser() {
		EAttribute[] features = new EAttribute[] { TimingDPackage.eINSTANCE.getDBlock_DisplayName() };
		Parser_0_0 parser = new Parser_0_0(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dValueLineDisplayName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getDValueLineDisplayName_5002Parser() {
		if (dValueLineDisplayName_5002Parser == null) {
			dValueLineDisplayName_5002Parser = createDValueLineDisplayName_5002Parser();
		}
		return dValueLineDisplayName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDValueLineDisplayName_5002Parser() {
		EAttribute[] features = new EAttribute[] { TimingDPackage.eINSTANCE.getDValueLine_DisplayName() };
		Parser_0_0 parser = new Parser_0_0(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser dMessageDisplayName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getDMessageDisplayName_6001Parser() {
		if (dMessageDisplayName_6001Parser == null) {
			dMessageDisplayName_6001Parser = createDMessageDisplayName_6001Parser();
		}
		return dMessageDisplayName_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDMessageDisplayName_6001Parser() {
		EAttribute[] features = new EAttribute[] { TimingDPackage.eINSTANCE.getDMessage_DisplayName() };
		Parser_0_0 parser = new Parser_0_0(features);
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case DFrameDisplayNameEditPart.VISUAL_ID:
			return getDFrameDisplayName_5003Parser();
		case DBlockDisplayNameEditPart.VISUAL_ID:
			return getDBlockDisplayName_5001Parser();
		case DValueLineDisplayNameEditPart.VISUAL_ID:
			return getDValueLineDisplayName_5002Parser();
		case DMessageDisplayNameEditPart.VISUAL_ID:
			return getDMessageDisplayName_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(TimingDVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(TimingDVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (TimingDElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
