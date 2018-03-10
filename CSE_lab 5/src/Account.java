import java.util.Date;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualIntersetRate = 0;
	private Date dateCreated = new Date();

	public Account() {

	}

	public Account(int newID, double newBalance) {
		id = newID;
		balance = newBalance;
	}

	public int getId() {
		return id;
	}

	public void setId(int newId) {
		id = newId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	public double getAnnualInterestRate() {
		return annualIntersetRate;
	}

	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualIntersetRate = newAnnualInterestRate;
	}

	public Date dateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return (annualIntersetRate / 100) / 12;
	}

	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	public void withdraw(double a) {
		balance -= a;
	}

	public void deposit(double b) {
		balance += b;
	}
}
