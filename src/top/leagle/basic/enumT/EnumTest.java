package top.leagle.basic.enumT;

import org.junit.Test;

enum Color {
	RED, GREEN, BLANK, YELLOW
}

enum Color1 {

	RED("��ɫ", 1), GREEN("��ɫ", 2), BLANK("��ɫ", 3), YELLO("��ɫ", 4);

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
		// ���ĳһö�ٵ�ֵ
		System.out.println(Color1.RED.getName());
		System.out.println(Color1.RED.getIndex());

		// �������е�ö��
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
