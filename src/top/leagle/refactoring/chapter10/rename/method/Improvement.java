package top.leagle.refactoring.chapter10.rename.method;

public class Improvement {
	public String getOfficeTelephoneNumber() {
		return "(" + officeAreaCode + ") " + officeNumber;
	}

	private String officeAreaCode = "101";
	private String officeNumber = "17091427995";

	public static void main(String[] args) {
		System.out.println(new Improvement().getOfficeTelephoneNumber());
	}
}
