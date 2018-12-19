package top.leagle.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	private static final Map<String, Circle> CIRCLE_MAP = new HashMap<>();

	public static Circle getCircle(String color) {
		Circle circle = CIRCLE_MAP.get(color);
		if (circle == null) {
			circle = new Circle(color);
			CIRCLE_MAP.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}
