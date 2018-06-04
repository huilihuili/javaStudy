package top.leagle.refactoring.chapter1.demo1_5;

import org.junit.Test;

public class DemoTest {
	@Test
	public void test1() {
		Customer customer = new Customer("Leagle");
		customer.addRental(new Rental(new ChildrensMovie("重构"), 10));
		customer.addRental(new Rental(new RegularMovie("Java变成思想"), 10));
		customer.addRental(new Rental(new NewReaseMovie("鸟哥的Linux私房菜"), 10));
		System.out.println(customer.statement());
	}
}
