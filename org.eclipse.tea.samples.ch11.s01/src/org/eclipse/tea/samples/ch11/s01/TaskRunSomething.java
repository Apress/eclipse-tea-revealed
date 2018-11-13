package org.eclipse.tea.samples.ch11.s01;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.tea.core.services.TaskingLog;

public class TaskRunSomething {

	@Execute
	public void run(TaskingLog log) {
		log.info("Hello World");
	}

}
