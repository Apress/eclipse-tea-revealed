package org.eclipse.tea.samples.ch15.s01;

import javax.inject.Named;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.equinox.internal.app.EclipseScheduledApplication;
import org.eclipse.tea.core.services.TaskingLog;
import org.eclipse.tea.core.ui.internal.context.E4WorkbenchContextFunction;
import com.wamas.ide.launching.LcDslLaunchConfigBuilder;
import com.wamas.ide.launching.lcDsl.LaunchConfig;
import com.wamas.ide.launching.lcDsl.LaunchConfigType;
import com.wamas.ide.launching.ui.LcDslHelper;

public class TaskRunSomething {

	@Execute
	public void run(TaskingLog log, @Named(E4WorkbenchContextFunction.E4_CONTEXT_ID) IEclipseContext ctx) {
		ESelectionService selSvc = ctx.getActive(ESelectionService.class);
		log.info("Current selection: " + selSvc.getSelection());
	}
	
}
