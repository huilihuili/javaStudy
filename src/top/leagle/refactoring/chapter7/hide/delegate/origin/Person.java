package top.leagle.refactoring.chapter7.hide.delegate.origin;

public class Person {
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	private Department department = new Department();

	public static void main(String[] args) {
		System.out.println(new Person().getDepartment().getManager());
	}
}
