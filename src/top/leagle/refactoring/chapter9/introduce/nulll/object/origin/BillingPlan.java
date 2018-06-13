package top.leagle.refactoring.chapter9.introduce.nulll.object.origin;

public class BillingPlan {
	public BillingPlan() {
	}

	public BillingPlan(String name) {
		this.name = name;
	}

	public static BillingPlan basic() {
		return new BillingPlan("basic");
	}

	public String getName() {
		return name;
	}


	private String name;
}
