package demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice {
		
		public static int quotient(int n1,int n2) {
			
		if(n2 ==0){
			throw new ArithmeticException();
			
			
		}
	
		return n1/n2;
}

		public static void main(String [] args) {
			Scanner input =new Scanner(System.in);
			
			System.out.println("enter int number");
			int num1=input.nextInt();
			int num2=input.nextInt();
			
			try{
				int result = quotient(num1, num2);
				System.out.println(num1+"/"+num2+"is"+result);
			}
			catch(ArithmeticException ex){
				System.out.println("Exception:an int cant be divied by zero");
			}
			
			
			
		}
	

}
