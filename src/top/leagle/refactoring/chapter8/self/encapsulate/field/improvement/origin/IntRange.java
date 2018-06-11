package top.leagle.refactoring.chapter8.self.encapsulate.field.improvement.origin;

public class IntRange {

	public IntRange(int low, int high) {
		this.low = low;
		this.high = high;
	}

	boolean includes(int arg) {
		return arg >= low && arg <= high;
	}

	void grow(int factor) {
		high = high * factor;
	}

	public static void main(String[] args) {
		CappedRange cappedRange = new CappedRange(4, 10, 7);
		System.out.println(cappedRange.includes(6));
		System.out.println(cappedRange.includes(8));
	}

	private int low;
	private int high;
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

	private int cap;
}
