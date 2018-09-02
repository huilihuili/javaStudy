package top.leagle.interview;

public class HasPath {
	public static void main(String[] args) {
		char[] matrix = { 'A', 'B', 'C', 'E', 'S', 'F', 'C', 'S', 'A', 'D', 'E', 'E' };
		int rows = 3;
		int cols = 4;
		char[] str = { 'A', 'B', 'C', 'B' };

		System.out.println(new HasPath().hasPath(matrix, rows, cols, str));
	}

	public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
		boolean[] visited = new boolean[rows * cols];
		int pathLength = 0;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (hasPathCore(matrix, rows, cols, i, j, str, pathLength, visited)) {
					return true;
				}
			}
		}
		return false;
	}

	boolean hasPathCore(char[] matrix, int rows, int cols, int row, int col, char[] str, int pathLength,
			boolean[] visited) {
		if (pathLength == str.length) {
			return true;
		}
		boolean hasPath = false;
		if (row >= 0 && row < rows && col >= 0 && col < cols && matrix[row * cols + col] == str[pathLength]
				&& !visited[row * cols + col]) {
			pathLength++;
			visited[row * cols + col] = true;
			hasPath = hasPathCore(matrix, rows, cols, row, col - 1, str, pathLength, visited)
					|| hasPathCore(matrix, rows, cols, row - 1, col, str, pathLength, visited)
					|| hasPathCore(matrix, rows, cols, row, col + 1, str, pathLength, visited)
					|| hasPathCore(matrix, rows, cols, row + 1, col, str, pathLength, visited);

			if (!hasPath) {
				visited[row * cols + col] = false;
			}
		}
		return hasPath;
	}

	public static void pringArray(boolean[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
