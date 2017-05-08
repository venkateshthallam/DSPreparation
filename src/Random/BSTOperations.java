package src.Random;

class Node<T> {
  //The value present in the node.
  public int value;

  //The reference to the left subtree.
  public Node left;

  //The reference to the right subtree.
  public Node right;

  public Node(int value) {
    this.value = value;
  }

}

/**
 * Represents the Binary Search Tree.
 */
class BinarySearchTree {

  //Refrence for the root of the tree.
  public Node root;

  public BinarySearchTree insert(int value) {
    Node node = new Node<>(value);

    if (root == null) {
      root = node;
      return this;
    }

    insertRec(root, node);
    return this;
  }

  private void insertRec(Node latestRoot, Node node) {

    if (latestRoot.value > node.value) {

      if (latestRoot.left == null) {
        latestRoot.left = node;
        return;
      } else {
        insertRec(latestRoot.left, node);
      }
    } else {
      if (latestRoot.right == null) {
        latestRoot.right = node;
        return;
      } else {
        insertRec(latestRoot.right, node);
      }
    }
  }

  /**
   * Returns the minimum value in the Binary Search Tree.
   */
  public int findMinimum() {
    if (root == null) {
      return 0;
    }
    Node currNode = root;
    while (currNode.left != null) {
      currNode = currNode.left;
    }
    return currNode.value;
  }

  /**
   * Returns the maximum value in the Binary Search Tree
   */
  public int findMaximum() {
    if (root == null) {
      return 0;
    }

    Node currNode = root;
    while (currNode.right != null) {
      currNode = currNode.right;
    }
    return currNode.value;
  }

  /**
   * Printing the contents of the tree in an inorder way.
   */
  public void printInorder() {
    printInOrderRec(root);
    System.out.println("");
  }

  /**
   * Helper method to recursively print the contents in an inorder way
   */
  private void printInOrderRec(Node currRoot) {
    if (currRoot == null) {
      return;
    }
    printInOrderRec(currRoot.left);
    System.out.print(currRoot.value + ", ");
    printInOrderRec(currRoot.right);
  }

  /**
   * Printing the contents of the tree in a Preorder way.
   */
  public void printPreorder() {
    printPreOrderRec(root);
    System.out.println("");
  }

  /**
   * Helper method to recursively print the contents in a Preorder way
   */
  private void printPreOrderRec(Node currRoot) {
    if (currRoot == null) {
      return;
    }
    System.out.print(currRoot.value + ", ");
    printPreOrderRec(currRoot.left);
    printPreOrderRec(currRoot.right);
  }

  /**
   * Printing the contents of the tree in a Postorder way.
   */
  public void printPostorder() {
    printPostOrderRec(root);
    System.out.println("");
  }

  /**
   * Helper method to recursively print the contents in a Postorder way
   */
  private void printPostOrderRec(Node currRoot) {
    if (currRoot == null) {
      return;
    }
    printPostOrderRec(currRoot.left);
    printPostOrderRec(currRoot.right);
    System.out.print(currRoot.value + ", ");

  }
  
  
  public int findDistance(int n1, int n2) {
		int x = Pathlength(root, n1) - 1;
		int y = Pathlength(root, n2) - 1;
		int lcavalue = findLCA(root, n1, n2).value;
		int lcaDistance = Pathlength(root, lcavalue) - 1;
		return (x + y) - 2 * lcaDistance;
	}
  
  public int Pathlength(Node root, int n1) {
		if (root != null) {
			int x = 0;
			if ((root.value == n1) || (x = Pathlength(root.left, n1)) > 0
					|| (x = Pathlength(root.right, n1)) > 0) {
				// System.out.println(root.value);
				return x + 1;
			}
			return 0;
		}
		return 0;
	}

  public Node findLCA(Node root, int n1, int n2) {
		if (root != null) {
			if (root.value == n1 || root.value == n2) {
				return root;
			}
			Node left = findLCA(root.left, n1, n2);
			Node right = findLCA(root.right, n1, n2);

			if (left != null && right != null) {
				return root;
			}
			if (left != null) {
				return left;
			}
			if (right != null) {
				return right;
			}
		}
		return null;
	}
}

public class BSTOperations {

  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();
    bst .insert(40)
        .insert(25)
        .insert(78)
        .insert(10)
        .insert(3)
        .insert(17)
        .insert(32)
        .insert(30)
        .insert(38)
        .insert(78)
        .insert(50)
        .insert(93);
    System.out.println("Inorder traversal");
    bst.printInorder();

    System.out.println("Preorder Traversal");
    bst.printPreorder();

    System.out.println("Postorder Traversal");
    bst.printPostorder();

    System.out.println("The minimum value in the BST: " + bst.findMinimum());
    System.out.println("The maximum value in the BST: " + bst.findMaximum());
    
    System.out.println("Distance between 40 and 50 is : "
			+ bst.findDistance(40, 50));


  }
}