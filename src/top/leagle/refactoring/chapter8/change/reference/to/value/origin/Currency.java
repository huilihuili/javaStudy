package top.leagle.refactoring.chapter8.change.reference.to.value.origin;

public class Currency {

	public Currency(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	private String code;

	public static void main(String[] args) {
		System.out.println(new Currency("USD").equals(new Currency("USD")));
	}
}
