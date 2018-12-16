package top.leagle.source.util;

import java.util.Arrays;

import org.junit.Test;

public class ArraysTest {

	@Test
	public void copyOfTest() {
		Copy[] copies = new Copy[1];
		copies[0] = new Copy("EagleLi", 1);

		Copy[] copies2 = Arrays.copyOf(copies, copies.length);
		copies2[0] = new Copy("EagleLi1", 1);
		System.out.println(Arrays.asList(copies));
		System.out.println(Arrays.asList(copies2));

		System.out.println("\n--- 分割线 ---\n");

		Copy[] copies3 = Arrays.copyOf(copies, copies.length);
		copies3[0].string = "EagleLi1";
		System.out.println(Arrays.asList(copies));
		System.out.println(Arrays.asList(copies3));
		
		System.out.println("\n--- 分割线 ---\n");
		
		System.out.println(copies2[0] == copies[0]);
		System.out.println(copies2[0].string == copies[0].string);
	}

	public static class Copy {
		public String string;
		public Integer integer;

		public Copy(String string, Integer integer) {
			super();
			this.string = string;
			this.integer = integer;
		}

		@Override
		public String toString() {
			return "Copy [string=" + string + ", integer=" + integer + "]";
		}

	}
}
