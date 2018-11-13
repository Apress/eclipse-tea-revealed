package org.eclipse.tea.samples.ch08.s02;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.tea.core.services.TaskProgressTracker;
import org.eclipse.tea.core.services.TaskProgressTracker.TaskProgressProvider;
import org.eclipse.tea.core.services.TaskingLog;

public class TaskRunSomething {

	@Execute
	public void cancelable(TaskingLog log, TaskProgressTracker tracker) throws Exception {
		Thread.sleep(5000);

		if (tracker.isCanceled())
			throw new OperationCanceledException();

		log.info("Not canceled!");
	}

}
