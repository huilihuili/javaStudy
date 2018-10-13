package top.leagle.interview;

public class GetNumberOfK {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 3, 3, 4, 5 };
		int k = 3;

		GetNumberOfK getNumberOfK = new GetNumberOfK();
		System.out.println(getNumberOfK.getNumberOfK(array, k));
		System.out.println(getNumberOfK.getNumberOfKOther(array, k));
	}

	public int getNumberOfK(int[] array, int k) {
		int first = getFirstK(array, k, 0, array.length - 1);
		int last = getLastK(array, k, 0, array.length - 1);
		if (first > -1 && last > -1) {
			return last - first + 1;
		}
		return 0;
	}

	public int getNumberOfKOther(int[] array, int k) {
		int index = binarySerach(array, k);
		if (index == -1) {
			return 0;
		}

		int count = 1;
		for (int i = index + 1; i < array.length; i++) {
			if (array[i] == k) {
				count++;
			}
		}
		for (int i = index - 1; i >= 0; i--) {
			if (array[i] == k) {
				count++;
			}
		}
		return count;
	}

	public int getFirstK(int[] data, int k, int start, int end) {
		if (start > end) {
			return -1;
		}

		int middleIndex = (start + end) / 2;
		int middleData = data[middleIndex];

		if (middleData == k) {
			if ((middleIndex > 0 && data[middleIndex - 1] != k) || middleIndex == 0) {
				return middleIndex;
			} else {
				end = middleIndex - 1;
			}
		} else if (middleData > k) {
			end = middleIndex - 1;
		} else {
			start = middleIndex + 1;
		}
		return getFirstK(data, k, start, end);
	}

	public int getLastK(int[] data, int k, int start, int end) {
		if (start > end) {
			return -1;
		}

		int middleIndex = (start + end) / 2;
		int middleData = data[middleIndex];

		if (middleData == k) {
			if ((middleIndex < data.length - 1 && data[middleIndex + 1] != k) || middleIndex == data.length - 1) {
				return middleIndex;
			} else {
				start = middleIndex + 1;
			}
		} else if (middleData < k) {
			start = middleIndex + 1;
		} else {
			end = middleIndex - 1;
		}
		return getLastK(data, k, start, end);
	}

	public int binarySerach(int[] array, int k) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] == k) {
				return mid;
			} else if (array[mid] > k) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}
}
