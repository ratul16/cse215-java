package demo;
import java.util.*;
public class Greatnum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter Three number : ");
		x = input.nextInt();
		y = input.nextInt();
		z = input.nextInt();
		
		if(x>y && x>z){
			System.out.println("The number is " + x);
		}
		else if(y>x && y>z){
			System.out.println("The number is " + y);
		}
		else if(z>x && z>y){
			System.out.println("The number is " + z);
		}
	
	}

}
