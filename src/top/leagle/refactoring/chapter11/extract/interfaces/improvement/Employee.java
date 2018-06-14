package top.leagle.refactoring.chapter11.extract.interfaces.improvement;

public class Employee implements Billable {

	@Override
	public int getRate() {
		return 3;
	}

	@Override
	public boolean hasSpecialSkill() {
		return true;
	}

}
