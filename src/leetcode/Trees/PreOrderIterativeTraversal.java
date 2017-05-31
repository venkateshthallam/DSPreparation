package src.leetcode.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
1. Add all root node and left nodes to a list.
2. Right nodes to a stack
3. Process stack, pop each, check for left or right, add to the list.
4. return the list.
*/

class TNode {
	      int val;
	      TNode left;
	      TNode right;
	      TNode(int x) { val = x; }
}
 
public class PreOrderIterativeTraversal {
	
	
	public static void main(String[] args) {
		TNode root = new TNode(1);
		root.left = new TNode(2);
		root.right = new TNode(3);
		System.out.println(preorderTraversal(root));
	}

	
   public static List<Integer> preorderTraversal(TNode root) {
       List<Integer> res = new ArrayList<Integer>();
       Stack<TNode> rights = new Stack<TNode>();
       TNode temp = root;
       while(temp!=null){
           res.add(temp.val);
           if(temp.right!=null)
               rights.push(temp.right);
           temp = temp.left;
           if(temp==null&&!rights.empty())
               temp = rights.pop();
       }
       
       return res;
       
   }
}