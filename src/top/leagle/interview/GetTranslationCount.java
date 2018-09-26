package top.leagle.interview;

public class GetTranslationCount {
	public static void main(String[] args) {
		GetTranslationCount getTranslationCount = new GetTranslationCount();
		System.out.println(getTranslationCount.getTranslationCount(12258));
	}

	int getTranslationCount(int number) {
		if (number < 0) {
			return 0;
		}
		return getTranslationCount(String.valueOf(number));
	}

	int getTranslationCount(String number) {
		int length = number.length();
		int[] counts = new int[length];

		for (int i = length - 1; i >= 0; i--) {
			int count = 0;
			if (i < length - 1) {
				count = counts[i + 1];
			} else {
				count = 1;
			}

			if (i < length - 1) {
				int digit1 = number.charAt(i) - '0';
				int digit2 = number.charAt(i + 1) - '0';
				int converted = digit1 * 10 + digit2;

				if (converted >= 10 && converted <= 25) {
					if (i < length - 2) {
						count += counts[i + 2];
					} else {
						count += 1;
					}
				}
			}
			counts[i] = count;
		}
		return counts[0];
	}
}
