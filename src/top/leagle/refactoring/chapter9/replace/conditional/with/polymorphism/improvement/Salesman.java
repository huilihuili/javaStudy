package top.leagle.refactoring.chapter9.replace.conditional.with.polymorphism.improvement;

public class Salesman extends EmployeeType {

	@Override
	int getType() {
		return EmployeeType.SALESMAN;
	}

	@Override
	double payAmount(Employee employee) {
		return employee.getMonthlySalary() + employee.getCommission();
	}
}
