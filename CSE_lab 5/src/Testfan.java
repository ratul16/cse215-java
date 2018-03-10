
public class Testfan {

	public static void main(String[] args) {
		Fan testfan = new Fan();
		Fan testfan2 = new Fan();

		testfan.setOn(true);
		testfan.setSpeed(2);
		testfan.setRadius(5);

		System.out.println("The fan is : " + testfan.toString());

	}

}
