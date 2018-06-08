package top.leagle.refactoring.chapter7.introduce.foreigin.method;

import java.util.Calendar;

public class Improvement {
	private static Calendar nextDay(Calendar arg) {
		Calendar newStart = Calendar.getInstance();
		newStart.set(arg.get(Calendar.YEAR), arg.get(Calendar.MONTH), arg.get(Calendar.DATE) + 1);
		return newStart;
	}

	public static void main(String[] args) {
		Calendar previousEnd = Calendar.getInstance();
		previousEnd.set(1995, 10, 25);

		Calendar newStart = nextDay(previousEnd);

		System.out.println(previousEnd.get(Calendar.YEAR) + "-" + previousEnd.get(Calendar.MONTH) + "-"
				+ previousEnd.get(Calendar.DATE));
		System.out.println(
				newStart.get(Calendar.YEAR) + "-" + newStart.get(Calendar.MONTH) + "-" + newStart.get(Calendar.DATE));

	}
}
