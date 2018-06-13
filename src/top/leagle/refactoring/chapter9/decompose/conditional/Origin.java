package top.leagle.refactoring.chapter9.decompose.conditional;

public class Origin {
	static final double SUMMER_START = 100.0;
	static final double SUMMER_END = 200.0;

	double getPrice(int quantity, int date) {
		double charge;
		if (date >= SUMMER_START && date <= SUMMER_END) {
			charge = quantity * winterRate + winterServiceCharge;
		} else {
			charge = quantity * summerRate;
		}
		return charge;
	}

	private double winterRate = 0.8;
	private double summerRate = 0.9;
	private double winterServiceCharge = 10;

	public static void main(String[] args) {
		System.out.println(new Origin().getPrice(10, 120));
	}
}
