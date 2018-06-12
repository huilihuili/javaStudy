package top.leagle.refactoring.chapter8.replace.type.code.with.classes.improvement;

public class BloodGroup {
	public static final BloodGroup O = new BloodGroup(0);
	public static final BloodGroup A = new BloodGroup(1);
	public static final BloodGroup B = new BloodGroup(2);
	public static final BloodGroup AB = new BloodGroup(3);
	private static final BloodGroup[] values = { O, A, B, AB };

	public BloodGroup(int code) {
		this.code = code;
	}

	private static BloodGroup code(int arg) {
		return values[arg];
	}

	private int getCode() {
		return code;
	}

	private final int code;

	@Override
	public String toString() {
		return "" + code;
	}
}
