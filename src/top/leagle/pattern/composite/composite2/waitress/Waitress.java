package top.leagle.pattern.composite.composite2.waitress;

import java.util.Iterator;

import top.leagle.pattern.composite.composite2.component.MenuComponent;

public class Waitress {
	MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void printMenu() {
		allMenus.print();
	}

	public void printVegerarianMenu() {
		Iterator<MenuComponent> iterator = allMenus.createIterator();
		System.out.println("\nVegeratrian Menu");
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			try {
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (Exception e) {

			}
		}
	}

}
