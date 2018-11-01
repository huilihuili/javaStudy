package top.leagle.interview;

public class Add {
	public static void main(String[] args) {
		System.out.println(new Add().add(3, 3));
	}

	public int add(int num1, int num2) {
		int sum = 0;
		while (num2 != 0) {
			sum = num1 ^ num2;
			num2 = (num1 & num2) << 1;
			num1 = sum;
		}
		return num1;
	}
}
