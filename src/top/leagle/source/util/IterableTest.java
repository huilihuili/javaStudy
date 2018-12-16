package top.leagle.source.util;

import java.util.Iterator;

public class IterableTest {
	public static void main(String[] args) {
		IterableApp iterableApp = new IterableApp();
		for (Integer i : iterableApp) {
			System.out.println(i);
		}
	}

	public static class IterableApp implements Iterable<Integer> {
		@Override
		public Iterator<Integer> iterator() {
			return new IteratorApp();
		}

		private class IteratorApp implements Iterator<Integer> {
			private int size = 3;
			private int cursor = 0;

			@Override
			public boolean hasNext() {
				return cursor < size;
			}

			@Override
			public Integer next() {
				return cursor++;
			}
		}
	}
}
