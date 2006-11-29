/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland) - initial API and implementation
 */

package org.eclipse.uml2.diagram.clazz.tests.lookup;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

public class Fixture {
	private static final UMLFactory UMLFactory = org.eclipse.uml2.uml.UMLFactory.eINSTANCE; 
	private static final UMLPackage UMLPackage = org.eclipse.uml2.uml.UMLPackage.eINSTANCE;
	
	private Model myModel;
	private org.eclipse.uml2.uml.Package myPackageA;
	private org.eclipse.uml2.uml.Package myPackageB;
	private Class myClassA;
	private Class myClassB;
	private Enumeration myEnumA; 
	private PrimitiveType myPrimitiveTypeA;
	private DataType myDataTypeA;
	
	private Class myTesterA;
	
	public Fixture(){
		myModel = UMLFactory.createModel();
		myPackageA = (org.eclipse.uml2.uml.Package) myModel.createPackagedElement("a", UMLPackage.getPackage());
		myPackageB = (org.eclipse.uml2.uml.Package) myModel.createPackagedElement("b", UMLPackage.getPackage());
		
		myClassA = myPackageA.createOwnedClass("A", false);
		myEnumA = (Enumeration) myPackageA.createOwnedType("EnumA", UMLPackage.getEnumeration());
		myDataTypeA = (DataType)myPackageA.createOwnedType("DataTypeA", UMLPackage.getDataType());
		myPrimitiveTypeA = myPackageA.createOwnedPrimitiveType("PrimitiveA");
		
		myTesterA = myPackageA.createOwnedClass("Tester", false);
		
		myClassB = myPackageB.createOwnedClass("B", false);
	}
	
	public Class getClassA() {
		return myClassA;
	}
	
	public Class getClassB() {
		return myClassB;
	}
	
	public Enumeration getEnumA() {
		return myEnumA;
	}
	
	public PrimitiveType getPrimitiveTypeA() {
		return myPrimitiveTypeA;
	}
	
	public DataType getDataTypeA(){
		return myDataTypeA;
	}
	
	public org.eclipse.uml2.uml.Package getPackageA() {
		return myPackageA;
	}
	
	public org.eclipse.uml2.uml.Package getPackageB() {
		return myPackageB;
	}
	
	public Class getTesterA() {
		return myTesterA;
	}
}