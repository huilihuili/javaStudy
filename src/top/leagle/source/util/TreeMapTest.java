package top.leagle.source.util;

import java.util.TreeMap;

import org.junit.Test;

public class TreeMapTest {

	@Test
	public void putTest() {
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		treeMap.put(1, 0);
		treeMap.put(2, 1);
		treeMap.put(3, 2);
		treeMap.put(4, 3);
		treeMap.put(5, 4);
		treeMap.put(6, 5);
		treeMap.put(7, 6);
	}
}
