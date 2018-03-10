
public class IllegalTriangleException extends Exception {
	double side;
	public IllegalTriangleException() {
	}
	
	public IllegalTriangleException(double side){
	this.side=side;
	}
}
