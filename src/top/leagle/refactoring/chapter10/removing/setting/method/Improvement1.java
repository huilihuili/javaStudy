package top.leagle.refactoring.chapter10.removing.setting.method;

public class Improvement1 {

	public Improvement1(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	private final String id;

}
