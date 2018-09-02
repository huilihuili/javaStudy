package top.leagle.interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintFromTopToBottom {
	public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<>();
		if (root == null) {
			return result;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			TreeNode temp = queue.remove();
			result.add(temp.val);
			if (temp.left != null) {
				queue.offer(temp.left);
			}

			if (temp.right != null) {
				queue.offer(temp.right);
			}
		}
		return result;
	}
}
