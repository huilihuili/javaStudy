package top.leagle.refactoring.chapter8.change.unidirectional.association.to.bidirectional.origin;

public class Order {

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	private Customer customer;
}
