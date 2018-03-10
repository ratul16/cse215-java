import java.util.*;
public class Task4 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int user,x,y;
		
		System.out.println("Enter a 3-digit integer:");
		user = input.nextInt();
		
		x = user / 100;
		y = user % 10;
		
		if(x == y ){
			System.out.println("The number is a Palindrome ");
		}
		else {
			System.out.println("The number is not a Palindrome ");
		}
		
	}

}
