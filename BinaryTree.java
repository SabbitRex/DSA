public class BinaryTree {
	
	class Node {
		
		int data;
		Node left;
		Node right;
	}

	public Node createNewNode(int data) {
		
		Node newNode = new Node();
		
		newNode.data = data;
		newNode.left = null;
		newNode.right = null;
		
		return newNode;
	}
	
	public void preOrder(Node root) {
		
		if (root == null) {
			
			return;
		}
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	
	public void inOrder(Node root) {
		
		if (root == null) {
			
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	public void postOrder(Node root) {
		
		if (root == null) {
			
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
	
	public static void main(String[] args) {
		
		BinaryTree binaryTree = new BinaryTree();
		
	    Node root = binaryTree.createNewNode(2);
	    root.left = binaryTree.createNewNode(7);
	    root.right = binaryTree.createNewNode(5);
	    root.left.left = binaryTree.createNewNode(2);
	    root.left.right = binaryTree.createNewNode(6);
	    root.left.right.left = binaryTree.createNewNode(5);
	    root.left.right.right = binaryTree.createNewNode(11);
	    root.right.right = binaryTree.createNewNode(9);
	    root.right.right.left = binaryTree.createNewNode(4);
	    
	    System.out.println("Pre : ");
	    binaryTree.preOrder(root);
	    
	    System.out.println();
	    
	    System.out.println("In : ");
	    binaryTree.inOrder(root);
	    
	    System.out.println();
	    
	    System.out.println("Post : ");
	    binaryTree.postOrder(root);
	}
}
