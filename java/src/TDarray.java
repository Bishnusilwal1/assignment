
public class TDarray {
	public static void main(String [] args) {
		// defining 2D array
		int random[] []= {{2,4,8},{5,7,8},{8,6,4}};
		int rows=random.length;
		int columns=random[0].length;
		// using for loop 
		for( int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(random[i][j] +"");
			}
			System.out.println();
				
			
		}
		for (int row[]:random) {
			for(int column:row) {
				System.out.print(column + "");
			}
			System.out.println();
			
		}
		
		
	}

}
