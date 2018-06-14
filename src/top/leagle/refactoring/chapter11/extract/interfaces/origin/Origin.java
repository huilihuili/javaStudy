package top.leagle.refactoring.chapter11.extract.interfaces.origin;

public class Origin {
	public double charge(Employee employee, int days) {
		int base = employee.getRate() * days;
		if (employee.hasSpecialSkill()) {
			return base * 1.05;
		} else {
			return base;
		}
	}

	public static void main(String[] args) {
		System.out.println(new Origin().charge(new Employee(), 10));
	}
}
