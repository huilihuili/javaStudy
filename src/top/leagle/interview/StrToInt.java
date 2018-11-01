package top.leagle.interview;

public class StrToInt {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		System.out.println("------");
		StrToInt strToInt = new StrToInt();
		String str = "+2147483647";
		System.out.println(strToInt.strToInt(str));
		System.out.println(strToInt.strToInt("2147483647"));
		System.out.println(strToInt.strToInt("-2147483648"));
		System.out.println(strToInt.strToInt("-21474836481"));
		str = "1a33";
		System.out.println(strToInt.strToInt(str));
	}

	public int strToInt(String s) throws NumberFormatException {
		if (s == null) {
			return 0;
		}

		long result = 0;
		boolean negative = false;
		int i = 0, len = s.length();
		int digit;

		if (len > 0) {
			char firstChar = s.charAt(0);
			if (firstChar < '0') {
				if (firstChar == '-') {
					negative = true;
				} else if (firstChar != '+') {
					return 0;
				}
				if (len == 1) {
					return 0;
				}
				i++;
			}
			int flag = negative ? -1 : 1;
			while (i < len) {
				digit = s.charAt(i++) - '0';
				if (digit < 0 || digit > 9) {
					return 0;
				}
				if (digit < 0) {
					return 0;
				}

				result = result * 10 + digit * flag;
				if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
					return 0;
				}
			}
		} else {
			return 0;
		}
		return (int) result;
	}

}
