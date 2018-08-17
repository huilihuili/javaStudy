package top.leagle.interview;

/**
 * 
 * @ClassName: TwoDimensionalArrayLookUp
 * @Description: 二维数组的查找
 * @author: Leagle
 * @date: 2018年8月15日 下午3:24:11
 */
public class TwoDimensionalArrayLookUp {
	public static void main(String[] args) {
		int[][] array = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		int target = 7;
		System.out.println(find(target, array));
	}

	public static boolean find(int target, int[][] array) {
		int row = 0;
		int column = array[0].length - 1;

		while (row < array.length && column >= 0) {
			if (target == array[row][column]) {
				return true;
			} else if (target < array[row][column]) {
				column--;
			} else {
				row++;
			}
		}
		return false;
	}
}
