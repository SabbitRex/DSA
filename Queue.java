import java.util.Arrays;

public class Queue {
	
	int size = 0;
	int front = 0;
	int back = -1;
	Integer[] array;
	
	public Queue(int size) {
		
		this.size = size;
		this.array = new Integer[this.size];
	}
	
	public void enqueue(int value) {
		
		if (this.back == this.array.length - 1) {
			
			System.out.println("Queue is full.");
			return;
		}
		
		this.array[++this.back] = value;
		System.out.println(Arrays.toString(array));
	}

	public void dequeue() {
		
		if (this.back == -1) {
			
			System.out.println("Queue is empty.");
			return;
		}
		
		for (int i=0; i<this.array.length-1; i++) {
			
			this.array[i] = this.array[i+1];
		}
		
		--this.back;
		System.out.println(Arrays.toString(array));
	}
	
	public void peek() {
		
		if (this.back == -1) {
			
			System.out.println("Queue is empty.");
			return;
		}
		
		System.out.println("Front element : " + this.array[this.front]);
	}
	
	public static void main(String[] args) {
		
		Queue queue = new Queue(5);
		
		queue.peek();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.peek();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.peek();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.peek();
	}
}
