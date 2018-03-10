package demo;

import java.util.*;

public class Leapyear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		System.out.println("Enter a year :");
		x = input.nextInt();
		
		if(x % 4 == 0 || x % 100 != 0 && x % 400 == 0 ){
			
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not Leap year");
		}

	}

}
