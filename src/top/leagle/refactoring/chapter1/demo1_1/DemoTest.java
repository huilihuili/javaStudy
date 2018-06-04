package top.leagle.refactoring.chapter1.demo1_1;

import org.junit.Test;

public class DemoTest {
	@Test
	public void test1() {
		Customer customer = new Customer("Leagle");
		customer.addRental(new Rental(new Movie("重构", Movie.CHILDRENS), 10));
		customer.addRental(new Rental(new Movie("Java变成思想", Movie.REGULAR), 10));
		customer.addRental(new Rental(new Movie("鸟哥的Linux私房菜", Movie.NEW_REALEASE), 10));
		System.out.println(customer.statement());
	}
}
