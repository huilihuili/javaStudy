package top.leagle.refactoring.chapter6.substitute.algorithm;

public class Origin {
	static String foundPerson(String[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].equals("Don")) {
				return "Don";
			}
			if (people[i].equals("John")) {
				return "John";
			}
			if (people[i].equals("Kent")) {
				return "Kent";
			}
		}
		return "";
	}

	public static void main(String[] args) {
		System.out.println(foundPerson(new String[] { "Leagle", "Tom", "Kent" }));
	}
}
