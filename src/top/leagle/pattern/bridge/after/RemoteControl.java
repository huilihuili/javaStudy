package top.leagle.pattern.bridge.after;

public abstract class RemoteControl {
	abstract void setChannel(int chnnel);
}

class RCAControl extends RemoteControl {

	@Override
	void setChannel(int chnnel) {
		tuneChnnel(chnnel);
	}

	private void tuneChnnel(int chnnel) {
		System.out.println("RCA tuneChnnel...");
	}
}

class SonyControl extends RemoteControl {

	@Override
	void setChannel(int chnnel) {
		tuneChnnel(chnnel);
	}

	private void tuneChnnel(int chnnel) {
		System.out.println("Sony tuneChnnel...");
	}
}
