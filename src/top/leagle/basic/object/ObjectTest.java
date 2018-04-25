package top.leagle.basic.object;

import org.junit.Test;

class Bread {
	static {
		System.out.println("Bread is loaded");
	}

	public Bread() {
		System.out.println("bread");
	}
}

public class ObjectTest {

	@Test
	public void test1() {
		Bread bread1 = new Bread();
		Bread bread2 = new Bread();
	}
}
