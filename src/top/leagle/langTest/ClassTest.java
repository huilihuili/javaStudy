package top.leagle.langTest;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

import org.junit.Test;

public class ClassTest {

	@Test
	public void getGenericInterfacesTest() {
		System.out.println(Arrays.asList(TreeMap.class.getGenericInterfaces()));
		System.out.println(Arrays.asList(NavigableMap.class.getGenericInterfaces()));

		System.out.println(NavigableMap.class.getGenericInterfaces()[0] instanceof ParameterizedType);
		System.out.println(((ParameterizedType) NavigableMap.class.getGenericInterfaces()[0]).getRawType());
		System.out.println(((ParameterizedType) NavigableMap.class.getGenericInterfaces()[0]).getActualTypeArguments());
		System.out.println(Arrays
				.asList(((ParameterizedType) NavigableMap.class.getGenericInterfaces()[0]).getActualTypeArguments()));

		System.out.println(Arrays.asList(String.class.getGenericInterfaces()));
	}

	@Test
	public void typeTest() {
		List<Object> list = new ArrayList<>();
		list.add(new Integer(1));
		list.add(new String("123"));
		System.out.println(list.get(0).getClass());
		System.out.println(list.get(1).getClass());

		Object[] objects = new Object[] { new Integer(1), new String("123") };
		System.out.println(objects[0].getClass());
		System.out.println(objects[1].getClass());

		// System.out.println(typeFun(objects[0]));
	}

	public static void typeFun(Integer i) {
		System.out.println("This is a integer function");
	}

	public static void typeFun(String i) {
		System.out.println("This is a string function");
	}
}
