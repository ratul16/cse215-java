package demo;
import java.util.*;

public class IfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int x = input.nextInt();
		if(x % 2 == 0){
			System.out.println("The number is Even");
		}
		else {
			System.out.println("The number is Odd");
		}

	}

}
