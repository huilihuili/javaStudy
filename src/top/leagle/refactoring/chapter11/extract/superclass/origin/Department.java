package top.leagle.refactoring.chapter11.extract.superclass.origin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Department {

	public Department(String name) {
		this.name = name;
	}

	public int getTotalAnnualCost() {
		int result = 0;
		for (Employee employee : staffs) {
			result += employee.getAnnualCost();
		}
		return result;
	}

	public int getHeadCount() {
		return staffs.size();
	}

	public Iterator<Employee> getStaff() {
		return staffs.iterator();
	}

	public void addStaff(Employee employee) {
		staffs.add(employee);
	}

	public String getName() {
		return name;
	}

	private String name;
	private List<Employee> staffs = new ArrayList<>();

	public static void main(String[] args) {
		Employee employee = new Employee("Leagle", 10, "3");
		Employee employee2 = new Employee("Tom", 20, "4");
		Department department = new Department("computer");
		department.addStaff(employee);
		department.addStaff(employee2);
		System.out.println(employee.getAnnualCost());
		System.out.println(department.getTotalAnnualCost());
	}
}
