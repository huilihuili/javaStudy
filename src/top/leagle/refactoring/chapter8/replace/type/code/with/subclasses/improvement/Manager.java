package top.leagle.refactoring.chapter8.replace.type.code.with.subclasses.improvement;

public class Manager extends Employee {
	
	@Override
	public int getType() {
		return Employee.MANAGER;
	}
}
