package top.leagle.refactoring.chapter9.introduce.nulll.object.improvement;

public class Site {
	public Customer getCustomer() {
		return (customer == null) ? Customer.newNull() : customer;
	}

	Customer customer;

	public static void main(String[] args) {
		Site site = new Site();
		Customer customer = site.getCustomer();

		BillingPlan plan = customer.getPlan();
		System.out.println(plan.getName());

		String customerName = customer.getName();
		System.out.println(customerName);

		int weeksDelinquent = customer.getPaymentHistory().getWeeksDelinquentInLastYear();
		System.out.println(weeksDelinquent);
	}
}
