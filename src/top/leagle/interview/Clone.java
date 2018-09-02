package top.leagle.interview;

public class Clone {
	public RandomListNode clone(RandomListNode pHead) {
		if (pHead == null) {
			return null;
		}

		RandomListNode node = pHead;
		while (node != null) {
			RandomListNode copy = new RandomListNode(node.label);
			copy.next = node.next;
			node.next = copy;

			node = copy.next;
		}

		node = pHead;
		while (node != null) {
			if (node.random != null) {
				node.next.random = node.random.next;
			}
			node = node.next.next;
		}

		node = pHead;
		RandomListNode result = pHead.next;
		RandomListNode node2 = result;
		while (node2.next != null) {
			node.next = node.next.next;
			node2.next = node2.next.next;
			node = node.next;
			node2 = node2.next;
		}
		node.next = null;
		return result;
	}
}
