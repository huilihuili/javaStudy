package top.leagle.interview;

public class HasSubtree {
	public boolean hasSubtree(TreeNode root1, TreeNode root2) {
		boolean result = false;
		if (root1 != null && root2 != null) {
			if (root1.val == root2.val) {
				result = doesTree1HasTree2(root1, root2);
			}

			if (!result) {
				result = hasSubtree(root1.left, root2);
			}

			if (!result) {
				result = hasSubtree(root1.right, root2);
			}
		}
		return result;
	}

	public boolean doesTree1HasTree2(TreeNode treeNode1, TreeNode treeNode2) {
		if (treeNode2 == null) {
			return true;
		}

		if (treeNode1 == null) {
			return false;
		}

		if (treeNode1.val != treeNode2.val) {
			return false;
		}

		return doesTree1HasTree2(treeNode1.left, treeNode2.left) && doesTree1HasTree2(treeNode1.right, treeNode2.right);
	}
}
