package top.leagle.interview;

import javax.swing.text.StyledEditorKit.BoldAction;

public class EntryNodeOfLoop {
	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(4);
		ListNode listNode5 = new ListNode(5);
		ListNode listNode6 = new ListNode(6);

		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;
		listNode5.next = listNode6;
		listNode6.next = listNode3;
		EntryNodeOfLoop entryNodeOfLoop = new EntryNodeOfLoop();
		System.out.println(entryNodeOfLoop.entryNodeOfLoop(listNode1).val);
	}

	public ListNode entryNodeOfLoop(ListNode pHead) {
		if (pHead == null || pHead.next == null) {
			return null;
		}
		
		ListNode loopNode = loopNode(pHead);
		if (loopNode == null) {
			return null;
		}

		int loopNumber = loopNumber(loopNode);
		ListNode first = pHead;
		ListNode second = pHead;
		for (int i = 0; i < loopNumber; i++) {
			first = first.next;
		}

		while (first != second) {
			first = first.next;
			second = second.next;
		}
		return first;
	}

	public ListNode loopNode(ListNode pHead) {
		ListNode first = pHead;
		ListNode second = pHead;

		while (true) {
			if (second.next.next != null) {
				second = second.next.next;
				first = first.next;
				if (first == second) {
					return first;
				}
			} else {
				return null;
			}
		}
	}

	public int loopNumber(ListNode pHead) {
		ListNode first = pHead.next;
		ListNode second = pHead;

		int result = 1;
		while (first != second) {
			first = first.next;
			result++;
		}
		return result;
	}
}
