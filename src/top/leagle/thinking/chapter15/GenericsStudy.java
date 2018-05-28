package top.leagle.thinking.chapter15;

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
}
