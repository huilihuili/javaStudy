package top.leagle.interview;

public class FindGreatestSumOfSubArray {
	public static void main(String[] args) {
		int[] array = { 6, -3, -2, 7, -15, 1, 2, 2 };
		FindGreatestSumOfSubArray findGreatestSumOfSubArray = new FindGreatestSumOfSubArray();
		System.out.println(findGreatestSumOfSubArray.findGreatestSumOfSubArray(array));
	}

	public int findGreatestSumOfSubArray(int[] array) {
		int result = array[0];
		int current = array[0];
		for (int i = 1; i < array.length; i++) {
			current = Math.max(current + array[i], array[i]);
			result = Math.max(current, result);
		}
		return result;
	}

}
