package src.leetcode.Trees;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class CheckBinaryTreeIsBST {
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int val){
			this.val = val;
		}
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(1);
		 root.right = null;
		 System.out.println(new CheckBinaryTreeIsBST().isValidBST(root));

		
		
	}
	
    public  boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        return isBST(root, null);
        
    }
    
    private  boolean isBST(TreeNode root, TreeNode prev){
        if(root==null) return true;
        //Starting by looping through left branch, coz inorder
        if(!isBST(root.left,prev)) return false;
        if(prev!=null && prev.val >= root.val) return false;
        prev = root;
        return isBST(root.right, prev);
    }
}