package org.eclipse.tea.samples.ch13.s01;

import org.eclipse.tea.core.TaskExecutionContext;
import org.eclipse.tea.core.annotations.TaskChainContextInit;
import org.eclipse.tea.core.annotations.TaskChainMenuEntry;
import org.eclipse.tea.core.services.TaskChain;
import org.eclipse.tea.core.services.TaskChain.TaskChainId;
import org.eclipse.tea.ease.EaseScriptTask;
import org.osgi.service.component.annotations.Component;

@TaskChainId(description = "CH13-S01: Run EASE sample.py")
@TaskChainMenuEntry(path = "Samples")
@Component
public class EaseTaskChain implements TaskChain {

	@TaskChainContextInit
	public void init(TaskExecutionContext c) {
		c.addTask(new EaseScriptTask("/sample.py"));
	}
	
}
