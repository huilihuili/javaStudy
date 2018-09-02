package top.leagle.interview;

public class FindKthToTail {
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

		FindKthToTail findKthToTail = new FindKthToTail();
		System.out.println(findKthToTail.findKthToTail(listNode1, 3).val);
	}

	public ListNode findKthToTail(ListNode head, int k) {
		if (head == null || k == 0) {
			return null;
		}

		ListNode first = head;
		for (int i = 0; i < k - 1; i++) {
			if (first.next != null) {
				first = first.next;
			} else {
				return null;
			}
		}

		ListNode second = head;
		while (first.next != null) {
			first = first.next;
			second = second.next;
		}
		return second;
	}
}
