package src.Random;

public class TriImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriImp timpl=new TriImp();
		Tree treeObj=timpl.new Tree();
		treeObj.insert(8);
		treeObj.insert(8);
		treeObj.insert(10);
		treeObj.insert(16);
		treeObj.insert(7);
		treeObj.insert(5);
		treeObj.insert(5);
		
		treeObj.print(treeObj.mainRoot);
		
		treeObj.delete(treeObj.mainRoot, 10);
		treeObj.delete(treeObj.mainRoot, 5);
		
		System.out.println("Values after deleting the above values!");
		
		treeObj.print(treeObj.mainRoot);
	}
	
	public class Tree{
		Node mainRoot;
		Tree(){
			mainRoot=null;
		}
		Tree(int val){
			Node n=new Node(val);
			mainRoot=n;
		}
		
		public void insert(int ele){
			if(mainRoot==null){
				mainRoot=new Node(ele);
			}
			else{
				System.out.println("calling insert method with mainroot as the parameter! "+ele);
				insert(mainRoot,ele);
				
			}
		}
		
		//Searches for the location where the 'ele' can be inserted and then insert it!
		public  Node insert(Node root,int ele){
			if(root!=null){
					if(root.val<ele){
						if(root.left!=null)
							insert(root.left,ele);
						else
							root.left=new Node(ele);
					}
					else if(root.val>ele){
						if(root.right!=null)
							insert(root.right,ele);
						else
							root.right=new Node(ele);
					}
					else{
						if(root.mid==null){
							Node n=new Node(ele);
							root.mid=n;
						}
						else{
							root.mid=new Node(ele);
						}
					}
				}
			return root;
			
	}
		
		public Node delete(Node root,int ele)
		{
			if(root!=null)
			{
				if (root.val > ele) {
					root.left=delete(root.left, ele);
				} else if (root.val < ele) {
					root.right=delete(root.right, ele);
				} else 
				{
					if (root.mid != null) {
						root.mid=delete(root.mid, ele);
					} else if (root.right != null) {
						Node minNode = returnMinNode(root.right);
						root.val = minNode.val;
						//root.right = null;
						root.right = delete(root.right, minNode.val);

					} else {
						root = root.left;
					}

				}
			}
			return root;
		}
		private Node returnMinNode(Node root){
			if(root!=null){
				returnMinNode(root.left);
			}
			
			
			return root;
		}
		
		public void print(Node root){
			if(root!=null){
				System.out.println("value is "+root.val);
				print(root.left);
				print(root.mid);
				print(root.right);
			}
		}
		
	}
	

	
	public class Node{
		int val;
		Node left;
		Node mid;
		Node right;
		
		Node(){
			val=0;
		}
		Node(int val){
			this.val=val;
		}
	}

}
