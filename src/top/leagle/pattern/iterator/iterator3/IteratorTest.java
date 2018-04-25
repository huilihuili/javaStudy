package top.leagle.pattern.iterator.iterator3;

import org.junit.Test;

import top.leagle.pattern.iterator.iterator3.menu.DinerMenu;
import top.leagle.pattern.iterator.iterator3.menu.Menu;
import top.leagle.pattern.iterator.iterator3.menu.PancakeHouseMenu;
import top.leagle.pattern.iterator.iterator3.waitress.Waitress;

public class IteratorTest {

	@Test
	public void test1() {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

		waitress.printMenu();

	}
}
