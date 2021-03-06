package top.leagle.pattern.observer.observer2.observers.impl;

import top.leagle.pattern.observer.observer2.observers.DisplayElement;
import top.leagle.pattern.observer.observer2.observers.Observer;
import top.leagle.pattern.observer.observer2.subjects.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float temp;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println(String.format("气象统计：temp:%s humidity:%s pressure:%s", temp, humidity, pressure));
	}

}
