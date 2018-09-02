package top.leagle.jvm.chapter11;

class B {
	private int value = 1;

	final int get() {
		return value;
	}
}

class C {
	public int foo() {
		B b = new B();
		int y = b.get();
		int z = b.get();
		int sum = y + z;
		return sum;
	}
}

public class Test1 {
	public static void main(String[] args) {
		System.out.println(new C().foo());
	}

}
