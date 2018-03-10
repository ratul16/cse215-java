import java.util.Scanner;

public class Testaccount {

	public static void main(String[] args) {
		System.err.println("enter value : ");
		Scanner in=new Scanner(System.in);
		int ids=in.nextInt();
		int amu=in.nextInt();
		
		
		Account acc1=new Account(ids, amu);		
		
		acc1.setAnnualInterestRate(4.5);
		acc1.withdraw(2500);
		acc1.deposit(3000);
		
		
		System.err.println("ID and Amount : "+acc1.getId()+" "+acc1.getBalance());
		System.out.println("Annual interest rate: "+acc1.getAnnualInterestRate());
		System.out.println("Monthly interest rate: "+acc1.getMonthlyInterest());
		System.out.println("Monthly interest rate: "+acc1.getMonthlyInterestRate());
		System.out.println("Current Amount: "+acc1.getBalance());
		System.out.println("Account creation Date: "+acc1.dateCreated());
		
	}

	

}
