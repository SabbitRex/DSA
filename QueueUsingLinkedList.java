public class QueueUsingLinkedList {

	class Node {
		
		int value;
		Node next;
	}
	
	Node front;
	Node rear;
	int size;
	
	public Node createNewNode(int value) {
		
		Node node = new Node();
		
		node.value = value;
		node.next = null;
		
		return node;
	}
	
	public void enqueue(int value) {
		
		if (rear == null) {
			
			front = createNewNode(value);
			rear = front;
			size++;
			
			return;
		}
		
		rear.next = createNewNode(value);
		rear = rear.next;
		size++;
	}
	
	public void dequeue() {
		
		if (front == null) {
			
			return;
		}
		
		front = front.next;
		size--;
	}
	
	public int getSize() {
		
		return size;
	}
	
	public Node peek() {
		
		if (front == null) {
			
			return null;
		}
		
		return front;
	}

	public Node poll() {
		
		if (front == null) {
			
			return null;
		}
		
		Node temp = front;
		front = front.next;
		size--;
		
		return temp;
	}
	
	public Node getRear() {
		
		if (front == null) {
			
			return null;
		}
		
		return rear;
	}
	
	public static void main(String[] args) {
		
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		
		System.out.println("Peek : " + queue.peek());
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		
		System.out.println("Size : " + queue.getSize());
		
		System.out.println("Peek : " + queue.peek().value);
		
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		
		System.out.println("Size : " + queue.getSize());
		
		queue.dequeue();
		
		System.out.println("Peek : " + queue.peek().value);
		System.out.println("Size : " + queue.getSize());
		
		System.out.println("Poll : " + queue.poll().value);
		
		System.out.println("Peek : " + queue.peek().value);
		System.out.println("Size : " + queue.getSize());
		
		System.out.println("Rear : " + queue.getRear().value);
		
		queue.enqueue(10);
		
		System.out.println("Rear : " + queue.getRear().value);
	}
}
