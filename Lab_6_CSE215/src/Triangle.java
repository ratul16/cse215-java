
public class Triangle extends SimpleGeometricObject{

	private double side1=1.0;
	private double side2=1.0;
	private double side3=1.0;
	
	
	public Triangle(){
		
	}
	
	public Triangle(double newSide1,double newSide2,double newSide3){
		newSide1=side1;
		newSide2=side2;
		newSide3=side3;
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
	
	public double getArea() {
		double s,area;
		s = (1/2.0 * (side1 + side2+ side3));
	    area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	    return area;
	}
	
	public double getPerimeter() {
		return side1+side2+side3;
	}
	
	public String toString() {
		return "Triangle: side=1"+side1+"side2="+side2+"side3="+side3;
	}
	
}
