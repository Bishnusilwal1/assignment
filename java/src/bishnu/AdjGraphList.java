package bishnu;

public class AdjGraphList {
	int vertex=4;
	LinkedList list[]=new LinkedList[vertex];
	public AdjGraphList() {
		for (int i=0; i<vertex; i++) {
			list[i]=new LinkedList();
		}
	}
	
	public void addEdge(int source,int destination) {
		list[source].addNode(destination);
		list[destination].addNode(source);
		
	}
	
	public void printGraph() {
		for(int i=0;i<vertex;i++) {
			System.out.print(i+"is connected to=");
			if(list[i].size()>0) {
				for (int j=0;j<list[i].size();j++) {
					System.out.print(list[i].get(j)+" ");
				}
			}
			System.out.println();
			
			
		}
	}
	public static void main (String[]arg) { 
		AdjGraphList adj=new AdjGraphList();
			adj.addEdge(0, 1);
			adj.addEdge(0, 2);
			adj.addEdge(1, 2);
			adj.addEdge(2, 3);
			adj.printGraph();
			
		
		//LinkedList list=new LinkedList();
		//list.addNode(10);
		//list.addNode(20);
		//list.addNode(30);
		//list.printList();
		//System.out.println("size of linked list is ="+list.size());
		//System.out.println("data is ="+list.get(2));
		
	}

} 
