package bishnu;

public class queue {
	
	int queue[] = new int[6];
	int front, rear;
	int size;
	
	public void display() {
		System.out.println("Size " + size);
		System.out.println("Front " + front);
		System.out.println("Rear " + rear);
		
		System.out.print("Element in Queue: ");
		for(int i=0; i<size; i++) {
			System.out.print(queue[front+i] + " ");
		}
		
		System.out.println("\n\nActual Array: ");
		for(int i : queue) {
			System.out.print(i + " ");
		}
	}
	
	public void enqueue(int value) {
		if (isFull())
	}
		queue[rear] = value;
		rear = (rear + 1) % queue.length;
		size++;
	}
	
	public void dequeue() {
		front = front + 1;
		size--;
	}
