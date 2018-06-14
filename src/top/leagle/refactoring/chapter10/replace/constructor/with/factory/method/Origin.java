package top.leagle.refactoring.chapter10.replace.constructor.with.factory.method;

public class Origin {

	public Origin(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	private int type;

	public static void main(String[] args) {
		Origin origin = new Origin(Origin.ENGINEER);
		System.out.println(origin.getType());
	}
}
