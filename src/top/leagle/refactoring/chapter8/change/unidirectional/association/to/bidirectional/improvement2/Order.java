package top.leagle.refactoring.chapter8.change.unidirectional.association.to.bidirectional.improvement2;

public class Order {
	public Order(Customer customer) {
		this.customer = customer;
		this.customer.addOrder(this);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		if (this.customer != null) {
			this.customer.friendOrders().remove(this);
			this.customer = customer;
		}

		if (this.customer != null) {
			this.customer.friendOrders().add(this);
		}
	}

	private Customer customer;

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		Order order1 = new Order(customer1);
		Order order2 = new Order(customer2);

		System.out.println("\n" + customer1.friendOrders());
		System.out.println(customer2.friendOrders());

		order1.setCustomer(customer2);
		System.out.println("\n" + customer1.friendOrders());
		System.out.println(customer2.friendOrders());

		customer1.addOrder(order1);
		customer1.addOrder(order2);
		System.out.println("\n" + customer1.friendOrders());
		System.out.println(customer2.friendOrders());
	}
}
