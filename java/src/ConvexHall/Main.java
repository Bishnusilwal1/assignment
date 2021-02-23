package ConvexHall;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of points");
		int num = sc.nextInt();
		Coordinate point[]=new Coordinate[num];
	
		for(int i=0; i<num; i++) {
			
			int x = (int)(Math.random()*100 + 1);
			int y  = (int)(Math.random()*100 + 1);
			point[i] = new Coordinate(x,y);
		}
		
		
		int n=point.length;
		
		GiftWrapping gfw=new GiftWrapping();
		gfw.convexHall(point,n);
		
	}

}


 
