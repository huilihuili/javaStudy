package top.leagle.pattern.singleton.singleton2;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void test1() {
		ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
		chocolateBoiler.fill();
		chocolateBoiler.boil();
		chocolateBoiler.drain();
	}
}
