package top.leagle.pattern.observer.observer3.observers.impl;

import java.util.Observable;
import java.util.Observer;

import top.leagle.pattern.observer.observer3.observers.DisplayElement;
import top.leagle.pattern.observer.observer3.subjects.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float temp;
	private float humidity;
	private float pressure;
	private Observable observable;

	public StatisticsDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temp = weatherData.getTemp();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println(String.format("气象统计：temp:%s humidity:%s pressure:%s", temp, humidity, pressure));
	}
}
