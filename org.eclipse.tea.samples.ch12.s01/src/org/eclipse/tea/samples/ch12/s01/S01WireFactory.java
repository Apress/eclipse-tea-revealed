package org.eclipse.tea.samples.ch12.s01;

import org.eclipse.tea.library.build.chain.TeaBuildChain;
import org.eclipse.tea.library.build.chain.TeaBuildElement;
import org.eclipse.tea.library.build.chain.TeaBuildProjectElement;
import org.eclipse.tea.library.build.services.TeaDependencyWireFactory;
import org.osgi.service.component.annotations.Component;

@Component
public class S01WireFactory implements TeaDependencyWireFactory {

	@Override
	public void createWires(TeaBuildChain chain) {
		for(TeaBuildElement e : chain.getAllElements()) {
			if(e instanceof TeaBuildProjectElement && !(e instanceof S01Element)) {
				wireUp(chain, (TeaBuildProjectElement) e);
			}
		}
	}

	private void wireUp(TeaBuildChain chain, TeaBuildProjectElement pe) {
		// any project with 'gen' in its name depends on its generator.
		if(pe.getProject().getName().contains("gen")) {
			S01Element generator = (S01Element) chain.getElementFor(S01Element.S01_NAME + pe.getProject().getName());
			pe.addDependencyWire(generator.createWire());
		}
	}

}
