package top.leagle.refactoring.chapter7.extract.classes.improvement;

public class TelephoneNumber {

	public TelephoneNumber(String officeAreaCode, String officeNumber) {
		this.officeAreaCode = officeAreaCode;
		this.officeNumber = officeNumber;
	}

	public String getTelephoneNumber() {
		return "(" + officeAreaCode + ") " + officeNumber;
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

	private String officeAreaCode;
	private String officeNumber;
}
