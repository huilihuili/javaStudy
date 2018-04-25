package top.leagle.basic.object;

class Shape1 {
	public String name = "shape";

	public Shape1() {
		System.out.println("shape constructor");
	}

	public void printType() {
		System.out.println("this is shape");
	}

	public static void printName() {
		System.out.println("shape");
	}
}

class Circle1 extends Shape1 {
	public String name = "circle";

	public Circle1() {
		System.out.println("circle constructor");
	}

	public void printType() {
		System.out.println("this is circle");
	}

	public static void printName() {
		System.out.println("circle");
	}
}

public class ObjectTest4 {
	public static void main(String[] args) {
		Shape1 shape1 = new Circle1();
		System.out.println(shape1.name);
		shape1.printType();
		shape1.printName();
	}

}
