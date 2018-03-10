import java.util.*;
public class Task3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y;
		
		System.out.println("Enter today's number :");
		x = input.nextInt();
		System.out.println("Enter Future day's number :");
		y = input.nextInt();
		
		int day = (x+y) % 7;
		
		switch(x){
		case 0 : System.out.println("Today is Sunday");break;
		case 1 : System.out.println("Today is Monday");break;
		case 2 : System.out.println("Today is Tuesday");break;
		case 3 : System.out.println("Today is Wednesday");break;
		case 4 : System.out.println("Today is Thursday");break;
		case 5 : System.out.println("Today is Friday");break;
		case 6 : System.out.println("Today is Saturday");break;
		}
	
		switch(day){
		case 0 : System.out.println("Future day is Sunday");break;
		case 1 : System.out.println("Future day is Monday");break;
		case 2 : System.out.println("Future day is Tuesday");break;
		case 3 : System.out.println("Future day is Wednesday");break;
		case 4 : System.out.println("Future day is Thursday");break;
		case 5 : System.out.println("Future day is Friday");break;
		case 6 : System.out.println("Future day is Saturday");break;
		 
	 }
		
  }
}
