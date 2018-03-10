import java.util.*;


public class Task1 {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Enter the value of a : ");
		a = input.nextInt();
		System.out.println("Enter the value of b : ");
		b = input.nextInt();
		System.out.println("Enter the value of c : ");
		c = input.nextInt();
		
		double dis = (b*b)-4*a*c;
		double r1 = (-b+Math.pow(dis,0.5))/(2.0*a);
		double r2 = (-b-Math.pow(dis,0.5))/(2.0*a);
		
		//System.out.println("The value of the two Root are: "  + r1 + "and" + r2);
		if(dis>0){
			System.out.println("The value of the two Root are: " + r1 + " and " + r2);
		}
		else if(dis<0){
			System.out.println("The equations has no real roots");
		}
		else if (dis==0){
			System.out.println("The equations has a root and the value is: " + r1);
		}
		

	}

}
