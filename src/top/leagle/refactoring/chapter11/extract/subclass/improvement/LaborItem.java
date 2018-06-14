package top.leagle.refactoring.chapter11.extract.subclass.improvement;

public class LaborItem extends JobItem {

	public LaborItem(int quantity, Employee employee) {
		super(0, quantity);
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	@Override
	public boolean isLabor() {
		return true;
	}

	@Override
	public int getUnitPrice() {
		return employee.getRate();
	}

	private Employee employee;
}
