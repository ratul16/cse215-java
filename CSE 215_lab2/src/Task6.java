import java.util.*;

public class Task6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a,b,c,peri;
		
		System.out.println("Enter the value of a : ");
		a = input.nextInt();
		
		System.out.println("Enter the value of b : ");
		b = input.nextInt();
		
		System.out.println("Enter the value of c : ");
		c = input.nextInt();
		
		peri = a + b + c;
		
		if(a+b>c && b+c>a && c+a>b ){
			System.out.println("The perimeter is : "+ peri);
		}
		else {System.out.println("Invaild");
		}
		
		
	}

}
