package top.leagle.basic.object;

class Draw {

	public Draw(String type) {
		System.out.println(type + " draw constructor");
	}
}

class Shape {
	private Draw draw = new Draw("shape");

	public Shape() {
		System.out.println("shape constructor");
	}
}

class Circle extends Shape {
	private Draw draw = new Draw("circle");

	public Circle() {
		System.out.println("circle constructor");
	}
}

public class ObjectTest3 {
	public static void main(String[] args) {
		new Circle();
	}
}
