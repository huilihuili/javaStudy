package top.leagle.refactoring.chapter8.replace.subclass.with.fields.origin;

public abstract class Person {
	abstract boolean isMale();

	abstract char getCode();

	public static void main(String[] args) {
		Person male = new Male();
		System.out.println(male.getCode());

		Person female = new Female();
		System.out.println(female.getCode());
	}
}
