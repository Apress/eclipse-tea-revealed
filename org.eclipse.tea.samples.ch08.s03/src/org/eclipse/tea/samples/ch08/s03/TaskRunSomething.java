package org.eclipse.tea.samples.ch08.s03;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;

public class TaskRunSomething {

	@Execute
	public void withStatus(IEclipseContext ctx) throws Exception {
		ctx.set(IStatus.class, new Status(
				IStatus.WARNING,
				"org.eclipse.tea.samples.ch08.s03",
				"Some warning"));
	}

}
