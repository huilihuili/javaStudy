package top.leagle.refactoring.chapter8.self.encapsulate.field.Origin;

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
		IntRange intRange = new IntRange(4, 10);
		System.out.println(intRange.includes(6));
		System.out.println(intRange.includes(3));
	}

	private int low;
	private int high;
}
