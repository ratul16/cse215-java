import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the name of three cities :");
		String c1 = input.nextLine();
		String c2 = input.nextLine();
		String c3 = input.nextLine();

		if (c1.compareTo(c2) < 0 && c1.compareTo(c3) < 0) {
			System.out.println("The three cities in alphabetical order are : " + c1 + " " + c2 + " " + c3);
		} else if (c2.compareTo(c1) < 0 && c2.compareTo(c3) < 0) {
			System.out.println("The three cities in alphabetical order are :" + c2 + " " + c1 + " " + c3);
		} else if (c3.compareTo(c1) < 0 && c3.compareTo(c2) < 0) {
			System.out.println("The three cities in alphabetical order are :" + c3 + " " + c2 + " " + c1);
		} else {
			System.err.println("Invaild Input");
		}

	}

}
