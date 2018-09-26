package top.leagle.interview;

public class NumberOf1Between1AndN {
	public static void main(String[] args) {
		NumberOf1Between1AndN numberOf1Between1AndN = new NumberOf1Between1AndN();
		System.out.println(numberOf1Between1AndN.numberOf1Between1AndN(21345));
	}

	public int numberOf1Between1AndN(int n) {
		return numberOf1Between1AndN(String.valueOf(n).toCharArray(), 0);
	}

	public int numberOf1Between1AndN(char[] cs, int start) {
		int first = cs[start] - '0';
		int length = cs.length - start;

		if (length == 1 && first == 0) {
			return 0;
		}

		if (length == 1 && first > 0) {
			return 1;
		}

		int numFirstDigit = 0;
		if (first > 1) {
			numFirstDigit = (int) Math.pow(10, length - 1);
		} else if (first == 1) {
			numFirstDigit = Integer.valueOf(String.valueOf(cs).substring(start + 1)) + 1;
		}

		int numOtherDigis = (first * (length - 1) * (int) Math.pow(10, length - 2));
		int numRecursive = numberOf1Between1AndN(cs, start + 1);
		return numFirstDigit + numOtherDigis + numRecursive;
	}
}
