package top.leagle.refactoring.chapter9.remove.control.flag;

public class Improvement1 {
	static void checkSecurity(String[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].equals("Don")) {
				System.out.println(people[i]);
				break;
			}

			if (people[i].equals("John")) {
				System.out.println(people[i]);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Improvement1.checkSecurity(new String[] { "Don", "Leagle" });
	}

}
