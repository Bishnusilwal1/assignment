
public class Queues {
	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	Node head=null;
	Node tail=null;
	public void enqueue (int data) {
		Node newnode= new Node (data);
		if(head==null) {
			head=newnode;
			tail=newnode;
		}
		else {
			tail.next=newnode;
			tail=newnode;

		}
		
		
	}
	public int dequeue() {
		int val=head.data;
		head=head.next;
		return val;
		
	}
	public void printList() {
		System.out.println("printing list");
		Node current=head;
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
	public int size() {
		int count=0;
		Node current=head;
		while(current!=null) {
			count++;
			current=current.next;
			
		}
		return count;
	}
	public static void main (String [] args) {
		Queues q=new Queues() ;
			q.enqueue(10);
			q.enqueue(20);
			q.enqueue(30);
			q.printList();
			System.out.println("dequeued element="+q.dequeue());
			q.printList();			
	}
}
