package top.leagle.interview;

import java.util.Stack;

public class StackWithMin {
	private Stack<Integer> stack1 = new Stack<>();
	private Stack<Integer> stack2 = new Stack<>();

	public void push(int node) {
		stack1.push(node);
		if (stack2.isEmpty()) {
			stack2.push(node);
		} else {
			int min = Math.min(stack2.peek(), node);
			stack2.push(min);
		}
	}

	public void pop() {
		stack1.pop();
		stack2.pop();
	}

	public int top() {
		return stack1.peek();
	}

	public int min() {
		return stack2.peek();
	}
}
