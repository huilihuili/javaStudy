package top.leagle.basic.object;

class Meal {

	public Meal() {
		System.out.println("meal");
	}

	Bread1 bread = new Bread1();
}

class Bread1 {

	public Bread1() {
		System.out.println("bread");
	}
}

public class ObjectTest2 {
	public static void main(String[] args) {
		new Meal();
	}
}
