package top.leagle.basic.enumT;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		System.out.println(AccountType.FIXED);
		System.out.println(Arrays.toString(AccountType.values()));
	}
}

enum AccountType {
	SAVING, FIXED, CURRENT;
	private AccountType() {
		System.out.println("It is a account type");
	}
}
