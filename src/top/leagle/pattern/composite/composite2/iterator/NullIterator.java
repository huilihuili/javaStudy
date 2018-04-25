package top.leagle.pattern.composite.composite2.iterator;

import java.util.Iterator;

import top.leagle.pattern.composite.composite2.component.MenuComponent;

public class NullIterator implements Iterator<MenuComponent> {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public MenuComponent next() {
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
