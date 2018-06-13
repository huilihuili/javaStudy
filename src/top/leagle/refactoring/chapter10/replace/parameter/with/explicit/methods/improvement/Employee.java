package top.leagle.refactoring.chapter10.replace.parameter.with.explicit.methods.improvement;

public class Employee {
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	static Employee createEngineer() {
		return new Engineer();
	}

	static Employee createSalesman() {
		return new Salesman();
	}

	static Employee createManager() {
		return new Manager();
	}

	public int getType() {
		return -1;
	}

	public static void main(String[] args) {
		Employee engineer = Employee.createEngineer();
		System.out.println(engineer.getType());

		Employee manager = Employee.createManager();
		System.out.println(manager.getType());
	}
}
