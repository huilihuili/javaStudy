package top.leagle.pattern.observer.observer2;

import org.junit.Test;

import top.leagle.pattern.observer.observer2.observers.impl.CurrenConditionDisplay;
import top.leagle.pattern.observer.observer2.observers.impl.ForecastDisplay;
import top.leagle.pattern.observer.observer2.observers.impl.StatisticsDisplay;
import top.leagle.pattern.observer.observer2.subjects.impl.WeatherData;

public class ObserverTest {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		new CurrenConditionDisplay(weatherData);
		new StatisticsDisplay(weatherData);
		new ForecastDisplay(weatherData);

		weatherData.setMeasurements(1.0f, 2.0f, 3.0f);
	}
}
