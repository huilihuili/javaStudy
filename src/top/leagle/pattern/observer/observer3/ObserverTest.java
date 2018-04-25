package top.leagle.pattern.observer.observer3;

import java.util.Observable;

import javax.xml.bind.annotation.XmlTransient;

import org.junit.Test;

import top.leagle.pattern.observer.observer3.observers.impl.CurrenConditionDisplay;
import top.leagle.pattern.observer.observer3.observers.impl.ForecastDisplay;
import top.leagle.pattern.observer.observer3.observers.impl.StatisticsDisplay;
import top.leagle.pattern.observer.observer3.subjects.WeatherData;

public class ObserverTest {

	@Test
	public void test1() {
		WeatherData weatherData = new WeatherData();
		CurrenConditionDisplay currenConditionDisplay = new CurrenConditionDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements((float) 1.0, (float) 2.0, (float) 3.0);
	}

	@Test
	public void test2() {
		WeatherData weatherData = new WeatherData();
		Observable observable = new Observable();

		if (observable instanceof WeatherData) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		observable = weatherData;

		if (observable instanceof WeatherData) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	@Test
	public void test3() {
		WeatherData weatherData = new WeatherData();
		weatherData.setHumidity((float) 1.0);
		weatherData.setPressure((float) 2.0);
		weatherData.setTemp((float) 3.0);

		Observable observable = new Observable();
		weatherData = (WeatherData) observable;
		System.out.println(weatherData.getTemp());
	}

	@Test
	public void test4() {
		WeatherData weatherData = new WeatherData();
		weatherData.setHumidity((float) 1.0);
		weatherData.setPressure((float) 2.0);
		weatherData.setTemp((float) 3.0);

		Observable observable = new Observable();
		observable = weatherData;
		weatherData = (WeatherData) observable;
		System.out.println(weatherData.getTemp());
	}

	@Test
	public void test5() {
		WeatherData weatherData = new WeatherData();
		weatherData.setHumidity((float) 1.0);
		weatherData.setPressure((float) 2.0);
		weatherData.setTemp((float) 3.0);

		Observable observable = new Observable();
		observable = weatherData;
		System.out.println(weatherData.getHumidity());
		System.out.println(observable.getClass());
	}
}
