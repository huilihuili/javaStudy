package top.leagle.interview;

public class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}

	@Override
	public String toString() {
		ListNode listNode = this;
		StringBuilder stringBuilder = new StringBuilder();
		while (listNode != null) {
			stringBuilder.append(listNode.val + " ");
			listNode = listNode.next;
		}
		stringBuilder.append("\n");
		return stringBuilder.toString();
	}
}
