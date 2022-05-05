public class DeleteNodeBinarySearchTree {
	
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
		
		node.left = null;
		node.right = null;
		node.data = data;
		
		return node;
	}
	
	public Node deleteNonRecursive(Node root, int data) {
		
		if (root == null) {
			return root;
		}
		
		Node parent = null;
		
		while (root.data != data && root != null) {
			
			if (data < root.data) {
				
				parent = root;
				root = root.left;
			}
			
			if (data > root.data) {
				
				parent = root;
				root = root.right;
			}
			
			if (root.data == data) {
				
				if (root.left != null && root.right == null) {
					
					root = root.left;
					
				} else if (root.left == null && root.right != null) {
					
					root = root.right;
					
				} else if (root.left == null && root.right == null) {
					
					parent.left = null;
					parent.right = null;
					root = null;
					break;
					
				} else if (root.left != null && root.right != null) {
		        	
		        	parent.left = root.left;
		        	Node node = largestNodeOnOneDownRightSubTree(root.left);
		        	node.right = root.right;
		        	root = null;
		        	break;
		        }
			}
		}
		
		return root;
	}
	
	public Node largestNodeOnOneDownRightSubTree(Node root) {
		
		if (root.right == null) {
			
			return root;
		}
		
		return largestNodeOnOneDownRightSubTree(root.right);
	}
	
	public void inOrder(Node root) {
		
		if (root == null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	public static void main(String[] args) {
		
		DeleteNodeBinarySearchTree opr = new DeleteNodeBinarySearchTree();
		
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
	    
	    opr.deleteNonRecursive(root, 3);
	    
	    opr.inOrder(root);
	}
}
