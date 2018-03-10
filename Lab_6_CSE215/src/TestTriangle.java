import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;


public class TestTriangle {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Triangle tri1=new Triangle();
		System.out.println("Input three sides: ");
		tri1.setSide1(in.nextDouble());
		tri1.setSide2(in.nextDouble());
		tri1.setSide3(in.nextDouble());
		System.out.println("Input color:");
		tri1.setColor(in.next());
		System.out.println("Is it filled or not :");
		tri1.setFilled(in.nextBoolean());
		System.out.println("Perimeter:"+tri1.getPerimeter());
		System.out.println("area:"+tri1.getArea());
		System.out.println("color:"+tri1.getColor());
		boolean fill=tri1.isFilled();
		if ( fill==true) {
			System.out.println("Is filled");
		}
		else {
			System.out.println("Not filled");
		}
		
		
		
	}

}
