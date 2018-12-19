package top.leagle.pattern.flyweight;

public class FlyweightTest {
	private static final String CORLORS[] = { "Red", "Green", "Blue", "White", "Black" };
	private static int length = CORLORS.length;

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			Circle circle = ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}

	private static String getRandomColor() {
		return CORLORS[(int) (Math.random() * length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}
