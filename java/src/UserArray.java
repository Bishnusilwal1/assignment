import java.util.Scanner;
public class UserArray {
	public static void main(String [] args) {
		//take input from the user 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n =sc.nextInt();
	 //  array to size and memory allocation
		
		int random[]=new int[n];
		
		
		//insert the date in the array
		for(int i=0;i<n;i++) {
			System.out.println("Enter the data at position " + i);
			random[i]=sc.nextInt();
			
		}
		
		//display the created array
		 for(int data:random) {
			 System.out.println("create array is :"+data);
		 }
		
	}

}
