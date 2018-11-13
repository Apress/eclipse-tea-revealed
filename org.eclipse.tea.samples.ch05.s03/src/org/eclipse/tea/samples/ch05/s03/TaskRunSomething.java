package org.eclipse.tea.samples.ch05.s03;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.tea.core.annotations.TaskCaptureStdOutput;

@TaskCaptureStdOutput
public class TaskRunSomething {
	
	private void someExternalStuff() {
		System.err.println("Something hidden");
	}
	
	@Execute
	public void callExternal() {
		someExternalStuff();
	}

}
