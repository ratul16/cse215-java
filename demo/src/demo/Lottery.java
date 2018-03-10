package demo;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {

		
		int lottery = (int)(Math.random() * 100);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your lottery number (2 digits) : ");
		int guess = input.nextInt();
		
		int lotnum1 = lottery / 10 ;
		int lotnum2 = lottery % 10 ;
		
		int guess1 = guess / 10 ;
		int guess2 = guess % 10 ;
		
		if(guess == lottery){
			System.out.println("Perfect match, you won 10000000 $ ");
		}
		else if(guess1 == lotnum2 && guess2 == lotnum1){
			System.out.println("Nearly match, you won 500000 $");
		}
		else if(guess1 == lotnum2 || guess1 == lotnum1 ||guess2 == lotnum1 || guess2 == lotnum2){
			System.out.println("Poor match, you won 2500 $");
		}
		else {
			System.out.println("Better Luck next time");
		}
		System.out.println("The Lottery Number is  : " + lottery );

	}

}
