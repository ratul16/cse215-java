
public class Triangle{

	public double side1=0.0;
	public double side2=0.0;
	public double side3=0.0;
	
	void IllegalTriangleException(){
		
	}
	
	public Triangle(double side1, double side2, double side3)throws IllegalTriangleException {
	    if (side1 >= side2 + side3)
	        throw new IllegalTriangleException(side1);
	    else if (side2 >= side1 + side3)
	        throw new IllegalTriangleException(side2);
	    else if (side3 >= side2 + side1)
	        throw new IllegalTriangleException(side3);
	    else {
	        this.side1 = side1;
	        this.side2 = side2;
	        this.side3 = side3;
	    }
	}
	
	
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getPerimeter() {
		return side1+side2+side3;
	}
	
	
}
