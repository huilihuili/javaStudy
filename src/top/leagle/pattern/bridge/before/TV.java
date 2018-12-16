package top.leagle.pattern.bridge.before;

public abstract class TV {
	abstract void tuneChnnel(int chnnel);
}

class RCA extends TV {

	@Override
	void tuneChnnel(int chnnel) {
		System.out.println("RCA tuneChnnel...");
	}

}

class Sony extends TV {
	@Override
	void tuneChnnel(int chnnel) {
		System.out.println("Sony tuneChnnel...");
	}
}
