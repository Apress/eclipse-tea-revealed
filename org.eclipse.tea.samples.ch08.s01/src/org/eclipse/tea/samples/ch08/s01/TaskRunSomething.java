package org.eclipse.tea.samples.ch08.s01;

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

	private int work = 10;

	@Execute
	public void work(TaskingLog log, TaskProgressTracker tracker) throws Exception {

		for (int i = 0; i < work; ++i) {
			tracker.worked(1);
			log.info("worked");
			Thread.sleep(100);
		}

		log.info("done");
	}

	@TaskProgressProvider
	public int getAmount() {
		return work;
	}

}
