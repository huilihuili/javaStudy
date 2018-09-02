package top.leagle.interview;

public class Merge {
	public ListNode merge(ListNode list1, ListNode list2) {
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}

		ListNode result = null;

		ListNode one = list1;
		ListNode other = list2;
		if (list1.val > list2.val) {
			result = list2;
			other = other.next;
		} else {
			result = list1;
			one = one.next;
		}
		ListNode node = result;
		while (one != null && other != null) {
			if (one.val > other.val) {
				node.next = other;
				other = other.next;
			} else {
				node.next = one;
				one = one.next;
			}
			node = node.next;
		}

		if (one != null) {
			node.next = one;
		}

		if (other != null) {
			node.next = other;
		}

		return result;
	}

	public ListNode mergeOther(ListNode list1, ListNode list2) {
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}

		ListNode result = null;
		if (list1.val > list2.val) {
			result = list2;
			result.next = mergeOther(list1, list2.next);
		} else {
			result = list1;
			result.next = mergeOther(list1.next, list2);
		}
		return result;
	}

}
