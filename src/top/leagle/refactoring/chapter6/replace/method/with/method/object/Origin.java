package top.leagle.refactoring.chapter6.replace.method.with.method.object;

public class Origin {
	public int delta() {
		return 5;
	}

	public int gamma(int inputVal, int quantity, int yearToDate) {
		int importantValue1 = inputVal * quantity + delta();
		int importantValue2 = inputVal * yearToDate + 100;
		if ((yearToDate - importantValue1) > 100) {
			importantValue2 -= 20;
		}
		int importantValue3 = importantValue2 * 7;
		return importantValue3 - 2 * importantValue1;
	}

	public static void main(String[] args) {
		System.out.println(new Origin().gamma(100, 100, 100));
	}
}
