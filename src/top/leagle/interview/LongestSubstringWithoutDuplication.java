package top.leagle.interview;

public class LongestSubstringWithoutDuplication {
	public static void main(String[] args) {
		LongestSubstringWithoutDuplication longestSubstringWithoutDuplication = new LongestSubstringWithoutDuplication();
		System.out.println(longestSubstringWithoutDuplication.longestSubstringWithoutDuplication("arabcacfr"));
	}

	public int longestSubstringWithoutDuplication(String str) {
		int currentLength = 0;
		int maxLength = 0;

		int[] position = new int[26];
		for (int i = 0; i < 26; i++) {
			position[i] = -1;
		}

		for (int i = 0; i < str.length(); i++) {
			int previousIndex = position[str.charAt(i) - 'a'];
			if (previousIndex < 0 || (i - previousIndex) > currentLength) {
				currentLength++;
			} else {
				if (currentLength > maxLength) {
					maxLength = currentLength;
				}
				currentLength = i - previousIndex;
			}
			position[str.charAt(i) - 'a'] = i;
		}
		if (currentLength > maxLength) {
			maxLength = currentLength;
		}
		return maxLength;
	}
}
