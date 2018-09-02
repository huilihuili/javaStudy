package top.leagle.interview;

import java.util.ArrayList;

public class PrintMatrix {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, };
		System.out.println(new PrintMatrix().printMatrix(matrix));
	}

	public ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> result = new ArrayList<>();
		int rowLength = matrix.length;
		int colLength = matrix[0].length;
		int start = 0;
		while (rowLength > 2 * start && colLength > 2 * start) {
			addToList(result, matrix, rowLength, colLength, start);
			start++;
		}
		return result;
	}

	public void addToList(ArrayList<Integer> arrayList, int[][] matrix, int row, int col, int start) {
		int endRow = row - start;
		int endCol = col - start;

		for (int i = start; i < endCol; i++) {
			arrayList.add(matrix[start][i]);
		}

		for (int i = start + 1; i < endRow - 1; i++) {
			arrayList.add(matrix[i][endCol - 1]);
		}

		if (start < endRow - 1) {
			for (int i = endCol - 1; i >= start; i--) {
				arrayList.add(matrix[endRow - 1][i]);
			}
		}

		if (start < endCol - 1) {
			for (int i = endRow - 2; i >= start + 1; i--) {
				arrayList.add(matrix[i][start]);
			}
		}
	}
}
