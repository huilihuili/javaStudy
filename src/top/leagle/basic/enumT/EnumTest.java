package top.leagle.basic.enumT;

import org.junit.Test;

enum Color {
	RED, GREEN, BLANK, YELLOW
}

enum Color1 {

	RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);

	private String name;
	private int index;

	private Color1(String name, int index) {
		this.name = name;
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}

public class EnumTest {

	@Test
	public void test1() {
		System.out.println(isRed(Color.RED));
		System.out.println(isRed(Color.GREEN));
	}

	@Test
	public void test2() {
		showColor(Color.RED);
		showColor(Color.GREEN);
	}

	@Test
	public void test3() {
		// 输出某一枚举的值
		System.out.println(Color1.RED.getName());
		System.out.println(Color1.RED.getIndex());

		// 遍历所有的枚举
		for (Color1 color : Color1.values()) {
			System.out.println(color + "  name: " + color.getName() + "  index: " + color.getIndex());
		}
	}

	public boolean isRed(Color color) {
		if (Color.RED.equals(color)) {
			return true;
		} else {
			return false;
		}
	}

	public void showColor(Color color) {
		switch (color) {
		case BLANK:
			System.out.println(color);
			break;
		case RED:
			System.out.println(color);
			break;
		default:
			System.out.println(color);
			break;
		}
	}
}
