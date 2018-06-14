package top.leagle.refactoring.chapter10.replace.exception.with.test;

import java.util.Stack;

public class Improvement {
	Resource getResource() {
		Resource result;
		if (available.isEmpty()) {
			result = new Resource();
		} else {
			result = available.pop();
		}
		allocated.push(result);
		return result;
	}

	Stack<Resource> available;
	Stack<Resource> allocated;
}
