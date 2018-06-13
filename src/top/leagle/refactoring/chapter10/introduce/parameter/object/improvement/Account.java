package top.leagle.refactoring.chapter10.introduce.parameter.object.improvement;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Account {
	public Account() {
		entries = new ArrayList<>();
		Calendar calendar = Calendar.getInstance();
		calendar.set(2018, 6, 13);
		entries.add(new Entry(calendar, 2));
		entries.add(new Entry(calendar, 3));
		entries.add(new Entry(calendar, 5));
	}

	double getFlowBetween(DateRange dateRange) {
		double result = 0;
		for (Entry entry : entries) {
			if (dateRange.includes(entry.getChargeDate())) {
				result += entry.getValue();
			}
		}
		return result;
	}

	private List<Entry> entries;

	public static void main(String[] args) {
		Account account = new Account();
		Calendar start = Calendar.getInstance();
		start.set(2018, 6, 12);
		Calendar end = Calendar.getInstance();
		end.set(2018, 6, 14);
		System.out.println(account.getFlowBetween(new DateRange(start, end)));
	}
}
