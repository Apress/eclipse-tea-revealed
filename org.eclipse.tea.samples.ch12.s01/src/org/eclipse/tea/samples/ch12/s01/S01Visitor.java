package org.eclipse.tea.samples.ch12.s01;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.tea.core.services.TaskingLog;
import org.eclipse.tea.library.build.chain.TeaBuildElement;
import org.eclipse.tea.library.build.services.TeaBuildVisitor;
import org.osgi.service.component.annotations.Component;

@Component
public class S01Visitor implements TeaBuildVisitor {

	private TaskingLog log;

	@Execute
	public void prepare(TaskingLog log) {
		this.log = log;
	}

	@Override
	public Map<TeaBuildElement, IStatus> visit(List<TeaBuildElement> elements) {
		return visitEach(elements, S01Element.class, e -> {
			log.info("generating in " + e.getProject());
			e.runGenerator(log);
			return Status.OK_STATUS;
		});
	}

}
