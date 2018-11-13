package org.eclipse.tea.samples.ch12.s01;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.IProject;
import org.eclipse.tea.library.build.chain.TeaBuildChain;
import org.eclipse.tea.library.build.chain.TeaBuildElement;
import org.eclipse.tea.library.build.services.TeaBuildElementFactory;
import org.osgi.service.component.annotations.Component;

@Component
public class S01ElementFactory implements TeaBuildElementFactory {

	@Override
	public Collection<TeaBuildElement> createElements(TeaBuildChain chain, IProject prj) {
		if (prj.getName().contains("gen")) {
			return Collections.singleton(new S01Element(prj));
		}
		return null;
	}

}
