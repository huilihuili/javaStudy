package top.leagle.pattern.singleton.singleton1;

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
