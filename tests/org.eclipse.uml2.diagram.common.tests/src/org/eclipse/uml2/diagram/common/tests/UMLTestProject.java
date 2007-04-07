package org.eclipse.uml2.diagram.common.tests;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;


public class UMLTestProject {
	private IProject myProject;
	
	public UMLTestProject() throws CoreException {
		this("TestProject");
	}
	public IFile getFile(String name) {
		return myProject.getFile(name);
	}
	public IFile createEmptyFile(String name) throws CoreException {
		IFile file = getFile(name);
		file.create(new InputStream() {
			@Override
			public int read() throws IOException {
				return -1;
			}
		}, true, null);
		return file;
	}
	public UMLTestProject(String name) throws CoreException {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot wsroot = workspace.getRoot();

		myProject = wsroot.getProject(name);

		IProjectDescription desc = workspace.newProjectDescription(myProject.getName());

		if (!myProject.exists()) {
			myProject.create(desc, null);
		}

		if (!myProject.isOpen()) {
			myProject.open(null);
		}
	}
	
	public void close() throws CoreException {
		try {
			myProject.delete(true, true, null);
		} finally {
			myProject = null;
		}
	}
	public String getFullPath() {
		return myProject.getFullPath().toString();
		
	}
	
}
