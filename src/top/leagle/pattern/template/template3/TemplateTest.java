package top.leagle.pattern.template.template3;

import java.util.Arrays;

import org.junit.Test;

import top.leagle.pattern.template.template3.duck.Duck;

public class TemplateTest {

	@Test
	public void test1() {
		Duck[] ducks = { new Duck("daffy", 8), new Duck("dewey", 2), new Duck("howard", 3), new Duck("huey", 7) };
		System.out.println("Before sorting:");
		display(ducks);
		
		System.out.println("\nAfter sorting:");
		Arrays.sort(ducks);
		display(ducks);
	}

	public static void display(Duck[] ducks) {
		for (int i = 0; i < ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}
}
