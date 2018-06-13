package top.leagle.refactoring.chapter8.replace.type.code.with.state.or.strategy;

public class Employee {

	public Employee(int type) {
		this.type = EmployeeType.newType(type);
	}

	public int getType() {
		return type.getType();
	}

	public void setType(int type) {
		this.type = EmployeeType.newType(type);
	}

	private EmployeeType type;

	public static void main(String[] args) {
		Employee engineer = new Employee(EmployeeType.ENGINEER);
		Employee manager = new Employee(EmployeeType.MANAGER);

		System.out.println(engineer.getType());
		System.out.println(manager.getType());
	}
}
