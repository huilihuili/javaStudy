package top.leagle.interview;

public class ReConstructBinaryTree {

	public static void main(String[] args) {
		int[] preorder = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] inorder = { 4, 7, 2, 1, 5, 3, 8, 6 };
		ReConstructBinaryTree reConstructBinaryTree = new ReConstructBinaryTree();
		TreeNode treeNode = reConstructBinaryTree.reConstructBinaryTree(preorder, inorder);
		printTreeNodePre(treeNode);
	}

	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		return reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
		// System.out.println(startPre + " " + endPre + " " + startIn + " " + endIn);
		int rootValue = pre[startPre];
		TreeNode root = new TreeNode(rootValue);
		for (int i = startIn; i <= endIn; i++) {
			if (in[i] == rootValue) {
				if (i != startIn) {
					root.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
				}
				if (i != endIn) {
					root.right = reConstructBinaryTree(pre, startPre + i - startIn + 1, endPre, in, i + 1, endIn);
				}
				break;
			}
		}
		return root;
	}

	public static void printTreeNodePre(TreeNode treeNode) {
		if (treeNode != null) {
			System.out.print(treeNode.val + " ");
			printTreeNodePre(treeNode.left);
			printTreeNodePre(treeNode.right);
		}
	}
}
