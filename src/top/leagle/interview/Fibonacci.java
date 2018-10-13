package top.leagle.interview;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(new Fibonacci().fibonacci(100));
	}
	
	/**
	 * 
	 * @Title: fibonacci   
	 * @Description:  
	 * @param n
	 * @return
	 * t = 0时，0
	 * t = 1时，1
	 * t = 2时，0 + 1 = 1
	 * t = 3时，1 + 1 = 2
	 */
	public int fibonacci(int n) {
		if (n <= 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}

		int first = 0, second = 1;
		int result = 0;
		for (int i = 2; i <= n; i++) {
			result = first + second;
			first = second;
			second = result;
		}
		return result;
	}
}
