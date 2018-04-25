package top.leagle.pattern.composite.composite1.waitress;

import top.leagle.pattern.composite.composite1.component.MenuComponent;

public class Waitress {
	MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void printMenu() {
		allMenus.print();
	}

}
