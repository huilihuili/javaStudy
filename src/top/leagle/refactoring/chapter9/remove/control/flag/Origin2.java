package top.leagle.refactoring.chapter9.remove.control.flag;

public class Origin2 {
	static String checkSecurity(String[] people) {
		String found = "";
		for (int i = 0; i < people.length; i++) {
			if (found.equals("")) {
				if (people[i].equals("Don")) {
					found = people[i];
				}

				if (people[i].equals("John")) {
					found = people[i];
				}
			}
		}
		return found;
	}

	public static void main(String[] args) {
		System.out.println(Origin2.checkSecurity(new String[] { "Don", "Leagle" }));
	}

}
