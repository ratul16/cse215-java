
public class TestProgram {

	public static void main(String[] args) {
		
		Program p1 =new Program();
		
		System.err.println(p1.toMilitary());
		
		p1.setTime(13, 45, 59);
		System.err.println(p1.toMilitary());
		
	}

}
