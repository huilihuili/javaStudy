package top.leagle.interview;

public class MinNumberInRotateArray {
	public static void main(String[] args) {
		int[] array = { 1, 1, 1, 0, 1 };
		System.out.println(new MinNumberInRotateArray().minNumberInRotateArray(array));
		System.out.println(new MinNumberInRotateArray().minNumberInRotateArrayOther(array));
		System.out.println(new MinNumberInRotateArray().minNumberInRotateArrayMe(array));

		int[] array1 = { 1, 0, 1, 1, 1 };
		System.out.println(new MinNumberInRotateArray().minNumberInRotateArray(array1));
		System.out.println(new MinNumberInRotateArray().minNumberInRotateArrayOther(array1));
		System.out.println(new MinNumberInRotateArray().minNumberInRotateArrayMe(array1));

	}

	public int minNumberInRotateArray(int[] array) {
		int leftIndex = 0;
		int rightIndex = array.length - 1;
		while (array[leftIndex] >= array[rightIndex]) {
			if (rightIndex - leftIndex == 1) {
				return array[rightIndex];
			}
			int midIndex = (leftIndex + rightIndex) / 2;
			if (array[midIndex] == array[leftIndex] && array[midIndex] == array[rightIndex]) {
				return minInOrder(array, leftIndex, rightIndex);
			}
			if (array[midIndex] >= array[leftIndex]) {
				leftIndex = midIndex;
			} else if (array[midIndex] <= array[rightIndex]) {
				rightIndex = midIndex;
			}
		}
		return array[0];
	}

	public int minInOrder(int[] array, int startIndex, int endIndex) {
		int result = array[startIndex];
		for (int i = startIndex + 1; i <= endIndex; i++) {
			if (result > array[i]) {
				result = array[i];
			}
		}
		return result;
	}
	
	/**
	 * 
	 * @Title: minNumberInRotateArrayMe   
	 * @Description:  
	 * @param array
	 * @return 错的
	 */
	public int minNumberInRotateArrayMe(int[] array) {
		int low = 0;
		int high = array.length - 1;
		while (low < high) {
			int mid = (low + high) / 2;
			if (array[low] < array[mid]) {
				low = mid;
			} else if (array[low] == array[mid]) {
				low++;
			} else {
				high = mid;
			}
		}
		return array[low];
	}

	public int minNumberInRotateArrayOther(int[] array) {
		int low = 0;
		int high = array.length - 1;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (array[mid] > array[high]) {
				low = mid + 1;
			} else if (array[mid] == array[high]) {
				high = high - 1;
			} else {
				high = mid;
			}
		}
		return array[low];
	}
}
