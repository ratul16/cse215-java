/**
 * 
 * @author RaTuL This is Fan class
 */
public class Fan {

	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";

	public Fan() {

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	public boolean getOn() {
		return on;
	}

	public void setOn(Boolean newOn) {
		on = newOn;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String newColor) {
		color = newColor;
	}

	/**
	 * 
	 */

	public String toString() {
		String status = new String();
		if (on == true) {
			status = speed + " " + radius + " " + color;
		} else {
			status = color + " " + radius + " " + "The fan is off";
		}
		return status;
	}

}
