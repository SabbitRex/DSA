public class BinarySearchTree {

	public static void main(String[] args) {
		
		BSTOperations operations = new BSTOperations();
		
		Node root = null;
		
		root = operations.insert(root, 8);
		root = operations.insert(root, 3);
		root = operations.insert(root, 6);
		root = operations.insert(root, 10);
		root = operations.insert(root, 4);
		root = operations.insert(root, 7);
		root = operations.insert(root, 1);
		root = operations.insert(root, 14);
		root = operations.insert(root, 13);
		
		operations.searchNode(root, 13);
		operations.searchNode(root, 23);
		operations.searchNode(root, 1);
		operations.searchNode(root, 10);
		operations.searchNode(root, 2);
		
		root = operations.deleteNode(root, 10);
	}
}

class BSTOperations {

	public Node createNewNode(int Value) {
		
		Node node = new Node();
		
		node.leftChild = null;
		node.rightChild = null;
		node.value = Value;
		
		return node;
	}
	
	public Node deleteNode(Node root, int value) {
		
		if (root == null) {
			
			System.out.println("Node not found.");
			return null;
		}
		
		if (root.value < value) {
			
			root.rightChild = deleteNode(root.rightChild, value);
			
		} else if (root.value > value) {
			
			root.leftChild = deleteNode(root.leftChild, value);
			
		} else {
			
			if (root.leftChild != null && root.rightChild == null) {
				
				root = root.leftChild;
				
			} else if (root.leftChild == null && root.rightChild != null) {
				
				root = root.rightChild;
				
			} else if (root.leftChild == null && root.rightChild == null) {
				
				root = null;
				
			} else {
				
				Node temp = root;
				
				Node minValueNodeInRightSubTree = minimumElement(temp.rightChild);
				
				root.value = minValueNodeInRightSubTree.value;
				
				root.rightChild = deleteNode(root.rightChild, minValueNodeInRightSubTree.value);
			}
		}
		
		return root;
	}
	
    public Node minimumElement(Node root) {
    	
        if (root.leftChild == null) {
        	
        	return root;
        	
        } else {
        	
            return minimumElement(root.leftChild);
        }
    }
    
	public Node insert(Node node, int value) {
		
		if (node == null) {
			
			return createNewNode(value);
		}
		
		if (value > node.value) {
			
			node.rightChild = insert(node.rightChild, value);
			
		} else if (value < node.value) {
			
			node.leftChild = insert(node.leftChild, value);
		}
		
		return node;
	}
	
	public boolean searchNode(Node root, int value) {
		
		if (root == null) {
			
			System.out.println("404 Not found");
			return false;
		}
		
		if (root.value == value) {
			
			System.out.println("200");
		} 
		
		if (root.value < value) {
			
			searchNode(root.rightChild, value);
			
		} else if (root.value > value) {
			
			searchNode(root.leftChild, value);
		}
		
		return true;
	}
}

class Node {
	
	Node leftChild;
	Node rightChild;
	int value;
}
