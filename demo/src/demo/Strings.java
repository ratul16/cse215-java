package demo;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.err.println("Enter your text :");
		String message = input.nextLine();
		String message1 = input.nextLine();

		// compare
		if (message.compareTo(message1) < 0) {
			System.err.println(message + " and " + message1 + "\n");
		} else {
			System.err.println(message1 + " and " + message + "\n");
		}
		String c = message.toUpperCase();
		String d = message1.toUpperCase();
		System.err.println("The line is :" + (c) + "\n");
		System.err.println("The line is :" + c.length() + "\n");

		System.err.println("The line is :" + (d) + "\n");
		System.err.println("The line is :" + d.length() + "\n");

	}

}
