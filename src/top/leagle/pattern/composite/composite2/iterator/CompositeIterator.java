package top.leagle.pattern.composite.composite2.iterator;

import java.util.Iterator;
import java.util.Stack;

import top.leagle.pattern.composite.composite2.component.MenuComponent;
import top.leagle.pattern.composite.composite2.component.sub.Menu;

public class CompositeIterator implements Iterator<MenuComponent> {
	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	@Override
	public MenuComponent next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent menuComponent = iterator.next();
			if (menuComponent instanceof Menu) {
				stack.push(menuComponent.createIterator());
			}
			return menuComponent;
		} else {
			return null;
		}
	}

	@Override
	public void remove() {

	}

}
