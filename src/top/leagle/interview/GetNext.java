package top.leagle.interview;

public class GetNext {

	public static void main(String[] args) {
		TreeLinkNode a = new TreeLinkNode('a');
		TreeLinkNode b = new TreeLinkNode('b');
		TreeLinkNode c = new TreeLinkNode('c');
		TreeLinkNode d = new TreeLinkNode('d');
		TreeLinkNode e = new TreeLinkNode('e');
		TreeLinkNode f = new TreeLinkNode('f');
		TreeLinkNode g = new TreeLinkNode('g');
		TreeLinkNode h = new TreeLinkNode('h');
		TreeLinkNode i = new TreeLinkNode('i');

		a.left = b;
		a.right = c;

		b.left = d;
		b.right = e;
		b.next = a;

		d.next = b;

		e.left = h;
		e.right = i;
		e.next = b;

		h.next = e;
		i.next = e;

		c.left = f;
		c.right = g;
		c.next = a;

		f.next = c;
		g.next = c;

		TreeLinkNode result = new GetNext().getNext(i);
		if (result != null) {
			System.out.println(result.val);
		} else {
			System.out.println("null");
		}
	}

	public TreeLinkNode getNext(TreeLinkNode pNode) {
		if (pNode.right != null) {
			TreeLinkNode result = pNode.right;
			while (result.left != null) {
				result = result.left;
			}
			return result;
		} else if (pNode.next != null) {
			if (pNode == pNode.next.left) {
				return pNode.next;
			} else {
				TreeLinkNode result = pNode.next;
				while (result != null) {
					if (result.next != null && result == result.next.left) {
						return result.next;
					}
					result = result.next;
				}
			}
		}
		return null;
	}
}
