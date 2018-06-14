package top.leagle.refactoring.chapter11.extract.subclass.improvement;

public class JobItem {

	protected JobItem(int unitPrice, int quantity) {
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public int getTotalPrice() {
		return getUnitPrice() * quantity;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public boolean isLabor() {
		return false;
	}

	private int unitPrice;
	private int quantity;

	public static void main(String[] args) {
		JobItem notLabor = new JobItem(10, 10);
		JobItem labor = new LaborItem(10, new Employee(20));
		System.out.println(notLabor.getTotalPrice());
		System.out.println(labor.getTotalPrice());
	}
}
