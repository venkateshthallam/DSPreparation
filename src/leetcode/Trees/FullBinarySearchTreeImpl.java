package src.leetcode.Trees;

public class FullBinarySearchTreeImpl {

	public static void main(String[] args) {
		Node root = new Node(10);
		insertVal(15, root);
		insertVal(7, root);
		insertVal(87, root);
		insertVal(36, root);
		insertVal(55, root);
		printBST(root);
	}
	
	public static void insertVal(int newVal, Node root){
		
		if(root==null){
			return;
		}
		if(root.val < newVal){
			if(root.right!=null)
				insertVal(newVal, root.right);
			else
			{
				Node temp = new Node(newVal);
				root.right = temp;
			}
		}
		else if(root.val > newVal){
			if(root.left!=null)
				insertVal(newVal, root.left);
			else
			{
				Node temp = new Node(newVal);
				root.left = temp;
			}
		}
		
	}
	
	public static void printBST(Node root){
		if(root==null)
			return;
		System.out.println(root.val+",");
		printBST(root.left);
		printBST(root.right);
	}
	
	

}

class Node{
	int val;
	Node left;
	Node right;
	
	public Node(int val){
		this.val = val;
	}
}
