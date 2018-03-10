package demo;
import java.util.Scanner;
public class CompputeAreawithinput {
	public static void main(String args[]){
		final double PI = 3.1416;
		double radius, area ;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius : ");
		radius = input.nextDouble();
		area = radius * radius * PI ;
		System.out.println("The area is : "+ area);
		
	}

}
