package top.leagle.interview;

public class ReOrderArray {
	public static void main(String[] args) {
		ReOrderArray reOrderArray = new ReOrderArray();
		int[] array = { 1, 2, 3, 4, 5 };
		reOrderArray.printArray(array);
		reOrderArray.reOrderArray(array);
		reOrderArray.printArray(array);

		int[] array1 = { 1, 2, 3, 4, 5 };
		reOrderArray.reOrderArrayOther(array1);
		reOrderArray.printArray(array1);

		int[] array2 = { 1, 2, 3, 4, 5 };

		reOrderArray.reOrderArrayOther2(array2);
		reOrderArray.printArray(array2);
	}

	public void reOrderArray(int[] array) {
		int low = 0;
		int high = array.length - 1;

		while (low < high) {
			while (low < high && isEvent(array[low])) {
				low++;
			}

			while (high > low && !isEvent(array[high])) {
				high--;
			}

			if (low < high) {
				int tempt = array[low];
				array[low] = array[high];
				array[high] = tempt;
			}
		}
	}

	public void reOrderArrayOther(int[] array) {
		int[] isArray = new int[array.length];
		int[] notArray = new int[array.length];
		int isLength = 0;
		int notLength = 0;
		for (int i = 0; i < array.length; i++) {
			if (isEvent(array[i])) {
				isArray[isLength++] = array[i];
			} else {
				notArray[notLength++] = array[i];
			}
		}
		for (int i = 0; i < isLength; i++) {
			array[i] = isArray[i];
		}
		for (int i = isLength; i < array.length; i++) {
			array[i] = notArray[i - isLength];
		}
	}

	public void reOrderArrayOther2(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] % 2 == 0 && array[j + 1] % 2 != 0) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public boolean isEvent(int n) {
		return (n & 1) == 1 ? true : false;
	}

	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
