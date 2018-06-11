package top.leagle.refactoring.chapter8.replace.data.value.with.object.improvement;

public class Order {

	public Order(String name) {
		customer = new Customer(name);
	}

	public String getCustomer() {
		return customer.getName();
	}

	public void setCustomer(String name) {
		customer = new Customer(name);
	}

	private Customer customer;

	public static void main(String[] args) {
		Order order = new Order("Leagle");
		System.out.println(order.getCustomer());
	}
}
