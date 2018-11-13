package org.eclipse.tea.samples.ch12.s01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.tea.core.services.TaskingLog;
import org.eclipse.tea.library.build.chain.TeaBuildProjectElement;

public class S01Element extends TeaBuildProjectElement {

	public static final String S01_NAME = "generate time for ";

	public S01Element(IProject prj) {
		super(prj);
	}

	@Override
	public String getName() {
		return S01_NAME + getProject().getName();
	}

	public void runGenerator(TaskingLog log) {
		File p = getProject().getLocation().toFile();
		try (PrintStream ps = new PrintStream(
				new FileOutputStream(new File(p, "out.txt")))) {
			ps.println("current time: " + System.currentTimeMillis());
			getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch(Exception e) {
			log.error("oups", e);
		}
	}

}
