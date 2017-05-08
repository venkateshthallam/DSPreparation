package src.leetcode.Trees;

public class MinimumNodeValDifferenceBST {

	Integer prev = 0;
	int minDiff = Integer.MAX_VALUE;

	public static void main(String[] args) {

	}

	public int getMinimumDifference(TreeNode root) {
		if (root == null)
			return minDiff;
		getMinimumDifference(root.left);
		if (prev != null)
			minDiff = Math.min(minDiff, (root.val - prev));
		prev = root.val;
		getMinimumDifference(root.right);
		return minDiff;
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
