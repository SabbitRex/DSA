public class TwoTreeMirrorSkeleton {

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
	
	public boolean isMirrorSkeleton(Node root1, Node root2) {
		
		if (root1 == null && root2 == null) {
			
			return true;
		}
		
        if ((root1 == null && root2 != null) || (root1 != null && root2 == null)) {
			
			return false;
		}
		
		return isMirrorSkeleton(root1.left, root2.right) && isMirrorSkeleton(root1.right, root2.left);
	}
	
	public static void main(String[] args) {
		
		TwoTreeMirrorSkeleton tree = new TwoTreeMirrorSkeleton();
		
	    Node root1 = tree.createNewNode(2);
	    root1.left = tree.createNewNode(7);
	    root1.right = tree.createNewNode(8);
	    root1.left.left = tree.createNewNode(5);

	    Node root2 = tree.createNewNode(3);
	    root2.left = tree.createNewNode(6);
	    root2.right = tree.createNewNode(7);
	    root2.right.right = tree.createNewNode(5);
//	    root2.right.right.left = tree.createNewNode(5);
	    
	    System.out.println(tree.isMirrorSkeleton(root1, root2));
	}
}
