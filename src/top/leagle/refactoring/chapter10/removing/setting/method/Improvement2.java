package top.leagle.refactoring.chapter10.removing.setting.method;

public class Improvement2 {

	public Improvement2(String id) {
		this.id = "ZZ" + id;
	}

	public String getId() {
		return id;
	}

	private final String id;
}
