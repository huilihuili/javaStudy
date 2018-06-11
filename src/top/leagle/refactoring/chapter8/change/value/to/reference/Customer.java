package top.leagle.refactoring.chapter8.change.value.to.reference;

public class Customer {
	public static Customer create(String name) {
		return new Customer(name);
	}

	public String getName() {
		return name;
	}

	private Customer(String name) {
		this.name = name;
	}

	private final String name;
}
