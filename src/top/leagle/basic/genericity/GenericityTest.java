package top.leagle.basic.genericity;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GenericityTest {

	@Test
	public void test1() {
		Box box2 = new Box();
		box2.set(new Apple());
		Apple apple = (Apple) box2.get();
	}

	@Test
	public void test2() {
		Box<Apple> box2 = new Box<Apple>();
		box2.set(new Apple());
		Apple apple = box2.get();
	}

	@Test
	public void test3() {
		Box2<Apple> box2 = new Box2<Apple>();
		box2.set(new Apple());
		Apple apple = box2.get();
	}

	public static void printList1(List<Object> list) {
		for (Object elem : list)
			System.out.println(elem + " ");
		System.out.println();
	}

	public static <T> void printList2(List<T> list) {
		for (T elem : list)
			System.out.println(elem + " ");
		System.out.println();
	}

	public static void printList3(List<?> list) {
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i) + " ");
		System.out.println();
	}

	public static void printList4(List<? extends Object> list) {
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i) + " ");
		System.out.println();
	}

	@Test
	public void test4() {
		List<Integer> test1 = Arrays.asList(1, 2, 3);
		List<String> test2 = Arrays.asList("one", "two", "three");
		List<Object> test3 = Arrays.asList((Object) 1, "two", 1.23);

		// printList1(test1);
		// printList1(test2);
		printList1(test3);
		printList2(test1);
		printList2(test2);
		printList2(test3);
		printList3(test1);
		printList3(test2);
		printList3(test3);
		printList4(test1);
		printList4(test2);
		printList4(test3);

	}

	public static <T> T createInstance(Class<T> clazz) throws IllegalAccessException, InstantiationException {
		return clazz.newInstance();
	}

	@Test
	public void test5() {
		try {
			Class clazz = Class.forName("top.leagle.basic.genericity.Apple");
			Apple apple = (Apple) clazz.newInstance();

			apple = createInstance(clazz);

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test6() throws ClassNotFoundException {
		Integer integer = 5;
		Class clazz = integer.getClass();
		System.out.println(clazz);

		clazz = Class.forName("top.leagle.basic.genericity.Apple");
		System.out.println(clazz);

		clazz = Apple.class;
		System.out.println(clazz);

	}

	public void objectTest(Object o) {
		System.out.println(o);
	}

	@Test
	public void test7() {
		Object o = new Object();
		String s = new String("---");
		objectTest(o);
		objectTest(s);
		
		int i = 5;
		objectTest(i);
	}

}
