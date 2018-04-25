package top.leagle.pattern.iterator.iterator3.iterator;

import java.util.Iterator;

import top.leagle.pattern.iterator.iterator3.menu.MenuItem;

public class DinerMenuIterator implements Iterator<MenuItem> {

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
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position++;
		return menuItem;
	}

	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException();
		}

		if (items[position - 1] != null) {
			for (int i = position - 1; i < (items.length - 1); i++) {
				items[i] = items[i + 1];
			}
			items[items.length - 1] = null;
		}
	}

}
