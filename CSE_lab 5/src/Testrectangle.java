
public class Testrectangle {

	public static void main(String[] args) {
		
		Rectangle rect1=new Rectangle(4.0,40);
		Rectangle rect2=new Rectangle(3.5,35.9);
		
			System.err.println("First Width is "+rect1.width);
			System.err.println("First height is "+rect1.height);
			System.err.println("First Area is "+rect1.getArea());
			System.err.println("First Perimeter is "+rect1.getPerimeter());
			
			System.err.println("Second Width is "+rect2.width);
			System.err.println("Second height is "+rect2.height);
			System.err.println("Second Area is "+rect2.getArea());
			System.err.println("Second Perimeter is "+rect2.getPerimeter());

			
	}

}
