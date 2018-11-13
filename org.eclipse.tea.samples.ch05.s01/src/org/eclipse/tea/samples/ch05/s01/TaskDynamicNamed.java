package org.eclipse.tea.samples.ch05.s01;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.tea.core.services.TaskingLog;

public class TaskDynamicNamed {

	@Execute
	public void run(TaskingLog log) {
		log.info("Hello World");
	}
	
	@Override
	public String toString() {
		return "Named " + System.currentTimeMillis();
	}
	
}
