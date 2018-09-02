package top.leagle.interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Print {

	/**
	 * 
	 * @Title: print1
	 * @Description: 一行一行的输出
	 * @param pRoot
	 * @return
	 */
	ArrayList<ArrayList<Integer>> print1(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if (pRoot == null) {
			return result;
		}

		int nextLevel = 0;
		int toBePrinted = 1;

		ArrayList<Integer> line = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(pRoot);
		while (!queue.isEmpty()) {
			TreeNode temp = queue.remove();
			line.add(temp.val);

			if (temp.left != null) {
				queue.offer(temp.left);
				nextLevel++;
			}

			if (temp.right != null) {
				queue.offer(temp.right);
				nextLevel++;
			}
			toBePrinted--;

			if (toBePrinted == 0) {
				toBePrinted = nextLevel;
				nextLevel = 0;

				result.add(line);
				line = new ArrayList<>();
			}
		}

		return result;
	}

	/**
	 * 
	 * @Title: print2
	 * @Description:
	 * @param pRoot
	 * @return 之字形输出
	 */
	ArrayList<ArrayList<Integer>> print2(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if (pRoot == null) {
			return result;
		}

		ArrayList<Integer> line = new ArrayList<>();
		Stack<TreeNode> stack1 = new Stack<>();
		Stack<TreeNode> stack2 = new Stack<>();
		stack1.push(pRoot);
		int current = 0;
		while (!stack1.isEmpty() || !stack2.isEmpty()) {
			TreeNode temp;

			if (current == 0) {
				temp = stack1.pop();
			} else {
				temp = stack2.pop();
			}
			line.add(temp.val);

			if (current == 0) {
				if (temp.left != null) {
					stack2.push(temp.left);
				}
				if (temp.right != null) {
					stack2.push(temp.right);
				}
			} else {
				if (temp.right != null) {
					stack1.push(temp.right);
				}
				if (temp.left != null) {
					stack1.push(temp.left);
				}
			}

			if ((current == 0 && stack1.isEmpty()) || (current == 1 && stack2.isEmpty())) {
				result.add(line);
				line = new ArrayList<>();
				current = 1 - current;
			}
		}
		return result;
	}

	/**
	 * 
	 * @Title: print2Other
	 * @Description: 之字形输出的另一种方法
	 * @param pRoot
	 * @return
	 */
	ArrayList<ArrayList<Integer>> print2Other(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if (pRoot == null) {
			return result;
		}

		ArrayList<Integer> line = new ArrayList<>();
		Stack<TreeNode> stack1 = new Stack<>();
		Stack<TreeNode> stack2 = new Stack<>();
		stack1.push(pRoot);
		int layer = 2;
		while (!stack1.isEmpty() || !stack2.isEmpty()) {
			TreeNode temp;
			if (layer % 2 == 0) {
				while (!stack1.isEmpty()) {
					temp = stack1.pop();
					line.add(temp.val);
					if (temp.left != null) {
						stack2.push(temp.left);
					}
					if (temp.right != null) {
						stack2.push(temp.right);
					}
				}
			} else {
				while (!stack2.isEmpty()) {
					temp = stack2.pop();
					line.add(temp.val);
					if (temp.right != null) {
						stack1.push(temp.right);
					}
					if (temp.left != null) {
						stack1.push(temp.left);
					}
				}
			}
			result.add(line);
			line = new ArrayList<>();
			layer++;
		}
		return result;
	}
}
