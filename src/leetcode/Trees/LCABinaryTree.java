package src.leetcode.Trees;

/*
1. Recrsively search for left and right nodes.
2. If you find both of them, their values will not be null at the LCA.
3. If you find only one of the node, return the other.
*/
public class LCABinaryTree {

	public static void main(String[] args) {
		

	}
	
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left!=null && right!= null) return root;
        return left!=null?left:right;
    }

}
