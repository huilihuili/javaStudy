package top.leagle.interview;

import java.util.ArrayList;
import java.util.TreeSet;

public class Permutation {

	public static void main(String[] args) {
		String str = "abc";
		Permutation permutation = new Permutation();
		ArrayList<String> result = permutation.permutation(str);
		System.out.println(result);
	}

	public ArrayList<String> permutation(String str) {
		ArrayList<String> result = new ArrayList<String>();
		if (str == null || str.length() == 0) {
			return result;
		}

		TreeSet<String> set = new TreeSet<>();
		permutation(str.toCharArray(), 0, set);

		result.addAll(set);
		return result;
	}

	public void permutation(char[] str, int index, TreeSet<String> setList) {
		if (index == str.length) {
			setList.add(String.valueOf(str));
		}

		for (int i = index; i < str.length; i++) {
			char temp = str[i];
			str[i] = str[index];
			str[index] = temp;

			permutation(str, index + 1, setList);

			temp = str[i];
			str[i] = str[index];
			str[index] = temp;
		}
	}
}
