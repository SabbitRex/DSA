public class IdenticalBinaryTree {

	class Node {

		int data;
		Node left;
		Node right;
	}

	public Node createNewNode(int data) {

		Node node = new Node();

		node.data = data;
		node.left = null;
		node.left = null;

		return node;
	}

	public boolean isIdentical(Node root1, Node root2) {

		if (root1 == null && root2 == null) {

			return true;
		}

		if (root1 == null || root2 == null) {

			return false;
		}

		return root1.data == root2.data && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
	}

	public static void main(String[] args) {

		IdenticalBinaryTree opr = new IdenticalBinaryTree();
		
		Node root1 = opr.createNewNode(8);
		root1.left = opr.createNewNode(3);
		root1.right = opr.createNewNode(10);
		root1.left.left = opr.createNewNode(1);
		root1.left.right = opr.createNewNode(6);
		root1.left.right.left = opr.createNewNode(4);
		root1.left.right.right = opr.createNewNode(7);
		root1.right.right = opr.createNewNode(14);
		root1.right.right.left = opr.createNewNode(13);

		Node root2 = opr.createNewNode(8);
		root2.left = opr.createNewNode(3);
		root2.right = opr.createNewNode(10);
		root2.left.left = opr.createNewNode(1);
		root2.left.right = opr.createNewNode(6);
		root2.left.right.left = opr.createNewNode(4);
		root2.left.right.right = opr.createNewNode(7);
		root2.right.right = opr.createNewNode(14);
		root2.right.right.left = opr.createNewNode(13);
		
		boolean isIdentical = opr.isIdentical(root1, root2);
		
		System.out.println(isIdentical);
	}
}
