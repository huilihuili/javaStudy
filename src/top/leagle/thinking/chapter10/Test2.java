package top.leagle.thinking.chapter10;

import java.util.Arrays;

import top.leagle.thinking.chapter10.Test1.Normal;
import top.leagle.thinking.chapter10.Test1.StaticClass;

public class Test2 {
	public static void main(String[] args) {
		StaticClass staticClass = new StaticClass();
		Test1 test1 = new Test1();
		Normal normal2 = test1.new Normal();
		Test1.Normal normal = test1.new Normal();

		String[] strings = { "1", "2", "3" };
		int[] ints = { 1, 2, 3 };
		Integer[] integers = { 1, 2, 3 };
		System.out.println(Arrays.asList(strings));
		System.out.println(Arrays.asList(ints));
		System.out.println(Arrays.asList(integers));
	}
}
