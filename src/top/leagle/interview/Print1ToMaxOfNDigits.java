package top.leagle.interview;

public class Print1ToMaxOfNDigits {
	public static void main(String[] args) {
		// new Print1ToMaxOfNDigits().print1ToMaxOfNDigits(3);
		new Print1ToMaxOfNDigits().print1ToMaxOfNDigitsOther(3);
	}

	public void print1ToMaxOfNDigits(int n) {
		if (n <= 0) {
			return;
		}

		char[] number = new char[n];
		for (int i = 0; i < n; i++) {
			number[i] = '0';
		}
		while (!increment(number)) {
			printNumber(number);
		}
	}

	public void print1ToMaxOfNDigitsOther(int n) {
		if (n <= 0) {
			return;
		}

		char[] number = new char[n];
		for (int i = 0; i < 10; i++) {
			number[0] = (char) (i + '0');
			print1ToMaxOfNDigitsRecursively(number, n, 0);
		}
	}

	public void print1ToMaxOfNDigitsRecursively(char[] number, int length, int index) {
		if (index == length - 1) {
			printNumber(number);
			return;
		}

		for (int i = 0; i < 10; i++) {
			number[index + 1] = (char) (i + '0');
			print1ToMaxOfNDigitsRecursively(number, length, index + 1);
		}
	}

	public boolean increment(char[] number) {
		int carryOver = 1;
		for (int i = number.length - 1; i >= 0; i--) {
			int nSum = number[i] - '0' + carryOver;
			if (nSum == 10) {
				if (i == 0) {
					return true;
				}
				number[i] = '0';
			} else {
				number[i] = (char) ('0' + nSum);
				return false;
			}
		}
		return true;
	}

	public void printNumber(char[] number) {
		int index = -1;
		for (int i = 0; i < number.length; i++) {
			if (number[i] != '0') {
				index = i;
				break;
			}
		}
		if (index == -1) {
			return;
		}
		for (int i = index; i < number.length; i++) {
			System.out.print(number[i]);
		}
		System.out.println();
	}

}
