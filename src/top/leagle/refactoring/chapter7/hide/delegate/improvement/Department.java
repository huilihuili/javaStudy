package top.leagle.refactoring.chapter7.hide.delegate.improvement;

public class Department {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getManager() {
		return manager;
	}

	public void setManager(Person manager) {
		this.manager = manager;
	}

	private String name;
	private Person manager;
}
