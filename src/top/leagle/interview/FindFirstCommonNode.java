package top.leagle.interview;

public class FindFirstCommonNode {

	public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		int length1 = getListLength(pHead1);
		int length2 = getListLength(pHead2);

		int lengthDiff = length1 - length2;
		ListNode listNodeLong = pHead1;
		ListNode listNodeShort = pHead2;

		if (length2 > length1) {
			listNodeLong = pHead2;
			listNodeShort = pHead1;
			lengthDiff = length2 - length1;
		}

		for (int i = 0; i < lengthDiff; i++) {
			listNodeLong = listNodeLong.next;
		}

		while (listNodeLong != null && listNodeShort != null && listNodeLong != listNodeShort) {
			listNodeLong = listNodeLong.next;
			listNodeShort = listNodeShort.next;
		}
		
		return listNodeLong;
	}

	public int getListLength(ListNode pHead) {
		int result = 0;
		ListNode listNode = pHead;
		while (listNode != null) {
			listNode = listNode.next;
			result++;
		}
		return result;
	}
}
