package org.eclipse.tea.samples.ch05.s02;

import org.eclipse.tea.core.TaskExecutionContext;
import org.eclipse.tea.core.annotations.TaskChainContextInit;
import org.eclipse.tea.core.annotations.TaskChainMenuEntry;
import org.eclipse.tea.core.services.TaskChain;
import org.eclipse.tea.core.services.TaskChain.TaskChainId;
import org.osgi.service.component.annotations.Component;

@TaskChainId(description = "CH05-S02: Status")
@TaskChainMenuEntry(path = "Samples")
@Component
public class TaskChainRunSomething implements TaskChain {

	@TaskChainContextInit
	public void init(TaskExecutionContext c) {
		c.addTask(TaskRunSomething.class);
	}
	
}
