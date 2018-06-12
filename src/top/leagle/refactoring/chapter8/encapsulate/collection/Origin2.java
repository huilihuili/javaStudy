package top.leagle.refactoring.chapter8.encapsulate.collection;

public class Origin2 {
	public static void print(String[] skills) {
		for (String string : skills) {
			System.out.print(string + " ");
		}
		System.out.println();
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	private String[] skills;

	public static void main(String[] args) {
		String[] skills = new String[] { "ping-pong", "coding", "operating" };

		Origin2 origin2 = new Origin2();
		origin2.setSkills(skills);

		Origin2.print(origin2.getSkills());
		
		origin2.getSkills()[0] = "basketball";
		Origin2.print(origin2.getSkills());
	}
}
