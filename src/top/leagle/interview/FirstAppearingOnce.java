package top.leagle.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstAppearingOnce {
	private Map<Character, Integer> map = new LinkedHashMap<>();

	private int[] occurrence = new int[256];
	private int index = 0;

	{
		for (int i = 0; i < 256; i++) {
			occurrence[i] = -1;
		}
	}

	public static void main(String[] args) {
		FirstAppearingOnce firstAppearingOnce = new FirstAppearingOnce();
		firstAppearingOnce.Insert('g');
		firstAppearingOnce.Insert('o');

		System.out.println(firstAppearingOnce.firstAppearingOnce());
		firstAppearingOnce.Insert('o');
		firstAppearingOnce.Insert('g');
		firstAppearingOnce.Insert('l');
		firstAppearingOnce.Insert('e');
		System.out.println(firstAppearingOnce.firstAppearingOnce());
	}

	// Insert one char from stringstream
	public void Insert(char ch) {
		if (occurrence[ch] == -1) {
			occurrence[ch] = index;
		} else if (occurrence[ch] >= 0) {
			occurrence[ch] = -2;
		}
		index++;
	}

	// return the first appearence once char in current stringstream
	public char firstAppearingOnce() {
		int minIndex = Integer.MAX_VALUE;
		char result = '#';
		for (int i = 0; i < 256; i++) {
			if (occurrence[i] >= 0 && occurrence[i] < minIndex) {
				result = (char) i;
				minIndex = occurrence[i];
			}
		}
		return result;
	}

	public void InsertOther(char ch) {
		if (map.containsKey(ch)) {
			map.put(ch, map.get(ch) + 1);
		} else {
			map.put(ch, 1);
		}
	}

	public char firstAppearingOnceOther() {
		for (Map.Entry<Character, Integer> set : map.entrySet()) {
			if (set.getValue() == 1) {
				return set.getKey();
			}
		}
		return '#';
	}
}
