package top.leagle.interview;

import java.util.Stack;

public class KthNode {

	public static void main(String[] args) {
		TreeNode treeNode8 = new TreeNode(8);
		TreeNode treeNode6 = new TreeNode(6);
		TreeNode treeNode10 = new TreeNode(10);
		TreeNode treeNode5 = new TreeNode(5);
		TreeNode treeNode7 = new TreeNode(7);
		TreeNode treeNode9 = new TreeNode(9);
		TreeNode treeNode11 = new TreeNode(11);

		treeNode8.left = treeNode6;
		treeNode8.right = treeNode10;
		treeNode6.left = treeNode5;
		treeNode6.right = treeNode7;
		treeNode10.left = treeNode9;
		treeNode10.right = treeNode11;

		KthNode kthNode = new KthNode();
		System.out.println(kthNode.kthNode(treeNode8, 2));
	}

	TreeNode kthNode(TreeNode pRoot, int k) {
		if (pRoot == null || k == 0) {
			return null;
		}
		int count = 0;
		TreeNode node = pRoot;
		Stack<TreeNode> stack = new Stack<>();
		while (node != null || !stack.isEmpty()) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				node = stack.pop();
				count++;
				if (count == k) {
					return node;
				}
				node = node.right;
			}
		}
		return null;
	}
}
