package top.leagle.refactoring.chapter9.replace.conditional.with.polymorphism.improvement;

public class Engineer extends EmployeeType {

	@Override
	int getType() {
		return EmployeeType.ENGINEER;
	}

	@Override
	double payAmount(Employee employee) {
		return employee.getMonthlySalary();
	}

}
