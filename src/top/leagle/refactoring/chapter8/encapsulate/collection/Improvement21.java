package top.leagle.refactoring.chapter8.encapsulate.collection;

public class Improvement21 {
	public static void print(String[] skills) {
		for (String string : skills) {
			System.out.print(string + " ");
		}
		System.out.println();
	}

	public String[] getSkills() {
		String[] result = new String[skills.length];
		System.arraycopy(skills, 0, result, 0, skills.length);
		return result;
	}

	public void setSkills(int index, String newSkill) {
		skills[index] = newSkill;
	}

	public void setSkills(String[] skills) {
		this.skills = new String[skills.length];
		for (int i = 0; i < skills.length; i++) {
			setSkills(i, skills[i]);
		}
	}

	private String[] skills;

	public static void main(String[] args) {
		String[] skills = new String[] { "ping-pong", "coding", "operating" };

		Improvement21 improvement2 = new Improvement21();
		improvement2.setSkills(skills);

		Improvement21.print(improvement2.getSkills());

		String basketball = "basketball";
		improvement2.getSkills()[0] = basketball;
		Improvement21.print(improvement2.getSkills());

		improvement2.setSkills(0, basketball);
		Improvement21.print(improvement2.getSkills());
	}
}
