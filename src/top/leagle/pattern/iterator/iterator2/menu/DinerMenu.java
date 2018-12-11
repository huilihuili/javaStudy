package top.leagle.pattern.iterator.iterator2.menu;

import top.leagle.pattern.iterator.iterator2.iterator.Iterator;
import top.leagle.pattern.iterator.iterator2.iterator.sub.DinerMenuIterator;

public class DinerMenu implements Menu<MenuItem> {
	private static final int MAX_ITEMS = 4;
	private int numberOfItems = 0;
	private MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("Diner A", "Diner A", true, 2.99);
		addItem("Diner B", "Diner B", false, 3.99);
		addItem("Diner C", "Diner C", true, 4.99);
		addItem("Diner D", "Diner D", false, 5.99);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("sorry, menu is full! can't add item to menu");
		} else {
			MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}
