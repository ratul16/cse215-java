import java.util.*;
public class task6 {

	public static void main(String[] args) {
		double subtotal , gratuity1 , gratuityf , total;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of subtotal: ");
		subtotal = input.nextDouble();
		System.out.println("Enter the value of Gratuity : ");
		gratuity1 = input.nextDouble();
		
		gratuityf = (gratuity1/100)*subtotal;
		total= subtotal + gratuityf;
		System.out.println("The value of Total is : " + total);
		System.out.println("The value of Gratuity is : " + gratuityf);
	}

}
