package top.leagle.refactoring.chapter10.preserve.whole.object.origin;

public class HeatingPlan {
	public HeatingPlan() {
		tempRange = new TempRange();
		tempRange.setHigh(12);
		tempRange.setLow(3);
	}

	public boolean withinRange(int low, int high) {
		return (low >= tempRange.getLow()) && (high <= tempRange.getHigh());
	}

	private TempRange tempRange;
}
