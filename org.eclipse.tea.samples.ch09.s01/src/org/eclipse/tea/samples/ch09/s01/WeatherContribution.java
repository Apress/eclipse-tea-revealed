package org.eclipse.tea.samples.ch09.s01;

import java.util.Map;
import java.util.TreeMap;

import org.eclipse.tea.core.services.TaskChain;
import org.eclipse.tea.core.services.TaskingStatisticsContribution;
import org.osgi.service.component.annotations.Component;

@Component
public class WeatherContribution implements TaskingStatisticsContribution {

	@TaskingStatisticProvider(qualifier = "weather")
	public Map<String, Object> getWeather(TaskChain chain) {
		if (!chain.getClass().getName().contains("ch09.s01")) {
			return null;
		}

		Map<String, Object> r = new TreeMap<>();
		Map<String, String> t = new TreeMap<>();
		t.put("celsius", "34");
		t.put("fahrenh", "93");

		r.put("temps", t);
		r.put("hot", "true");
		return r;
	}
}
