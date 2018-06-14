package top.leagle.refactoring.chapter11.extract.subclass.improvement;

public class Employee {

	public Employee(int rate) {
		this.rate = rate;
	}

	public int getRate() {
		return rate;
	}

	private int rate;
}
