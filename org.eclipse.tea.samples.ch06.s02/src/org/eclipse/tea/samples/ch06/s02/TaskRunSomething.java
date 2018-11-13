package org.eclipse.tea.samples.ch06.s02;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.tea.core.services.TaskingLog;

public class TaskRunSomething {
	
	@Execute
	public void run(TaskingLog log) {
		log.info("Hello World");
	}

}
