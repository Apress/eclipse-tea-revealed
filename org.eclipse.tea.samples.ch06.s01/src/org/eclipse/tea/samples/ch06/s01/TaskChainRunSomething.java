package org.eclipse.tea.samples.ch06.s01;

import org.eclipse.tea.core.TaskExecutionContext;
import org.eclipse.tea.core.TaskingInjectionHelper;
import org.eclipse.tea.core.annotations.TaskChainContextInit;
import org.eclipse.tea.core.annotations.TaskChainMenuEntry;
import org.eclipse.tea.core.services.TaskChain;
import org.eclipse.tea.core.services.TaskChain.TaskChainId;
import org.osgi.service.component.annotations.Component;

@TaskChainId(description = "CH06-S01: Adapt to Headless", alias="CH06DetectHeadless")
@TaskChainMenuEntry(path = "Samples")
@Component
public class TaskChainRunSomething implements TaskChain {

	@TaskChainContextInit
	public void init(TaskExecutionContext c) {
		if(TaskingInjectionHelper.isHeadless(c.getContext())) {
			c.addTask(TaskRunHeadless.class);
		} else {
			c.addTask(TaskRunIDE.class);
		}
	}
	
}
