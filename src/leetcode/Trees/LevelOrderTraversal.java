package src.leetcode.Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
1. Add root to a queue.
2. While queue is not empty, add left and right child values to queue if they are not null
3. Take queue size as the loop count(level), loop through and push child nodes to queue, pop the element, add to list after that
 */
public class LevelOrderTraversal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}

	
    public List<List<Integer>> levelOrder(TreeNode root) {
        TreeNode rt = root;
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> resList = new LinkedList<>();
        if(root == null) return resList;
        queue.offer(root);
         List<Integer> levelList = null;
        while(!queue.isEmpty()){
            int level = queue.size();
             levelList = new LinkedList<Integer>();
            for(int i=0;i<level;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                levelList.add(queue.poll().val);
            }
            resList.add(levelList);
        }
        
        return resList;
    }
}