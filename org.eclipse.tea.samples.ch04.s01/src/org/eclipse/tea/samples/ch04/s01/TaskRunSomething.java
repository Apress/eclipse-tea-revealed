package org.eclipse.tea.samples.ch04.s01;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.tea.core.services.TaskingLog;

public class TaskRunSomething {

	@Execute
	public void run(TaskingLog log) {
		log.info("Hello World");
		log.error("Something happened", new RuntimeException("Oops"));
		
		log.warn().println("Direct stream access");
		log.warn().println("No formatting and tagging!");
	}
	
}
