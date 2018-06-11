package top.leagle.refactoring.chapter8.replace.data.value.with.object.improvement;

public class Customer {

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	private final String name;
}
