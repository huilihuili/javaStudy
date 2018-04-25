package top.leagle.pattern.command.command1.appliance;

public class Light {
	private String location;

	public Light() {
		this.location = "Light";
	}

	public Light(String location) {
		this.location += " " + location;
	}

	public void on() {
		System.out.println(location + " on...");
	}
}
