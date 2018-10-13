package top.leagle.interview;

public class IsBalanced {

	public boolean isBalanced(TreeNode root) {
		return isBalanced(root, new int[] { 0 });
	}

	boolean isBalanced(TreeNode root, int[] depth) {
		if (root == null) {
			depth[0] = 0;
			return true;
		}

		boolean left = isBalanced(root.left, depth);
		int leftdepth = depth[0];
		boolean right = isBalanced(root.right, depth);
		int rightdepth = depth[0];
		if (left && right) {
			int diff = rightdepth - leftdepth;
			if (diff <= 1 && diff >= -1) {
				depth[0] = (leftdepth > rightdepth) ? leftdepth + 1 : rightdepth + 1;
				return true;
			}
		}
		return false;
	}
}
