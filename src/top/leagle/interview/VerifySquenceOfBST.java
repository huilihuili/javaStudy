package top.leagle.interview;

public class VerifySquenceOfBST {
	public boolean verifySquenceOfBST(int[] sequence) {
		return verifySquenceOfBST(sequence, 0, sequence.length);
	}

	public boolean verifySquenceOfBST(int[] sequence, int start, int end) {
		if (sequence == null || sequence.length == 0) {
			return false;
		}

		int root = sequence[end - 1];

		int i = start;
		for (; i < end - 1; i++) {
			if (sequence[i] > root) {
				break;
			}
		}

		int j = i;
		for (; j < end - 1; j++) {
			if (sequence[j] < root) {
				return false;
			}
		}

		boolean left = true;
		if ((i - 1) > start) {
			left = verifySquenceOfBST(sequence, start, i - 1);
		}

		boolean right = true;
		if (i < (end - 1)) {
			right = verifySquenceOfBST(sequence, i, end - 1);
		}

		return left && right;
	}
}
