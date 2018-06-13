package top.leagle.refactoring.chapter9.replace.conditional.with.polymorphism.origin;

public class Employee {

	public Employee(int type) {
		this.type = EmployeeType.newType(type);
	}

	public double payAmount() {
		switch (getType()) {
		case EmployeeType.ENGINEER:
			return monthlySalary;
		case EmployeeType.SALESMAN:
			return monthlySalary + commission;
		case EmployeeType.MANAGER:
			return monthlySalary + bonus;
		default:
			throw new RuntimeException("Incorrect Employee");
		}
	}

	public int getType() {
		return type.getType();
	}

	public void setType(int type) {
		this.type = EmployeeType.newType(type);
	}

	@Override
	public String toString() {
		return "" + getType();
	}

	private EmployeeType type;
	private double monthlySalary = 50;
	private double commission = 20;
	private double bonus = 10;

	public static void main(String[] args) {
		Employee engineer = new Employee(EmployeeType.ENGINEER);
		Employee manager = new Employee(EmployeeType.MANAGER);
		System.out.println(engineer.payAmount());
		System.out.println(manager.payAmount());
	}
}
