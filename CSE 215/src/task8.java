import java.util.Scanner;


public class task8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double speed,acc,lenght ;
		System.out.println("Enter the speed in (m/s) : ");
		speed= input.nextDouble();
		
		System.out.println("Enter the Acceleratio in (m/s2) : ");
		acc= input.nextDouble();
		
		lenght = (speed*speed)/(2*acc);
		
		System.out.println("The lenght of runway for this airplane is : " + lenght);

	}

}
