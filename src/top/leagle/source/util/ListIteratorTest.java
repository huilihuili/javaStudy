package top.leagle.source.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

import org.junit.Test;

public class ListIteratorTest {
	private ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	private int size = arrayList.size();
	{
		System.out.println(arrayList);
	}

	@Test
	public void hasNextTest() {
		ListIterator<Integer> listIterator = arrayList.listIterator();
		System.out.println(listIterator.hasNext());

		ListIterator<Integer> listIterator2 = arrayList.listIterator(size - 1);
		System.out.println(listIterator2.hasNext());

		ListIterator<Integer> listIterator3 = arrayList.listIterator(size);
		System.out.println(listIterator3.hasNext());
	}

	@Test
	public void hasPreviousTest() {
		ListIterator<Integer> listIterator = arrayList.listIterator();
		System.out.println(listIterator.hasPrevious());

		ListIterator<Integer> listIterator2 = arrayList.listIterator(1);
		System.out.println(listIterator2.hasPrevious());

		ListIterator<Integer> listIterator3 = arrayList.listIterator(size);
		System.out.println(listIterator3.hasPrevious());
	}

	@Test
	public void nextTest() {
		ListIterator<Integer> listIterator = arrayList.listIterator();
		System.out.println(listIterator.next());
	}

	@Test
	public void previousTest() {
		ListIterator<Integer> listIterator = arrayList.listIterator(1);
		System.out.println(listIterator.previous());

		ListIterator<Integer> listIterator2 = arrayList.listIterator(size);
		System.out.println(listIterator2.previous());
	}

	@Test
	public void nextIndexTest() {
		ListIterator<Integer> listIterator = arrayList.listIterator();
		System.out.println(listIterator.nextIndex());
	}

	@Test
	public void previousIndexTest() {
		ListIterator<Integer> listIterator = arrayList.listIterator(1);
		System.out.println(listIterator.previousIndex());

		ListIterator<Integer> listIterator2 = arrayList.listIterator(size);
		System.out.println(listIterator2.previousIndex());
	}

	@Test
	public void nextRemoveTest() {
		ListIterator<Integer> listIterator = arrayList.listIterator();
		System.out.println(listIterator.next());
		listIterator.remove();
		System.out.println(arrayList);
	}

	@Test
	public void previousRemoveTest() {
		ListIterator<Integer> listIterator = arrayList.listIterator(1);
		System.out.println(listIterator.previous());
		listIterator.remove();
		System.out.println(arrayList);
	}

	@Test
	public void nextSetTest() {
		ListIterator<Integer> listIterator = arrayList.listIterator();
		System.out.println(listIterator.next());
		listIterator.set(6);
		System.out.println(arrayList);
	}

	@Test
	public void previousSetTest() {
		ListIterator<Integer> listIterator = arrayList.listIterator(1);
		System.out.println(listIterator.previous());
		listIterator.set(6);
		System.out.println(arrayList);
	}

	@Test
	public void addTest() {
		ListIterator<Integer> listIterator = arrayList.listIterator();
		listIterator.add(6);
		System.out.println(arrayList);
		System.out.println(listIterator.next());
		listIterator.add(7);
		listIterator.add(8);
		System.out.println(arrayList);
		System.out.println(listIterator.next());
		listIterator.add(9);
		listIterator.add(10);
		System.out.println(arrayList);
		System.out.println(listIterator.previous());
		listIterator.add(11);
		listIterator.add(12);
		System.out.println(arrayList);
	}

	@Test
	public void nextMixPreviousTest() {
		ListIterator<Integer> listIterator = arrayList.listIterator();
		System.out.println(listIterator.next());
		System.out.println(listIterator.previous());
		System.out.println(listIterator.next());
	}
}
