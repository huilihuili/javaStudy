package top.leagle.refactoring.chapter8.encapsulate.collection.improvement1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Person {
	public void addCourse(Course course) {
		courses.add(course);
	}

	public void removeCourse(Course course) {
		courses.remove(course);
	}

	public Set<Course> getCourses() {
		return Collections.unmodifiableSet(courses);
	}

	public void initializeCourses(Set<Course> courses) {
		if (this.courses.isEmpty()) {
			this.courses.addAll(courses);
		}
	}

	private Set<Course> courses = new HashSet<>();

	public static void main(String[] args) {
		Person kent = new Person();
		Set<Course> s = new HashSet<>();
		s.add(new Course("Smalltalk Programming", false));
		s.add(new Course("Appreciating Single Malts", true));
		
		kent.initializeCourses(s);
		System.out.println(kent.getCourses());

		Course refact = new Course("Refactoring", true);
		kent.addCourse(refact);
		System.out.println(kent.getCourses());

		kent.removeCourse(refact);
		System.out.println(kent.getCourses());
	}
}
