package top.leagle.pattern.iterator.iterator2.iterator.sub;

import java.util.ArrayList;

import top.leagle.pattern.iterator.iterator2.iterator.Iterator;
import top.leagle.pattern.iterator.iterator2.menu.MenuItem;

public class PancakeHouseMenuIterator implements Iterator {
	private ArrayList<MenuItem> items;
	int position = 0;

	public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.size() || items.get(position) == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = items.get(position);
		position++;
		return menuItem;
	}

}
