package top.leagle.refactoring.chapter8.replace.type.code.with.subclasses.origin;

public class Employee {
	private int type;
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	public Employee(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "" + type;
	}

	public static void main(String[] args) {
		Employee employee = new Employee(Employee.ENGINEER);
		System.out.println(employee);

		employee = new Employee(Employee.MANAGER);
		System.out.println(employee);
	}
}
