package top.leagle.interview;

public class LeftRotateString {
	public static void main(String[] args) {
		LeftRotateString leftRotateString = new LeftRotateString();
		String str = "abcXYZdef";
		int n = 3;
		System.out.println(leftRotateString.leftRotateString(str, n));
	}

	public String leftRotateString(String str, int n) {
		if (str.trim().equals("")) {
			return str;
		}
		
		char[] result = str.toCharArray();
		reverse(result, 0, n - 1);
		reverse(result, n, result.length - 1);
		reverse(result, 0, result.length - 1);
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
}
