package top.leagle.interview;

public class GetMaxValue {

	public static void main(String[] args) {
		GetMaxValue getMaxValue = new GetMaxValue();
		int[][] values = { { 1, 10, 3, 8 }, { 12, 2, 9, 6 }, { 5, 7, 4, 11 }, { 3, 7, 16, 5 } };
		System.out.println(getMaxValue.getMaxValue(values));
		System.out.println(getMaxValue.getMaxValueOther(values));
	}

	public int getMaxValue(int[][] values) {
		int rows = values.length;
		int cols = values[0].length;

		int[][] maxValues = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int left = 0;
				int up = 0;

				if (i > 0) {
					up = maxValues[i - 1][j];
				}

				if (j > 0) {
					left = maxValues[i][j - 1];
				}
				maxValues[i][j] = Math.max(left, up) + values[i][j];
			}
		}
		return maxValues[rows - 1][cols - 1];
	}

	public int getMaxValueOther(int[][] values) {
		int rows = values.length;
		int cols = values[0].length;

		int[] maxValues = new int[cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int left = 0;
				int up = 0;

				if (i > 0) {
					up = maxValues[j];
				}

				if (j > 0) {
					left = maxValues[j - 1];
				}
				maxValues[j] = Math.max(left, up) + values[i][j];
			}
		}
		return maxValues[cols - 1];
	}
}
