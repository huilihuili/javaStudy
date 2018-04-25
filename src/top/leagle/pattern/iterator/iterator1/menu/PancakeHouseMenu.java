package top.leagle.pattern.iterator.iterator1.menu;

import java.util.ArrayList;

public class PancakeHouseMenu {
	private ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();

		addItem("PancakeHouse A", "PancakeHouse A", true, 2.99);
		addItem("PancakeHouse B", "PancakeHouse B", false, 3.99);
		addItem("PancakeHouse C", "PancakeHouse C", true, 4.99);
		addItem("PancakeHouse D", "PancakeHouse D", false, 5.99);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
}
