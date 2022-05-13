
public class PriorityQueue {

	private int MAX;
	private int[] array;
	private int sizeUsed;
	
	public PriorityQueue(int max) {
		
		this.MAX = max;
		this.array = new int[max];
		this.sizeUsed = 0;
	}
	
	public void insert(int priority) {
		
		if (sizeUsed == MAX) {
			
			System.out.println("Priority queue is full.");
			return;
		}
		
		if (sizeUsed == 0) {
			
			array[sizeUsed] = priority;
			sizeUsed++;
			return;
		}
		
		for (int i=sizeUsed - 1; i>=0; i--) {
			
			if (array[i] < priority) {
				
				array[i+1] = array[i];
				array[i] = priority;
				
			} else {
				
				array[i+1] = priority;
				break;
			}
		}
		
		sizeUsed++;
	}
	
	public void printPriorityQueue() {
		
		System.out.println("Priority Queue : ");
		
		for (int i=0; i<sizeUsed; i++) {
			
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
	}
	
	public int remove() {
		
		if (sizeUsed == 0) {
			
			System.out.println("Priority queue is empty.");
			return -1;
		}
		
		return array[--sizeUsed];
	}
    
	public static void main(String[] args) {
		
		PriorityQueue pQueue = new PriorityQueue(10);
		
		pQueue.insert(12);
		pQueue.insert(7);
		pQueue.insert(10);
		pQueue.insert(1);
		pQueue.insert(8);
		
		pQueue.printPriorityQueue();
		
		pQueue.insert(23);
		pQueue.insert(17);
		pQueue.insert(1);
		
		pQueue.printPriorityQueue();
		
		pQueue.remove();
		
		pQueue.printPriorityQueue();
		
		pQueue.remove();
		
		pQueue.printPriorityQueue();
	}
}
