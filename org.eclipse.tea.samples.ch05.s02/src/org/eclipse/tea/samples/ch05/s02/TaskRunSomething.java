package org.eclipse.tea.samples.ch05.s02;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.tea.core.services.TaskingLog;

public class TaskRunSomething {

	@Execute
	public IStatus run(TaskingLog log) {
		return new Status(IStatus.WARNING, "org.eclipse.tea.demo", "Something smells fishy");
	}

}
