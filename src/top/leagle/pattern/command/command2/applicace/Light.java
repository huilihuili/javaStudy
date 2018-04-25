package top.leagle.pattern.command.command2.applicace;

public class Light {
	private String location;

	public Light() {
		this.location = "Light";
	}

	public Light(String location) {
		this.location = location + " light";
	}

	public void on() {
		System.out.println(location + " is on.");
	}

	public void off() {
		System.out.println(location + " is off.");
	}
}
