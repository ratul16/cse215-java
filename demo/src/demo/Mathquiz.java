package demo;

import java.util.*;

public class Mathquiz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1 = (int)(Math.random() * 100);
		int num2 = (int)(Math.random() * 100);
		int temp;
		if (num1<num2){
			
			temp=num1;
			num1=num2;
			num2=temp;
			
			System.out.println("What is : " + num1 + " - " + num2 + " ? ");
			int ans= input.nextInt();
			
			if(num1 - num2 == ans){
				System.out.println("The Answer is correct");
			}
			else { 
				System.out.println("The Answer is incorrect");
				System.out.println("The Answer is " + (num1-num2) );
			}
			
		}

	}

}
