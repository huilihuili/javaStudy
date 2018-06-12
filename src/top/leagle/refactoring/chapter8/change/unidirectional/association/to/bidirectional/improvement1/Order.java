package top.leagle.refactoring.chapter8.change.unidirectional.association.to.bidirectional.improvement1;

import java.util.HashSet;
import java.util.Set;

import javax.crypto.CipherInputStream;

public class Order {

	void addCustomer(Customer customer) {
		customer.friendOrders().add(this);
		customers.add(customer);
	}
	

	void removeCustomer(Customer customer) {
		customer.friendOrders().remove(this);
		customers.remove(customer);
	}
	
	private HashSet<Customer> customers = new HashSet<>();

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		Order order1 = new Order();
		Order order2 = new Order();

		order1.addCustomer(customer1);
		order2.addCustomer(customer2);
		System.out.println("\n" + customer1.friendOrders());
		System.out.println(customer2.friendOrders());

		customer1.addOrder(order2);
		customer2.addOrder(order1);
		System.out.println("\n" + customer1.friendOrders());
		System.out.println(customer2.friendOrders());
	}
}
