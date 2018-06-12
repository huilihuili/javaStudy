package top.leagle.refactoring.chapter8.change.unidirectional.association.to.bidirectional.improvement2;

import java.util.HashSet;
import java.util.Set;

public class Customer {
	void addOrder(Order order) {
		order.setCustomer(this);
	}

	Set<Order> friendOrders() {
		return orders;
	}

	private HashSet<Order> orders = new HashSet<>();
}
