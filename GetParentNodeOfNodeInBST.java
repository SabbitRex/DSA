public class GetParentNodeOfNodeInBST {
	
	class Node {
		
		int data;
		Node left;
		Node right;
	}
	
	public Node insert(Node node, int data) {
		
		if (node == null) {
			
			return createNewNode(data);
		}
		
		if (data < node.data) {
			
			node.left = insert(node.left, data);
		}
		
		if (data > node.data) {
			
			node.right = insert(node.right, data);
		}
		
		return node;
	}
	
	public Node createNewNode(int data) {
		
		Node node = new Node();
		
		node.data = data;
		node.left = null;
		node.right = null;
		
		return node;
	}

	public void inOrder(Node root) {
		
		if (root == null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	public Node getParentNode(Node root, int data) {
		
		if (root == null) {
			
			return null;
		}
		
		Node parent = null;
		
		while (root.data != data) {
			
			if (data < root.data) {
				
				parent = root;
				root = root.left;
			}
			
			if (data > root.data) {
				
				parent = root;
				root = root.right;
			}
			
			if (data == root.data) {
				
				break;
			}
		}
		
		return parent;
	}
	
	public static void main(String[] args) {
		
		GetParentNodeOfNodeInBST opr = new GetParentNodeOfNodeInBST();
		
		Node root = null;
		
		root = opr.insert(root, 8);
	    root = opr.insert(root, 3);
	    root = opr.insert(root, 6);
	    root = opr.insert(root, 10);
	    root = opr.insert(root, 4);
	    root = opr.insert(root, 7);
	    root = opr.insert(root, 1);
	    root = opr.insert(root, 14);
	    root = opr.insert(root, 13);
	    
	    Node parent = opr.getParentNode(root, 3);
	    
	    System.out.println("Parent node : " + parent.data);
	    
	    opr.inOrder(root);
	}
}
