/*
 * Copyright (c) 2008 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tatiana Fesenko (Borland) - initial API and implementation
 */
package org.eclipse.uml2.diagram.common.codeassist;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Class determines in which part of operation string the cursor is.
 * Operation is presented in the following format:
 *  [<visibility>] <name> ‘(‘ [<parameter-list>] ‘)’ [‘:’ [<return-type>] [‘{‘ <oper-property> [‘,’ <oper-property>]* ‘}’]]
 *  
 */
public class OperationAnalizer {
	
	private static final Pattern OPERATION_TYPE = Pattern.compile("\\:\\s*(\\w*)\\z");
	private static final Pattern OPERATION_PROPERTY = Pattern.compile("\\{(?:[\\w\\s]+,)*\\s*(\\w*)\\z");
	private static final Pattern PARAMETER_DIRECTION = Pattern.compile("\\(([^\\)]+,)*\\s*(\\w*)\\z"); 
	
/*
 * Returns true if cursor is at return type or parameter type 
 */
	public static boolean isInType(String prefix) {
		return OPERATION_TYPE.matcher(prefix).find();
	}

	public static boolean isInDirection(String prefix) {
		return PARAMETER_DIRECTION.matcher(prefix).find();
	}

	public static boolean isInOperationProperty(String prefix) {
		return OPERATION_PROPERTY.matcher(prefix).find();
	}
	
	public static String getTypePrefix(String str) {
		Matcher m = OPERATION_TYPE.matcher(str);
		m.find();
		return m.group(1);
	}

	public static String getOperationPropertyPrefix(String str) {
		Matcher m = OPERATION_PROPERTY.matcher(str);
		m.find();
		return m.group(1);
	}

	public static String getParameterDirectionPrefix(String str) {
		Matcher m = PARAMETER_DIRECTION.matcher(str);
		m.find();
		return m.group(2);
	}
}
