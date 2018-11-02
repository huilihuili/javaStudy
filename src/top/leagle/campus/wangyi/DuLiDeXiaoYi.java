package top.leagle.campus.wangyi;

import java.util.Scanner;

public class DuLiDeXiaoYi {
	public static void main(String[] args) {
		// int x = 3, f = 5, d = 100, p = 10;
		// int x = 2, f = 17, d = 20, p = 1;

		Scanner scanner = new Scanner(System.in);
		int x, f, d, p;
		x = scanner.nextInt();
		f = scanner.nextInt();
		d = scanner.nextInt();
		p = scanner.nextInt();

		if (d < f) {
			System.out.println(d / x);
		} else {
			if (d - f * x > 0) {
				System.out.println(f + (d - f * x) / (x + p));
			} else {
				System.out.println(d / x);
			}
		}
		scanner.close();
	}
}
