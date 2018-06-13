package top.leagle.refactoring.chapter10.replace.parameter.with.explicit.methods.origin;

public class Employee {
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	static Employee create(int code) {
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

	public int getType() {
		return -1;
	}

	public static void main(String[] args) {
		Employee engineer = Employee.create(Employee.ENGINEER);
		System.out.println(engineer.getType());

		Employee manager = Employee.create(Employee.MANAGER);
		System.out.println(manager.getType());
	}
}
