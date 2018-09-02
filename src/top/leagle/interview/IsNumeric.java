package top.leagle.interview;

public class IsNumeric {
	public static void main(String[] args) {
		IsNumeric numeric = new IsNumeric();
		char[] str = ".1e10".toCharArray();
		System.out.println(numeric.isNumeric(str));
	}

	public boolean isNumeric(char[] str) {
		boolean result = scanInteger(0, str);

		int location = getLocationScanInteger(0, str);

		if (location < str.length && str[location] == '.') {
			location++;
			result = scanUnsignedInteger(location, str) || result;
			location = getLocationScanUnsignedInteger(location, str);
		}

		if (location < str.length && (str[location] == 'e' || str[location] == 'E')) {
			location++;
			result = scanInteger(location, str) && result;
			location = getLocationScanInteger(location, str);
		}
		return result && location == str.length;
	}

	public boolean scanUnsignedInteger(int location, char[] str) {
		int i = location;
		while (i < str.length && str[i] >= '0' && str[i] <= '9') {
			i++;
		}
		return i > location;
	}

	public int getLocationScanUnsignedInteger(int location, char[] str) {
		int i = location;
		while (i < str.length && str[i] >= '0' && str[i] <= '9') {
			i++;
		}
		return i;
	}

	public boolean scanInteger(int location, char[] str) {
		if (location < str.length && (str[location] == '+' || str[location] == '-')) {
			location++;
		}
		return scanUnsignedInteger(location, str);
	}

	public int getLocationScanInteger(int location, char[] str) {
		if (location < str.length && (str[location] == '+' || str[location] == '-')) {
			location++;
		}
		return getLocationScanUnsignedInteger(location, str);
	}
}
