package top.leagle.refactoring.chapter7.extract.classes.improvement;

public class Person {

	public Person(String name, TelephoneNumber officeTelePhone) {
		this.name = name;
		this.officeTelePhone = officeTelePhone;
	}

	public String getTelephoneNumber() {
		return officeTelePhone.getTelephoneNumber();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TelephoneNumber getOfficeTelephone() {
		return officeTelePhone;
	}

	public void setTelephoneNumber(TelephoneNumber telephoneNumber) {
		this.officeTelePhone = telephoneNumber;
	}

	private String name;
	private TelephoneNumber officeTelePhone;

	public static void main(String[] args) {
		Person person = new Person("Leagle", new TelephoneNumber("010", "17091427995"));
		System.out.println(person.getTelephoneNumber());
	}
}
