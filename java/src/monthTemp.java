
public class monthTemp {
	public static void main(String[] args) {
		double temp[]= {45.6,78.9,87.9,34,56,77};
		double avg=calculateAvg(temp);
		System.out.println("our avg week  Temp is :"+avg);
	}
	public static double calculateAvg(double temp[]) {
		int size=temp.length;
		double total=0;
		for(int i=0;i<size;i++) {
			total +=temp[i];
			
		}
		
		return total/size;
	}

}
