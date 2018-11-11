package top.leagle.jvm.chapter8;

public class StaticDispatch {
	static abstract class Human {

	}

	static class Man extends Human {

	}

	static class Woman extends Human {

	}

	public void sayHello(Human guy) {
		System.out.println("hello, guy!");
	}

	public void sayHello(Man guy) {
		System.out.println("hello, getleman!");
	}

	public void sayHello(Woman guy) {
		System.out.println("hello, lady!");
	}

	public static void main(String[] args) {
		Human man = new Man();
		Human woman = new Woman();

		StaticDispatch staticDispatch = new StaticDispatch();
		staticDispatch.sayHello(man);
		staticDispatch.sayHello(woman);
	}
}
