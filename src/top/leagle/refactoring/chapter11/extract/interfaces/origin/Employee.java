package top.leagle.refactoring.chapter11.extract.interfaces.origin;

public class Employee {

	public boolean hasSpecialSkill() {
		return true;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	private int rate = 3;

}
