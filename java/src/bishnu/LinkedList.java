package bishnu;

public class LinkedList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
			
		}
		
	}
	public Node tail=null;
	public Node head=null;
	public void addNode(int data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
			tail=head;
			
		}
		else {
			//Node current=head;
			//while(current.next!=null) {
				//current=current.next;
//			}
			//current.next=newnode;
			tail.next=newnode;
			tail=newnode;
		}
		
	}
	public void printList() {
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
		current=current.next;
		count++;
		
	}
	return count;
	}
	public int get(int i) {
		if (size()!=0 && i<=size()) {
			Node current=head;
			for (int j=0;j<i;j++) {
				current =current.next;
			}
			return current.data;
		
		
	}
	return -1;

}
	
}
