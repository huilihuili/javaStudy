package top.leagle.refactoring.chapter7.remove.middle.man.improvement;

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
