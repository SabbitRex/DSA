import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class TreeTopView {
	
	private Set<Integer> set = new HashSet<>();
	
	class Node {
		
		int data;
		Node left;
		Node right;
		int height;
	}

	public Node createNewNode(int data) {
		
		Node node = new Node();
		
		node.data = data;
		node.left = null;
		node.right = null;
		node.height = 0;
		
		return node;
	
	}
	
	public void topView(Node root) {
		
		if (root == null) {
			
			System.out.println("Tree is empty.");
			return;
		}
		
		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(root);

		while (true) {
			
			int queueSize = queue.size();
			
			while (queueSize > 0) {
				
				Node current = queue.poll();

				if (set.add(current.height)) {
					
					System.out.print(current.data + " ");
				}
				
				if (current.left != null) {
					
					current.left.height = current.height - 1;
					queue.add(current.left);
				}
				
				if (current.right != null) {
					
					current.right.height = current.height + 1;
					queue.add(current.right);
				}
				
				queueSize--;
			}
		}
	}
	
	public static void main(String[] args) {
		
		TreeTopView view = new TreeTopView();
		
	    Node root = view.createNewNode(2);
	    root.left = view.createNewNode(7);
	    root.right = view.createNewNode(5);
	    root.left.left = view.createNewNode(2);
	    root.left.right = view.createNewNode(6);
	    root.left.right.left = view.createNewNode(5);
	    root.left.right.right = view.createNewNode(11);
	    root.right.right = view.createNewNode(9);
	    root.right.right.left = view.createNewNode(4);
	    
	    view.topView(root);
	}
}
