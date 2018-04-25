package top.leagle.pattern.facade.hometheater;

public class TheaterLights {

	public void dim(int dimValue) {
		System.out.println("Theater Ceiling Lights dimming to " + dimValue);
	}

	public void on() {
		System.out.println("Theater Ceiling Lights on");
	}
}
