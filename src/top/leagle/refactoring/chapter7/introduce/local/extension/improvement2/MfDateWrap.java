package top.leagle.refactoring.chapter7.introduce.local.extension.improvement2;

import java.sql.Date;

public class MfDateWrap {
	private Date original;

	public MfDateWrap(Date arg) {
		original = arg;
	}

	public int getYear() {
		return original.getYear();
	}

	public int getMonth() {
		return original.getMonth();
	}

	public int getDate() {
		return original.getDate();
	}

	public boolean equals(Object arg) {
		if (this == arg) {
			return true;
		}

		if (!(arg instanceof MfDateWrap)) {
			return false;
		}

		MfDateWrap other = (MfDateWrap) arg;
		return original.equals(other.original);
	}

	public Date nextDay() {
		return new Date(getYear(), getMonth(), getDate() + 1);
	}

	@Override
	public String toString() {
		return 1900 + getYear() + "-" + (getMonth() + 1) + "-" + getDate();
	}

	public static void main(String[] args) {
		MfDateWrap mfDateWrap = new MfDateWrap(new Date(95, 9, 25));
		System.out.println(mfDateWrap);
		System.out.println(mfDateWrap.nextDay());
	}
}
