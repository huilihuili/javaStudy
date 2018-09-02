package top.leagle.interview;

public class DeleteDuplication {
	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(1);
		ListNode listNode3 = new ListNode(2);
		ListNode listNode4 = new ListNode(2);
		ListNode listNode5 = new ListNode(3);
		ListNode listNode6 = new ListNode(3);
		ListNode listNode7 = new ListNode(4);
		ListNode listNode8 = new ListNode(4);

		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;
		listNode5.next = listNode6;
		listNode6.next = listNode7;
		listNode7.next = listNode8;

		DeleteDuplication deleteDuplication = new DeleteDuplication();
		System.out.println(deleteDuplication.deleteDuplication(listNode1));
	}

	public ListNode deleteDuplication(ListNode pHead) {
		ListNode listNode = pHead;
		while (listNode != null) {
			ListNode duplicationNode = listNode.next;
			while (duplicationNode != null && duplicationNode.next != null
					&& duplicationNode.val == duplicationNode.next.val) {
				duplicationNode = duplicationNode.next;
			}
			if (duplicationNode != null && listNode.val == duplicationNode.val) {
				listNode = duplicationNode.next;
				pHead = listNode;
			} else if (duplicationNode != listNode.next) {
				listNode.next = duplicationNode.next;
			} else {
				listNode = listNode.next;
			}
		}
		return pHead;
	}

}
