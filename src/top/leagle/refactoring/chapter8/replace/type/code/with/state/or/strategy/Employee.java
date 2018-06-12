package top.leagle.refactoring.chapter8.replace.type.code.with.state.or.strategy;

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
	private double monthlySalary;
	private double commission;
	private double bonus;

	public static void main(String[] args) {
	}
}
