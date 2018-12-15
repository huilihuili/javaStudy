package top.leagle.utilTest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ArrayListTest {

	public static <T> void extendTest(Class<? extends T[]> newType) {
		System.out.println(newType + " can!!!");
		System.out.println((Object) newType == (Object) Object[].class);
	}

	public static void objectArrayTest(Class<Object[]> newType) {
		System.out.println(newType.getClass() + " can!!!");
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("1------");
		System.out.println(list);
		System.out.println();

		List<Integer> subList = list.subList(0, 3);
		System.out.println("2------");
		System.out.println(list);
		System.out.println(subList);
		System.out.println();

		subList.set(0, 10);
		System.out.println("3------");
		System.out.println(list);
		System.out.println(subList);
		System.out.println();
	}

	@Test
	public void test1() {
		System.out.println(Integer.class);
		System.out.println(String.class);
		System.out.println(Integer[].class);
		System.out.println(Object[].class);

		System.out.println();

		Object object = new Integer(2);
		Object object2 = new String();
		Object[] object3 = new Integer[2];
		Object[] objects = new Object[4];

		System.out.println(object.getClass());
		System.out.println(object2.getClass());
		System.out.println(object3.getClass());
		System.out.println(objects.getClass());

		System.out.println();
		System.out.println(Integer[].class.isInstance(Object[].class));
		System.out.println(String[].class.isInstance(Object[].class));
		System.out.println((Object) Object[].class == Object[].class);
		System.out.println((Object) Object[].class == (Object) Object[].class);
		System.out.println((Object) Integer[].class == (Object) Object[].class);

		System.out.println();
		System.out.println(Integer[].class.getSuperclass());
		System.out.println(int.class);
		System.out.println(int.class.getSuperclass());
		System.out.println(int[].class.getSuperclass());
	}

	@Test
	public void test2() {
		extendTest(Object[].class);
		extendTest(Integer[].class);
		// extendTest(Object.class);

		objectArrayTest(Object[].class);
		// objectArrayTest(Integer[].class);
	}

	@Test
	public void test3() {
		System.out.println(Object[].class);
		System.out.println(Object[].class.getClass());
	}

	@Test
	public void test4() {
		System.out.println(new ArrayList<Integer>().getClass());
		System.out.println(new ArrayList<String>().getClass());
	}

	static class Food {
		public void test() {

		}
	}

	static class Fruit extends Food {
		@Override
		public void test() {
		}

		public String name;

		private class Abc {
			public void fun() {
				Fruit.this.test();
			}
		}
	}

	static class Apple extends Fruit {
	}

	static class RedApple extends Apple {
	}

	@Test
	public void test5() {
		List<? extends Fruit> flist = new ArrayList<>();
		// complie error:
		// flist.add(new Apple());
		// flist.add(new Fruit());
		// flist.add(new Object());
		flist.add(null); // only work for null
		flist.contains(new Fruit());

		Fruit fruit = flist.get(0);
		Apple apple = (Apple) flist.get(0);
		RedApple redApple = (RedApple) flist.get(0);

		List<? super Fruit> flist2 = new ArrayList<>();
		flist2.add(new Apple());
		flist2.add(new Fruit());
		Fruit fruit2 = (Fruit) flist2.get(0);
	}

	@Test
	public void test51() {
		Class<? extends Fruit> class1;
		class1 = Fruit.class;
		class1 = Apple.class;
	}

	@Test
	public void test6() {
		Class<? extends Fruit[]> class1;
		class1 = Fruit[].class;
		System.out.println(class1);
		class1 = Apple[].class;
		System.out.println(class1);
	}

	@Test
	public void test7() {
		System.out.println(new Integer(5) instanceof Object);
		System.out.println(new Apple[5] instanceof Fruit[]);
		System.out.println(new Apple[5] instanceof Object[]);
	}

	@Test
	public void test8() {
		Object object = new Integer[3];
		Cloneable cloneable = new Integer[3];
		Serializable serializable = new Integer[3];

		Object[] objects = new Integer[3];
		System.out.println(object);
		System.out.println(objects);

		Fruit[] fruits = new Apple[3];
		Fruit[] fruits2 = new RedApple[3];
		fruits[0] = new Fruit();
		fruits[1] = new Apple();
		fruits[2] = new RedApple();
	}

	@Test
	public void inInstanceTest() {
		System.out.println(Object.class.isInstance(new String()));
		System.out.println(Object[].class.isInstance(new String[4]));
		System.out.println(int.class.isInstance(new Integer(5)));

		List<? extends Fruit> list = new ArrayList<>();
		List<Apple> list2 = new ArrayList<>();
		list = list2;
	}

	@Test
	public void toArrayTest3() {
		ArrayList<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit());
		fruits.add(new Apple());
		fruits.get(0).name = "hello";

		Object[] copy = fruits.toArray();
		System.out.println(((Fruit) copy[0]).name);

		((Fruit) copy[0]).name = "world";
		System.out.println(fruits.get(0).name);
		System.out.println(((Fruit) copy[0]).name);

		Fruit[] apples = fruits.toArray(new Fruit[0]);
		System.out.println(apples.length);

		Fruit[] apples2 = fruits.toArray(new Fruit[3]);
		System.out.println(apples2.length);
		System.out.println(apples2[2]);
	}

	@Test
	public void subListTest() {
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		List<Integer> subList = arrayList.subList(0, 3);
		System.out.println(arrayList);
		System.out.println(subList);

		subList.set(0, 6);
		System.out.println(arrayList);
		System.out.println(subList);

		subList.add(10);
		System.out.println(arrayList);
		System.out.println(subList);

		arrayList.add(10);
		System.out.println(arrayList);
		System.out.println(subList); // 报错
	}

	@Test
	public void systemArrayCopyTest() {
		Fruit[] fruits = { new RedApple(), new Apple() };
		Apple[] apples = new Apple[2];
		System.arraycopy(fruits, 0, apples, 0, 2);
		System.out.println(Arrays.asList(apples));
		RedApple[] redApples = new RedApple[2];
		try {
			System.arraycopy(fruits, 0, redApples, 0, 2);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(Arrays.asList(redApples));

		String[] strings = { "1", "2" };
		String[] strings2 = strings;
		System.arraycopy(strings, 0, strings2, 0, 2);
		strings2[0] = "3";
		System.out.println(Arrays.asList(strings));
		System.out.println(Arrays.asList(strings2));
	}

}
