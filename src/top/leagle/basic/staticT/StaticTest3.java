package top.leagle.basic.staticT;

class Person {
	static {
		System.out.println("person static");
	}

	public Person(String str) {
		System.out.println("person " + str);
	}
}

class MyClass extends StaticTest3 {
	Person person = new Person("MyClass");
	static {
		System.out.println("myclass static");
	}

	public MyClass() {
		System.out.println("myclass constructor");
	}
}

public class StaticTest3 {
	Person person = new Person("Test");

	static {
		System.out.println("test static");
	}

	public StaticTest3() {
		System.out.println("test constructor");
	}

	public static void main(String[] args) {
		new MyClass();
	}
}
