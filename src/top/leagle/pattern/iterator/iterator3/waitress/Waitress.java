package top.leagle.pattern.iterator.iterator3.waitress;

import java.util.Iterator;

import top.leagle.pattern.iterator.iterator3.menu.Menu;
import top.leagle.pattern.iterator.iterator3.menu.MenuItem;

public class Waitress {
	private Menu pancakeHouseMenu;
	private Menu dinerMenu;

	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();

		System.out.println("----- pancakeHouseItems -----");
		printMenu(pancakeIterator);
		System.out.println("\n----- dinerItems -----");
		printMenu(dinerIterator);
	}

	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem);
		}
	}

}
