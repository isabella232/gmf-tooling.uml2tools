package org.eclipse.uml2.diagram.common.genapi;

import java.util.List;

public interface IVisualIDRegistryExt extends IVisualIDRegistry {

	/**
	 * Returns collection of pairs of message and view type for all
	 * substitutable types for the given type
	 */
	public List<MenuTypeHint> getMenuTypeHints(String type);

	/**
	 * Returns collection of types that have substitutable types other than
	 * themselves
	 */
	public List<String> getAllHintedTypes();

	public static class MenuTypeHint {

		private final String myMessage;

		private final String myType;

		public MenuTypeHint(String message, String type) {
			myMessage = message;
			myType = type;
		}

		public String getMessage() {
			return myMessage;
		}

		public String getType() {
			return myType;
		}
	}
}