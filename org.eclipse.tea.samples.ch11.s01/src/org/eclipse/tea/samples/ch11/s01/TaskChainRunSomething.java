package org.eclipse.tea.samples.ch11.s01;

import org.eclipse.tea.core.TaskExecutionContext;
import org.eclipse.tea.core.annotations.TaskChainContextInit;
import org.eclipse.tea.core.annotations.TaskChainMenuEntry;
import org.eclipse.tea.core.services.TaskChain;
import org.eclipse.tea.core.services.TaskChain.TaskChainId;
import org.osgi.service.component.annotations.Component;

@TaskChainId(description = "CH11-S01: E4 Events")
@TaskChainMenuEntry(path = "Samples")
@Component
public class TaskChainRunSomething implements TaskChain {

	@TaskChainContextInit
	public void init(TaskExecutionContext c) {
		c.addTask(TaskRunSomething.class);
	}
	
}
