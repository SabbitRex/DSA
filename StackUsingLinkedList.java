public class StackUsingLinkedList {

	class Node {
		
		Node prev;
		int value;
	}
	
	Node bottom;
	Node top;
	int size = -1;
	
	public Node createNewNode(int value) {
	
		Node node = new Node();
		
		node.value = value;
		node.prev = null;
		
		return node;
	}
	
	private void push(int value) {
		
		if (bottom == null) {
			
			bottom = createNewNode(value);
			top = bottom;
			size++;
		}
		
		Node temp = createNewNode(value);
		temp.prev = top;
		top = temp;
		size++;
	}
	
	private int getSize() {
		
		return size;
	}
	
	private Node pop() {
	
		if (bottom == null) {
			
			return null;
		}
		
		top = top.prev;
		size--;
		
		return top;
	}
	
	private Node getTop( ) {
		
		if (bottom == null) {
			
			return null;
		}
		
		return top;
	}
	
	private Node getBottom() {
		
		if (bottom == null) {
			
			return null;
		}
		
		return bottom;
	}
	
	public static void main(String[] args) {
		
		StackUsingLinkedList stack = new StackUsingLinkedList();
		
		System.out.println("top : " + stack.getTop());
		System.out.println("Bottom : " + stack.getBottom());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println("Size : " + stack.getSize());
		
		System.out.println("top : " + stack.getTop().value);
		System.out.println("Bottom : " + stack.getBottom().value);
		
		stack.pop();
		
		System.out.println("Size : " + stack.getSize());
		
		System.out.println("top : " + stack.getTop().value);
		System.out.println("Bottom : " + stack.getBottom().value);
		
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		
		System.out.println("top : " + stack.getTop().value);
		System.out.println("Bottom : " + stack.getBottom().value);
		
		System.out.println("Size : " + stack.getSize());
	}
}
