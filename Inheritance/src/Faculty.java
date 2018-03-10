public class Faculty extends Employee{

	double Ohour=10;
	String rank="Senior Officer";
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nOffice Hour:"+Ohour+"\nRank:"+rank;
	}
	
}
