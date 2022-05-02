public class LevelOrderTraversal {
	
	class Node {
		
		int data;
		Node left;
		Node right;
	}
	
	public Node createNewNode(int data) {
		
		Node newNode = new Node();
		
		newNode.left = null;
		newNode.right = null;
		newNode.data = data;
		
		return newNode;
	}
	
	public void levelOrderTraversal(Node root) {
		
	}
	
	public static void main(String[] args) {
		
		LevelOrderTraversal lot = new LevelOrderTraversal();
		
	    Node root = lot.createNewNode(2);
	    root.left = lot.createNewNode(7);
	    root.right = lot.createNewNode(5);
	    root.left.left = lot.createNewNode(2);
	    root.left.right = lot.createNewNode(6);
	    root.left.right.left = lot.createNewNode(5);
	    root.left.right.right = lot.createNewNode(11);
	    root.right.right = lot.createNewNode(9);
	    root.right.right.left = lot.createNewNode(4);
		
	    lot.levelOrderTraversal(root);
	}
}
