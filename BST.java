public class BST {

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
	
	public void searchNode(Node root, int value) {
		
		if (root == null) {
			
			System.out.println("404 Not found");
			return;
		}
		
		if (root.value == value) {
			
			System.out.println("200");
			
		} else if (root.value < value) {
			
			searchNode(root.rightChild, value);
			
		} else if (root.value > value) {
			
			searchNode(root.leftChild, value);
		}
	}
}

class Node {
	
	Node leftChild;
	Node rightChild;
	int value;
}
