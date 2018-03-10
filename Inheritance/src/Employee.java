import java.util.Date;

public class Employee extends Person{
	
	double salary=500000;
	Date hiredDate=new Date();
	
	@Override
	public String toString() {
		return super.toString()+"\nSalary: "+salary+"\nDate of Hire : "+hiredDate;
	}
}
