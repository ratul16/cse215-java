import java.util.*;
public class task7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double amount , initialt,finalt,energy;
		System.out.println("Enter the amount of water in (kg) : ");
		amount= input.nextDouble();
		
		System.out.println("Enter the initial temperature : ");
		initialt= input.nextDouble();
		
		System.out.println("Enter the initial temperature : ");
		finalt= input.nextDouble();
		
		energy=amount * (finalt-initialt)*4184;
		
		System.out.println("The energy needed is : " + energy);
		

	}

}
