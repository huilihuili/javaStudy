package top.leagle.pattern.iterator.iterator2.menu;

import top.leagle.pattern.iterator.iterator2.iterator.Iterator;

public interface Menu<T> {
	Iterator<T> createIterator();
}
