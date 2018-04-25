package top.leagle.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import org.junit.Test;

public class ListAndArray {

	@Test
	public void test1() {
		Integer[] a = { 1, 2, 3 };
		List<Integer> b = new ArrayList<Integer>();
		b = Arrays.asList(a);
		System.out.println(a);
		System.out.println(b);
			
	}

	@Test
	public void test2() {
		List aList = new ArrayList();
		aList.add("12");
		aList.add(34);
		System.out.println(aList);
	}

	@Test
	public void test3() {
		ArrayList lis = new ArrayList();
		lis.add("tony");
		lis.add("tom");
		lis.add(5);
		System.out.println(lis);
		System.out.println(lis.toArray());
	}
}
