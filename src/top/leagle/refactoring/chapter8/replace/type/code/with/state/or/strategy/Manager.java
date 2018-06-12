package top.leagle.refactoring.chapter8.replace.type.code.with.state.or.strategy;

public class Manager extends EmployeeType {

	@Override
	int getType() {
		return EmployeeType.MANAGER;
	}
	
}
