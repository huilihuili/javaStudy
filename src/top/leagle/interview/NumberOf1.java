package top.leagle.interview;

public class NumberOf1 {
	public static void main(String[] args) {
		System.out.println(new NumberOf1().numberOf1(Integer.MIN_VALUE));
		System.out.println(new NumberOf1().numberOf1Other(Integer.MIN_VALUE));
	}

	public int numberOf1(int n) {
		int count = 0;
		int flag = 1;

		while (flag != 0) {
			if ((flag & n) != 0) {
				count++;
			}
			flag = flag << 1;
		}
		return count;
	}

	public int numberOf1Other(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = (n - 1) & n;
		}
		return count;
	}

}
