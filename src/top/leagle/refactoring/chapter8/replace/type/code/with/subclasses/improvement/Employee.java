package top.leagle.refactoring.chapter8.replace.type.code.with.subclasses.improvement;

public class Employee {
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	static Employee create(int type) {
		switch (type) {
		case ENGINEER:
			return new Engineer();
		case SALESMAN:
			return new Salesman();
		case MANAGER:
			return new Manager();
		default:
			throw new IllegalArgumentException("Incorrect type cade value");
		}
	}

	public int getType() {
		return -1;
	}

	public static void main(String[] args) {
		Employee enginer = create(Employee.ENGINEER);
		System.out.println(enginer.getType());

		Employee manager = create(Employee.MANAGER);
		System.out.println(manager.getType());
	}
}
