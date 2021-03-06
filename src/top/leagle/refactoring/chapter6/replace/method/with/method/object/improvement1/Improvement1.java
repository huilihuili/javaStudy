package top.leagle.refactoring.chapter6.replace.method.with.method.object.improvement1;

public class Improvement1 {
	private final Origin origin;
	private int inputVal;
	private int quantity;
	private int yearToDate;
	private int importantValue1;
	private int importantValue2;
	private int importantValue3;

	public Improvement1(Origin origin, int inputVal, int quantity, int yearToDate) {
		this.origin = origin;
		this.inputVal = inputVal;
		this.quantity = quantity;
		this.yearToDate = yearToDate;
	}

	public int compute() {
		importantValue1 = inputVal * quantity + origin.delta();
		importantValue2 = inputVal * yearToDate + 100;
		if ((yearToDate - importantValue1) > 100) {
			importantValue2 -= 20;
		}
		importantValue3 = importantValue2 * 7;
		return importantValue3 - 2 * importantValue1;
	}
}
