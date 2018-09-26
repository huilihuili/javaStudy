package top.leagle.interview;

public class Serialize {

	public static void main(String[] args) {
		Serialize serialize = new Serialize();
		TreeNode treeNode = TreeNode.getTreeNode();
		treeNode.print();

		String string = serialize.serialize(treeNode);
		System.out.println(string);

		treeNode = serialize.deserialize(string);
		treeNode.print();
	}

	String serialize(TreeNode root) {
		StringBuilder s = new StringBuilder();
		serialize(root, s);
		return s.substring(0, s.length() - 1).toString();
	}

	void serialize(TreeNode root, StringBuilder s) {
		if (root == null) {
			s.append("$,");
			return;
		}
		s.append(root.val + ",");
		serialize(root.left, s);
		serialize(root.right, s);
	}

	TreeNode deserialize(String str) {
		int[] index = { 0 };
		TreeNode result = deserialize(str.split(","), index);
		return result;
	}

	TreeNode deserialize(String[] array, int[] index) {
		if (array[index[0]].equals("$")) {
			return null;
		}

		TreeNode result = new TreeNode(Integer.valueOf(array[index[0]]));
		index[0] = index[0] + 1;
		result.left = deserialize(array, index);
		index[0] = index[0] + 1;
		result.right = deserialize(array, index);
		return result;
	}

	public int index = -1;

	String serializeOther(TreeNode root) {
		StringBuffer sb = new StringBuffer();
		if (root == null) {
			sb.append("#,");
			return sb.toString();
		}
		sb.append(root.val + ",");
		sb.append(serializeOther(root.left));
		sb.append(serializeOther(root.right));
		return sb.toString();
	}

	TreeNode deserializeOther(String str) {
		index++;
		int len = str.length();
		if (index >= len) {
			return null;
		}
		String[] strr = str.split(",");
		TreeNode node = null;
		if (!strr[index].equals("#")) {
			node = new TreeNode(Integer.valueOf(strr[index]));
			node.left = deserializeOther(str);
			node.right = deserializeOther(str);
		}

		return node;
	}
}
