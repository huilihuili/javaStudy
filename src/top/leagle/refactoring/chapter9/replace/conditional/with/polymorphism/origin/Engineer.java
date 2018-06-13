package top.leagle.refactoring.chapter9.replace.conditional.with.polymorphism.origin;

public class Engineer extends EmployeeType {

	@Override
	int getType() {
		return EmployeeType.ENGINEER;
	}

}
