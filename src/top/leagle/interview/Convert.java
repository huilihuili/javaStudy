package top.leagle.interview;

public class Convert {
	private TreeNode lastNode;

	public static void main(String[] args) {
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

		Convert convert = new Convert();
		convert.convert(treeNode1);
	}

	public TreeNode convert(TreeNode pRootOfTree) {
		if (pRootOfTree == null) {
			return null;
		}
		
		convertNode(pRootOfTree);
		
		for (TreeNode treeNode = lastNode; treeNode != null; treeNode = treeNode.left) {
			System.out.print(treeNode.val + " ");
		}
		System.out.println();
		
		TreeNode result = lastNode;
		while (result != null && result.left != null) {
			result = result.left;
		}
		
		for (TreeNode treeNode = result; treeNode != null; treeNode = treeNode.right) {
			System.out.print(treeNode.val + " ");
		}
		System.out.println();
		return result;
	}

	public void convertNode(TreeNode currentNode) {
		if (currentNode.left != null) {
			convertNode(currentNode.left);
		}
		currentNode.left = lastNode;
		if (lastNode != null) {
			lastNode.right = currentNode;
		}

		lastNode = currentNode;
		if (currentNode.right != null) {
			convertNode(currentNode.right);
		}
	}
}
