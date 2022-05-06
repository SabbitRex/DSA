public class TwoTreeSameSkeleton {

	class Node {
		
		int data;
		Node left;
		Node right;
	}
	
	public Node createNewNode(int data) {
		
		Node node = new Node();
		
		node.left = null;
		node.right = null;
		
		return node;
	}
	
	public boolean isSameSkeleton(Node root1, Node root2) {
		
		if (root1 == null && root2 == null) {
			
			return true;
		}
		
        if ((root1 == null && root2 != null) || (root1 != null && root2 == null)) {
			
			return false;
		}
		
		return isSameSkeleton(root1.left, root2.left) && isSameSkeleton(root1.right, root2.right);
	}
	
	public static void main(String[] args) {
		
		TwoTreeSameSkeleton tree = new TwoTreeSameSkeleton();
		
	    Node root1 = tree.createNewNode(2);
	    root1.left = tree.createNewNode(7);
	    root1.right = tree.createNewNode(8);
	    root1.left.left = tree.createNewNode(5);
	    root1.left.right = tree.createNewNode(5);

	    Node root2 = tree.createNewNode(3);
	    root2.left = tree.createNewNode(6);
	    root2.right = tree.createNewNode(7);
	    root2.left.left = tree.createNewNode(5);
	    root2.left.right = tree.createNewNode(5);
//	    root2.left.right.left = tree.createNewNode(11);
	    
	    System.out.println(tree.isSameSkeleton(root1, root2));
	}
}
