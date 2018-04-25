package top.leagle.pattern.iterator.iterator4.menu;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {

	private Hashtable<String, MenuItem> menuItems;

	public CafeMenu() {
		menuItems = new Hashtable<>();

		addItem("Cafe A", "Cafe A", true, 2.99);
		addItem("Cafe B", "Cafe B", false, 3.99);
		addItem("Cafe C", "Cafe C", true, 4.99);
		addItem("Cafe D", "Cafe D", false, 5.99);
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(name, menuItem);
	}
}
