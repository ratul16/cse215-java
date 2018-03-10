package demo;

import java.util.*;

public class Loops {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count, i, sum = 0, temp = 0;
		System.out.println("enter:");
		count = input.nextInt();

		while (count != 0) {
			if (sum > count) {
				sum = count;

				System.out.println("the num is" + sum);
			}

		}
		
	}

}
