package top.leagle.pattern.composite.composite1.component.sub;

import java.util.ArrayList;
import java.util.Iterator;

import top.leagle.pattern.composite.composite1.component.MenuComponent;

public class Menu extends MenuComponent {
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	private String name;
	private String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Menu [menuComponents=" + menuComponents + ", name=" + name + ", description=" + description + "]";
	}

	@Override
	public void print() {
		System.out.println("\nMenu [" + "name=" + name + ", description=" + description + "]");

		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
	}

	@Override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}


}
