package top.leagle.refactoring.chapter6.substitute.algorithm;

import java.util.Arrays;
import java.util.List;

public class Improvement {
	static String foundPerson(String[] people) {
		List<String> candidates = Arrays.asList("Don", "John", "Kent");
		for (int i = 0; i < people.length; i++) {
			if (candidates.contains(people[i])) {
				return people[i];
			}
		}
		return "";
	}

	public static void main(String[] args) {
		System.out.println(foundPerson(new String[] { "Leagle", "Tom", "Kent" }));
	}
}
