package top.leagle.refactoring.chapter10.removing.setting.method;

public class Origin {

	public Origin(String id) {
		setId(id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String id;

}
