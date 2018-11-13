package org.eclipse.tea.samples.ch08.s04;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.core.di.annotations.Execute;

public class TaskRunSomething {

	@Execute
	public IStatus withStatus() throws Exception {
		MultiStatus ms = new MultiStatus("org.eclipse.tea.samples.s08.s04", 0, "OK", null);

		ms.add(new Status(IStatus.WARNING, "org.eclipse.tea.samples.s08.s04", "First warning"));
		ms.add(new Status(IStatus.WARNING, "org.eclipse.tea.samples.s08.s04", "Second warning"));

		return ms;
	}

}
