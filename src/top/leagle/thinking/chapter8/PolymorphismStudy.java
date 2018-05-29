package top.leagle.thinking.chapter8;

import org.junit.Test;

public class PolymorphismStudy {

	@Test
	public void test1() {
		Super sup = new Sub();
		System.out.println("sup.field = " + sup.field + ", sup.getField() = " + sup.getField());

		Sub sub = new Sub();
		System.out.println("sub.field = " + sub.field + ", sub.getField() = " + sub.getField()
				+ ", sub.getSuperField() = " + sub.getSuperSield());
	}

	@Test
	public void test2() {
		new RoundGlyph(5);
	}
}

class Super {
	public int field = 0;

	public int getField() {
		return field;
	}
}

class Sub extends Super {
	public int field = 1;

	@Override
	public int getField() {
		return field;
	}

	public int getSuperSield() {
		return super.field;
	}
}

class Glypy {
	void draw() {
		System.out.println("Glyph.draw()");
	}

	public Glypy() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glypy() after draw()");
	}
}

class RoundGlyph extends Glypy {
	private int radius = 1;

	public RoundGlyph(int r) {
		radius = r;
		System.out.println("GoundGlyph.RoundGlyph(), radius = " + radius);
	}

	@Override
	void draw() {
		System.out.println("GoundGlyph.draw(), radius = " + radius);
	}
}