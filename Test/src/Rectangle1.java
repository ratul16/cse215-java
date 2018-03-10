
public class Rectangle1 {
	
	double width=1;
	double height=1;
	
	public Rectangle1() {
		
	}
	
	public Rectangle1(double newWidth,double newHeight){
		width=newWidth;
		height=newHeight;
	}
	
	public double getArea(){
		return width*height;
	}
	
	public double getPerimeter(){
	return 2*(width+height);
}
	
}
