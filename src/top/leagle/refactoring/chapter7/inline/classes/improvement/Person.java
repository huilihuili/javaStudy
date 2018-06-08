package top.leagle.refactoring.chapter7.inline.classes.improvement;

public class Person {
	public Person(String name, String officeAreaCode, String officeNumber) {
		this.name = name;
		this.officeAreaCode = officeAreaCode;
		this.officeNumber = officeNumber;
	}

	public String getTelephoneNumber() {
		return "(" + officeAreaCode + ") " + officeNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOfficeAreaCode() {
		return officeAreaCode;
	}

	public void setOfficeAreaCode(String officeAreaCode) {
		this.officeAreaCode = officeAreaCode;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	private String name;
	private String officeAreaCode;
	private String officeNumber;

	public static void main(String[] args) {
		Person person = new Person("Leagle", "010", "17091427995");
		System.out.println(person.getTelephoneNumber());
	}
}
