package top.leagle.refactoring.chapter9.introduce.nulll.object.improvement;

public class NullPaymentHistory extends PaymentHistory {
	@Override
	public int getWeeksDelinquentInLastYear() {
		return 0;
	}
}
