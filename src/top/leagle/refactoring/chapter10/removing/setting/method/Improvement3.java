package top.leagle.refactoring.chapter10.removing.setting.method;

public class Improvement3 {
	private String id;

	public Improvement3(String id) {
		initializeId(id);
	}

	public String getId() {
		return id;
	}

	private void initializeId(String id) {
		this.id = "ZZ" + id;
	}

}
