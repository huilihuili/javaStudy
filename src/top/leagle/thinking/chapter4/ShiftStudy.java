package top.leagle.thinking.chapter4;

import org.junit.Test;

/**
 * 
 * @ClassName: ShiftStudy
 * @author: Leagle
 * @date: 2018年5月19日 下午4:50:50
 * @Description: 对char、byte或者short类型的数值进行移位处理， 那么在移位之前，它们会被转为int类型，并且得到的结果也是
 *               一个int类型的值。
 */
public class ShiftStudy {

	@Test
	public void test1() {
		byte b = -1;
		System.out.println(Integer.toBinaryString(b));
		b >>>= 10;
		System.out.println(Integer.toBinaryString(b));

		b = -1;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(b >>> 10));
	}

	@Test
	public void test2() {
		byte b = -1;
		System.out.println(Integer.toBinaryString(b));
		b >>>= 10;
		System.out.println(Integer.toBinaryString(b));

		b = -1;
		System.out.println(Integer.toBinaryString(b));
		b = (byte) (b >>> 10);
		System.out.println(Integer.toBinaryString(b));
	}
}
