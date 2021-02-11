
import java.util.Scanner;
import java.time.LocalTime;
public class Reminder {

	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the hour");
		int hr=sc.nextInt();
		System.out.println("enter the Min");
		int min=sc.nextInt();
		alarm(hr, min);
	}
	public static void alarm(int hr, int min){
		boolean on=checkAlarm(hr,min);
		if(on) {
			beep();
			on=checkAlarm(hr,min);
		}
		if(on) {
			beep();
			on=checkAlarm(hr,min);
		}
		if(on) {
			beep();
			on=checkAlarm(hr,min);
		}
		if(on) {
			beep();
			on=checkAlarm(hr,min);
		}
		
	
	}
	
	
		
	
	public static boolean checkAlarm(int hr, int min) {
		LocalTime now =LocalTime.now();
		boolean set =false;
		if(hr==now.getHour() && min==now.getMinute()) {
			set= true;
		}else if (hr<now.getHour()&& min<now.getMinute()) {
			System.out.println("Your alarm has been set next day");
		}else if (hr>now.getHour()&& min>now.getMinute()) {
			System.out.println("your alarm has not come");
			
		}else {
			
		}
		
		
		return set;
		
	}
	public static void beep() {
		
		
		System.out.println("Beep Beep Beep");
		//System.out.println("Hour :"+now.getHour());
		//12System.out.println("min :"+now.getMinute());
	}
}
