package top.leagle.interview;

import java.util.ArrayList;
import java.util.LinkedList;


public class PrintListFromTailToHead {
	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(4);
		ListNode listNode5 = new ListNode(5);

		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;

		System.out.println(printListFromTailToHead(listNode1));
	}

	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		LinkedList<Integer> stack = new LinkedList<>();
		ListNode tempt = listNode;
		while (tempt != null) {
			stack.addFirst(tempt.val);
			tempt = tempt.next;
		}

		ArrayList<Integer> result = new ArrayList<>();
		while (!stack.isEmpty()) {
			result.add(stack.removeFirst());
		}
		return result;
	}
}
