package demo;
// this is a basic adding calculator 
import java.util.Scanner;

public class calculator {
	public static void main(String []args){
	Scanner input = new Scanner(System.in);
	double fnum, snum , answer;
	System.out.println("Enter first num: ");
	fnum = input.nextDouble();
	System.out.println("Enter Second num: ");
	snum = input.nextDouble();
	answer = fnum + snum;
	System.out.println("The answer is : " + answer );
	}
}
