package top.leagle.refactoring.chapter8.self.encapsulate.field.improvement;

public class IntRange {

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

	public IntRange(int low, int high) {
		this.low = low;
		this.high = high;
	}

	boolean includes(int arg) {
		return arg >= getLow() && arg <= getHigh();
	}

	void grow(int factor) {
		high = high * factor;
	}

	private int low;
	private int high;

	public static void main(String[] args) {
		CappedRange cappedRange = new CappedRange(4, 10, 7);
		System.out.println(cappedRange.includes(6));
		System.out.println(cappedRange.includes(8));
	}
}

class CappedRange extends IntRange {
	public CappedRange(int low, int high, int cap) {
		super(low, high);
		this.cap = cap;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	@Override
	public int getHigh() {
		return Math.min(super.getHigh(), getCap());
	}

	private int cap;
}
