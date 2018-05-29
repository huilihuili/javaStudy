package top.leagle.thinking.chapter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class GenericsStudy {
	public <T> void f(T x) {
		System.out.println(x.getClass().getName());
	}

	@Test
	public void test1() {
		GenericsStudy gm = new GenericsStudy();
		gm.f("");
		gm.f(1);
		gm.f(1.0);
		gm.f(1.0F);
		gm.f('c');
		gm.f(gm);
	}

	@Test
	public void test2() {
		Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> b = new HashSet<>(Arrays.asList(2, 3, 4));
		System.out.println(Sets.union(a, b));
		System.out.println(Sets.intersection(a, b));
		System.out.println(Sets.difference(a, b));
		System.out.println(Sets.complement(a, b));
	}

	@Test
	public void test3() {
		// List<Fruit> fList = new ArrayList<Apple>();
		// cannot convert from ArrayList<Apple> to List<Fruit>

		List<? extends Fruit> fList = new ArrayList<Apple>();
		// fList.add(new Fruit());
		// fList.add(new Apple());
		// The method add(capture#2-of ? extends Fruit) in the type List<capture#2-of ?
		// extends Fruit> is not applicable for the arguments (Apple)
		System.out.println(fList);
		fList = Arrays.asList(new Apple(), new Jonathan());
		System.out.println(fList);

	}

	public void WriteTo(List<? super Apple> apples) {
		apples.add(new Apple());
		apples.add(new Jonathan());
		// apples.add(new Fruit());
	}

	@Test
	public void test4() {
		List<Apple> fList = new ArrayList<>();
		WriteTo(fList);
		System.out.println(fList);
	}
}

class Sets {
	public static <E> Set<E> union(Set<E> a, Set<E> b) {
		Set<E> result = new HashSet<>(a);
		result.addAll(b);
		return result;
	}

	public static <E> Set<E> intersection(Set<E> a, Set<E> b) {
		Set<E> result = new HashSet<>(a);
		result.retainAll(b);
		return result;
	}

	public static <E> Set<E> difference(Set<E> superset, Set<E> subset) {
		Set<E> result = new HashSet<>(superset);
		result.removeAll(subset);
		return result;
	}

	public static <E> Set<E> complement(Set<E> a, Set<E> b) {
		return difference(union(a, b), intersection(a, b));
	}
}

class Fruit {
}

class Apple extends Fruit {
}

class Jonathan extends Apple {
}

class Orange extends Fruit {
}
