package org.eclipse.tea.samples.ch14.s02;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.tea.core.services.TaskingLog;

import com.wamas.ide.launching.lcDsl.LaunchConfig;
import com.wamas.ide.launching.ui.LcDslHelper;

public class TaskRunSomething {

	@Execute
	public void run(TaskingLog log) {
		LaunchConfig lc = LcDslHelper.getInstance().findLaunchConfig("mylaunch");
		LcDslHelper.getInstance().launch(lc, LcDslHelper.MODE_DEBUG);
	}
	
}
