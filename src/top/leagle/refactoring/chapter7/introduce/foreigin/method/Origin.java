package top.leagle.refactoring.chapter7.introduce.foreigin.method;

import java.util.Calendar;

public class Origin {

	public static void main(String[] args) {
		Calendar previousEnd = Calendar.getInstance();
		previousEnd.set(1995, 10, 25);

		Calendar newStart = Calendar.getInstance();
		newStart.set(previousEnd.get(Calendar.YEAR), previousEnd.get(Calendar.MONTH),
				previousEnd.get(Calendar.DATE) + 1);
		System.out.println(previousEnd.get(Calendar.YEAR) + "-" + previousEnd.get(Calendar.MONTH) + "-"
				+ previousEnd.get(Calendar.DATE));
		System.out.println(
				newStart.get(Calendar.YEAR) + "-" + newStart.get(Calendar.MONTH) + "-" + newStart.get(Calendar.DATE));
	}
}
