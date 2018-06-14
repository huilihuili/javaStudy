package top.leagle.refactoring.chapter10.replace.constructor.with.factory.method;

public class Improvement {
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	static Improvement create(int type) {
		return new Improvement(type);
	}

	private Improvement(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	private int type;

	public static void main(String[] args) {
		Improvement improvement = Improvement.create(Improvement.ENGINEER);
		System.out.println(improvement.getType());
	}
}
