package top.leagle.pattern.decorator.decorator4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void test1() {
		String filePath = "D:\\github\\javaStudy\\study\\src\\top\\leagle\\design\\decorator\\decorator4\\decorator.txt";
		int c;
		try {
			InputStream inputStream = new BufferedInputStream(new FileInputStream(filePath));
			while ((c = inputStream.read()) >= 0) {
				System.out.print((char) c);
			}
			System.out.println();

			inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(filePath)));
			while ((c = inputStream.read()) >= 0) {
				System.out.print((char) c);
			}
			System.out.println();

			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
