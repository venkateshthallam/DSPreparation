package src.leetcode.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/*
 * The solution uses BFS, pushing left and right child's to the queue.
 * The values are added to the result, if the treenode is the last element in the queue,since we push the left elements first, 
 * this way we only add right view elements to the final result list.
 * 
 * */
public class RightSideView {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right = new TreeNode(2);
		System.out.println(rightSideView(root));
	}
	
	public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
       Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return res;
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<=size;i++){
                TreeNode temp = queue.poll();
                if(i==size-1)
                    res.add(temp.val);
                if(temp.left!=null) queue.offer(temp.left);
                if(temp.right!=null) queue.offer(temp.right);
            }
        }
        
    return res;
    }

}
