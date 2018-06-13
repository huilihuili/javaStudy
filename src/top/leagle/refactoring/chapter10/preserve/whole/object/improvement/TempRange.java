package top.leagle.refactoring.chapter10.preserve.whole.object.improvement;

public class TempRange {

	public boolean includes(TempRange arg) {
		return (arg.getLow() >= getLow()) && (arg.getHigh() <= getHigh());
	}

	public int getLow() {
		return low;
	}

	public void setLow(int low) {
		this.low = low;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	private int low;
	private int high;
}
