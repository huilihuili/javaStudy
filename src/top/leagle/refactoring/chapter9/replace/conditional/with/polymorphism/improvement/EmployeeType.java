package top.leagle.refactoring.chapter9.replace.conditional.with.polymorphism.improvement;

public abstract class EmployeeType {
	abstract int getType();

	abstract double payAmount(Employee employee);

	static EmployeeType newType(int code) {
		switch (code) {
		case ENGINEER:
			return new Engineer();
		case SALESMAN:
			return new Salesman();
		case MANAGER:
			return new Manager();
		default:
			throw new IllegalArgumentException("Incorrect Employee code");
		}
	}

	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
}
