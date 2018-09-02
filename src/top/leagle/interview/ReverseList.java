package top.leagle.interview;

public class ReverseList {
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

		ReverseList reverseList = new ReverseList();
		System.out.println(listNode1);
		System.out.println(reverseList.reverseList(listNode1));
	}

	public ListNode reverseList(ListNode head) {
		ListNode result = null;
		ListNode node = head;
		ListNode pre = null;
		while (node != null) {
			ListNode next = node.next;
			if (next == null) {
				result = node;
			}
			node.next = pre;
			pre = node;
			node = next;
		}
		return result;
	}
}
