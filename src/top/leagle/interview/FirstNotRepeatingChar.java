package top.leagle.interview;

public class FirstNotRepeatingChar {

	public int firstNotRepeatingChar(String str) {
		if (str == null || str.equals("")) {
			return -1;
		}

		final int tableSize = 256;
		int[] hashTable = new int[tableSize];

		for (int i = 0; i < str.length(); i++) {
			hashTable[str.charAt(i)]++;
		}
		for (int i = 0; i < str.length(); i++) {
			if (hashTable[str.charAt(i)] == 1) {
				return i;
			}
		}
		return -1;
	}
}
