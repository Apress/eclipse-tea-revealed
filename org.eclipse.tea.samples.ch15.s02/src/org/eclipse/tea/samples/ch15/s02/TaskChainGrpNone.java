package org.eclipse.tea.samples.ch15.s02;

import org.eclipse.tea.core.TaskExecutionContext;
import org.eclipse.tea.core.annotations.TaskChainContextInit;
import org.eclipse.tea.core.annotations.TaskChainMenuEntry;
import org.eclipse.tea.core.services.TaskChain;
import org.eclipse.tea.core.services.TaskChain.TaskChainId;
import org.osgi.service.component.annotations.Component;

@TaskChainId(description = "CH15-S02: Group None")
@TaskChainMenuEntry(path = { "Samples", "Grouping" })
@Component
public class TaskChainGrpNone implements TaskChain {

	@TaskChainContextInit
	public void init(TaskExecutionContext c) {
		c.addTask(TaskRunSomething.class);
	}
	
}
