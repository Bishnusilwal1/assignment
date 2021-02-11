import 
public class test {
	//def reverse(self,n):
		//print
	
	public int reverse(int n) {
		int rev=0;
		while(n!=0) {
		int digit=n%10;
		rev=rev*10+digit;
		n=n/10;
		}
		return rev;
		
	}
public static void main(String[] args) {
	test ab=new test();
	System.out.println(ab.reverse(7689));
	Scanner sc=new Scanner(System.in);
}


}
