package top.leagle.refactoring.chapter7.introduce.local.extension.improvement1;

import java.util.Date;

public class MfDateSub extends Date {
	private static final long serialVersionUID = 1L;

	public MfDateSub(int year, int month, int day) {
		super(year, month, day);
	}

	public Date nextDay() {
		return new Date(getYear(), getMonth(), getDate() + 1);
	}

	public static void main(String[] args) {
		MfDateSub mfDateSub = new MfDateSub(95, 9, 25);
		System.out.println(mfDateSub);
		System.out.println(mfDateSub.nextDay());
	}
}
