import java.util.Scanner;


public class Task8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int kilo,pound;
		double	kilopound,poundkilo;
		
		System.out.println("Enter the value of kilo and pound :");
		kilo = input.nextInt();
		pound = input.nextInt();
		
		kilopound = kilo * 2.2 ;
		poundkilo = pound *0.453592 ;
		
		System.out.println("Kilo to pound"+"  \t | \t"+ "pound to kilo");
		System.out.println(kilo+"  is  "+kilopound+"  \t | \t"+pound+"  is  "+poundkilo);

	}

}
