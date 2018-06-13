package top.leagle.refactoring.chapter9.remove.control.flag;

public class Improvement2 {
	static String checkSecurity(String[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].equals("Don")) {
				return people[i];
			}

			if (people[i].equals("John")) {
				return people[i];
			}
		}
		return "";
	}

	public static void main(String[] args) {
		System.out.println(Improvement2.checkSecurity(new String[] { "Don", "Leagle" }));
	}

}
