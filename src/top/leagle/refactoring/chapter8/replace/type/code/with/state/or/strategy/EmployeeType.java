package top.leagle.refactoring.chapter8.replace.type.code.with.state.or.strategy;

public abstract class EmployeeType {
	abstract int getType();

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
