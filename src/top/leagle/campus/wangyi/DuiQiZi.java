package top.leagle.campus.wangyi;

import java.util.Arrays;

class Ordinate {
	private int x;
	private int y;

	public Ordinate() {

	}

	public Ordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setXAndY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static int getDistance(Ordinate one, Ordinate other) {
		return Math.abs(one.x - other.x) + Math.abs(one.y - other.y);
	}

	@Override
	public String toString() {
		return "Ordinate [x=" + x + ", y=" + y + "]";
	}

}

public class DuiQiZi {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();

		// for (int i = 0; i < n; i++) {
		// x[i] = sc.nextInt();
		// }
		// for (int i = 0; i < n; i++) {
		// y[i] = sc.nextInt();
		// }
		// sc.close();

		int n = 4;
		int[] x = { 1, 2, 4, 9 };
		int[] y = { 1, 1, 1, 1 };

		int[] dis = new int[n];
		int[] result = new int[n];
		
		for (int i = 0; i < n; i++) {
			result[i] = Integer.MAX_VALUE;
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					dis[k] = Math.abs(x[k] - x[i]) + Math.abs(y[k] - y[j]);
				}
				Arrays.sort(dis);
				int temp = 0;
				for (int r = 0; r < n; r++) {
					temp += dis[r];
					result[r] = Math.min(temp, result[r]);
				}
			}
		}
		for (int i = 0; i < n - 1; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println(result[n - 1]);
	}
}
