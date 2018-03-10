import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = input.nextInt();
		
		char y = (char) num;
		System.err.println("The character for ASCII code "+num+" is "+y);

	}

}
