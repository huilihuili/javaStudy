package top.leagle.refactoring.chapter10.preserve.whole.object.origin;

public class Room {
	boolean withinPlan(HeatingPlan plan) {
		int low = daysTempRange().getLow();
		int high = daysTempRange().getHigh();
		return plan.withinRange(low, high);
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
