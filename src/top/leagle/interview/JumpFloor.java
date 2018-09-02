package top.leagle.interview;

public class JumpFloor {
	public static void main(String[] args) {

	}

	/**
	 * 
	 * @Title: jumpFloor
	 * @Description:
	 * @param target
	 * @return t = 1时，1 t = 2时，2 t = 3时，2 + 1 = 3
	 */
	public int jumpFloor(int target) {
		if (target == 1) {
			return 1;
		}

		if (target == 2) {
			return 2;
		}

		int first = 1, second = 2, result = 0;
		for (int i = 3; i <= target; i++) {
			result = first + second;
			first = second;
			second = result;
		}
		return result;
	}
}
