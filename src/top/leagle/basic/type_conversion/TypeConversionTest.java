package top.leagle.basic.type_conversion;

import org.junit.Test;

public class TypeConversionTest {

	@Test
	public void test() {
		int gradeLev = 2;
		String schoolName = "²ÜÐÐÖÐÑ§";
		System.out.println(gradeLev + " " + schoolName);

		Object gradeLev1 = gradeLev;
		Object schoolName1 = schoolName;
		System.out.println(gradeLev1 + " " + schoolName1);

		int gradeLev2 = (int) gradeLev1;
		String schoolName2 = (String) schoolName1;
		System.out.println(gradeLev2 + " " + schoolName2);

	}
}
