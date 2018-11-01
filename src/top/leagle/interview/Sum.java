package top.leagle.interview;

public class Sum {
	public static void main(String[] args) {
		Sum sum = new Sum();
		System.out.println(sum.sum(5));
	}

	public int sum(int n) {
		int sum = n;
		boolean flag = n > 0 && (sum += sum(n - 1)) != 0;
		return sum;
	}
}
