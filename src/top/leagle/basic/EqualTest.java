package top.leagle.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EqualTest {
	public static void main(String[] args) {
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		Integer d = 3;
		Integer e = 321;
		Integer f = 321;
		Long g = 3L;

		System.out.println(c == d);
		System.out.println(e == f);
		System.out.println(c == (a + b));
		System.out.println(c.equals(a + b));
		System.out.println(g == (a + b));
		System.out.println(g.equals(a + b));

		System.out.println();
		Integer m = 300;
		int n = 300;
		long i = 3L;
		int j = 3;
		System.out.println(m == n);
		System.out.println(i == j);

		System.out.println();
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		for (int l : list) {
			System.out.print(l + " ");
		}
		System.out.println();
	}

}
