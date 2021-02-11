import java.util.Scanner;

public class TDarray2 {
	public static void main(String [] args) {
		//take input from the user 
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size of array");
				int row =sc.nextInt();
				System.out.println("Enter the number of columens");
				int column=sc.nextInt();
				
				int array[][]=new int[row][column];
				for( int i=0;i<n;i++) {
					for (int j=0;j<column;j++){
						System.out.println("Enter the value for");
						
					}
				}
				 
				int random[]=new int[n];
				
				//insert the date in the array
				for( int i=0;i<n;i++) {
					for(int j=0;j<i;j++) {
						System.out.print(random[i][j] +"");
					}
					System.out.println();
					}
				for (int row[]:n) {
					for(int column:row) {
						System.out.print(column + "");
					}
					System.out.println();
					
				}
	}

}
