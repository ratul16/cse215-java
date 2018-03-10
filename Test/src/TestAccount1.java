import java.util.Scanner;

public class TestAccount1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.err.println("Enter your ID :");
		int ids=in.nextInt();
		
		System.err.println("Enter your Balance :");
		double balances=in.nextDouble();
		
		
		Account1 acc = new Account1(ids, balances);
		acc.getAnnualInterestRate(4.5);
		acc.withdraw(2500);
		acc.deposit(5000);
		

		System.out.println("ID : " + acc.getId() + "\nBalance : " + balances);
		System.out.println("The Annual Interest Rate:" + acc.getAnnualInterestRate());
		System.out.println("The Monthly Interest :" + acc.getMonthlyInterest());
		System.out.println("The Monthly Interest Rate : " + acc.getMonthlyInterestRate());
		System.out.println("Balance :" + acc.getBalance());
		System.out.println("Date :" + acc.dateCreated());
		
		
	}

}
