package top.leagle.refactoring.chapter8.replace.subclass.with.fields.improvement;

public class Person {
	static Person createMale() {
		return new Person(true, 'M');
	}

	static Person createFemale() {
		return new Person(false, 'F');
	}

	boolean isMale() {
		return isMale;
	}

	char getCode() {
		return code;
	}

	private Person(boolean isMale, char code) {
		this.isMale = isMale;
		this.code = code;
	}

	private final boolean isMale;
	private final char code;

	public static void main(String[] args) {
		Person male = Person.createMale();
		System.out.println(male.getCode());

		Person female = Person.createFemale();
		System.out.println(female.getCode());
	}
}
