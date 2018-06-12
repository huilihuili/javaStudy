package top.leagle.refactoring.chapter8.replace.type.code.with.classes.origin;

public class Person {
	public static final int O = 0;
	public static final int A = 1;
	public static final int B = 2;
	public static final int AB = 3;

	public Person(int bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(int bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	private int bloodGroup;

	public static void main(String[] args) {
		Person person = new Person(Person.AB);
		System.out.println(person.getBloodGroup());

		person.setBloodGroup(Person.B);
		System.out.println(person.getBloodGroup());
	}
}
