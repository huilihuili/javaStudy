package top.leagle.refactoring.chapter10.replace.exception.with.test;

import java.util.EmptyStackException;
import java.util.Stack;

public class Origin {
	Resource getResource() {
		Resource result;
		try {
			result = available.pop();
			allocated.push(result);
			return result;
		} catch (EmptyStackException e) {
			result = new Resource();
			allocated.push(result);
			return result;
		}
	}

	Stack<Resource> available;
	Stack<Resource> allocated;
}
