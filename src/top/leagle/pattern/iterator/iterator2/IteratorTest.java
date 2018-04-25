package top.leagle.pattern.iterator.iterator2;

import org.junit.Test;

import top.leagle.pattern.iterator.iterator2.menu.DinerMenu;
import top.leagle.pattern.iterator.iterator2.menu.PancakeHouseMenu;
import top.leagle.pattern.iterator.iterator2.waitress.Waitress;

public class IteratorTest {

	@Test
	public void test1() {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

		waitress.printMenu();

	}
}
