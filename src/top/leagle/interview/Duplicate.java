package top.leagle.interview;

public class Duplicate {
	public static void main(String[] args) {
		Duplicate duplicate = new Duplicate();
		int[] numbers = { 2, 4, 2, 1, 4 };
		System.out.println(duplicate.duplicate(numbers, 5, new int[5]));
	}

	public boolean duplicate(int numbers[], int length, int[] duplication) {
		if (numbers == null || length == 0) {
			return false;
		}

		for (int i = 0; i < length; i++) {
			if (numbers[i] < 0 || numbers[i] > length - 1) {
				return false;
			}
		}
		for (int i = 0; i < length; i++) {
			while (numbers[i] != i) {
				if (numbers[i] == numbers[numbers[i]]) {
					duplication[0] = numbers[i];
					return true;
				}

				int temp = numbers[i];
				numbers[i] = numbers[temp];
				numbers[temp] = temp;
			}
		}
		return false;
	}

	public boolean duplicateOther(int numbers[], int length, int[] duplication) {
		boolean[] k = new boolean[length];
		for (int i = 0; i < k.length; i++) {
			if (k[numbers[i]] == true) {
				duplication[0] = numbers[i];
				return true;
			}
			k[numbers[i]] = true;
		}
		return false;
	}
}
