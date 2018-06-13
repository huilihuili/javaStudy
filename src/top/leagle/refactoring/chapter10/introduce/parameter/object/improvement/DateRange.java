package top.leagle.refactoring.chapter10.introduce.parameter.object.improvement;

import java.util.Calendar;

public class DateRange {

	public DateRange(Calendar start, Calendar end) {
		this.start = start;
		this.end = end;
	}

	public Calendar getStart() {
		return start;
	}

	public Calendar getEnd() {
		return end;
	}

	public boolean includes(Calendar arg) {
		return arg.equals(start) || arg.equals(end) || (arg.after(start) && arg.before(end));
	}

	private final Calendar start;
	private final Calendar end;
}
