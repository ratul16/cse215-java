package demo;

import java.util.Scanner;

public class Zodic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;
		System.out.println("Enter a year :");
		year = input.nextInt();
		
		switch(year % 12){
		case 0 :System.out.println("Your zodic sign is Monkey  "); break;
		case 1 :System.out.println("Your zodic sign is Rooster "); break;
		case 2 :System.out.println("Your zodic sign is Dog "); break;
		case 3 :System.out.println("Your zodic sign is Pig "); break;
		case 4 :System.out.println("Your zodic sign is Rat "); break;
		case 5 :System.out.println("Your zodic sign is Ox "); break;
		case 6 :System.out.println("Your zodic sign is Tiger "); break;
		case 7 :System.out.println("Your zodic sign is Rabbit "); break;
		case 8 :System.out.println("Your zodic sign is Dragon "); break;
		case 9 :System.out.println("Your zodic sign is Snake "); break;
		case 10 :System.out.println("Your zodic sign is Horse "); break;
		case 11 :System.out.println("Your zodic sign is Sheep "); break;
		}
		

	}

}
