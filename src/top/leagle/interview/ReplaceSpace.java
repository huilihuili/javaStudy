package top.leagle.interview;

public class ReplaceSpace {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("We Are Happy");
		System.out.println(stringBuffer);
		System.out.println(replaceSpace(stringBuffer));

		int[] a1 = { 1, 3, 6, 7, 9, 0, 0, 0, 0, 0 };
		int[] a2 = { 2, 4, 6, 8, 10 };
		int n1 = 5;
		printArray(joinArray(a1, a2, n1));
	}

	public static String replaceSpace(StringBuffer str) {
		int numberOfBlank = 0;
		int originalLength = str.length();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				numberOfBlank++;
			}
		}
		int newLength = originalLength + 2 * numberOfBlank;
		str.setLength(newLength);

		int indexOfOriginal = originalLength - 1;
		int indexOfNew = newLength - 1;

		while (indexOfOriginal >= 0 && indexOfOriginal < indexOfNew) {
			if (str.charAt(indexOfOriginal) != ' ') {
				str.setCharAt(indexOfNew--, str.charAt(indexOfOriginal));
			} else {
				str.setCharAt(indexOfNew--, '0');
				str.setCharAt(indexOfNew--, '2');
				str.setCharAt(indexOfNew--, '%');
			}
			indexOfOriginal--;
		}
		return str.toString();
	}

	public static int[] joinArray(int[] array1, int[] array2, int n1) {
		int indexOfA1 = n1 - 1;
		int indexOfNew = n1 + array2.length - 1;
		int indexOfA2 = array2.length - 1;
		while (indexOfA1 >= 0 && indexOfA1 < indexOfNew) {
			if (array1[indexOfA1] < array2[indexOfA2]) {
				array1[indexOfNew--] = array2[indexOfA2--];
			} else {
				array1[indexOfNew--] = array1[indexOfA1--];
			}
		}
		return array1;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
