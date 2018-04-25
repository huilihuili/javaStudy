package top.leagle.pattern.iterator.iterator4;

import org.junit.Test;

import top.leagle.pattern.iterator.iterator4.menu.CafeMenu;
import top.leagle.pattern.iterator.iterator4.menu.DinerMenu;
import top.leagle.pattern.iterator.iterator4.menu.Menu;
import top.leagle.pattern.iterator.iterator4.menu.PancakeHouseMenu;
import top.leagle.pattern.iterator.iterator4.waitress.Waitress;

public class IteratorTest {

	@Test
	public void test1() {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Menu cafeMenu = new CafeMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

		waitress.printMenu();

	}
}
