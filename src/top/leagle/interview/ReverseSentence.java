package top.leagle.interview;

public class ReverseSentence {
	public static void main(String[] args) {
		ReverseSentence reverseSentence = new ReverseSentence();
		String str = "student. a am I";
		System.out.println(reverseSentence.reverseSentence(str));
		System.out.println(reverseSentence.reverseSentenceOther(str));
	}

	public String reverseSentence(String str) {
		char[] result = str.toCharArray();
		reverse(result, 0, result.length - 1);
		int begin = 0;
		for (int i = 0; i < result.length; i++) {
			if (result[i] == ' ') {
				reverse(result, begin, i - 1);
				begin = i + 1;
			}
		}
		reverse(result, begin, result.length - 1);
		return new String(result);
	}

	public void reverse(char[] word, int begin, int end) {
		while (begin < end) {
			char temp = word[begin];
			word[begin] = word[end];
			word[end] = temp;
			begin++;
			end--;
		}
	}

	public String reverseSentenceOther(String str) {
		if (str.trim().equals("")) {
			return str;
		}
		StringBuilder result = new StringBuilder();
		String[] splits = str.split(" ");
		for (int i = splits.length - 1; i >= 0; i--) {
			result.append(splits[i] + " ");
		}
		return result.toString().trim();
	}

}
