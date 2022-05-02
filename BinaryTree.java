import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BinaryTree {
	
	TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
	
	class Node {
		
		int data;
		Node left;
		Node right;
		
		int height = 0; // To be used when printing top view.
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
	
	public void topView(Node root) {
		
		if (root == null) {
			
			return;
		}
		
		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(root);
		
		while (!queue.isEmpty()) {
			
			Node node = queue.poll();
			int h = node.height;
			
			if (this.map.get(h) == null) {
				
				this.map.put(h, node.data);
			}
			
			if (node.left != null) {
				
				node.left.height = h - 1;
				queue.add(node.left);
			}
			
            if (node.right != null) {
				
            	node.right.height = h + 1;
				queue.add(node.right);
			}
		}
		
		System.out.println("Top view : ");
		
	    for (Map.Entry<Integer, Integer> itr : map.entrySet()) {
	    	
	    	System.out.print(itr.getValue() + " ");
	    }
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
	    
	    System.out.println();
	    binaryTree.topView(root);
	}
}
