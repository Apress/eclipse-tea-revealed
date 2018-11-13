package org.eclipse.tea.samples.ch14.s03;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.tea.core.services.TaskingLog;

import com.wamas.ide.launching.LcDslLaunchConfigBuilder;
import com.wamas.ide.launching.lcDsl.LaunchConfig;
import com.wamas.ide.launching.lcDsl.LaunchConfigType;
import com.wamas.ide.launching.ui.LcDslHelper;

public class TaskRunSomething {

	@Execute
	public void run(TaskingLog log) {
		LaunchConfig lc = LcDslHelper.getInstance().findLaunchConfig("mylaunch");
		
		LcDslLaunchConfigBuilder builder = new LcDslLaunchConfigBuilder(LaunchConfigType.JAVA, "mylaunch-new");
		builder.setSuperConfig(lc).addVmArgument("-Dmy.prop=World");
		
		LcDslHelper.getInstance().launch(builder.buildAndValidate(), LcDslHelper.MODE_DEBUG);
	}
	
}
