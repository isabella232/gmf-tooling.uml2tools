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

package org.eclipse.uml2.diagram.clazz.tests.parser;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

import junit.framework.TestCase;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

public class OperationInplaceApplierTest extends TestCase {
	
	/**
	 * Most probably the problem is in the SetValueCommand#canExecute, line 89
	 * Submitted as https://bugs.eclipse.org/bugs/show_bug.cgi?id=152080
	 * @throws ExecutionException 
	 * @see SetValueCommand
	 */
	public void testSetValueCommandForIsManyReference() throws Exception{
		//operation-parameters is used just as sample.
		//the inderlying problem is --generic--, it does not depends on such details
		final Operation target = UMLFactory.eINSTANCE.createOperation();
		EReference operationParameters = UMLPackage.eINSTANCE.getBehavioralFeature_OwnedParameter();
		target.createOwnedParameter("oldA", null);
		target.createOwnedParameter("oldB", null);
		
		TransactionalEditingDomain editingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();
		registerInDomain(editingDomain, target);
		
		Parameter a = UMLFactory.eINSTANCE.createParameter();
		a.setName("a");
		Parameter b = UMLFactory.eINSTANCE.createParameter();
		b.setName("b");
		
		SetRequest usingArraysAsList = new SetRequest(target, operationParameters, Arrays.asList(new Parameter[] {a, b})); 
		SetRequest usingNewListInstance = new SetRequest(target, operationParameters, new LinkedList(Arrays.asList(new Parameter[] {a, b})));
		
		Operation aux = UMLFactory.eINSTANCE.createOperation();
		aux.createOwnedParameter("a", null);
		aux.createOwnedParameter("b", null);
		SetRequest usingEListFromAuxOperation = new SetRequest(target, operationParameters, aux.getOwnedParameters());
		
		assertTrue(new SetValueCommand(usingArraysAsList).canExecute());
		assertTrue(new SetValueCommand(usingNewListInstance).canExecute());
		assertTrue(new SetValueCommand(usingEListFromAuxOperation).canExecute());
		
		CompositeTransactionalCommand command = new CompositeTransactionalCommand(editingDomain, "");
		for (Parameter nextActual : (Collection<Parameter>)target.getOwnedParameters()){
			DestroyReferenceCommand nextDelete = new DestroyReferenceCommand(new DestroyReferenceRequest(target, operationParameters, nextActual, false));
			command.add(nextDelete);
		}
		for (Parameter next : new Parameter[] {a, b}){
			SetRequest nextCreate = new SetRequest(target, operationParameters, next);
			command.add(new SetValueCommand(nextCreate));
		}
		
		assertTrue(command.canExecute());
		OperationHistoryFactory.getOperationHistory().execute(command, new NullProgressMonitor(), null);
		
		assertNull(target.getOwnedParameter("oldA", null));
		assertNull(target.getOwnedParameter("oldB", null));
		assertNotNull(target.getOwnedParameter("a", null));
		assertNotNull(target.getOwnedParameter("b", null));
		
	}
	
	private void registerInDomain(TransactionalEditingDomain domain, final EObject object) throws ExecutionException {
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(domain, "", null){
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				getEditingDomain().getResourceSet().createResource(URI.createURI("test-uri")).getContents().add(object);
				return CommandResult.newOKCommandResult();
			}
		};
		OperationHistoryFactory.getOperationHistory().execute(command, new NullProgressMonitor(), null);
	}

}
