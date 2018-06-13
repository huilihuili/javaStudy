package top.leagle.refactoring.chapter9.introduce.nulll.object.origin;

public class Customer {
	public String getName() {
		return name;
	}

	public BillingPlan getPlan() {
		return plan;
	}

	public PaymentHistory getPaymentHistory() {
		return paymentHistory;
	}

	private String name;
	private BillingPlan plan;
	private PaymentHistory paymentHistory;
}
