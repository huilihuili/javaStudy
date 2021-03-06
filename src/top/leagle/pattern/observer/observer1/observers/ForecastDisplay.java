package top.leagle.pattern.observer.observer1.observers;

public class ForecastDisplay {

	private float temp;
	private float humidity;
	private float pressure;

	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	public void display() {
		System.out.println(String.format("预测状况：temp:%s humidity:%s pressure:%s", temp + 1, humidity + 1, pressure + 1));
	}

}
