package org.eclipse.tea.samples.ch05.s01;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.tea.core.services.TaskingLog;

@Named("Named Task")
public class TaskStaticNamed {

	@Execute
	public void run(TaskingLog log) {
		log.info("Hello World");
	}
	
}
