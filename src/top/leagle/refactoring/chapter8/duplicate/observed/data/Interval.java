package top.leagle.refactoring.chapter8.duplicate.observed.data;

import java.util.Observable;

public class Interval extends Observable {
	void calculateLength() {
		try {
			int start = Integer.valueOf(getStart());
			int end = Integer.valueOf(getEnd());
			int length = end - start;
			setLength(String.valueOf(length));
		} catch (NumberFormatException e) {
			throw new RuntimeException("Unexpected Number Format Error");
		}
	}

	void calculateEnd() {
		try {
			int start = Integer.valueOf(getStart());
			int length = Integer.valueOf(getLength());
			int end = start + length;
			setEnd(String.valueOf(end));
		} catch (NumberFormatException e) {
			throw new RuntimeException("Unexpected Number Format Error");
		}
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
		setChanged();
		notifyObservers();
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
		setChanged();
		notifyObservers();
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
		setChanged();
		notifyObservers();
	}

	private String start = "0";
	private String end = "0";
	private String length = "0";

}
