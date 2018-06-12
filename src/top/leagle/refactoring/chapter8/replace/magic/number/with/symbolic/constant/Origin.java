package top.leagle.refactoring.chapter8.replace.magic.number.with.symbolic.constant;

public class Origin {
	static double potentialEnergy(double mass, double height) {
		return mass * 9.18 * height;
	}

	public static void main(String[] args) {
		System.out.println(potentialEnergy(2, 3));
	}
}
