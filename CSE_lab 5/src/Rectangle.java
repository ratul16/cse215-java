/**
 * 
 * @author RaTuL
 * This is the Rectangle class
 *
 */

public class Rectangle {

	double width=1;
	double height=1;
	
	/**
	 * no-arg constructor
	 */
	public Rectangle(){
	
	}
	
	/**
	 * Constructor with width and height parameter
	 */
	public Rectangle(Double newWidth,double newHeigth){
		width=newWidth;
		height=newHeigth;
	}
	
	/**
	 * Method getArea() which returns the area of the rectangle
	 */
	public double getArea(){
		double area=width*height;
		return area;
		//return width*height;
	}
	
	/**
	 * Method getPerimeter() which returns the perimeter of the rectangle
	 */
	public double getPerimeter(){
		double perimeter= 2*(width+height);
		return perimeter;
		//return 
	}
	
}
