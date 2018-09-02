package top.leagle.interview;

public class Match {
	public static void main(String[] args) {
		char[] str = { 'a' };
		char[] pattern1 = { 'a', '.' };

		Match match = new Match();
		System.out.println(match.match(str, pattern1));
	}

	public boolean match(char[] str, char[] pattern) {
		if (str == null || pattern == null) {
			return false;
		}
		int strIndex = 0;
		int patternIndex = 0;
		return matchCore(str, strIndex, pattern, patternIndex);
	}

	public boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
		if (strIndex == str.length && patternIndex == pattern.length) {
			return true;
		}

		if (strIndex != str.length && patternIndex == pattern.length) {
			return false;
		}

		if (patternIndex != pattern.length - 1 && pattern[patternIndex + 1] == '*') {
			if ((strIndex != str.length && str[strIndex] == pattern[patternIndex])
					|| (pattern[patternIndex] == '.' && strIndex != str.length)) {
				return matchCore(str, strIndex + 1, pattern, patternIndex + 2)
						|| matchCore(str, strIndex + 1, pattern, patternIndex)
						|| matchCore(str, strIndex, pattern, patternIndex + 2);
			} else {
				return matchCore(str, strIndex, pattern, patternIndex + 2);
			}
		}

		if ((strIndex != str.length && str[strIndex] == pattern[patternIndex]) || (pattern[patternIndex] == '.' && strIndex != str.length)) {
			return matchCore(str, strIndex + 1, pattern, patternIndex + 1);
		}
		return false;
	}
}
