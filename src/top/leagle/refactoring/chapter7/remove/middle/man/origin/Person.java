package top.leagle.refactoring.chapter7.remove.middle.man.origin;

public class Person {
	public Person getManager() {
		return department.getManager();
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	private Department department = new Department();

	public static void main(String[] args) {
		System.out.println(new Person().getManager());
	}
}
