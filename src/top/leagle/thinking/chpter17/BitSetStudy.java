package top.leagle.thinking.chpter17;

import java.util.BitSet;

import org.junit.Test;

public class BitSetStudy {

	@Test
	public void test1() {
		BitSet bitSet = new BitSet();
		bitSet.set(0);
		bitSet.set(1);
		System.out.println(bitSet);
		System.out.println(bitSet.size());

		for (int i = 0; i < bitSet.size(); i++) {
			System.out.print(bitSet.get(i) ? "1" : "0");
		}
		System.out.println();
	}
}
