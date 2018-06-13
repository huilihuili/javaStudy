package top.leagle.refactoring.chapter10.replace.parameter.with.explicit.methods.origin;

public class Manager extends Employee {

	@Override
	public int getType() {
		return Employee.MANAGER;
	}
	
}
