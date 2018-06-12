package top.leagle.refactoring.chapter8.encapsulate.collection.origin1;

import java.util.HashSet;
import java.util.Set;

public class Person {
	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	private Set<Course> courses;

	public static void main(String[] args) {
		Person kent = new Person();
		Set<Course> s = new HashSet<>();
		s.add(new Course("Smalltalk Programming", false));
		s.add(new Course("Appreciating Single Malts", true));
		kent.setCourses(s);

		System.out.println(kent.getCourses());

		Course refact = new Course("Refactoring", true);
		kent.getCourses().add(refact);
		System.out.println(kent.getCourses());

		kent.getCourses().remove(refact);
		System.out.println(kent.getCourses());
	}
}
