public class Rectangle {

	double width;
	double height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double newWidth,double newHeight){
		width=newWidth;
		height=newHeight;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public double getPerimeter(){
		return 2*(width+height);
	}
	
}
