package demo;
import java.util.Scanner;

public class displaytime {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int sec , min , remin;
		System.out.println("Enter an integer second : ");
		sec = input.nextInt();
		min = sec/60 ;
		remin = sec % 60;
		System.out.println("In " + sec + " Second" + " The Minute is " + min
				+ " And remaining Second is " + remin);
	}

}
