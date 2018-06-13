package top.leagle.refactoring.chapter10.separate.query.from.modifier;

public class Improvement {
	public String foundPerson(String[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].equals("Don") || people[i].equals("John")) {
				return people[i];
			}
		}
		return "";
	}

	public void sendAlert(String[] people) {
		if (!foundPerson(people).equals("")) {
			sendAlert();
		}
	}

	private void sendAlert() {
		System.out.println("###有人入侵了###");
	}

	public static void main(String[] args) {
		String[] people = { "Leagle", "Don" };
		new Improvement().sendAlert(people);
		System.out.println(new Improvement().foundPerson(people));
	}
}
