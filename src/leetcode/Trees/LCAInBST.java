package src.leetcode.Trees;

/*
 * LCA would be the node where both given values diverge.
 * 
 * */
public class LCAInBST {
	

	public static void main(String[] args) {

	}
	
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root!=null){
            if(p.val < root.val && q.val < root.val){
                root = root.left;
            }
            else if(p.val > root.val && q.val > root.val){
                root = root.right;
            }
            else{
                return root;
            }
        }
        
        return root;
    }
}
