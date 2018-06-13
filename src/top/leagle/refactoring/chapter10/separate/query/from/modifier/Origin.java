package top.leagle.refactoring.chapter10.separate.query.from.modifier;

public class Origin {
	public String foundMiscreant(String[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].equals("Don") || people[i].equals("John")) {
				sendAlert();
				return people[i];
			}
		}
		return "";
	}

	private void sendAlert() {
		System.out.println("###有人入侵了###");
	}

	public static void main(String[] args) {
		String[] people = { "Leagle", "Don" };
		System.out.println(new Origin().foundMiscreant(people));
	}
}
