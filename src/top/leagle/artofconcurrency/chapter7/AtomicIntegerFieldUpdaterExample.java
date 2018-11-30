package top.leagle.artofconcurrency.chapter7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class AtomicIntegerFieldUpdaterExample {

	public static void main(String[] args) {
		AtomicIntegerFieldUpdater<User> a = AtomicIntegerFieldUpdater.newUpdater(User.class, "old");
		User conan = new User("conan", 10);
		System.out.println(a.getAndIncrement(conan));
		System.out.println(a.get(conan));
		System.out.println(conan.getOld());
	}

	static class User {
		private String name;
		public volatile int old;

		public User(String name, int old) {
			this.name = name;
			this.old = old;
		}

		public String getName() {
			return name;
		}

		public int getOld() {
			return old;
		}

	}
}
