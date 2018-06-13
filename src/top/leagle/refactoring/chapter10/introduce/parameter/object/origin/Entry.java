package top.leagle.refactoring.chapter10.introduce.parameter.object.origin;

import java.util.Calendar;

public class Entry {
	public Entry(Calendar chargeDate, double value) {
		this.chargeDate = chargeDate;
		this.value = value;
	}

	public Calendar getChargeDate() {
		return chargeDate;
	}

	public double getValue() {
		return value;
	}

	private Calendar chargeDate;
	private double value;
}
