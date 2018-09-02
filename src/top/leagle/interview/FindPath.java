package top.leagle.interview;

import java.util.ArrayList;

public class FindPath {
	public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}

		findPath(root, target, result, new ArrayList<Integer>(), 0);
		return result;
	}

	public void findPath(TreeNode root, int target, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> middleData,
			int currentSum) {
		currentSum += root.val;
		middleData.add(root.val);

		if (currentSum == target && (root.left == null && root.right == null)) {
			result.add(new ArrayList<Integer>(middleData));
		}

		if (root.left != null) {
			findPath(root.left, target, result, middleData, currentSum);
		}

		if (root.right != null) {
			findPath(root.right, target, result, middleData, currentSum);
		}
		middleData.remove(middleData.size() - 1);
	}
}
