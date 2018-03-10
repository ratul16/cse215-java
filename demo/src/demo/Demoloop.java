package demo;

import java.util.Scanner;

public class Demoloop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year,count = 0;
		
		do{
		System.out.print("Enter a year :");
		year = input.nextInt();
		
		switch(year % 12){
		case 0 :System.out.println("Your zodic sign is Monkey \n"); break;
		case 1 :System.out.println("Your zodic sign is Rooster \n"); break;
		case 2 :System.out.println("Your zodic sign is Dog \n"); break;
		case 3 :System.out.println("Your zodic sign is Pig \n"); break;
		case 4 :System.out.println("Your zodic sign is Rat \n"); break;
		case 5 :System.out.println("Your zodic sign is Ox \n"); break;
		case 6 :System.out.println("Your zodic sign is Tiger \n"); break;
		case 7 :System.out.println("Your zodic sign is Rabbit \n"); break;
		case 8 :System.out.println("Your zodic sign is Dragon \n"); break;
		case 9 :System.out.println("Your zodic sign is Snake \n"); break;
		case 10 :System.out.println("Your zodic sign is Horse \n"); break;
		case 11 :System.out.println("Your zodic sign is Sheep \n"); break;
		}
		
		count++;
		
		} while(count !=0);

	}

}
