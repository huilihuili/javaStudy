package top.leagle.refactoring.chapter8.change.value.to.reference;

public class Order {

	public Order(String name) {
		customer = Customer.create(name);
	}

	public String getCustomer() {
		return customer.getName();
	}

	public void setCustomer(String name) {
		customer = Customer.create(name);
	}

	private Customer customer;

	public static void main(String[] args) {
		Order order = new Order("Leagle");
		System.out.println(order.getCustomer());
	}
}
