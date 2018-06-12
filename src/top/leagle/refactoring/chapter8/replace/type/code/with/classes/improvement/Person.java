package top.leagle.refactoring.chapter8.replace.type.code.with.classes.improvement;

public class Person {

	public Person(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	private BloodGroup bloodGroup;

	public static void main(String[] args) {
		Person person = new Person(BloodGroup.AB);
		System.out.println(person.getBloodGroup());

		person.setBloodGroup(BloodGroup.B);
		System.out.println(person.getBloodGroup());
	}
}
