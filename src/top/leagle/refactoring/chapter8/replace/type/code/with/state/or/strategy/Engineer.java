package top.leagle.refactoring.chapter8.replace.type.code.with.state.or.strategy;

public class Engineer extends EmployeeType {

	@Override
	int getType() {
		return EmployeeType.ENGINEER;
	}

}
