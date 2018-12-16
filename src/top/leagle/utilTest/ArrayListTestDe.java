package top.leagle.utilTest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ArrayListTestDe {

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
	}

	static class Fruit extends Food implements Cloneable {
		public String name;

		@Override
		protected Fruit clone() throws CloneNotSupportedException {
			return (Fruit) super.clone();
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
	public void ObjectCloneTest() throws CloneNotSupportedException {
		Fruit[] fruits = new Fruit[4];

		fruits[0] = new Apple();
		fruits[0].name = "clone before";

		Fruit[] fruits2 = fruits.clone();
		System.out.println(fruits[0].name);
		System.out.println(fruits2[0].name);

		fruits2[0].name = "clone After";
		System.out.println(fruits[0].name);
		System.out.println(fruits2[0].name);

		Fruit fruit = new Fruit();
		fruit.name = "hh";

		Fruit fruit2 = fruit.clone();
		System.out.println(fruit.name);
		System.out.println(fruit2.name);

		fruit2.name = "jj";
		System.out.println(fruit.name);
		System.out.println(fruit2.name);
	}

	@Test
	public void toArrayTest2() {
		List<String> list = new ArrayList<>(Arrays.asList("list"));
		System.out.println(list.getClass());// class java.util.ArrayList
		Object[] listArray = list.toArray();
		System.out.println(listArray.getClass());// class [Ljava.lang.Object;
		listArray[0] = new Object();

		List<String> asList = Arrays.asList("asList");
		System.out.println(asList.getClass());// class java.util.Arrays$ArrayList
		Object[] asListArray = asList.toArray();
		System.out.println(asListArray.getClass());// class [Ljava.lang.String;
		asListArray[0] = new Object();// ! java.lang.ArrayStoreException

		String[] strings = { new String() };
		Object[] objects = strings;
		objects[0] = new Object();// ! java.lang.ArrayStoreException
	}

	@Test
	public void hashCodeTest() {
		String string = new String("hhh");
		String string2 = new String("ddd");
		String string3 = new String("hhh");
		System.out.println(string.hashCode());
		System.out.println(string2.hashCode());
		System.out.println(string3.hashCode());
	}

	@Test
	public void arrayListAddTest() {
		ArrayList<Integer> arrayList = new ArrayList<>(0);
		arrayList.add(1);

		ArrayList<Integer> arrayList2 = new ArrayList<>(1);
		arrayList2.add(1);
		arrayList2.add(2);

		ArrayList<Integer> arrayList3 = new ArrayList<>();
		arrayList3.add(1);
	}

	@Test
	public void ensureCapacityTest() {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.ensureCapacity(3);

		arrayList.add(1);

		arrayList.ensureCapacity(3);
		arrayList.add(2);
	}

}
