import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {
		Person p1=new Person();
		Student s1=new Student();
		Employee e1=new Employee();
		Faculty f1 =new Faculty();
		Staffs t1=new Staffs();
		
		
		Scanner input =new Scanner(System.in);
		
		
		System.out.println(p1.toString()+"\n");
		System.err.println(s1.toString()+"\n");
		System.out.println(e1.toString()+"\n");
		System.err.println(f1.toString()+"\n");
		System.out.println(t1.toString()+"\n");
		
		
	}

}
