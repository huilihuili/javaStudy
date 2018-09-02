package top.leagle.interview;

public class MovingCount {
	static int i = 1;

	public static void main(String[] args) {
		System.out.println("start ---");
		System.out.println(new MovingCount().movingCount(4, 2, 2));
	}

	public int movingCount(int threshold, int rows, int cols) {
		boolean[] visited = new boolean[rows * cols];
		int col = 0;
		int row = 0;
		return movingCountCore(threshold, rows, cols, row, col, visited);
	}

	public int movingCountCore(int threshold, int rows, int cols, int row, int col, boolean[] visited) {
		int count = 0;
		System.out.println(i++ + " " + row + " " + col);
		if (check(threshold, rows, cols, row, col, visited)) {
			visited[row * cols + col] = true;

			count = 1 + movingCountCore(threshold, rows, cols, row, col - 1, visited)
					+ movingCountCore(threshold, rows, cols, row - 1, col, visited)
					+ movingCountCore(threshold, rows, cols, row, col + 1, visited)
					+ movingCountCore(threshold, rows, cols, row + 1, col, visited);
		}
		return count;
	}

	public boolean check(int threshold, int rows, int cols, int row, int col, boolean[] visited) {
		if (row >= 0 && row < rows && col >= 0 && col < cols && (getDigistSum(row) + getDigistSum(col)) <= threshold
				&& !visited[row * cols + col]) {
			return true;
		}
		return false;
	}

	int getDigistSum(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}
}
