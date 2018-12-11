  package top.leagle.pattern.iterator.iterator2.waitress;

import top.leagle.pattern.iterator.iterator2.iterator.Iterator;
import top.leagle.pattern.iterator.iterator2.menu.DinerMenu;
import top.leagle.pattern.iterator.iterator2.menu.MenuItem;

public class Waitress {
	private DinerMenu dinerMenu;

	public Waitress(DinerMenu dinerMenu) {
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();

		System.out.println("\n----- dinerItems -----");
		printMenu(dinerIterator);
	}

	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.println(menuItem);
		}
	}

}
