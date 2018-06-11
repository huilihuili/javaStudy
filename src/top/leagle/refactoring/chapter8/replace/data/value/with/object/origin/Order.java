package top.leagle.refactoring.chapter8.replace.data.value.with.object.origin;

public class Order {

	public Order(String customer) {
		this.customer = customer;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	private String customer;

	public static void main(String[] args) {
		Order order = new Order("Leagle");
		System.out.println(order.getCustomer());
	}
}
