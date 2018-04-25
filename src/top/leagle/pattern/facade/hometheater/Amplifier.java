package top.leagle.pattern.facade.hometheater;

public class Amplifier {

	public void on() {
		System.out.println("Amplifier on");
	}

	public void setDvd() {
		System.out.println("Amplifier setting DVD player");
	}

	public void setSurroundSound() {
		System.out.println("Amplifier surround sound on");
	}

	public void setVolume(int volume) {
		System.out.println("Amplifier setting volume to " + volume);
	}

	public void off() {
		System.out.println("Amplifier off");
	}
}
