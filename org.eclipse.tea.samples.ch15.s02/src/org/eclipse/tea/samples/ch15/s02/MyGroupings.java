package org.eclipse.tea.samples.ch15.s02;

import org.eclipse.tea.core.services.TaskingMenuDecoration;
import org.osgi.service.component.annotations.Component;

@Component
public class MyGroupings implements TaskingMenuDecoration {

	@TaskingMenuGroupingId(beforeGroupingId = NO_GROUPING, menuPath = { "Samples", "Grouping" })
	public static final String GID_A = "my.A";

	@TaskingMenuGroupingId(afterGroupingId = GID_A, menuPath = { "Samples", "Grouping" })
	public static final String GID_B = "my.B";
	
}
