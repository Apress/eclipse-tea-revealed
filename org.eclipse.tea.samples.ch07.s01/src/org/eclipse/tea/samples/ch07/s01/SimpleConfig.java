package org.eclipse.tea.samples.ch07.s01;

import org.eclipse.tea.core.services.TaskingConfigurationExtension;
import org.eclipse.tea.core.services.TaskingConfigurationExtension.TaskingConfig;
import org.osgi.service.component.annotations.Component;

@TaskingConfig(description = "CH07 Configuration")
@Component
public class SimpleConfig implements TaskingConfigurationExtension {
	@TaskingConfigProperty(description = "My String")
	public String myString = "default";
}
