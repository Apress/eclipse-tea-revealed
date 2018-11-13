package org.eclipse.tea.samples.ch06.s03;

import org.eclipse.tea.core.services.TaskingHeadlessLifeCycle;
import org.eclipse.tea.core.services.TaskingLog;
import org.osgi.service.component.annotations.Component;

@Component
public class TestHeadlessLifecycle implements TaskingHeadlessLifeCycle {

	@HeadlessStartup
	public StartupAction start(TaskingLog log) {
		log.debug("Startup...");
		
		if(Boolean.getBoolean("restart")) {
			log.debug("Restarting...");
			return StartupAction.RESTART;
		}
		
		return StartupAction.CONTINUE;
	}

	@HeadlessShutdown
	public void stop(TaskingLog log) throws Exception {
		log.debug("Shutdown...");
	}

}
