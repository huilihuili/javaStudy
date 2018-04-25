package top.leagle.pattern.command.command4.appliance;

public class Stereo {
	private String location;

	public Stereo() {
		this.location = "stereo";
	}

	public Stereo(String location) {
		this.location = location + " stereo";
	}

	public void on() {
		System.out.println(this.location + " is on.");
	}

	public void setCd() {
		System.out.println(this.location + " is set for CD input.");
	}

	public void setVolume(int volume) {
		System.out.println(this.location + " volume set to " + volume + ".");
	}

	public void off() {
		System.out.println(this.location + " is off.");
	}
}
