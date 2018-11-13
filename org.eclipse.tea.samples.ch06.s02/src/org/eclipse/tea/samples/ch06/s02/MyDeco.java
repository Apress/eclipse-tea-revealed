package org.eclipse.tea.samples.ch06.s02;

import org.eclipse.tea.core.services.TaskingMenuDecoration;
import org.osgi.service.component.annotations.Component;

// TODO: Uncomment the following line and restart the runtime application.
//@Component
public class MyDeco implements TaskingMenuDecoration {
	
	@TaskingMenuPathDecoration(menuPath = { "Samples", "CH06-Nested" })
	public static final String SAMPLE_ICON = "resources/sample.png";
	
}
