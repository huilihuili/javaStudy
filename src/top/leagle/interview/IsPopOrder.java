package top.leagle.interview;

import java.util.Stack;

public class IsPopOrder {
	public static void main(String[] args) {
		int[] pushA = { 1, 2, 3, 4, 5 };
		int[] popA = { 4, 5, 3, 2, 1 };
		int[] popB = { 4, 3, 5, 1, 2 };
		IsPopOrder isPopOrder = new IsPopOrder();
		System.out.println(isPopOrder.isPopOrder(pushA, popA));
		System.out.println(isPopOrder.isPopOrder(pushA, popB));
	}

	public boolean isPopOrder(int[] pushA, int[] popA) {
		Stack<Integer> push = new Stack<>();
		int j = 0;
		for (int i = 0; i < popA.length; i++) {
			if (push.isEmpty() || push.peek() != popA[i]) {
				while (j < pushA.length && pushA[j] != popA[i]) {
					push.push(pushA[j++]);
				}
				if (j == pushA.length) {
					return false;
				}
				j++;
			} else {
				if (popA[i] != push.peek()) {
					return false;
				} else {
					push.pop();
				}
			}
		}
		return true;
	}
}
