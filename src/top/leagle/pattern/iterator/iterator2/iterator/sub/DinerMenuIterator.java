package top.leagle.pattern.iterator.iterator2.iterator.sub;

import top.leagle.pattern.iterator.iterator2.menu.MenuItem;
import top.leagle.pattern.iterator.iterator2.iterator.Iterator;

public class DinerMenuIterator implements Iterator {

	private MenuItem[] items;
	int position = 0;

	public DinerMenuIterator(MenuItem[] menuItems) {
		this.items = menuItems;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position++;
		return menuItem;
	}

}
