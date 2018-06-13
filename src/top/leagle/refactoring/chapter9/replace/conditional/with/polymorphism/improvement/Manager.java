package top.leagle.refactoring.chapter9.replace.conditional.with.polymorphism.improvement;

public class Manager extends EmployeeType {

	@Override
	int getType() {
		return EmployeeType.MANAGER;
	}

	@Override
	double payAmount(Employee employee) {
		return employee.getMonthlySalary() + employee.getBonus();
	}

}
