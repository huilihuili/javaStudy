package top.leagle.interview;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}

	public static TreeNode getTreeNode() {
		TreeNode treeNode1 = new TreeNode(10);
		TreeNode treeNode2 = new TreeNode(6);
		TreeNode treeNode3 = new TreeNode(14);
		TreeNode treeNode4 = new TreeNode(4);
		TreeNode treeNode5 = new TreeNode(8);
		TreeNode treeNode6 = new TreeNode(12);
		TreeNode treeNode7 = new TreeNode(16);

		treeNode1.left = treeNode2;
		treeNode1.right = treeNode3;

		treeNode2.left = treeNode4;
		treeNode2.right = treeNode5;

		treeNode3.left = treeNode6;
		treeNode3.right = treeNode7;

		return treeNode1;
	}

	public void print() {
		Queue<TreeNode> queue = new LinkedList<>();
		
		if (this != null) {
			queue.add(this);
		}

		while (!queue.isEmpty()) {
			TreeNode treeNode = queue.remove();
			System.out.print(treeNode.val + " ");
			if (treeNode.left != null) {
				queue.add(treeNode.left);
			}

			if (treeNode.right != null) {
				queue.add(treeNode.right);
			}
		}
		System.out.println();
	}

	public boolean isFeafNode() {
		if (left == null && right == null) {
			return true;
		}

		return false;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

}
