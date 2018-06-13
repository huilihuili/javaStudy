package top.leagle.refactoring.chapter8.replace.type.code.with.subclasses.origin;

public class Employee {
	private int type;
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	public Employee(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public static void main(String[] args) {
		Employee engineer = new Employee(Employee.ENGINEER);
		System.out.println(engineer.getType());

		Employee manager = new Employee(Employee.MANAGER);
		System.out.println(manager.getType());
	}
}
