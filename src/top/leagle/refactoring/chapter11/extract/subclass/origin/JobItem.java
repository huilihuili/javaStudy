package top.leagle.refactoring.chapter11.extract.subclass.origin;

public class JobItem {

	public JobItem(int unitPrice, int quantity, Employee employee, boolean isLabor) {
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.employee = employee;
		this.isLabor = isLabor;
	}

	public int getTotalPrice() {
		return getUnitPrice() * quantity;
	}

	public int getUnitPrice() {
		return isLabor ? employee.getRate() : unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public Employee getEmployee() {
		return employee;
	}

	private int unitPrice;
	private int quantity;
	private Employee employee;
	private boolean isLabor;

	public static void main(String[] args) {
		JobItem notLabor = new JobItem(10, 10, new Employee(20), false);
		JobItem labor = new JobItem(10, 10, new Employee(20), true);
		System.out.println(notLabor.getTotalPrice());
		System.out.println(labor.getTotalPrice());
	}
}
