package top.leagle.pattern.composite.composite2.component.sub;

import java.awt.HeadlessException;
import java.util.Iterator;

import top.leagle.pattern.composite.composite2.component.MenuComponent;
import top.leagle.pattern.composite.composite2.iterator.CompositeIterator;
import top.leagle.pattern.composite.composite2.iterator.NullIterator;

public class MenuItem extends MenuComponent {

	private String name;
	private String description;
	private boolean vegetarian;
	private double price;

	public MenuItem(String name, String description, boolean vegetarian, double price) throws HeadlessException {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
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
	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	@Override
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void print() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", description=" + description + ", vegetarian=" + vegetarian + ", price="
				+ price + "]";
	}

	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}
}
