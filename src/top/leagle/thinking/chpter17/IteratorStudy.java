package top.leagle.thinking.chpter17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

public class IteratorStudy {

	public static void iterManipulation(List<String> a) {

	}

	@Test
	public void test1() {
		List<String> a = Arrays.asList("a b c d".split(" "));
		ListIterator<String> it = a.listIterator();

		System.out.println("it.hasNext() = " + it.hasNext());
		System.out.println("it.hasPrevious() = " + it.hasPrevious());

		System.out.println("it.next() = " + it.next());
		System.out.println("it.nextIndex() = " + it.nextIndex());

		System.out.println("it.previous() = " + it.previous());
		System.out.println("it.previousIndex() = " + it.previousIndex());
	}

	@Test
	public void test2() {
		List<String> a = new ArrayList<>(Arrays.asList("a b c d".split(" ")));
		ListIterator<String> it = a.listIterator();
		it.add("47");
		System.out.println(a);
		it.next();
		it.remove();
		System.out.println(a);
		it.next();
		it.set("47");
		System.out.println(a);
	}
}
