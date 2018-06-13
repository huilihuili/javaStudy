package top.leagle.refactoring.chapter9.introduce.nulll.object.improvement;

public class NullCustomer extends Customer {
	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String getName() {
		return "occupant";
	}

	@Override
	public BillingPlan getPlan() {
		return BillingPlan.basic();
	}

	@Override
	public PaymentHistory getPaymentHistory() {
		return PaymentHistory.newNull();
	}
}
