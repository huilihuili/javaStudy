package top.leagle.artofconcurrency.chapter5;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockExample {
	private static Map<String, Object> map = new HashMap<String, Object>();
	private static ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	private static Lock r = rwl.readLock();
	private static Lock w = rwl.writeLock();

	public static final Object get(String key) {
		r.lock();
		try {
			return map.get(key);
		} finally {
			r.unlock();
		}
	}

	public static final Object put(String key, Object value) {
		w.lock();
		try {
			return map.put(key, value);
		} finally {
			w.unlock();
		}
	}

	public static final void clear() {
		w.lock();
		try {
			map.clear();
		} finally {
			w.unlock();
		}
	}
}
