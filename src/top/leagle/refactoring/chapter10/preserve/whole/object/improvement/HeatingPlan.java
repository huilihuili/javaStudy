package top.leagle.refactoring.chapter10.preserve.whole.object.improvement;

public class HeatingPlan {
	public HeatingPlan() {
		tempRange = new TempRange();
		tempRange.setHigh(12);
		tempRange.setLow(3);
	}

	public boolean withinRange(TempRange roomRange) {
		return tempRange.includes(roomRange);
	}

	private TempRange tempRange;
}
