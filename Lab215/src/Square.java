
public class Square extends GeometricObject implements Colorable{

	private double sides;
	
	public double getArea() {
		return	sides *sides;
	}
	
	public double getSides() {
		return sides;
	}
	
	public void setSides(double sides) {
		this.sides=sides;
	}
	
	public void howToColor() {
		System.out.println("Color all four sides");
	}
	
}
