package top.leagle.refactoring.chapter11.extract.superclass.improvement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Department extends Party {

	public Department(String name) {
		super(name);
	}

	@Override
	public int getAnnualCost() {
		int result = 0;
		for (Party Party : staffs) {
			result += Party.getAnnualCost();
		}
		return result;
	}

	public int getHeadCount() {
		return staffs.size();
	}

	public Iterator<Party> getStaff() {
		return staffs.iterator();
	}

	public void addStaff(Party part) {
		staffs.add(part);
	}

	private List<Party> staffs = new ArrayList<>();

	public static void main(String[] args) {

		Employee employee = new Employee("Leagle", 10, "3");
		Employee employee2 = new Employee("Tom", 20, "4");
		Department department = new Department("computer");
		department.addStaff(employee);
		department.addStaff(employee2);
		System.out.println(employee.getAnnualCost());
		System.out.println(department.getAnnualCost());
	}

}
