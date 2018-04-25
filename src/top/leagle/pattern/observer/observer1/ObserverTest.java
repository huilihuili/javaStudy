package top.leagle.pattern.observer.observer1;

import org.junit.Test;

import top.leagle.pattern.observer.observer1.subjects.WeatherData;

public class ObserverTest {

	@Test
	public void test1() {
		WeatherData weatherData = new WeatherData();
		weatherData.setTemp((float) 1.0);
		weatherData.setHumidity((float) 2.0);
		weatherData.setPressure((float) 3.0);
		
		weatherData.measurementsChanged();
	}
}
