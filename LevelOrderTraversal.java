import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	class Node {
		
		int data;
		Node left;
		Node right;
	}
	
	public void levelOrderTraversal(Node root) {
		
		if (root == null) {
			
			System.out.println("Tree is empty.");
			return;
		}
		
		Queue<Node> queue = new LinkedList<>();
		
		queue.add(root);
		
		while (true) {
			
			int queueSize = queue.size();
			
			if (queueSize == 0) {
				
				break;
			}
			
			while (queueSize > 0) {
				
				Node current = queue.poll();
				
				System.out.print(current.data + " ");
				
				if (current.left != null) {
					
					queue.add(current.left);
				}
				
				if (current.right != null) {
					
					queue.add(current.right);
				}
				
				queueSize--;
			}
			
			System.out.println();
			
		}
	}
	
	public Node createNewNode(int data) {
		
		Node node = new Node();
		
		node.data = data;
		node.left = null;
		node.right = null;
		
		return node;
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
