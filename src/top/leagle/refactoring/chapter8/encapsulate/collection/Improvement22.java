package top.leagle.refactoring.chapter8.encapsulate.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Improvement22 {
	public static void print(String[] skills) {
		for (String string : skills) {
			System.out.print(string + " ");
		}
		System.out.println();
	}

	public String[] getSkills() {
		return skills.toArray(new String[0]);
	}

	public void setSkills(int index, String newSkill) {
		skills.set(index, newSkill);
	}

	public void setSkills(String[] skills) {
		this.skills.addAll(Arrays.asList(skills));
	}

	private List<String> skills = new ArrayList<>();

	public static void main(String[] args) {
		String[] skills = new String[] { "ping-pong", "coding", "operating" };

		Improvement22 improvement2 = new Improvement22();
		improvement2.setSkills(skills);
		Improvement22.print(improvement2.getSkills());

		String basketball = "basketball";
		improvement2.getSkills()[0] = basketball;
		Improvement22.print(improvement2.getSkills());

		improvement2.setSkills(0, basketball);
		Improvement22.print(improvement2.getSkills());
	}
}
