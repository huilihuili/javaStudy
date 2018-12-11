package top.leagle.pattern.iterator.iterator2;

import org.junit.Test;

import top.leagle.pattern.iterator.iterator2.menu.DinerMenu;
import top.leagle.pattern.iterator.iterator2.waitress.Waitress;

public class IteratorTest {

	@Test
	public void test1() {
		DinerMenu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(dinerMenu);

		waitress.printMenu();
	}
}
