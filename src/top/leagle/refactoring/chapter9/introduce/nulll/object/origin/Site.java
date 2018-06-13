package top.leagle.refactoring.chapter9.introduce.nulll.object.origin;

public class Site {
	public Customer getCustomer() {
		return customer;
	}

	Customer customer;

	public static void main(String[] args) {
		Site site = new Site();
		Customer customer = site.getCustomer();

		BillingPlan plan;
		if (customer == null) {
			plan = BillingPlan.basic();
		} else {
			plan = customer.getPlan();
		}
		System.out.println(plan.getName());

		String customerName;
		if (customer == null) {
			customerName = "occupant";
		} else {
			customerName = customer.getName();
		}
		System.out.println(customerName);

		int weeksDelinquent;
		if (customer == null) {
			weeksDelinquent = 0;
		} else {
			weeksDelinquent = customer.getPaymentHistory().getWeeksDelinquentInLastYear();
		}
		System.out.println(weeksDelinquent);
	}
}
