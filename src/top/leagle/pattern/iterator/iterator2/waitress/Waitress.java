package top.leagle.pattern.iterator.iterator2.waitress;

import top.leagle.pattern.iterator.iterator2.menu.MenuItem;
import top.leagle.pattern.iterator.iterator2.iterator.Iterator;
import top.leagle.pattern.iterator.iterator2.menu.DinerMenu;
import top.leagle.pattern.iterator.iterator2.menu.PancakeHouseMenu;

public class Waitress {
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();

		System.out.println("----- pancakeHouseItems -----");
		printMenu(pancakeIterator);
		System.out.println("\n----- dinerItems -----");
		printMenu(dinerIterator);
	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem);
		}
	}

}
