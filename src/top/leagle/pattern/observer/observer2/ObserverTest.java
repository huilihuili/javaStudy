package top.leagle.pattern.observer.observer2;

import org.junit.Test;

import top.leagle.pattern.observer.observer2.observers.impl.CurrenConditionDisplay;
import top.leagle.pattern.observer.observer2.observers.impl.ForecastDisplay;
import top.leagle.pattern.observer.observer2.observers.impl.StatisticsDisplay;
import top.leagle.pattern.observer.observer2.subjects.impl.WeatherData;

public class ObserverTest {

	@Test
	public void test1() {
		WeatherData weatherData = new WeatherData();
		CurrenConditionDisplay currenConditionDisplay = new CurrenConditionDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements((float) 1.0, (float) 2.0, (float) 3.0);
	}
}
