package top.leagle.refactoring.chapter8.encapsulate.collection.improvement1;

public class Course {
	public Course(String name, boolean advanced) {
		this.name = name;
		this.advanced = advanced;
	}

	public boolean isAdvanced() {
		return advanced;
	}

	@Override
	public String toString() {
		return name + " " + advanced;
	}

	private String name;
	private boolean advanced;
}
