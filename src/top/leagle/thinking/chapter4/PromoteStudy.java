package top.leagle.thinking.chapter4;

import org.junit.Test;

/**
 * 
 * @ClassName: PromoteStudy
 * @author: Leagle
 * @date: 2018年5月19日 下午5:04:12
 * @Description:
 * 		如果对基本类型数据类型进行算术运算或按位运算，
 * 只要类型比int小（即char、byte和short），那么在
 * 运算之前，这些值会自动转换为int，生成的结果也是int
 * 类型。
 */
public class PromoteStudy {

	@Test
	public void test1() {
		short x = 10, y = 20;

		x = (short) (x + y);
		x = (short) (x - y);
		x = (short) (x * y);
		x = (short) (x / y);
		x = (short) (x % y);
		x = (short) +y;
		x = (short) -y;

		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
	}

	@Test
	public void test2() {
		short x = 10, y = 20;

		x = (short) (x & y);
		x = (short) (x | y);
		x = (short) (x ^ y);
		x = (short) (x << 1);
		x = (short) (x >> 1);
		x = (short) (x >>> 1);

		x &= y;
		x |= y;
		x ^= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
	}
}
