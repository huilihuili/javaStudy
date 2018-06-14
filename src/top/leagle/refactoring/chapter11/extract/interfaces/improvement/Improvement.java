package top.leagle.refactoring.chapter11.extract.interfaces.improvement;

public class Improvement {
	public double charge(Billable bill, int days) {
		int base = bill.getRate() * days;
		if (bill.hasSpecialSkill()) {
			return base * 1.05;
		} else {
			return base;
		}
	}

	public static void main(String[] args) {
		System.out.println(new Improvement().charge(new Employee(), 10));
	}
}
