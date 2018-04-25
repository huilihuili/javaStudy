package top.leagle.pattern.composite.composite1;

import org.junit.Test;

import top.leagle.pattern.composite.composite1.component.MenuComponent;
import top.leagle.pattern.composite.composite1.component.sub.Menu;
import top.leagle.pattern.composite.composite1.component.sub.MenuItem;
import top.leagle.pattern.composite.composite1.waitress.Waitress;

public class CompositeTest {

	@Test
	public void test1() {
		MenuComponent allMenus = new Menu("all menus", "all menus combined");
		MenuComponent pancakeHouseMenu = new Menu("pancake house menu", "breakfast");
		MenuComponent dinerMenu = new Menu("diner menu", "lunch");

		pancakeHouseMenu.add(new MenuItem("pancakeHouseMenu A", "pancakeHouseMenu A", true, 1.99));
		pancakeHouseMenu.add(new MenuItem("pancakeHouseMenu B", "pancakeHouseMenu B", false, 2.99));

		dinerMenu.add(new MenuItem("dinerMenu A", "dinerMenu A", true, 3.99));
		dinerMenu.add(new MenuItem("dinerMenu B", "dinerMenu B", false, 4.99));

		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);

		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}
}
