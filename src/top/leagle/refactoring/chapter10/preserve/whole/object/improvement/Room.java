package top.leagle.refactoring.chapter10.preserve.whole.object.improvement;

public class Room {
	boolean withinPlan(HeatingPlan plan) {
		return plan.withinRange(daysTempRange());
	}

	private TempRange daysTempRange() {
		TempRange tempRange = new TempRange();
		tempRange.setHigh(10);
		tempRange.setLow(4);
		return tempRange;
	}
	
	public static void main(String[] args) {
		HeatingPlan plan = new HeatingPlan();
		System.out.println(new Room().withinPlan(plan));
	}
}
