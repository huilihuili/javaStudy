package top.leagle.interview;

public class FindNumsAppearOnce {
	public void findNumsAppearOnce(int[] array, int num1[], int num2[]) {
		if (array == null || array.length < 2) {
			return;
		}

		int resultExclusiveOR = 0;
		for (int i = 0; i < array.length; i++) {
			resultExclusiveOR ^= array[i];
		}
		int indexOf1 = findFirstBitIs1(resultExclusiveOR);
		for (int i = 0; i < array.length; i++) {
			if (isBit1(array[i], indexOf1)) {
				num1[0] ^= array[i];
			} else {
				num2[0] ^= array[i];
			}
		}
	}

	int findFirstBitIs1(int num) {
		int indexBit = 0;
		while ((num & 1) == 0 && indexBit < 32) {
			num = num >> 1;
			indexBit++;
		}
		return indexBit;
	}

	boolean isBit1(int num, int indexBit) {
		return ((num >> indexBit) & 1) == 1;
	}
}
