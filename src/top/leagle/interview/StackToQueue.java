package top.leagle.interview;

import java.util.Stack;

public class StackToQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public static void main(String[] args) {
		StackToQueue stackToQueue = new StackToQueue();

		stackToQueue.push(1);
		stackToQueue.push(2);
		System.out.println(stackToQueue.pop());
		stackToQueue.push(3);
		stackToQueue.push(4);
		System.out.println(stackToQueue.pop());
		System.out.println(stackToQueue.pop());
		System.out.println(stackToQueue.pop());
	}

	public void push(int node) {
		stack1.push(node);
	}

	public int pop() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
}
