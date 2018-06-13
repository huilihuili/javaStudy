package top.leagle.refactoring.chapter9.introduce.nulll.object.improvement;

public class PaymentHistory {
	public int getWeeksDelinquentInLastYear() {
		return 5;
	}

	public static PaymentHistory newNull() {
		return new NullPaymentHistory();
	}
}
