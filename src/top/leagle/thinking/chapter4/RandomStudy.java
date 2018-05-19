package top.leagle.thinking.chapter4;

import java.util.Random;

import org.junit.Test;

/**
 * 
 * @ClassName: RandomStudy
 * @author: Leagle
 * @date: 2018年5月19日 下午4:18:26
 * @Description:
 * 		创建Random对象的时候，如果没有传递任何参数，
 * 那么java就会将当前时间作为随机生成器的种子，并由此
 * 在程序每一次执行时期都产生不同的输出。
 * 		
 * 		通过在创建Random对象时提供种子，用于随机数
 * 生成器的初始化值，随机数生成器对于特定的种子总是产生
 * 相同的随机数序列。
 */
public class RandomStudy {

	@Test
	public void test1() {
		Random random = new Random(47);
		int i, j, k;
		i = random.nextInt(100) + 1;
		j = random.nextInt(100) + 1;
		k = random.nextInt(100) + 1;
		System.out.println("i = " + i + "; j = " + j + "; k = " + k);
	}
}
