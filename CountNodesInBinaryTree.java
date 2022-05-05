import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CountNodesInBinaryTree {

	private static List<Integer> nodes = new ArrayList<Integer>();
	
	private static List<Integer> nodesInLevelOrder = new ArrayList<Integer>();
	
	class Node {
		
		int data;
		Node left;
		Node right;
	}
	
	public Node createNewNode(int data) {
		
		Node node = new Node();
		
		node.data = data;
		node.left = null;
		node.right = null;
		
		return node;
	}
	
	public void countNodesUsingLevelOrder(Node root) {
		
		if (root == null) {
			
			return;
		}
		
		Queue<Node> queue = new LinkedList<>();
		
		queue.add(root);
		
		while (!queue.isEmpty()) {
			
			Node temp = queue.poll();
			
			nodesInLevelOrder.add(temp.data);
			
			if (temp.left != null) {
				
				queue.add(temp.left);
			}
			
			if (temp.right != null) {
				
				queue.add(temp.right);
			}
		}
	}
	
	public void countNodeUsingInOrder(Node root) {
		
		if (root == null) {
			return;
		}
		
		countNodeUsingInOrder(root.left);
		nodes.add(root.data);
		countNodeUsingInOrder(root.right);
	}
	
	
	public static void main(String[] args) {
		
		CountNodesInBinaryTree opr = new CountNodesInBinaryTree();
		
		Node root = opr.createNewNode(2);
		root.left = opr.createNewNode(7);
		root.right = opr.createNewNode(5);
		root.left.left = opr.createNewNode(2);
		root.left.right = opr.createNewNode(6);
		root.left.right.left = opr.createNewNode(5);
		root.left.right.right = opr.createNewNode(11);
		root.right.right = opr.createNewNode(9);
		root.right.right.left = opr.createNewNode(4);
		
		opr.countNodesUsingLevelOrder(root);
		
		opr.countNodeUsingInOrder(root);
		
		System.out.println("Nodes count using level-order : " + nodesInLevelOrder.size());
		
		System.out.println("Nodes count using in-order : " + nodes.size());
	}
}
