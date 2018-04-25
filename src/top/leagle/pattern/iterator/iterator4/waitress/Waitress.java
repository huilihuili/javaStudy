package top.leagle.pattern.iterator.iterator4.waitress;

import java.util.Iterator;

import top.leagle.pattern.iterator.iterator4.menu.Menu;
import top.leagle.pattern.iterator.iterator4.menu.MenuItem;

public class Waitress {
	private Menu pancakeHouseMenu;
	private Menu dinerMenu;
	private Menu cafeMenu;

	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}

	public void printMenu() {
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();

		System.out.println("----- pancakeHouseItems -----");
		printMenu(pancakeIterator);
		System.out.println("\n----- dinerItems -----");
		printMenu(dinerIterator);
		System.out.println("\n----- cafeItems -----");
		printMenu(cafeIterator);
	}

	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem);
		}
	}

}
