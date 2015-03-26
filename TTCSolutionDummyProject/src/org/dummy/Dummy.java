package org.dummy;

import java.io.File;

import javax.swing.JOptionPane;

import ttc.testdsl.tTCTest.Create_Superclass_Refactoring;
import ttc.testdsl.tTCTest.Pull_Up_Refactoring;
import ttc.testsuite.interfaces.TestInterface;

public class Dummy implements TestInterface {
	
	@Override
	public boolean createProgramGraph(String arg0) {
		// TODO Auto-generated method stub
		return getBool("Has the typegraph successful been created?"); //$NON-NLS-1$
	}

	@Override
	public String getPluginName() {
		// TODO Auto-generated method stub
		return "DUMMY"; //$NON-NLS-1$
	}

	@Override
	public void setLogPath(File arg0) {
		// TODO Auto-generated method stub
		System.out.println("I've got the file: "+arg0);
	}

	@Override
	public void setPermanentStoragePath(File arg0) {
		// TODO Auto-generated method stub
		System.out.println("I've got the file: "+arg0);
	}

	@Override
	public boolean synchronizeChanges() {
		// TODO Auto-generated method stub
		return getBool("Was the synchronization of the changes successful?"); //$NON-NLS-1$
	}

	@Override
	public boolean applyCreateSuperclass(Create_Superclass_Refactoring arg0) {
		
		return getBool("Was extract super class successful?"); //$NON-NLS-1$
	}

	@Override
	public boolean applyPullUpMethod(Pull_Up_Refactoring arg0) {
		return getBool("Was pull-up method successful?"); //$NON-NLS-1$
	}

	boolean getBool(String text){
		switch(JOptionPane.showInputDialog(text+"\n\nEnter \"true\" or \"false\"")){ //$NON-NLS-1$
		case "true": return true; //$NON-NLS-1$
		case "false" : return false; //$NON-NLS-1$
		default: return getBool("Wrong input. Retry:\n\n"+text); //$NON-NLS-1$
		}
		
	}

	@Override
	public void setTmpPath(File arg0) {
		// TODO Auto-generated method stub
		System.out.println("I've got the file: "+arg0);
	}
}
