package bishnu;

public class main {
	public static void main(String[] args) {
		
		queue soft = new queue();
		
		soft.enqueue(10);
		soft.enqueue(20);
		soft.enqueue(30);
		
		soft.dequeue();
		
		soft.enqueue(40);
		
		soft.dequeue();
		
		soft.enqueue(50);
		soft.enqueue(60);
		
		soft.dequeue();
		
		soft.display();
	}
}