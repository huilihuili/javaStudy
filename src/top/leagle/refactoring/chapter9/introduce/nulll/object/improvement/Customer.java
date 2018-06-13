package top.leagle.refactoring.chapter9.introduce.nulll.object.improvement;

public class Customer implements Nullable {
	@Override
	public boolean isNull() {
		return false;
	}

	static Customer newNull() {
		return new NullCustomer();
	}

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
