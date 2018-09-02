package top.leagle.interview;

public class Mirror {
	public void mirror(TreeNode root) {
		if (root == null) {
			return;
		}

		if (root.left == null && root.right == null) {
			return;
		}

		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;

		if (root.left != null) {
			mirror(root.left);
		}

		if (root.right != null) {
			mirror(root.right);
		}
	}
}
