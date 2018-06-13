package top.leagle.refactoring.chapter10.replace.parameter.with.explicit.methods.improvement;

public class Salesman extends Employee {

	@Override
	public int getType() {
		return Employee.SALESMAN;
	}

}
