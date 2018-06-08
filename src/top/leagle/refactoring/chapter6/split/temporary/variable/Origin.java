package top.leagle.refactoring.chapter6.split.temporary.variable;

public class Origin {
	private double primaryForce = 1;
	private double secondaryForce = 1;
	private double mass = 2;
	private int delay = 4;

	double getDistanceTravelled(int time) {
		double result;
		double acc = primaryForce / mass;
		int primaryTime = Math.min(time, delay);
		result = 0.5 * acc * primaryTime * primaryTime;
		int secondaryTime = time - delay;

		if (secondaryTime > 0) {
			double primaryVel = acc * delay;
			acc = (primaryForce + secondaryForce) / mass;
			result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(new Origin().getDistanceTravelled(5));
	}
}
