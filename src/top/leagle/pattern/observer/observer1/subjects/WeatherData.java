package top.leagle.pattern.observer.observer1.subjects;

import top.leagle.pattern.observer.observer1.observers.CurrenConditionDisplay;
import top.leagle.pattern.observer.observer1.observers.ForecastDisplay;
import top.leagle.pattern.observer.observer1.observers.StatisticsDisplay;

public class WeatherData {

	private float temp;
	private float humidity;
	private float pressure;

	private CurrenConditionDisplay currenConditionDisplay;
	private StatisticsDisplay statisticsDisplay;
	private ForecastDisplay forecastDisplay;

	public WeatherData() {
		currenConditionDisplay = new CurrenConditionDisplay();
		statisticsDisplay = new StatisticsDisplay();
		forecastDisplay = new ForecastDisplay();

	}

	public void measurementsChanged() {
		// 当数据发生变化时
		currenConditionDisplay.update(temp, humidity, pressure);
		statisticsDisplay.update(temp, humidity, pressure);
		forecastDisplay.update(temp, humidity, pressure);
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

}
