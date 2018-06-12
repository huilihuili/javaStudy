package top.leagle.refactoring.chapter8.replace.type.code.with.subclasses.improvement;

public class Employee {
	private int type;
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

	public Employee() {
	}

	private Employee(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	@Override
	public String toString() {
		return "" + getType();
	}

	public static void main(String[] args) {
		Employee employee = create(Employee.ENGINEER);
		System.out.println(employee);

		employee = create(Employee.MANAGER);
		System.out.println(employee);
	}
}
