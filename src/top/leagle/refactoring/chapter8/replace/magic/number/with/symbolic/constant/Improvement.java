package top.leagle.refactoring.chapter8.replace.magic.number.with.symbolic.constant;

public class Improvement {
	static final double GRAVITATIONAL_CONSTANT = 9.18;

	static double potentialEnergy(double mass, double height) {
		return mass * GRAVITATIONAL_CONSTANT * height;
	}

	public static void main(String[] args) {
		System.out.println(potentialEnergy(2, 3));
	}
}
