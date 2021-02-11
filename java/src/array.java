
public class array {
	public static void main(String[] args) {
		
		double [] temp= {5,7,8,9,4};
		// use or access of single dimen array
		int size=temp.length;
		for(int i=0;i<size;i++) {
			System.out.println(temp[i]);
			
		}
		for(double i:temp) {
			System.out.println(i);
		}
		
		
	}

}
