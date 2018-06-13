package top.leagle.refactoring.chapter9.remove.control.flag;

public class Origin1 {
	static void checkSecurity(String[] people) {
		boolean found = false;
		for (int i = 0; i < people.length; i++) {
			if (!found) {
				if (people[i].equals("Don")) {
					System.out.println(people[i]);
					found = true;
				}

				if (people[i].equals("John")) {
					System.out.println(people[i]);
					found = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		Origin1.checkSecurity(new String[] { "Don", "Leagle" });
	}

}
