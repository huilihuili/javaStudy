package top.leagle.refactoring.chapter9.decompose.conditional;

public class Improvement {
	static final double SUMMER_START = 100.0;
	static final double SUMMER_END = 200.0;

	double getPrice(int quantity, int date) {
		double charge;
		if (notSummer(date)) {
			charge = winterCharge(quantity);
		} else {
			charge = summerCharge(quantity);
		}
		return charge;
	}

	private boolean notSummer(int date) {
		return date >= SUMMER_START && date <= SUMMER_END;
	}

	private double summerCharge(int quantity) {
		return quantity * summerRate;
	}

	private double winterCharge(int quantity) {
		return quantity * winterRate + winterServiceCharge;
	}

	private double winterRate = 0.8;
	private double summerRate = 0.9;
	private double winterServiceCharge = 10;

	public static void main(String[] args) {
		System.out.println(new Improvement().getPrice(10, 120));
	}

}
