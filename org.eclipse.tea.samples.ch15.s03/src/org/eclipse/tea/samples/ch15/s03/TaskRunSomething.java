package org.eclipse.tea.samples.ch15.s03;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.tea.core.services.TaskingLog;
import org.eclipse.tea.library.build.model.WorkspaceData;
import org.eclipse.tea.library.build.p2.TargetPlatformHelper;

public class TaskRunSomething {

	@Execute
	public void run(TaskingLog log, WorkspaceData data) {
		TargetPlatformHelper.setTargetPlatform(log, "test.target", data.getProject("com.example.target").getProject(), true);
	}
	
}
