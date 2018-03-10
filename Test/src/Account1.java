import java.util.Date;

public class Account1 {

	private int id;
	private double balance;
	private double AnnualInterestRate;
	private Date dateCreated = new Date();
	
	// constractor
	public Account1() {
	}
	public Account1(int newId,double newBalance){
		id=newId;
		balance=newBalance;
	}
	
	// getter and setter
	public int getId() {
		return id;
	}
	public void setId(int newId){
		id=newId;
	}
	
	public double getBalance(){
		return balance;
	}
	public void setBalance(double newBalance){
		balance=newBalance;
	}
	
	public double getAnnualInterestRate(){
		return AnnualInterestRate;
	}
	public void getAnnualInterestRate(double newAnnualInterestRate) {
		AnnualInterestRate=newAnnualInterestRate;
	}
	public Date dateCreated() {
		return dateCreated;
	}
	
	//Methods
	
	
	public double getMonthlyInterestRate() {
		return (AnnualInterestRate/100)/12;
	}
	public double getMonthlyInterest() {
		return balance*getMonthlyInterestRate();
	}
	public void withdraw(double w) {
		balance -= w;
	}
	public void deposit(double d) {
		balance +=d;
	}
	
	//end of class
}
