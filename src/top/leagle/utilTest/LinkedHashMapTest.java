package top.leagle.utilTest;

import java.util.LinkedHashMap;

import org.junit.Test;

public class LinkedHashMapTest {

	@Test
	public void iteratorTest() {
		LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>((int) (5 / 0.75 + 1), 0.75f, false);
		linkedHashMap.put(0, 0);
		linkedHashMap.put(1, 1);
		linkedHashMap.put(2, 2);
		linkedHashMap.put(3, 3);
		linkedHashMap.put(4, 4);
		linkedHashMap.get(0);
		linkedHashMap.get(1);
		for (Integer integer : linkedHashMap.keySet()) {
			System.out.println(integer);
		}

		System.out.println("====== 这是分割线 ======");

		linkedHashMap = new LinkedHashMap<>((int) (5 / 0.75 + 1), 0.75f, true);
		linkedHashMap.put(0, 0);
		linkedHashMap.put(1, 1);
		linkedHashMap.put(2, 2);
		linkedHashMap.put(3, 3);
		linkedHashMap.put(4, 4);
		linkedHashMap.get(0);
		linkedHashMap.get(1);
		for (Integer integer : linkedHashMap.keySet()) {
			System.out.println(integer);
		}
	}
}
