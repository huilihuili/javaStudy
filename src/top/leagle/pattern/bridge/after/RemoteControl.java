package top.leagle.pattern.bridge.after;

public abstract class RemoteControl {
	private TV tv;

	public RemoteControl(TV tv) {
		this.tv = tv;
	}

	protected void setChannel(int chnnel) {
		tv.tuneChnnel(chnnel);
	}
}

class ConcreteControl extends RemoteControl {
	private int currenStation;

	public ConcreteControl(TV tv) {
		super(tv);
	}

	public void nextChannel() {
		setChannel(++currenStation);
	}

	public int getCurrenStation() {
		return currenStation;
	}

	public void setCurrenStation(int currenStation) {
		this.currenStation = currenStation;
	}
}
