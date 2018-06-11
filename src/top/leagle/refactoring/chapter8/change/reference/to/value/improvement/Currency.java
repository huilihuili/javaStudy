package top.leagle.refactoring.chapter8.change.reference.to.value.improvement;

public class Currency {

	public Currency(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Currency) && (((Currency) obj).getCode().equals(code));
	}

	@Override
	public int hashCode() {
		return code.hashCode();
	}

	private String code;

	public static void main(String[] args) {
		System.out.println(new Currency("USD").equals(new Currency("USD")));
	}
}
