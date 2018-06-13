package top.leagle.refactoring.chapter9.replace.conditional.with.polymorphism.improvement;

public class Employee {

	public Employee(int type) {
		this.type = EmployeeType.newType(type);
	}

	public double payAmount() {
		return type.payAmount(this);
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

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
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
